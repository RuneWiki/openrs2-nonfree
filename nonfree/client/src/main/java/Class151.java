import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class151 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!uq;")
	private final Class247 aClass247_3 = new Class247();

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	private int anInt3914;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	private final int anInt3907;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!cv;")
	private final Class51 aClass51_13;

	static {
		new Class96("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V")
	public Class151(@OriginalArg(0) int arg0) {
		this.anInt3914 = arg0;
		this.anInt3907 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass51_13 = new Class51(local14);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
	public int method3284() {
		return this.anInt3914;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(JI)V")
	private void method3285(@OriginalArg(0) long arg0) {
		@Pc(14) Class1_Sub1_Sub4 local14 = (Class1_Sub1_Sub4) this.aClass51_13.method930(arg0);
		this.method3292(local14);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3286() {
		@Pc(17) Class1_Sub1_Sub4 local17 = (Class1_Sub1_Sub4) this.aClass51_13.method926();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method1756();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class1_Sub1_Sub4 local29 = local17;
			local17 = (Class1_Sub1_Sub4) this.aClass51_13.method926();
			local29.method5965();
			local29.method5893();
			this.anInt3914 += local17.anInt2155;
		}
		return null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBLjava/lang/Object;J)V")
	private void method3287(@OriginalArg(2) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt3907 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3285(arg1);
		this.anInt3914--;
		while (this.anInt3914 < 0) {
			@Pc(41) Class1_Sub1_Sub4 local41 = (Class1_Sub1_Sub4) this.aClass247_3.method5585();
			this.method3292(local41);
		}
		@Pc(54) Class1_Sub1_Sub4_Sub2 local54 = new Class1_Sub1_Sub4_Sub2(arg0, 1);
		this.aClass51_13.method931(local54, arg1);
		this.aClass247_3.method5590(local54);
		local54.aLong231 = 0L;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method3288(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub1_Sub4 local10 = (Class1_Sub1_Sub4) this.aClass51_13.method930(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method1756();
		if (local18 == null) {
			local10.method5965();
			local10.method5893();
			this.anInt3914 += local10.anInt2155;
			return null;
		}
		if (local10.method1758()) {
			@Pc(55) Class1_Sub1_Sub4_Sub2 local55 = new Class1_Sub1_Sub4_Sub2(local18, local10.anInt2155);
			this.aClass51_13.method931(local55, local10.aLong237);
			this.aClass247_3.method5590(local55);
			local55.aLong231 = 0L;
			local10.method5965();
			local10.method5893();
		} else {
			this.aClass247_3.method5590(local10);
			local10.aLong231 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method3291(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method3287(arg1, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!cg;)V")
	private void method3292(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method5965();
			arg0.method5893();
			this.anInt3914 += arg0.anInt2155;
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)I")
	public int method3293() {
		return this.anInt3907;
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)I")
	public int method3294() {
		@Pc(7) int local7 = 0;
		for (@Pc(20) Class1_Sub1_Sub4 local20 = (Class1_Sub1_Sub4) this.aClass247_3.method5591(); local20 != null; local20 = (Class1_Sub1_Sub4) this.aClass247_3.method5587()) {
			if (!local20.method1758()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public Object method3295() {
		@Pc(11) Class1_Sub1_Sub4 local11 = (Class1_Sub1_Sub4) this.aClass51_13.method928();
		while (local11 != null) {
			@Pc(25) Object local25 = local11.method1756();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class1_Sub1_Sub4 local31 = local11;
			local11 = (Class1_Sub1_Sub4) this.aClass51_13.method926();
			local31.method5965();
			local31.method5893();
			this.anInt3914 += local11.anInt2155;
		}
		return null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public void method3297(@OriginalArg(0) int arg0) {
		if (Static145.aClass100_1 == null) {
			return;
		}
		for (@Pc(21) Class1_Sub1_Sub4 local21 = (Class1_Sub1_Sub4) this.aClass247_3.method5591(); local21 != null; local21 = (Class1_Sub1_Sub4) this.aClass247_3.method5587()) {
			if (local21.method1758()) {
				if (local21.method1756() == null) {
					local21.method5965();
					local21.method5893();
					this.anInt3914++;
				}
			} else if (++local21.aLong231 > (long) arg0) {
				@Pc(65) Class1_Sub1_Sub4 local65 = Static145.aClass100_1.method1954(local21);
				this.aClass51_13.method931(local65, local21.aLong237);
				Static344.method4956(local65, local21);
				local21.method5965();
				local21.method5893();
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
	public void method3298() {
		this.aClass247_3.method5586();
		this.aClass51_13.method921();
		this.anInt3914 = this.anInt3907;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	public void method3299() {
		for (@Pc(13) Class1_Sub1_Sub4 local13 = (Class1_Sub1_Sub4) this.aClass247_3.method5591(); local13 != null; local13 = (Class1_Sub1_Sub4) this.aClass247_3.method5587()) {
			if (local13.method1758()) {
				local13.method5965();
				local13.method5893();
				this.anInt3914 += local13.anInt2155;
			}
		}
	}
}
