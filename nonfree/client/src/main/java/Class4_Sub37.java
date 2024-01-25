import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class4_Sub37 extends Class4 {

	@OriginalMember(owner = "client!t", name = "n", descriptor = "I")
	public int anInt6019;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "I")
	public int anInt6021;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "I")
	public int anInt6022;

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!gm;")
	public Class4_Sub13_Sub1 aClass4_Sub13_Sub1_2;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "Lclient!ur;")
	public Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "I")
	public int anInt6023;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "I")
	public int anInt6024;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "I")
	public int anInt6025;

	@OriginalMember(owner = "client!t", name = "w", descriptor = "Lclient!ds;")
	public Class56 aClass56_1;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "I")
	public int anInt6026;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "I")
	public int anInt6028;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	public int anInt6029;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "I")
	public int anInt6030;

	@OriginalMember(owner = "client!t", name = "F", descriptor = "[I")
	public int[] anIntArray492;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "I")
	public int anInt6033;

	@OriginalMember(owner = "client!t", name = "K", descriptor = "Lclient!gm;")
	public Class4_Sub13_Sub1 aClass4_Sub13_Sub1_3;

	@OriginalMember(owner = "client!t", name = "N", descriptor = "Z")
	public boolean aBoolean527;

	@OriginalMember(owner = "client!t", name = "R", descriptor = "Lclient!c;")
	public Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!t", name = "L", descriptor = "I")
	public int anInt6037 = 0;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
	public void method5070() {
		@Pc(8) int local8 = this.anInt6030;
		if (this.aClass56_1 != null) {
			@Pc(93) Class56 local93 = this.aClass56_1.method1093();
			if (local93 == null) {
				this.anInt6030 = -1;
				this.anInt6021 = 0;
				this.anInt6029 = 0;
				this.anInt6028 = 0;
				this.anInt6023 = 0;
				this.anIntArray492 = null;
			} else {
				this.anInt6029 = local93.anInt1317;
				this.anIntArray492 = local93.anIntArray152;
				this.anInt6028 = local93.anInt1314 * 128;
				this.anInt6023 = local93.anInt1342;
				this.anInt6021 = local93.anInt1334;
				this.anInt6030 = local93.anInt1328;
			}
		} else if (this.aClass2_Sub2_Sub1_Sub2_1 != null) {
			@Pc(45) int local45 = Static125.method5100(this.aClass2_Sub2_Sub1_Sub2_1);
			if (local45 != local8) {
				this.anInt6030 = local45;
				@Pc(59) Class34 local59 = this.aClass2_Sub2_Sub1_Sub2_1.aClass34_1;
				if (local59.anIntArray108 != null) {
					local59 = local59.method748();
				}
				if (local59 == null) {
					this.anInt6021 = this.anInt6028 = 0;
				} else {
					this.anInt6028 = local59.anInt861 * 128;
					this.anInt6021 = local59.anInt848;
				}
			}
		} else if (this.aClass2_Sub2_Sub1_Sub1_2 != null) {
			this.anInt6030 = Static225.method3867(this.aClass2_Sub2_Sub1_Sub1_2);
			this.anInt6021 = this.aClass2_Sub2_Sub1_Sub1_2.anInt725;
			this.anInt6028 = this.aClass2_Sub2_Sub1_Sub1_2.anInt730 * 128;
		}
		if (local8 != this.anInt6030 && this.aClass4_Sub13_Sub1_2 != null) {
			Static337.aClass4_Sub13_Sub2_2.method2499(this.aClass4_Sub13_Sub1_2);
			this.aClass4_Sub13_Sub1_2 = null;
		}
	}
}
