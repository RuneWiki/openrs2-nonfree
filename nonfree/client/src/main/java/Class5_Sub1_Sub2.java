import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mda", name = "o", descriptor = "Lclient!tg;")
	private final Class330 aClass330_26 = new Class330();

	@OriginalMember(owner = "client!mda", name = "p", descriptor = "Lclient!tg;")
	private final Class330 aClass330_27 = new Class330();

	@OriginalMember(owner = "client!mda", name = "r", descriptor = "I")
	private int anInt5694 = 0;

	@OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
	private int anInt5693 = -1;

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "([III)V")
	private void method5048(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub1 local5 = (Class5_Sub1) this.aClass330_26.method7908(); local5 != null; local5 = (Class5_Sub1) this.aClass330_26.method7914()) {
			local5.method8286(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8283(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5693 < 0) {
				this.method5048(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5694 + arg2 < this.anInt5693) {
				this.anInt5694 += arg2;
				this.method5048(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5693 - this.anInt5694;
			this.method5048(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5694 += local33;
			this.method5050();
			@Pc(60) Class5_Sub31 local60 = (Class5_Sub31) this.aClass330_27.method7908();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4596(this);
				if (local68 < 0) {
					local60.anInt5122 = 0;
					this.method5049(local60);
				} else {
					local60.anInt5122 = local68;
					this.method5054(local60.aClass5_300, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "()I")
	@Override
	public int method8284() {
		return 0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!kp;)V")
	private void method5049(@OriginalArg(0) Class5_Sub31 arg0) {
		arg0.method9047();
		arg0.method4595();
		@Pc(9) Class5 local9 = this.aClass330_27.aClass5_257.aClass5_300;
		if (local9 == this.aClass330_27.aClass5_257) {
			this.anInt5693 = -1;
		} else {
			this.anInt5693 = ((Class5_Sub31) local9).anInt5122;
		}
	}

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "()V")
	private void method5050() {
		if (this.anInt5694 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub31 local8 = (Class5_Sub31) this.aClass330_27.method7908(); local8 != null; local8 = (Class5_Sub31) this.aClass330_27.method7914()) {
			local8.anInt5122 -= this.anInt5694;
		}
		this.anInt5693 -= this.anInt5694;
		this.anInt5694 = 0;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)V")
	private void method5051(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub1 local5 = (Class5_Sub1) this.aClass330_26.method7908(); local5 != null; local5 = (Class5_Sub1) this.aClass330_26.method7914()) {
			local5.method8287(arg0);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!aca;)V")
	public synchronized void method5052(@OriginalArg(0) Class5_Sub1 arg0) {
		arg0.method9047();
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "()Lclient!aca;")
	@Override
	public Class5_Sub1 method8285() {
		return (Class5_Sub1) this.aClass330_26.method7914();
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "()Lclient!aca;")
	@Override
	public Class5_Sub1 method8282() {
		return (Class5_Sub1) this.aClass330_26.method7908();
	}

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "()I")
	public synchronized int method5053() {
		return this.aClass330_26.method7912();
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8287(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5693 < 0) {
				this.method5051(arg0);
				return;
			}
			if (this.anInt5694 + arg0 < this.anInt5693) {
				this.anInt5694 += arg0;
				this.method5051(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5693 - this.anInt5694;
			this.method5051(local29);
			arg0 -= local29;
			this.anInt5694 += local29;
			this.method5050();
			@Pc(50) Class5_Sub31 local50 = (Class5_Sub31) this.aClass330_27.method7908();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4596(this);
				if (local58 < 0) {
					local50.anInt5122 = 0;
					this.method5049(local50);
				} else {
					local50.anInt5122 = local58;
					this.method5054(local50.aClass5_300, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!ds;Lclient!kp;)V")
	private void method5054(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub31 arg1) {
		while (arg0 != this.aClass330_27.aClass5_257 && ((Class5_Sub31) arg0).anInt5122 <= arg1.anInt5122) {
			arg0 = arg0.aClass5_300;
		}
		Static623.method8838(arg0, arg1);
		this.anInt5693 = ((Class5_Sub31) this.aClass330_27.aClass5_257.aClass5_300).anInt5122;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(Lclient!aca;)V")
	public synchronized void method5055(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass330_26.method7919(arg0);
	}
}
