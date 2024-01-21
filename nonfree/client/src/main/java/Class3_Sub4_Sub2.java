import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Lclient!of;")
	private final Class70 aClass70_10 = new Class70();

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "Lclient!of;")
	private final Class70 aClass70_11 = new Class70();

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
	private int anInt2130 = -1;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
	private int anInt2131 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!pg;)V")
	public synchronized void method1516(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aClass70_10.method1963(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Lclient!pg;)V")
	public synchronized void method1517(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.method3159();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1971(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2130 < 0) {
				this.method1521(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2131 + arg2 < this.anInt2130) {
				this.anInt2131 += arg2;
				this.method1521(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2130 - this.anInt2131;
			this.method1521(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2131 += local33;
			this.method1518();
			@Pc(60) Class3_Sub2 local60 = (Class3_Sub2) this.aClass70_11.method1953();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method137(this);
				if (local68 < 0) {
					local60.anInt197 = 0;
					this.method1520(local60);
				} else {
					local60.anInt197 = local68;
					this.method1522(local60.aClass3_215, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "()V")
	private void method1518() {
		if (this.anInt2131 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub2 local8 = (Class3_Sub2) this.aClass70_11.method1953(); local8 != null; local8 = (Class3_Sub2) this.aClass70_11.method1948()) {
			local8.anInt197 -= this.anInt2131;
		}
		this.anInt2130 -= this.anInt2131;
		this.anInt2131 = 0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()Lclient!pg;")
	@Override
	public Class3_Sub4 method1973() {
		return (Class3_Sub4) this.aClass70_10.method1948();
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
	private void method1519(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub4 local5 = (Class3_Sub4) this.aClass70_10.method1953(); local5 != null; local5 = (Class3_Sub4) this.aClass70_10.method1948()) {
			local5.method1975(arg0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ae;)V")
	private void method1520(@OriginalArg(0) Class3_Sub2 arg0) {
		arg0.method3159();
		arg0.method138();
		@Pc(9) Class3 local9 = this.aClass70_11.aClass3_139.aClass3_215;
		if (local9 == this.aClass70_11.aClass3_139) {
			this.anInt2130 = -1;
		} else {
			this.anInt2130 = ((Class3_Sub2) local9).anInt197;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()I")
	@Override
	public int method1970() {
		return 0;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "([III)V")
	private void method1521(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub4 local5 = (Class3_Sub4) this.aClass70_10.method1953(); local5 != null; local5 = (Class3_Sub4) this.aClass70_10.method1948()) {
			local5.method1972(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!n;Lclient!ae;)V")
	private void method1522(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		while (arg0 != this.aClass70_11.aClass3_139 && ((Class3_Sub2) arg0).anInt197 <= arg1.anInt197) {
			arg0 = arg0.aClass3_215;
		}
		this.aClass70_11.method1947(arg0, arg1);
		this.anInt2130 = ((Class3_Sub2) this.aClass70_11.aClass3_139.aClass3_215).anInt197;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1975(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2130 < 0) {
				this.method1519(arg0);
				return;
			}
			if (this.anInt2131 + arg0 < this.anInt2130) {
				this.anInt2131 += arg0;
				this.method1519(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2130 - this.anInt2131;
			this.method1519(local29);
			arg0 -= local29;
			this.anInt2131 += local29;
			this.method1518();
			@Pc(50) Class3_Sub2 local50 = (Class3_Sub2) this.aClass70_11.method1953();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method137(this);
				if (local58 < 0) {
					local50.anInt197 = 0;
					this.method1520(local50);
				} else {
					local50.anInt197 = local58;
					this.method1522(local50.aClass3_215, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()Lclient!pg;")
	@Override
	public Class3_Sub4 method1976() {
		return (Class3_Sub4) this.aClass70_10.method1953();
	}
}
