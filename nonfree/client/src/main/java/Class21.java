import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class21 implements Interface2 {

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!tb;")
	private Class70 aClass70_7 = new Class70();

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	private int anInt908 = 0;

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	private int anInt909 = 128;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!lc;")
	private final Class40 aClass40_28;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
	private final int anInt911;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[Lclient!id;")
	private final Class4_Sub11[] aClass4_Sub11Array1;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!lc;Lclient!lc;IDI)V")
	public Class21(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass40_28 = arg1;
		this.anInt911 = arg2;
		this.anInt909 = arg4;
		this.aDouble1 = arg3;
		this.anInt908 = this.anInt911;
		@Pc(38) int[] local38 = arg0.method1099(0);
		@Pc(41) int local41 = local38.length;
		this.aClass4_Sub11Array1 = new Class4_Sub11[arg0.method1114(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class4_Sub13 local63 = new Class4_Sub13(arg0.method1110(local38[local50], 0));
			this.aClass4_Sub11Array1[local38[local50]] = new Class4_Sub11(local63);
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method621(@OriginalArg(0) int arg0) {
		return this.anInt909 == 64;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method622(@OriginalArg(1) int arg0) {
		return this.aClass4_Sub11Array1[arg0].aBoolean45;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public void method624() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass4_Sub11Array1.length; local7++) {
			if (this.aClass4_Sub11Array1[local7] != null) {
				this.aClass4_Sub11Array1[local7].method950();
			}
		}
		this.aClass70_7 = new Class70();
		this.anInt908 = this.anInt911;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method619(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub11 local13 = this.aClass4_Sub11Array1[arg0];
		if (local13 != null) {
			if (local13.anIntArray125 != null) {
				this.aClass70_7.method1927(local13);
				local13.aBoolean46 = true;
				return local13.anIntArray125;
			}
			@Pc(38) boolean local38 = local13.method952(this.aDouble1, this.anInt909, this.aClass40_28);
			if (local38) {
				if (this.anInt908 == 0) {
					@Pc(60) Class4_Sub11 local60 = (Class4_Sub11) this.aClass70_7.method1938();
					local60.method950();
				} else {
					this.anInt908--;
				}
				this.aClass70_7.method1927(local13);
				local13.aBoolean46 = true;
				return local13.anIntArray125;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BD)V")
	public void method626(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method624();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
	public void method627(@OriginalArg(0) int arg0) {
		for (@Pc(9) int local9 = 0; local9 < this.aClass4_Sub11Array1.length; local9++) {
			@Pc(16) Class4_Sub11 local16 = this.aClass4_Sub11Array1[local9];
			if (local16 != null && local16.anInt1311 != 0 && local16.aBoolean46) {
				local16.method949(arg0);
				local16.aBoolean46 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)I")
	@Override
	public int method620(@OriginalArg(1) int arg0) {
		return this.aClass4_Sub11Array1[arg0] == null ? 0 : this.aClass4_Sub11Array1[arg0].anInt1312;
	}
}
