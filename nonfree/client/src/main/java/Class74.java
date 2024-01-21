import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class74 implements Interface2 {

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!jd;")
	private Class38 aClass38_23 = new Class38();

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	private int anInt2827 = 0;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!u", name = "z", descriptor = "I")
	private int anInt2829 = 128;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!ie;")
	private final Class35 aClass35_29;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "I")
	private final int anInt2828;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Lclient!sa;")
	private final Class1_Sub22[] aClass1_Sub22Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ie;Lclient!ie;IDI)V")
	public Class74(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass35_29 = arg1;
		this.aDouble9 = arg3;
		this.anInt2828 = arg2;
		this.anInt2829 = arg4;
		this.anInt2827 = this.anInt2828;
		@Pc(38) int[] local38 = arg0.method1580(0);
		@Pc(41) int local41 = local38.length;
		this.aClass1_Sub22Array1 = new Class1_Sub22[arg0.method1579(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class1_Sub19 local63 = new Class1_Sub19(arg0.method1573(0, local38[local50]));
			this.aClass1_Sub22Array1[local38[local50]] = new Class1_Sub22(local63);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ID)V")
	public void method1871(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method1874();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1870(@OriginalArg(0) int arg0) {
		return this.aClass1_Sub22Array1[arg0].aBoolean142;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method1867(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub22 local14 = this.aClass1_Sub22Array1[arg0];
		if (local14 != null) {
			if (local14.anIntArray328 != null) {
				this.aClass38_23.method1043(local14);
				local14.aBoolean141 = true;
				return local14.anIntArray328;
			}
			@Pc(39) boolean local39 = local14.method1731(this.aDouble9, this.anInt2829, this.aClass35_29);
			if (local39) {
				if (this.anInt2827 == 0) {
					@Pc(50) Class1_Sub22 local50 = (Class1_Sub22) this.aClass38_23.method1042();
					local50.method1734();
				} else {
					this.anInt2827--;
				}
				this.aClass38_23.method1043(local14);
				local14.aBoolean141 = true;
				return local14.anIntArray328;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1868(@OriginalArg(1) int arg0) {
		return this.anInt2829 == 64;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
	public void method1874() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass1_Sub22Array1.length; local3++) {
			if (this.aClass1_Sub22Array1[local3] != null) {
				this.aClass1_Sub22Array1[local3].method1734();
			}
		}
		this.aClass38_23 = new Class38();
		this.anInt2827 = this.anInt2828;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I")
	@Override
	public int method1869(@OriginalArg(1) int arg0) {
		return this.aClass1_Sub22Array1[arg0] == null ? 0 : this.aClass1_Sub22Array1[arg0].anInt2616;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V")
	public void method1877(@OriginalArg(0) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub22Array1.length; local11++) {
			@Pc(18) Class1_Sub22 local18 = this.aClass1_Sub22Array1[local11];
			if (local18 != null && local18.anInt2615 != 0 && local18.aBoolean141) {
				local18.method1732(arg0);
				local18.aBoolean141 = false;
			}
		}
	}
}
