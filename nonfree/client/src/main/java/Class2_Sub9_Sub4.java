import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub9_Sub4 extends Class2_Sub9 {

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Lclient!dc;")
	private final Class19 aClass19_14 = new Class19();

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!dc;")
	private final Class19 aClass19_15 = new Class19();

	@OriginalMember(owner = "client!r", name = "s", descriptor = "I")
	private int anInt3240 = 0;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	private int anInt3241 = -1;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
	private void method2475() {
		if (this.anInt3240 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub11 local8 = (Class2_Sub11) this.aClass19_15.method691(); local8 != null; local8 = (Class2_Sub11) this.aClass19_15.method686()) {
			local8.anInt1314 -= this.anInt3240;
		}
		this.anInt3241 -= this.anInt3240;
		this.anInt3240 = 0;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Lclient!dh;")
	@Override
	public Class2_Sub9 method2470() {
		return (Class2_Sub9) this.aClass19_14.method686();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!dh;)V")
	public synchronized void method2476(@OriginalArg(0) Class2_Sub9 arg0) {
		this.aClass19_14.method682(arg0);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	private void method2477(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub9 local5 = (Class2_Sub9) this.aClass19_14.method691(); local5 != null; local5 = (Class2_Sub9) this.aClass19_14.method686()) {
			local5.method2473(arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fb;)V")
	private void method2478(@OriginalArg(0) Class2_Sub11 arg0) {
		arg0.method3254();
		arg0.method1006();
		@Pc(9) Class2 local9 = this.aClass19_15.aClass2_47.aClass2_209;
		if (local9 == this.aClass19_15.aClass2_47) {
			this.anInt3241 = -1;
		} else {
			this.anInt3241 = ((Class2_Sub11) local9).anInt1314;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Lclient!dh;")
	@Override
	public Class2_Sub9 method2468() {
		return (Class2_Sub9) this.aClass19_14.method691();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ib;Lclient!fb;)V")
	private void method2479(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		while (arg0 != this.aClass19_15.aClass2_47 && ((Class2_Sub11) arg0).anInt1314 <= arg1.anInt1314) {
			arg0 = arg0.aClass2_209;
		}
		this.aClass19_15.method689(arg1, arg0);
		this.anInt3241 = ((Class2_Sub11) this.aClass19_15.aClass2_47.aClass2_209).anInt1314;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Lclient!dh;)V")
	public synchronized void method2480(@OriginalArg(0) Class2_Sub9 arg0) {
		arg0.method3254();
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()I")
	@Override
	public int method2472() {
		return 0;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "([III)V")
	private void method2481(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub9 local5 = (Class2_Sub9) this.aClass19_14.method691(); local5 != null; local5 = (Class2_Sub9) this.aClass19_14.method686()) {
			local5.method2474(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2471(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3241 < 0) {
				this.method2481(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3240 + arg2 < this.anInt3241) {
				this.anInt3240 += arg2;
				this.method2481(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3241 - this.anInt3240;
			this.method2481(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3240 += local33;
			this.method2475();
			@Pc(60) Class2_Sub11 local60 = (Class2_Sub11) this.aClass19_15.method691();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1005(this);
				if (local68 < 0) {
					local60.anInt1314 = 0;
					this.method2478(local60);
				} else {
					local60.anInt1314 = local68;
					this.method2479(local60.aClass2_209, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2473(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3241 < 0) {
				this.method2477(arg0);
				return;
			}
			if (this.anInt3240 + arg0 < this.anInt3241) {
				this.anInt3240 += arg0;
				this.method2477(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3241 - this.anInt3240;
			this.method2477(local29);
			arg0 -= local29;
			this.anInt3240 += local29;
			this.method2475();
			@Pc(50) Class2_Sub11 local50 = (Class2_Sub11) this.aClass19_15.method691();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1005(this);
				if (local58 < 0) {
					local50.anInt1314 = 0;
					this.method2478(local50);
				} else {
					local50.anInt1314 = local58;
					this.method2479(local50.aClass2_209, local50);
				}
			}
		} while (arg0 != 0);
	}
}
