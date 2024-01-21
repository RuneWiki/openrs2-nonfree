import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "Lclient!ad;")
	private final Class5 aClass5_8 = new Class5();

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "Lclient!ad;")
	private final Class5 aClass5_9 = new Class5();

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
	private int anInt1083 = 0;

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
	private int anInt1084 = -1;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "()I")
	@Override
	public int method2170() {
		return 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ka;Lclient!cb;)V")
	private void method710(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub3 arg1) {
		while (arg0 != this.aClass5_9.aClass3_9 && ((Class3_Sub3) arg0).anInt371 <= arg1.anInt371) {
			arg0 = arg0.aClass3_117;
		}
		this.aClass5_9.method89(arg1, arg0);
		this.anInt1084 = ((Class3_Sub3) this.aClass5_9.aClass3_9.aClass3_117).anInt371;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2164(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1084 < 0) {
				this.method715(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1083 + arg2 < this.anInt1084) {
				this.anInt1083 += arg2;
				this.method715(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1084 - this.anInt1083;
			this.method715(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1083 += local33;
			this.method714();
			@Pc(60) Class3_Sub3 local60 = (Class3_Sub3) this.aClass5_9.method92();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method333(this);
				if (local68 < 0) {
					local60.anInt371 = 0;
					this.method713(local60);
				} else {
					local60.anInt371 = local68;
					this.method710(local60.aClass3_117, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V")
	private void method711(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub2 local5 = (Class3_Sub2) this.aClass5_8.method92(); local5 != null; local5 = (Class3_Sub2) this.aClass5_8.method90()) {
			local5.method2169(arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()Lclient!mc;")
	@Override
	public Class3_Sub2 method2167() {
		return (Class3_Sub2) this.aClass5_8.method90();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!mc;)V")
	public synchronized void method712(@OriginalArg(0) Class3_Sub2 arg0) {
		arg0.method2264();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!cb;)V")
	private void method713(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.method2264();
		arg0.method334();
		@Pc(9) Class3 local9 = this.aClass5_9.aClass3_9.aClass3_117;
		if (local9 == this.aClass5_9.aClass3_9) {
			this.anInt1084 = -1;
		} else {
			this.anInt1084 = ((Class3_Sub3) local9).anInt371;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()Lclient!mc;")
	@Override
	public Class3_Sub2 method2166() {
		return (Class3_Sub2) this.aClass5_8.method92();
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "()V")
	private void method714() {
		if (this.anInt1083 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub3 local8 = (Class3_Sub3) this.aClass5_9.method92(); local8 != null; local8 = (Class3_Sub3) this.aClass5_9.method90()) {
			local8.anInt371 -= this.anInt1083;
		}
		this.anInt1084 -= this.anInt1083;
		this.anInt1083 = 0;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "([III)V")
	private void method715(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub2 local5 = (Class3_Sub2) this.aClass5_8.method92(); local5 != null; local5 = (Class3_Sub2) this.aClass5_8.method90()) {
			local5.method2168(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lclient!mc;)V")
	public synchronized void method716(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aClass5_8.method85(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method2169(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1084 < 0) {
				this.method711(arg0);
				return;
			}
			if (this.anInt1083 + arg0 < this.anInt1084) {
				this.anInt1083 += arg0;
				this.method711(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1084 - this.anInt1083;
			this.method711(local29);
			arg0 -= local29;
			this.anInt1083 += local29;
			this.method714();
			@Pc(50) Class3_Sub3 local50 = (Class3_Sub3) this.aClass5_9.method92();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method333(this);
				if (local58 < 0) {
					local50.anInt371 = 0;
					this.method713(local50);
				} else {
					local50.anInt371 = local58;
					this.method710(local50.aClass3_117, local50);
				}
			}
		} while (arg0 != 0);
	}
}
