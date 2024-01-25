import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class3 {

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "Lclient!je;")
	private final Class171 aClass171_1 = new Class171();

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
	private int anInt17;

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
	private final int anInt23;

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "Lclient!il;")
	private final Class162 aClass162_1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(I)V")
	public Class3(@OriginalArg(0) int arg0) {
		this.anInt17 = arg0;
		this.anInt23 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass162_1 = new Class162(local16);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BLclient!gj;)Ljava/lang/Object;")
	public Object method16(@OriginalArg(1) Interface8 arg0) {
		@Pc(9) long local9 = arg0.method5948();
		for (@Pc(24) Class2_Sub3_Sub1 local24 = (Class2_Sub3_Sub1) this.aClass162_1.method3519(local9); local24 != null; local24 = (Class2_Sub3_Sub1) this.aClass162_1.method3528()) {
			if (local24.anInterface8_3.method5947(arg0)) {
				@Pc(36) Object local36 = local24.method6757();
				if (local36 != null) {
					if (local24.method6758()) {
						@Pc(75) Class2_Sub3_Sub1_Sub1 local75 = new Class2_Sub3_Sub1_Sub1(arg0, local36, local24.anInt8160);
						this.aClass162_1.method3522(local75, local24.aLong268);
						this.aClass171_1.method3791(local75);
						local75.aLong260 = 0L;
						local24.method7966();
						local24.method7767();
					} else {
						this.aClass171_1.method3791(local24);
						local24.aLong260 = 0L;
					}
					return local36;
				}
				local24.method7966();
				local24.method7767();
				this.anInt17 += local24.anInt8160;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	public void method17() {
		for (@Pc(13) Class2_Sub3_Sub1 local13 = (Class2_Sub3_Sub1) this.aClass171_1.method3796(); local13 != null; local13 = (Class2_Sub3_Sub1) this.aClass171_1.method3786()) {
			if (local13.method6758()) {
				local13.method7966();
				local13.method7767();
				this.anInt17 += local13.anInt8160;
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!as;I)V")
	private void method18(@OriginalArg(0) Class2_Sub3_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method7966();
			arg0.method7767();
			this.anInt17 += arg0.anInt8160;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ljava/lang/Object;Lclient!gj;B)V")
	public void method19(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface8 arg1) {
		this.method20(arg1, arg0);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IBLclient!gj;Ljava/lang/Object;)V")
	private void method20(@OriginalArg(2) Interface8 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt23 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method22(arg0);
		this.anInt17--;
		while (this.anInt17 < 0) {
			@Pc(36) Class2_Sub3_Sub1 local36 = (Class2_Sub3_Sub1) this.aClass171_1.method3787();
			this.method18(local36);
		}
		@Pc(50) Class2_Sub3_Sub1_Sub1 local50 = new Class2_Sub3_Sub1_Sub1(arg0, arg1, 1);
		this.aClass162_1.method3522(local50, arg0.method5948());
		this.aClass171_1.method3791(local50);
		local50.aLong260 = 0L;
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)I")
	public int method21() {
		return this.anInt23;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZLclient!gj;)V")
	private void method22(@OriginalArg(1) Interface8 arg0) {
		@Pc(9) long local9 = arg0.method5948();
		for (@Pc(22) Class2_Sub3_Sub1 local22 = (Class2_Sub3_Sub1) this.aClass162_1.method3519(local9); local22 != null; local22 = (Class2_Sub3_Sub1) this.aClass162_1.method3528()) {
			if (local22.anInterface8_3.method5947(arg0)) {
				this.method18(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)V")
	public void method23() {
		if (Static83.aClass129_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub3_Sub1 local9 = (Class2_Sub3_Sub1) this.aClass171_1.method3796(); local9 != null; local9 = (Class2_Sub3_Sub1) this.aClass171_1.method3786()) {
			if (local9.method6758()) {
				if (local9.method6757() == null) {
					local9.method7966();
					local9.method7767();
					this.anInt17 += local9.anInt8160;
				}
			} else if ((long) 5 < ++local9.aLong260) {
				@Pc(52) Class2_Sub3_Sub1 local52 = Static83.aClass129_1.method3096(local9);
				this.aClass162_1.method3522(local52, local9.aLong268);
				Static505.method7025(local9, local52);
				local9.method7966();
				local9.method7767();
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)I")
	public int method24() {
		return this.anInt17;
	}

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(B)V")
	public void method25() {
		this.aClass171_1.method3790();
		this.aClass162_1.method3518();
		this.anInt17 = this.anInt23;
	}
}
