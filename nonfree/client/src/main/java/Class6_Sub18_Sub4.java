import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class6_Sub18_Sub4 extends Class6_Sub18 {

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Lclient!ws;")
	private final Class361 aClass361_58 = new Class361();

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Lclient!ws;")
	private final Class361 aClass361_59 = new Class361();

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	private int anInt7790 = -1;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	private int anInt7789 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!mi;)V")
	public synchronized void method6378(@OriginalArg(0) Class6_Sub18 arg0) {
		this.aClass361_58.method7836(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6377(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt7790 < 0) {
				this.method6384(arg0);
				return;
			}
			if (this.anInt7789 + arg0 < this.anInt7790) {
				this.anInt7789 += arg0;
				this.method6384(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt7790 - this.anInt7789;
			this.method6384(local29);
			arg0 -= local29;
			this.anInt7789 += local29;
			this.method6382();
			@Pc(50) Class6_Sub9 local50 = (Class6_Sub9) this.aClass361_59.method7838();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1048(this);
				if (local58 < 0) {
					local50.anInt1026 = 0;
					this.method6383(local50);
				} else {
					local50.anInt1026 = local58;
					this.method6385(local50.aClass6_286, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()Lclient!mi;")
	@Override
	public Class6_Sub18 method6371() {
		return (Class6_Sub18) this.aClass361_58.method7845();
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "()I")
	public synchronized int method6379() {
		return this.aClass361_58.method7841();
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lclient!mi;)V")
	public synchronized void method6380(@OriginalArg(0) Class6_Sub18 arg0) {
		arg0.method7804();
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "([III)V")
	private void method6381(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub18 local5 = (Class6_Sub18) this.aClass361_58.method7838(); local5 != null; local5 = (Class6_Sub18) this.aClass361_58.method7845()) {
			local5.method6375(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "()V")
	private void method6382() {
		if (this.anInt7789 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub9 local8 = (Class6_Sub9) this.aClass361_59.method7838(); local8 != null; local8 = (Class6_Sub9) this.aClass361_59.method7845()) {
			local8.anInt1026 -= this.anInt7789;
		}
		this.anInt7790 -= this.anInt7789;
		this.anInt7789 = 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!bn;)V")
	private void method6383(@OriginalArg(0) Class6_Sub9 arg0) {
		arg0.method7804();
		arg0.method1049();
		@Pc(9) Class6 local9 = this.aClass361_59.aClass6_287.aClass6_286;
		if (local9 == this.aClass361_59.aClass6_287) {
			this.anInt7790 = -1;
		} else {
			this.anInt7790 = ((Class6_Sub9) local9).anInt1026;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6372(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt7790 < 0) {
				this.method6381(arg0, arg1, arg2);
				return;
			}
			if (this.anInt7789 + arg2 < this.anInt7790) {
				this.anInt7789 += arg2;
				this.method6381(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt7790 - this.anInt7789;
			this.method6381(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt7789 += local33;
			this.method6382();
			@Pc(60) Class6_Sub9 local60 = (Class6_Sub9) this.aClass361_59.method7838();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1048(this);
				if (local68 < 0) {
					local60.anInt1026 = 0;
					this.method6383(local60);
				} else {
					local60.anInt1026 = local68;
					this.method6385(local60.aClass6_286, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	private void method6384(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub18 local5 = (Class6_Sub18) this.aClass361_58.method7838(); local5 != null; local5 = (Class6_Sub18) this.aClass361_58.method7845()) {
			local5.method6377(arg0);
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "()I")
	@Override
	public int method6376() {
		return 0;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public Class6_Sub18 method6374() {
		return (Class6_Sub18) this.aClass361_58.method7838();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!kd;Lclient!bn;)V")
	private void method6385(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub9 arg1) {
		while (arg0 != this.aClass361_59.aClass6_287 && ((Class6_Sub9) arg0).anInt1026 <= arg1.anInt1026) {
			arg0 = arg0.aClass6_286;
		}
		Static560.method7565(arg1, arg0);
		this.anInt7790 = ((Class6_Sub9) this.aClass361_59.aClass6_287.aClass6_286).anInt1026;
	}
}
