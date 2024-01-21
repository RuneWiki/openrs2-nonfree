import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class38 implements Interface4 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!pb;")
	private Class46 aClass46_5 = new Class46();

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
	private int anInt1893 = 128;

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
	private int anInt1896 = 0;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
	private final int anInt1895;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Lclient!bd;")
	private final Class8 aClass8_20;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "[Lclient!p;")
	private final Class2_Sub10[] aClass2_Sub10Array1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!bd;Lclient!bd;IDI)V")
	public Class38(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt1895 = arg2;
		this.aClass8_20 = arg1;
		this.aDouble9 = arg3;
		this.anInt1893 = arg4;
		this.anInt1896 = this.anInt1895;
		@Pc(38) int[] local38 = arg0.method1704(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub10Array1 = new Class2_Sub10[arg0.method1702(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub3 local63 = new Class2_Sub3(arg0.method1684(local38[local50], 0));
			this.aClass2_Sub10Array1[local38[local50]] = new Class2_Sub10(local63);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public void method1311() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass2_Sub10Array1.length; local7++) {
			if (this.aClass2_Sub10Array1[local7] != null) {
				this.aClass2_Sub10Array1[local7].method1384();
			}
		}
		this.aClass46_5 = new Class46();
		this.anInt1896 = this.anInt1895;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method1306(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub10 local8 = this.aClass2_Sub10Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray218 != null) {
				this.aClass46_5.method1438(local8);
				local8.aBoolean109 = true;
				return local8.anIntArray218;
			}
			@Pc(41) boolean local41 = local8.method1383(this.aDouble9, this.anInt1893, this.aClass8_20);
			if (local41) {
				if (this.anInt1896 == 0) {
					@Pc(55) Class2_Sub10 local55 = (Class2_Sub10) this.aClass46_5.method1432();
					local55.method1384();
				} else {
					this.anInt1896--;
				}
				this.aClass46_5.method1438(local8);
				local8.aBoolean109 = true;
				return local8.anIntArray218;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)I")
	@Override
	public int method1308(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub10Array1[arg0] == null ? 0 : this.aClass2_Sub10Array1[arg0].anInt2003;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1307(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub10Array1[arg0].aBoolean108;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ID)V")
	public void method1313(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method1311();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(BI)V")
	public void method1314(@OriginalArg(1) int arg0) {
		for (@Pc(5) int local5 = 0; local5 < this.aClass2_Sub10Array1.length; local5++) {
			@Pc(14) Class2_Sub10 local14 = this.aClass2_Sub10Array1[local5];
			if (local14 != null && local14.anInt2002 != 0 && local14.aBoolean109) {
				local14.method1382(arg0);
				local14.aBoolean109 = false;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1309(@OriginalArg(0) int arg0) {
		return this.anInt1893 == 64;
	}
}
