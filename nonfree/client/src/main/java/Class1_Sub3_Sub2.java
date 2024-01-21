import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "Lclient!aa;")
	private final Class2 aClass2_6 = new Class2();

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "Lclient!aa;")
	private final Class2 aClass2_7 = new Class2();

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
	private int anInt1127 = 0;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
	private int anInt1128 = -1;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2028(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1128 < 0) {
				this.method926(arg0);
				return;
			}
			if (this.anInt1127 + arg0 < this.anInt1128) {
				this.anInt1127 += arg0;
				this.method926(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1128 - this.anInt1127;
			this.method926(local29);
			arg0 -= local29;
			this.anInt1127 += local29;
			this.method929();
			@Pc(50) Class1_Sub18 local50 = (Class1_Sub18) this.aClass2_7.method22();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1845(this);
				if (local58 < 0) {
					local50.anInt2654 = 0;
					this.method927(local50);
				} else {
					local50.anInt2654 = local58;
					this.method928(local50.aClass1_120, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "([III)V")
	private void method923(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass2_6.method22(); local5 != null; local5 = (Class1_Sub3) this.aClass2_6.method23()) {
			local5.method2031(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!h;)V")
	public synchronized void method924(@OriginalArg(0) Class1_Sub3 arg0) {
		arg0.method2024();
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lclient!h;)V")
	public synchronized void method925(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass2_6.method26(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
	private void method926(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass2_6.method22(); local5 != null; local5 = (Class1_Sub3) this.aClass2_6.method23()) {
			local5.method2028(arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!te;)V")
	private void method927(@OriginalArg(0) Class1_Sub18 arg0) {
		arg0.method2024();
		arg0.method1844();
		@Pc(9) Class1 local9 = this.aClass2_7.aClass1_5.aClass1_120;
		if (local9 == this.aClass2_7.aClass1_5) {
			this.anInt1128 = -1;
		} else {
			this.anInt1128 = ((Class1_Sub18) local9).anInt2654;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()Lclient!h;")
	@Override
	public Class1_Sub3 method2026() {
		return (Class1_Sub3) this.aClass2_6.method22();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!vc;Lclient!te;)V")
	private void method928(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		while (arg0 != this.aClass2_7.aClass1_5 && ((Class1_Sub18) arg0).anInt2654 <= arg1.anInt2654) {
			arg0 = arg0.aClass1_120;
		}
		this.aClass2_7.method21(arg1, arg0);
		this.anInt1128 = ((Class1_Sub18) this.aClass2_7.aClass1_5.aClass1_120).anInt2654;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "()V")
	private void method929() {
		if (this.anInt1127 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub18 local8 = (Class1_Sub18) this.aClass2_7.method22(); local8 != null; local8 = (Class1_Sub18) this.aClass2_7.method23()) {
			local8.anInt2654 -= this.anInt1127;
		}
		this.anInt1128 -= this.anInt1127;
		this.anInt1127 = 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2030(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1128 < 0) {
				this.method923(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1127 + arg2 < this.anInt1128) {
				this.anInt1127 += arg2;
				this.method923(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1128 - this.anInt1127;
			this.method923(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1127 += local33;
			this.method929();
			@Pc(60) Class1_Sub18 local60 = (Class1_Sub18) this.aClass2_7.method22();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1845(this);
				if (local68 < 0) {
					local60.anInt2654 = 0;
					this.method927(local60);
				} else {
					local60.anInt2654 = local68;
					this.method928(local60.aClass1_120, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "()Lclient!h;")
	@Override
	public Class1_Sub3 method2032() {
		return (Class1_Sub3) this.aClass2_6.method23();
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()I")
	@Override
	public int method2029() {
		return 0;
	}
}
