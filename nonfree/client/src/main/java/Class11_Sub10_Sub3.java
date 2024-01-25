import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class11_Sub10_Sub3 extends Class11_Sub10 {

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Lclient!aq;")
	private final Class16 aClass16_34 = new Class16();

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "Lclient!aq;")
	private final Class16 aClass16_35 = new Class16();

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
	private int anInt4256 = -1;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	private int anInt4255 = 0;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "()V")
	private void method3736() {
		if (this.anInt4255 <= 0) {
			return;
		}
		for (@Pc(8) Class11_Sub9 local8 = (Class11_Sub9) this.aClass16_35.method193(); local8 != null; local8 = (Class11_Sub9) this.aClass16_35.method188()) {
			local8.anInt951 -= this.anInt4255;
		}
		this.anInt4256 -= this.anInt4255;
		this.anInt4255 = 0;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "()I")
	@Override
	public int method4056() {
		return 0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!er;)V")
	public synchronized void method3737(@OriginalArg(0) Class11_Sub10 arg0) {
		arg0.method5701();
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "()Lclient!er;")
	@Override
	public Class11_Sub10 method4059() {
		return (Class11_Sub10) this.aClass16_34.method193();
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "()Lclient!er;")
	@Override
	public Class11_Sub10 method4058() {
		return (Class11_Sub10) this.aClass16_34.method188();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!pl;Lclient!da;)V")
	private void method3738(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11_Sub9 arg1) {
		while (arg0 != this.aClass16_35.aClass11_9 && ((Class11_Sub9) arg0).anInt951 <= arg1.anInt951) {
			arg0 = arg0.aClass11_251;
		}
		Static79.method4500(arg0, arg1);
		this.anInt4256 = ((Class11_Sub9) this.aClass16_35.aClass11_9.aClass11_251).anInt951;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4060(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4256 < 0) {
				this.method3742(arg0);
				return;
			}
			if (this.anInt4255 + arg0 < this.anInt4256) {
				this.anInt4255 += arg0;
				this.method3742(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4256 - this.anInt4255;
			this.method3742(local29);
			arg0 -= local29;
			this.anInt4255 += local29;
			this.method3736();
			@Pc(50) Class11_Sub9 local50 = (Class11_Sub9) this.aClass16_35.method193();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method719(this);
				if (local58 < 0) {
					local50.anInt951 = 0;
					this.method3739(local50);
				} else {
					local50.anInt951 = local58;
					this.method3738(local50.aClass11_251, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!da;)V")
	private void method3739(@OriginalArg(0) Class11_Sub9 arg0) {
		arg0.method5701();
		arg0.method718();
		@Pc(9) Class11 local9 = this.aClass16_35.aClass11_9.aClass11_251;
		if (local9 == this.aClass16_35.aClass11_9) {
			this.anInt4256 = -1;
		} else {
			this.anInt4256 = ((Class11_Sub9) local9).anInt951;
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "([III)V")
	private void method3740(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class11_Sub10 local5 = (Class11_Sub10) this.aClass16_34.method193(); local5 != null; local5 = (Class11_Sub10) this.aClass16_34.method188()) {
			local5.method4055(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!er;)V")
	public synchronized void method3741(@OriginalArg(0) Class11_Sub10 arg0) {
		this.aClass16_34.method186(arg0);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4057(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4256 < 0) {
				this.method3740(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4255 + arg2 < this.anInt4256) {
				this.anInt4255 += arg2;
				this.method3740(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4256 - this.anInt4255;
			this.method3740(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4255 += local33;
			this.method3736();
			@Pc(60) Class11_Sub9 local60 = (Class11_Sub9) this.aClass16_35.method193();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method719(this);
				if (local68 < 0) {
					local60.anInt951 = 0;
					this.method3739(local60);
				} else {
					local60.anInt951 = local68;
					this.method3738(local60.aClass11_251, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	private void method3742(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class11_Sub10 local5 = (Class11_Sub10) this.aClass16_34.method193(); local5 != null; local5 = (Class11_Sub10) this.aClass16_34.method188()) {
			local5.method4060(arg0);
		}
	}
}
