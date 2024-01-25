import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class4_Sub3_Sub5 extends Class4_Sub3 {

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_62 = new Class163();

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_63 = new Class163();

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
	private int anInt9037 = 0;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	private int anInt9038 = -1;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!oq;Lclient!kea;)V")
	private void method7721(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub31 arg1) {
		while (arg0 != this.aClass163_63.aClass4_127 && ((Class4_Sub31) arg0).anInt4804 <= arg1.anInt4804) {
			arg0 = arg0.aClass4_337;
		}
		Static470.method6505(arg0, arg1);
		this.anInt9038 = ((Class4_Sub31) this.aClass163_63.aClass4_127.aClass4_337).anInt4804;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "([III)V")
	private void method7722(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub3 local5 = (Class4_Sub3) this.aClass163_62.method3639(); local5 != null; local5 = (Class4_Sub3) this.aClass163_62.method3640()) {
			local5.method7716(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!oia;)V")
	public synchronized void method7723(@OriginalArg(0) Class4_Sub3 arg0) {
		arg0.method9000();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7715(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt9038 < 0) {
				this.method7725(arg0);
				return;
			}
			if (this.anInt9037 + arg0 < this.anInt9038) {
				this.anInt9037 += arg0;
				this.method7725(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt9038 - this.anInt9037;
			this.method7725(local29);
			arg0 -= local29;
			this.anInt9037 += local29;
			this.method7727();
			@Pc(50) Class4_Sub31 local50 = (Class4_Sub31) this.aClass163_63.method3639();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4286(this);
				if (local58 < 0) {
					local50.anInt4804 = 0;
					this.method7728(local50);
				} else {
					local50.anInt4804 = local58;
					this.method7721(local50.aClass4_337, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(Lclient!oia;)V")
	public synchronized void method7724(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aClass163_62.method3641(arg0);
	}

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "()Lclient!oia;")
	@Override
	public Class4_Sub3 method7720() {
		return (Class4_Sub3) this.aClass163_62.method3640();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "()I")
	@Override
	public int method7714() {
		return 0;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "()Lclient!oia;")
	@Override
	public Class4_Sub3 method7719() {
		return (Class4_Sub3) this.aClass163_62.method3639();
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
	private void method7725(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub3 local5 = (Class4_Sub3) this.aClass163_62.method3639(); local5 != null; local5 = (Class4_Sub3) this.aClass163_62.method3640()) {
			local5.method7715(arg0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "()I")
	public synchronized int method7726() {
		return this.aClass163_62.method3650();
	}

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "()V")
	private void method7727() {
		if (this.anInt9037 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub31 local8 = (Class4_Sub31) this.aClass163_63.method3639(); local8 != null; local8 = (Class4_Sub31) this.aClass163_63.method3640()) {
			local8.anInt4804 -= this.anInt9037;
		}
		this.anInt9038 -= this.anInt9037;
		this.anInt9037 = 0;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7718(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt9038 < 0) {
				this.method7722(arg0, arg1, arg2);
				return;
			}
			if (this.anInt9037 + arg2 < this.anInt9038) {
				this.anInt9037 += arg2;
				this.method7722(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt9038 - this.anInt9037;
			this.method7722(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt9037 += local33;
			this.method7727();
			@Pc(60) Class4_Sub31 local60 = (Class4_Sub31) this.aClass163_63.method3639();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4286(this);
				if (local68 < 0) {
					local60.anInt4804 = 0;
					this.method7728(local60);
				} else {
					local60.anInt4804 = local68;
					this.method7721(local60.aClass4_337, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!kea;)V")
	private void method7728(@OriginalArg(0) Class4_Sub31 arg0) {
		arg0.method9000();
		arg0.method4287();
		@Pc(9) Class4 local9 = this.aClass163_63.aClass4_127.aClass4_337;
		if (local9 == this.aClass163_63.aClass4_127) {
			this.anInt9038 = -1;
		} else {
			this.anInt9038 = ((Class4_Sub31) local9).anInt4804;
		}
	}
}
