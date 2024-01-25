import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class100 {

	@OriginalMember(owner = "client!faa", name = "o", descriptor = "Lclient!ak;")
	private final Class15 aClass15_5 = new Class15();

	@OriginalMember(owner = "client!faa", name = "s", descriptor = "I")
	private int anInt2885;

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
	private final int anInt2877;

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "Lclient!qp;")
	private final Class280 aClass280_12;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(I)V")
	public Class100(@OriginalArg(0) int arg0) {
		this.anInt2885 = arg0;
		this.anInt2877 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass280_12 = new Class280(local16);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!qd;)V")
	private void method2648(@OriginalArg(1) Class3_Sub4_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method8769();
			arg0.method8732();
			this.anInt2885 += arg0.anInt4355;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	public void method2649() {
		this.aClass15_5.method903();
		this.aClass280_12.method7100();
		this.anInt2885 = this.anInt2877;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ut;Ljava/lang/Object;IZ)V")
	private void method2650(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt2877 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2653(arg0);
		this.anInt2885--;
		while (this.anInt2885 < 0) {
			@Pc(39) Class3_Sub4_Sub6 local39 = (Class3_Sub4_Sub6) this.aClass15_5.method902();
			this.method2648(local39);
		}
		@Pc(56) Class3_Sub4_Sub6_Sub2 local56 = new Class3_Sub4_Sub6_Sub2(arg0, arg1, 1);
		this.aClass280_12.method7109(local56, arg0.method1656());
		this.aClass15_5.method901(local56);
		local56.aLong274 = 0L;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ut;I)V")
	private void method2653(@OriginalArg(0) Interface26 arg0) {
		@Pc(9) long local9 = arg0.method1656();
		for (@Pc(22) Class3_Sub4_Sub6 local22 = (Class3_Sub4_Sub6) this.aClass280_12.method7107(local9); local22 != null; local22 = (Class3_Sub4_Sub6) this.aClass280_12.method7105()) {
			if (local22.anInterface26_3.method1657(arg0)) {
				this.method2648(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	public void method2654() {
		for (@Pc(11) Class3_Sub4_Sub6 local11 = (Class3_Sub4_Sub6) this.aClass15_5.method897(); local11 != null; local11 = (Class3_Sub4_Sub6) this.aClass15_5.method898()) {
			if (local11.method3848()) {
				local11.method8769();
				local11.method8732();
				this.anInt2885 += local11.anInt4355;
			}
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IB)V")
	public void method2655() {
		if (Static500.aClass44_1 == null) {
			return;
		}
		for (@Pc(18) Class3_Sub4_Sub6 local18 = (Class3_Sub4_Sub6) this.aClass15_5.method897(); local18 != null; local18 = (Class3_Sub4_Sub6) this.aClass15_5.method898()) {
			if (local18.method3848()) {
				if (local18.method3849() == null) {
					local18.method8769();
					local18.method8732();
					this.anInt2885 += local18.anInt4355;
				}
			} else if (++local18.aLong274 > (long) 5) {
				@Pc(63) Class3_Sub4_Sub6 local63 = Static500.aClass44_1.method8532(local18);
				this.aClass280_12.method7109(local63, local18.aLong276);
				Static544.method7944(local63, local18);
				local18.method8769();
				local18.method8732();
			}
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ut;B)Ljava/lang/Object;")
	public Object method2657(@OriginalArg(0) Interface26 arg0) {
		@Pc(9) long local9 = arg0.method1656();
		for (@Pc(16) Class3_Sub4_Sub6 local16 = (Class3_Sub4_Sub6) this.aClass280_12.method7107(local9); local16 != null; local16 = (Class3_Sub4_Sub6) this.aClass280_12.method7105()) {
			if (local16.anInterface26_3.method1657(arg0)) {
				@Pc(30) Object local30 = local16.method3849();
				if (local30 != null) {
					if (local16.method3848()) {
						@Pc(71) Class3_Sub4_Sub6_Sub2 local71 = new Class3_Sub4_Sub6_Sub2(arg0, local30, local16.anInt4355);
						this.aClass280_12.method7109(local71, local16.aLong276);
						this.aClass15_5.method901(local71);
						local71.aLong274 = 0L;
						local16.method8769();
						local16.method8732();
					} else {
						this.aClass15_5.method901(local16);
						local16.aLong274 = 0L;
					}
					return local30;
				}
				local16.method8769();
				local16.method8732();
				this.anInt2885 += local16.anInt4355;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)I")
	public int method2659() {
		return this.anInt2885;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ut;Ljava/lang/Object;I)V")
	public void method2660(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) Object arg1) {
		this.method2650(arg0, arg1);
	}

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)I")
	public int method2661() {
		return this.anInt2877;
	}
}
