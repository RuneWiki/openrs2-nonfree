import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public int anInt2985;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "Lclient!nc;")
	public Class10_Sub5_Sub1 aClass10_Sub5_Sub1_2;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Z")
	public boolean aBoolean214;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "[I")
	public int[] anIntArray348;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	public int anInt2987;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "Lclient!j;")
	public Class3_Sub15_Sub1 aClass3_Sub15_Sub1_2;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
	public int anInt2988;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "Lclient!sd;")
	public Class10_Sub5_Sub2 aClass10_Sub5_Sub2_1;

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
	public int anInt2990;

	@OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
	public int anInt2992;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
	public int anInt2993;

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
	public int anInt2995;

	@OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
	public int anInt2996;

	@OriginalMember(owner = "client!lk", name = "K", descriptor = "Lclient!f;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
	public int anInt2997;

	@OriginalMember(owner = "client!lk", name = "M", descriptor = "Lclient!j;")
	public Class3_Sub15_Sub1 aClass3_Sub15_Sub1_3;

	@OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
	public int anInt2998;

	@OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
	public int anInt3000;

	@OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
	public int anInt2994 = 0;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V")
	public void method2657() {
		@Pc(10) int local10 = this.anInt2988;
		if (this.aClass49_1 != null) {
			@Pc(18) Class49 local18 = this.aClass49_1.method1112();
			if (local18 == null) {
				this.anInt3000 = 0;
				this.anIntArray348 = null;
				this.anInt2997 = 0;
				this.anInt2990 = 0;
				this.anInt2995 = 0;
				this.anInt2988 = -1;
			} else {
				this.anIntArray348 = local18.anIntArray135;
				this.anInt2990 = local18.anInt1333;
				this.anInt2988 = local18.anInt1358;
				this.anInt2995 = local18.anInt1366 * 128;
				this.anInt3000 = local18.anInt1338;
				this.anInt2997 = local18.anInt1341;
			}
		} else if (this.aClass10_Sub5_Sub2_1 != null) {
			@Pc(99) int local99 = Static221.method3631(this.aClass10_Sub5_Sub2_1);
			if (local10 != local99) {
				@Pc(107) Class124 local107 = this.aClass10_Sub5_Sub2_1.aClass124_1;
				this.anInt2988 = local99;
				if (local107.anIntArray432 != null) {
					local107 = local107.method3191();
				}
				if (local107 == null) {
					this.anInt2990 = this.anInt2995 = 0;
				} else {
					this.anInt2990 = local107.anInt3795;
					this.anInt2995 = local107.anInt3771 * 128;
				}
			}
		} else if (this.aClass10_Sub5_Sub1_2 != null) {
			this.anInt2988 = Static130.method2209(this.aClass10_Sub5_Sub1_2);
			this.anInt2995 = this.aClass10_Sub5_Sub1_2.anInt3587 * 128;
			this.anInt2990 = this.aClass10_Sub5_Sub1_2.anInt3585;
		}
		if (this.anInt2988 != local10 && this.aClass3_Sub15_Sub1_3 != null) {
			Static86.aClass3_Sub15_Sub2_1.method2432(this.aClass3_Sub15_Sub1_3);
			this.aClass3_Sub15_Sub1_3 = null;
		}
	}
}
