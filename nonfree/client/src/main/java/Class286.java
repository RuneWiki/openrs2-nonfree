import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class286 implements Interface24 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!ur;")
	private final Class342 aClass342_1;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Lclient!wk;")
	private final Class360 aClass360_1;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!wk;Lclient!ur;)V")
	public Class286(@OriginalArg(0) Class360 arg0, @OriginalArg(1) Class342 arg1) {
		this.aClass342_1 = arg1;
		this.aClass360_1 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6873() {
		@Pc(11) Class245 local11 = this.aClass360_1.method7823(this.aClass342_1.anInt8653);
		if (local11 == null) {
			return;
		}
		@Pc(30) int local30 = this.aClass342_1.aClass63_19.method1678(Static245.anInt4333, this.aClass342_1.anInt8654) + this.aClass342_1.anInt8656;
		@Pc(44) int local44 = this.aClass342_1.aClass249_23.method5777(this.aClass342_1.anInt8646, Static66.anInt1531) + this.aClass342_1.anInt8650;
		if (this.aClass342_1.aBoolean665) {
			Static505.aClass45_11.method7402(local30, local44, this.aClass342_1.anInt8654, this.aClass342_1.anInt8646, this.aClass342_1.anInt8647, 0);
		}
		local44 += this.method6261(Static460.aClass54_10, local11.aString51, local30, local44) * 12;
		local44 += 8;
		if (this.aClass342_1.aBoolean665) {
			Static505.aClass45_11.method7376(local30, local44, local30 + this.aClass342_1.anInt8654 - 1, local44, this.aClass342_1.anInt8647, 0);
		}
		local44++;
		local44 += this.method6261(Static460.aClass54_10, local11.aString52, local30, local44) * 12;
		local44 += 5;
		@Pc(127) int local127 = local44 + this.method6261(Static460.aClass54_10, local11.aString53, local30, local44) * 12;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	@Override
	public void method6872() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6871() {
		return this.aClass360_1.method7821();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!la;Ljava/lang/String;IIBI)I")
	private int method6261(@OriginalArg(0) Class54 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return arg0.method7790(null, null, 0, 0, this.aClass342_1.anInt8649, this.aClass342_1.anInt8654 - 10, arg3 + 5, this.aClass342_1.anInt8646 - 10, 0, 0, this.aClass342_1.anInt8655, arg2 + 5, arg1, 0, null);
	}
}
