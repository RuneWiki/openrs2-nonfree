import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!cf;")
	private final Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!cf;")
	private final Class30 aClass30_2 = new Class30();

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	private int anInt41 = 0;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	private int anInt42 = -1;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	private void method55(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass30_1.method694(); local5 != null; local5 = (Class2_Sub2) this.aClass30_1.method682()) {
			local5.method5271(arg0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!km;)V")
	private void method56(@OriginalArg(0) Class2_Sub25 arg0) {
		arg0.method5617();
		arg0.method3147();
		@Pc(9) Class2 local9 = this.aClass30_2.aClass2_41.aClass2_243;
		if (local9 == this.aClass30_2.aClass2_41) {
			this.anInt42 = -1;
		} else {
			this.anInt42 = ((Class2_Sub25) local9).anInt3424;
		}
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "()V")
	private void method57() {
		if (this.anInt41 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub25 local8 = (Class2_Sub25) this.aClass30_2.method694(); local8 != null; local8 = (Class2_Sub25) this.aClass30_2.method682()) {
			local8.anInt3424 -= this.anInt41;
		}
		this.anInt42 -= this.anInt41;
		this.anInt41 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!oe;)V")
	public synchronized void method58(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method5617();
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5271(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt42 < 0) {
				this.method55(arg0);
				return;
			}
			if (this.anInt41 + arg0 < this.anInt42) {
				this.anInt41 += arg0;
				this.method55(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt42 - this.anInt41;
			this.method55(local29);
			arg0 -= local29;
			this.anInt41 += local29;
			this.method57();
			@Pc(50) Class2_Sub25 local50 = (Class2_Sub25) this.aClass30_2.method694();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3148(this);
				if (local58 < 0) {
					local50.anInt3424 = 0;
					this.method56(local50);
				} else {
					local50.anInt3424 = local58;
					this.method61(local50.aClass2_243, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "()I")
	@Override
	public int method5267() {
		return 0;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()Lclient!oe;")
	@Override
	public Class2_Sub2 method5268() {
		return (Class2_Sub2) this.aClass30_1.method682();
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()Lclient!oe;")
	@Override
	public Class2_Sub2 method5266() {
		return (Class2_Sub2) this.aClass30_1.method694();
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Lclient!oe;)V")
	public synchronized void method59(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass30_1.method693(arg0);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "([III)V")
	private void method60(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass30_1.method694(); local5 != null; local5 = (Class2_Sub2) this.aClass30_1.method682()) {
			local5.method5270(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!rs;Lclient!km;)V")
	private void method61(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub25 arg1) {
		while (arg0 != this.aClass30_2.aClass2_41 && ((Class2_Sub25) arg0).anInt3424 <= arg1.anInt3424) {
			arg0 = arg0.aClass2_243;
		}
		Static367.method5421(arg0, arg1);
		this.anInt42 = ((Class2_Sub25) this.aClass30_2.aClass2_41.aClass2_243).anInt3424;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5269(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt42 < 0) {
				this.method60(arg0, arg1, arg2);
				return;
			}
			if (this.anInt41 + arg2 < this.anInt42) {
				this.anInt41 += arg2;
				this.method60(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt42 - this.anInt41;
			this.method60(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt41 += local33;
			this.method57();
			@Pc(60) Class2_Sub25 local60 = (Class2_Sub25) this.aClass30_2.method694();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3148(this);
				if (local68 < 0) {
					local60.anInt3424 = 0;
					this.method56(local60);
				} else {
					local60.anInt3424 = local68;
					this.method61(local60.aClass2_243, local60);
				}
			}
		} while (arg2 != 0);
	}
}
