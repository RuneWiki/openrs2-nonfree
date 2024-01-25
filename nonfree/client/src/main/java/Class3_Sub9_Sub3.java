import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class3_Sub9_Sub3 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "Lclient!eea;")
	private final Class71 aClass71_50 = new Class71();

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "Lclient!eea;")
	private final Class71 aClass71_51 = new Class71();

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
	private int anInt6747 = 0;

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
	private int anInt6748 = -1;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "()Lclient!bk;")
	@Override
	public Class3_Sub9 method6928() {
		return (Class3_Sub9) this.aClass71_50.method2086();
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "()Lclient!bk;")
	@Override
	public Class3_Sub9 method6929() {
		return (Class3_Sub9) this.aClass71_50.method2089();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!uj;Lclient!ww;)V")
	private void method5648(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub51 arg1) {
		while (arg0 != this.aClass71_51.aClass3_73 && ((Class3_Sub51) arg0).anInt9488 <= arg1.anInt9488) {
			arg0 = arg0.aClass3_284;
		}
		Static203.method3790(arg0, arg1);
		this.anInt6748 = ((Class3_Sub51) this.aClass71_51.aClass3_73.aClass3_284).anInt9488;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "([III)V")
	private void method5649(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub9 local5 = (Class3_Sub9) this.aClass71_50.method2089(); local5 != null; local5 = (Class3_Sub9) this.aClass71_50.method2086()) {
			local5.method6927(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6931(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6748 < 0) {
				this.method5650(arg0);
				return;
			}
			if (this.anInt6747 + arg0 < this.anInt6748) {
				this.anInt6747 += arg0;
				this.method5650(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6748 - this.anInt6747;
			this.method5650(local29);
			arg0 -= local29;
			this.anInt6747 += local29;
			this.method5652();
			@Pc(50) Class3_Sub51 local50 = (Class3_Sub51) this.aClass71_51.method2089();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method7823(this);
				if (local58 < 0) {
					local50.anInt9488 = 0;
					this.method5651(local50);
				} else {
					local50.anInt9488 = local58;
					this.method5648(local50.aClass3_284, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6930(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6748 < 0) {
				this.method5649(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6747 + arg2 < this.anInt6748) {
				this.anInt6747 += arg2;
				this.method5649(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6748 - this.anInt6747;
			this.method5649(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6747 += local33;
			this.method5652();
			@Pc(60) Class3_Sub51 local60 = (Class3_Sub51) this.aClass71_51.method2089();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method7823(this);
				if (local68 < 0) {
					local60.anInt9488 = 0;
					this.method5651(local60);
				} else {
					local60.anInt9488 = local68;
					this.method5648(local60.aClass3_284, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "(I)V")
	private void method5650(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub9 local5 = (Class3_Sub9) this.aClass71_50.method2089(); local5 != null; local5 = (Class3_Sub9) this.aClass71_50.method2086()) {
			local5.method6931(arg0);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!ww;)V")
	private void method5651(@OriginalArg(0) Class3_Sub51 arg0) {
		arg0.method7820();
		arg0.method7824();
		@Pc(9) Class3 local9 = this.aClass71_51.aClass3_73.aClass3_284;
		if (local9 == this.aClass71_51.aClass3_73) {
			this.anInt6748 = -1;
		} else {
			this.anInt6748 = ((Class3_Sub51) local9).anInt9488;
		}
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "()V")
	private void method5652() {
		if (this.anInt6747 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub51 local8 = (Class3_Sub51) this.aClass71_51.method2089(); local8 != null; local8 = (Class3_Sub51) this.aClass71_51.method2086()) {
			local8.anInt9488 -= this.anInt6747;
		}
		this.anInt6748 -= this.anInt6747;
		this.anInt6747 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!bk;)V")
	public synchronized void method5653(@OriginalArg(0) Class3_Sub9 arg0) {
		arg0.method7820();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "()I")
	@Override
	public int method6926() {
		return 0;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(Lclient!bk;)V")
	public synchronized void method5654(@OriginalArg(0) Class3_Sub9 arg0) {
		this.aClass71_50.method2080(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "()I")
	public synchronized int method5655() {
		return this.aClass71_50.method2077();
	}
}
