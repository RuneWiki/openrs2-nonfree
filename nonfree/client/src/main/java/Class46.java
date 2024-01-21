import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class46 {

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!yb", name = "k", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "B")
	private byte aByte41 = 117;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private int anInt1009 = 307;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "I")
	private int anInt1010 = -39972;

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "(I[B)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method673(arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("11947, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "([BB)V")
	private void method673(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, false);
			@Pc(10) int local10 = local7.method500();
			@Pc(23) int local23 = local7.method500();
			if (local23 == local10) {
				this.aByteArray21 = arg0;
				this.aBoolean222 = false;
			} else {
				@Pc(29) byte[] local29 = new byte[local10];
				Class39.method629(local29, local10, arg0, local23, 6);
				this.aByteArray21 = local29;
				local7 = new Class1_Sub1_Sub3(this.aByteArray21, false);
				this.aBoolean222 = true;
			}
			this.anInt1011 = local7.method498();
			this.anIntArray266 = new int[this.anInt1011];
			this.anIntArray267 = new int[this.anInt1011];
			this.anIntArray268 = new int[this.anInt1011];
			this.anIntArray269 = new int[this.anInt1011];
			@Pc(89) int local89 = local7.anInt778 + this.anInt1011 * 10;
			for (@Pc(91) int local91 = 0; local91 < this.anInt1011; local91++) {
				this.anIntArray266[local91] = local7.method501();
				this.anIntArray267[local91] = local7.method500();
				this.anIntArray268[local91] = local7.method500();
				this.anIntArray269[local91] = local89;
				local89 += this.anIntArray268[local91];
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("84984, " + arg0 + ", " + 44 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method674(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt1011; local27++) {
			if (this.anIntArray266[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray267[local27]];
				}
				if (this.aBoolean222) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray267[local27]; local67++) {
						arg1[local67] = this.aByteArray21[this.anIntArray269[local27] + local67];
					}
				} else {
					Class39.method629(arg1, this.anIntArray267[local27], this.aByteArray21, this.anIntArray268[local27], this.anIntArray269[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
