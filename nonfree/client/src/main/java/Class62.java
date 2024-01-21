import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class62 implements Interface3 {

	@OriginalMember(owner = "client!se", name = "r", descriptor = "[I")
	public static int[] anIntArray314 = new int[256];

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!bb;")
	private Class8 aClass8_8 = new Class8();

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	private int anInt2576 = 0;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "I")
	private int anInt2579 = 128;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "Lclient!ac;")
	private final Class3 aClass3_23;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "I")
	private final int anInt2578;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "[Lclient!oa;")
	private final Class2_Sub11[] aClass2_Sub11Array1;

	static {
		for (@Pc(20) int local20 = 0; local20 < 256; local20++) {
			@Pc(23) int local23 = local20;
			for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
				if ((local23 & 0x1) == 1) {
					local23 = local23 >>> 1 ^ 0xEDB88320;
				} else {
					local23 >>>= 0x1;
				}
			}
			anIntArray314[local20] = local23;
		}
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!ac;Lclient!ac;IDI)V")
	public Class62(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble1 = arg3;
		this.anInt2579 = arg4;
		this.aClass3_23 = arg1;
		this.anInt2578 = arg2;
		this.anInt2576 = this.anInt2578;
		@Pc(38) int[] local38 = arg0.method943(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub11Array1 = new Class2_Sub11[arg0.method946(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub12 local63 = new Class2_Sub12(arg0.method928(local38[local50], 0));
			this.aClass2_Sub11Array1[local38[local50]] = new Class2_Sub11(local63);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1812(@OriginalArg(0) int arg0) {
		return this.anInt2579 == 64;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method1815(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub11 local16 = this.aClass2_Sub11Array1[arg0];
		if (local16 != null) {
			if (local16.anIntArray230 != null) {
				this.aClass8_8.method188(local16);
				local16.aBoolean80 = true;
				return local16.anIntArray230;
			}
			@Pc(41) boolean local41 = local16.method1287(this.aDouble1, this.anInt2579, this.aClass3_23);
			if (local41) {
				if (this.anInt2576 == 0) {
					@Pc(60) Class2_Sub11 local60 = (Class2_Sub11) this.aClass8_8.method178();
					local60.method1286();
				} else {
					this.anInt2576--;
				}
				this.aClass8_8.method188(local16);
				local16.aBoolean80 = true;
				return local16.anIntArray230;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)I")
	@Override
	public int method1813(@OriginalArg(0) int arg0) {
		return this.aClass2_Sub11Array1[arg0] == null ? 0 : this.aClass2_Sub11Array1[arg0].anInt1822;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method1814(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub11Array1[arg0].aBoolean81;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(II)V")
	public void method1817(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aClass2_Sub11Array1.length; local7++) {
			@Pc(14) Class2_Sub11 local14 = this.aClass2_Sub11Array1[local7];
			if (local14 != null && local14.anInt1823 != 0 && local14.aBoolean80) {
				local14.method1284(arg0);
				local14.aBoolean80 = false;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(DB)V")
	public void method1818(@OriginalArg(0) double arg0) {
		this.aDouble1 = arg0;
		this.method1820();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public void method1820() {
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub11Array1.length; local11++) {
			if (this.aClass2_Sub11Array1[local11] != null) {
				this.aClass2_Sub11Array1[local11].method1286();
			}
		}
		this.aClass8_8 = new Class8();
		this.anInt2576 = this.anInt2578;
	}
}
