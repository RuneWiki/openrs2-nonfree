import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class2_Sub8_Sub3 extends Class2_Sub8 {

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "Lclient!qd;")
	private final Class65 aClass65_7 = new Class65();

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "Lclient!qd;")
	private final Class65 aClass65_8 = new Class65();

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
	private int anInt2461 = -1;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
	private int anInt2462 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!qa;)V")
	public synchronized void method1737(@OriginalArg(0) Class2_Sub8 arg0) {
		arg0.method2888();
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	private void method1738(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub8 local5 = (Class2_Sub8) this.aClass65_7.method2115(); local5 != null; local5 = (Class2_Sub8) this.aClass65_7.method2117()) {
			local5.method2182(arg0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ke;)V")
	private void method1739(@OriginalArg(0) Class2_Sub13 arg0) {
		arg0.method2888();
		arg0.method1588();
		@Pc(9) Class2 local9 = this.aClass65_8.aClass2_157.aClass2_209;
		if (local9 == this.aClass65_8.aClass2_157) {
			this.anInt2461 = -1;
		} else {
			this.anInt2461 = ((Class2_Sub13) local9).anInt2260;
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "()I")
	@Override
	public int method2183() {
		return 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!te;Lclient!ke;)V")
	private void method1740(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		while (arg0 != this.aClass65_8.aClass2_157 && ((Class2_Sub13) arg0).anInt2260 <= arg1.anInt2260) {
			arg0 = arg0.aClass2_209;
		}
		this.aClass65_8.method2121(arg0, arg1);
		this.anInt2461 = ((Class2_Sub13) this.aClass65_8.aClass2_157.aClass2_209).anInt2260;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2182(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2461 < 0) {
				this.method1738(arg0);
				return;
			}
			if (this.anInt2462 + arg0 < this.anInt2461) {
				this.anInt2462 += arg0;
				this.method1738(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2461 - this.anInt2462;
			this.method1738(local29);
			arg0 -= local29;
			this.anInt2462 += local29;
			this.method1742();
			@Pc(50) Class2_Sub13 local50 = (Class2_Sub13) this.aClass65_8.method2115();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1589(this);
				if (local58 < 0) {
					local50.anInt2260 = 0;
					this.method1739(local50);
				} else {
					local50.anInt2260 = local58;
					this.method1740(local50.aClass2_209, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "()Lclient!qa;")
	@Override
	public Class2_Sub8 method2179() {
		return (Class2_Sub8) this.aClass65_7.method2117();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2461 < 0) {
				this.method1743(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2462 + arg2 < this.anInt2461) {
				this.anInt2462 += arg2;
				this.method1743(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2461 - this.anInt2462;
			this.method1743(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2462 += local33;
			this.method1742();
			@Pc(60) Class2_Sub13 local60 = (Class2_Sub13) this.aClass65_8.method2115();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1589(this);
				if (local68 < 0) {
					local60.anInt2260 = 0;
					this.method1739(local60);
				} else {
					local60.anInt2260 = local68;
					this.method1740(local60.aClass2_209, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Lclient!qa;)V")
	public synchronized void method1741(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aClass65_7.method2120(arg0);
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "()V")
	private void method1742() {
		if (this.anInt2462 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub13 local8 = (Class2_Sub13) this.aClass65_8.method2115(); local8 != null; local8 = (Class2_Sub13) this.aClass65_8.method2117()) {
			local8.anInt2260 -= this.anInt2462;
		}
		this.anInt2461 -= this.anInt2462;
		this.anInt2462 = 0;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "()Lclient!qa;")
	@Override
	public Class2_Sub8 method2178() {
		return (Class2_Sub8) this.aClass65_7.method2115();
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "([III)V")
	private void method1743(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub8 local5 = (Class2_Sub8) this.aClass65_7.method2115(); local5 != null; local5 = (Class2_Sub8) this.aClass65_7.method2117()) {
			local5.method2181(arg0, arg1, arg2);
		}
	}
}
