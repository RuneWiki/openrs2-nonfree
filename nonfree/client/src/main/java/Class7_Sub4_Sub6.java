import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class7_Sub4_Sub6 extends Class7_Sub4 {

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
	public int anInt2565;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
	public int anInt2567;

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
	public int anInt2568;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
	public int anInt2571;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
	public int anInt2574;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "Lclient!dh;")
	public final Class52 aClass52_2;

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "Lclient!ki;")
	public final Class134 aClass134_1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!dh;Lclient!li;)V")
	public Class7_Sub4_Sub6(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class28_Sub3 arg1) {
		this.aClass52_2 = arg0;
		this.aClass134_1 = this.aClass52_2.method1136();
		this.method2145();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public void method2145() {
		this.anInt2565 = this.aClass52_2.anInt1307;
		this.anInt2574 = this.aClass52_2.anInt1304;
		this.anInt2568 = this.aClass52_2.anInt1306;
		if (this.aClass52_2.aClass33_4 != null) {
			this.aClass52_2.aClass33_4.p(this.aClass134_1.anInt3790, this.aClass134_1.anInt3780, this.aClass134_1.anInt3785, Static386.anIntArray559);
		}
		this.anInt2571 = Static386.anIntArray559[2];
		this.anInt2567 = Static386.anIntArray559[0];
	}
}
