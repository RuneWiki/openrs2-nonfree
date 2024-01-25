import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class226 {

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Lclient!mf;")
	public Class226 aClass226_1;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!si;")
	public Class28_Sub1_Sub5 aClass28_Sub1_Sub5_1;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "S")
	public short aShort65;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!fa;")
	public Class28_Sub1_Sub1 aClass28_Sub1_Sub1_1;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!pa;")
	public Class28_Sub1_Sub2 aClass28_Sub1_Sub2_1;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "S")
	public short aShort66;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "S")
	public short aShort67;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "S")
	public short aShort68;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!cda;")
	public Class28_Sub1_Sub3 aClass28_Sub1_Sub3_1;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!bj;")
	public Class41 aClass41_3;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!cda;")
	public Class28_Sub1_Sub3 aClass28_Sub1_Sub3_2;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Lclient!si;")
	public Class28_Sub1_Sub5 aClass28_Sub1_Sub5_2;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
	public Class226(@OriginalArg(0) int arg0) {
		this.aByte100 = (byte) arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public void method5561() {
		while (this.aClass41_3 != null) {
			@Pc(4) Class41 local4 = this.aClass41_3.aClass41_2;
			this.aClass41_3.method611();
			this.aClass41_3 = local4;
		}
	}
}
