import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class57 implements Interface2 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!rc;")
	private Class61 aClass61_15 = new Class61();

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
	private int anInt2390 = 128;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
	private int anInt2391 = 0;

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "Lclient!sf;")
	private final Class5 aClass5_76;

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
	private final int anInt2392;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "[Lclient!df;")
	private final Class1_Sub8[] aClass1_Sub8Array1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!sf;Lclient!sf;IDI)V")
	public Class57(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt2390 = arg4;
		this.aClass5_76 = arg1;
		this.anInt2392 = arg2;
		this.aDouble9 = arg3;
		this.anInt2391 = this.anInt2392;
		@Pc(38) int[] local38 = arg0.method129(0);
		@Pc(41) int local41 = local38.length;
		this.aClass1_Sub8Array1 = new Class1_Sub8[arg0.method106(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class1_Sub12 local63 = new Class1_Sub12(arg0.method107(local38[local50], 0));
			this.aClass1_Sub8Array1[local38[local50]] = new Class1_Sub8(local63);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method1697(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray92 != null) {
				this.aClass61_15.method1755(local8);
				local8.aBoolean29 = true;
				return local8.anIntArray92;
			}
			@Pc(33) boolean local33 = local8.method504(this.aDouble9, this.anInt2390, this.aClass5_76);
			if (local33) {
				if (this.anInt2391 == 0) {
					@Pc(55) Class1_Sub8 local55 = (Class1_Sub8) this.aClass61_15.method1758();
					local55.method502();
				} else {
					this.anInt2391--;
				}
				this.aClass61_15.method1755(local8);
				local8.aBoolean29 = true;
				return local8.anIntArray92;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1698(@OriginalArg(0) int arg0) {
		return this.anInt2390 == 64;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
	public void method1703(@OriginalArg(0) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub8Array1.length; local11++) {
			@Pc(18) Class1_Sub8 local18 = this.aClass1_Sub8Array1[local11];
			if (local18 != null && local18.anInt630 != 0 && local18.aBoolean29) {
				local18.method503(arg0);
				local18.aBoolean29 = false;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method1704() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass1_Sub8Array1.length; local7++) {
			if (this.aClass1_Sub8Array1[local7] != null) {
				this.aClass1_Sub8Array1[local7].method502();
			}
		}
		this.aClass61_15 = new Class61();
		this.anInt2391 = this.anInt2392;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(DB)V")
	public void method1705(@OriginalArg(0) double arg0) {
		this.aDouble9 = arg0;
		this.method1704();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)I")
	@Override
	public int method1699(@OriginalArg(1) int arg0) {
		return this.aClass1_Sub8Array1[arg0] == null ? 0 : this.aClass1_Sub8Array1[arg0].anInt628;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1700(@OriginalArg(1) int arg0) {
		return this.aClass1_Sub8Array1[arg0].aBoolean30;
	}
}
