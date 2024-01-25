import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class178 {

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "Lclient!mt;")
	private final Class162 aClass162_9 = new Class162();

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	private int anInt4588;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	private final int anInt4580;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "Lclient!cp;")
	private final Class44 aClass44_27;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(I)V")
	public Class178(@OriginalArg(0) int arg0) {
		this.anInt4588 = arg0;
		this.anInt4580 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass44_27 = new Class44(local16);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)I")
	public int method4130() {
		return this.anInt4580;
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public void method4131() {
		this.aClass162_9.method3733();
		this.aClass44_27.method952();
		this.anInt4588 = this.anInt4580;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZILjava/lang/Object;Lclient!wt;)V")
	private void method4133(@OriginalArg(2) Object arg0, @OriginalArg(3) Interface11 arg1) {
		if (this.anInt4580 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4143(arg1);
		this.anInt4588--;
		while (this.anInt4588 < 0) {
			@Pc(32) Class3_Sub7_Sub3 local32 = (Class3_Sub7_Sub3) this.aClass162_9.method3735();
			this.method4135(local32);
		}
		@Pc(49) Class3_Sub7_Sub3_Sub1 local49 = new Class3_Sub7_Sub3_Sub1(arg1, arg0, 1);
		this.aClass44_27.method948(arg1.method1546(), local49);
		this.aClass162_9.method3729(local49);
		local49.aLong231 = 0L;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!jm;)V")
	private void method4135(@OriginalArg(1) Class3_Sub7_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method5700();
			arg0.method5673();
			this.anInt4588 += arg0.anInt3654;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
	public void method4136() {
		if (Static15.aClass200_1 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub7_Sub3 local13 = (Class3_Sub7_Sub3) this.aClass162_9.method3734(); local13 != null; local13 = (Class3_Sub7_Sub3) this.aClass162_9.method3730()) {
			if (local13.method3208()) {
				if (local13.method3205() == null) {
					local13.method5700();
					local13.method5673();
					this.anInt4588 += local13.anInt3654;
				}
			} else if (++local13.aLong231 > (long) 5) {
				@Pc(54) Class3_Sub7_Sub3 local54 = Static15.aClass200_1.method4839(local13);
				this.aClass44_27.method948(local13.aLong240, local54);
				Static201.method3138(local13, local54);
				local13.method5700();
				local13.method5673();
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public void method4137() {
		for (@Pc(7) Class3_Sub7_Sub3 local7 = (Class3_Sub7_Sub3) this.aClass162_9.method3734(); local7 != null; local7 = (Class3_Sub7_Sub3) this.aClass162_9.method3730()) {
			if (local7.method3208()) {
				local7.method5700();
				local7.method5673();
				this.anInt4588 += local7.anInt3654;
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!wt;)Ljava/lang/Object;")
	public Object method4139(@OriginalArg(1) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method1546();
		for (@Pc(16) Class3_Sub7_Sub3 local16 = (Class3_Sub7_Sub3) this.aClass44_27.method942(local9); local16 != null; local16 = (Class3_Sub7_Sub3) this.aClass44_27.method946()) {
			if (local16.anInterface11_3.method1547(arg0)) {
				@Pc(33) Object local33 = local16.method3205();
				if (local33 != null) {
					if (local16.method3208()) {
						@Pc(62) Class3_Sub7_Sub3_Sub1 local62 = new Class3_Sub7_Sub3_Sub1(arg0, local33, local16.anInt3654);
						this.aClass44_27.method948(local16.aLong240, local62);
						this.aClass162_9.method3729(local62);
						local62.aLong231 = 0L;
						local16.method5700();
						local16.method5673();
					} else {
						this.aClass162_9.method3729(local16);
						local16.aLong231 = 0L;
					}
					return local33;
				}
				local16.method5700();
				local16.method5673();
				this.anInt4588 += local16.anInt3654;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/lang/Object;Lclient!wt;)V")
	public void method4141(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface11 arg1) {
		this.method4133(arg0, arg1);
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)I")
	public int method4142() {
		return this.anInt4588;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLclient!wt;)V")
	private void method4143(@OriginalArg(1) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method1546();
		for (@Pc(16) Class3_Sub7_Sub3 local16 = (Class3_Sub7_Sub3) this.aClass44_27.method942(local9); local16 != null; local16 = (Class3_Sub7_Sub3) this.aClass44_27.method946()) {
			if (local16.anInterface11_3.method1547(arg0)) {
				this.method4135(local16);
				break;
			}
		}
	}
}
