import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class1_Sub12_Sub2 extends Class1_Sub12 {

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!th;")
	private final Class82 aClass82_11 = new Class82();

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "Lclient!th;")
	private final Class82 aClass82_12 = new Class82();

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
	private int anInt3288 = 0;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
	private int anInt3289 = -1;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "()Lclient!ve;")
	@Override
	public Class1_Sub12 method2630() {
		return (Class1_Sub12) this.aClass82_11.method2849();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ve;)V")
	public synchronized void method2355(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.method3056();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()I")
	@Override
	public int method2628() {
		return 0;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	private void method2356(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub12 local5 = (Class1_Sub12) this.aClass82_11.method2849(); local5 != null; local5 = (Class1_Sub12) this.aClass82_11.method2855()) {
			local5.method2633(arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lclient!ve;)V")
	public synchronized void method2357(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aClass82_11.method2856(arg0);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "([III)V")
	private void method2358(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub12 local5 = (Class1_Sub12) this.aClass82_11.method2849(); local5 != null; local5 = (Class1_Sub12) this.aClass82_11.method2855()) {
			local5.method2634(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!tf;)V")
	private void method2359(@OriginalArg(0) Class1_Sub20 arg0) {
		arg0.method3056();
		arg0.method2836();
		@Pc(9) Class1 local9 = this.aClass82_12.aClass1_201.aClass1_215;
		if (local9 == this.aClass82_12.aClass1_201) {
			this.anInt3289 = -1;
		} else {
			this.anInt3289 = ((Class1_Sub20) local9).anInt3902;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!lb;Lclient!tf;)V")
	private void method2360(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		while (arg0 != this.aClass82_12.aClass1_201 && ((Class1_Sub20) arg0).anInt3902 <= arg1.anInt3902) {
			arg0 = arg0.aClass1_215;
		}
		this.aClass82_12.method2850(arg0, arg1);
		this.anInt3289 = ((Class1_Sub20) this.aClass82_12.aClass1_201.aClass1_215).anInt3902;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "()Lclient!ve;")
	@Override
	public Class1_Sub12 method2629() {
		return (Class1_Sub12) this.aClass82_11.method2855();
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "()V")
	private void method2361() {
		if (this.anInt3288 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub20 local8 = (Class1_Sub20) this.aClass82_12.method2849(); local8 != null; local8 = (Class1_Sub20) this.aClass82_12.method2855()) {
			local8.anInt3902 -= this.anInt3288;
		}
		this.anInt3289 -= this.anInt3288;
		this.anInt3288 = 0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2632(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3289 < 0) {
				this.method2358(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3288 + arg2 < this.anInt3289) {
				this.anInt3288 += arg2;
				this.method2358(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3289 - this.anInt3288;
			this.method2358(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3288 += local33;
			this.method2361();
			@Pc(60) Class1_Sub20 local60 = (Class1_Sub20) this.aClass82_12.method2849();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2837(this);
				if (local68 < 0) {
					local60.anInt3902 = 0;
					this.method2359(local60);
				} else {
					local60.anInt3902 = local68;
					this.method2360(local60.aClass1_215, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2633(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3289 < 0) {
				this.method2356(arg0);
				return;
			}
			if (this.anInt3288 + arg0 < this.anInt3289) {
				this.anInt3288 += arg0;
				this.method2356(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3289 - this.anInt3288;
			this.method2356(local29);
			arg0 -= local29;
			this.anInt3288 += local29;
			this.method2361();
			@Pc(50) Class1_Sub20 local50 = (Class1_Sub20) this.aClass82_12.method2849();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2837(this);
				if (local58 < 0) {
					local50.anInt3902 = 0;
					this.method2359(local50);
				} else {
					local50.anInt3902 = local58;
					this.method2360(local50.aClass1_215, local50);
				}
			}
		} while (arg0 != 0);
	}
}
