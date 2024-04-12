import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
	private final int[] anIntArray83 = new int[] { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[B")
	private final byte[] aByteArray6 = new byte[65536];

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
	private final int[] anIntArray84 = new int[256];

	@OriginalMember(owner = "client!da", name = "read", descriptor = "()I", line = 4)
	@Override
	public int read() {
		@Pc(2) byte[] local2 = new byte[1];
		this.read(local2, 0, 1);
		return local2[0];
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)B", line = 26)
	private byte method355(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 8 & 0x80;
		if (local5 != 0) {
			arg0 = -arg0;
		}
		if (arg0 > 32635) {
			arg0 = 32635;
		}
		arg0 += 132;
		@Pc(25) int local25 = this.anIntArray83[arg0 >> 7 & 0xFF];
		@Pc(33) int local33 = arg0 >> local25 + 3 & 0xF;
		return (byte) ~(local5 | local25 << 4 | local33);
	}

	@OriginalMember(owner = "client!da", name = "read", descriptor = "([BII)I", line = 40)
	@Override
	public synchronized int read(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aBoolean36) {
				return -1;
			} else if (arg2 > 256) {
				this.read(arg0, arg1, 256);
				this.read(arg0, arg1 + 256, arg2 - 256);
				return arg2;
			} else {
				Static99.method1663(this.anIntArray84, arg2);
				for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
					@Pc(37) int local37 = this.anIntArray84[local31];
					if ((local37 + 8388608 & 0xFF000000) != 0) {
						this.anIntArray84[local31] = local37 >> 31 ^ 0x7FFFFF;
					}
				}
				Static102.method354(this.aByteArray6, this.anIntArray84, arg0, arg1, arg2);
				return arg2;
			}
		} catch (@Pc(68) Exception local68) {
			this.aBoolean36 = true;
			Static36.method727(null, local68);
			return -1;
		}
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 84)
	public InputStream_Sub1() {
		for (@Pc(1031) int local1031 = -32768; local1031 < 32768; local1031++) {
			this.aByteArray6[local1031 + 32768] = this.method355(local1031);
		}
	}
}
