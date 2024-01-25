import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!bb;")
	private final Class16 aClass16_37 = new Class16();

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!bb;")
	private final Class16 aClass16_38 = new Class16();

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
	private int anInt5885 = -1;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	private int anInt5886 = 0;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5034(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5885 < 0) {
				this.method5038(arg0);
				return;
			}
			if (this.anInt5886 + arg0 < this.anInt5885) {
				this.anInt5886 += arg0;
				this.method5038(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5885 - this.anInt5886;
			this.method5038(local29);
			arg0 -= local29;
			this.anInt5886 += local29;
			this.method5035();
			@Pc(50) Class1_Sub11 local50 = (Class1_Sub11) this.aClass16_38.method410();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1421(this);
				if (local58 < 0) {
					local50.anInt1644 = 0;
					this.method5039(local50);
				} else {
					local50.anInt1644 = local58;
					this.method5036(local50.aClass1_252, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "()V")
	private void method5035() {
		if (this.anInt5886 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub11 local8 = (Class1_Sub11) this.aClass16_38.method410(); local8 != null; local8 = (Class1_Sub11) this.aClass16_38.method419()) {
			local8.anInt1644 -= this.anInt5886;
		}
		this.anInt5885 -= this.anInt5886;
		this.anInt5886 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
	@Override
	public int method5031() {
		return 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!pn;Lclient!di;)V")
	private void method5036(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		while (arg0 != this.aClass16_38.aClass1_25 && ((Class1_Sub11) arg0).anInt1644 <= arg1.anInt1644) {
			arg0 = arg0.aClass1_252;
		}
		Static97.method4761(arg0, arg1);
		this.anInt5885 = ((Class1_Sub11) this.aClass16_38.aClass1_25.aClass1_252).anInt1644;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()Lclient!tf;")
	@Override
	public Class1_Sub1 method5029() {
		return (Class1_Sub1) this.aClass16_37.method410();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!tf;)V")
	public synchronized void method5037(@OriginalArg(0) Class1_Sub1 arg0) {
		arg0.method5628();
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	private void method5038(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass16_37.method410(); local5 != null; local5 = (Class1_Sub1) this.aClass16_37.method419()) {
			local5.method5034(arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!di;)V")
	private void method5039(@OriginalArg(0) Class1_Sub11 arg0) {
		arg0.method5628();
		arg0.method1422();
		@Pc(9) Class1 local9 = this.aClass16_38.aClass1_25.aClass1_252;
		if (local9 == this.aClass16_38.aClass1_25) {
			this.anInt5885 = -1;
		} else {
			this.anInt5885 = ((Class1_Sub11) local9).anInt1644;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!tf;)V")
	public synchronized void method5040(@OriginalArg(0) Class1_Sub1 arg0) {
		this.aClass16_37.method411(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5028(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5885 < 0) {
				this.method5041(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5886 + arg2 < this.anInt5885) {
				this.anInt5886 += arg2;
				this.method5041(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5885 - this.anInt5886;
			this.method5041(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5886 += local33;
			this.method5035();
			@Pc(60) Class1_Sub11 local60 = (Class1_Sub11) this.aClass16_38.method410();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1421(this);
				if (local68 < 0) {
					local60.anInt1644 = 0;
					this.method5039(local60);
				} else {
					local60.anInt1644 = local68;
					this.method5036(local60.aClass1_252, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "([III)V")
	private void method5041(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass16_37.method410(); local5 != null; local5 = (Class1_Sub1) this.aClass16_37.method419()) {
			local5.method5032(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public Class1_Sub1 method5033() {
		return (Class1_Sub1) this.aClass16_37.method419();
	}
}
