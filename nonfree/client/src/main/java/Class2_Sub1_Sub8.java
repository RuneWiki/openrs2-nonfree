import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	public int anInt3660;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
	public int anInt3661;

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
	public int anInt3665;

	@OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
	public int anInt3668;

	@OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
	public int anInt3670;

	@OriginalMember(owner = "client!kg", name = "E", descriptor = "Lclient!vc;")
	public final Class254 aClass254_1;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Lclient!ab;")
	public final Class3 aClass3_1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!vc;Lclient!bn;)V")
	public Class2_Sub1_Sub8(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class28_Sub1 arg1) {
		this.aClass254_1 = arg0;
		this.aClass3_1 = this.aClass254_1.method5790();
		this.method3023();
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
	public void method3023() {
		this.anInt3665 = this.aClass254_1.anInt7210;
		this.anInt3660 = this.aClass254_1.anInt7208;
		this.anInt3661 = this.aClass254_1.anInt7218;
		if (this.aClass254_1.aClass6_4 != null) {
			this.aClass254_1.aClass6_4.K(this.aClass3_1.anInt39, this.aClass3_1.anInt35, this.aClass3_1.anInt50, Static61.anIntArray78);
		}
		this.anInt3670 = Static61.anIntArray78[0];
		this.anInt3668 = Static61.anIntArray78[2];
	}
}
