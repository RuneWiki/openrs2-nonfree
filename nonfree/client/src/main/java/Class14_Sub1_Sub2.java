import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dka")
public final class Class14_Sub1_Sub2 extends Class14_Sub1 {

	@OriginalMember(owner = "client!dka", name = "r", descriptor = "Lclient!bd;")
	private final Class32 aClass32_8 = new Class32();

	@OriginalMember(owner = "client!dka", name = "q", descriptor = "Lclient!bd;")
	private final Class32 aClass32_9 = new Class32();

	@OriginalMember(owner = "client!dka", name = "s", descriptor = "I")
	private int anInt1879 = 0;

	@OriginalMember(owner = "client!dka", name = "p", descriptor = "I")
	private int anInt1880 = -1;

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "()Lclient!ec;")
	@Override
	public Class14_Sub1 method9320() {
		return (Class14_Sub1) this.aClass32_8.method577();
	}

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "([III)V")
	private void method1804(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class14_Sub1 local5 = (Class14_Sub1) this.aClass32_8.method584(); local5 != null; local5 = (Class14_Sub1) this.aClass32_8.method577()) {
			local5.method9319(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(Lclient!ec;)V")
	public synchronized void method1805(@OriginalArg(0) Class14_Sub1 arg0) {
		this.aClass32_8.method585(arg0);
	}

	@OriginalMember(owner = "client!dka", name = "e", descriptor = "()I")
	public synchronized int method1806() {
		return this.aClass32_8.method589();
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "()Lclient!ec;")
	@Override
	public Class14_Sub1 method9316() {
		return (Class14_Sub1) this.aClass32_8.method584();
	}

	@OriginalMember(owner = "client!dka", name = "f", descriptor = "()V")
	private void method1807() {
		if (this.anInt1879 <= 0) {
			return;
		}
		for (@Pc(8) Class14_Sub49 local8 = (Class14_Sub49) this.aClass32_9.method584(); local8 != null; local8 = (Class14_Sub49) this.aClass32_9.method577()) {
			local8.anInt10326 -= this.anInt1879;
		}
		this.anInt1880 -= this.anInt1879;
		this.anInt1879 = 0;
	}

	@OriginalMember(owner = "client!dka", name = "d", descriptor = "()I")
	@Override
	public int method9321() {
		return 0;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Lclient!wj;Lclient!ut;)V")
	private void method1808(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14_Sub49 arg1) {
		while (arg0 != this.aClass32_9.aClass14_27 && ((Class14_Sub49) arg0).anInt10326 <= arg1.anInt10326) {
			arg0 = arg0.aClass14_339;
		}
		Static38.method666(arg1, arg0);
		this.anInt1880 = ((Class14_Sub49) this.aClass32_9.aClass14_27.aClass14_339).anInt10326;
	}

	@OriginalMember(owner = "client!dka", name = "e", descriptor = "(I)V")
	private void method1809(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class14_Sub1 local5 = (Class14_Sub1) this.aClass32_8.method584(); local5 != null; local5 = (Class14_Sub1) this.aClass32_8.method577()) {
			local5.method9318(arg0);
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Lclient!ec;)V")
	public synchronized void method1810(@OriginalArg(0) Class14_Sub1 arg0) {
		arg0.method9513();
	}

	@OriginalMember(owner = "client!dka", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method9318(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1880 < 0) {
				this.method1809(arg0);
				return;
			}
			if (this.anInt1879 + arg0 < this.anInt1880) {
				this.anInt1879 += arg0;
				this.method1809(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1880 - this.anInt1879;
			this.method1809(local29);
			arg0 -= local29;
			this.anInt1879 += local29;
			this.method1807();
			@Pc(50) Class14_Sub49 local50 = (Class14_Sub49) this.aClass32_9.method584();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method8836(this);
				if (local58 < 0) {
					local50.anInt10326 = 0;
					this.method1811(local50);
				} else {
					local50.anInt10326 = local58;
					this.method1808(local50.aClass14_339, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Lclient!ut;)V")
	private void method1811(@OriginalArg(0) Class14_Sub49 arg0) {
		arg0.method9513();
		arg0.method8837();
		@Pc(9) Class14 local9 = this.aClass32_9.aClass14_27.aClass14_339;
		if (local9 == this.aClass32_9.aClass14_27) {
			this.anInt1880 = -1;
		} else {
			this.anInt1880 = ((Class14_Sub49) local9).anInt10326;
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method9317(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1880 < 0) {
				this.method1804(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1879 + arg2 < this.anInt1880) {
				this.anInt1879 += arg2;
				this.method1804(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1880 - this.anInt1879;
			this.method1804(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1879 += local33;
			this.method1807();
			@Pc(60) Class14_Sub49 local60 = (Class14_Sub49) this.aClass32_9.method584();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method8836(this);
				if (local68 < 0) {
					local60.anInt10326 = 0;
					this.method1811(local60);
				} else {
					local60.anInt10326 = local68;
					this.method1808(local60.aClass14_339, local60);
				}
			}
		} while (arg2 != 0);
	}
}
