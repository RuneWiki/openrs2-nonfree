import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Lclient!ps;")
	private final Class193 aClass193_60 = new Class193();

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "Lclient!ps;")
	private final Class193 aClass193_61 = new Class193();

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
	private int anInt6191 = 0;

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
	private int anInt6190 = -1;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6294(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6190 < 0) {
				this.method5096(arg0);
				return;
			}
			if (this.anInt6191 + arg0 < this.anInt6190) {
				this.anInt6191 += arg0;
				this.method5096(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6190 - this.anInt6191;
			this.method5096(local29);
			arg0 -= local29;
			this.anInt6191 += local29;
			this.method5092();
			@Pc(50) Class3_Sub18 local50 = (Class3_Sub18) this.aClass193_61.method4519();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1817(this);
				if (local58 < 0) {
					local50.anInt1968 = 0;
					this.method5097(local50);
				} else {
					local50.anInt1968 = local58;
					this.method5093(local50.aClass3_268, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "()V")
	private void method5092() {
		if (this.anInt6191 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub18 local8 = (Class3_Sub18) this.aClass193_61.method4519(); local8 != null; local8 = (Class3_Sub18) this.aClass193_61.method4525()) {
			local8.anInt1968 -= this.anInt6191;
		}
		this.anInt6190 -= this.anInt6191;
		this.anInt6191 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ie;Lclient!fh;)V")
	private void method5093(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub18 arg1) {
		while (arg0 != this.aClass193_61.aClass3_198 && ((Class3_Sub18) arg0).anInt1968 <= arg1.anInt1968) {
			arg0 = arg0.aClass3_268;
		}
		Static221.method5545(arg1, arg0);
		this.anInt6190 = ((Class3_Sub18) this.aClass193_61.aClass3_198.aClass3_268).anInt1968;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!wq;)V")
	public synchronized void method5094(@OriginalArg(0) Class3_Sub1 arg0) {
		this.aClass193_60.method4522(arg0);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "()I")
	@Override
	public int method6291() {
		return 0;
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "()Lclient!wq;")
	@Override
	public Class3_Sub1 method6296() {
		return (Class3_Sub1) this.aClass193_60.method4519();
	}

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "()I")
	public synchronized int method5095() {
		return this.aClass193_60.method4520();
	}

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)V")
	private void method5096(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass193_60.method4519(); local5 != null; local5 = (Class3_Sub1) this.aClass193_60.method4525()) {
			local5.method6294(arg0);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!fh;)V")
	private void method5097(@OriginalArg(0) Class3_Sub18 arg0) {
		arg0.method6288();
		arg0.method1818();
		@Pc(9) Class3 local9 = this.aClass193_61.aClass3_198.aClass3_268;
		if (local9 == this.aClass193_61.aClass3_198) {
			this.anInt6190 = -1;
		} else {
			this.anInt6190 = ((Class3_Sub18) local9).anInt1968;
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "()Lclient!wq;")
	@Override
	public Class3_Sub1 method6292() {
		return (Class3_Sub1) this.aClass193_60.method4525();
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(Lclient!wq;)V")
	public synchronized void method5098(@OriginalArg(0) Class3_Sub1 arg0) {
		arg0.method6288();
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "([III)V")
	private void method5099(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass193_60.method4519(); local5 != null; local5 = (Class3_Sub1) this.aClass193_60.method4525()) {
			local5.method6295(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6290(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6190 < 0) {
				this.method5099(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6191 + arg2 < this.anInt6190) {
				this.anInt6191 += arg2;
				this.method5099(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6190 - this.anInt6191;
			this.method5099(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6191 += local33;
			this.method5092();
			@Pc(60) Class3_Sub18 local60 = (Class3_Sub18) this.aClass193_61.method4519();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1817(this);
				if (local68 < 0) {
					local60.anInt1968 = 0;
					this.method5097(local60);
				} else {
					local60.anInt1968 = local68;
					this.method5093(local60.aClass3_268, local60);
				}
			}
		} while (arg2 != 0);
	}
}
