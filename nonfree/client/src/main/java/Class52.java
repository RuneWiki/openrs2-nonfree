import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class52 implements Interface4 {

	@OriginalMember(owner = "client!q", name = "t", descriptor = "Lclient!he;")
	private Class28 aClass28_11 = new Class28();

	@OriginalMember(owner = "client!q", name = "z", descriptor = "I")
	private int anInt2209 = 128;

	@OriginalMember(owner = "client!q", name = "w", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!q", name = "y", descriptor = "I")
	private int anInt2208 = 0;

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient!td;")
	private final Class54 aClass54_28;

	@OriginalMember(owner = "client!q", name = "x", descriptor = "I")
	private final int anInt2207;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "[Lclient!ld;")
	private final Class3_Sub10[] aClass3_Sub10Array1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!td;Lclient!td;IDI)V")
	public Class52(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble9 = arg3;
		this.aClass54_28 = arg1;
		this.anInt2207 = arg2;
		this.anInt2208 = this.anInt2207;
		this.anInt2209 = arg4;
		@Pc(38) int[] local38 = arg0.method1597(0);
		@Pc(41) int local41 = local38.length;
		this.aClass3_Sub10Array1 = new Class3_Sub10[arg0.method1609(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class3_Sub11 local63 = new Class3_Sub11(arg0.method1615(0, local38[local50]));
			this.aClass3_Sub10Array1[local38[local50]] = new Class3_Sub10(local63);
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(II)V")
	public void method1551(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aClass3_Sub10Array1.length; local7++) {
			@Pc(14) Class3_Sub10 local14 = this.aClass3_Sub10Array1[local7];
			if (local14 != null && local14.anInt1524 != 0 && local14.aBoolean78) {
				local14.method1122(arg0);
				local14.aBoolean78 = false;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public void method1552() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass3_Sub10Array1.length; local3++) {
			if (this.aClass3_Sub10Array1[local3] != null) {
				this.aClass3_Sub10Array1[local3].method1119();
			}
		}
		this.aClass28_11 = new Class28();
		this.anInt2208 = this.anInt2207;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1548(@OriginalArg(1) int arg0) {
		return this.anInt2209 == 64;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
	@Override
	public int method1547(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub10Array1[arg0] == null ? 0 : this.aClass3_Sub10Array1[arg0].anInt1526;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method1549(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub10 local9 = this.aClass3_Sub10Array1[arg0];
		if (local9 != null) {
			if (local9.anIntArray258 != null) {
				this.aClass28_11.method881(local9);
				local9.aBoolean78 = true;
				return local9.anIntArray258;
			}
			@Pc(38) boolean local38 = local9.method1121(this.aDouble9, this.anInt2209, this.aClass54_28);
			if (local38) {
				if (this.anInt2208 == 0) {
					@Pc(49) Class3_Sub10 local49 = (Class3_Sub10) this.aClass28_11.method880();
					local49.method1119();
				} else {
					this.anInt2208--;
				}
				this.aClass28_11.method881(local9);
				local9.aBoolean78 = true;
				return local9.anIntArray258;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BD)V")
	public void method1554(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method1552();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1550(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub10Array1[arg0].aBoolean79;
	}
}
