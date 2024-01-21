import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!jd;")
	private final Class38 aClass38_25 = new Class38();

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!jd;")
	private final Class38 aClass38_26 = new Class38();

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
	private int anInt2853 = 0;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
	private int anInt2852 = -1;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "([III)V")
	private void method1900(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass38_25.method1034(); local5 != null; local5 = (Class1_Sub4) this.aClass38_25.method1038()) {
			local5.method1893(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1895(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2852 < 0) {
				this.method1901(arg0);
				return;
			}
			if (this.anInt2853 + arg0 < this.anInt2852) {
				this.anInt2853 += arg0;
				this.method1901(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2852 - this.anInt2853;
			this.method1901(local29);
			arg0 -= local29;
			this.anInt2853 += local29;
			this.method1904();
			@Pc(50) Class1_Sub20 local50 = (Class1_Sub20) this.aClass38_26.method1034();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1624(this);
				if (local58 < 0) {
					local50.anInt2456 = 0;
					this.method1906(local50);
				} else {
					local50.anInt2456 = local58;
					this.method1902(local50.aClass1_128, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()Lclient!kb;")
	@Override
	public Class1_Sub4 method1896() {
		return (Class1_Sub4) this.aClass38_25.method1034();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()Lclient!kb;")
	@Override
	public Class1_Sub4 method1894() {
		return (Class1_Sub4) this.aClass38_25.method1038();
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	private void method1901(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass38_25.method1034(); local5 != null; local5 = (Class1_Sub4) this.aClass38_25.method1038()) {
			local5.method1895(arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()I")
	@Override
	public int method1898() {
		return 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!sc;Lclient!pf;)V")
	private void method1902(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		while (arg0 != this.aClass38_26.aClass1_59 && ((Class1_Sub20) arg0).anInt2456 <= arg1.anInt2456) {
			arg0 = arg0.aClass1_128;
		}
		this.aClass38_26.method1035(arg0, arg1);
		this.anInt2852 = ((Class1_Sub20) this.aClass38_26.aClass1_59.aClass1_128).anInt2456;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!kb;)V")
	public synchronized void method1903(@OriginalArg(0) Class1_Sub4 arg0) {
		arg0.method2039();
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "()V")
	private void method1904() {
		if (this.anInt2853 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub20 local8 = (Class1_Sub20) this.aClass38_26.method1034(); local8 != null; local8 = (Class1_Sub20) this.aClass38_26.method1038()) {
			local8.anInt2456 -= this.anInt2853;
		}
		this.anInt2852 -= this.anInt2853;
		this.anInt2853 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Lclient!kb;)V")
	public synchronized void method1905(@OriginalArg(0) Class1_Sub4 arg0) {
		this.aClass38_25.method1043(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1897(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2852 < 0) {
				this.method1900(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2853 + arg2 < this.anInt2852) {
				this.anInt2853 += arg2;
				this.method1900(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2852 - this.anInt2853;
			this.method1900(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2853 += local33;
			this.method1904();
			@Pc(60) Class1_Sub20 local60 = (Class1_Sub20) this.aClass38_26.method1034();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1624(this);
				if (local68 < 0) {
					local60.anInt2456 = 0;
					this.method1906(local60);
				} else {
					local60.anInt2456 = local68;
					this.method1902(local60.aClass1_128, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!pf;)V")
	private void method1906(@OriginalArg(0) Class1_Sub20 arg0) {
		arg0.method2039();
		arg0.method1625();
		@Pc(9) Class1 local9 = this.aClass38_26.aClass1_59.aClass1_128;
		if (local9 == this.aClass38_26.aClass1_59) {
			this.anInt2852 = -1;
		} else {
			this.anInt2852 = ((Class1_Sub20) local9).anInt2456;
		}
	}
}
