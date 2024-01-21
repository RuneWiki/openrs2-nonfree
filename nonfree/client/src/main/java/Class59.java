import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class59 implements Interface1 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!ie;")
	private Class34 aClass34_47 = new Class34();

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
	private int anInt2399 = 128;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
	private int anInt2406 = 0;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Lclient!jd;")
	private final Class36 aClass36_61;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
	private final int anInt2402;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[Lclient!je;")
	private final Class2_Sub7[] aClass2_Sub7Array1;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!jd;Lclient!jd;IDI)V")
	public Class59(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble9 = arg3;
		this.aClass36_61 = arg1;
		this.anInt2402 = arg2;
		this.anInt2406 = this.anInt2402;
		this.anInt2399 = arg4;
		@Pc(38) int[] local38 = arg0.method1762(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub7Array1 = new Class2_Sub7[arg0.method1763(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub5 local63 = new Class2_Sub5(arg0.method1761(0, local38[local50]));
			this.aClass2_Sub7Array1[local38[local50]] = new Class2_Sub7(local63);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1721(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub7Array1[arg0].aBoolean78;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)I")
	@Override
	public int method1722(@OriginalArg(0) int arg0) {
		return this.aClass2_Sub7Array1[arg0] == null ? 0 : this.aClass2_Sub7Array1[arg0].anInt1453;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1720(@OriginalArg(1) int arg0) {
		return this.anInt2399 == 64;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public void method1728() {
		for (@Pc(5) int local5 = 0; local5 < this.aClass2_Sub7Array1.length; local5++) {
			if (this.aClass2_Sub7Array1[local5] != null) {
				this.aClass2_Sub7Array1[local5].method994();
			}
		}
		this.aClass34_47 = new Class34();
		this.anInt2406 = this.anInt2402;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(BI)V")
	public void method1729(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass2_Sub7Array1.length; local3++) {
			@Pc(16) Class2_Sub7 local16 = this.aClass2_Sub7Array1[local3];
			if (local16 != null && local16.anInt1451 != 0 && local16.aBoolean79) {
				local16.method993(arg0);
				local16.aBoolean79 = false;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(DI)V")
	public void method1730(@OriginalArg(0) double arg0) {
		this.aDouble9 = arg0;
		this.method1728();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method1719(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray202 != null) {
				this.aClass34_47.method878(local8);
				local8.aBoolean79 = true;
				return local8.anIntArray202;
			}
			@Pc(41) boolean local41 = local8.method995(this.aDouble9, this.anInt2399, this.aClass36_61);
			if (local41) {
				if (this.anInt2406 == 0) {
					@Pc(63) Class2_Sub7 local63 = (Class2_Sub7) this.aClass34_47.method869();
					local63.method994();
				} else {
					this.anInt2406--;
				}
				this.aClass34_47.method878(local8);
				local8.aBoolean79 = true;
				return local8.anIntArray202;
			}
		}
		return null;
	}
}
