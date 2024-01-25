import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	public int anInt2112;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "Lclient!gn;")
	public Class3_Sub5_Sub2 aClass3_Sub5_Sub2_1;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	public int anInt2113;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
	public int anInt2114;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "Lclient!gn;")
	public Class3_Sub5_Sub2 aClass3_Sub5_Sub2_2;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "Lclient!at;")
	public Class7_Sub2_Sub3_Sub1 aClass7_Sub2_Sub3_Sub1_1;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "Lclient!gm;")
	public Class93 aClass93_1;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
	public int anInt2118;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "Lclient!ln;")
	public Class7_Sub2_Sub3_Sub2 aClass7_Sub2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
	public int anInt2123;

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
	public int anInt2125;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "Z")
	public boolean aBoolean168;

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
	public int anInt2126;

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
	public int anInt2127;

	@OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
	public int anInt2128;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	public int anInt2116 = 0;

	static {
		new Class189("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public void method1644() {
		@Pc(6) int local6 = this.anInt2118;
		if (this.aClass93_1 != null) {
			@Pc(87) Class93 local87 = this.aClass93_1.method2066(Static85.aClass49_1);
			if (local87 == null) {
				this.anIntArray126 = null;
				this.anInt2123 = 0;
				this.anInt2128 = 0;
				this.anInt2115 = 0;
				this.anInt2118 = -1;
				this.anInt2127 = 0;
			} else {
				this.anInt2128 = local87.anInt2779 << 7;
				this.anInt2115 = local87.anInt2743;
				this.anIntArray126 = local87.anIntArray170;
				this.anInt2118 = local87.anInt2746;
				this.anInt2123 = local87.anInt2792;
				this.anInt2127 = local87.anInt2759;
			}
		} else if (this.aClass7_Sub2_Sub3_Sub1_1 != null) {
			@Pc(21) int local21 = Static265.method3845(this.aClass7_Sub2_Sub3_Sub1_1);
			if (local6 != local21) {
				this.anInt2118 = local21;
				@Pc(31) Class47 local31 = this.aClass7_Sub2_Sub3_Sub1_1.aClass47_1;
				if (local31.anIntArray94 != null) {
					local31 = local31.method1251(Static85.aClass49_1);
				}
				if (local31 == null) {
					this.anInt2127 = this.anInt2128 = 0;
				} else {
					this.anInt2128 = local31.anInt1599 << 7;
					this.anInt2127 = local31.anInt1605;
				}
			}
		} else if (this.aClass7_Sub2_Sub3_Sub2_1 != null) {
			this.anInt2118 = Static108.method1847(this.aClass7_Sub2_Sub3_Sub2_1);
			this.anInt2127 = this.aClass7_Sub2_Sub3_Sub2_1.anInt4420;
			this.anInt2128 = this.aClass7_Sub2_Sub3_Sub2_1.anInt4430 << 7;
		}
		if (local6 != this.anInt2118 && this.aClass3_Sub5_Sub2_1 != null) {
			Static331.aClass3_Sub5_Sub1_42.method886(this.aClass3_Sub5_Sub2_1);
			this.aClass3_Sub5_Sub2_1 = null;
		}
	}
}
