import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class327 implements Interface24 {

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Lclient!la;")
	private Class54 aClass54_14;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "Lclient!tf;")
	private final Class322 aClass322_139;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!ig;")
	private final Class144 aClass144_1;

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "Lclient!tf;")
	private final Class322 aClass322_138;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!tf;Lclient!tf;Lclient!ig;)V")
	public Class327(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class144 arg2) {
		this.aClass322_139 = arg0;
		this.aClass144_1 = arg2;
		this.aClass322_138 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	@Override
	public void method6872() {
		@Pc(17) Class134 local17 = Static149.method2843(this.aClass144_1.anInt3965, this.aClass322_138);
		this.aClass54_14 = Static505.aClass45_11.method7394(local17, Static604.method6158(this.aClass322_139, this.aClass144_1.anInt3965));
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6871() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass322_139.method6797(this.aClass144_1.anInt3965)) {
			local5 = false;
		}
		if (!this.aClass322_138.method6797(this.aClass144_1.anInt3965)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6873() {
		@Pc(25) int local25 = this.aClass144_1.aClass63_10.method1678(Static245.anInt4333, this.aClass144_1.anInt3972) + this.aClass144_1.anInt3974;
		@Pc(40) int local40 = this.aClass144_1.aClass249_9.method5777(this.aClass144_1.anInt3968, Static66.anInt1531) + this.aClass144_1.anInt3969;
		this.aClass54_14.method7790(null, null, 0, this.aClass144_1.anInt3963, this.aClass144_1.anInt3966, this.aClass144_1.anInt3972, local40, this.aClass144_1.anInt3968, this.aClass144_1.anInt3970, this.aClass144_1.anInt3971, this.aClass144_1.anInt3967, local25, this.aClass144_1.aString26, 0, null);
	}
}
