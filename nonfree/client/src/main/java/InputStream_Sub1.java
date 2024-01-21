import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Z")
	public boolean aBoolean153;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "[B")
	private final byte[] aByteArray69 = new byte[65536];

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
	private final int[] anIntArray411 = new int[] { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
	private final int[] anIntArray412 = new int[256];

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public InputStream_Sub1() {
		for (@Pc(1031) int local1031 = -32768; local1031 < 32768; local1031++) {
			this.aByteArray69[local1031 + 32768] = this.method1743(local1031);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)B")
	private byte method1743(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 8 & 0x80;
		if (local5 != 0) {
			arg0 = -arg0;
		}
		if (arg0 > 32635) {
			arg0 = 32635;
		}
		arg0 += 132;
		@Pc(25) int local25 = this.anIntArray411[arg0 >> 7 & 0xFF];
		@Pc(33) int local33 = arg0 >> local25 + 3 & 0xF;
		return (byte) ~(local5 | local25 << 4 | local33);
	}

	@OriginalMember(owner = "client!vc", name = "read", descriptor = "()I")
	@Override
	public int read() {
		@Pc(2) byte[] local2 = new byte[1];
		this.read(local2, 0, 1);
		return local2[0];
	}

	@OriginalMember(owner = "client!vc", name = "read", descriptor = "([BII)I")
	@Override
	public synchronized int read(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aBoolean153) {
				return -1;
			} else if (arg2 > 256) {
				this.read(arg0, arg1, 256);
				this.read(arg0, arg1 + 256, arg2 - 256);
				return arg2;
			} else {
				Static95.method1177(this.anIntArray412, arg2);
				for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
					@Pc(37) int local37 = this.anIntArray412[local31];
					if ((local37 + 8388608 & 0xFF000000) != 0) {
						this.anIntArray412[local31] = local37 >> 31 ^ 0x7FFFFF;
					}
				}
				Static117.method1744(this.aByteArray69, this.anIntArray412, arg0, arg1, arg2);
				return arg2;
			}
		} catch (@Pc(68) Exception local68) {
			this.aBoolean153 = true;
			Static30.method573(null, local68);
			return -1;
		}
	}
}
