import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class3_Sub10_Sub1 extends Class3_Sub10 {

	@OriginalMember(owner = "client!he", name = "t", descriptor = "Lclient!c;")
	private final Class11 aClass11_5 = new Class11();

	@OriginalMember(owner = "client!he", name = "u", descriptor = "Lclient!c;")
	private final Class11 aClass11_6 = new Class11();

	@OriginalMember(owner = "client!he", name = "v", descriptor = "I")
	private int anInt1228 = -1;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "I")
	private int anInt1229 = 0;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()Lclient!hb;")
	@Override
	public Class3_Sub10 method1869() {
		return (Class3_Sub10) this.aClass11_5.method187();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1870(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1228 < 0) {
				this.method857(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1229 + arg2 < this.anInt1228) {
				this.anInt1229 += arg2;
				this.method857(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1228 - this.anInt1229;
			this.method857(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1229 += local33;
			this.method859();
			@Pc(60) Class3_Sub13 local60 = (Class3_Sub13) this.aClass11_6.method189();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1232(this);
				if (local68 < 0) {
					local60.anInt1827 = 0;
					this.method860(local60);
				} else {
					local60.anInt1827 = local68;
					this.method858(local60.aClass3_116, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "([III)V")
	private void method857(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub10 local5 = (Class3_Sub10) this.aClass11_5.method189(); local5 != null; local5 = (Class3_Sub10) this.aClass11_5.method187()) {
			local5.method1868(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ib;Lclient!mb;)V")
	private void method858(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub13 arg1) {
		while (arg0 != this.aClass11_6.aClass3_11 && ((Class3_Sub13) arg0).anInt1827 <= arg1.anInt1827) {
			arg0 = arg0.aClass3_116;
		}
		this.aClass11_6.method199(arg1, arg0);
		this.anInt1228 = ((Class3_Sub13) this.aClass11_6.aClass3_11.aClass3_116).anInt1827;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()Lclient!hb;")
	@Override
	public Class3_Sub10 method1867() {
		return (Class3_Sub10) this.aClass11_5.method189();
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "()V")
	private void method859() {
		if (this.anInt1229 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub13 local8 = (Class3_Sub13) this.aClass11_6.method189(); local8 != null; local8 = (Class3_Sub13) this.aClass11_6.method187()) {
			local8.anInt1827 -= this.anInt1229;
		}
		this.anInt1228 -= this.anInt1229;
		this.anInt1229 = 0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()I")
	@Override
	public int method1866() {
		return 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!mb;)V")
	private void method860(@OriginalArg(0) Class3_Sub13 arg0) {
		arg0.method1962();
		arg0.method1233();
		@Pc(9) Class3 local9 = this.aClass11_6.aClass3_11.aClass3_116;
		if (local9 == this.aClass11_6.aClass3_11) {
			this.anInt1228 = -1;
		} else {
			this.anInt1228 = ((Class3_Sub13) local9).anInt1827;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1865(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1228 < 0) {
				this.method863(arg0);
				return;
			}
			if (this.anInt1229 + arg0 < this.anInt1228) {
				this.anInt1229 += arg0;
				this.method863(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1228 - this.anInt1229;
			this.method863(local29);
			arg0 -= local29;
			this.anInt1229 += local29;
			this.method859();
			@Pc(50) Class3_Sub13 local50 = (Class3_Sub13) this.aClass11_6.method189();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1232(this);
				if (local58 < 0) {
					local50.anInt1827 = 0;
					this.method860(local50);
				} else {
					local50.anInt1827 = local58;
					this.method858(local50.aClass3_116, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!hb;)V")
	public synchronized void method861(@OriginalArg(0) Class3_Sub10 arg0) {
		arg0.method1962();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!hb;)V")
	public synchronized void method862(@OriginalArg(0) Class3_Sub10 arg0) {
		this.aClass11_5.method197(arg0);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	private void method863(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub10 local5 = (Class3_Sub10) this.aClass11_5.method189(); local5 != null; local5 = (Class3_Sub10) this.aClass11_5.method187()) {
			local5.method1865(arg0);
		}
	}
}
