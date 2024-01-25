import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class55 implements Interface6 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!la;")
	private Class96 aClass96_5;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!cca;")
	private final Class36 aClass36_1;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!sea;")
	private final Class308 aClass308_34;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!sea;")
	private final Class308 aClass308_33;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!sea;Lclient!sea;Lclient!cca;)V")
	public Class55(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class36 arg2) {
		this.aClass36_1 = arg2;
		this.aClass308_34 = arg0;
		this.aClass308_33 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7886() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass308_34.method6538(this.aClass36_1.anInt1053)) {
			local11 = false;
		}
		if (!this.aClass308_33.method6538(this.aClass36_1.anInt1053)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	@Override
	public void method7888() {
		@Pc(15) Class352 local15 = Static342.method5100(this.aClass36_1.anInt1053, this.aClass308_33);
		this.aClass96_5 = Static31.aClass78_18.method6837(local15, Static604.method6024(this.aClass308_34, this.aClass36_1.anInt1053));
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7887() {
		@Pc(15) int local15 = this.aClass36_1.aClass259_2.method5515(this.aClass36_1.anInt1059, Static318.anInt5819) + this.aClass36_1.anInt1055;
		@Pc(29) int local29 = this.aClass36_1.aClass216_3.method4653(this.aClass36_1.anInt1052, Static192.anInt3766) + this.aClass36_1.anInt1058;
		this.aClass96_5.method7261(this.aClass36_1.anInt1051, 0, null, 0, local29, this.aClass36_1.anInt1060, null, this.aClass36_1.anInt1050, this.aClass36_1.anInt1061, local15, this.aClass36_1.anInt1059, this.aClass36_1.anInt1054, this.aClass36_1.anInt1052, this.aClass36_1.aString7, null);
	}
}
