import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Lclient!vb;")
	private Class120 aClass120_5 = new Class120();

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "Lclient!vb;")
	private Class120 aClass120_6 = new Class120();

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	private int anInt1113 = -1;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	private int anInt1114 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2183(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1113 < 0) {
				this.method971(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1114 + arg2 < this.anInt1113) {
				this.anInt1114 += arg2;
				this.method971(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1113 - this.anInt1114;
			this.method971(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1114 += local33;
			this.method969();
			@Pc(60) Class1_Sub8 local60 = (Class1_Sub8) this.aClass120_6.method3564();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1054(this);
				if (local68 < 0) {
					local60.anInt1328 = 0;
					this.method967(local60);
				} else {
					local60.anInt1328 = local68;
					this.method970(local60.aClass1_203, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2187(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1113 < 0) {
				this.method968(arg0);
				return;
			}
			if (this.anInt1114 + arg0 < this.anInt1113) {
				this.anInt1114 += arg0;
				this.method968(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1113 - this.anInt1114;
			this.method968(local29);
			arg0 -= local29;
			this.anInt1114 += local29;
			this.method969();
			@Pc(50) Class1_Sub8 local50 = (Class1_Sub8) this.aClass120_6.method3564();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1054(this);
				if (local58 < 0) {
					local50.anInt1328 = 0;
					this.method967(local50);
				} else {
					local50.anInt1328 = local58;
					this.method970(local50.aClass1_203, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "()Lclient!pf;")
	@Override
	public Class1_Sub6 method2185() {
		return (Class1_Sub6) this.aClass120_5.method3564();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!pf;)V")
	public synchronized void method966(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.method3735();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ei;)V")
	private void method967(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method3735();
		arg0.method1055();
		@Pc(9) Class1 local9 = this.aClass120_6.aClass1_191.aClass1_203;
		if (local9 == this.aClass120_6.aClass1_191) {
			this.anInt1113 = -1;
		} else {
			this.anInt1113 = ((Class1_Sub8) local9).anInt1328;
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	private void method968(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass120_5.method3564(); local5 != null; local5 = (Class1_Sub6) this.aClass120_5.method3561()) {
			local5.method2187(arg0);
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()I")
	@Override
	public int method2184() {
		return 0;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "()V")
	private void method969() {
		if (this.anInt1114 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub8 local8 = (Class1_Sub8) this.aClass120_6.method3564(); local8 != null; local8 = (Class1_Sub8) this.aClass120_6.method3561()) {
			local8.anInt1328 -= this.anInt1114;
		}
		this.anInt1113 -= this.anInt1114;
		this.anInt1114 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!rb;Lclient!ei;)V")
	private void method970(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		while (arg0 != this.aClass120_6.aClass1_191 && ((Class1_Sub8) arg0).anInt1328 <= arg1.anInt1328) {
			arg0 = arg0.aClass1_203;
		}
		Static127.method2122(arg0, arg1);
		this.anInt1113 = ((Class1_Sub8) this.aClass120_6.aClass1_191.aClass1_203).anInt1328;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()Lclient!pf;")
	@Override
	public Class1_Sub6 method2182() {
		return (Class1_Sub6) this.aClass120_5.method3561();
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "([III)V")
	private void method971(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass120_5.method3564(); local5 != null; local5 = (Class1_Sub6) this.aClass120_5.method3561()) {
			local5.method2186(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lclient!pf;)V")
	public synchronized void method972(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass120_5.method3571(arg0);
	}
}
