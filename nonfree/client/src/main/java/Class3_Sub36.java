import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
	public int anInt6165;

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "Z")
	public boolean aBoolean431;

	@OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
	public int anInt6166;

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "Lclient!os;")
	public Class3_Sub5_Sub3 aClass3_Sub5_Sub3_3;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "[I")
	public int[] anIntArray455;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
	public int anInt6167;

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
	public int anInt6169;

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "Lclient!qt;")
	public Class1_Sub3_Sub3_Sub2 aClass1_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
	public int anInt6170;

	@OriginalMember(owner = "client!qv", name = "z", descriptor = "Lclient!os;")
	public Class3_Sub5_Sub3 aClass3_Sub5_Sub3_4;

	@OriginalMember(owner = "client!qv", name = "A", descriptor = "Lclient!mv;")
	public Class1_Sub3_Sub3_Sub1 aClass1_Sub3_Sub3_Sub1_3;

	@OriginalMember(owner = "client!qv", name = "B", descriptor = "Lclient!jt;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
	public int anInt6171;

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
	public int anInt6172;

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "I")
	public int anInt6176;

	@OriginalMember(owner = "client!qv", name = "K", descriptor = "I")
	public int anInt6178;

	@OriginalMember(owner = "client!qv", name = "L", descriptor = "I")
	public int anInt6179;

	@OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
	public int anInt6180;

	@OriginalMember(owner = "client!qv", name = "G", descriptor = "I")
	public int anInt6174 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	public void method4863() {
		@Pc(6) int local6 = this.anInt6176;
		if (this.aClass128_1 != null) {
			@Pc(87) Class128 local87 = this.aClass128_1.method3307(Static369.aClass11_1);
			if (local87 == null) {
				this.anInt6176 = -1;
				this.anIntArray455 = null;
				this.anInt6179 = 0;
				this.anInt6169 = 0;
				this.anInt6166 = 0;
				this.anInt6178 = 0;
			} else {
				this.anInt6179 = local87.anInt4046;
				this.anIntArray455 = local87.anIntArray305;
				this.anInt6178 = local87.anInt4043;
				this.anInt6176 = local87.anInt4041;
				this.anInt6166 = local87.anInt4012;
				this.anInt6169 = local87.anInt4026 << 7;
			}
		} else if (this.aClass1_Sub3_Sub3_Sub2_1 != null) {
			@Pc(39) int local39 = Static133.method2297(this.aClass1_Sub3_Sub3_Sub2_1);
			if (local6 != local39) {
				this.anInt6176 = local39;
				@Pc(53) Class47 local53 = this.aClass1_Sub3_Sub3_Sub2_1.aClass47_1;
				if (local53.anIntArray134 != null) {
					local53 = local53.method1296(Static369.aClass11_1);
				}
				if (local53 == null) {
					this.anInt6166 = this.anInt6169 = 0;
				} else {
					this.anInt6166 = local53.anInt1584;
					this.anInt6169 = local53.anInt1570 << 7;
				}
			}
		} else if (this.aClass1_Sub3_Sub3_Sub1_3 != null) {
			this.anInt6176 = Static151.method2693(this.aClass1_Sub3_Sub3_Sub1_3);
			this.anInt6169 = this.aClass1_Sub3_Sub3_Sub1_3.anInt4904 << 7;
			this.anInt6166 = this.aClass1_Sub3_Sub3_Sub1_3.anInt4896;
		}
		if (this.anInt6176 != local6 && this.aClass3_Sub5_Sub3_3 != null) {
			Static251.aClass3_Sub5_Sub4_1.method5196(this.aClass3_Sub5_Sub3_3);
			this.aClass3_Sub5_Sub3_3 = null;
		}
	}
}
