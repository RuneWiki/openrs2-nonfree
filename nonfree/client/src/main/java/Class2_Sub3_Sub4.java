import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "Lclient!dc;")
	private final Class70 aClass70_56 = new Class70();

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "Lclient!dc;")
	private final Class70 aClass70_57 = new Class70();

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
	private int anInt8295 = 0;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
	private int anInt8296 = -1;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	private void method6704(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub3 local5 = (Class2_Sub3) this.aClass70_56.method1264(); local5 != null; local5 = (Class2_Sub3) this.aClass70_56.method1261()) {
			local5.method6700(arg0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "()Lclient!ac;")
	@Override
	public Class2_Sub3 method6703() {
		return (Class2_Sub3) this.aClass70_56.method1261();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ac;)V")
	public synchronized void method6705(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method7657();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt8296 < 0) {
				this.method6709(arg0, arg1, arg2);
				return;
			}
			if (this.anInt8295 + arg2 < this.anInt8296) {
				this.anInt8295 += arg2;
				this.method6709(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt8296 - this.anInt8295;
			this.method6709(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt8295 += local33;
			this.method6710();
			@Pc(60) Class2_Sub39 local60 = (Class2_Sub39) this.aClass70_57.method1264();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5661(this);
				if (local68 < 0) {
					local60.anInt6903 = 0;
					this.method6708(local60);
				} else {
					local60.anInt6903 = local68;
					this.method6707(local60.aClass2_286, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(Lclient!ac;)V")
	public synchronized void method6706(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass70_56.method1268(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "()Lclient!ac;")
	@Override
	public Class2_Sub3 method6701() {
		return (Class2_Sub3) this.aClass70_56.method1264();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!du;Lclient!pu;)V")
	private void method6707(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub39 arg1) {
		while (arg0 != this.aClass70_57.aClass2_39 && ((Class2_Sub39) arg0).anInt6903 <= arg1.anInt6903) {
			arg0 = arg0.aClass2_286;
		}
		Static447.method5847(arg1, arg0);
		this.anInt8296 = ((Class2_Sub39) this.aClass70_57.aClass2_39.aClass2_286).anInt6903;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!pu;)V")
	private void method6708(@OriginalArg(0) Class2_Sub39 arg0) {
		arg0.method7657();
		arg0.method5660();
		@Pc(9) Class2 local9 = this.aClass70_57.aClass2_39.aClass2_286;
		if (local9 == this.aClass70_57.aClass2_39) {
			this.anInt8296 = -1;
		} else {
			this.anInt8296 = ((Class2_Sub39) local9).anInt6903;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6700(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt8296 < 0) {
				this.method6704(arg0);
				return;
			}
			if (this.anInt8295 + arg0 < this.anInt8296) {
				this.anInt8295 += arg0;
				this.method6704(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt8296 - this.anInt8295;
			this.method6704(local29);
			arg0 -= local29;
			this.anInt8295 += local29;
			this.method6710();
			@Pc(50) Class2_Sub39 local50 = (Class2_Sub39) this.aClass70_57.method1264();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5661(this);
				if (local58 < 0) {
					local50.anInt6903 = 0;
					this.method6708(local50);
				} else {
					local50.anInt6903 = local58;
					this.method6707(local50.aClass2_286, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "([III)V")
	private void method6709(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub3 local5 = (Class2_Sub3) this.aClass70_56.method1264(); local5 != null; local5 = (Class2_Sub3) this.aClass70_56.method1261()) {
			local5.method6702(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "()V")
	private void method6710() {
		if (this.anInt8295 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub39 local8 = (Class2_Sub39) this.aClass70_57.method1264(); local8 != null; local8 = (Class2_Sub39) this.aClass70_57.method1261()) {
			local8.anInt6903 -= this.anInt8295;
		}
		this.anInt8296 -= this.anInt8295;
		this.anInt8295 = 0;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "()I")
	@Override
	public int method6699() {
		return 0;
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "()I")
	public synchronized int method6711() {
		return this.aClass70_56.method1267();
	}
}
