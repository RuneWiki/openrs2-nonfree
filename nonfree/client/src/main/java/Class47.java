import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class47 {

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "Z")
	private boolean aBoolean252;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt953 = 862;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "([BI)V")
	public Class47(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) int local8 = 83 / arg1;
			this.method657(arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("8584, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I[B)V")
	private void method657(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3((byte) 3, arg0);
			@Pc(10) int local10 = local7.method476();
			@Pc(13) int local13 = local7.method476();
			if (local13 == local10) {
				this.aByteArray21 = arg0;
				this.aBoolean252 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class38.method573(local19, local10, arg0, local13, 6);
				this.aByteArray21 = local19;
				local7 = new Class1_Sub1_Sub3((byte) 3, this.aByteArray21);
				this.aBoolean252 = true;
			}
			this.anInt954 = local7.method474();
			this.anIntArray262 = new int[this.anInt954];
			this.anIntArray263 = new int[this.anInt954];
			this.anIntArray264 = new int[this.anInt954];
			this.anIntArray265 = new int[this.anInt954];
			@Pc(79) int local79 = local7.anInt715 + this.anInt954 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt954; local84++) {
				this.anIntArray262[local84] = local7.method477();
				this.anIntArray263[local84] = local7.method476();
				this.anIntArray264[local84] = local7.method476();
				this.anIntArray265[local84] = local79;
				local79 += this.anIntArray264[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("36269, " + 0 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method658(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt954; local27++) {
			if (this.anIntArray262[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray263[local27]];
				}
				if (this.aBoolean252) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray263[local27]; local67++) {
						arg1[local67] = this.aByteArray21[this.anIntArray265[local27] + local67];
					}
				} else {
					Class38.method573(arg1, this.anIntArray263[local27], this.aByteArray21, this.anIntArray264[local27], this.anIntArray265[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
