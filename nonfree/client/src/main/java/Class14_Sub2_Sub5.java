import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class14_Sub2_Sub5 extends Class14_Sub2 {

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
	public int anInt1397;

	@OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
	public int anInt1400;

	@OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
	public int anInt1402;

	@OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
	public int anInt1403;

	@OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
	public int anInt1404;

	@OriginalMember(owner = "client!dk", name = "H", descriptor = "Lclient!jc;")
	public final Class101 aClass101_1;

	@OriginalMember(owner = "client!dk", name = "x", descriptor = "Lclient!ll;")
	public final Class129 aClass129_1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!jc;Lclient!pj;)V")
	public Class14_Sub2_Sub5(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		this.aClass101_1 = arg0;
		this.aClass129_1 = Static157.method3071(arg0.anInt3055);
		this.method1315();
	}

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V")
	public void method1315() {
		this.anInt1402 = this.aClass101_1.anInt3058;
		this.anInt1403 = this.aClass101_1.anInt3057;
		this.anInt1397 = this.aClass101_1.anInt3053;
		if (this.aClass101_1.aClass51_2 != null) {
			this.aClass101_1.aClass51_2.method3551(this.aClass129_1.anInt3770, this.aClass129_1.anInt3772, this.aClass129_1.anInt3762, Static69.anIntArray120);
		}
		this.anInt1404 = Static69.anIntArray120[2];
		this.anInt1400 = Static69.anIntArray120[0];
	}
}
