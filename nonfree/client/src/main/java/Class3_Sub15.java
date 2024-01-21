import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!w;")
	public Class3_Sub5_Sub4 aClass3_Sub5_Sub4_1;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Lclient!w;")
	public Class3_Sub5_Sub4 aClass3_Sub5_Sub4_2;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	public int anInt2310;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
	public int anInt2311;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public int anInt2312;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
	public int anInt2313;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
	public int anInt2314;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
	public int anInt2316;

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "Lclient!ih;")
	public Class3_Sub2_Sub9 aClass3_Sub2_Sub9_1;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
	public int anInt2318;

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
	public int anInt2319;

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
	public int anInt2321;

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
	public int anInt2322;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public void method1572() {
		@Pc(6) int local6 = this.anInt2321;
		@Pc(15) Class3_Sub2_Sub9 local15 = this.aClass3_Sub2_Sub9_1.method1199();
		if (local15 == null) {
			this.anInt2310 = 0;
			this.anIntArray236 = null;
			this.anInt2313 = 0;
			this.anInt2321 = -1;
			this.anInt2322 = 0;
		} else {
			this.anInt2310 = local15.anInt1827;
			this.anIntArray236 = local15.anIntArray169;
			this.anInt2321 = local15.anInt1809;
			this.anInt2322 = local15.anInt1832 * 128;
			this.anInt2313 = local15.anInt1807;
		}
		if (local6 != this.anInt2321 && this.aClass3_Sub5_Sub4_2 != null) {
			Static163.aClass3_Sub5_Sub3_2.method2451(this.aClass3_Sub5_Sub4_2);
			this.aClass3_Sub5_Sub4_2 = null;
		}
	}
}
