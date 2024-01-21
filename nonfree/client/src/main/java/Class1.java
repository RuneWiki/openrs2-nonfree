import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 implements Interface3 {

	@OriginalMember(owner = "client!a", name = "y", descriptor = "Lclient!pb;")
	private Class52 aClass52_1 = new Class52();

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	private int anInt15 = 128;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	private int anInt16 = 0;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Lclient!nb;")
	private final Class24 aClass24_1;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	private final int anInt14;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "[Lclient!ce;")
	private final Class5_Sub3[] aClass5_Sub3Array1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!nb;Lclient!nb;IDI)V")
	public Class1(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass24_1 = arg1;
		this.anInt15 = arg4;
		this.anInt14 = arg2;
		this.aDouble1 = arg3;
		this.anInt16 = this.anInt14;
		@Pc(38) int[] local38 = arg0.method669(0);
		@Pc(41) int local41 = local38.length;
		this.aClass5_Sub3Array1 = new Class5_Sub3[arg0.method660(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class5_Sub11 local63 = new Class5_Sub11(arg0.method679(0, local38[local50]));
			this.aClass5_Sub3Array1[local38[local50]] = new Class5_Sub3(local63);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method8(@OriginalArg(1) int arg0) {
		return this.aClass5_Sub3Array1[arg0].aBoolean20;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5(@OriginalArg(1) int arg0) {
		return this.anInt15 == 64;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
	public void method11(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass5_Sub3Array1.length; local3++) {
			@Pc(18) Class5_Sub3 local18 = this.aClass5_Sub3Array1[local3];
			if (local18 != null && local18.anInt506 != 0 && local18.aBoolean19) {
				local18.method422(arg0);
				local18.aBoolean19 = false;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6(@OriginalArg(0) int arg0) {
		@Pc(4) Class5_Sub3 local4 = this.aClass5_Sub3Array1[arg0];
		if (local4 != null) {
			if (local4.anIntArray68 != null) {
				this.aClass52_1.method1354(local4);
				local4.aBoolean19 = true;
				return local4.anIntArray68;
			}
			@Pc(39) boolean local39 = local4.method421(this.aDouble1, this.anInt15, this.aClass24_1);
			if (local39) {
				if (this.anInt16 == 0) {
					@Pc(58) Class5_Sub3 local58 = (Class5_Sub3) this.aClass52_1.method1356();
					local58.method419();
				} else {
					this.anInt16--;
				}
				this.aClass52_1.method1354(local4);
				local4.aBoolean19 = true;
				return local4.anIntArray68;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BD)V")
	public void method15(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method16();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)I")
	@Override
	public int method7(@OriginalArg(1) int arg0) {
		return this.aClass5_Sub3Array1[arg0] == null ? 0 : this.aClass5_Sub3Array1[arg0].anInt507;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public void method16() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass5_Sub3Array1.length; local3++) {
			if (this.aClass5_Sub3Array1[local3] != null) {
				this.aClass5_Sub3Array1[local3].method419();
			}
		}
		this.aClass52_1 = new Class52();
		this.anInt16 = this.anInt14;
	}
}
