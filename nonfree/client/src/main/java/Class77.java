import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class77 implements Interface3 {

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	private int anInt3314 = 50;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
	private int anInt3321 = 128;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "Lclient!pb;")
	private final Class71 aClass71_31;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!pb;")
	private final Class71 aClass71_30;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!kg;")
	private Class53 aClass53_19;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!pb;Lclient!pb;II)V")
	public Class77(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass71_31 = arg1;
		this.anInt3321 = arg3;
		this.aClass71_30 = arg0;
		this.anInt3314 = arg2;
		this.aClass53_19 = new Class53(this.anInt3314);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method2295(@OriginalArg(0) int arg0) {
		return this.method2303(arg0).aBoolean174;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2299(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub1_Sub22 local15 = this.method2303(arg0);
		return local15.method2737(this.anInt3321, this, this.aClass71_31);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method2294(@OriginalArg(0) int arg0) {
		return this.anInt3321 == 64 || this.method2303(arg0).anInt3965 == 64;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
	public void method2301(@OriginalArg(1) int arg0) {
		for (@Pc(19) Class2_Sub1_Sub22 local19 = (Class2_Sub1_Sub22) this.aClass53_19.method1643(); local19 != null; local19 = (Class2_Sub1_Sub22) this.aClass53_19.method1642()) {
			if (local19.aBoolean172) {
				local19.method2736(arg0);
				local19.aBoolean172 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	public void method2302() {
		this.aClass53_19 = new Class53(this.anInt3314);
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(IB)Lclient!ua;")
	private Class2_Sub1_Sub22 method2303(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub1_Sub22 local11 = (Class2_Sub1_Sub22) this.aClass53_19.method1648((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) byte[] local22 = this.aClass71_30.method2130(0, arg0);
		if (local22 == null) {
			return Static102.method1621();
		} else {
			@Pc(40) Class2_Sub11 local40 = new Class2_Sub11(local22);
			local11 = new Class2_Sub1_Sub22(local40);
			this.aClass53_19.method1645((long) arg0, local11);
			return local11;
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(IB)I")
	@Override
	public int method2298(@OriginalArg(0) int arg0) {
		return this.method2303(arg0).anInt3966;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method2300(@OriginalArg(1) int arg0) {
		return this.method2303(arg0).aBoolean173;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method2296(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub1_Sub22 local4 = this.method2303(arg1);
		local4.aBoolean172 = true;
		return local4.method2741(this, arg0, this.anInt3321, this.aClass71_31);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(IB)Z")
	@Override
	public boolean method2297(@OriginalArg(0) int arg0) {
		return this.method2303(arg0).method2742(this.aClass71_31, this);
	}
}
