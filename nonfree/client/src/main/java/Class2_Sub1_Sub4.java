import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Lclient!mg;")
	private final Class156 aClass156_30 = new Class156();

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "Lclient!mg;")
	private final Class156 aClass156_31 = new Class156();

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
	private int anInt4084 = 0;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	private int anInt4085 = -1;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()I")
	@Override
	public int method3223() {
		return 0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!uj;Lclient!nj;)V")
	private void method3230(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		while (arg0 != this.aClass156_31.aClass2_159 && ((Class2_Sub34) arg0).anInt4421 <= arg1.anInt4421) {
			arg0 = arg0.aClass2_264;
		}
		Static457.method5715(arg1, arg0);
		this.anInt4085 = ((Class2_Sub34) this.aClass156_31.aClass2_159.aClass2_264).anInt4421;
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "()I")
	public synchronized int method3231() {
		return this.aClass156_30.method3164();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!oo;)V")
	public synchronized void method3232(@OriginalArg(0) Class2_Sub1 arg0) {
		this.aClass156_30.method3159(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "([III)V")
	private void method3233(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub1 local5 = (Class2_Sub1) this.aClass156_30.method3155(); local5 != null; local5 = (Class2_Sub1) this.aClass156_30.method3150()) {
			local5.method3227(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	private void method3234(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub1 local5 = (Class2_Sub1) this.aClass156_30.method3155(); local5 != null; local5 = (Class2_Sub1) this.aClass156_30.method3150()) {
			local5.method3228(arg0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3229(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4085 < 0) {
				this.method3233(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4084 + arg2 < this.anInt4085) {
				this.anInt4084 += arg2;
				this.method3233(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4085 - this.anInt4084;
			this.method3233(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4084 += local33;
			this.method3236();
			@Pc(60) Class2_Sub34 local60 = (Class2_Sub34) this.aClass156_31.method3155();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3643(this);
				if (local68 < 0) {
					local60.anInt4421 = 0;
					this.method3235(local60);
				} else {
					local60.anInt4421 = local68;
					this.method3230(local60.aClass2_264, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!nj;)V")
	private void method3235(@OriginalArg(0) Class2_Sub34 arg0) {
		arg0.method5703();
		arg0.method3642();
		@Pc(9) Class2 local9 = this.aClass156_31.aClass2_159.aClass2_264;
		if (local9 == this.aClass156_31.aClass2_159) {
			this.anInt4085 = -1;
		} else {
			this.anInt4085 = ((Class2_Sub34) local9).anInt4421;
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "()Lclient!oo;")
	@Override
	public Class2_Sub1 method3226() {
		return (Class2_Sub1) this.aClass156_30.method3150();
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "()V")
	private void method3236() {
		if (this.anInt4084 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub34 local8 = (Class2_Sub34) this.aClass156_31.method3155(); local8 != null; local8 = (Class2_Sub34) this.aClass156_31.method3150()) {
			local8.anInt4421 -= this.anInt4084;
		}
		this.anInt4085 -= this.anInt4084;
		this.anInt4084 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()Lclient!oo;")
	@Override
	public Class2_Sub1 method3224() {
		return (Class2_Sub1) this.aClass156_30.method3155();
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(Lclient!oo;)V")
	public synchronized void method3237(@OriginalArg(0) Class2_Sub1 arg0) {
		arg0.method5703();
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3228(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4085 < 0) {
				this.method3234(arg0);
				return;
			}
			if (this.anInt4084 + arg0 < this.anInt4085) {
				this.anInt4084 += arg0;
				this.method3234(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4085 - this.anInt4084;
			this.method3234(local29);
			arg0 -= local29;
			this.anInt4084 += local29;
			this.method3236();
			@Pc(50) Class2_Sub34 local50 = (Class2_Sub34) this.aClass156_31.method3155();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3643(this);
				if (local58 < 0) {
					local50.anInt4421 = 0;
					this.method3235(local50);
				} else {
					local50.anInt4421 = local58;
					this.method3230(local50.aClass2_264, local50);
				}
			}
		} while (arg0 != 0);
	}
}
