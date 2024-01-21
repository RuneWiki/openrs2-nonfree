import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class47 {

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "Z")
	private boolean aBoolean237;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt994 = 315;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private int anInt995 = -50;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "([BZ)V")
	public Class47(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.method665(arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("39523, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "([BI)V")
	private void method665(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(false, arg0);
			@Pc(10) int local10 = local7.method484();
			@Pc(13) int local13 = local7.method484();
			if (local13 == local10) {
				this.aByteArray21 = arg0;
				this.aBoolean237 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class38.method581(local19, local10, arg0, local13, 6);
				this.aByteArray21 = local19;
				local7 = new Class1_Sub1_Sub3(false, this.aByteArray21);
				this.aBoolean237 = true;
			}
			this.anInt996 = local7.method482();
			this.anIntArray265 = new int[this.anInt996];
			this.anIntArray266 = new int[this.anInt996];
			this.anIntArray267 = new int[this.anInt996];
			this.anIntArray268 = new int[this.anInt996];
			@Pc(82) int local82 = local7.anInt757 + this.anInt996 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt996; local84++) {
				this.anIntArray265[local84] = local7.method485();
				this.anIntArray266[local84] = local7.method484();
				this.anIntArray267[local84] = local7.method484();
				this.anIntArray268[local84] = local82;
				local82 += this.anIntArray267[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("43426, " + arg0 + ", " + 0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method666(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt996; local27++) {
			if (this.anIntArray265[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray266[local27]];
				}
				if (this.aBoolean237) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray266[local27]; local67++) {
						arg1[local67] = this.aByteArray21[this.anIntArray268[local27] + local67];
					}
				} else {
					Class38.method581(arg1, this.anIntArray266[local27], this.aByteArray21, this.anIntArray267[local27], this.anIntArray268[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
