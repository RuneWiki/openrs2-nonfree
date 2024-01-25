import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class3_Sub12_Sub1 extends Class3_Sub12 {

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "Lclient!qw;")
	private final Class302 aClass302_11 = new Class302();

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "Lclient!qw;")
	private final Class302 aClass302_12 = new Class302();

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
	private int anInt2092 = 0;

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
	private int anInt2093 = -1;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "()Lclient!pp;")
	@Override
	public Class3_Sub12 method8945() {
		return (Class3_Sub12) this.aClass302_11.method6605();
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "([III)V")
	private void method1761(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub12 local5 = (Class3_Sub12) this.aClass302_11.method6603(); local5 != null; local5 = (Class3_Sub12) this.aClass302_11.method6605()) {
			local5.method8944(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "()Lclient!pp;")
	@Override
	public Class3_Sub12 method8946() {
		return (Class3_Sub12) this.aClass302_11.method6603();
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
	private void method1762(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub12 local5 = (Class3_Sub12) this.aClass302_11.method6603(); local5 != null; local5 = (Class3_Sub12) this.aClass302_11.method6605()) {
			local5.method8942(arg0);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8942(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2093 < 0) {
				this.method1762(arg0);
				return;
			}
			if (this.anInt2092 + arg0 < this.anInt2093) {
				this.anInt2092 += arg0;
				this.method1762(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2093 - this.anInt2092;
			this.method1762(local29);
			arg0 -= local29;
			this.anInt2092 += local29;
			this.method1767();
			@Pc(50) Class3_Sub44 local50 = (Class3_Sub44) this.aClass302_12.method6603();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method6810(this);
				if (local58 < 0) {
					local50.anInt8284 = 0;
					this.method1764(local50);
				} else {
					local50.anInt8284 = local58;
					this.method1768(local50.aClass3_337, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8948(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2093 < 0) {
				this.method1761(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2092 + arg2 < this.anInt2093) {
				this.anInt2092 += arg2;
				this.method1761(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2093 - this.anInt2092;
			this.method1761(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2092 += local33;
			this.method1767();
			@Pc(60) Class3_Sub44 local60 = (Class3_Sub44) this.aClass302_12.method6603();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method6810(this);
				if (local68 < 0) {
					local60.anInt8284 = 0;
					this.method1764(local60);
				} else {
					local60.anInt8284 = local68;
					this.method1768(local60.aClass3_337, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "()I")
	public synchronized int method1763() {
		return this.aClass302_11.method6608();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ria;)V")
	private void method1764(@OriginalArg(0) Class3_Sub44 arg0) {
		arg0.method9034();
		arg0.method6811();
		@Pc(9) Class3 local9 = this.aClass302_12.aClass3_241.aClass3_337;
		if (local9 == this.aClass302_12.aClass3_241) {
			this.anInt2093 = -1;
		} else {
			this.anInt2093 = ((Class3_Sub44) local9).anInt8284;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!pp;)V")
	public synchronized void method1765(@OriginalArg(0) Class3_Sub12 arg0) {
		this.aClass302_11.method6610(arg0);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(Lclient!pp;)V")
	public synchronized void method1766(@OriginalArg(0) Class3_Sub12 arg0) {
		arg0.method9034();
	}

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "()V")
	private void method1767() {
		if (this.anInt2092 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub44 local8 = (Class3_Sub44) this.aClass302_12.method6603(); local8 != null; local8 = (Class3_Sub44) this.aClass302_12.method6605()) {
			local8.anInt8284 -= this.anInt2092;
		}
		this.anInt2093 -= this.anInt2092;
		this.anInt2092 = 0;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "()I")
	@Override
	public int method8947() {
		return 0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!mg;Lclient!ria;)V")
	private void method1768(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub44 arg1) {
		while (arg0 != this.aClass302_12.aClass3_241 && ((Class3_Sub44) arg0).anInt8284 <= arg1.anInt8284) {
			arg0 = arg0.aClass3_337;
		}
		Static341.method4981(arg1, arg0);
		this.anInt2093 = ((Class3_Sub44) this.aClass302_12.aClass3_241.aClass3_337).anInt8284;
	}
}
