import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class57 implements Interface3 {

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "Lclient!p;")
	private Class51 aClass51_10 = new Class51();

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
	private int anInt2376 = 0;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
	private int anInt2378 = 128;

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "Lclient!bf;")
	private final Class11 aClass11_59;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
	private final int anInt2377;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "[Lclient!n;")
	private final Class3_Sub8[] aClass3_Sub8Array1;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!bf;Lclient!bf;IDI)V")
	public Class57(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass11_59 = arg1;
		this.aDouble9 = arg3;
		this.anInt2378 = arg4;
		this.anInt2377 = arg2;
		this.anInt2376 = this.anInt2377;
		@Pc(38) int[] local38 = arg0.method1863(0);
		@Pc(41) int local41 = local38.length;
		this.aClass3_Sub8Array1 = new Class3_Sub8[arg0.method1875(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class3_Sub6 local63 = new Class3_Sub6(arg0.method1882(0, local38[local50]));
			this.aClass3_Sub8Array1[local38[local50]] = new Class3_Sub8(local63);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method1553(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub8 local13 = this.aClass3_Sub8Array1[arg0];
		if (local13 != null) {
			if (local13.anIntArray211 != null) {
				this.aClass51_10.method1313(local13);
				local13.aBoolean86 = true;
				return local13.anIntArray211;
			}
			@Pc(38) boolean local38 = local13.method1206(this.aDouble9, this.anInt2378, this.aClass11_59);
			if (local38) {
				if (this.anInt2376 == 0) {
					@Pc(57) Class3_Sub8 local57 = (Class3_Sub8) this.aClass51_10.method1307();
					local57.method1207();
				} else {
					this.anInt2376--;
				}
				this.aClass51_10.method1313(local13);
				local13.aBoolean86 = true;
				return local13.anIntArray211;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method1555(@OriginalArg(1) int arg0) {
		return this.anInt2378 == 64;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public void method1560() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass3_Sub8Array1.length; local7++) {
			if (this.aClass3_Sub8Array1[local7] != null) {
				this.aClass3_Sub8Array1[local7].method1207();
			}
		}
		this.aClass51_10 = new Class51();
		this.anInt2376 = this.anInt2377;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(DZ)V")
	public void method1561(@OriginalArg(0) double arg0) {
		this.aDouble9 = arg0;
		this.method1560();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
	@Override
	public int method1552(@OriginalArg(1) int arg0) {
		return this.aClass3_Sub8Array1[arg0] == null ? 0 : this.aClass3_Sub8Array1[arg0].anInt1854;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1554(@OriginalArg(1) int arg0) {
		return this.aClass3_Sub8Array1[arg0].aBoolean85;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
	public void method1562(@OriginalArg(0) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub8Array1.length; local11++) {
			@Pc(18) Class3_Sub8 local18 = this.aClass3_Sub8Array1[local11];
			if (local18 != null && local18.anInt1853 != 0 && local18.aBoolean86) {
				local18.method1208(arg0);
				local18.aBoolean86 = false;
			}
		}
	}
}
