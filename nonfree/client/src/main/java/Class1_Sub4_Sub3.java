import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!n", name = "y", descriptor = "Lclient!sf;")
	private Class105 aClass105_13 = new Class105();

	@OriginalMember(owner = "client!n", name = "z", descriptor = "Lclient!sf;")
	private Class105 aClass105_14 = new Class105();

	@OriginalMember(owner = "client!n", name = "B", descriptor = "I")
	private int anInt2950 = -1;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "I")
	private int anInt2951 = 0;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "([III)V")
	private void method2301(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass105_13.method3120(); local5 != null; local5 = (Class1_Sub4) this.aClass105_13.method3109()) {
			local5.method2359(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2355(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2950 < 0) {
				this.method2301(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2951 + arg2 < this.anInt2950) {
				this.anInt2951 += arg2;
				this.method2301(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2950 - this.anInt2951;
			this.method2301(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2951 += local33;
			this.method2307();
			@Pc(60) Class1_Sub8 local60 = (Class1_Sub8) this.aClass105_14.method3120();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method881(this);
				if (local68 < 0) {
					local60.anInt1211 = 0;
					this.method2305(local60);
				} else {
					local60.anInt1211 = local68;
					this.method2303(local60.aClass1_202, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()I")
	@Override
	public int method2356() {
		return 0;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()Lclient!r;")
	@Override
	public Class1_Sub4 method2354() {
		return (Class1_Sub4) this.aClass105_13.method3109();
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	private void method2302(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass105_13.method3120(); local5 != null; local5 = (Class1_Sub4) this.aClass105_13.method3109()) {
			local5.method2357(arg0);
		}
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2357(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2950 < 0) {
				this.method2302(arg0);
				return;
			}
			if (this.anInt2951 + arg0 < this.anInt2950) {
				this.anInt2951 += arg0;
				this.method2302(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2950 - this.anInt2951;
			this.method2302(local29);
			arg0 -= local29;
			this.anInt2951 += local29;
			this.method2307();
			@Pc(50) Class1_Sub8 local50 = (Class1_Sub8) this.aClass105_14.method3120();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method881(this);
				if (local58 < 0) {
					local50.anInt1211 = 0;
					this.method2305(local50);
				} else {
					local50.anInt1211 = local58;
					this.method2303(local50.aClass1_202, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!dh;Lclient!eg;)V")
	private void method2303(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		while (arg0 != this.aClass105_14.aClass1_165 && ((Class1_Sub8) arg0).anInt1211 <= arg1.anInt1211) {
			arg0 = arg0.aClass1_202;
		}
		this.aClass105_14.method3118(arg0, arg1);
		this.anInt2950 = ((Class1_Sub8) this.aClass105_14.aClass1_165.aClass1_202).anInt1211;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!r;)V")
	public synchronized void method2304(@OriginalArg(0) Class1_Sub4 arg0) {
		arg0.method3758();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()Lclient!r;")
	@Override
	public Class1_Sub4 method2353() {
		return (Class1_Sub4) this.aClass105_13.method3120();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!eg;)V")
	private void method2305(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method3758();
		arg0.method880();
		@Pc(9) Class1 local9 = this.aClass105_14.aClass1_165.aClass1_202;
		if (local9 == this.aClass105_14.aClass1_165) {
			this.anInt2950 = -1;
		} else {
			this.anInt2950 = ((Class1_Sub8) local9).anInt1211;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!r;)V")
	public synchronized void method2306(@OriginalArg(0) Class1_Sub4 arg0) {
		this.aClass105_13.method3116(arg0);
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "()V")
	private void method2307() {
		if (this.anInt2951 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub8 local8 = (Class1_Sub8) this.aClass105_14.method3120(); local8 != null; local8 = (Class1_Sub8) this.aClass105_14.method3109()) {
			local8.anInt1211 -= this.anInt2951;
		}
		this.anInt2950 -= this.anInt2951;
		this.anInt2951 = 0;
	}
}
