import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class110 {

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "Lclient!bg;")
	private final Class24 aClass24_3 = new Class24();

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
	private int anInt2945;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
	private final int anInt2942;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!mt;")
	private final Class164 aClass164_20;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I)V")
	public Class110(@OriginalArg(0) int arg0) {
		this.anInt2945 = arg0;
		this.anInt2942 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass164_20 = new Class164(local16);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!rb;)Ljava/lang/Object;")
	public Object method2359(@OriginalArg(1) Interface12 arg0) {
		@Pc(16) long local16 = arg0.method5798();
		for (@Pc(23) Class7_Sub4_Sub4 local23 = (Class7_Sub4_Sub4) this.aClass164_20.method3512(local16); local23 != null; local23 = (Class7_Sub4_Sub4) this.aClass164_20.method3510()) {
			if (local23.anInterface12_3.method5797(arg0)) {
				@Pc(35) Object local35 = local23.method2643();
				if (local35 != null) {
					if (local23.method2644()) {
						@Pc(74) Class7_Sub4_Sub4_Sub1 local74 = new Class7_Sub4_Sub4_Sub1(arg0, local35, local23.anInt3264);
						this.aClass164_20.method3508(local23.aLong230, local74);
						this.aClass24_3.method298(local74);
						local74.aLong225 = 0L;
						local23.method5802();
						local23.method5661();
					} else {
						this.aClass24_3.method298(local23);
						local23.aLong225 = 0L;
					}
					return local35;
				}
				local23.method5802();
				local23.method5661();
				this.anInt2945 += local23.anInt3264;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
	public void method2360() {
		if (Static372.aClass131_1 == null) {
			return;
		}
		for (@Pc(13) Class7_Sub4_Sub4 local13 = (Class7_Sub4_Sub4) this.aClass24_3.method303(); local13 != null; local13 = (Class7_Sub4_Sub4) this.aClass24_3.method301()) {
			if (local13.method2644()) {
				if (local13.method2643() == null) {
					local13.method5802();
					local13.method5661();
					this.anInt2945 += local13.anInt3264;
				}
			} else if ((long) 5 < ++local13.aLong225) {
				@Pc(56) Class7_Sub4_Sub4 local56 = Static372.aClass131_1.method2953(local13);
				this.aClass164_20.method3508(local13.aLong230, local56);
				Static340.method4425(local56, local13);
				local13.method5802();
				local13.method5661();
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!rb;ILjava/lang/Object;)V")
	private void method2361(@OriginalArg(1) Interface12 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt2942 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2362(arg0);
		this.anInt2945--;
		while (this.anInt2945 < 0) {
			@Pc(42) Class7_Sub4_Sub4 local42 = (Class7_Sub4_Sub4) this.aClass24_3.method308();
			this.method2368(local42);
		}
		@Pc(59) Class7_Sub4_Sub4_Sub1 local59 = new Class7_Sub4_Sub4_Sub1(arg0, arg1, 1);
		this.aClass164_20.method3508(arg0.method5798(), local59);
		this.aClass24_3.method298(local59);
		local59.aLong225 = 0L;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLclient!rb;)V")
	private void method2362(@OriginalArg(1) Interface12 arg0) {
		@Pc(9) long local9 = arg0.method5798();
		for (@Pc(23) Class7_Sub4_Sub4 local23 = (Class7_Sub4_Sub4) this.aClass164_20.method3512(local9); local23 != null; local23 = (Class7_Sub4_Sub4) this.aClass164_20.method3510()) {
			if (local23.anInterface12_3.method5797(arg0)) {
				this.method2368(local23);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
	public void method2363() {
		this.aClass24_3.method299();
		this.aClass164_20.method3509();
		this.anInt2945 = this.anInt2942;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/Object;Lclient!rb;B)V")
	public void method2365(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface12 arg1) {
		this.method2361(arg1, arg0);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)I")
	public int method2366() {
		return this.anInt2942;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!cm;)V")
	private void method2368(@OriginalArg(1) Class7_Sub4_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method5802();
			arg0.method5661();
			this.anInt2945 += arg0.anInt3264;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public void method2369() {
		for (@Pc(11) Class7_Sub4_Sub4 local11 = (Class7_Sub4_Sub4) this.aClass24_3.method303(); local11 != null; local11 = (Class7_Sub4_Sub4) this.aClass24_3.method301()) {
			if (local11.method2644()) {
				local11.method5802();
				local11.method5661();
				this.anInt2945 += local11.anInt3264;
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)I")
	public int method2370() {
		return this.anInt2945;
	}
}
