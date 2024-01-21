import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	public int anInt2188;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!n;")
	public Class4_Sub4_Sub3 aClass4_Sub4_Sub3_2;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
	public int anInt2189;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	public int anInt2190;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Lclient!hd;")
	public Class4_Sub1_Sub5 aClass4_Sub1_Sub5_1;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
	public int anInt2191;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
	public int anInt2192;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
	public int anInt2193;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
	public int anInt2195;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
	public int anInt2199;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "Lclient!n;")
	public Class4_Sub4_Sub3 aClass4_Sub4_Sub3_3;

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
	public int anInt2202;

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
	public int anInt2203;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public void method1449() {
		@Pc(6) int local6 = this.anInt2202;
		@Pc(11) Class4_Sub1_Sub5 local11 = this.aClass4_Sub1_Sub5_1.method885();
		if (local11 == null) {
			this.anInt2202 = -1;
			this.anIntArray222 = null;
			this.anInt2188 = 0;
			this.anInt2195 = 0;
			this.anInt2190 = 0;
		} else {
			this.anInt2190 = local11.anInt1279;
			this.anInt2188 = local11.anInt1283;
			this.anInt2202 = local11.anInt1282;
			this.anIntArray222 = local11.anIntArray135;
			this.anInt2195 = local11.anInt1271 * 128;
		}
		if (this.anInt2202 != local6 && this.aClass4_Sub4_Sub3_2 != null) {
			Static32.aClass4_Sub4_Sub4_1.method1642(this.aClass4_Sub4_Sub3_2);
			this.aClass4_Sub4_Sub3_2 = null;
		}
	}
}
