import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class4 implements Interface1 {

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!s;")
	private Class52 aClass52_2 = new Class52();

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	private int anInt241 = 0;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	private int anInt245 = 128;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	private final int anInt248;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "Lclient!k;")
	private final Class33 aClass33_5;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "[Lclient!re;")
	private final Class2_Sub13[] aClass2_Sub13Array1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!k;Lclient!k;IDI)V")
	public Class4(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble9 = arg3;
		this.anInt248 = arg2;
		this.aClass33_5 = arg1;
		this.anInt245 = arg4;
		this.anInt241 = this.anInt248;
		@Pc(38) int[] local38 = arg0.method1131(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub13Array1 = new Class2_Sub13[arg0.method1153(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub8 local63 = new Class2_Sub8(arg0.method1150(local38[local50], 0));
			this.aClass2_Sub13Array1[local38[local50]] = new Class2_Sub13(local63);
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V")
	public void method120(@OriginalArg(1) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub13Array1.length; local11++) {
			@Pc(18) Class2_Sub13 local18 = this.aClass2_Sub13Array1[local11];
			if (local18 != null && local18.anInt2573 != 0 && local18.aBoolean132) {
				local18.method1583(arg0);
				local18.aBoolean132 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method117(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub13Array1[arg0].aBoolean133;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I")
	@Override
	public int method119(@OriginalArg(0) int arg0) {
		return this.aClass2_Sub13Array1[arg0] == null ? 0 : this.aClass2_Sub13Array1[arg0].anInt2575;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZD)V")
	public void method123(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method124();
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public void method124() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass2_Sub13Array1.length; local7++) {
			if (this.aClass2_Sub13Array1[local7] != null) {
				this.aClass2_Sub13Array1[local7].method1581();
			}
		}
		this.aClass52_2 = new Class52();
		this.anInt241 = this.anInt248;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method118(@OriginalArg(1) int arg0) {
		@Pc(4) Class2_Sub13 local4 = this.aClass2_Sub13Array1[arg0];
		if (local4 != null) {
			if (local4.anIntArray373 != null) {
				this.aClass52_2.method1584(local4);
				local4.aBoolean132 = true;
				return local4.anIntArray373;
			}
			@Pc(41) boolean local41 = local4.method1582(this.aDouble9, this.anInt245, this.aClass33_5);
			if (local41) {
				if (this.anInt241 == 0) {
					@Pc(60) Class2_Sub13 local60 = (Class2_Sub13) this.aClass52_2.method1591();
					local60.method1581();
				} else {
					this.anInt241--;
				}
				this.aClass52_2.method1584(local4);
				local4.aBoolean132 = true;
				return local4.anIntArray373;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method116(@OriginalArg(1) int arg0) {
		return this.anInt245 == 64;
	}
}
