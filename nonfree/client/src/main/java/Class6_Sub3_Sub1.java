import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class6_Sub3_Sub1 extends Class6_Sub3 {

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "Lclient!ada;")
	private final Class8 aClass8_3 = new Class8();

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "Lclient!ada;")
	private final Class8 aClass8_4 = new Class8();

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "I")
	private int anInt254 = 0;

	@OriginalMember(owner = "client!aga", name = "t", descriptor = "I")
	private int anInt255 = -1;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!efa;Lclient!sw;)V")
	private void method264(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub43 arg1) {
		while (arg0 != this.aClass8_4.aClass6_7 && ((Class6_Sub43) arg0).anInt9258 <= arg1.anInt9258) {
			arg0 = arg0.aClass6_299;
		}
		Static18.method330(arg0, arg1);
		this.anInt255 = ((Class6_Sub43) this.aClass8_4.aClass6_7.aClass6_299).anInt9258;
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "([III)V")
	private void method265(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub3 local5 = (Class6_Sub3) this.aClass8_3.method149(); local5 != null; local5 = (Class6_Sub3) this.aClass8_3.method155()) {
			local5.method7799(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "()Lclient!ca;")
	@Override
	public Class6_Sub3 method7803() {
		return (Class6_Sub3) this.aClass8_3.method155();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "()Lclient!ca;")
	@Override
	public Class6_Sub3 method7800() {
		return (Class6_Sub3) this.aClass8_3.method149();
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "()I")
	@Override
	public int method7804() {
		return 0;
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "()V")
	private void method266() {
		if (this.anInt254 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub43 local8 = (Class6_Sub43) this.aClass8_4.method149(); local8 != null; local8 = (Class6_Sub43) this.aClass8_4.method155()) {
			local8.anInt9258 -= this.anInt254;
		}
		this.anInt255 -= this.anInt254;
		this.anInt254 = 0;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!sw;)V")
	private void method267(@OriginalArg(0) Class6_Sub43 arg0) {
		arg0.method9043();
		arg0.method7875();
		@Pc(9) Class6 local9 = this.aClass8_4.aClass6_7.aClass6_299;
		if (local9 == this.aClass8_4.aClass6_7) {
			this.anInt255 = -1;
		} else {
			this.anInt255 = ((Class6_Sub43) local9).anInt9258;
		}
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
	private void method268(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub3 local5 = (Class6_Sub3) this.aClass8_3.method149(); local5 != null; local5 = (Class6_Sub3) this.aClass8_3.method155()) {
			local5.method7801(arg0);
		}
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7805(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt255 < 0) {
				this.method265(arg0, arg1, arg2);
				return;
			}
			if (this.anInt254 + arg2 < this.anInt255) {
				this.anInt254 += arg2;
				this.method265(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt255 - this.anInt254;
			this.method265(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt254 += local33;
			this.method266();
			@Pc(60) Class6_Sub43 local60 = (Class6_Sub43) this.aClass8_4.method149();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method7876(this);
				if (local68 < 0) {
					local60.anInt9258 = 0;
					this.method267(local60);
				} else {
					local60.anInt9258 = local68;
					this.method264(local60.aClass6_299, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "()I")
	public synchronized int method269() {
		return this.aClass8_3.method150();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7801(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt255 < 0) {
				this.method268(arg0);
				return;
			}
			if (this.anInt254 + arg0 < this.anInt255) {
				this.anInt254 += arg0;
				this.method268(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt255 - this.anInt254;
			this.method268(local29);
			arg0 -= local29;
			this.anInt254 += local29;
			this.method266();
			@Pc(50) Class6_Sub43 local50 = (Class6_Sub43) this.aClass8_4.method149();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method7876(this);
				if (local58 < 0) {
					local50.anInt9258 = 0;
					this.method267(local50);
				} else {
					local50.anInt9258 = local58;
					this.method264(local50.aClass6_299, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!ca;)V")
	public synchronized void method270(@OriginalArg(0) Class6_Sub3 arg0) {
		arg0.method9043();
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(Lclient!ca;)V")
	public synchronized void method271(@OriginalArg(0) Class6_Sub3 arg0) {
		this.aClass8_3.method146(arg0);
	}
}
