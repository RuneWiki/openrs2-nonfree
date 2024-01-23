import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "Lclient!no;")
	public Class22_Sub3_Sub1 aClass22_Sub3_Sub1_1;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	public int anInt962;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	public int anInt963;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "Lclient!ei;")
	public Class43 aClass43_1;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
	public int anInt964;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
	public int anInt965;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
	public int anInt966;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
	public int anInt967;

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "Z")
	public boolean aBoolean76;

	@OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
	public int anInt968;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
	public int anInt969;

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "Lclient!bd;")
	public Class1_Sub4_Sub1 aClass1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
	public int anInt971;

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
	public int anInt974;

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "Lclient!qm;")
	public Class22_Sub3_Sub2 aClass22_Sub3_Sub2_1;

	@OriginalMember(owner = "client!dm", name = "G", descriptor = "Lclient!bd;")
	public Class1_Sub4_Sub1 aClass1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
	public int anInt975;

	@OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
	public int anInt970 = 0;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	public void method873() {
		@Pc(14) int local14 = this.anInt971;
		if (this.aClass43_1 != null) {
			@Pc(22) Class43 local22 = this.aClass43_1.method1009();
			if (local22 == null) {
				this.anIntArray82 = null;
				this.anInt975 = 0;
				this.anInt971 = -1;
				this.anInt968 = 0;
				this.anInt965 = 0;
				this.anInt967 = 0;
			} else {
				this.anInt968 = local22.anInt1144;
				this.anInt965 = local22.anInt1173;
				this.anInt975 = local22.anInt1159;
				this.anIntArray82 = local22.anIntArray99;
				this.anInt971 = local22.anInt1188;
				this.anInt967 = local22.anInt1147 * 128;
			}
		} else if (this.aClass22_Sub3_Sub1_1 != null) {
			@Pc(104) int local104 = Static274.method4068(this.aClass22_Sub3_Sub1_1);
			if (local14 != local104) {
				this.anInt971 = local104;
				@Pc(114) Class112 local114 = this.aClass22_Sub3_Sub1_1.aClass112_1;
				if (local114.anIntArray283 != null) {
					local114 = local114.method2817();
				}
				if (local114 == null) {
					this.anInt975 = this.anInt967 = 0;
				} else {
					this.anInt975 = local114.anInt3526;
					this.anInt967 = local114.anInt3507 * 128;
				}
			}
		} else if (this.aClass22_Sub3_Sub2_1 != null) {
			this.anInt971 = Static84.method1250(this.aClass22_Sub3_Sub2_1);
			this.anInt975 = this.aClass22_Sub3_Sub2_1.anInt4667;
			this.anInt967 = this.aClass22_Sub3_Sub2_1.anInt4653 * 128;
		}
		if (local14 != this.anInt971 && this.aClass1_Sub4_Sub1_2 != null) {
			Static303.aClass1_Sub4_Sub2_2.method774(this.aClass1_Sub4_Sub1_2);
			this.aClass1_Sub4_Sub1_2 = null;
		}
	}
}
