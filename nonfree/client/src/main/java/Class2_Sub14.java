import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "Lclient!kb;")
	public Class2_Sub3_Sub17 aClass2_Sub3_Sub17_1;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!gg;")
	public Class5_Sub2_Sub1 aClass5_Sub2_Sub1_1;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
	public int anInt887;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
	public int anInt888;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "Lclient!wb;")
	public Class2_Sub21_Sub4 aClass2_Sub21_Sub4_1;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "[I")
	public int[] anIntArray142;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
	public int anInt891;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	public int anInt893;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	public int anInt894;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "Z")
	public boolean aBoolean34;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
	public int anInt895;

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
	public int anInt899;

	@OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
	public int anInt900;

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "Lclient!hh;")
	public Class5_Sub2_Sub2 aClass5_Sub2_Sub2_2;

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "Lclient!wb;")
	public Class2_Sub21_Sub4 aClass2_Sub21_Sub4_2;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
	public int anInt901;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
	public int anInt902;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public int anInt885 = 0;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public void method645() {
		@Pc(6) int local6 = this.anInt893;
		if (this.aClass2_Sub3_Sub17_1 != null) {
			@Pc(14) Class2_Sub3_Sub17 local14 = this.aClass2_Sub3_Sub17_1.method1867();
			if (local14 == null) {
				this.anInt900 = 0;
				this.anIntArray142 = null;
				this.anInt893 = -1;
				this.anInt901 = 0;
				this.anInt899 = 0;
			} else {
				this.anInt893 = local14.anInt2372;
				this.anIntArray142 = local14.anIntArray411;
				this.anInt899 = local14.anInt2393;
				this.anInt900 = local14.anInt2396;
				this.anInt901 = local14.anInt2392 * 128;
			}
		} else if (this.aClass5_Sub2_Sub1_1 != null) {
			@Pc(63) int local63 = Static62.method1004(this.aClass5_Sub2_Sub1_1);
			if (local6 != local63) {
				this.anInt893 = local63;
				@Pc(73) Class2_Sub3_Sub9 local73 = this.aClass5_Sub2_Sub1_1.aClass2_Sub3_Sub9_1;
				if (local73.anIntArray230 != null) {
					local73 = local73.method1059();
				}
				if (local73 == null) {
					this.anInt901 = 0;
				} else {
					this.anInt901 = local73.anInt1293 * 128;
				}
			}
		} else if (this.aClass5_Sub2_Sub2_2 != null) {
			this.anInt893 = Static93.method1619(this.aClass5_Sub2_Sub2_2);
			this.anInt901 = this.aClass5_Sub2_Sub2_2.anInt1901 * 128;
		}
		if (this.anInt893 != local6 && this.aClass2_Sub21_Sub4_2 != null) {
			Static23.aClass2_Sub21_Sub3_1.method3390(this.aClass2_Sub21_Sub4_2);
			this.aClass2_Sub21_Sub4_2 = null;
		}
	}
}
