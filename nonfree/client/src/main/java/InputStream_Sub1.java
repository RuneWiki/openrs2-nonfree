import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "[B")
	private final byte[] aByteArray8 = new byte[65536];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "[I")
	private final int[] anIntArray85 = new int[] { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "[I")
	private final int[] anIntArray86 = new int[256];

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public InputStream_Sub1() {
		for (@Pc(1031) int local1031 = -32768; local1031 < 32768; local1031++) {
			this.aByteArray8[local1031 + 32768] = this.method554(local1031);
		}
	}

	@OriginalMember(owner = "client!ee", name = "read", descriptor = "()I")
	@Override
	public int read() {
		@Pc(2) byte[] local2 = new byte[1];
		this.read(local2, 0, 1);
		return local2[0];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)B")
	private byte method554(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 8 & 0x80;
		if (local5 != 0) {
			arg0 = -arg0;
		}
		if (arg0 > 32635) {
			arg0 = 32635;
		}
		arg0 += 132;
		@Pc(25) int local25 = this.anIntArray85[arg0 >> 7 & 0xFF];
		@Pc(33) int local33 = arg0 >> local25 + 3 & 0xF;
		return (byte) ~(local5 | local25 << 4 | local33);
	}

	@OriginalMember(owner = "client!ee", name = "read", descriptor = "([BII)I")
	@Override
	public synchronized int read(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aBoolean50) {
				return -1;
			} else if (arg2 > 256) {
				this.read(arg0, arg1, 256);
				this.read(arg0, arg1 + 256, arg2 - 256);
				return arg2;
			} else {
				Static60.method1128(this.anIntArray86, arg2);
				for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
					@Pc(37) int local37 = this.anIntArray86[local31];
					if ((local37 + 8388608 & 0xFF000000) != 0) {
						this.anIntArray86[local31] = local37 >> 31 ^ 0x7FFFFF;
					}
				}
				Static112.method553(this.aByteArray8, this.anIntArray86, arg0, arg1, arg2);
				return arg2;
			}
		} catch (@Pc(68) Exception local68) {
			this.aBoolean50 = true;
			Static108.method2075(local68, null);
			return -1;
		}
	}
}
