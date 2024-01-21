import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VSQMPWOM")
public final class Class39 {

	@OriginalMember(owner = "client!VSQMPWOM", name = "d", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!VSQMPWOM", name = "e", descriptor = "I")
	private int anInt725;

	@OriginalMember(owner = "client!VSQMPWOM", name = "f", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!VSQMPWOM", name = "g", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!VSQMPWOM", name = "h", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!VSQMPWOM", name = "i", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!VSQMPWOM", name = "j", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "client!VSQMPWOM", name = "a", descriptor = "I")
	private int anInt723 = 3;

	@OriginalMember(owner = "client!VSQMPWOM", name = "b", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!VSQMPWOM", name = "c", descriptor = "I")
	private int anInt724 = 1;

	@OriginalMember(owner = "client!VSQMPWOM", name = "<init>", descriptor = "([BI)V")
	public Class39(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method488(arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("94913, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSQMPWOM", name = "a", descriptor = "([BI)V")
	private void method488(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class2_Sub1_Sub2 local7 = new Class2_Sub1_Sub2(arg0, -990);
			@Pc(10) int local10 = local7.method83();
			@Pc(13) int local13 = local7.method83();
			if (local13 == local10) {
				this.aByteArray17 = arg0;
				this.aBoolean177 = false;
			} else {
				@Pc(22) byte[] local22 = new byte[local10];
				Class44.method538(local22, local10, arg0, local13, 6);
				this.aByteArray17 = local22;
				local7 = new Class2_Sub1_Sub2(this.aByteArray17, -990);
				this.aBoolean177 = true;
			}
			this.anInt725 = local7.method81();
			this.anIntArray135 = new int[this.anInt725];
			this.anIntArray136 = new int[this.anInt725];
			this.anIntArray137 = new int[this.anInt725];
			this.anIntArray138 = new int[this.anInt725];
			@Pc(82) int local82 = local7.anInt123 + this.anInt725 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt725; local84++) {
				this.anIntArray135[local84] = local7.method84();
				this.anIntArray136[local84] = local7.method83();
				this.anIntArray137[local84] = local7.method83();
				this.anIntArray138[local84] = local82;
				local82 += this.anIntArray137[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("52031, " + arg0 + ", " + 0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSQMPWOM", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method489(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt725; local27++) {
			if (this.anIntArray135[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray136[local27]];
				}
				if (this.aBoolean177) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray136[local27]; local67++) {
						arg1[local67] = this.aByteArray17[this.anIntArray138[local27] + local67];
					}
				} else {
					Class44.method538(arg1, this.anIntArray136[local27], this.aByteArray17, this.anIntArray137[local27], this.anIntArray138[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
