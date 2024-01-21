import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	public int anInt2204;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
	public int anInt2205;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
	public int anInt2208;

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
	public int anInt2209;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
	public int anInt2210;

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
	public int anInt2211;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	public int anInt2213;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
	public int anInt2214;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Lclient!va;")
	public Class1_Sub12_Sub2 aClass1_Sub12_Sub2_1;

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
	public int anInt2215;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "Lclient!va;")
	public Class1_Sub12_Sub2 aClass1_Sub12_Sub2_2;

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "Lclient!je;")
	public Class1_Sub1_Sub9 aClass1_Sub1_Sub9_1;

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
	public int anInt2219;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	public void method1518() {
		@Pc(6) int local6 = this.anInt2213;
		@Pc(16) Class1_Sub1_Sub9 local16 = this.aClass1_Sub1_Sub9_1.method879();
		if (local16 == null) {
			this.anInt2213 = -1;
			this.anInt2204 = 0;
			this.anInt2219 = 0;
			this.anIntArray338 = null;
			this.anInt2209 = 0;
		} else {
			this.anInt2219 = local16.anInt1267 * 128;
			this.anInt2204 = local16.anInt1253;
			this.anInt2213 = local16.anInt1273;
			this.anIntArray338 = local16.anIntArray193;
			this.anInt2209 = local16.anInt1258;
		}
		if (local6 != this.anInt2213 && this.aClass1_Sub12_Sub2_1 != null) {
			Static91.aClass1_Sub12_Sub1_1.method1594(this.aClass1_Sub12_Sub2_1);
			this.aClass1_Sub12_Sub2_1 = null;
		}
	}
}
