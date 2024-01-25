import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class14_Sub5_Sub3 extends Class14_Sub5 {

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "Lclient!ok;")
	private final Class262 aClass262_41 = new Class262();

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "Lclient!ok;")
	private final Class262 aClass262_42 = new Class262();

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
	private int anInt7431 = -1;

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
	private int anInt7432 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!lq;Lclient!fd;)V")
	private void method6026(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		while (arg0 != this.aClass262_42.aClass14_230 && ((Class14_Sub21) arg0).anInt3024 <= arg1.anInt3024) {
			arg0 = arg0.aClass14_338;
		}
		Static149.method5515(arg1, arg0);
		this.anInt7431 = ((Class14_Sub21) this.aClass262_42.aClass14_230.aClass14_338).anInt3024;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "()Lclient!sd;")
	@Override
	public Class14_Sub5 method8691() {
		return (Class14_Sub5) this.aClass262_41.method6318();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!sd;)V")
	public synchronized void method6027(@OriginalArg(0) Class14_Sub5 arg0) {
		this.aClass262_41.method6315(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8688(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt7431 < 0) {
				this.method6031(arg0);
				return;
			}
			if (this.anInt7432 + arg0 < this.anInt7431) {
				this.anInt7432 += arg0;
				this.method6031(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt7431 - this.anInt7432;
			this.method6031(local29);
			arg0 -= local29;
			this.anInt7432 += local29;
			this.method6032();
			@Pc(50) Class14_Sub21 local50 = (Class14_Sub21) this.aClass262_42.method6318();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2470(this);
				if (local58 < 0) {
					local50.anInt3024 = 0;
					this.method6033(local50);
				} else {
					local50.anInt3024 = local58;
					this.method6026(local50.aClass14_338, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "()I")
	public synchronized int method6028() {
		return this.aClass262_41.method6322();
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "()Lclient!sd;")
	@Override
	public Class14_Sub5 method8692() {
		return (Class14_Sub5) this.aClass262_41.method6311();
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(Lclient!sd;)V")
	public synchronized void method6029(@OriginalArg(0) Class14_Sub5 arg0) {
		arg0.method9315();
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "([III)V")
	private void method6030(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class14_Sub5 local5 = (Class14_Sub5) this.aClass262_41.method6318(); local5 != null; local5 = (Class14_Sub5) this.aClass262_41.method6311()) {
			local5.method8690(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	private void method6031(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class14_Sub5 local5 = (Class14_Sub5) this.aClass262_41.method6318(); local5 != null; local5 = (Class14_Sub5) this.aClass262_41.method6311()) {
			local5.method8688(arg0);
		}
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "()V")
	private void method6032() {
		if (this.anInt7432 <= 0) {
			return;
		}
		for (@Pc(8) Class14_Sub21 local8 = (Class14_Sub21) this.aClass262_42.method6318(); local8 != null; local8 = (Class14_Sub21) this.aClass262_42.method6311()) {
			local8.anInt3024 -= this.anInt7432;
		}
		this.anInt7431 -= this.anInt7432;
		this.anInt7432 = 0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "()I")
	@Override
	public int method8687() {
		return 0;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8693(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt7431 < 0) {
				this.method6030(arg0, arg1, arg2);
				return;
			}
			if (this.anInt7432 + arg2 < this.anInt7431) {
				this.anInt7432 += arg2;
				this.method6030(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt7431 - this.anInt7432;
			this.method6030(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt7432 += local33;
			this.method6032();
			@Pc(60) Class14_Sub21 local60 = (Class14_Sub21) this.aClass262_42.method6318();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2470(this);
				if (local68 < 0) {
					local60.anInt3024 = 0;
					this.method6033(local60);
				} else {
					local60.anInt3024 = local68;
					this.method6026(local60.aClass14_338, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!fd;)V")
	private void method6033(@OriginalArg(0) Class14_Sub21 arg0) {
		arg0.method9315();
		arg0.method2469();
		@Pc(9) Class14 local9 = this.aClass262_42.aClass14_230.aClass14_338;
		if (local9 == this.aClass262_42.aClass14_230) {
			this.anInt7431 = -1;
		} else {
			this.anInt7431 = ((Class14_Sub21) local9).anInt3024;
		}
	}
}
