import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class164 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!kp;")
	public Class28_Sub1_Sub4 aClass28_Sub1_Sub4_1;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!kp;")
	public Class28_Sub1_Sub4 aClass28_Sub1_Sub4_2;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "S")
	public short aShort46;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!gs;")
	public Class125 aClass125_2;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "S")
	public short aShort47;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!cl;")
	public Class28_Sub1_Sub2 aClass28_Sub1_Sub2_1;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "S")
	public short aShort48;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!cl;")
	public Class28_Sub1_Sub2 aClass28_Sub1_Sub2_2;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!rh;")
	public Class28_Sub1_Sub5 aClass28_Sub1_Sub5_1;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "S")
	public short aShort49;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!ie;")
	public Class28_Sub1_Sub3 aClass28_Sub1_Sub3_1;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "Lclient!jd;")
	public Class164 aClass164_1;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "B")
	public byte aByte68;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V")
	public Class164(@OriginalArg(0) int arg0) {
		this.aByte68 = (byte) arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method4388() {
		while (this.aClass125_2 != null) {
			@Pc(4) Class125 local4 = this.aClass125_2.aClass125_1;
			this.aClass125_2.method3656();
			this.aClass125_2 = local4;
		}
	}
}
