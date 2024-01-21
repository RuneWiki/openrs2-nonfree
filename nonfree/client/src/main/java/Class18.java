import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class18 implements Interface4 {

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Lclient!ab;")
	private Class3 aClass3_3 = new Class3();

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
	private int anInt1034 = 128;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
	private int anInt1033 = 0;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!pb;")
	private final Class40 aClass40_16;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	private final int anInt1035;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "[Lclient!ia;")
	private final Class6_Sub7[] aClass6_Sub7Array1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!pb;Lclient!pb;IDI)V")
	public Class18(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass40_16 = arg1;
		this.anInt1034 = arg4;
		this.anInt1035 = arg2;
		this.anInt1033 = this.anInt1035;
		this.aDouble1 = arg3;
		@Pc(38) int[] local38 = arg0.method1240(0);
		@Pc(41) int local41 = local38.length;
		this.aClass6_Sub7Array1 = new Class6_Sub7[arg0.method1224(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class6_Sub1 local63 = new Class6_Sub1(arg0.method1243(local38[local50], 0));
			this.aClass6_Sub7Array1[local38[local50]] = new Class6_Sub7(local63);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
	public void method671(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aClass6_Sub7Array1.length; local7++) {
			@Pc(14) Class6_Sub7 local14 = this.aClass6_Sub7Array1[local7];
			if (local14 != null && local14.anInt1383 != 0 && local14.aBoolean63) {
				local14.method905(arg0);
				local14.aBoolean63 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method666(@OriginalArg(0) int arg0) {
		return this.anInt1034 == 64;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ID)V")
	public void method672(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method673();
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method669(@OriginalArg(0) int arg0) {
		return this.aClass6_Sub7Array1[arg0].aBoolean62;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public void method673() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass6_Sub7Array1.length; local3++) {
			if (this.aClass6_Sub7Array1[local3] != null) {
				this.aClass6_Sub7Array1[local3].method904();
			}
		}
		this.aClass3_3 = new Class3();
		this.anInt1033 = this.anInt1035;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method668(@OriginalArg(1) int arg0) {
		@Pc(15) Class6_Sub7 local15 = this.aClass6_Sub7Array1[arg0];
		if (local15 != null) {
			if (local15.anIntArray94 != null) {
				this.aClass3_3.method29(local15);
				local15.aBoolean63 = true;
				return local15.anIntArray94;
			}
			@Pc(40) boolean local40 = local15.method902(this.aDouble1, this.anInt1034, this.aClass40_16);
			if (local40) {
				if (this.anInt1033 == 0) {
					@Pc(59) Class6_Sub7 local59 = (Class6_Sub7) this.aClass3_3.method35();
					local59.method904();
				} else {
					this.anInt1033--;
				}
				this.aClass3_3.method29(local15);
				local15.aBoolean63 = true;
				return local15.anIntArray94;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)I")
	@Override
	public int method667(@OriginalArg(1) int arg0) {
		return this.aClass6_Sub7Array1[arg0] == null ? 0 : this.aClass6_Sub7Array1[arg0].anInt1384;
	}
}
