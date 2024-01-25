import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class8_Sub16_Sub5 extends Class8_Sub16 {

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "Lclient!bq;")
	private final Class43 aClass43_57 = new Class43();

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "Lclient!bq;")
	private final Class43 aClass43_58 = new Class43();

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
	private int anInt9078 = -1;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	private int anInt9079 = 0;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "()I")
	public synchronized int method7436() {
		return this.aClass43_57.method1430();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7435(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt9078 < 0) {
				this.method7439(arg0);
				return;
			}
			if (this.anInt9079 + arg0 < this.anInt9078) {
				this.anInt9079 += arg0;
				this.method7439(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt9078 - this.anInt9079;
			this.method7439(local29);
			arg0 -= local29;
			this.anInt9079 += local29;
			this.method7438();
			@Pc(50) Class8_Sub45 local50 = (Class8_Sub45) this.aClass43_58.method1422();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method7590(this);
				if (local58 < 0) {
					local50.anInt9303 = 0;
					this.method7441(local50);
				} else {
					local50.anInt9303 = local58;
					this.method7440(local50.aClass8_300, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "()Lclient!eia;")
	@Override
	public Class8_Sub16 method7429() {
		return (Class8_Sub16) this.aClass43_57.method1426();
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "()Lclient!eia;")
	@Override
	public Class8_Sub16 method7434() {
		return (Class8_Sub16) this.aClass43_57.method1422();
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "([III)V")
	private void method7437(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class8_Sub16 local5 = (Class8_Sub16) this.aClass43_57.method1422(); local5 != null; local5 = (Class8_Sub16) this.aClass43_57.method1426()) {
			local5.method7433(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "()V")
	private void method7438() {
		if (this.anInt9079 <= 0) {
			return;
		}
		for (@Pc(8) Class8_Sub45 local8 = (Class8_Sub45) this.aClass43_58.method1422(); local8 != null; local8 = (Class8_Sub45) this.aClass43_58.method1426()) {
			local8.anInt9303 -= this.anInt9079;
		}
		this.anInt9078 -= this.anInt9079;
		this.anInt9079 = 0;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
	private void method7439(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class8_Sub16 local5 = (Class8_Sub16) this.aClass43_57.method1422(); local5 != null; local5 = (Class8_Sub16) this.aClass43_57.method1426()) {
			local5.method7435(arg0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!mc;Lclient!te;)V")
	private void method7440(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8_Sub45 arg1) {
		while (arg0 != this.aClass43_58.aClass8_37 && ((Class8_Sub45) arg0).anInt9303 <= arg1.anInt9303) {
			arg0 = arg0.aClass8_300;
		}
		Static501.method7286(arg0, arg1);
		this.anInt9078 = ((Class8_Sub45) this.aClass43_58.aClass8_37.aClass8_300).anInt9303;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "()I")
	@Override
	public int method7431() {
		return 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7430(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt9078 < 0) {
				this.method7437(arg0, arg1, arg2);
				return;
			}
			if (this.anInt9079 + arg2 < this.anInt9078) {
				this.anInt9079 += arg2;
				this.method7437(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt9078 - this.anInt9079;
			this.method7437(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt9079 += local33;
			this.method7438();
			@Pc(60) Class8_Sub45 local60 = (Class8_Sub45) this.aClass43_58.method1422();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method7590(this);
				if (local68 < 0) {
					local60.anInt9303 = 0;
					this.method7441(local60);
				} else {
					local60.anInt9303 = local68;
					this.method7440(local60.aClass8_300, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!te;)V")
	private void method7441(@OriginalArg(0) Class8_Sub45 arg0) {
		arg0.method8640();
		arg0.method7591();
		@Pc(9) Class8 local9 = this.aClass43_58.aClass8_37.aClass8_300;
		if (local9 == this.aClass43_58.aClass8_37) {
			this.anInt9078 = -1;
		} else {
			this.anInt9078 = ((Class8_Sub45) local9).anInt9303;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!eia;)V")
	public synchronized void method7442(@OriginalArg(0) Class8_Sub16 arg0) {
		this.aClass43_57.method1434(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Lclient!eia;)V")
	public synchronized void method7443(@OriginalArg(0) Class8_Sub16 arg0) {
		arg0.method8640();
	}
}
