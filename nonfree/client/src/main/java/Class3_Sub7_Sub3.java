import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class3_Sub7_Sub3 extends Class3_Sub7 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!qia;")
	private final Class276 aClass276_15 = new Class276();

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!qia;")
	private final Class276 aClass276_16 = new Class276();

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt2256 = -1;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private int anInt2255 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6002(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2256 < 0) {
				this.method2213(arg0);
				return;
			}
			if (this.anInt2255 + arg0 < this.anInt2256) {
				this.anInt2255 += arg0;
				this.method2213(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2256 - this.anInt2255;
			this.method2213(local29);
			arg0 -= local29;
			this.anInt2255 += local29;
			this.method2214();
			@Pc(50) Class3_Sub4 local50 = (Class3_Sub4) this.aClass276_16.method6907();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method500(this);
				if (local58 < 0) {
					local50.anInt489 = 0;
					this.method2216(local50);
				} else {
					local50.anInt489 = local58;
					this.method2215(local50.aClass3_300, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "()Lclient!rn;")
	@Override
	public Class3_Sub7 method6005() {
		return (Class3_Sub7) this.aClass276_15.method6907();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!rn;)V")
	public synchronized void method2209(@OriginalArg(0) Class3_Sub7 arg0) {
		this.aClass276_15.method6905(arg0);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Lclient!rn;)V")
	public synchronized void method2210(@OriginalArg(0) Class3_Sub7 arg0) {
		arg0.method8671();
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "()I")
	public synchronized int method2211() {
		return this.aClass276_15.method6918();
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "([III)V")
	private void method2212(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub7 local5 = (Class3_Sub7) this.aClass276_15.method6907(); local5 != null; local5 = (Class3_Sub7) this.aClass276_15.method6912()) {
			local5.method6003(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	private void method2213(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub7 local5 = (Class3_Sub7) this.aClass276_15.method6907(); local5 != null; local5 = (Class3_Sub7) this.aClass276_15.method6912()) {
			local5.method6002(arg0);
		}
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "()V")
	private void method2214() {
		if (this.anInt2255 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub4 local8 = (Class3_Sub4) this.aClass276_16.method6907(); local8 != null; local8 = (Class3_Sub4) this.aClass276_16.method6912()) {
			local8.anInt489 -= this.anInt2255;
		}
		this.anInt2256 -= this.anInt2255;
		this.anInt2255 = 0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ns;Lclient!b;)V")
	private void method2215(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		while (arg0 != this.aClass276_16.aClass3_231 && ((Class3_Sub4) arg0).anInt489 <= arg1.anInt489) {
			arg0 = arg0.aClass3_300;
		}
		Static351.method5754(arg1, arg0);
		this.anInt2256 = ((Class3_Sub4) this.aClass276_16.aClass3_231.aClass3_300).anInt489;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2256 < 0) {
				this.method2212(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2255 + arg2 < this.anInt2256) {
				this.anInt2255 += arg2;
				this.method2212(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2256 - this.anInt2255;
			this.method2212(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2255 += local33;
			this.method2214();
			@Pc(60) Class3_Sub4 local60 = (Class3_Sub4) this.aClass276_16.method6907();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method500(this);
				if (local68 < 0) {
					local60.anInt489 = 0;
					this.method2216(local60);
				} else {
					local60.anInt489 = local68;
					this.method2215(local60.aClass3_300, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()I")
	@Override
	public int method6000() {
		return 0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!b;)V")
	private void method2216(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.method8671();
		arg0.method499();
		@Pc(9) Class3 local9 = this.aClass276_16.aClass3_231.aClass3_300;
		if (local9 == this.aClass276_16.aClass3_231) {
			this.anInt2256 = -1;
		} else {
			this.anInt2256 = ((Class3_Sub4) local9).anInt489;
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "()Lclient!rn;")
	@Override
	public Class3_Sub7 method6006() {
		return (Class3_Sub7) this.aClass276_15.method6912();
	}
}
