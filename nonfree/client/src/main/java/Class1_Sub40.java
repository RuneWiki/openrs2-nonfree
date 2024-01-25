import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!we;")
	public Class11_Sub2_Sub6_Sub2 aClass11_Sub2_Sub6_Sub2_1;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
	public int anInt6086;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	public int anInt6087;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
	public int anInt6088;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Lclient!hh;")
	public Class1_Sub6_Sub2 aClass1_Sub6_Sub2_1;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public int anInt6089;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
	public int anInt6090;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!gn;")
	public Class71 aClass71_1;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
	public int anInt6092;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	public int anInt6093;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
	public int anInt6094;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "[I")
	public int[] anIntArray472;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	public int anInt6096;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Lclient!hh;")
	public Class1_Sub6_Sub2 aClass1_Sub6_Sub2_2;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	public int anInt6098;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	public int anInt6099;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "Lclient!wc;")
	public Class11_Sub2_Sub6_Sub1 aClass11_Sub2_Sub6_Sub1_3;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
	public int anInt6091 = 0;

	static {
		new Class106("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public void method5482() {
		@Pc(8) int local8 = this.anInt6099;
		if (this.aClass71_1 != null) {
			@Pc(86) Class71 local86 = this.aClass71_1.method2282();
			if (local86 == null) {
				this.anInt6086 = 0;
				this.anInt6093 = 0;
				this.anInt6088 = 0;
				this.anInt6087 = 0;
				this.anInt6099 = -1;
				this.anIntArray472 = null;
			} else {
				this.anInt6099 = local86.anInt2400;
				this.anInt6093 = local86.anInt2389;
				this.anIntArray472 = local86.anIntArray180;
				this.anInt6086 = local86.anInt2401 * 128;
				this.anInt6087 = local86.anInt2392;
				this.anInt6088 = local86.anInt2372;
			}
		} else if (this.aClass11_Sub2_Sub6_Sub2_1 != null) {
			@Pc(42) int local42 = Static53.method1331(this.aClass11_Sub2_Sub6_Sub2_1);
			if (local42 != local8) {
				this.anInt6099 = local42;
				@Pc(52) Class208 local52 = this.aClass11_Sub2_Sub6_Sub2_1.aClass208_1;
				if (local52.anIntArray480 != null) {
					local52 = local52.method5539();
				}
				if (local52 == null) {
					this.anInt6088 = this.anInt6086 = 0;
				} else {
					this.anInt6088 = local52.anInt6177;
					this.anInt6086 = local52.anInt6179 * 128;
				}
			}
		} else if (this.aClass11_Sub2_Sub6_Sub1_3 != null) {
			this.anInt6099 = Static143.method2853(this.aClass11_Sub2_Sub6_Sub1_3);
			this.anInt6086 = this.aClass11_Sub2_Sub6_Sub1_3.anInt6689 * 128;
			this.anInt6088 = this.aClass11_Sub2_Sub6_Sub1_3.anInt6696;
		}
		if (this.anInt6099 != local8 && this.aClass1_Sub6_Sub2_2 != null) {
			Static324.aClass1_Sub6_Sub3_2.method3786(this.aClass1_Sub6_Sub2_2);
			this.aClass1_Sub6_Sub2_2 = null;
		}
	}
}
