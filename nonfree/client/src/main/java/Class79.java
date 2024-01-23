import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class79 {

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!oh;")
	private Class99 aClass99_9 = new Class99();

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	private int anInt3295;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	private int anInt3286;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!vd;")
	private Class140 aClass140_9;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
	public Class79(@OriginalArg(0) int arg0) {
		this.anInt3295 = arg0;
		this.anInt3286 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass140_9 = new Class140(local14);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public void method2479(@OriginalArg(1) int arg0) {
		if (Static213.aClass19_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub2_Sub2 local13 = (Class1_Sub2_Sub2) this.aClass99_9.method2970(); local13 != null; local13 = (Class1_Sub2_Sub2) this.aClass99_9.method2969()) {
			if (local13.method3754()) {
				if (local13.method3756() == null) {
					local13.method4186();
					local13.method4198();
					this.anInt3286++;
				}
			} else if (++local13.aLong185 > (long) arg0) {
				@Pc(57) Class1_Sub2_Sub2 local57 = Static213.aClass19_1.method452(local13);
				this.aClass140_9.method4011(local57, local13.aLong184);
				Static199.method3322(local57, local13);
				local13.method4186();
				local13.method4198();
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
	public int method2481() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub2_Sub2 local13 = (Class1_Sub2_Sub2) this.aClass99_9.method2970(); local13 != null; local13 = (Class1_Sub2_Sub2) this.aClass99_9.method2969()) {
			if (!local13.method3754()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)V")
	public void method2482(@OriginalArg(1) long arg0) {
		@Pc(14) Class1_Sub2_Sub2 local14 = (Class1_Sub2_Sub2) this.aClass140_9.method4014(arg0);
		if (local14 != null) {
			local14.method4186();
			local14.method4198();
			this.anInt3286++;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method2483(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2_Sub2 local10 = (Class1_Sub2_Sub2) this.aClass140_9.method4014(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(24) Object local24 = local10.method3756();
		if (local24 == null) {
			local10.method4186();
			local10.method4198();
			this.anInt3286++;
			return null;
		}
		if (local10.method3754()) {
			@Pc(49) Class1_Sub2_Sub2_Sub1 local49 = new Class1_Sub2_Sub2_Sub1(local24);
			this.aClass140_9.method4011(local49, local10.aLong184);
			this.aClass99_9.method2973(local49);
			local49.aLong185 = 0L;
			local10.method4186();
			local10.method4198();
		} else {
			this.aClass99_9.method2973(local10);
			local10.aLong185 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method2486(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method2482(arg1);
		if (this.anInt3286 == 0) {
			@Pc(26) Class1_Sub2_Sub2 local26 = (Class1_Sub2_Sub2) this.aClass99_9.method2963();
			local26.method4186();
			local26.method4198();
		} else {
			this.anInt3286--;
		}
		@Pc(39) Class1_Sub2_Sub2_Sub1 local39 = new Class1_Sub2_Sub2_Sub1(arg0);
		this.aClass140_9.method4011(local39, arg1);
		this.aClass99_9.method2973(local39);
		local39.aLong185 = 0L;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public void method2487() {
		for (@Pc(11) Class1_Sub2_Sub2 local11 = (Class1_Sub2_Sub2) this.aClass99_9.method2970(); local11 != null; local11 = (Class1_Sub2_Sub2) this.aClass99_9.method2969()) {
			if (local11.method3754()) {
				local11.method4186();
				local11.method4198();
				this.anInt3286++;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public void method2489() {
		this.aClass99_9.method2971();
		this.aClass140_9.method4010();
		this.anInt3286 = this.anInt3295;
	}
}
