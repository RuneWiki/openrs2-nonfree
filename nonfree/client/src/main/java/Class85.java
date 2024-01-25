import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class85 {

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "Lclient!rh;")
	private final Class178 aClass178_3 = new Class178();

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	private int anInt2371;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	private final int anInt2375;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "Lclient!uc;")
	private final Class198 aClass198_14;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V")
	public Class85(@OriginalArg(0) int arg0) {
		this.anInt2371 = arg0;
		this.anInt2375 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass198_14 = new Class198(local14);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)I")
	public int method2009() {
		return this.anInt2375;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
	public void method2010() {
		this.aClass178_3.method4765();
		this.aClass198_14.method5260();
		this.anInt2371 = this.anInt2375;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!wa;Ljava/lang/Object;)V")
	public void method2011(@OriginalArg(1) Interface9 arg0, @OriginalArg(2) Object arg1) {
		this.method2015(arg0);
		if (this.anInt2371 == 0) {
			@Pc(21) Class4_Sub1_Sub3 local21 = (Class4_Sub1_Sub3) this.aClass178_3.method4772();
			local21.method5667();
			local21.method5555();
		} else {
			this.anInt2371--;
		}
		@Pc(41) Class4_Sub1_Sub3_Sub2 local41 = new Class4_Sub1_Sub3_Sub2(arg0, arg1);
		this.aClass198_14.method5267(arg0.method521(), local41);
		this.aClass178_3.method4767(local41);
		local41.aLong254 = 0L;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!wa;)Ljava/lang/Object;")
	public Object method2012(@OriginalArg(1) Interface9 arg0) {
		@Pc(9) long local9 = arg0.method521();
		for (@Pc(16) Class4_Sub1_Sub3 local16 = (Class4_Sub1_Sub3) this.aClass198_14.method5261(local9); local16 != null; local16 = (Class4_Sub1_Sub3) this.aClass198_14.method5265()) {
			if (local16.anInterface9_3.method520(arg0)) {
				@Pc(28) Object local28 = local16.method3144();
				if (local28 != null) {
					if (local16.method3143()) {
						@Pc(54) Class4_Sub1_Sub3_Sub2 local54 = new Class4_Sub1_Sub3_Sub2(arg0, local28);
						this.aClass198_14.method5267(local16.aLong259, local54);
						this.aClass178_3.method4767(local54);
						local54.aLong254 = 0L;
						local16.method5667();
						local16.method5555();
					} else {
						this.aClass178_3.method4767(local16);
						local16.aLong254 = 0L;
					}
					return local28;
				}
				local16.method5667();
				local16.method5555();
				this.anInt2371++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(B)V")
	public void method2013() {
		for (@Pc(13) Class4_Sub1_Sub3 local13 = (Class4_Sub1_Sub3) this.aClass178_3.method4773(); local13 != null; local13 = (Class4_Sub1_Sub3) this.aClass178_3.method4771()) {
			if (local13.method3143()) {
				local13.method5667();
				local13.method5555();
				this.anInt2371++;
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(ILclient!wa;)V")
	private void method2015(@OriginalArg(1) Interface9 arg0) {
		@Pc(9) long local9 = arg0.method521();
		for (@Pc(22) Class4_Sub1_Sub3 local22 = (Class4_Sub1_Sub3) this.aClass198_14.method5261(local9); local22 != null; local22 = (Class4_Sub1_Sub3) this.aClass198_14.method5265()) {
			if (local22.anInterface9_3.method520(arg0)) {
				local22.method5667();
				local22.method5555();
				this.anInt2371++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)V")
	public void method2017() {
		if (Static271.aClass185_1 == null) {
			return;
		}
		for (@Pc(11) Class4_Sub1_Sub3 local11 = (Class4_Sub1_Sub3) this.aClass178_3.method4773(); local11 != null; local11 = (Class4_Sub1_Sub3) this.aClass178_3.method4771()) {
			if (local11.method3143()) {
				if (local11.method3144() == null) {
					local11.method5667();
					local11.method5555();
					this.anInt2371++;
				}
			} else if ((long) 5 < ++local11.aLong254) {
				@Pc(37) Class4_Sub1_Sub3 local37 = Static271.aClass185_1.method4915(local11);
				this.aClass198_14.method5267(local11.aLong259, local37);
				Static158.method3052(local37, local11);
				local11.method5667();
				local11.method5555();
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)I")
	public int method2018() {
		return this.anInt2371;
	}
}
