import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class47 {

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "Z")
	private boolean aBoolean256;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private int anInt972 = 4858;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "([BI)V")
	public Class47(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method665(arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("46564, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "([BI)V")
	private void method665(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0, this.aBoolean255);
			@Pc(11) int local11 = local8.method484();
			@Pc(14) int local14 = local8.method484();
			if (local14 == local11) {
				this.aByteArray21 = arg0;
				this.aBoolean256 = false;
			} else {
				@Pc(25) byte[] local25 = new byte[local11];
				Class38.method581(local25, local11, arg0, local14, 6);
				this.aByteArray21 = local25;
				local8 = new Class1_Sub1_Sub3(this.aByteArray21, this.aBoolean255);
				this.aBoolean256 = true;
			}
			this.anInt974 = local8.method482();
			this.anIntArray265 = new int[this.anInt974];
			this.anIntArray266 = new int[this.anInt974];
			this.anIntArray267 = new int[this.anInt974];
			this.anIntArray268 = new int[this.anInt974];
			@Pc(86) int local86 = local8.anInt733 + this.anInt974 * 10;
			for (@Pc(88) int local88 = 0; local88 < this.anInt974; local88++) {
				this.anIntArray265[local88] = local8.method485();
				this.anIntArray266[local88] = local8.method484();
				this.anIntArray267[local88] = local8.method484();
				this.anIntArray268[local88] = local86;
				local86 += this.anIntArray267[local88];
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("8455, " + arg0 + ", " + 0 + ", " + local127.toString());
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
		for (@Pc(27) int local27 = 0; local27 < this.anInt974; local27++) {
			if (this.anIntArray265[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray266[local27]];
				}
				if (this.aBoolean256) {
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
