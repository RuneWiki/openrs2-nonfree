import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public int anInt855;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
	public int anInt856;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	public int anInt857;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!ir;")
	public Class25_Sub5_Sub1_Sub1 aClass25_Sub5_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
	public int anInt859;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "Lclient!rd;")
	public Class1_Sub6_Sub3 aClass1_Sub6_Sub3_1;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "Lclient!er;")
	public Class68 aClass68_1;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	public int anInt861;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
	public int anInt862;

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	public int anInt864;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "Lclient!rd;")
	public Class1_Sub6_Sub3 aClass1_Sub6_Sub3_2;

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "Z")
	public boolean aBoolean98;

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "Lclient!lr;")
	public Class25_Sub5_Sub1_Sub2 aClass25_Sub5_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
	public int anInt867;

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
	public int anInt868;

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "[I")
	public int[] anIntArray41;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
	public int anInt866 = 0;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public void method834() {
		@Pc(14) int local14 = this.anInt864;
		if (this.aClass68_1 != null) {
			@Pc(94) Class68 local94 = this.aClass68_1.method1535(Static320.aClass249_2);
			if (local94 == null) {
				this.anInt858 = 0;
				this.anInt857 = 0;
				this.anInt862 = 0;
				this.anInt868 = 0;
				this.anIntArray41 = null;
				this.anInt864 = -1;
			} else {
				this.anIntArray41 = local94.anIntArray127;
				this.anInt864 = local94.anInt1801;
				this.anInt858 = local94.anInt1794;
				this.anInt857 = local94.anInt1805 << 7;
				this.anInt868 = local94.anInt1807;
				this.anInt862 = local94.anInt1795;
			}
		} else if (this.aClass25_Sub5_Sub1_Sub1_1 != null) {
			@Pc(48) int local48 = Static4.method58(this.aClass25_Sub5_Sub1_Sub1_1);
			if (local48 != local14) {
				this.anInt864 = local48;
				@Pc(58) Class54 local58 = this.aClass25_Sub5_Sub1_Sub1_1.aClass54_1;
				if (local58.anIntArray67 != null) {
					local58 = local58.method1148(Static320.aClass249_2);
				}
				if (local58 == null) {
					this.anInt858 = this.anInt857 = 0;
				} else {
					this.anInt858 = local58.anInt1350;
					this.anInt857 = local58.lb << 7;
				}
			}
		} else if (this.aClass25_Sub5_Sub1_Sub2_1 != null) {
			this.anInt864 = Static332.method4453(this.aClass25_Sub5_Sub1_Sub2_1);
			this.anInt858 = this.aClass25_Sub5_Sub1_Sub2_1.anInt4321;
			this.anInt857 = this.aClass25_Sub5_Sub1_Sub2_1.anInt4331 << 7;
		}
		if (local14 != this.anInt864 && this.aClass1_Sub6_Sub3_1 != null) {
			Static355.aClass1_Sub6_Sub4_2.method5179(this.aClass1_Sub6_Sub3_1);
			this.aClass1_Sub6_Sub3_1 = null;
		}
	}
}
