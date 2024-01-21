import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
	public int anInt1408;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
	public int anInt1410;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
	public int anInt1411;

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "Lclient!jc;")
	public Class3_Sub3_Sub4 aClass3_Sub3_Sub4_1;

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
	public int anInt1412;

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "Lclient!ba;")
	public Class3_Sub1_Sub2 aClass3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
	public int anInt1413;

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "Lclient!ba;")
	public Class3_Sub1_Sub2 aClass3_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
	public int anInt1415;

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
	public int anInt1417;

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
	public int anInt1419;

	@OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
	public int anInt1420;

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
	public int anInt1421;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	public void method1054() {
		@Pc(12) int local12 = this.anInt1420;
		@Pc(17) Class3_Sub3_Sub4 local17 = this.aClass3_Sub3_Sub4_1.method974();
		if (local17 == null) {
			this.anInt1419 = 0;
			this.anInt1421 = 0;
			this.anInt1412 = 0;
			this.anInt1420 = -1;
			this.anIntArray233 = null;
		} else {
			this.anInt1420 = local17.anInt1308;
			this.anInt1421 = local17.anInt1320;
			this.anInt1419 = local17.anInt1331;
			this.anIntArray233 = local17.anIntArray216;
			this.anInt1412 = local17.anInt1305 * 128;
		}
		if (this.anInt1420 != local12 && this.aClass3_Sub1_Sub2_2 != null) {
			Static36.aClass3_Sub1_Sub1_1.method57(this.aClass3_Sub1_Sub2_2);
			this.aClass3_Sub1_Sub2_2 = null;
		}
	}
}
