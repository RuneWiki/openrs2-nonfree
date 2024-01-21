import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class45 implements Interface1 {

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!nb;")
	private Class36 aClass36_6 = new Class36();

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
	private int anInt2274 = 0;

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
	private int anInt2276 = 128;

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
	private final int anInt2277;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!kc;")
	private final Class11 aClass11_16;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "[Lclient!ec;")
	private final Class2_Sub7[] aClass2_Sub7Array1;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!kc;Lclient!kc;IDI)V")
	public Class45(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble9 = arg3;
		this.anInt2277 = arg2;
		this.aClass11_16 = arg1;
		this.anInt2274 = this.anInt2277;
		this.anInt2276 = arg4;
		@Pc(38) int[] local38 = arg0.method329(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub7Array1 = new Class2_Sub7[arg0.method325(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub6 local63 = new Class2_Sub6(arg0.method338(0, local38[local50]));
			this.aClass2_Sub7Array1[local38[local50]] = new Class2_Sub7(local63);
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V")
	public void method1422(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass2_Sub7Array1.length; local3++) {
			@Pc(15) Class2_Sub7 local15 = this.aClass2_Sub7Array1[local3];
			if (local15 != null && local15.anInt1021 != 0 && local15.aBoolean58) {
				local15.method695(arg0);
				local15.aBoolean58 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method1420(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray107 != null) {
				this.aClass36_6.method1363(local8);
				local8.aBoolean58 = true;
				return local8.anIntArray107;
			}
			@Pc(33) boolean local33 = local8.method698(this.aDouble9, this.anInt2276, this.aClass11_16);
			if (local33) {
				if (this.anInt2274 == 0) {
					@Pc(55) Class2_Sub7 local55 = (Class2_Sub7) this.aClass36_6.method1366();
					local55.method696();
				} else {
					this.anInt2274--;
				}
				this.aClass36_6.method1363(local8);
				local8.aBoolean58 = true;
				return local8.anIntArray107;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1421(@OriginalArg(1) int arg0) {
		return this.anInt2276 == 64;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(DI)V")
	public void method1425(@OriginalArg(0) double arg0) {
		this.aDouble9 = arg0;
		this.method1427();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public void method1427() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass2_Sub7Array1.length; local7++) {
			if (this.aClass2_Sub7Array1[local7] != null) {
				this.aClass2_Sub7Array1[local7].method696();
			}
		}
		this.aClass36_6 = new Class36();
		this.anInt2274 = this.anInt2277;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)I")
	@Override
	public int method1419(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub7Array1[arg0] == null ? 0 : this.aClass2_Sub7Array1[arg0].anInt1020;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1418(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub7Array1[arg0].aBoolean57;
	}
}
