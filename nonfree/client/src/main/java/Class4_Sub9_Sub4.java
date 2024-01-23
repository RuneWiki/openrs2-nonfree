import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class4_Sub9_Sub4 extends Class4_Sub9 {

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "Lclient!an;")
	private Class10 aClass10_20 = new Class10();

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "Lclient!an;")
	private Class10 aClass10_21 = new Class10();

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
	private int anInt1888 = -1;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
	private int anInt1889 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!fb;)V")
	public synchronized void method1470(@OriginalArg(0) Class4_Sub9 arg0) {
		arg0.method4391();
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "([III)V")
	private void method1471(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub9 local5 = (Class4_Sub9) this.aClass10_20.method190(); local5 != null; local5 = (Class4_Sub9) this.aClass10_20.method191()) {
			local5.method1466(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "()V")
	private void method1472() {
		if (this.anInt1889 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub8 local8 = (Class4_Sub8) this.aClass10_21.method190(); local8 != null; local8 = (Class4_Sub8) this.aClass10_21.method191()) {
			local8.anInt878 -= this.anInt1889;
		}
		this.anInt1888 -= this.anInt1889;
		this.anInt1889 = 0;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "()Lclient!fb;")
	@Override
	public Class4_Sub9 method1468() {
		return (Class4_Sub9) this.aClass10_20.method190();
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lclient!fb;)V")
	public synchronized void method1473(@OriginalArg(0) Class4_Sub9 arg0) {
		this.aClass10_20.method189(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!d;)V")
	private void method1474(@OriginalArg(0) Class4_Sub8 arg0) {
		arg0.method4391();
		arg0.method700();
		@Pc(9) Class4 local9 = this.aClass10_21.aClass4_17.aClass4_231;
		if (local9 == this.aClass10_21.aClass4_17) {
			this.anInt1888 = -1;
		} else {
			this.anInt1888 = ((Class4_Sub8) local9).anInt878;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()Lclient!fb;")
	@Override
	public Class4_Sub9 method1463() {
		return (Class4_Sub9) this.aClass10_20.method191();
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1469(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1888 < 0) {
				this.method1471(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1889 + arg2 < this.anInt1888) {
				this.anInt1889 += arg2;
				this.method1471(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1888 - this.anInt1889;
			this.method1471(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1889 += local33;
			this.method1472();
			@Pc(60) Class4_Sub8 local60 = (Class4_Sub8) this.aClass10_21.method190();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method701(this);
				if (local68 < 0) {
					local60.anInt878 = 0;
					this.method1474(local60);
				} else {
					local60.anInt878 = local68;
					this.method1476(local60.aClass4_231, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1465(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1888 < 0) {
				this.method1475(arg0);
				return;
			}
			if (this.anInt1889 + arg0 < this.anInt1888) {
				this.anInt1889 += arg0;
				this.method1475(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1888 - this.anInt1889;
			this.method1475(local29);
			arg0 -= local29;
			this.anInt1889 += local29;
			this.method1472();
			@Pc(50) Class4_Sub8 local50 = (Class4_Sub8) this.aClass10_21.method190();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method701(this);
				if (local58 < 0) {
					local50.anInt878 = 0;
					this.method1474(local50);
				} else {
					local50.anInt878 = local58;
					this.method1476(local50.aClass4_231, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V")
	private void method1475(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub9 local5 = (Class4_Sub9) this.aClass10_20.method190(); local5 != null; local5 = (Class4_Sub9) this.aClass10_20.method191()) {
			local5.method1465(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "()I")
	@Override
	public int method1467() {
		return 0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!si;Lclient!d;)V")
	private void method1476(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub8 arg1) {
		while (arg0 != this.aClass10_21.aClass4_17 && ((Class4_Sub8) arg0).anInt878 <= arg1.anInt878) {
			arg0 = arg0.aClass4_231;
		}
		Static171.method2692(arg0, arg1);
		this.anInt1888 = ((Class4_Sub8) this.aClass10_21.aClass4_17.aClass4_231).anInt878;
	}
}
