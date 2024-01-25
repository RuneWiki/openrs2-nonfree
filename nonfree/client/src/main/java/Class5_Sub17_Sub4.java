import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class5_Sub17_Sub4 extends Class5_Sub17 {

	@OriginalMember(owner = "client!of", name = "p", descriptor = "Lclient!fca;")
	private final Class114 aClass114_51 = new Class114();

	@OriginalMember(owner = "client!of", name = "q", descriptor = "Lclient!fca;")
	private final Class114 aClass114_52 = new Class114();

	@OriginalMember(owner = "client!of", name = "s", descriptor = "I")
	private int anInt7360 = 0;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "I")
	private int anInt7359 = -1;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!km;)V")
	public synchronized void method6184(@OriginalArg(0) Class5_Sub17 arg0) {
		arg0.method9052();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()I")
	@Override
	public int method6646() {
		return 0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ko;Lclient!fd;)V")
	private void method6185(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		while (arg0 != this.aClass114_52.aClass5_84 && ((Class5_Sub20) arg0).anInt3202 <= arg1.anInt3202) {
			arg0 = arg0.aClass5_338;
		}
		Static619.method8412(arg0, arg1);
		this.anInt7359 = ((Class5_Sub20) this.aClass114_52.aClass5_84.aClass5_338).anInt3202;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt7359 < 0) {
				this.method6189(arg0, arg1, arg2);
				return;
			}
			if (this.anInt7360 + arg2 < this.anInt7359) {
				this.anInt7360 += arg2;
				this.method6189(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt7359 - this.anInt7360;
			this.method6189(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt7360 += local33;
			this.method6188();
			@Pc(60) Class5_Sub20 local60 = (Class5_Sub20) this.aClass114_52.method2805();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2824(this);
				if (local68 < 0) {
					local60.anInt3202 = 0;
					this.method6190(local60);
				} else {
					local60.anInt3202 = local68;
					this.method6185(local60.aClass5_338, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	private void method6186(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub17 local5 = (Class5_Sub17) this.aClass114_51.method2805(); local5 != null; local5 = (Class5_Sub17) this.aClass114_51.method2814()) {
			local5.method6650(arg0);
		}
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "()I")
	public synchronized int method6187() {
		return this.aClass114_51.method2811();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6650(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt7359 < 0) {
				this.method6186(arg0);
				return;
			}
			if (this.anInt7360 + arg0 < this.anInt7359) {
				this.anInt7360 += arg0;
				this.method6186(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt7359 - this.anInt7360;
			this.method6186(local29);
			arg0 -= local29;
			this.anInt7360 += local29;
			this.method6188();
			@Pc(50) Class5_Sub20 local50 = (Class5_Sub20) this.aClass114_52.method2805();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2824(this);
				if (local58 < 0) {
					local50.anInt3202 = 0;
					this.method6190(local50);
				} else {
					local50.anInt3202 = local58;
					this.method6185(local50.aClass5_338, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "()V")
	private void method6188() {
		if (this.anInt7360 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub20 local8 = (Class5_Sub20) this.aClass114_52.method2805(); local8 != null; local8 = (Class5_Sub20) this.aClass114_52.method2814()) {
			local8.anInt3202 -= this.anInt7360;
		}
		this.anInt7359 -= this.anInt7360;
		this.anInt7360 = 0;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "([III)V")
	private void method6189(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub17 local5 = (Class5_Sub17) this.aClass114_51.method2805(); local5 != null; local5 = (Class5_Sub17) this.aClass114_51.method2814()) {
			local5.method6648(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!fd;)V")
	private void method6190(@OriginalArg(0) Class5_Sub20 arg0) {
		arg0.method9052();
		arg0.method2825();
		@Pc(9) Class5 local9 = this.aClass114_52.aClass5_84.aClass5_338;
		if (local9 == this.aClass114_52.aClass5_84) {
			this.anInt7359 = -1;
		} else {
			this.anInt7359 = ((Class5_Sub20) local9).anInt3202;
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()Lclient!km;")
	@Override
	public Class5_Sub17 method6652() {
		return (Class5_Sub17) this.aClass114_51.method2814();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Lclient!km;)V")
	public synchronized void method6191(@OriginalArg(0) Class5_Sub17 arg0) {
		this.aClass114_51.method2812(arg0);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()Lclient!km;")
	@Override
	public Class5_Sub17 method6649() {
		return (Class5_Sub17) this.aClass114_51.method2805();
	}
}
