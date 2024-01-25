import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class233 {

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "Lclient!jh;")
	private final Class175 aClass175_10;

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
	private final int anInt6719;

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "Lclient!mp;")
	private final Class222 aClass222_27;

	@OriginalMember(owner = "client!nga", name = "v", descriptor = "I")
	private int anInt6733;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I)V")
	public Class233(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(II)V")
	public Class233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass175_10 = new Class175();
		this.anInt6719 = arg0;
		this.anInt6733 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass222_27 = new Class222(local14);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)I")
	public int method5656() {
		return this.anInt6733;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)I")
	public int method5658() {
		return this.anInt6719;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public Object method5659() {
		@Pc(11) Class2_Sub5_Sub3 local11 = (Class2_Sub5_Sub3) this.aClass222_27.method5474();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5418();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class2_Sub5_Sub3 local23 = local11;
			local11 = (Class2_Sub5_Sub3) this.aClass222_27.method5472();
			local23.method8599();
			local23.method8464();
			this.anInt6733 += local23.anInt6428;
		}
		return null;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IILjava/lang/Object;J)V")
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) long arg2) {
		if (this.anInt6719 < arg0) {
			throw new IllegalStateException("s>cs");
		}
		this.method5661(arg2);
		this.anInt6733 -= arg0;
		while (this.anInt6733 < 0) {
			@Pc(35) Class2_Sub5_Sub3 local35 = (Class2_Sub5_Sub3) this.aClass175_10.method4284();
			this.method5668(local35);
		}
		@Pc(48) Class2_Sub5_Sub3_Sub1 local48 = new Class2_Sub5_Sub3_Sub1(arg1, arg0);
		this.aClass222_27.method5476(local48, arg2);
		this.aClass175_10.method4287(local48);
		local48.aLong283 = 0L;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(JZ)V")
	private void method5661(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub5_Sub3 local15 = (Class2_Sub5_Sub3) this.aClass222_27.method5468(arg0);
		this.method5668(local15);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZLjava/lang/Object;J)V")
	public void method5662(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method5660(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(Z)V")
	public void method5663() {
		this.aClass175_10.method4283();
		this.aClass222_27.method5469();
		this.anInt6733 = this.anInt6719;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IB)V")
	public void method5664(@OriginalArg(0) int arg0) {
		if (Static401.aClass178_1 == null) {
			return;
		}
		for (@Pc(7) Class2_Sub5_Sub3 local7 = (Class2_Sub5_Sub3) this.aClass175_10.method4280(); local7 != null; local7 = (Class2_Sub5_Sub3) this.aClass175_10.method4288()) {
			if (local7.method5417()) {
				if (local7.method5418() == null) {
					local7.method8599();
					local7.method8464();
					this.anInt6733 += local7.anInt6428;
				}
			} else if ((long) arg0 < ++local7.aLong283) {
				@Pc(50) Class2_Sub5_Sub3 local50 = Static401.aClass178_1.method6454(local7);
				this.aClass222_27.method5476(local50, local7.aLong287);
				Static3.method53(local7, local50);
				local7.method8599();
				local7.method8464();
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "(Z)V")
	public void method5665() {
		for (@Pc(9) Class2_Sub5_Sub3 local9 = (Class2_Sub5_Sub3) this.aClass175_10.method4280(); local9 != null; local9 = (Class2_Sub5_Sub3) this.aClass175_10.method4288()) {
			if (local9.method5417()) {
				local9.method8599();
				local9.method8464();
				this.anInt6733 += local9.anInt6428;
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method5666() {
		@Pc(11) Class2_Sub5_Sub3 local11 = (Class2_Sub5_Sub3) this.aClass222_27.method5472();
		while (local11 != null) {
			@Pc(16) Object local16 = local11.method5418();
			if (local16 != null) {
				return local16;
			}
			@Pc(22) Class2_Sub5_Sub3 local22 = local11;
			local11 = (Class2_Sub5_Sub3) this.aClass222_27.method5472();
			local22.method8599();
			local22.method8464();
			this.anInt6733 += local22.anInt6428;
		}
		return null;
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)I")
	public int method5667() {
		@Pc(5) int local5 = 0;
		for (@Pc(16) Class2_Sub5_Sub3 local16 = (Class2_Sub5_Sub3) this.aClass175_10.method4280(); local16 != null; local16 = (Class2_Sub5_Sub3) this.aClass175_10.method4288()) {
			if (!local16.method5417()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!of;I)V")
	private void method5668(@OriginalArg(0) Class2_Sub5_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method8599();
			arg0.method8464();
			this.anInt6733 += arg0.anInt6428;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method5669(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub5_Sub3 local15 = (Class2_Sub5_Sub3) this.aClass222_27.method5468(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(23) Object local23 = local15.method5418();
		if (local23 == null) {
			local15.method8599();
			local15.method8464();
			this.anInt6733 += local15.anInt6428;
			return null;
		}
		if (local15.method5417()) {
			@Pc(60) Class2_Sub5_Sub3_Sub1 local60 = new Class2_Sub5_Sub3_Sub1(local23, local15.anInt6428);
			this.aClass222_27.method5476(local60, local15.aLong287);
			this.aClass175_10.method4287(local60);
			local60.aLong283 = 0L;
			local15.method8599();
			local15.method8464();
		} else {
			this.aClass175_10.method4287(local15);
			local15.aLong283 = 0L;
		}
		return local23;
	}
}
