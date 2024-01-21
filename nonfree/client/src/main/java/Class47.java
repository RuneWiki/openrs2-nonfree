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
	private int anInt974;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "Z")
	private boolean aBoolean238;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt973 = 6;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "(Z[B)V")
	public Class47(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method665(arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("87924, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I[B)V")
	private void method665(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(13) Class1_Sub1_Sub3 local13 = new Class1_Sub1_Sub3(arg0, 58);
			@Pc(16) int local16 = local13.method484();
			@Pc(19) int local19 = local13.method484();
			if (local19 == local16) {
				this.aByteArray21 = arg0;
				this.aBoolean238 = false;
			} else {
				@Pc(25) byte[] local25 = new byte[local16];
				Class38.method581(local25, local16, arg0, local19, 6);
				this.aByteArray21 = local25;
				local13 = new Class1_Sub1_Sub3(this.aByteArray21, 58);
				this.aBoolean238 = true;
			}
			this.anInt974 = local13.method482();
			this.anIntArray265 = new int[this.anInt974];
			this.anIntArray266 = new int[this.anInt974];
			this.anIntArray267 = new int[this.anInt974];
			this.anIntArray268 = new int[this.anInt974];
			@Pc(85) int local85 = local13.anInt742 + this.anInt974 * 10;
			for (@Pc(87) int local87 = 0; local87 < this.anInt974; local87++) {
				this.anIntArray265[local87] = local13.method485();
				this.anIntArray266[local87] = local13.method484();
				this.anIntArray267[local87] = local13.method484();
				this.anIntArray268[local87] = local85;
				local85 += this.anIntArray267[local87];
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("6872, " + 8 + ", " + arg0 + ", " + local126.toString());
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
				if (this.aBoolean238) {
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
