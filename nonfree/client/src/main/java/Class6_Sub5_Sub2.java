import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class6_Sub5_Sub2 extends Class6_Sub5 {

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Lclient!ft;")
	private final Class88 aClass88_25 = new Class88();

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "Lclient!ft;")
	private final Class88 aClass88_26 = new Class88();

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
	private int anInt2353 = -1;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
	private int anInt2354 = 0;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "()I")
	public synchronized int method2164() {
		return this.aClass88_25.method1880();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!fp;)V")
	private void method2165(@OriginalArg(0) Class6_Sub13 arg0) {
		arg0.method5977();
		arg0.method1857();
		@Pc(9) Class6 local9 = this.aClass88_26.aClass6_73.aClass6_252;
		if (local9 == this.aClass88_26.aClass6_73) {
			this.anInt2353 = -1;
		} else {
			this.anInt2353 = ((Class6_Sub13) local9).anInt2010;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!wg;)V")
	public synchronized void method2166(@OriginalArg(0) Class6_Sub5 arg0) {
		this.aClass88_25.method1885(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "([III)V")
	private void method2167(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub5 local5 = (Class6_Sub5) this.aClass88_25.method1882(); local5 != null; local5 = (Class6_Sub5) this.aClass88_25.method1891()) {
			local5.method5733(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(Lclient!wg;)V")
	public synchronized void method2168(@OriginalArg(0) Class6_Sub5 arg0) {
		arg0.method5977();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!ol;Lclient!fp;)V")
	private void method2169(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub13 arg1) {
		while (arg0 != this.aClass88_26.aClass6_73 && ((Class6_Sub13) arg0).anInt2010 <= arg1.anInt2010) {
			arg0 = arg0.aClass6_252;
		}
		Static396.method5421(arg1, arg0);
		this.anInt2353 = ((Class6_Sub13) this.aClass88_26.aClass6_73.aClass6_252).anInt2010;
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
	private void method2170(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub5 local5 = (Class6_Sub5) this.aClass88_25.method1882(); local5 != null; local5 = (Class6_Sub5) this.aClass88_25.method1891()) {
			local5.method5730(arg0);
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "()Lclient!wg;")
	@Override
	public Class6_Sub5 method5729() {
		return (Class6_Sub5) this.aClass88_25.method1882();
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5734(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2353 < 0) {
				this.method2167(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2354 + arg2 < this.anInt2353) {
				this.anInt2354 += arg2;
				this.method2167(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2353 - this.anInt2354;
			this.method2167(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2354 += local33;
			this.method2171();
			@Pc(60) Class6_Sub13 local60 = (Class6_Sub13) this.aClass88_26.method1882();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1856(this);
				if (local68 < 0) {
					local60.anInt2010 = 0;
					this.method2165(local60);
				} else {
					local60.anInt2010 = local68;
					this.method2169(local60.aClass6_252, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5730(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2353 < 0) {
				this.method2170(arg0);
				return;
			}
			if (this.anInt2354 + arg0 < this.anInt2353) {
				this.anInt2354 += arg0;
				this.method2170(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2353 - this.anInt2354;
			this.method2170(local29);
			arg0 -= local29;
			this.anInt2354 += local29;
			this.method2171();
			@Pc(50) Class6_Sub13 local50 = (Class6_Sub13) this.aClass88_26.method1882();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1856(this);
				if (local58 < 0) {
					local50.anInt2010 = 0;
					this.method2165(local50);
				} else {
					local50.anInt2010 = local58;
					this.method2169(local50.aClass6_252, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "()Lclient!wg;")
	@Override
	public Class6_Sub5 method5732() {
		return (Class6_Sub5) this.aClass88_25.method1891();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "()I")
	@Override
	public int method5728() {
		return 0;
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "()V")
	private void method2171() {
		if (this.anInt2354 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub13 local8 = (Class6_Sub13) this.aClass88_26.method1882(); local8 != null; local8 = (Class6_Sub13) this.aClass88_26.method1891()) {
			local8.anInt2010 -= this.anInt2354;
		}
		this.anInt2353 -= this.anInt2354;
		this.anInt2354 = 0;
	}
}
