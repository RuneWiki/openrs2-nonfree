import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class109 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!ro;")
	private final Class176 aClass176_7 = new Class176();

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	private int anInt3260;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	private final int anInt3249;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!cs;")
	private final Class42 aClass42_28;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I)V")
	public Class109(@OriginalArg(0) int arg0) {
		this.anInt3260 = arg0;
		this.anInt3249 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass42_28 = new Class42(local14);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/lang/Object;Lclient!gl;)V")
	public void method2984(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface3 arg1) {
		this.method2986(arg1);
		if (this.anInt3260 == 0) {
			@Pc(32) Class5_Sub9_Sub2 local32 = (Class5_Sub9_Sub2) this.aClass176_7.method4775();
			local32.method5803();
			local32.method5494();
		} else {
			this.anInt3260--;
		}
		@Pc(44) Class5_Sub9_Sub2_Sub2 local44 = new Class5_Sub9_Sub2_Sub2(arg1, arg0);
		this.aClass42_28.method1050(arg1.method3227(), local44);
		this.aClass176_7.method4772(local44);
		local44.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	public void method2985() {
		if (Static208.aClass200_1 == null) {
			return;
		}
		for (@Pc(13) Class5_Sub9_Sub2 local13 = (Class5_Sub9_Sub2) this.aClass176_7.method4768(); local13 != null; local13 = (Class5_Sub9_Sub2) this.aClass176_7.method4776()) {
			if (local13.method1809()) {
				if (local13.method1807() == null) {
					local13.method5803();
					local13.method5494();
					this.anInt3260++;
				}
			} else if ((long) 5 < ++local13.aLong208) {
				@Pc(53) Class5_Sub9_Sub2 local53 = Static208.aClass200_1.method5468(local13);
				this.aClass42_28.method1050(local13.aLong218, local53);
				Static136.method2581(local13, local53);
				local13.method5803();
				local13.method5494();
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!gl;)V")
	private void method2986(@OriginalArg(1) Interface3 arg0) {
		@Pc(9) long local9 = arg0.method3227();
		for (@Pc(16) Class5_Sub9_Sub2 local16 = (Class5_Sub9_Sub2) this.aClass42_28.method1052(local9); local16 != null; local16 = (Class5_Sub9_Sub2) this.aClass42_28.method1057()) {
			if (local16.anInterface3_3.method3226(arg0)) {
				local16.method5803();
				local16.method5494();
				this.anInt3260++;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public void method2987() {
		for (@Pc(17) Class5_Sub9_Sub2 local17 = (Class5_Sub9_Sub2) this.aClass176_7.method4768(); local17 != null; local17 = (Class5_Sub9_Sub2) this.aClass176_7.method4776()) {
			if (local17.method1809()) {
				local17.method5803();
				local17.method5494();
				this.anInt3260++;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
	public void method2989() {
		this.aClass176_7.method4767();
		this.aClass42_28.method1054();
		this.anInt3260 = this.anInt3249;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
	public int method2992() {
		return this.anInt3249;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)I")
	public int method2993() {
		return this.anInt3260;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!gl;I)Ljava/lang/Object;")
	public Object method2995(@OriginalArg(0) Interface3 arg0) {
		@Pc(9) long local9 = arg0.method3227();
		for (@Pc(23) Class5_Sub9_Sub2 local23 = (Class5_Sub9_Sub2) this.aClass42_28.method1052(local9); local23 != null; local23 = (Class5_Sub9_Sub2) this.aClass42_28.method1057()) {
			if (local23.anInterface3_3.method3226(arg0)) {
				@Pc(37) Object local37 = local23.method1807();
				if (local37 != null) {
					if (local23.method1809()) {
						@Pc(73) Class5_Sub9_Sub2_Sub2 local73 = new Class5_Sub9_Sub2_Sub2(arg0, local37);
						this.aClass42_28.method1050(local23.aLong218, local73);
						this.aClass176_7.method4772(local73);
						local73.aLong208 = 0L;
						local23.method5803();
						local23.method5494();
					} else {
						this.aClass176_7.method4772(local23);
						local23.aLong208 = 0L;
					}
					return local37;
				}
				local23.method5803();
				local23.method5494();
				this.anInt3260++;
			}
		}
		return null;
	}
}
