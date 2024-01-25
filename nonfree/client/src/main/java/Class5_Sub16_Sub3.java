import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class5_Sub16_Sub3 extends Class5_Sub16 {

	@OriginalMember(owner = "client!oca", name = "m", descriptor = "Lclient!ro;")
	private final Class306 aClass306_34 = new Class306();

	@OriginalMember(owner = "client!oca", name = "n", descriptor = "Lclient!ro;")
	private final Class306 aClass306_35 = new Class306();

	@OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
	private int anInt6883 = 0;

	@OriginalMember(owner = "client!oca", name = "p", descriptor = "I")
	private int anInt6884 = -1;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!hq;)V")
	private void method6138(@OriginalArg(0) Class5_Sub19 arg0) {
		arg0.method8911();
		arg0.method3319();
		@Pc(9) Class5 local9 = this.aClass306_35.aClass5_235.aClass5_299;
		if (local9 == this.aClass306_35.aClass5_235) {
			this.anInt6884 = -1;
		} else {
			this.anInt6884 = ((Class5_Sub19) local9).anInt3749;
		}
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "()Lclient!gu;")
	@Override
	public Class5_Sub16 method8283() {
		return (Class5_Sub16) this.aClass306_34.method7313();
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "([III)V")
	private void method6139(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub16 local5 = (Class5_Sub16) this.aClass306_34.method7313(); local5 != null; local5 = (Class5_Sub16) this.aClass306_34.method7301()) {
			local5.method8285(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!gu;)V")
	public synchronized void method6140(@OriginalArg(0) Class5_Sub16 arg0) {
		this.aClass306_34.method7305(arg0);
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "()I")
	@Override
	public int method8287() {
		return 0;
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "()I")
	public synchronized int method6141() {
		return this.aClass306_34.method7306();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8282(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6884 < 0) {
				this.method6139(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6883 + arg2 < this.anInt6884) {
				this.anInt6883 += arg2;
				this.method6139(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6884 - this.anInt6883;
			this.method6139(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6883 += local33;
			this.method6145();
			@Pc(60) Class5_Sub19 local60 = (Class5_Sub19) this.aClass306_35.method7313();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3318(this);
				if (local68 < 0) {
					local60.anInt3749 = 0;
					this.method6138(local60);
				} else {
					local60.anInt3749 = local68;
					this.method6143(local60.aClass5_299, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
	private void method6142(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub16 local5 = (Class5_Sub16) this.aClass306_34.method7313(); local5 != null; local5 = (Class5_Sub16) this.aClass306_34.method7301()) {
			local5.method8286(arg0);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!pb;Lclient!hq;)V")
	private void method6143(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		while (arg0 != this.aClass306_35.aClass5_235 && ((Class5_Sub19) arg0).anInt3749 <= arg1.anInt3749) {
			arg0 = arg0.aClass5_299;
		}
		Static592.method8903(arg0, arg1);
		this.anInt6884 = ((Class5_Sub19) this.aClass306_35.aClass5_235.aClass5_299).anInt3749;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8286(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6884 < 0) {
				this.method6142(arg0);
				return;
			}
			if (this.anInt6883 + arg0 < this.anInt6884) {
				this.anInt6883 += arg0;
				this.method6142(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6884 - this.anInt6883;
			this.method6142(local29);
			arg0 -= local29;
			this.anInt6883 += local29;
			this.method6145();
			@Pc(50) Class5_Sub19 local50 = (Class5_Sub19) this.aClass306_35.method7313();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3318(this);
				if (local58 < 0) {
					local50.anInt3749 = 0;
					this.method6138(local50);
				} else {
					local50.anInt3749 = local58;
					this.method6143(local50.aClass5_299, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(Lclient!gu;)V")
	public synchronized void method6144(@OriginalArg(0) Class5_Sub16 arg0) {
		arg0.method8911();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "()Lclient!gu;")
	@Override
	public Class5_Sub16 method8281() {
		return (Class5_Sub16) this.aClass306_34.method7301();
	}

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "()V")
	private void method6145() {
		if (this.anInt6883 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub19 local8 = (Class5_Sub19) this.aClass306_35.method7313(); local8 != null; local8 = (Class5_Sub19) this.aClass306_35.method7301()) {
			local8.anInt3749 -= this.anInt6883;
		}
		this.anInt6884 -= this.anInt6883;
		this.anInt6883 = 0;
	}
}
