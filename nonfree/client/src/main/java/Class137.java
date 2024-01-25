import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class137 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!tk;")
	private final Class239 aClass239_6 = new Class239();

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	private int anInt3439;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	private final int anInt3442;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "Lclient!ek;")
	private final Class67 aClass67_22;

	static {
		new Class15("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
	public Class137(@OriginalArg(0) int arg0) {
		this.anInt3439 = arg0;
		this.anInt3442 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass67_22 = new Class67(local14);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method2732(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method2743(arg1, arg0);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(JI)V")
	private void method2733(@OriginalArg(0) long arg0) {
		@Pc(13) Class4_Sub2_Sub8 local13 = (Class4_Sub2_Sub8) this.aClass67_22.method1429(arg0);
		this.method2742(local13);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)I")
	public int method2734() {
		return this.anInt3442;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method2735() {
		@Pc(19) Class4_Sub2_Sub8 local19 = (Class4_Sub2_Sub8) this.aClass67_22.method1424();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method4596();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class4_Sub2_Sub8 local29 = local19;
			local19 = (Class4_Sub2_Sub8) this.aClass67_22.method1424();
			local29.method6059();
			local29.method5538();
			this.anInt3439 += local19.anInt5741;
		}
		return null;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)I")
	public int method2736() {
		@Pc(7) int local7 = 0;
		for (@Pc(22) Class4_Sub2_Sub8 local22 = (Class4_Sub2_Sub8) this.aClass239_6.method5125(); local22 != null; local22 = (Class4_Sub2_Sub8) this.aClass239_6.method5120()) {
			if (!local22.method4595()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	public void method2737() {
		for (@Pc(7) Class4_Sub2_Sub8 local7 = (Class4_Sub2_Sub8) this.aClass239_6.method5125(); local7 != null; local7 = (Class4_Sub2_Sub8) this.aClass239_6.method5120()) {
			if (local7.method4595()) {
				local7.method6059();
				local7.method5538();
				this.anInt3439 += local7.anInt5741;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method2738() {
		@Pc(19) Class4_Sub2_Sub8 local19 = (Class4_Sub2_Sub8) this.aClass67_22.method1428();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method4596();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class4_Sub2_Sub8 local31 = local19;
			local19 = (Class4_Sub2_Sub8) this.aClass67_22.method1424();
			local31.method6059();
			local31.method5538();
			this.anInt3439 += local19.anInt5741;
		}
		return null;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
	public void method2739() {
		this.aClass239_6.method5122();
		this.aClass67_22.method1431();
		this.anInt3439 = this.anInt3442;
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)I")
	public int method2741() {
		return this.anInt3439;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!cv;B)V")
	private void method2742(@OriginalArg(0) Class4_Sub2_Sub8 arg0) {
		if (arg0 != null) {
			arg0.method6059();
			arg0.method5538();
			this.anInt3439 += arg0.anInt5741;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/Object;IIJ)V")
	private void method2743(@OriginalArg(0) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt3442 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2733(arg1);
		this.anInt3439--;
		while (this.anInt3439 < 0) {
			@Pc(36) Class4_Sub2_Sub8 local36 = (Class4_Sub2_Sub8) this.aClass239_6.method5119();
			this.method2742(local36);
		}
		@Pc(49) Class4_Sub2_Sub8_Sub1 local49 = new Class4_Sub2_Sub8_Sub1(arg0, 1);
		this.aClass67_22.method1426(local49, arg1);
		this.aClass239_6.method5126(local49);
		local49.aLong208 = 0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method2744(@OriginalArg(1) long arg0) {
		@Pc(10) Class4_Sub2_Sub8 local10 = (Class4_Sub2_Sub8) this.aClass67_22.method1429(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method4596();
		if (local18 == null) {
			local10.method6059();
			local10.method5538();
			this.anInt3439 += local10.anInt5741;
			return null;
		}
		if (local10.method4595()) {
			@Pc(63) Class4_Sub2_Sub8_Sub1 local63 = new Class4_Sub2_Sub8_Sub1(local18, local10.anInt5741);
			this.aClass67_22.method1426(local63, local10.aLong227);
			this.aClass239_6.method5126(local63);
			local63.aLong208 = 0L;
			local10.method6059();
			local10.method5538();
		} else {
			this.aClass239_6.method5126(local10);
			local10.aLong208 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)V")
	public void method2745(@OriginalArg(1) int arg0) {
		if (Static44.aClass14_1 == null) {
			return;
		}
		for (@Pc(19) Class4_Sub2_Sub8 local19 = (Class4_Sub2_Sub8) this.aClass239_6.method5125(); local19 != null; local19 = (Class4_Sub2_Sub8) this.aClass239_6.method5120()) {
			if (local19.method4595()) {
				if (local19.method4596() == null) {
					local19.method6059();
					local19.method5538();
					this.anInt3439++;
				}
			} else if ((long) arg0 < ++local19.aLong208) {
				@Pc(63) Class4_Sub2_Sub8 local63 = Static44.aClass14_1.method176(local19);
				this.aClass67_22.method1426(local63, local19.aLong227);
				Static183.method2544(local19, local63);
				local19.method6059();
				local19.method5538();
			}
		}
	}
}
