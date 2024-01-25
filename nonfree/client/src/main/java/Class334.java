import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class334 {

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "Lclient!gfa;")
	private final Class117 aClass117_11 = new Class117();

	@OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
	private final int anInt8903;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
	private int anInt8892;

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "Lclient!wh;")
	private final Class356 aClass356_41;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(I)V")
	public Class334(@OriginalArg(0) int arg0) {
		this.anInt8903 = arg0;
		this.anInt8892 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass356_41 = new Class356(local16);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public void method7338() {
		for (@Pc(11) Class1_Sub3_Sub9 local11 = (Class1_Sub3_Sub9) this.aClass117_11.method2549(); local11 != null; local11 = (Class1_Sub3_Sub9) this.aClass117_11.method2551()) {
			if (local11.method4596()) {
				local11.method7878();
				local11.method7811();
				this.anInt8892 += local11.anInt5382;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!dc;)Ljava/lang/Object;")
	public Object method7340(@OriginalArg(1) Interface3 arg0) {
		@Pc(14) long local14 = arg0.method6873();
		for (@Pc(21) Class1_Sub3_Sub9 local21 = (Class1_Sub3_Sub9) this.aClass356_41.method7796(local14); local21 != null; local21 = (Class1_Sub3_Sub9) this.aClass356_41.method7801()) {
			if (local21.anInterface3_3.method6872(arg0)) {
				@Pc(33) Object local33 = local21.method4597();
				if (local33 != null) {
					if (local21.method4596()) {
						@Pc(72) Class1_Sub3_Sub9_Sub1 local72 = new Class1_Sub3_Sub9_Sub1(arg0, local33, local21.anInt5382);
						this.aClass356_41.method7800(local21.aLong425, local72);
						this.aClass117_11.method2550(local72);
						local72.aLong420 = 0L;
						local21.method7878();
						local21.method7811();
					} else {
						this.aClass117_11.method2550(local21);
						local21.aLong420 = 0L;
					}
					return local33;
				}
				local21.method7878();
				local21.method7811();
				this.anInt8892 += local21.anInt5382;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/Object;Lclient!dc;B)V")
	public void method7341(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface3 arg1) {
		this.method7345(arg0, arg1);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)I")
	public int method7342() {
		return this.anInt8903;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!dc;B)V")
	private void method7343(@OriginalArg(0) Interface3 arg0) {
		@Pc(9) long local9 = arg0.method6873();
		for (@Pc(18) Class1_Sub3_Sub9 local18 = (Class1_Sub3_Sub9) this.aClass356_41.method7796(local9); local18 != null; local18 = (Class1_Sub3_Sub9) this.aClass356_41.method7801()) {
			if (local18.anInterface3_3.method6872(arg0)) {
				this.method7344(local18);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!wca;)V")
	private void method7344(@OriginalArg(1) Class1_Sub3_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method7878();
			arg0.method7811();
			this.anInt8892 += arg0.anInt5382;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/Object;ZILclient!dc;)V")
	private void method7345(@OriginalArg(0) Object arg0, @OriginalArg(3) Interface3 arg1) {
		if (this.anInt8903 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7343(arg1);
		this.anInt8892--;
		while (this.anInt8892 < 0) {
			@Pc(32) Class1_Sub3_Sub9 local32 = (Class1_Sub3_Sub9) this.aClass117_11.method2556();
			this.method7344(local32);
		}
		@Pc(51) Class1_Sub3_Sub9_Sub1 local51 = new Class1_Sub3_Sub9_Sub1(arg1, arg0, 1);
		this.aClass356_41.method7800(arg1.method6873(), local51);
		this.aClass117_11.method2550(local51);
		local51.aLong420 = 0L;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
	public void method7346() {
		if (Static496.aClass172_1 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub3_Sub9 local9 = (Class1_Sub3_Sub9) this.aClass117_11.method2549(); local9 != null; local9 = (Class1_Sub3_Sub9) this.aClass117_11.method2551()) {
			if (local9.method4596()) {
				if (local9.method4597() == null) {
					local9.method7878();
					local9.method7811();
					this.anInt8892 += local9.anInt5382;
				}
			} else if ((long) 5 < ++local9.aLong420) {
				@Pc(33) Class1_Sub3_Sub9 local33 = Static496.aClass172_1.method3994(local9);
				this.aClass356_41.method7800(local9.aLong425, local33);
				Static321.method4884(local9, local33);
				local9.method7878();
				local9.method7811();
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
	public void method7347() {
		this.aClass117_11.method2555();
		this.aClass356_41.method7802();
		this.anInt8892 = this.anInt8903;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)I")
	public int method7348() {
		return this.anInt8892;
	}
}
