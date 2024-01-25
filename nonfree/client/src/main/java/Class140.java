import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class140 {

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Lclient!ld;")
	private final Class145 aClass145_4 = new Class145();

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	private final int anInt4065;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
	private int anInt4071;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Lclient!ub;")
	private final Class240 aClass240_19;

	static {
		new Class256(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V")
	public Class140(@OriginalArg(0) int arg0) {
		this.anInt4065 = arg0;
		this.anInt4071 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass240_19 = new Class240(local16);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)I")
	public int method3263() {
		return this.anInt4071;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	public void method3265() {
		if (Static156.aClass169_1 == null) {
			return;
		}
		for (@Pc(17) Class2_Sub2_Sub10 local17 = (Class2_Sub2_Sub10) this.aClass145_4.method3390(); local17 != null; local17 = (Class2_Sub2_Sub10) this.aClass145_4.method3384()) {
			if (local17.method5325()) {
				if (local17.method5326() == null) {
					local17.method6072();
					local17.method5934();
					this.anInt4071 += local17.anInt6787;
				}
			} else if (++local17.aLong223 > (long) 5) {
				@Pc(64) Class2_Sub2_Sub10 local64 = Static156.aClass169_1.method3955(local17);
				this.aClass240_19.method5430(local17.aLong227, local64);
				Static279.method4127(local17, local64);
				local17.method6072();
				local17.method5934();
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!ji;)V")
	private void method3266(@OriginalArg(1) Class2_Sub2_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method6072();
			arg0.method5934();
			this.anInt4071 += arg0.anInt6787;
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)I")
	public int method3267() {
		return this.anInt4065;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
	public void method3268() {
		for (@Pc(11) Class2_Sub2_Sub10 local11 = (Class2_Sub2_Sub10) this.aClass145_4.method3390(); local11 != null; local11 = (Class2_Sub2_Sub10) this.aClass145_4.method3384()) {
			if (local11.method5325()) {
				local11.method6072();
				local11.method5934();
				this.anInt4071 += local11.anInt6787;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!kr;B)V")
	private void method3269(@OriginalArg(0) Interface6 arg0) {
		@Pc(9) long local9 = arg0.method1490();
		for (@Pc(24) Class2_Sub2_Sub10 local24 = (Class2_Sub2_Sub10) this.aClass240_19.method5439(local9); local24 != null; local24 = (Class2_Sub2_Sub10) this.aClass240_19.method5434()) {
			if (local24.anInterface6_3.method1491(arg0)) {
				this.method3266(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!kr;Ljava/lang/Object;)V")
	public void method3270(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) Object arg1) {
		this.method3271(arg1, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/Object;Lclient!kr;I)V")
	private void method3271(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface6 arg1) {
		if (this.anInt4065 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3269(arg1);
		this.anInt4071--;
		while (this.anInt4071 < 0) {
			@Pc(32) Class2_Sub2_Sub10 local32 = (Class2_Sub2_Sub10) this.aClass145_4.method3391();
			this.method3266(local32);
		}
		@Pc(51) Class2_Sub2_Sub10_Sub2 local51 = new Class2_Sub2_Sub10_Sub2(arg1, arg0, 1);
		this.aClass240_19.method5430(arg1.method1490(), local51);
		this.aClass145_4.method3387(local51);
		local51.aLong223 = 0L;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!kr;I)Ljava/lang/Object;")
	public Object method3272(@OriginalArg(0) Interface6 arg0) {
		@Pc(9) long local9 = arg0.method1490();
		for (@Pc(16) Class2_Sub2_Sub10 local16 = (Class2_Sub2_Sub10) this.aClass240_19.method5439(local9); local16 != null; local16 = (Class2_Sub2_Sub10) this.aClass240_19.method5434()) {
			if (local16.anInterface6_3.method1491(arg0)) {
				@Pc(34) Object local34 = local16.method5326();
				if (local34 != null) {
					if (local16.method5325()) {
						@Pc(73) Class2_Sub2_Sub10_Sub2 local73 = new Class2_Sub2_Sub10_Sub2(arg0, local34, local16.anInt6787);
						this.aClass240_19.method5430(local16.aLong227, local73);
						this.aClass145_4.method3387(local73);
						local73.aLong223 = 0L;
						local16.method6072();
						local16.method5934();
					} else {
						this.aClass145_4.method3387(local16);
						local16.aLong223 = 0L;
					}
					return local34;
				}
				local16.method6072();
				local16.method5934();
				this.anInt4071 += local16.anInt6787;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public void method3273() {
		this.aClass145_4.method3388();
		this.aClass240_19.method5433();
		this.anInt4071 = this.anInt4065;
	}
}
