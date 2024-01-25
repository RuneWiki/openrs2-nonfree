import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class83 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!ub;")
	private final Class252 aClass252_1 = new Class252();

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	private int anInt2588;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	private final int anInt2594;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!hl;")
	private final Class96 aClass96_14;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class83(@OriginalArg(0) int arg0) {
		this.anInt2588 = arg0;
		this.anInt2594 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass96_14 = new Class96(local14);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JBILjava/lang/Object;)V")
	private void method2334(@OriginalArg(0) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt2594 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2344(arg0);
		this.anInt2588--;
		while (this.anInt2588 < 0) {
			@Pc(38) Class4_Sub1_Sub12 local38 = (Class4_Sub1_Sub12) this.aClass252_1.method5698();
			this.method2347(local38);
		}
		@Pc(54) Class4_Sub1_Sub12_Sub2 local54 = new Class4_Sub1_Sub12_Sub2(arg1, 1);
		this.aClass96_14.method2805(arg0, local54);
		this.aClass252_1.method5694(local54);
		local54.aLong219 = 0L;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method2335() {
		@Pc(16) Class4_Sub1_Sub12 local16 = (Class4_Sub1_Sub12) this.aClass96_14.method2796();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method5267();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class4_Sub1_Sub12 local26 = local16;
			local16 = (Class4_Sub1_Sub12) this.aClass96_14.method2796();
			local26.method6330();
			local26.method5985();
			this.anInt2588 += local16.anInt6450;
		}
		return null;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public void method2336() {
		for (@Pc(17) Class4_Sub1_Sub12 local17 = (Class4_Sub1_Sub12) this.aClass252_1.method5697(); local17 != null; local17 = (Class4_Sub1_Sub12) this.aClass252_1.method5700()) {
			if (local17.method5269()) {
				local17.method6330();
				local17.method5985();
				this.anInt2588 += local17.anInt6450;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void method2337(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method2334(arg1, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method2338(@OriginalArg(1) long arg0) {
		@Pc(10) Class4_Sub1_Sub12 local10 = (Class4_Sub1_Sub12) this.aClass96_14.method2797(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method5267();
		if (local18 == null) {
			local10.method6330();
			local10.method5985();
			this.anInt2588 += local10.anInt6450;
			return null;
		}
		if (local10.method5269()) {
			@Pc(56) Class4_Sub1_Sub12_Sub2 local56 = new Class4_Sub1_Sub12_Sub2(local18, local10.anInt6450);
			this.aClass96_14.method2805(local10.aLong228, local56);
			this.aClass252_1.method5694(local56);
			local56.aLong219 = 0L;
			local10.method6330();
			local10.method5985();
		} else {
			this.aClass252_1.method5694(local10);
			local10.aLong219 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I")
	public int method2340() {
		@Pc(14) int local14 = 0;
		for (@Pc(22) Class4_Sub1_Sub12 local22 = (Class4_Sub1_Sub12) this.aClass252_1.method5697(); local22 != null; local22 = (Class4_Sub1_Sub12) this.aClass252_1.method5700()) {
			if (!local22.method5269()) {
				local14++;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method2342() {
		@Pc(11) Class4_Sub1_Sub12 local11 = (Class4_Sub1_Sub12) this.aClass96_14.method2798();
		while (local11 != null) {
			@Pc(25) Object local25 = local11.method5267();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class4_Sub1_Sub12 local31 = local11;
			local11 = (Class4_Sub1_Sub12) this.aClass96_14.method2796();
			local31.method6330();
			local31.method5985();
			this.anInt2588 += local11.anInt6450;
		}
		return null;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I")
	public int method2343() {
		return this.anInt2594;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JB)V")
	private void method2344(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub1_Sub12 local10 = (Class4_Sub1_Sub12) this.aClass96_14.method2797(arg0);
		this.method2347(local10);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V")
	public void method2345(@OriginalArg(1) int arg0) {
		if (Static410.aClass204_1 == null) {
			return;
		}
		for (@Pc(13) Class4_Sub1_Sub12 local13 = (Class4_Sub1_Sub12) this.aClass252_1.method5697(); local13 != null; local13 = (Class4_Sub1_Sub12) this.aClass252_1.method5700()) {
			if (local13.method5269()) {
				if (local13.method5267() == null) {
					local13.method6330();
					local13.method5985();
					this.anInt2588++;
				}
			} else if (++local13.aLong219 > (long) arg0) {
				@Pc(39) Class4_Sub1_Sub12 local39 = Static410.aClass204_1.method4872(local13);
				this.aClass96_14.method2805(local13.aLong228, local39);
				Static295.method4509(local13, local39);
				local13.method6330();
				local13.method5985();
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
	public void method2346() {
		this.aClass252_1.method5696();
		this.aClass96_14.method2799();
		this.anInt2588 = this.anInt2594;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ie;I)V")
	private void method2347(@OriginalArg(0) Class4_Sub1_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method6330();
			arg0.method5985();
			this.anInt2588 += arg0.anInt6450;
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I")
	public int method2348() {
		return this.anInt2588;
	}
}
