import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class2_Sub8_Sub1 extends Class2_Sub8 {

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Lclient!nj;")
	private final Class181 aClass181_5 = new Class181();

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!nj;")
	private final Class181 aClass181_6 = new Class181();

	@OriginalMember(owner = "client!d", name = "r", descriptor = "I")
	private int anInt1135 = 0;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "I")
	private int anInt1136 = -1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5284(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1136 < 0) {
				this.method1040(arg0);
				return;
			}
			if (this.anInt1135 + arg0 < this.anInt1136) {
				this.anInt1135 += arg0;
				this.method1040(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1136 - this.anInt1135;
			this.method1040(local29);
			arg0 -= local29;
			this.anInt1135 += local29;
			this.method1034();
			@Pc(50) Class2_Sub36 local50 = (Class2_Sub36) this.aClass181_6.method3972();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4789(this);
				if (local58 < 0) {
					local50.anInt6020 = 0;
					this.method1036(local50);
				} else {
					local50.anInt6020 = local58;
					this.method1037(local50.aClass2_268, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5281(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1136 < 0) {
				this.method1035(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1135 + arg2 < this.anInt1136) {
				this.anInt1135 += arg2;
				this.method1035(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1136 - this.anInt1135;
			this.method1035(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1135 += local33;
			this.method1034();
			@Pc(60) Class2_Sub36 local60 = (Class2_Sub36) this.aClass181_6.method3972();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4789(this);
				if (local68 < 0) {
					local60.anInt6020 = 0;
					this.method1036(local60);
				} else {
					local60.anInt6020 = local68;
					this.method1037(local60.aClass2_268, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "()V")
	private void method1034() {
		if (this.anInt1135 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub36 local8 = (Class2_Sub36) this.aClass181_6.method3972(); local8 != null; local8 = (Class2_Sub36) this.aClass181_6.method3975()) {
			local8.anInt6020 -= this.anInt1135;
		}
		this.anInt1136 -= this.anInt1135;
		this.anInt1135 = 0;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "([III)V")
	private void method1035(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub8 local5 = (Class2_Sub8) this.aClass181_5.method3972(); local5 != null; local5 = (Class2_Sub8) this.aClass181_5.method3975()) {
			local5.method5282(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!qn;)V")
	private void method1036(@OriginalArg(0) Class2_Sub36 arg0) {
		arg0.method6260();
		arg0.method4788();
		@Pc(9) Class2 local9 = this.aClass181_6.aClass2_156.aClass2_268;
		if (local9 == this.aClass181_6.aClass2_156) {
			this.anInt1136 = -1;
		} else {
			this.anInt1136 = ((Class2_Sub36) local9).anInt6020;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!wh;Lclient!qn;)V")
	private void method1037(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub36 arg1) {
		while (arg0 != this.aClass181_6.aClass2_156 && ((Class2_Sub36) arg0).anInt6020 <= arg1.anInt6020) {
			arg0 = arg0.aClass2_268;
		}
		Static372.method5181(arg0, arg1);
		this.anInt1136 = ((Class2_Sub36) this.aClass181_6.aClass2_156.aClass2_268).anInt6020;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "()I")
	public synchronized int method1038() {
		return this.aClass181_5.method3963();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!nu;)V")
	public synchronized void method1039(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aClass181_5.method3965(arg0);
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	private void method1040(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub8 local5 = (Class2_Sub8) this.aClass181_5.method3972(); local5 != null; local5 = (Class2_Sub8) this.aClass181_5.method3975()) {
			local5.method5284(arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()Lclient!nu;")
	@Override
	public Class2_Sub8 method5287() {
		return (Class2_Sub8) this.aClass181_5.method3975();
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()Lclient!nu;")
	@Override
	public Class2_Sub8 method5285() {
		return (Class2_Sub8) this.aClass181_5.method3972();
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
	@Override
	public int method5286() {
		return 0;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Lclient!nu;)V")
	public synchronized void method1041(@OriginalArg(0) Class2_Sub8 arg0) {
		arg0.method6260();
	}
}
