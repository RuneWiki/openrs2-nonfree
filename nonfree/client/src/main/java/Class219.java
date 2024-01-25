import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class219 {

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!bk;")
	private Class1_Sub6 aClass1_Sub6_44 = new Class1_Sub6();

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!oa;")
	private final Class170 aClass170_8 = new Class170();

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	private int anInt5584;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	private final int anInt5583;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!fa;")
	private final Class77 aClass77_33;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V")
	public Class219(@OriginalArg(0) int arg0) {
		this.anInt5584 = arg0;
		this.anInt5583 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass77_33 = new Class77(local19);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JB)Lclient!bk;")
	public Class1_Sub6 method4799(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub6 local10 = (Class1_Sub6) this.aClass77_33.method1368(arg0);
		if (local10 != null) {
			this.aClass170_8.method3690(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JLclient!bk;B)V")
	public void method4801(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		if (this.anInt5584 == 0) {
			@Pc(18) Class1_Sub6 local18 = this.aClass170_8.method3684();
			local18.method5577();
			local18.method5580();
			if (this.aClass1_Sub6_44 == local18) {
				local18 = this.aClass170_8.method3684();
				local18.method5577();
				local18.method5580();
			}
		} else {
			this.anInt5584--;
		}
		this.aClass77_33.method1370(arg0, arg1);
		this.aClass170_8.method3690(arg1);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public void method4803() {
		this.aClass170_8.method3686();
		this.aClass77_33.method1362();
		this.aClass1_Sub6_44 = new Class1_Sub6();
		this.anInt5584 = this.anInt5583;
	}
}
