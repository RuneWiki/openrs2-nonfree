import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class36 {

	@OriginalMember(owner = "client!co", name = "o", descriptor = "Lclient!jh;")
	private final Class123 aClass123_3 = new Class123();

	@OriginalMember(owner = "client!co", name = "n", descriptor = "I")
	private final int anInt1105;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "I")
	private int anInt1095;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!vg;")
	private final Class252 aClass252_5;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V")
	public Class36(@OriginalArg(0) int arg0) {
		this.anInt1105 = arg0;
		this.anInt1095 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass252_5 = new Class252(local16);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!bg;I)V")
	private void method938(@OriginalArg(0) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method5433();
		for (@Pc(16) Class5_Sub2_Sub10 local16 = (Class5_Sub2_Sub10) this.aClass252_5.method5659(local9); local16 != null; local16 = (Class5_Sub2_Sub10) this.aClass252_5.method5667()) {
			if (local16.anInterface1_3.method5432(arg0)) {
				this.method946(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V")
	public void method940() {
		for (@Pc(9) Class5_Sub2_Sub10 local9 = (Class5_Sub2_Sub10) this.aClass123_3.method2616(); local9 != null; local9 = (Class5_Sub2_Sub10) this.aClass123_3.method2618()) {
			if (local9.method4853()) {
				local9.method6003();
				local9.method6006();
				this.anInt1095 += local9.anInt6065;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!bg;ILjava/lang/Object;I)V")
	private void method941(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt1105 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method938(arg0);
		this.anInt1095--;
		while (this.anInt1095 < 0) {
			@Pc(36) Class5_Sub2_Sub10 local36 = (Class5_Sub2_Sub10) this.aClass123_3.method2619();
			this.method946(local36);
		}
		@Pc(61) Class5_Sub2_Sub10_Sub1 local61 = new Class5_Sub2_Sub10_Sub1(arg0, arg1, 1);
		this.aClass252_5.method5658(local61, arg0.method5433());
		this.aClass123_3.method2620(local61);
		local61.aLong235 = 0L;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	public void method942() {
		if (Static204.aClass213_1 == null) {
			return;
		}
		for (@Pc(13) Class5_Sub2_Sub10 local13 = (Class5_Sub2_Sub10) this.aClass123_3.method2616(); local13 != null; local13 = (Class5_Sub2_Sub10) this.aClass123_3.method2618()) {
			if (local13.method4853()) {
				if (local13.method4847() == null) {
					local13.method6003();
					local13.method6006();
					this.anInt1095 += local13.anInt6065;
				}
			} else if ((long) 5 < ++local13.aLong235) {
				@Pc(58) Class5_Sub2_Sub10 local58 = Static204.aClass213_1.method4664(local13);
				this.aClass252_5.method5658(local58, local13.aLong234);
				Static397.method5159(local13, local58);
				local13.method6003();
				local13.method6006();
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I")
	public int method943() {
		return this.anInt1095;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)I")
	public int method944() {
		return this.anInt1105;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
	public void method945() {
		this.aClass123_3.method2622();
		this.aClass252_5.method5661();
		this.anInt1095 = this.anInt1105;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!lk;)V")
	private void method946(@OriginalArg(1) Class5_Sub2_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method6003();
			arg0.method6006();
			this.anInt1095 += arg0.anInt6065;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!bg;B)Ljava/lang/Object;")
	public Object method947(@OriginalArg(0) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method5433();
		for (@Pc(16) Class5_Sub2_Sub10 local16 = (Class5_Sub2_Sub10) this.aClass252_5.method5659(local9); local16 != null; local16 = (Class5_Sub2_Sub10) this.aClass252_5.method5667()) {
			if (local16.anInterface1_3.method5432(arg0)) {
				@Pc(28) Object local28 = local16.method4847();
				if (local28 != null) {
					if (local16.method4853()) {
						@Pc(57) Class5_Sub2_Sub10_Sub1 local57 = new Class5_Sub2_Sub10_Sub1(arg0, local28, local16.anInt6065);
						this.aClass252_5.method5658(local57, local16.aLong234);
						this.aClass123_3.method2620(local57);
						local57.aLong235 = 0L;
						local16.method6003();
						local16.method6006();
					} else {
						this.aClass123_3.method2620(local16);
						local16.aLong235 = 0L;
					}
					return local28;
				}
				local16.method6003();
				local16.method6006();
				this.anInt1095 += local16.anInt6065;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILjava/lang/Object;Lclient!bg;)V")
	public void method948(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface1 arg1) {
		this.method941(arg1, arg0);
	}
}
