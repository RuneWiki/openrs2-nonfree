import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public int anInt400;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	public int anInt401;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	public int anInt402;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Lclient!pb;")
	public Class1_Sub2_Sub14 aClass1_Sub2_Sub14_1;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "Lclient!je;")
	public Class1_Sub12_Sub1 aClass1_Sub12_Sub1_1;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
	public int anInt409;

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "Lclient!je;")
	public Class1_Sub12_Sub1 aClass1_Sub12_Sub1_2;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
	public int anInt412;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public void method451() {
		@Pc(6) int local6 = this.anInt412;
		@Pc(15) Class1_Sub2_Sub14 local15 = this.aClass1_Sub2_Sub14_1.method2385();
		if (local15 == null) {
			this.anInt404 = 0;
			this.anInt401 = 0;
			this.anInt406 = 0;
			this.anIntArray49 = null;
			this.anInt412 = -1;
		} else {
			this.anInt406 = local15.anInt3301;
			this.anInt401 = local15.anInt3322;
			this.anInt412 = local15.anInt3324;
			this.anIntArray49 = local15.anIntArray329;
			this.anInt404 = local15.anInt3333 * 128;
		}
		if (this.anInt412 != local6 && this.aClass1_Sub12_Sub1_2 != null) {
			Static77.aClass1_Sub12_Sub2_1.method2355(this.aClass1_Sub12_Sub1_2);
			this.aClass1_Sub12_Sub1_2 = null;
		}
	}
}
