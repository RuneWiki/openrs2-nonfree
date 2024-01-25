import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "[C")
	private static final char[] aCharArray3 = new char[64];

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
	public boolean aBoolean263;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!wda;")
	public Class3_Sub50 aClass3_Sub50_1;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public int anInt3357;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Z")
	public boolean aBoolean264;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!oh;")
	public Class41_Sub2_Sub1_Sub4_Sub1 aClass41_Sub2_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	public int anInt3358;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	public int anInt3359;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!ug;")
	public Class3_Sub48_Sub1 aClass3_Sub48_Sub1_2;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Z")
	public boolean aBoolean265;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	public int anInt3361;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
	public int anInt3362;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!qp;")
	public Class280 aClass280_1;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	public int anInt3364;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Lclient!am;")
	public Class3_Sub4_Sub1 aClass3_Sub4_Sub1_2;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "Lclient!am;")
	public Class3_Sub4_Sub1 aClass3_Sub4_Sub1_3;

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
	public int anInt3368;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "Lclient!wn;")
	public Class41_Sub2_Sub1_Sub4_Sub2 aClass41_Sub2_Sub1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "Lclient!ug;")
	public Class3_Sub48_Sub1 aClass3_Sub48_Sub1_3;

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
	public int anInt3370;

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
	public int anInt3371;

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
	public int anInt3372;

	@OriginalMember(owner = "client!gd", name = "R", descriptor = "Lclient!wda;")
	public Class3_Sub50 aClass3_Sub50_2;

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
	public int anInt3373;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
	public int anInt3363 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray3[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray3[local18] = (char) (local18 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray3[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray3[63] = '/';
		aCharArray3[62] = '+';
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public void method3023() {
		@Pc(8) int local8 = this.anInt3372;
		@Pc(19) boolean local19 = this.aBoolean264;
		if (this.aClass280_1 != null) {
			@Pc(114) Class280 local114 = this.aClass280_1.method6181(Static491.aClass318_1);
			if (local114 == null) {
				this.anInt3358 = 0;
				this.anInt3361 = 0;
				this.anInt3373 = 0;
				this.anIntArray172 = null;
				this.anInt3372 = -1;
				this.aBoolean263 = false;
				this.aBoolean264 = false;
				this.anInt3362 = 0;
			} else {
				this.anInt3358 = local114.anInt7362;
				this.anInt3372 = local114.anInt7370;
				this.aBoolean264 = local114.aBoolean551;
				this.aBoolean263 = local114.aBoolean550;
				this.anInt3361 = local114.anInt7345 << 9;
				this.anInt3362 = local114.anInt7363;
				this.anInt3373 = local114.anInt7401;
				this.anIntArray172 = local114.anIntArray458;
			}
		} else if (this.aClass41_Sub2_Sub1_Sub4_Sub1_1 != null) {
			@Pc(30) int local30 = Static270.method4111(this.aClass41_Sub2_Sub1_Sub4_Sub1_1);
			if (local30 != local8) {
				this.anInt3372 = local30;
				@Pc(40) Class264 local40 = this.aClass41_Sub2_Sub1_Sub4_Sub1_1.aClass264_1;
				if (local40.anIntArray443 != null) {
					local40 = local40.method5994(Static491.aClass318_1);
				}
				if (local40 == null) {
					this.aBoolean264 = this.aClass41_Sub2_Sub1_Sub4_Sub1_1.aClass264_1.aBoolean532;
					this.anInt3358 = this.anInt3361 = 0;
				} else {
					this.aBoolean264 = local40.aBoolean532;
					this.anInt3361 = local40.anInt7168 << 9;
					this.anInt3358 = local40.anInt7160;
				}
			}
		} else if (this.aClass41_Sub2_Sub1_Sub4_Sub2_1 != null) {
			this.anInt3372 = Static252.method3888(this.aClass41_Sub2_Sub1_Sub4_Sub2_1);
			this.aBoolean264 = this.aClass41_Sub2_Sub1_Sub4_Sub2_1.aBoolean744;
			this.anInt3361 = this.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9570 << 9;
			this.anInt3358 = this.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9576;
		}
		if (this.anInt3372 == local8 && local19 == this.aBoolean264) {
			return;
		}
		if (this.aClass3_Sub4_Sub1_3 == null) {
			return;
		}
		Static353.aClass3_Sub4_Sub2_1.method639(this.aClass3_Sub4_Sub1_3);
		this.aClass3_Sub4_Sub1_3 = null;
		this.aClass3_Sub48_Sub1_2 = null;
		this.aClass3_Sub50_1 = null;
	}
}
