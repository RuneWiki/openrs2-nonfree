import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "Lclient!ie;")
	public Class5_Sub7_Sub2 aClass5_Sub7_Sub2_2;

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
	public int anInt1328;

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
	public int anInt1329;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
	public int anInt1330;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
	public int anInt1332;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
	public int anInt1333;

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Lclient!f;")
	public Class5_Sub2_Sub7 aClass5_Sub2_Sub7_1;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
	public int anInt1336;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	public int anInt1337;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
	public int anInt1338;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
	public int anInt1341;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!ie;")
	public Class5_Sub7_Sub2 aClass5_Sub7_Sub2_3;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
	public int anInt1343;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)V")
	public void method977() {
		@Pc(6) int local6 = this.anInt1330;
		@Pc(17) Class5_Sub2_Sub7 local17 = this.aClass5_Sub2_Sub7_1.method606();
		if (local17 == null) {
			this.anInt1333 = 0;
			this.anIntArray216 = null;
			this.anInt1330 = -1;
			this.anInt1337 = 0;
			this.anInt1338 = 0;
		} else {
			this.anInt1337 = local17.anInt833;
			this.anIntArray216 = local17.anIntArray141;
			this.anInt1338 = local17.anInt850;
			this.anInt1330 = local17.anInt855;
			this.anInt1333 = local17.anInt860 * 128;
		}
		if (this.anInt1330 != local6 && this.aClass5_Sub7_Sub2_3 != null) {
			Static47.aClass5_Sub7_Sub3_2.method2009(this.aClass5_Sub7_Sub2_3);
			this.aClass5_Sub7_Sub2_3 = null;
		}
	}
}
