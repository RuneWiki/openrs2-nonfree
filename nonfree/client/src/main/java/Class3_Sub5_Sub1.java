import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Lclient!ug;")
	private final Class243 aClass243_8 = new Class243();

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Lclient!ug;")
	private final Class243 aClass243_9 = new Class243();

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
	private int anInt1191 = -1;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
	private int anInt1192 = 0;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "()Lclient!bl;")
	@Override
	public Class3_Sub5 method5123() {
		return (Class3_Sub5) this.aClass243_8.method5208();
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "()I")
	@Override
	public int method5122() {
		return 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!bl;)V")
	public synchronized void method886(@OriginalArg(0) Class3_Sub5 arg0) {
		arg0.method5977();
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "()I")
	public synchronized int method887() {
		return this.aClass243_8.method5201();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5117(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1191 < 0) {
				this.method888(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1192 + arg2 < this.anInt1191) {
				this.anInt1192 += arg2;
				this.method888(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1191 - this.anInt1192;
			this.method888(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1192 += local33;
			this.method891();
			@Pc(60) Class3_Sub18 local60 = (Class3_Sub18) this.aClass243_9.method5208();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2396(this);
				if (local68 < 0) {
					local60.anInt2991 = 0;
					this.method892(local60);
				} else {
					local60.anInt2991 = local68;
					this.method890(local60.aClass3_261, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "([III)V")
	private void method888(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub5 local5 = (Class3_Sub5) this.aClass243_8.method5208(); local5 != null; local5 = (Class3_Sub5) this.aClass243_8.method5203()) {
			local5.method5121(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(Lclient!bl;)V")
	public synchronized void method889(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aClass243_8.method5209(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!qg;Lclient!he;)V")
	private void method890(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub18 arg1) {
		while (arg0 != this.aClass243_9.aClass3_231 && ((Class3_Sub18) arg0).anInt2991 <= arg1.anInt2991) {
			arg0 = arg0.aClass3_261;
		}
		Static101.method5329(arg0, arg1);
		this.anInt1191 = ((Class3_Sub18) this.aClass243_9.aClass3_231.aClass3_261).anInt2991;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5119(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1191 < 0) {
				this.method893(arg0);
				return;
			}
			if (this.anInt1192 + arg0 < this.anInt1191) {
				this.anInt1192 += arg0;
				this.method893(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1191 - this.anInt1192;
			this.method893(local29);
			arg0 -= local29;
			this.anInt1192 += local29;
			this.method891();
			@Pc(50) Class3_Sub18 local50 = (Class3_Sub18) this.aClass243_9.method5208();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2396(this);
				if (local58 < 0) {
					local50.anInt2991 = 0;
					this.method892(local50);
				} else {
					local50.anInt2991 = local58;
					this.method890(local50.aClass3_261, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "()V")
	private void method891() {
		if (this.anInt1192 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub18 local8 = (Class3_Sub18) this.aClass243_9.method5208(); local8 != null; local8 = (Class3_Sub18) this.aClass243_9.method5203()) {
			local8.anInt2991 -= this.anInt1192;
		}
		this.anInt1191 -= this.anInt1192;
		this.anInt1192 = 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!he;)V")
	private void method892(@OriginalArg(0) Class3_Sub18 arg0) {
		arg0.method5977();
		arg0.method2397();
		@Pc(9) Class3 local9 = this.aClass243_9.aClass3_231.aClass3_261;
		if (local9 == this.aClass243_9.aClass3_231) {
			this.anInt1191 = -1;
		} else {
			this.anInt1191 = ((Class3_Sub18) local9).anInt2991;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "()Lclient!bl;")
	@Override
	public Class3_Sub5 method5120() {
		return (Class3_Sub5) this.aClass243_8.method5203();
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
	private void method893(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub5 local5 = (Class3_Sub5) this.aClass243_8.method5208(); local5 != null; local5 = (Class3_Sub5) this.aClass243_8.method5203()) {
			local5.method5119(arg0);
		}
	}
}
