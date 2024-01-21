import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FUZJMGZB")
public final class Class13 {

	@OriginalMember(owner = "client!FUZJMGZB", name = "d", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!FUZJMGZB", name = "e", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!FUZJMGZB", name = "f", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!FUZJMGZB", name = "g", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!FUZJMGZB", name = "h", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!FUZJMGZB", name = "i", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!FUZJMGZB", name = "j", descriptor = "Z")
	private boolean aBoolean65;

	@OriginalMember(owner = "client!FUZJMGZB", name = "a", descriptor = "Z")
	private boolean aBoolean63 = true;

	@OriginalMember(owner = "client!FUZJMGZB", name = "b", descriptor = "I")
	private int anInt233 = -610;

	@OriginalMember(owner = "client!FUZJMGZB", name = "c", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!FUZJMGZB", name = "<init>", descriptor = "(I[B)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method185(arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("98726, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUZJMGZB", name = "a", descriptor = "([BB)V")
	private void method185(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub3 local7 = new Class2_Sub1_Sub3((byte) 114, arg0);
			@Pc(20) int local20 = local7.method271();
			@Pc(23) int local23 = local7.method271();
			if (local23 == local20) {
				this.aByteArray5 = arg0;
				this.aBoolean65 = false;
			} else {
				@Pc(29) byte[] local29 = new byte[local20];
				Class19.method236(local29, local20, arg0, local23, 6);
				this.aByteArray5 = local29;
				local7 = new Class2_Sub1_Sub3((byte) 114, this.aByteArray5);
				this.aBoolean65 = true;
			}
			this.anInt234 = local7.method269();
			this.anIntArray83 = new int[this.anInt234];
			this.anIntArray84 = new int[this.anInt234];
			this.anIntArray85 = new int[this.anInt234];
			this.anIntArray86 = new int[this.anInt234];
			@Pc(89) int local89 = local7.anInt283 + this.anInt234 * 10;
			for (@Pc(91) int local91 = 0; local91 < this.anInt234; local91++) {
				this.anIntArray83[local91] = local7.method272();
				this.anIntArray84[local91] = local7.method271();
				this.anIntArray85[local91] = local7.method271();
				this.anIntArray86[local91] = local89;
				local89 += this.anIntArray85[local91];
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("91546, " + arg0 + ", " + -24 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUZJMGZB", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method186(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt234; local27++) {
			if (this.anIntArray83[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray84[local27]];
				}
				if (this.aBoolean65) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray84[local27]; local67++) {
						arg1[local67] = this.aByteArray5[this.anIntArray86[local27] + local67];
					}
				} else {
					Class19.method236(arg1, this.anIntArray84[local27], this.aByteArray5, this.anIntArray85[local27], this.anIntArray86[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
