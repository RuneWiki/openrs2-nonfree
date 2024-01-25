import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class1_Sub8_Sub4 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!wo;")
	private final Class361 aClass361_78 = new Class361();

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Lclient!wo;")
	private final Class361 aClass361_79 = new Class361();

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	private int anInt7291 = 0;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	private int anInt7292 = -1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!jca;Lclient!ep;)V")
	private void method6028(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		while (arg0 != this.aClass361_79.aClass1_281 && ((Class1_Sub14) arg0).anInt2523 <= arg1.anInt2523) {
			arg0 = arg0.aClass1_286;
		}
		Static476.method6702(arg1, arg0);
		this.anInt7292 = ((Class1_Sub14) this.aClass361_79.aClass1_281.aClass1_286).anInt2523;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!eg;)V")
	public synchronized void method6029(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass361_78.method7849(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ep;)V")
	private void method6030(@OriginalArg(0) Class1_Sub14 arg0) {
		arg0.method7878();
		arg0.method2130();
		@Pc(9) Class1 local9 = this.aClass361_79.aClass1_281.aClass1_286;
		if (local9 == this.aClass361_79.aClass1_281) {
			this.anInt7292 = -1;
		} else {
			this.anInt7292 = ((Class1_Sub14) local9).anInt2523;
		}
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "()I")
	public synchronized int method6031() {
		return this.aClass361_78.method7851();
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "([III)V")
	private void method6032(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub8 local5 = (Class1_Sub8) this.aClass361_78.method7854(); local5 != null; local5 = (Class1_Sub8) this.aClass361_78.method7853()) {
			local5.method6027(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lclient!eg;)V")
	public synchronized void method6033(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method7878();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6024(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt7292 < 0) {
				this.method6034(arg0);
				return;
			}
			if (this.anInt7291 + arg0 < this.anInt7292) {
				this.anInt7291 += arg0;
				this.method6034(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt7292 - this.anInt7291;
			this.method6034(local29);
			arg0 -= local29;
			this.anInt7291 += local29;
			this.method6035();
			@Pc(50) Class1_Sub14 local50 = (Class1_Sub14) this.aClass361_79.method7854();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2129(this);
				if (local58 < 0) {
					local50.anInt2523 = 0;
					this.method6030(local50);
				} else {
					local50.anInt2523 = local58;
					this.method6028(local50.aClass1_286, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()I")
	@Override
	public int method6021() {
		return 0;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	private void method6034(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub8 local5 = (Class1_Sub8) this.aClass361_78.method7854(); local5 != null; local5 = (Class1_Sub8) this.aClass361_78.method7853()) {
			local5.method6024(arg0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6022(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt7292 < 0) {
				this.method6032(arg0, arg1, arg2);
				return;
			}
			if (this.anInt7291 + arg2 < this.anInt7292) {
				this.anInt7291 += arg2;
				this.method6032(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt7292 - this.anInt7291;
			this.method6032(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt7291 += local33;
			this.method6035();
			@Pc(60) Class1_Sub14 local60 = (Class1_Sub14) this.aClass361_79.method7854();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2129(this);
				if (local68 < 0) {
					local60.anInt2523 = 0;
					this.method6030(local60);
				} else {
					local60.anInt2523 = local68;
					this.method6028(local60.aClass1_286, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "()Lclient!eg;")
	@Override
	public Class1_Sub8 method6026() {
		return (Class1_Sub8) this.aClass361_78.method7854();
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()Lclient!eg;")
	@Override
	public Class1_Sub8 method6023() {
		return (Class1_Sub8) this.aClass361_78.method7853();
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "()V")
	private void method6035() {
		if (this.anInt7291 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub14 local8 = (Class1_Sub14) this.aClass361_79.method7854(); local8 != null; local8 = (Class1_Sub14) this.aClass361_79.method7853()) {
			local8.anInt2523 -= this.anInt7291;
		}
		this.anInt7292 -= this.anInt7291;
		this.anInt7291 = 0;
	}
}
