import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class57 implements Interface2 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!ca;")
	private Class10 aClass10_9 = new Class10();

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
	private int anInt2491 = 0;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	private int anInt2496 = 128;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	private final int anInt2493;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!sd;")
	private final Class29 aClass29_59;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[Lclient!kd;")
	private final Class5_Sub13[] aClass5_Sub13Array1;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!sd;Lclient!sd;IDI)V")
	public Class57(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble9 = arg3;
		this.anInt2493 = arg2;
		this.anInt2491 = this.anInt2493;
		this.aClass29_59 = arg1;
		this.anInt2496 = arg4;
		@Pc(38) int[] local38 = arg0.method756(0);
		@Pc(41) int local41 = local38.length;
		this.aClass5_Sub13Array1 = new Class5_Sub13[arg0.method737(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class5_Sub9 local63 = new Class5_Sub9(arg0.method733(local38[local50], 0));
			this.aClass5_Sub13Array1[local38[local50]] = new Class5_Sub13(local63);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public void method1679() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass5_Sub13Array1.length; local7++) {
			if (this.aClass5_Sub13Array1[local7] != null) {
				this.aClass5_Sub13Array1[local7].method1185();
			}
		}
		this.aClass10_9 = new Class10();
		this.anInt2491 = this.anInt2493;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BD)V")
	public void method1681(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method1679();
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1677(@OriginalArg(1) int arg0) {
		return this.anInt2496 == 64;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method1678(@OriginalArg(0) int arg0) {
		@Pc(4) Class5_Sub13 local4 = this.aClass5_Sub13Array1[arg0];
		if (local4 != null) {
			if (local4.anIntArray269 != null) {
				this.aClass10_9.method235(local4);
				local4.aBoolean84 = true;
				return local4.anIntArray269;
			}
			@Pc(33) boolean local33 = local4.method1186(this.aDouble9, this.anInt2496, this.aClass29_59);
			if (local33) {
				if (this.anInt2491 == 0) {
					@Pc(46) Class5_Sub13 local46 = (Class5_Sub13) this.aClass10_9.method228();
					local46.method1185();
				} else {
					this.anInt2491--;
				}
				this.aClass10_9.method235(local4);
				local4.aBoolean84 = true;
				return local4.anIntArray269;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)V")
	public void method1685(@OriginalArg(1) int arg0) {
		for (@Pc(8) int local8 = 0; local8 < this.aClass5_Sub13Array1.length; local8++) {
			@Pc(15) Class5_Sub13 local15 = this.aClass5_Sub13Array1[local8];
			if (local15 != null && local15.anInt1719 != 0 && local15.aBoolean84) {
				local15.method1187(arg0);
				local15.aBoolean84 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
	@Override
	public int method1676(@OriginalArg(1) int arg0) {
		return this.aClass5_Sub13Array1[arg0] == null ? 0 : this.aClass5_Sub13Array1[arg0].anInt1721;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method1675(@OriginalArg(0) int arg0) {
		return this.aClass5_Sub13Array1[arg0].aBoolean85;
	}
}
