import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class5_Sub31 extends Class5 {

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "[Lclient!rl;")
	private static final Class210[] aClass210Array1 = new Class210[32];

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
	public int anInt4918;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	public int anInt4919;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!sj;")
	public Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	public int anInt4920;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	public int anInt4921;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!lm;")
	public Class5_Sub22_Sub2 aClass5_Sub22_Sub2_3;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
	public int anInt4923;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	public int anInt4924;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
	public int anInt4925;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "[I")
	public int[] anIntArray371;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	public int anInt4926;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "Lclient!ii;")
	public Class114 aClass114_1;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	public int anInt4927;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "Lclient!pv;")
	public Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "Z")
	public boolean aBoolean341;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "Lclient!lm;")
	public Class5_Sub22_Sub2 aClass5_Sub22_Sub2_4;

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
	public int anInt4930;

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
	public int anInt4931;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
	public int anInt4929 = 0;

	static {
		@Pc(77) Class210[] local77 = Static364.method4706();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass210Array1[local77[local79].anInt5855] = local77[local79];
		}
		new Class198("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
	public void method3901() {
		@Pc(8) int local8 = this.anInt4923;
		if (this.aClass114_1 != null) {
			@Pc(92) Class114 local92 = this.aClass114_1.method2393(Static408.aClass39_1);
			if (local92 == null) {
				this.anIntArray371 = null;
				this.anInt4927 = 0;
				this.anInt4923 = -1;
				this.anInt4920 = 0;
				this.anInt4931 = 0;
				this.anInt4919 = 0;
			} else {
				this.anInt4919 = local92.anInt2977;
				this.anIntArray371 = local92.anIntArray172;
				this.anInt4931 = local92.anInt3000;
				this.anInt4923 = local92.anInt2985;
				this.anInt4920 = local92.anInt2956 << 7;
				this.anInt4927 = local92.anInt2984;
			}
		} else if (this.aClass2_Sub1_Sub3_Sub1_2 != null) {
			@Pc(19) int local19 = Static166.method2331(this.aClass2_Sub1_Sub3_Sub1_2);
			if (local8 != local19) {
				this.anInt4923 = local19;
				@Pc(33) Class131 local33 = this.aClass2_Sub1_Sub3_Sub1_2.aClass131_1;
				if (local33.anIntArray209 != null) {
					local33 = local33.method2781(Static408.aClass39_1);
				}
				if (local33 == null) {
					this.anInt4927 = this.anInt4920 = 0;
				} else {
					this.anInt4920 = local33.anInt3454 << 7;
					this.anInt4927 = local33.anInt3491;
				}
			}
		} else if (this.aClass2_Sub1_Sub3_Sub2_2 != null) {
			this.anInt4923 = Static132.method454(this.aClass2_Sub1_Sub3_Sub2_2);
			this.anInt4927 = this.aClass2_Sub1_Sub3_Sub2_2.anInt6201;
			this.anInt4920 = this.aClass2_Sub1_Sub3_Sub2_2.anInt6204 << 7;
		}
		if (local8 != this.anInt4923 && this.aClass5_Sub22_Sub2_4 != null) {
			Static119.aClass5_Sub22_Sub3_3.method3636(this.aClass5_Sub22_Sub2_4);
			this.aClass5_Sub22_Sub2_4 = null;
		}
	}
}
