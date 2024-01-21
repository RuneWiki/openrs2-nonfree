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
	private int anInt998;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt997 = 1000;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "([BI)V")
	public Class47(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method665(arg0, (byte) 7);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("70295, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "([BB)V")
	private void method665(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(this.anInt997, arg0);
			@Pc(11) int local11 = local8.method484();
			@Pc(14) int local14 = local8.method484();
			if (local14 == local11) {
				this.aByteArray21 = arg0;
				this.aBoolean246 = false;
			} else {
				@Pc(20) byte[] local20 = new byte[local11];
				Class38.method581(local20, local11, arg0, local14, 6);
				this.aByteArray21 = local20;
				local8 = new Class1_Sub1_Sub3(this.anInt997, this.aByteArray21);
				this.aBoolean246 = true;
			}
			this.anInt998 = local8.method482();
			this.anIntArray265 = new int[this.anInt998];
			@Pc(63) boolean local63 = false;
			this.anIntArray266 = new int[this.anInt998];
			this.anIntArray267 = new int[this.anInt998];
			this.anIntArray268 = new int[this.anInt998];
			@Pc(89) int local89 = local8.anInt751 + this.anInt998 * 10;
			for (@Pc(91) int local91 = 0; local91 < this.anInt998; local91++) {
				this.anIntArray265[local91] = local8.method485();
				this.anIntArray266[local91] = local8.method484();
				this.anIntArray267[local91] = local8.method484();
				this.anIntArray268[local91] = local89;
				local89 += this.anIntArray267[local91];
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("21427, " + arg0 + ", " + arg1 + ", " + local130.toString());
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
		for (@Pc(27) int local27 = 0; local27 < this.anInt998; local27++) {
			if (this.anIntArray265[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray266[local27]];
				}
				if (this.aBoolean246) {
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
