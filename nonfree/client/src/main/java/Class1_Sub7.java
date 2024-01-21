import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	public int anInt1220;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "Lclient!bd;")
	public Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Lclient!ac;")
	public Class1_Sub2_Sub1 aClass1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "Lclient!ac;")
	public Class1_Sub2_Sub1 aClass1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	public int anInt1223;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	public int anInt1225;

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
	public int anInt1226;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
	public int anInt1228;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
	public int anInt1230;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
	public int anInt1232;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
	public int anInt1233;

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
	public int anInt1234;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
	public int anInt1235;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	public void method930() {
		@Pc(2) int local2 = this.anInt1226;
		@Pc(17) Class1_Sub1_Sub3 local17 = this.aClass1_Sub1_Sub3_1.method248();
		if (local17 == null) {
			this.anInt1226 = -1;
			this.anInt1233 = 0;
			this.anIntArray168 = null;
			this.anInt1220 = 0;
			this.anInt1230 = 0;
		} else {
			this.anInt1230 = local17.anInt383;
			this.anInt1220 = local17.anInt377;
			this.anInt1233 = local17.anInt408 * 128;
			this.anInt1226 = local17.anInt413;
			this.anIntArray168 = local17.anIntArray60;
		}
		if (this.anInt1226 != local2 && this.aClass1_Sub2_Sub1_1 != null) {
			Static23.aClass1_Sub2_Sub2_1.method1523(this.aClass1_Sub2_Sub1_1);
			this.aClass1_Sub2_Sub1_1 = null;
		}
	}
}
