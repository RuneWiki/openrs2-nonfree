import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class122 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!ifa;")
	private final Class144 aClass144_6 = new Class144();

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
	private final int anInt3016;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
	private int anInt3007;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "Lclient!nj;")
	private final Class212 aClass212_11;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(I)V")
	public Class122(@OriginalArg(0) int arg0) {
		this.anInt3016 = arg0;
		this.anInt3007 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass212_11 = new Class212(local16);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!rl;BLjava/lang/Object;)V")
	private void method2586(@OriginalArg(1) Interface18 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt3016 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2590(arg0);
		this.anInt3007--;
		while (this.anInt3007 < 0) {
			@Pc(40) Class6_Sub1_Sub1 local40 = (Class6_Sub1_Sub1) this.aClass144_6.method3115();
			this.method2587(local40);
		}
		@Pc(57) Class6_Sub1_Sub1_Sub2 local57 = new Class6_Sub1_Sub1_Sub2(arg0, arg1, 1);
		this.aClass212_11.method5104(arg0.method1962(), local57);
		this.aClass144_6.method3114(local57);
		local57.aLong250 = 0L;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!lfa;)V")
	private void method2587(@OriginalArg(1) Class6_Sub1_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method7849();
			arg0.method7852();
			this.anInt3007 += arg0.anInt3433;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I")
	public int method2589() {
		return this.anInt3016;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!rl;I)V")
	private void method2590(@OriginalArg(0) Interface18 arg0) {
		@Pc(9) long local9 = arg0.method1962();
		for (@Pc(16) Class6_Sub1_Sub1 local16 = (Class6_Sub1_Sub1) this.aClass212_11.method5106(local9); local16 != null; local16 = (Class6_Sub1_Sub1) this.aClass212_11.method5107()) {
			if (local16.anInterface18_3.method1963(arg0)) {
				this.method2587(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)I")
	public int method2591() {
		return this.anInt3007;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public void method2592() {
		this.aClass144_6.method3112();
		this.aClass212_11.method5110();
		this.anInt3007 = this.anInt3016;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!rl;)Ljava/lang/Object;")
	public Object method2593(@OriginalArg(1) Interface18 arg0) {
		@Pc(9) long local9 = arg0.method1962();
		for (@Pc(16) Class6_Sub1_Sub1 local16 = (Class6_Sub1_Sub1) this.aClass212_11.method5106(local9); local16 != null; local16 = (Class6_Sub1_Sub1) this.aClass212_11.method5107()) {
			if (local16.anInterface18_3.method1963(arg0)) {
				@Pc(33) Object local33 = local16.method2975();
				if (local33 != null) {
					if (local16.method2976()) {
						@Pc(64) Class6_Sub1_Sub1_Sub2 local64 = new Class6_Sub1_Sub1_Sub2(arg0, local33, local16.anInt3433);
						this.aClass212_11.method5104(local16.aLong249, local64);
						this.aClass144_6.method3114(local64);
						local64.aLong250 = 0L;
						local16.method7849();
						local16.method7852();
					} else {
						this.aClass144_6.method3114(local16);
						local16.aLong250 = 0L;
					}
					return local33;
				}
				local16.method7849();
				local16.method7852();
				this.anInt3007 += local16.anInt3433;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/Object;ILclient!rl;)V")
	public void method2594(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface18 arg1) {
		this.method2586(arg1, arg0);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V")
	public void method2595() {
		for (@Pc(7) Class6_Sub1_Sub1 local7 = (Class6_Sub1_Sub1) this.aClass144_6.method3116(); local7 != null; local7 = (Class6_Sub1_Sub1) this.aClass144_6.method3113()) {
			if (local7.method2976()) {
				local7.method7849();
				local7.method7852();
				this.anInt3007 += local7.anInt3433;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public void method2597() {
		if (Static248.aClass211_1 == null) {
			return;
		}
		for (@Pc(13) Class6_Sub1_Sub1 local13 = (Class6_Sub1_Sub1) this.aClass144_6.method3116(); local13 != null; local13 = (Class6_Sub1_Sub1) this.aClass144_6.method3113()) {
			if (local13.method2976()) {
				if (local13.method2975() == null) {
					local13.method7849();
					local13.method7852();
					this.anInt3007 += local13.anInt3433;
				}
			} else if (++local13.aLong250 > (long) 5) {
				@Pc(56) Class6_Sub1_Sub1 local56 = Static248.aClass211_1.method5081(local13);
				this.aClass212_11.method5104(local13.aLong249, local56);
				Static491.method6777(local13, local56);
				local13.method7849();
				local13.method7852();
			}
		}
	}
}
