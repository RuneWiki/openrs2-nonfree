import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class68 implements Interface3 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!lb;")
	private Class45 aClass45_14 = new Class45();

	@OriginalMember(owner = "client!r", name = "r", descriptor = "I")
	private int anInt2273 = 0;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	private int anInt2275 = 128;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Lclient!c;")
	private final Class10 aClass10_26;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	private final int anInt2274;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "[Lclient!k;")
	private final Class4_Sub10[] aClass4_Sub10Array1;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!c;Lclient!c;IDI)V")
	public Class68(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble9 = arg3;
		this.anInt2275 = arg4;
		this.aClass10_26 = arg1;
		this.anInt2274 = arg2;
		this.anInt2273 = this.anInt2274;
		@Pc(38) int[] local38 = arg0.method1773(0);
		@Pc(41) int local41 = local38.length;
		this.aClass4_Sub10Array1 = new Class4_Sub10[arg0.method1772(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class4_Sub9 local63 = new Class4_Sub9(arg0.method1774(0, local38[local50]));
			this.aClass4_Sub10Array1[local38[local50]] = new Class4_Sub10(local63);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(DI)V")
	public void method1565(@OriginalArg(0) double arg0) {
		this.aDouble9 = arg0;
		this.method1569();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method1562(@OriginalArg(1) int arg0) {
		return this.anInt2275 == 64;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	@Override
	public int method1563(@OriginalArg(0) int arg0) {
		return this.aClass4_Sub10Array1[arg0] == null ? 0 : this.aClass4_Sub10Array1[arg0].anInt1540;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public void method1569() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass4_Sub10Array1.length; local7++) {
			if (this.aClass4_Sub10Array1[local7] != null) {
				this.aClass4_Sub10Array1[local7].method943();
			}
		}
		this.aClass45_14 = new Class45();
		this.anInt2273 = this.anInt2274;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method1560(@OriginalArg(1) int arg0) {
		return this.aClass4_Sub10Array1[arg0].aBoolean51;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(II)V")
	public void method1571(@OriginalArg(0) int arg0) {
		for (@Pc(10) int local10 = 0; local10 < this.aClass4_Sub10Array1.length; local10++) {
			@Pc(17) Class4_Sub10 local17 = this.aClass4_Sub10Array1[local10];
			if (local17 != null && local17.anInt1542 != 0 && local17.aBoolean50) {
				local17.method946(arg0);
				local17.aBoolean50 = false;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method1561(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub10 local8 = this.aClass4_Sub10Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray152 != null) {
				this.aClass45_14.method990(local8);
				local8.aBoolean50 = true;
				return local8.anIntArray152;
			}
			@Pc(33) boolean local33 = local8.method945(this.aDouble9, this.anInt2275, this.aClass10_26);
			if (local33) {
				if (this.anInt2273 == 0) {
					@Pc(52) Class4_Sub10 local52 = (Class4_Sub10) this.aClass45_14.method993();
					local52.method943();
				} else {
					this.anInt2273--;
				}
				this.aClass45_14.method990(local8);
				local8.aBoolean50 = true;
				return local8.anIntArray152;
			}
		}
		return null;
	}
}
