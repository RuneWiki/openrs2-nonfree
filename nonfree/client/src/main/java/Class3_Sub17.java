import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "[I")
	public static final int[] anIntArray175 = new int[16384];

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "[I")
	public static final int[] anIntArray177 = new int[16384];

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!an;")
	public Class9_Sub1_Sub1_Sub2_Sub1 aClass9_Sub1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!ee;")
	public Class3_Sub20_Sub1 aClass3_Sub20_Sub1_2;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!nq;")
	public Class3_Sub36 aClass3_Sub36_1;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Z")
	public boolean aBoolean203;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public int anInt2489;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	public int anInt2490;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Lclient!bd;")
	public Class23 aClass23_1;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
	public int anInt2491;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Z")
	public boolean aBoolean204;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Z")
	public boolean aBoolean205;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!og;")
	public Class9_Sub1_Sub1_Sub2_Sub2 aClass9_Sub1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
	public int anInt2493;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "Lclient!cl;")
	public Class3_Sub6_Sub2 aClass3_Sub6_Sub2_2;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "[I")
	public int[] anIntArray176;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "Lclient!ee;")
	public Class3_Sub20_Sub1 aClass3_Sub20_Sub1_3;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
	public int anInt2494;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
	public int anInt2496;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "Lclient!cl;")
	public Class3_Sub6_Sub2 aClass3_Sub6_Sub2_3;

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
	public int anInt2498;

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "Lclient!nq;")
	public Class3_Sub36 aClass3_Sub36_2;

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
	public int anInt2499;

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
	public int anInt2500;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public int anInt2488 = 0;

	static {
		@Pc(14) double local14 = 3.834951969714103E-4D;
		for (@Pc(16) int local16 = 0; local16 < 16384; local16++) {
			anIntArray175[local16] = (int) (Math.sin(local14 * (double) local16) * 16384.0D);
			anIntArray177[local16] = (int) (Math.cos((double) local16 * local14) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method2233() {
		@Pc(8) int local8 = this.anInt2498;
		@Pc(11) boolean local11 = this.aBoolean205;
		if (this.aClass23_1 != null) {
			@Pc(106) Class23 local106 = this.aClass23_1.method587(Static427.aClass56_1);
			if (local106 == null) {
				this.anInt2493 = 0;
				this.aBoolean205 = false;
				this.anInt2498 = -1;
				this.anInt2496 = 0;
				this.aBoolean204 = false;
				this.anInt2491 = 0;
				this.anIntArray176 = null;
				this.anInt2499 = 0;
			} else {
				this.aBoolean204 = local106.aBoolean70;
				this.anInt2499 = local106.anInt778;
				this.anInt2491 = local106.anInt781;
				this.aBoolean205 = local106.aBoolean62;
				this.anInt2498 = local106.anInt742;
				this.anInt2496 = local106.anInt731;
				this.anIntArray176 = local106.anIntArray76;
				this.anInt2493 = local106.anInt783 << 9;
			}
		} else if (this.aClass9_Sub1_Sub1_Sub2_Sub1_1 != null) {
			@Pc(22) int local22 = Static459.method6379(this.aClass9_Sub1_Sub1_Sub2_Sub1_1);
			if (local22 != local8) {
				this.anInt2498 = local22;
				@Pc(32) Class294 local32 = this.aClass9_Sub1_Sub1_Sub2_Sub1_1.aClass294_1;
				if (local32.anIntArray588 != null) {
					local32 = local32.method6429(Static427.aClass56_1);
				}
				if (local32 == null) {
					this.anInt2499 = this.anInt2493 = 0;
					this.aBoolean205 = this.aClass9_Sub1_Sub1_Sub2_Sub1_1.aClass294_1.aBoolean604;
				} else {
					this.aBoolean205 = local32.aBoolean604;
					this.anInt2499 = local32.anInt7625;
					this.anInt2493 = local32.anInt7628 << 9;
				}
			}
		} else if (this.aClass9_Sub1_Sub1_Sub2_Sub2_1 != null) {
			this.anInt2498 = Static541.method7125(this.aClass9_Sub1_Sub1_Sub2_Sub2_1);
			this.aBoolean205 = this.aClass9_Sub1_Sub1_Sub2_Sub2_1.aBoolean534;
			this.anInt2499 = this.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6508;
			this.anInt2493 = this.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6476 << 9;
		}
		if (local8 == this.anInt2498 && local11 == this.aBoolean205) {
			return;
		}
		if (this.aClass3_Sub6_Sub2_2 == null) {
			return;
		}
		Static164.aClass3_Sub6_Sub1_1.method291(this.aClass3_Sub6_Sub2_2);
		this.aClass3_Sub36_1 = null;
		this.aClass3_Sub6_Sub2_2 = null;
		this.aClass3_Sub20_Sub1_3 = null;
	}
}
