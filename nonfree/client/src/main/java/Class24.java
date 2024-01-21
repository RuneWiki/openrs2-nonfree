import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class24 implements Interface1 {

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!of;")
	private Class58 aClass58_4 = new Class58();

	@OriginalMember(owner = "client!g", name = "B", descriptor = "I")
	private int anInt1234 = 128;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "I")
	private int anInt1238 = 0;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "Lclient!ff;")
	private final Class11 aClass11_22;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "I")
	private final int anInt1233;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "[Lclient!mb;")
	private final Class2_Sub10[] aClass2_Sub10Array1;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!ff;Lclient!ff;IDI)V")
	public Class24(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass11_22 = arg1;
		this.anInt1234 = arg4;
		this.anInt1233 = arg2;
		this.anInt1238 = this.anInt1233;
		this.aDouble9 = arg3;
		@Pc(38) int[] local38 = arg0.method381(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub10Array1 = new Class2_Sub10[arg0.method387(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub17 local63 = new Class2_Sub17(arg0.method383(local38[local50], 0));
			this.aClass2_Sub10Array1[local38[local50]] = new Class2_Sub10(local63);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method663(@OriginalArg(1) int arg0) {
		@Pc(4) Class2_Sub10 local4 = this.aClass2_Sub10Array1[arg0];
		if (local4 != null) {
			if (local4.anIntArray254 != null) {
				this.aClass58_4.method1289(local4);
				local4.aBoolean136 = true;
				return local4.anIntArray254;
			}
			@Pc(33) boolean local33 = local4.method1156(this.aDouble9, this.anInt1234, this.aClass11_22);
			if (local33) {
				if (this.anInt1238 == 0) {
					@Pc(52) Class2_Sub10 local52 = (Class2_Sub10) this.aClass58_4.method1286();
					local52.method1157();
				} else {
					this.anInt1238--;
				}
				this.aClass58_4.method1289(local4);
				local4.aBoolean136 = true;
				return local4.anIntArray254;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method662(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub10Array1[arg0].aBoolean137;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method661(@OriginalArg(1) int arg0) {
		return this.anInt1234 == 64;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BD)V")
	public void method670(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method672();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(BI)I")
	@Override
	public int method664(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub10Array1[arg0] == null ? 0 : this.aClass2_Sub10Array1[arg0].anInt1919;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
	public void method672() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass2_Sub10Array1.length; local3++) {
			if (this.aClass2_Sub10Array1[local3] != null) {
				this.aClass2_Sub10Array1[local3].method1157();
			}
		}
		this.aClass58_4 = new Class58();
		this.anInt1238 = this.anInt1233;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
	public void method673(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass2_Sub10Array1.length; local1++) {
			@Pc(10) Class2_Sub10 local10 = this.aClass2_Sub10Array1[local1];
			if (local10 != null && local10.anInt1918 != 0 && local10.aBoolean136) {
				local10.method1155(arg0);
				local10.aBoolean136 = false;
			}
		}
	}
}
