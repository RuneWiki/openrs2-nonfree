import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class2_Sub26_Sub4 extends Class2_Sub26 {

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "Lclient!ow;")
	private final Class271 aClass271_47 = new Class271();

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "Lclient!ow;")
	private final Class271 aClass271_48 = new Class271();

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
	private int anInt8274 = -1;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
	private int anInt8275 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "()I")
	@Override
	public int method9756() {
		return 0;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9760(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt8274 < 0) {
				this.method7396(arg0, arg1, arg2);
				return;
			}
			if (this.anInt8275 + arg2 < this.anInt8274) {
				this.anInt8275 += arg2;
				this.method7396(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt8274 - this.anInt8275;
			this.method7396(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt8275 += local33;
			this.method7397();
			@Pc(60) Class2_Sub34 local60 = (Class2_Sub34) this.aClass271_48.method7177();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4754(this);
				if (local68 < 0) {
					local60.anInt5230 = 0;
					this.method7395(local60);
				} else {
					local60.anInt5230 = local68;
					this.method7392(local60.aClass2_338, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "()Lclient!fja;")
	@Override
	public Class2_Sub26 method9761() {
		return (Class2_Sub26) this.aClass271_47.method7177();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!fja;)V")
	public synchronized void method7390(@OriginalArg(0) Class2_Sub26 arg0) {
		arg0.method9825();
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Lclient!fja;)V")
	public synchronized void method7391(@OriginalArg(0) Class2_Sub26 arg0) {
		this.aClass271_47.method7171(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!it;Lclient!jh;)V")
	private void method7392(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		while (arg0 != this.aClass271_48.aClass2_230 && ((Class2_Sub34) arg0).anInt5230 <= arg1.anInt5230) {
			arg0 = arg0.aClass2_338;
		}
		Static183.method3563(arg0, arg1);
		this.anInt8274 = ((Class2_Sub34) this.aClass271_48.aClass2_230.aClass2_338).anInt5230;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	private void method7393(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub26 local5 = (Class2_Sub26) this.aClass271_47.method7177(); local5 != null; local5 = (Class2_Sub26) this.aClass271_47.method7175()) {
			local5.method9759(arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "()Lclient!fja;")
	@Override
	public Class2_Sub26 method9758() {
		return (Class2_Sub26) this.aClass271_47.method7175();
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "()I")
	public synchronized int method7394() {
		return this.aClass271_47.method7178();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!jh;)V")
	private void method7395(@OriginalArg(0) Class2_Sub34 arg0) {
		arg0.method9825();
		arg0.method4753();
		@Pc(9) Class2 local9 = this.aClass271_48.aClass2_230.aClass2_338;
		if (local9 == this.aClass271_48.aClass2_230) {
			this.anInt8274 = -1;
		} else {
			this.anInt8274 = ((Class2_Sub34) local9).anInt5230;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9759(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt8274 < 0) {
				this.method7393(arg0);
				return;
			}
			if (this.anInt8275 + arg0 < this.anInt8274) {
				this.anInt8275 += arg0;
				this.method7393(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt8274 - this.anInt8275;
			this.method7393(local29);
			arg0 -= local29;
			this.anInt8275 += local29;
			this.method7397();
			@Pc(50) Class2_Sub34 local50 = (Class2_Sub34) this.aClass271_48.method7177();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4754(this);
				if (local58 < 0) {
					local50.anInt5230 = 0;
					this.method7395(local50);
				} else {
					local50.anInt5230 = local58;
					this.method7392(local50.aClass2_338, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "([III)V")
	private void method7396(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub26 local5 = (Class2_Sub26) this.aClass271_47.method7177(); local5 != null; local5 = (Class2_Sub26) this.aClass271_47.method7175()) {
			local5.method9755(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "()V")
	private void method7397() {
		if (this.anInt8275 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub34 local8 = (Class2_Sub34) this.aClass271_48.method7177(); local8 != null; local8 = (Class2_Sub34) this.aClass271_48.method7175()) {
			local8.anInt5230 -= this.anInt8275;
		}
		this.anInt8274 -= this.anInt8275;
		this.anInt8275 = 0;
	}
}
