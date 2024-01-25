import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
	public int anInt2360;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	public int anInt2361;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
	public int anInt2363;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
	public int anInt2364;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "Lclient!vm;")
	public Class6_Sub5_Sub4 aClass6_Sub5_Sub4_1;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
	public int anInt2366;

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "Lclient!in;")
	public Class118 aClass118_1;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
	public int anInt2368;

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	public int anInt2369;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
	public int anInt2370;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "Lclient!qh;")
	public Class3_Sub3_Sub6_Sub1 aClass3_Sub3_Sub6_Sub1_2;

	@OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
	public int anInt2371;

	@OriginalMember(owner = "client!gr", name = "C", descriptor = "Lclient!vm;")
	public Class6_Sub5_Sub4 aClass6_Sub5_Sub4_2;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
	public int anInt2373;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "Z")
	public boolean aBoolean179;

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
	public int anInt2374;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "Lclient!uj;")
	public Class3_Sub3_Sub6_Sub2 aClass3_Sub3_Sub6_Sub2_1;

	@OriginalMember(owner = "client!gr", name = "H", descriptor = "[I")
	public int[] anIntArray240;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
	public int anInt2362 = 0;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)V")
	public void method2180() {
		@Pc(14) int local14 = this.anInt2361;
		if (this.aClass118_1 != null) {
			@Pc(23) Class118 local23 = this.aClass118_1.method2718(Static71.aClass126_1);
			if (local23 == null) {
				this.anInt2373 = 0;
				this.anIntArray240 = null;
				this.anInt2361 = -1;
				this.anInt2364 = 0;
				this.anInt2360 = 0;
				this.anInt2371 = 0;
			} else {
				this.anInt2371 = local23.anInt2991;
				this.anInt2364 = local23.anInt2989;
				this.anIntArray240 = local23.anIntArray276;
				this.anInt2360 = local23.anInt3017 << 7;
				this.anInt2361 = local23.anInt2987;
				this.anInt2373 = local23.anInt2977;
			}
		} else if (this.aClass3_Sub3_Sub6_Sub2_1 != null) {
			@Pc(81) int local81 = Static402.method5467(this.aClass3_Sub3_Sub6_Sub2_1);
			if (local14 != local81) {
				this.anInt2361 = local81;
				@Pc(95) Class17 local95 = this.aClass3_Sub3_Sub6_Sub2_1.aClass17_1;
				if (local95.anIntArray26 != null) {
					local95 = local95.method288(Static71.aClass126_1);
				}
				if (local95 == null) {
					this.anInt2373 = this.anInt2360 = 0;
				} else {
					this.anInt2373 = local95.anInt330;
					this.anInt2360 = local95.anInt335 << 7;
				}
			}
		} else if (this.aClass3_Sub3_Sub6_Sub1_2 != null) {
			this.anInt2361 = Static158.method2617(this.aClass3_Sub3_Sub6_Sub1_2);
			this.anInt2373 = this.aClass3_Sub3_Sub6_Sub1_2.anInt5510;
			this.anInt2360 = this.aClass3_Sub3_Sub6_Sub1_2.anInt5528 << 7;
		}
		if (this.anInt2361 != local14 && this.aClass6_Sub5_Sub4_1 != null) {
			Static371.aClass6_Sub5_Sub2_2.method2168(this.aClass6_Sub5_Sub4_1);
			this.aClass6_Sub5_Sub4_1 = null;
		}
	}
}
