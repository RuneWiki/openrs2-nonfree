import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class167 {

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Lclient!wf;")
	private final Class260 aClass260_8 = new Class260();

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	private int anInt4213;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	private final int anInt4215;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!wa;")
	private final Class257 aClass257_17;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
	public Class167(@OriginalArg(0) int arg0) {
		this.anInt4213 = arg0;
		this.anInt4215 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass257_17 = new Class257(local14);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public void method3384(@OriginalArg(1) int arg0) {
		if (Static336.aClass60_1 == null) {
			return;
		}
		for (@Pc(18) Class1_Sub3_Sub7 local18 = (Class1_Sub3_Sub7) this.aClass260_8.method5553(); local18 != null; local18 = (Class1_Sub3_Sub7) this.aClass260_8.method5556()) {
			if (local18.method2916()) {
				if (local18.method2918() == null) {
					local18.method5617();
					local18.method5312();
					this.anInt4213++;
				}
			} else if (++local18.aLong216 > (long) arg0) {
				@Pc(40) Class1_Sub3_Sub7 local40 = Static336.aClass60_1.method1271(local18);
				this.aClass257_17.method5504(local40, local18.aLong226);
				Static289.method3777(local40, local18);
				local18.method5617();
				local18.method5312();
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method3386(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub3_Sub7 local10 = (Class1_Sub3_Sub7) this.aClass257_17.method5503(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method2918();
		if (local18 == null) {
			local10.method5617();
			local10.method5312();
			this.anInt4213 += local10.anInt3547;
			return null;
		}
		if (local10.method2916()) {
			@Pc(50) Class1_Sub3_Sub7_Sub1 local50 = new Class1_Sub3_Sub7_Sub1(local18, local10.anInt3547);
			this.aClass257_17.method5504(local50, local10.aLong226);
			this.aClass260_8.method5557(local50);
			local50.aLong216 = 0L;
			local10.method5617();
			local10.method5312();
		} else {
			this.aClass260_8.method5557(local10);
			local10.aLong216 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method3388() {
		@Pc(16) Class1_Sub3_Sub7 local16 = (Class1_Sub3_Sub7) this.aClass257_17.method5501();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method2918();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class1_Sub3_Sub7 local26 = local16;
			local16 = (Class1_Sub3_Sub7) this.aClass257_17.method5501();
			local26.method5617();
			local26.method5312();
			this.anInt4213 += local16.anInt3547;
		}
		return null;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public void method3389() {
		for (@Pc(15) Class1_Sub3_Sub7 local15 = (Class1_Sub3_Sub7) this.aClass260_8.method5553(); local15 != null; local15 = (Class1_Sub3_Sub7) this.aClass260_8.method5556()) {
			if (local15.method2916()) {
				local15.method5617();
				local15.method5312();
				this.anInt4213 += local15.anInt3547;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
	public void method3390() {
		this.aClass260_8.method5551();
		this.aClass257_17.method5499();
		this.anInt4213 = this.anInt4215;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(JI)V")
	private void method3391(@OriginalArg(0) long arg0) {
		@Pc(18) Class1_Sub3_Sub7 local18 = (Class1_Sub3_Sub7) this.aClass257_17.method5503(arg0);
		this.method3394(local18);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/Object;BJ)V")
	public void method3392(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method3399(arg1, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)I")
	public int method3393() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class1_Sub3_Sub7 local18 = (Class1_Sub3_Sub7) this.aClass260_8.method5553(); local18 != null; local18 = (Class1_Sub3_Sub7) this.aClass260_8.method5556()) {
			if (!local18.method2916()) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!gm;)V")
	private void method3394(@OriginalArg(1) Class1_Sub3_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method5617();
			arg0.method5312();
			this.anInt4213 += arg0.anInt3547;
		}
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method3395() {
		@Pc(19) Class1_Sub3_Sub7 local19 = (Class1_Sub3_Sub7) this.aClass257_17.method5506();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method2918();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class1_Sub3_Sub7 local31 = local19;
			local19 = (Class1_Sub3_Sub7) this.aClass257_17.method5501();
			local31.method5617();
			local31.method5312();
			this.anInt4213 += local19.anInt3547;
		}
		return null;
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)I")
	public int method3396() {
		return this.anInt4213;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)I")
	public int method3397() {
		return this.anInt4215;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IJILjava/lang/Object;)V")
	private void method3399(@OriginalArg(1) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt4215 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3391(arg0);
		this.anInt4213--;
		while (this.anInt4213 < 0) {
			@Pc(36) Class1_Sub3_Sub7 local36 = (Class1_Sub3_Sub7) this.aClass260_8.method5550();
			this.method3394(local36);
		}
		@Pc(49) Class1_Sub3_Sub7_Sub1 local49 = new Class1_Sub3_Sub7_Sub1(arg1, 1);
		this.aClass257_17.method5504(local49, arg0);
		this.aClass260_8.method5557(local49);
		local49.aLong216 = 0L;
	}
}
