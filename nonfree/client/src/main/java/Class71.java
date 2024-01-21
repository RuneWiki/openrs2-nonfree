import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class71 implements Interface2 {

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!md;")
	private Class50 aClass50_15 = new Class50();

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
	private int anInt2871 = 0;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
	private int anInt2869 = 128;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
	private final int anInt2870;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "Lclient!pb;")
	private final Class41 aClass41_79;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "[Lclient!qd;")
	private final Class1_Sub10[] aClass1_Sub10Array1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!pb;Lclient!pb;IDI)V")
	public Class71(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt2870 = arg2;
		this.anInt2871 = this.anInt2870;
		this.aDouble9 = arg3;
		this.anInt2869 = arg4;
		this.aClass41_79 = arg1;
		@Pc(38) int[] local38 = arg0.method1049(0);
		@Pc(41) int local41 = local38.length;
		this.aClass1_Sub10Array1 = new Class1_Sub10[arg0.method1068(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class1_Sub6 local63 = new Class1_Sub6(arg0.method1062(0, local38[local50]));
			this.aClass1_Sub10Array1[local38[local50]] = new Class1_Sub10(local63);
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method2091(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub10 local13 = this.aClass1_Sub10Array1[arg0];
		if (local13 != null) {
			if (local13.anIntArray296 != null) {
				this.aClass50_15.method1144(local13);
				local13.aBoolean125 = true;
				return local13.anIntArray296;
			}
			@Pc(38) boolean local38 = local13.method1443(this.aDouble9, this.anInt2869, this.aClass41_79);
			if (local38) {
				if (this.anInt2871 == 0) {
					@Pc(57) Class1_Sub10 local57 = (Class1_Sub10) this.aClass50_15.method1149();
					local57.method1442();
				} else {
					this.anInt2871--;
				}
				this.aClass50_15.method1144(local13);
				local13.aBoolean125 = true;
				return local13.anIntArray296;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method2093(@OriginalArg(0) int arg0) {
		return this.anInt2869 == 64;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public void method2095() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass1_Sub10Array1.length; local3++) {
			if (this.aClass1_Sub10Array1[local3] != null) {
				this.aClass1_Sub10Array1[local3].method1442();
			}
		}
		this.aClass50_15 = new Class50();
		this.anInt2871 = this.anInt2870;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	@Override
	public int method2090(@OriginalArg(1) int arg0) {
		return this.aClass1_Sub10Array1[arg0] == null ? 0 : this.aClass1_Sub10Array1[arg0].anInt2009;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(DI)V")
	public void method2097(@OriginalArg(0) double arg0) {
		this.aDouble9 = arg0;
		this.method2095();
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
	public void method2098(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aClass1_Sub10Array1.length; local7++) {
			@Pc(14) Class1_Sub10 local14 = this.aClass1_Sub10Array1[local7];
			if (local14 != null && local14.anInt2008 != 0 && local14.aBoolean125) {
				local14.method1444(arg0);
				local14.aBoolean125 = false;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method2092(@OriginalArg(1) int arg0) {
		return this.aClass1_Sub10Array1[arg0].aBoolean126;
	}
}
