import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class12_Sub13_Sub1 extends Class12_Sub13 {

	@OriginalMember(owner = "client!el", name = "q", descriptor = "Lclient!dm;")
	private final Class73 aClass73_20 = new Class73();

	@OriginalMember(owner = "client!el", name = "r", descriptor = "Lclient!dm;")
	private final Class73 aClass73_21 = new Class73();

	@OriginalMember(owner = "client!el", name = "s", descriptor = "I")
	private int anInt2710 = 0;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	private int anInt2711 = -1;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7676(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2711 < 0) {
				this.method2446(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2710 + arg2 < this.anInt2711) {
				this.anInt2710 += arg2;
				this.method2446(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2711 - this.anInt2710;
			this.method2446(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2710 += local33;
			this.method2448();
			@Pc(60) Class12_Sub24 local60 = (Class12_Sub24) this.aClass73_21.method2005();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3842(this);
				if (local68 < 0) {
					local60.anInt4570 = 0;
					this.method2444(local60);
				} else {
					local60.anInt4570 = local68;
					this.method2441(local60.aClass12_283, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "()Lclient!ff;")
	@Override
	public Class12_Sub13 method7674() {
		return (Class12_Sub13) this.aClass73_20.method2005();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ik;Lclient!ij;)V")
	private void method2441(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12_Sub24 arg1) {
		while (arg0 != this.aClass73_21.aClass12_47 && ((Class12_Sub24) arg0).anInt4570 <= arg1.anInt4570) {
			arg0 = arg0.aClass12_283;
		}
		Static258.method4393(arg0, arg1);
		this.anInt2711 = ((Class12_Sub24) this.aClass73_21.aClass12_47.aClass12_283).anInt4570;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	private void method2442(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class12_Sub13 local5 = (Class12_Sub13) this.aClass73_20.method2005(); local5 != null; local5 = (Class12_Sub13) this.aClass73_20.method2009()) {
			local5.method7675(arg0);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ff;)V")
	public synchronized void method2443(@OriginalArg(0) Class12_Sub13 arg0) {
		arg0.method7967();
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "()Lclient!ff;")
	@Override
	public Class12_Sub13 method7673() {
		return (Class12_Sub13) this.aClass73_20.method2009();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ij;)V")
	private void method2444(@OriginalArg(0) Class12_Sub24 arg0) {
		arg0.method7967();
		arg0.method3843();
		@Pc(9) Class12 local9 = this.aClass73_21.aClass12_47.aClass12_283;
		if (local9 == this.aClass73_21.aClass12_47) {
			this.anInt2711 = -1;
		} else {
			this.anInt2711 = ((Class12_Sub24) local9).anInt4570;
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "()I")
	@Override
	public int method7672() {
		return 0;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(Lclient!ff;)V")
	public synchronized void method2445(@OriginalArg(0) Class12_Sub13 arg0) {
		this.aClass73_20.method2011(arg0);
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "([III)V")
	private void method2446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class12_Sub13 local5 = (Class12_Sub13) this.aClass73_20.method2005(); local5 != null; local5 = (Class12_Sub13) this.aClass73_20.method2009()) {
			local5.method7677(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7675(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2711 < 0) {
				this.method2442(arg0);
				return;
			}
			if (this.anInt2710 + arg0 < this.anInt2711) {
				this.anInt2710 += arg0;
				this.method2442(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2711 - this.anInt2710;
			this.method2442(local29);
			arg0 -= local29;
			this.anInt2710 += local29;
			this.method2448();
			@Pc(50) Class12_Sub24 local50 = (Class12_Sub24) this.aClass73_21.method2005();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3842(this);
				if (local58 < 0) {
					local50.anInt4570 = 0;
					this.method2444(local50);
				} else {
					local50.anInt4570 = local58;
					this.method2441(local50.aClass12_283, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "()I")
	public synchronized int method2447() {
		return this.aClass73_20.method2013();
	}

	@OriginalMember(owner = "client!el", name = "f", descriptor = "()V")
	private void method2448() {
		if (this.anInt2710 <= 0) {
			return;
		}
		for (@Pc(8) Class12_Sub24 local8 = (Class12_Sub24) this.aClass73_21.method2005(); local8 != null; local8 = (Class12_Sub24) this.aClass73_21.method2009()) {
			local8.anInt4570 -= this.anInt2710;
		}
		this.anInt2711 -= this.anInt2710;
		this.anInt2710 = 0;
	}
}
