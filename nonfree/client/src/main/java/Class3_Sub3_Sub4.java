import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!td", name = "w", descriptor = "Lclient!ea;")
	private final Class23 aClass23_14 = new Class23();

	@OriginalMember(owner = "client!td", name = "x", descriptor = "Lclient!ea;")
	private final Class23 aClass23_15 = new Class23();

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	private int anInt3727 = 0;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	private int anInt3728 = -1;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!mb;Lclient!oh;)V")
	private void method2845(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		while (arg0 != this.aClass23_15.aClass3_49 && ((Class3_Sub17) arg0).anInt2956 <= arg1.anInt2956) {
			arg0 = arg0.aClass3_207;
		}
		this.aClass23_15.method862(arg0, arg1);
		this.anInt3728 = ((Class3_Sub17) this.aClass23_15.aClass3_49.aClass3_207).anInt2956;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!oh;)V")
	private void method2846(@OriginalArg(0) Class3_Sub17 arg0) {
		arg0.method3167();
		arg0.method2308();
		@Pc(9) Class3 local9 = this.aClass23_15.aClass3_49.aClass3_207;
		if (local9 == this.aClass23_15.aClass3_49) {
			this.anInt3728 = -1;
		} else {
			this.anInt3728 = ((Class3_Sub17) local9).anInt2956;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()I")
	@Override
	public int method2841() {
		return 0;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	private void method2847(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub3 local5 = (Class3_Sub3) this.aClass23_14.method858(); local5 != null; local5 = (Class3_Sub3) this.aClass23_14.method861()) {
			local5.method2839(arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "()V")
	private void method2848() {
		if (this.anInt3727 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub17 local8 = (Class3_Sub17) this.aClass23_15.method858(); local8 != null; local8 = (Class3_Sub17) this.aClass23_15.method861()) {
			local8.anInt2956 -= this.anInt3727;
		}
		this.anInt3728 -= this.anInt3727;
		this.anInt3727 = 0;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2839(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3728 < 0) {
				this.method2847(arg0);
				return;
			}
			if (this.anInt3727 + arg0 < this.anInt3728) {
				this.anInt3727 += arg0;
				this.method2847(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3728 - this.anInt3727;
			this.method2847(local29);
			arg0 -= local29;
			this.anInt3727 += local29;
			this.method2848();
			@Pc(50) Class3_Sub17 local50 = (Class3_Sub17) this.aClass23_15.method858();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2309(this);
				if (local58 < 0) {
					local50.anInt2956 = 0;
					this.method2846(local50);
				} else {
					local50.anInt2956 = local58;
					this.method2845(local50.aClass3_207, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "([III)V")
	private void method2849(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub3 local5 = (Class3_Sub3) this.aClass23_14.method858(); local5 != null; local5 = (Class3_Sub3) this.aClass23_14.method861()) {
			local5.method2840(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ch;)V")
	public synchronized void method2850(@OriginalArg(0) Class3_Sub3 arg0) {
		this.aClass23_14.method859(arg0);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Lclient!ch;)V")
	public synchronized void method2851(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.method3167();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2838(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3728 < 0) {
				this.method2849(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3727 + arg2 < this.anInt3728) {
				this.anInt3727 += arg2;
				this.method2849(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3728 - this.anInt3727;
			this.method2849(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3727 += local33;
			this.method2848();
			@Pc(60) Class3_Sub17 local60 = (Class3_Sub17) this.aClass23_15.method858();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2309(this);
				if (local68 < 0) {
					local60.anInt2956 = 0;
					this.method2846(local60);
				} else {
					local60.anInt2956 = local68;
					this.method2845(local60.aClass3_207, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()Lclient!ch;")
	@Override
	public Class3_Sub3 method2843() {
		return (Class3_Sub3) this.aClass23_14.method861();
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()Lclient!ch;")
	@Override
	public Class3_Sub3 method2844() {
		return (Class3_Sub3) this.aClass23_14.method858();
	}
}
