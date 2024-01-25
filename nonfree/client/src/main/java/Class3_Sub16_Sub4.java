import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class3_Sub16_Sub4 extends Class3_Sub16 {

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "Lclient!or;")
	private final Class244 aClass244_70 = new Class244();

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "Lclient!or;")
	private final Class244 aClass244_71 = new Class244();

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
	private int anInt9862 = -1;

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
	private int anInt9863 = 0;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "()Lclient!eq;")
	@Override
	public Class3_Sub16 method7748() {
		return (Class3_Sub16) this.aClass244_70.method5576();
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "()V")
	private void method7755() {
		if (this.anInt9863 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub35 local8 = (Class3_Sub35) this.aClass244_71.method5572(); local8 != null; local8 = (Class3_Sub35) this.aClass244_71.method5576()) {
			local8.anInt6416 -= this.anInt9863;
		}
		this.anInt9862 -= this.anInt9863;
		this.anInt9863 = 0;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "([III)V")
	private void method7756(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub16 local5 = (Class3_Sub16) this.aClass244_70.method5572(); local5 != null; local5 = (Class3_Sub16) this.aClass244_70.method5576()) {
			local5.method7750(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7751(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt9862 < 0) {
				this.method7758(arg0);
				return;
			}
			if (this.anInt9863 + arg0 < this.anInt9862) {
				this.anInt9863 += arg0;
				this.method7758(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt9862 - this.anInt9863;
			this.method7758(local29);
			arg0 -= local29;
			this.anInt9863 += local29;
			this.method7755();
			@Pc(50) Class3_Sub35 local50 = (Class3_Sub35) this.aClass244_71.method5572();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5183(this);
				if (local58 < 0) {
					local50.anInt6416 = 0;
					this.method7760(local50);
				} else {
					local50.anInt6416 = local58;
					this.method7761(local50.aClass3_285, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7754(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt9862 < 0) {
				this.method7756(arg0, arg1, arg2);
				return;
			}
			if (this.anInt9863 + arg2 < this.anInt9862) {
				this.anInt9863 += arg2;
				this.method7756(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt9862 - this.anInt9863;
			this.method7756(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt9863 += local33;
			this.method7755();
			@Pc(60) Class3_Sub35 local60 = (Class3_Sub35) this.aClass244_71.method5572();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5183(this);
				if (local68 < 0) {
					local60.anInt6416 = 0;
					this.method7760(local60);
				} else {
					local60.anInt6416 = local68;
					this.method7761(local60.aClass3_285, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!eq;)V")
	public synchronized void method7757(@OriginalArg(0) Class3_Sub16 arg0) {
		arg0.method8128();
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	private void method7758(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub16 local5 = (Class3_Sub16) this.aClass244_70.method5572(); local5 != null; local5 = (Class3_Sub16) this.aClass244_70.method5576()) {
			local5.method7751(arg0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "()I")
	public synchronized int method7759() {
		return this.aClass244_70.method5575();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!nl;)V")
	private void method7760(@OriginalArg(0) Class3_Sub35 arg0) {
		arg0.method8128();
		arg0.method5182();
		@Pc(9) Class3 local9 = this.aClass244_71.aClass3_189.aClass3_285;
		if (local9 == this.aClass244_71.aClass3_189) {
			this.anInt9862 = -1;
		} else {
			this.anInt9862 = ((Class3_Sub35) local9).anInt6416;
		}
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "()Lclient!eq;")
	@Override
	public Class3_Sub16 method7752() {
		return (Class3_Sub16) this.aClass244_70.method5572();
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "()I")
	@Override
	public int method7749() {
		return 0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!u;Lclient!nl;)V")
	private void method7761(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub35 arg1) {
		while (arg0 != this.aClass244_71.aClass3_189 && ((Class3_Sub35) arg0).anInt6416 <= arg1.anInt6416) {
			arg0 = arg0.aClass3_285;
		}
		Static209.method7859(arg1, arg0);
		this.anInt9862 = ((Class3_Sub35) this.aClass244_71.aClass3_189.aClass3_285).anInt6416;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(Lclient!eq;)V")
	public synchronized void method7762(@OriginalArg(0) Class3_Sub16 arg0) {
		this.aClass244_70.method5573(arg0);
	}
}
