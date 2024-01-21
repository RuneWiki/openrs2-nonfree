import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
	public int anInt1319;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "[I")
	public int[] anIntArray89;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "Lclient!id;")
	public Class1_Sub5_Sub4 aClass1_Sub5_Sub4_1;

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "Lclient!lh;")
	public Class1_Sub1_Sub11 aClass1_Sub1_Sub11_1;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
	public int anInt1325;

	@OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
	public int anInt1327;

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
	public int anInt1328;

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
	public int anInt1329;

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
	public int anInt1330;

	@OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
	public int anInt1331;

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
	public int anInt1333;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
	public int anInt1334;

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "Lclient!id;")
	public Class1_Sub5_Sub4 aClass1_Sub5_Sub4_2;

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
	public int anInt1337;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
	public void method821() {
		@Pc(2) int local2 = this.anInt1331;
		@Pc(20) Class1_Sub1_Sub11 local20 = this.aClass1_Sub1_Sub11_1.method1961();
		if (local20 == null) {
			this.anInt1330 = 0;
			this.anInt1331 = -1;
			this.anIntArray89 = null;
			this.anInt1329 = 0;
			this.anInt1327 = 0;
		} else {
			this.anIntArray89 = local20.anIntArray252;
			this.anInt1327 = local20.anInt2796 * 128;
			this.anInt1331 = local20.anInt2800;
			this.anInt1329 = local20.anInt2812;
			this.anInt1330 = local20.anInt2788;
		}
		if (local2 != this.anInt1331 && this.aClass1_Sub5_Sub4_1 != null) {
			Static2.aClass1_Sub5_Sub2_1.method1191(this.aClass1_Sub5_Sub4_1);
			this.aClass1_Sub5_Sub4_1 = null;
		}
	}
}
