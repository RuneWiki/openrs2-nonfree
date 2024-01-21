import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class11 implements Interface4 {

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "Lclient!fa;")
	private Class22 aClass22_1 = new Class22();

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
	private int anInt358 = 0;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	private int anInt361 = 128;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "Lclient!ja;")
	private final Class33 aClass33_2;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private final int anInt360;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lclient!nb;")
	private final Class1_Sub11[] aClass1_Sub11Array1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!ja;Lclient!ja;IDI)V")
	public Class11(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble1 = arg3;
		this.aClass33_2 = arg1;
		this.anInt361 = arg4;
		this.anInt360 = arg2;
		this.anInt358 = this.anInt360;
		@Pc(38) int[] local38 = arg0.method1303(0);
		@Pc(41) int local41 = local38.length;
		this.aClass1_Sub11Array1 = new Class1_Sub11[arg0.method1299(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class1_Sub8 local63 = new Class1_Sub8(arg0.method1305(local38[local50], 0));
			this.aClass1_Sub11Array1[local38[local50]] = new Class1_Sub11(local63);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)I")
	@Override
	public int method263(@OriginalArg(0) int arg0) {
		return this.aClass1_Sub11Array1[arg0] == null ? 0 : this.aClass1_Sub11Array1[arg0].anInt1596;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
	public void method267(@OriginalArg(0) int arg0) {
		for (@Pc(14) int local14 = 0; local14 < this.aClass1_Sub11Array1.length; local14++) {
			@Pc(21) Class1_Sub11 local21 = this.aClass1_Sub11Array1[local14];
			if (local21 != null && local21.anInt1598 != 0 && local21.aBoolean92) {
				local21.method1114(arg0);
				local21.aBoolean92 = false;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method265(@OriginalArg(0) int arg0) {
		return this.anInt361 == 64;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public void method269() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass1_Sub11Array1.length; local1++) {
			if (this.aClass1_Sub11Array1[local1] != null) {
				this.aClass1_Sub11Array1[local1].method1115();
			}
		}
		this.aClass22_1 = new Class22();
		this.anInt358 = this.anInt360;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ID)V")
	public void method270(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method269();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method262(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub11 local4 = this.aClass1_Sub11Array1[arg0];
		if (local4 != null) {
			if (local4.anIntArray234 != null) {
				this.aClass22_1.method513(local4);
				local4.aBoolean92 = true;
				return local4.anIntArray234;
			}
			@Pc(38) boolean local38 = local4.method1113(this.aDouble1, this.anInt361, this.aClass33_2);
			if (local38) {
				if (this.anInt358 == 0) {
					@Pc(57) Class1_Sub11 local57 = (Class1_Sub11) this.aClass22_1.method521();
					local57.method1115();
				} else {
					this.anInt358--;
				}
				this.aClass22_1.method513(local4);
				local4.aBoolean92 = true;
				return local4.anIntArray234;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method264(@OriginalArg(0) int arg0) {
		return this.aClass1_Sub11Array1[arg0].aBoolean93;
	}
}
