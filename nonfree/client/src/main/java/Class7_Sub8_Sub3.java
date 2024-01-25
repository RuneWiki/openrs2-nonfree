import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class7_Sub8_Sub3 extends Class7_Sub8 {

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Lclient!fi;")
	private final Class74 aClass74_31 = new Class74();

	@OriginalMember(owner = "client!np", name = "q", descriptor = "Lclient!fi;")
	private final Class74 aClass74_32 = new Class74();

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	private int anInt4400 = -1;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "I")
	private int anInt4401 = 0;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!mi;)V")
	public synchronized void method3895(@OriginalArg(0) Class7_Sub8 arg0) {
		this.aClass74_31.method1797(arg0);
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4936(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4400 < 0) {
				this.method3900(arg0);
				return;
			}
			if (this.anInt4401 + arg0 < this.anInt4400) {
				this.anInt4401 += arg0;
				this.method3900(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4400 - this.anInt4401;
			this.method3900(local29);
			arg0 -= local29;
			this.anInt4401 += local29;
			this.method3897();
			@Pc(50) Class7_Sub33 local50 = (Class7_Sub33) this.aClass74_32.method1793();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4606(this);
				if (local58 < 0) {
					local50.anInt5455 = 0;
					this.method3901(local50);
				} else {
					local50.anInt5455 = local58;
					this.method3899(local50.aClass7_247, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "([III)V")
	private void method3896(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class7_Sub8 local5 = (Class7_Sub8) this.aClass74_31.method1793(); local5 != null; local5 = (Class7_Sub8) this.aClass74_31.method1798()) {
			local5.method4933(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "()Lclient!mi;")
	@Override
	public Class7_Sub8 method4930() {
		return (Class7_Sub8) this.aClass74_31.method1798();
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "()V")
	private void method3897() {
		if (this.anInt4401 <= 0) {
			return;
		}
		for (@Pc(8) Class7_Sub33 local8 = (Class7_Sub33) this.aClass74_32.method1793(); local8 != null; local8 = (Class7_Sub33) this.aClass74_32.method1798()) {
			local8.anInt5455 -= this.anInt4401;
		}
		this.anInt4400 -= this.anInt4401;
		this.anInt4401 = 0;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "()I")
	@Override
	public int method4935() {
		return 0;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4400 < 0) {
				this.method3896(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4401 + arg2 < this.anInt4400) {
				this.anInt4401 += arg2;
				this.method3896(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4400 - this.anInt4401;
			this.method3896(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4401 += local33;
			this.method3897();
			@Pc(60) Class7_Sub33 local60 = (Class7_Sub33) this.aClass74_32.method1793();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4606(this);
				if (local68 < 0) {
					local60.anInt5455 = 0;
					this.method3901(local60);
				} else {
					local60.anInt5455 = local68;
					this.method3899(local60.aClass7_247, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public Class7_Sub8 method4932() {
		return (Class7_Sub8) this.aClass74_31.method1793();
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Lclient!mi;)V")
	public synchronized void method3898(@OriginalArg(0) Class7_Sub8 arg0) {
		arg0.method5648();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!s;Lclient!rm;)V")
	private void method3899(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7_Sub33 arg1) {
		while (arg0 != this.aClass74_32.aClass7_72 && ((Class7_Sub33) arg0).anInt5455 <= arg1.anInt5455) {
			arg0 = arg0.aClass7_247;
		}
		Static183.method3348(arg1, arg0);
		this.anInt4400 = ((Class7_Sub33) this.aClass74_32.aClass7_72.aClass7_247).anInt5455;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
	private void method3900(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class7_Sub8 local5 = (Class7_Sub8) this.aClass74_31.method1793(); local5 != null; local5 = (Class7_Sub8) this.aClass74_31.method1798()) {
			local5.method4936(arg0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!rm;)V")
	private void method3901(@OriginalArg(0) Class7_Sub33 arg0) {
		arg0.method5648();
		arg0.method4605();
		@Pc(9) Class7 local9 = this.aClass74_32.aClass7_72.aClass7_247;
		if (local9 == this.aClass74_32.aClass7_72) {
			this.anInt4400 = -1;
		} else {
			this.anInt4400 = ((Class7_Sub33) local9).anInt5455;
		}
	}
}
