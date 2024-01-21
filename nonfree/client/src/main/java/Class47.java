import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class47 {

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "Z")
	private boolean aBoolean245;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private int anInt998 = 44221;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "(Z[B)V")
	public Class47(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method665(467, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("65296, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I[B)V")
	private void method665(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(-49365, arg1);
			@Pc(10) int local10 = local7.method484();
			@Pc(13) int local13 = local7.method484();
			if (local13 == local10) {
				this.aByteArray21 = arg1;
				this.aBoolean245 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class38.method581(local19, local10, arg1, local13, 6);
				this.aByteArray21 = local19;
				local7 = new Class1_Sub1_Sub3(-49365, this.aByteArray21);
				this.aBoolean245 = true;
			}
			this.anInt999 = local7.method482();
			this.anIntArray265 = new int[this.anInt999];
			this.anIntArray266 = new int[this.anInt999];
			this.anIntArray267 = new int[this.anInt999];
			@Pc(70) boolean local70 = false;
			this.anIntArray268 = new int[this.anInt999];
			@Pc(83) int local83 = local7.anInt763 + this.anInt999 * 10;
			for (@Pc(85) int local85 = 0; local85 < this.anInt999; local85++) {
				this.anIntArray265[local85] = local7.method485();
				this.anIntArray266[local85] = local7.method484();
				this.anIntArray267[local85] = local7.method484();
				this.anIntArray268[local85] = local83;
				local83 += this.anIntArray267[local85];
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("88511, " + arg0 + ", " + arg1 + ", " + local124.toString());
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
		for (@Pc(27) int local27 = 0; local27 < this.anInt999; local27++) {
			if (this.anIntArray265[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray266[local27]];
				}
				if (this.aBoolean245) {
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
