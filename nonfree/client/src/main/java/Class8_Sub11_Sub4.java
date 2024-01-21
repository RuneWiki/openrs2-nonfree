import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class8_Sub11_Sub4 extends Class8_Sub11 {

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Lclient!m;")
	private final Class49 aClass49_12 = new Class49();

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!m;")
	private final Class49 aClass49_13 = new Class49();

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
	private int anInt2906 = -1;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
	private int anInt2905 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!rf;)V")
	public synchronized void method1922(@OriginalArg(0) Class8_Sub11 arg0) {
		this.aClass49_12.method1104(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1917(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2906 < 0) {
				this.method1924(arg0);
				return;
			}
			if (this.anInt2905 + arg0 < this.anInt2906) {
				this.anInt2905 += arg0;
				this.method1924(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2906 - this.anInt2905;
			this.method1924(local29);
			arg0 -= local29;
			this.anInt2905 += local29;
			this.method1928();
			@Pc(50) Class8_Sub15 local50 = (Class8_Sub15) this.aClass49_13.method1107();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1295(this);
				if (local58 < 0) {
					local50.anInt2164 = 0;
					this.method1926(local50);
				} else {
					local50.anInt2164 = local58;
					this.method1923(local50.aClass8_128, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!qe;Lclient!nc;)V")
	private void method1923(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8_Sub15 arg1) {
		while (arg0 != this.aClass49_13.aClass8_75 && ((Class8_Sub15) arg0).anInt2164 <= arg1.anInt2164) {
			arg0 = arg0.aClass8_128;
		}
		this.aClass49_13.method1110(arg0, arg1);
		this.anInt2906 = ((Class8_Sub15) this.aClass49_13.aClass8_75.aClass8_128).anInt2164;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()Lclient!rf;")
	@Override
	public Class8_Sub11 method1918() {
		return (Class8_Sub11) this.aClass49_12.method1109();
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	private void method1924(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class8_Sub11 local5 = (Class8_Sub11) this.aClass49_12.method1107(); local5 != null; local5 = (Class8_Sub11) this.aClass49_12.method1109()) {
			local5.method1917(arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "([III)V")
	private void method1925(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class8_Sub11 local5 = (Class8_Sub11) this.aClass49_12.method1107(); local5 != null; local5 = (Class8_Sub11) this.aClass49_12.method1109()) {
			local5.method1916(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()Lclient!rf;")
	@Override
	public Class8_Sub11 method1920() {
		return (Class8_Sub11) this.aClass49_12.method1107();
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()I")
	@Override
	public int method1919() {
		return 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!nc;)V")
	private void method1926(@OriginalArg(0) Class8_Sub15 arg0) {
		arg0.method2013();
		arg0.method1296();
		@Pc(9) Class8 local9 = this.aClass49_13.aClass8_75.aClass8_128;
		if (local9 == this.aClass49_13.aClass8_75) {
			this.anInt2906 = -1;
		} else {
			this.anInt2906 = ((Class8_Sub15) local9).anInt2164;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1921(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2906 < 0) {
				this.method1925(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2905 + arg2 < this.anInt2906) {
				this.anInt2905 += arg2;
				this.method1925(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2906 - this.anInt2905;
			this.method1925(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2905 += local33;
			this.method1928();
			@Pc(60) Class8_Sub15 local60 = (Class8_Sub15) this.aClass49_13.method1107();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1295(this);
				if (local68 < 0) {
					local60.anInt2164 = 0;
					this.method1926(local60);
				} else {
					local60.anInt2164 = local68;
					this.method1923(local60.aClass8_128, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Lclient!rf;)V")
	public synchronized void method1927(@OriginalArg(0) Class8_Sub11 arg0) {
		arg0.method2013();
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
	private void method1928() {
		if (this.anInt2905 <= 0) {
			return;
		}
		for (@Pc(8) Class8_Sub15 local8 = (Class8_Sub15) this.aClass49_13.method1107(); local8 != null; local8 = (Class8_Sub15) this.aClass49_13.method1109()) {
			local8.anInt2164 -= this.anInt2905;
		}
		this.anInt2906 -= this.anInt2905;
		this.anInt2905 = 0;
	}
}
