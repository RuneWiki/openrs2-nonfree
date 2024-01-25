import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class2_Sub11_Sub3 extends Class2_Sub11 {

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "Lclient!sf;")
	private final Class180 aClass180_31 = new Class180();

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "Lclient!sf;")
	private final Class180 aClass180_32 = new Class180();

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
	private int anInt4766 = -1;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
	private int anInt4767 = 0;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "([III)V")
	private void method4107(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub11 local5 = (Class2_Sub11) this.aClass180_31.method4919(); local5 != null; local5 = (Class2_Sub11) this.aClass180_31.method4916()) {
			local5.method4949(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!wf;)V")
	public synchronized void method4108(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass180_31.method4918(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!gi;)V")
	private void method4109(@OriginalArg(0) Class2_Sub19 arg0) {
		arg0.method5723();
		arg0.method2127();
		@Pc(9) Class2 local9 = this.aClass180_32.aClass2_207.aClass2_251;
		if (local9 == this.aClass180_32.aClass2_207) {
			this.anInt4766 = -1;
		} else {
			this.anInt4766 = ((Class2_Sub19) local9).anInt2298;
		}
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "()Lclient!wf;")
	@Override
	public Class2_Sub11 method4948() {
		return (Class2_Sub11) this.aClass180_31.method4919();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4945(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4766 < 0) {
				this.method4107(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4767 + arg2 < this.anInt4766) {
				this.anInt4767 += arg2;
				this.method4107(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4766 - this.anInt4767;
			this.method4107(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4767 += local33;
			this.method4113();
			@Pc(60) Class2_Sub19 local60 = (Class2_Sub19) this.aClass180_32.method4919();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2126(this);
				if (local68 < 0) {
					local60.anInt2298 = 0;
					this.method4109(local60);
				} else {
					local60.anInt2298 = local68;
					this.method4112(local60.aClass2_251, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lclient!wf;)V")
	public synchronized void method4110(@OriginalArg(0) Class2_Sub11 arg0) {
		arg0.method5723();
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "()Lclient!wf;")
	@Override
	public Class2_Sub11 method4947() {
		return (Class2_Sub11) this.aClass180_31.method4916();
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
	private void method4111(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub11 local5 = (Class2_Sub11) this.aClass180_31.method4919(); local5 != null; local5 = (Class2_Sub11) this.aClass180_31.method4916()) {
			local5.method4946(arg0);
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "()I")
	@Override
	public int method4944() {
		return 0;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4946(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4766 < 0) {
				this.method4111(arg0);
				return;
			}
			if (this.anInt4767 + arg0 < this.anInt4766) {
				this.anInt4767 += arg0;
				this.method4111(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4766 - this.anInt4767;
			this.method4111(local29);
			arg0 -= local29;
			this.anInt4767 += local29;
			this.method4113();
			@Pc(50) Class2_Sub19 local50 = (Class2_Sub19) this.aClass180_32.method4919();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2126(this);
				if (local58 < 0) {
					local50.anInt2298 = 0;
					this.method4109(local50);
				} else {
					local50.anInt2298 = local58;
					this.method4112(local50.aClass2_251, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!nr;Lclient!gi;)V")
	private void method4112(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub19 arg1) {
		while (arg0 != this.aClass180_32.aClass2_207 && ((Class2_Sub19) arg0).anInt2298 <= arg1.anInt2298) {
			arg0 = arg0.aClass2_251;
		}
		Static71.method1442(arg0, arg1);
		this.anInt4766 = ((Class2_Sub19) this.aClass180_32.aClass2_207.aClass2_251).anInt2298;
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "()V")
	private void method4113() {
		if (this.anInt4767 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub19 local8 = (Class2_Sub19) this.aClass180_32.method4919(); local8 != null; local8 = (Class2_Sub19) this.aClass180_32.method4916()) {
			local8.anInt2298 -= this.anInt4767;
		}
		this.anInt4766 -= this.anInt4767;
		this.anInt4767 = 0;
	}
}
