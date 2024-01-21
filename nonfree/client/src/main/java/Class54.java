import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class54 implements Interface3 {

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!aa;")
	private Class2 aClass2_9 = new Class2();

	@OriginalMember(owner = "client!md", name = "X", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
	private int anInt1563 = 128;

	@OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
	private int anInt1562 = 0;

	@OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
	private final int anInt1561;

	@OriginalMember(owner = "client!md", name = "fb", descriptor = "Lclient!oc;")
	private final Class56 aClass56_53;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "[Lclient!hb;")
	private final Class1_Sub8[] aClass1_Sub8Array1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!oc;Lclient!oc;IDI)V")
	public Class54(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt1563 = arg4;
		this.aDouble1 = arg3;
		this.anInt1561 = arg2;
		this.aClass56_53 = arg1;
		this.anInt1562 = this.anInt1561;
		@Pc(38) int[] local38 = arg0.method1274(0);
		@Pc(41) int local41 = local38.length;
		this.aClass1_Sub8Array1 = new Class1_Sub8[arg0.method1279(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class1_Sub5 local63 = new Class1_Sub5(arg0.method1269(0, local38[local50]));
			this.aClass1_Sub8Array1[local38[local50]] = new Class1_Sub8(local63);
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(BI)V")
	public void method1224(@OriginalArg(1) int arg0) {
		for (@Pc(9) int local9 = 0; local9 < this.aClass1_Sub8Array1.length; local9++) {
			@Pc(16) Class1_Sub8 local16 = this.aClass1_Sub8Array1[local9];
			if (local16 != null && local16.anInt1155 != 0 && local16.aBoolean48) {
				local16.method949(arg0);
				local16.aBoolean48 = false;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)I")
	@Override
	public int method1220(@OriginalArg(1) int arg0) {
		return this.aClass1_Sub8Array1[arg0] == null ? 0 : this.aClass1_Sub8Array1[arg0].anInt1153;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(DB)V")
	public void method1226(@OriginalArg(0) double arg0) {
		this.aDouble1 = arg0;
		this.method1228();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	public void method1228() {
		for (@Pc(5) int local5 = 0; local5 < this.aClass1_Sub8Array1.length; local5++) {
			if (this.aClass1_Sub8Array1[local5] != null) {
				this.aClass1_Sub8Array1[local5].method947();
			}
		}
		this.aClass2_9 = new Class2();
		this.anInt1562 = this.anInt1561;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1221(@OriginalArg(1) int arg0) {
		return this.aClass1_Sub8Array1[arg0].aBoolean47;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method1223(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray226 != null) {
				this.aClass2_9.method26(local8);
				local8.aBoolean48 = true;
				return local8.anIntArray226;
			}
			@Pc(33) boolean local33 = local8.method950(this.aDouble1, this.anInt1563, this.aClass56_53);
			if (local33) {
				if (this.anInt1562 == 0) {
					@Pc(52) Class1_Sub8 local52 = (Class1_Sub8) this.aClass2_9.method18();
					local52.method947();
				} else {
					this.anInt1562--;
				}
				this.aClass2_9.method26(local8);
				local8.aBoolean48 = true;
				return local8.anIntArray226;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1222(@OriginalArg(1) int arg0) {
		return this.anInt1563 == 64;
	}
}
