import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class5_Sub4_Sub1 extends Class5_Sub4 {

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "Lclient!at;")
	private final Class20 aClass20_1 = new Class20();

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "Lclient!at;")
	private final Class20 aClass20_2 = new Class20();

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
	private int anInt273 = 0;

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
	private int anInt274 = -1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()Lclient!ef;")
	@Override
	public Class5_Sub4 method4714() {
		return (Class5_Sub4) this.aClass20_1.method366();
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4713(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt274 < 0) {
				this.method328(arg0, arg1, arg2);
				return;
			}
			if (this.anInt273 + arg2 < this.anInt274) {
				this.anInt273 += arg2;
				this.method328(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt274 - this.anInt273;
			this.method328(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt273 += local33;
			this.method330();
			@Pc(60) Class5_Sub39 local60 = (Class5_Sub39) this.aClass20_2.method378();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5721(this);
				if (local68 < 0) {
					local60.anInt6544 = 0;
					this.method333(local60);
				} else {
					local60.anInt6544 = local68;
					this.method331(local60.aClass5_338, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "([III)V")
	private void method328(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub4 local5 = (Class5_Sub4) this.aClass20_1.method378(); local5 != null; local5 = (Class5_Sub4) this.aClass20_1.method366()) {
			local5.method4709(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	private void method329(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub4 local5 = (Class5_Sub4) this.aClass20_1.method378(); local5 != null; local5 = (Class5_Sub4) this.aClass20_1.method366()) {
			local5.method4712(arg0);
		}
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "()V")
	private void method330() {
		if (this.anInt273 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub39 local8 = (Class5_Sub39) this.aClass20_2.method378(); local8 != null; local8 = (Class5_Sub39) this.aClass20_2.method366()) {
			local8.anInt6544 -= this.anInt273;
		}
		this.anInt274 -= this.anInt273;
		this.anInt273 = 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ac;Lclient!nf;)V")
	private void method331(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub39 arg1) {
		while (arg0 != this.aClass20_2.aClass5_19 && ((Class5_Sub39) arg0).anInt6544 <= arg1.anInt6544) {
			arg0 = arg0.aClass5_338;
		}
		Static558.method7542(arg0, arg1);
		this.anInt274 = ((Class5_Sub39) this.aClass20_2.aClass5_19.aClass5_338).anInt6544;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lclient!ef;)V")
	public synchronized void method332(@OriginalArg(0) Class5_Sub4 arg0) {
		arg0.method9222();
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()I")
	@Override
	public int method4710() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4712(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt274 < 0) {
				this.method329(arg0);
				return;
			}
			if (this.anInt273 + arg0 < this.anInt274) {
				this.anInt273 += arg0;
				this.method329(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt274 - this.anInt273;
			this.method329(local29);
			arg0 -= local29;
			this.anInt273 += local29;
			this.method330();
			@Pc(50) Class5_Sub39 local50 = (Class5_Sub39) this.aClass20_2.method378();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5721(this);
				if (local58 < 0) {
					local50.anInt6544 = 0;
					this.method333(local50);
				} else {
					local50.anInt6544 = local58;
					this.method331(local50.aClass5_338, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!nf;)V")
	private void method333(@OriginalArg(0) Class5_Sub39 arg0) {
		arg0.method9222();
		arg0.method5720();
		@Pc(9) Class5 local9 = this.aClass20_2.aClass5_19.aClass5_338;
		if (local9 == this.aClass20_2.aClass5_19) {
			this.anInt274 = -1;
		} else {
			this.anInt274 = ((Class5_Sub39) local9).anInt6544;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ef;)V")
	public synchronized void method334(@OriginalArg(0) Class5_Sub4 arg0) {
		this.aClass20_1.method371(arg0);
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "()I")
	public synchronized int method335() {
		return this.aClass20_1.method372();
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()Lclient!ef;")
	@Override
	public Class5_Sub4 method4711() {
		return (Class5_Sub4) this.aClass20_1.method378();
	}
}
