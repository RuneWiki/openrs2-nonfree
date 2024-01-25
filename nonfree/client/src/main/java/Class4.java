import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class4 {

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!wf;")
	private final Class260 aClass260_1 = new Class260();

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	private final int anInt130;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	private int anInt132;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Lclient!wa;")
	private final Class257 aClass257_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	public Class4(@OriginalArg(0) int arg0) {
		this.anInt130 = arg0;
		this.anInt132 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass257_1 = new Class257(local16);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Object;ILclient!vs;I)V")
	private void method98(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface12 arg1) {
		if (this.anInt130 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method111(arg1);
		this.anInt132--;
		while (this.anInt132 < 0) {
			@Pc(40) Class1_Sub3_Sub1 local40 = (Class1_Sub3_Sub1) this.aClass260_1.method5550();
			this.method103(local40);
		}
		@Pc(62) Class1_Sub3_Sub1_Sub1 local62 = new Class1_Sub3_Sub1_Sub1(arg1, arg0, 1);
		this.aClass257_1.method5504(local62, arg1.method4955());
		this.aClass260_1.method5557(local62);
		local62.aLong216 = 0L;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I")
	public int method99() {
		return this.anInt130;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!fj;)V")
	private void method103(@OriginalArg(1) Class1_Sub3_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method5617();
			arg0.method5312();
			this.anInt132 += arg0.anInt5419;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public void method106() {
		this.aClass260_1.method5551();
		this.aClass257_1.method5499();
		this.anInt132 = this.anInt130;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V")
	public void method108() {
		if (Static280.aClass72_1 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub3_Sub1 local9 = (Class1_Sub3_Sub1) this.aClass260_1.method5553(); local9 != null; local9 = (Class1_Sub3_Sub1) this.aClass260_1.method5556()) {
			if (local9.method4230()) {
				if (local9.method4229() == null) {
					local9.method5617();
					local9.method5312();
					this.anInt132 += local9.anInt5419;
				}
			} else if ((long) 5 < ++local9.aLong216) {
				@Pc(54) Class1_Sub3_Sub1 local54 = Static280.aClass72_1.method5469(local9);
				this.aClass257_1.method5504(local54, local9.aLong226);
				Static289.method3777(local54, local9);
				local9.method5617();
				local9.method5312();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!vs;I)Ljava/lang/Object;")
	public Object method109(@OriginalArg(0) Interface12 arg0) {
		@Pc(14) long local14 = arg0.method4955();
		for (@Pc(21) Class1_Sub3_Sub1 local21 = (Class1_Sub3_Sub1) this.aClass257_1.method5503(local14); local21 != null; local21 = (Class1_Sub3_Sub1) this.aClass257_1.method5507()) {
			if (local21.anInterface12_3.method4954(arg0)) {
				@Pc(33) Object local33 = local21.method4229();
				if (local33 != null) {
					if (local21.method4230()) {
						@Pc(72) Class1_Sub3_Sub1_Sub1 local72 = new Class1_Sub3_Sub1_Sub1(arg0, local33, local21.anInt5419);
						this.aClass257_1.method5504(local72, local21.aLong226);
						this.aClass260_1.method5557(local72);
						local72.aLong216 = 0L;
						local21.method5617();
						local21.method5312();
					} else {
						this.aClass260_1.method5557(local21);
						local21.aLong216 = 0L;
					}
					return local33;
				}
				local21.method5617();
				local21.method5312();
				this.anInt132 += local21.anInt5419;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public void method110() {
		for (@Pc(11) Class1_Sub3_Sub1 local11 = (Class1_Sub3_Sub1) this.aClass260_1.method5553(); local11 != null; local11 = (Class1_Sub3_Sub1) this.aClass260_1.method5556()) {
			if (local11.method4230()) {
				local11.method5617();
				local11.method5312();
				this.anInt132 += local11.anInt5419;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!vs;)V")
	private void method111(@OriginalArg(1) Interface12 arg0) {
		@Pc(17) long local17 = arg0.method4955();
		for (@Pc(24) Class1_Sub3_Sub1 local24 = (Class1_Sub3_Sub1) this.aClass257_1.method5503(local17); local24 != null; local24 = (Class1_Sub3_Sub1) this.aClass257_1.method5507()) {
			if (local24.anInterface12_3.method4954(arg0)) {
				this.method103(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)I")
	public int method112() {
		return this.anInt132;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!vs;Ljava/lang/Object;I)V")
	public void method113(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Object arg1) {
		this.method98(arg1, arg0);
	}
}
