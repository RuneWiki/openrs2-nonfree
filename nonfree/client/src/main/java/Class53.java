import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class53 {

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!ch;")
	public Class53 aClass53_1;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Lclient!c;")
	public Class13_Sub1_Sub2 aClass13_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!cea;")
	public Class13_Sub1_Sub3 aClass13_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "S")
	public short aShort22;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Lclient!wp;")
	public Class13_Sub1_Sub5 aClass13_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Lclient!su;")
	public Class325 aClass325_1;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Lclient!fw;")
	public Class13_Sub1_Sub4 aClass13_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Lclient!fw;")
	public Class13_Sub1_Sub4 aClass13_Sub1_Sub4_2;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "S")
	public short aShort23;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!cea;")
	public Class13_Sub1_Sub3 aClass13_Sub1_Sub3_2;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "S")
	public short aShort24;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
	public Class53(@OriginalArg(0) int arg0) {
		this.aByte28 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public void method968() {
		while (this.aClass325_1 != null) {
			@Pc(7) Class325 local7 = this.aClass325_1.aClass325_3;
			this.aClass325_1.method7368();
			this.aClass325_1 = local7;
		}
	}
}
