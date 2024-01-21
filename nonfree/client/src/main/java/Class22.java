import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MAARFNGV")
public final class Class22 {

	@OriginalMember(owner = "client!MAARFNGV", name = "b", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!MAARFNGV", name = "c", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!MAARFNGV", name = "d", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!MAARFNGV", name = "e", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!MAARFNGV", name = "f", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!MAARFNGV", name = "g", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!MAARFNGV", name = "h", descriptor = "Z")
	private boolean aBoolean97;

	@OriginalMember(owner = "client!MAARFNGV", name = "a", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!MAARFNGV", name = "<init>", descriptor = "([BB)V")
	public Class22(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.method217(arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("42288, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MAARFNGV", name = "a", descriptor = "([BZ)V")
	private void method217(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub3 local7 = new Class2_Sub1_Sub3(arg0, true);
			@Pc(10) int local10 = local7.method101();
			@Pc(13) int local13 = local7.method101();
			if (local13 == local10) {
				this.aByteArray16 = arg0;
				this.aBoolean97 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class37.method381(local19, local10, arg0, local13, 6);
				this.aByteArray16 = local19;
				local7 = new Class2_Sub1_Sub3(this.aByteArray16, true);
				this.aBoolean97 = true;
			}
			this.anInt244 = local7.method99();
			this.anIntArray99 = new int[this.anInt244];
			this.anIntArray100 = new int[this.anInt244];
			this.anIntArray101 = new int[this.anInt244];
			this.anIntArray102 = new int[this.anInt244];
			@Pc(82) int local82 = local7.anInt136 + this.anInt244 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt244; local84++) {
				this.anIntArray99[local84] = local7.method102();
				this.anIntArray100[local84] = local7.method101();
				this.anIntArray101[local84] = local7.method101();
				this.anIntArray102[local84] = local82;
				local82 += this.anIntArray101[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("2403, " + arg0 + ", " + false + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MAARFNGV", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method218(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt244; local27++) {
			if (this.anIntArray99[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray100[local27]];
				}
				if (this.aBoolean97) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray100[local27]; local67++) {
						arg1[local67] = this.aByteArray16[this.anIntArray102[local27] + local67];
					}
				} else {
					Class37.method381(arg1, this.anIntArray100[local27], this.aByteArray16, this.anIntArray101[local27], this.anIntArray102[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
