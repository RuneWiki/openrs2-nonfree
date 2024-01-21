import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class5_Sub2_Sub4_Sub6 extends Class5_Sub2_Sub4 {

	@OriginalMember(owner = "client!n", name = "zb", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!n", name = "Kb", descriptor = "I")
	private int anInt2072 = 0;

	@OriginalMember(owner = "client!n", name = "Fb", descriptor = "I")
	private int anInt2067 = 0;

	@OriginalMember(owner = "client!n", name = "tb", descriptor = "I")
	private final int anInt2060;

	@OriginalMember(owner = "client!n", name = "wb", descriptor = "I")
	public final int anInt2063;

	@OriginalMember(owner = "client!n", name = "Lb", descriptor = "I")
	public final int anInt2073;

	@OriginalMember(owner = "client!n", name = "ub", descriptor = "I")
	public final int anInt2061;

	@OriginalMember(owner = "client!n", name = "xb", descriptor = "I")
	public final int anInt2064;

	@OriginalMember(owner = "client!n", name = "Wb", descriptor = "I")
	public final int anInt2079;

	@OriginalMember(owner = "client!n", name = "Vb", descriptor = "Lclient!ka;")
	private Class5_Sub2_Sub9 aClass5_Sub2_Sub9_3;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub2_Sub4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2060 = arg0;
		this.anInt2063 = arg1;
		this.anInt2073 = arg3;
		this.anInt2061 = arg4;
		this.anInt2064 = arg2;
		this.anInt2079 = arg6 + arg5;
		@Pc(37) int local37 = Static91.method1710(this.anInt2060).anInt2869;
		if (local37 == -1) {
			this.aBoolean98 = true;
		} else {
			this.aBoolean98 = false;
			this.aClass5_Sub2_Sub9_3 = Static63.method1252(local37);
		}
	}

	@OriginalMember(owner = "client!n", name = "g", descriptor = "(I)Lclient!dd;")
	@Override
	public Class5_Sub2_Sub4_Sub2 method1612() {
		@Pc(8) Class5_Sub2_Sub15 local8 = Static91.method1710(this.anInt2060);
		@Pc(18) Class5_Sub2_Sub4_Sub2 local18;
		if (this.aBoolean98) {
			local18 = local8.method1965(-1);
		} else {
			local18 = local8.method1965(this.anInt2072);
		}
		return local18 == null ? null : local18;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
	public void method1384(@OriginalArg(1) int arg0) {
		if (this.aBoolean98) {
			return;
		}
		this.anInt2067 += arg0;
		while (this.anInt2067 > this.aClass5_Sub2_Sub9_3.anIntArray252[this.anInt2072]) {
			this.anInt2067 -= this.aClass5_Sub2_Sub9_3.anIntArray252[this.anInt2072];
			this.anInt2072++;
			if (this.anInt2072 >= this.aClass5_Sub2_Sub9_3.anIntArray249.length) {
				this.aBoolean98 = true;
				break;
			}
		}
	}
}
