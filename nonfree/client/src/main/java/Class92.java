import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class92 {

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
	private int anInt2207 = 0;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
	private int anInt2204 = 0;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!go;")
	private Class21 aClass21_1 = null;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	private int anInt2206 = 0;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_12;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "Lclient!pe;")
	private final Class191 aClass191_2;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "[Lclient!hl;")
	private final Class76[] aClass76Array1;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "Lclient!st;")
	public final Class76_Sub7 aClass76_Sub7_1;

	static {
		new Class96(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class92(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aClass121_Sub2_12 = arg0;
		this.aClass191_2 = new Class191(arg0);
		this.aClass76Array1 = new Class76[10];
		this.aClass76Array1[1] = new Class76_Sub5(arg0);
		this.aClass76Array1[2] = new Class76_Sub6(arg0, this.aClass191_2);
		this.aClass76Array1[4] = new Class76_Sub1(arg0, this.aClass191_2);
		this.aClass76Array1[5] = new Class76_Sub9(arg0, this.aClass191_2);
		this.aClass76Array1[6] = new Class76_Sub4(arg0);
		this.aClass76Array1[7] = new Class76_Sub8(arg0);
		this.aClass76Array1[3] = this.aClass76_Sub7_1 = new Class76_Sub7(arg0);
		this.aClass76Array1[8] = new Class76_Sub3(arg0, this.aClass191_2);
		this.aClass76Array1[9] = new Class76_Sub2(arg0, this.aClass191_2);
		if (!this.aClass76Array1[8].method5606()) {
			this.aClass76Array1[8] = this.aClass76Array1[4];
		}
		if (!this.aClass76Array1[9].method5606()) {
			this.aClass76Array1[9] = this.aClass76Array1[8];
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIZI)V")
	public void method1804(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass121_Sub2_12.method4607();
		if (!local5 && (arg1 == 4 || arg1 == 8)) {
			arg1 = 2;
		}
		if (arg1 != 0 && arg2) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt2207) {
			if (this.anInt2207 != 0) {
				this.aClass76Array1[this.anInt2207 & Integer.MAX_VALUE].method5613();
			}
			if (arg1 != 0) {
				this.aClass76Array1[arg1 & Integer.MAX_VALUE].method5611(arg2);
				this.aClass76Array1[Integer.MAX_VALUE & arg1].method5608(arg2);
			}
			this.aClass21_1 = null;
			this.anInt2207 = arg1;
			this.anInt2206 = Integer.MIN_VALUE;
			this.anInt2204 = Integer.MIN_VALUE;
		} else if (this.anInt2207 != 0) {
			this.aClass76Array1[Integer.MAX_VALUE & this.anInt2207].method5608(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIB)V")
	public void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2207 != 0 & (this.anInt2206 != arg1 | arg0 != this.anInt2204)) {
			this.aClass76Array1[this.anInt2207 & Integer.MAX_VALUE].method5604(arg1, arg0);
			this.anInt2206 = arg1;
			this.anInt2204 = arg0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!go;I)Z")
	public boolean method1807(@OriginalArg(1) Class21 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2207 == 0) {
			return false;
		}
		if (this.aClass21_1 != arg0) {
			this.aClass76Array1[Integer.MAX_VALUE & this.anInt2207].method5609(arg1, arg0);
			this.aClass21_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)Z")
	public boolean method1808() {
		return this.aClass76Array1[3].method5606();
	}
}
