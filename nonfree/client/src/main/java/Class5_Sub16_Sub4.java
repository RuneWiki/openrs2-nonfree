import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class5_Sub16_Sub4 extends Class5_Sub16 {

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Lclient!jm;")
	private final Class103 aClass103_160 = new Class103();

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "Lclient!jm;")
	private final Class103 aClass103_161 = new Class103();

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
	private int anInt6480 = -1;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
	private int anInt6481 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5787(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6480 < 0) {
				this.method5799(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6481 + arg2 < this.anInt6480) {
				this.anInt6481 += arg2;
				this.method5799(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6480 - this.anInt6481;
			this.method5799(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6481 += local33;
			this.method5795();
			@Pc(60) Class5_Sub41 local60 = (Class5_Sub41) this.aClass103_161.method2756();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5441(this);
				if (local68 < 0) {
					local60.anInt6058 = 0;
					this.method5794(local60);
				} else {
					local60.anInt6058 = local68;
					this.method5800(local60.aClass5_251, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "()I")
	@Override
	public int method5792() {
		return 0;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5793(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6480 < 0) {
				this.method5796(arg0);
				return;
			}
			if (this.anInt6481 + arg0 < this.anInt6480) {
				this.anInt6481 += arg0;
				this.method5796(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6480 - this.anInt6481;
			this.method5796(local29);
			arg0 -= local29;
			this.anInt6481 += local29;
			this.method5795();
			@Pc(50) Class5_Sub41 local50 = (Class5_Sub41) this.aClass103_161.method2756();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5441(this);
				if (local58 < 0) {
					local50.anInt6058 = 0;
					this.method5794(local50);
				} else {
					local50.anInt6058 = local58;
					this.method5800(local50.aClass5_251, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "()Lclient!rb;")
	@Override
	public Class5_Sub16 method5791() {
		return (Class5_Sub16) this.aClass103_160.method2748();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!tl;)V")
	private void method5794(@OriginalArg(0) Class5_Sub41 arg0) {
		arg0.method6005();
		arg0.method5440();
		@Pc(9) Class5 local9 = this.aClass103_161.aClass5_114.aClass5_251;
		if (local9 == this.aClass103_161.aClass5_114) {
			this.anInt6480 = -1;
		} else {
			this.anInt6480 = ((Class5_Sub41) local9).anInt6058;
		}
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "()V")
	private void method5795() {
		if (this.anInt6481 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub41 local8 = (Class5_Sub41) this.aClass103_161.method2756(); local8 != null; local8 = (Class5_Sub41) this.aClass103_161.method2748()) {
			local8.anInt6058 -= this.anInt6481;
		}
		this.anInt6480 -= this.anInt6481;
		this.anInt6481 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
	private void method5796(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub16 local5 = (Class5_Sub16) this.aClass103_160.method2756(); local5 != null; local5 = (Class5_Sub16) this.aClass103_160.method2748()) {
			local5.method5793(arg0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!rb;)V")
	public synchronized void method5797(@OriginalArg(0) Class5_Sub16 arg0) {
		this.aClass103_160.method2752(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lclient!rb;)V")
	public synchronized void method5798(@OriginalArg(0) Class5_Sub16 arg0) {
		arg0.method6005();
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "([III)V")
	private void method5799(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub16 local5 = (Class5_Sub16) this.aClass103_160.method2756(); local5 != null; local5 = (Class5_Sub16) this.aClass103_160.method2748()) {
			local5.method5789(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()Lclient!rb;")
	@Override
	public Class5_Sub16 method5790() {
		return (Class5_Sub16) this.aClass103_160.method2756();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!vi;Lclient!tl;)V")
	private void method5800(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub41 arg1) {
		while (arg0 != this.aClass103_161.aClass5_114 && ((Class5_Sub41) arg0).anInt6058 <= arg1.anInt6058) {
			arg0 = arg0.aClass5_251;
		}
		Static235.method4169(arg0, arg1);
		this.anInt6480 = ((Class5_Sub41) this.aClass103_161.aClass5_114.aClass5_251).anInt6058;
	}
}
