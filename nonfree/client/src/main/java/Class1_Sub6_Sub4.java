import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class1_Sub6_Sub4 extends Class1_Sub6 {

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "Lclient!sr;")
	private final Class227 aClass227_40 = new Class227();

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "Lclient!sr;")
	private final Class227 aClass227_41 = new Class227();

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
	private int anInt6609 = 0;

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
	private int anInt6610 = -1;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "()Lclient!vb;")
	@Override
	public Class1_Sub6 method5168() {
		return (Class1_Sub6) this.aClass227_40.method4973();
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)V")
	private void method5172(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass227_40.method4967(); local5 != null; local5 = (Class1_Sub6) this.aClass227_40.method4973()) {
			local5.method5166(arg0);
		}
	}

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "()I")
	public synchronized int method5173() {
		return this.aClass227_40.method4975();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!pe;Lclient!co;)V")
	private void method5174(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		while (arg0 != this.aClass227_41.aClass1_225 && ((Class1_Sub11) arg0).anInt1090 <= arg1.anInt1090) {
			arg0 = arg0.aClass1_261;
		}
		Static237.method3398(arg0, arg1);
		this.anInt6610 = ((Class1_Sub11) this.aClass227_41.aClass1_225.aClass1_261).anInt1090;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!vb;)V")
	public synchronized void method5175(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass227_40.method4968(arg0);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!co;)V")
	private void method5176(@OriginalArg(0) Class1_Sub11 arg0) {
		arg0.method5915();
		arg0.method997();
		@Pc(9) Class1 local9 = this.aClass227_41.aClass1_225.aClass1_261;
		if (local9 == this.aClass227_41.aClass1_225) {
			this.anInt6610 = -1;
		} else {
			this.anInt6610 = ((Class1_Sub11) local9).anInt1090;
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "()Lclient!vb;")
	@Override
	public Class1_Sub6 method5167() {
		return (Class1_Sub6) this.aClass227_40.method4967();
	}

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "()V")
	private void method5177() {
		if (this.anInt6609 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub11 local8 = (Class1_Sub11) this.aClass227_41.method4967(); local8 != null; local8 = (Class1_Sub11) this.aClass227_41.method4973()) {
			local8.anInt1090 -= this.anInt6609;
		}
		this.anInt6610 -= this.anInt6609;
		this.anInt6609 = 0;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5171(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6610 < 0) {
				this.method5178(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6609 + arg2 < this.anInt6610) {
				this.anInt6609 += arg2;
				this.method5178(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6610 - this.anInt6609;
			this.method5178(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6609 += local33;
			this.method5177();
			@Pc(60) Class1_Sub11 local60 = (Class1_Sub11) this.aClass227_41.method4967();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method998(this);
				if (local68 < 0) {
					local60.anInt1090 = 0;
					this.method5176(local60);
				} else {
					local60.anInt1090 = local68;
					this.method5174(local60.aClass1_261, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "([III)V")
	private void method5178(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass227_40.method4967(); local5 != null; local5 = (Class1_Sub6) this.aClass227_40.method4973()) {
			local5.method5170(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "()I")
	@Override
	public int method5165() {
		return 0;
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5166(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6610 < 0) {
				this.method5172(arg0);
				return;
			}
			if (this.anInt6609 + arg0 < this.anInt6610) {
				this.anInt6609 += arg0;
				this.method5172(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6610 - this.anInt6609;
			this.method5172(local29);
			arg0 -= local29;
			this.anInt6609 += local29;
			this.method5177();
			@Pc(50) Class1_Sub11 local50 = (Class1_Sub11) this.aClass227_41.method4967();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method998(this);
				if (local58 < 0) {
					local50.anInt1090 = 0;
					this.method5176(local50);
				} else {
					local50.anInt1090 = local58;
					this.method5174(local50.aClass1_261, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lclient!vb;)V")
	public synchronized void method5179(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.method5915();
	}
}
