import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class29 implements Interface1 {

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Lclient!vf;")
	private Class78 aClass78_5 = new Class78();

	@OriginalMember(owner = "client!h", name = "y", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!h", name = "B", descriptor = "I")
	private int anInt1154 = 0;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "I")
	private int anInt1153 = 128;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "Lclient!la;")
	private final Class17 aClass17_15;

	@OriginalMember(owner = "client!h", name = "z", descriptor = "I")
	private final int anInt1152;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "[Lclient!pb;")
	private final Class4_Sub18[] aClass4_Sub18Array1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!la;Lclient!la;IDI)V")
	public Class29(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass17_15 = arg1;
		this.aDouble9 = arg3;
		this.anInt1152 = arg2;
		this.anInt1154 = this.anInt1152;
		this.anInt1153 = arg4;
		@Pc(38) int[] local38 = arg0.method282(0);
		@Pc(41) int local41 = local38.length;
		this.aClass4_Sub18Array1 = new Class4_Sub18[arg0.method283(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class4_Sub10 local63 = new Class4_Sub10(arg0.method290(0, local38[local50]));
			this.aClass4_Sub18Array1[local38[local50]] = new Class4_Sub18(local63);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method776(@OriginalArg(0) int arg0) {
		return this.aClass4_Sub18Array1[arg0].aBoolean130;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ID)V")
	public void method781(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method784();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)V")
	public void method782(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aClass4_Sub18Array1.length; local7++) {
			@Pc(14) Class4_Sub18 local14 = this.aClass4_Sub18Array1[local7];
			if (local14 != null && local14.anInt2106 != 0 && local14.aBoolean129) {
				local14.method1478(arg0);
				local14.aBoolean129 = false;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public void method784() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass4_Sub18Array1.length; local7++) {
			if (this.aClass4_Sub18Array1[local7] != null) {
				this.aClass4_Sub18Array1[local7].method1476();
			}
		}
		this.aClass78_5 = new Class78();
		this.anInt1154 = this.anInt1152;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method778(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub18 local16 = this.aClass4_Sub18Array1[arg0];
		if (local16 != null) {
			if (local16.anIntArray292 != null) {
				this.aClass78_5.method1915(local16);
				local16.aBoolean129 = true;
				return local16.anIntArray292;
			}
			@Pc(41) boolean local41 = local16.method1477(this.aDouble9, this.anInt1153, this.aClass17_15);
			if (local41) {
				if (this.anInt1154 == 0) {
					@Pc(52) Class4_Sub18 local52 = (Class4_Sub18) this.aClass78_5.method1921();
					local52.method1476();
				} else {
					this.anInt1154--;
				}
				this.aClass78_5.method1915(local16);
				local16.aBoolean129 = true;
				return local16.anIntArray292;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method779(@OriginalArg(0) int arg0) {
		return this.anInt1153 == 64;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	@Override
	public int method777(@OriginalArg(1) int arg0) {
		return this.aClass4_Sub18Array1[arg0] == null ? 0 : this.aClass4_Sub18Array1[arg0].anInt2107;
	}
}
