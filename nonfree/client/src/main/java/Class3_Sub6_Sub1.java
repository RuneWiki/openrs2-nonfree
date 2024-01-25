import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "Lclient!hga;")
	private final Class130 aClass130_2 = new Class130();

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "Lclient!hga;")
	private final Class130 aClass130_3 = new Class130();

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
	private int anInt266 = -1;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	private int anInt267 = 0;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
	private void method284(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub6 local5 = (Class3_Sub6) this.aClass130_2.method3543(); local5 != null; local5 = (Class3_Sub6) this.aClass130_2.method3551()) {
			local5.method3732(arg0);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3728(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt266 < 0) {
				this.method286(arg0, arg1, arg2);
				return;
			}
			if (this.anInt267 + arg2 < this.anInt266) {
				this.anInt267 += arg2;
				this.method286(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt266 - this.anInt267;
			this.method286(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt267 += local33;
			this.method289();
			@Pc(60) Class3_Sub37 local60 = (Class3_Sub37) this.aClass130_3.method3543();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method6025(this);
				if (local68 < 0) {
					local60.anInt7067 = 0;
					this.method288(local60);
				} else {
					local60.anInt7067 = local68;
					this.method290(local60.aClass3_285, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!oea;)V")
	public synchronized void method285(@OriginalArg(0) Class3_Sub6 arg0) {
		this.aClass130_2.method3547(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "([III)V")
	private void method286(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub6 local5 = (Class3_Sub6) this.aClass130_2.method3543(); local5 != null; local5 = (Class3_Sub6) this.aClass130_2.method3551()) {
			local5.method3733(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3732(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt266 < 0) {
				this.method284(arg0);
				return;
			}
			if (this.anInt267 + arg0 < this.anInt266) {
				this.anInt267 += arg0;
				this.method284(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt266 - this.anInt267;
			this.method284(local29);
			arg0 -= local29;
			this.anInt267 += local29;
			this.method289();
			@Pc(50) Class3_Sub37 local50 = (Class3_Sub37) this.aClass130_3.method3543();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method6025(this);
				if (local58 < 0) {
					local50.anInt7067 = 0;
					this.method288(local50);
				} else {
					local50.anInt7067 = local58;
					this.method290(local50.aClass3_285, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "()I")
	public synchronized int method287() {
		return this.aClass130_2.method3544();
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "()Lclient!oea;")
	@Override
	public Class3_Sub6 method3730() {
		return (Class3_Sub6) this.aClass130_2.method3551();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!qc;)V")
	private void method288(@OriginalArg(0) Class3_Sub37 arg0) {
		arg0.method7812();
		arg0.method6024();
		@Pc(9) Class3 local9 = this.aClass130_3.aClass3_121.aClass3_285;
		if (local9 == this.aClass130_3.aClass3_121) {
			this.anInt266 = -1;
		} else {
			this.anInt266 = ((Class3_Sub37) local9).anInt7067;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "()I")
	@Override
	public int method3727() {
		return 0;
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "()V")
	private void method289() {
		if (this.anInt267 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub37 local8 = (Class3_Sub37) this.aClass130_3.method3543(); local8 != null; local8 = (Class3_Sub37) this.aClass130_3.method3551()) {
			local8.anInt7067 -= this.anInt267;
		}
		this.anInt266 -= this.anInt267;
		this.anInt267 = 0;
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "()Lclient!oea;")
	@Override
	public Class3_Sub6 method3731() {
		return (Class3_Sub6) this.aClass130_2.method3543();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!iga;Lclient!qc;)V")
	private void method290(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub37 arg1) {
		while (arg0 != this.aClass130_3.aClass3_121 && ((Class3_Sub37) arg0).anInt7067 <= arg1.anInt7067) {
			arg0 = arg0.aClass3_285;
		}
		Static452.method6294(arg1, arg0);
		this.anInt266 = ((Class3_Sub37) this.aClass130_3.aClass3_121.aClass3_285).anInt7067;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Lclient!oea;)V")
	public synchronized void method291(@OriginalArg(0) Class3_Sub6 arg0) {
		arg0.method7812();
	}
}
