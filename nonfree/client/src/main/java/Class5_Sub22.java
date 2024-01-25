import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class5_Sub22 extends Class5 {

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
	public int anInt3944;

	@OriginalMember(owner = "client!hw", name = "B", descriptor = "I")
	public int anInt3945;

	@OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
	public int anInt3946;

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
	public int anInt3947;

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "Lclient!ic;")
	public Class8_Sub1_Sub3_Sub2_Sub1 aClass8_Sub1_Sub3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
	public int anInt3948;

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
	public int anInt3949;

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "Lclient!nv;")
	public Class5_Sub37 aClass5_Sub37_2;

	@OriginalMember(owner = "client!hw", name = "z", descriptor = "Lclient!ps;")
	public Class5_Sub24_Sub1 aClass5_Sub24_Sub1_2;

	@OriginalMember(owner = "client!hw", name = "N", descriptor = "I")
	public int anInt3950;

	@OriginalMember(owner = "client!hw", name = "L", descriptor = "I")
	public int anInt3951;

	@OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
	public int anInt3952;

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
	public int anInt3953;

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "Lclient!nv;")
	public Class5_Sub37 aClass5_Sub37_3;

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
	public int anInt3954;

	@OriginalMember(owner = "client!hw", name = "C", descriptor = "Lclient!c;")
	public Class55 aClass55_1;

	@OriginalMember(owner = "client!hw", name = "r", descriptor = "Lclient!oaa;")
	public Class5_Sub16_Sub3 aClass5_Sub16_Sub3_2;

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!hw", name = "J", descriptor = "Lclient!nw;")
	public Class8_Sub1_Sub3_Sub2_Sub2 aClass8_Sub1_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "Z")
	public boolean aBoolean308;

	@OriginalMember(owner = "client!hw", name = "K", descriptor = "Z")
	public boolean aBoolean309;

	@OriginalMember(owner = "client!hw", name = "u", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!hw", name = "M", descriptor = "I")
	public int anInt3955;

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
	public int anInt3958;

	@OriginalMember(owner = "client!hw", name = "H", descriptor = "Lclient!ps;")
	public Class5_Sub24_Sub1 aClass5_Sub24_Sub1_3;

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "Lclient!oaa;")
	public Class5_Sub16_Sub3 aClass5_Sub16_Sub3_3;

	@OriginalMember(owner = "client!hw", name = "E", descriptor = "I")
	public int anInt3959;

	@OriginalMember(owner = "client!hw", name = "A", descriptor = "I")
	public int anInt3957 = 0;

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
	public void method3422() {
		@Pc(8) int local8 = this.anInt3954;
		@Pc(19) boolean local19 = this.aBoolean307;
		if (this.aClass55_1 != null) {
			@Pc(158) Class55 local158 = this.aClass55_1.method847(Static413.aClass118_1);
			if (local158 == null) {
				this.aBoolean309 = false;
				this.anInt3952 = 0;
				this.anInt3955 = 0;
				this.anInt3954 = -1;
				this.anInt3953 = 0;
				this.anInt3958 = 256;
				this.anInt3944 = 0;
				this.anInt3945 = 256;
				this.anIntArray227 = null;
				this.anInt3946 = 0;
				this.aBoolean307 = false;
			} else {
				this.anInt3952 = local158.anInt956;
				this.anInt3946 = local158.anInt945 << 9;
				this.anIntArray227 = local158.anIntArray48;
				this.aBoolean307 = local158.aBoolean84;
				this.anInt3953 = local158.anInt957;
				this.aBoolean309 = local158.aBoolean90;
				this.anInt3945 = local158.anInt909;
				this.anInt3954 = local158.anInt940;
				this.anInt3955 = local158.anInt925;
				this.anInt3958 = local158.anInt904;
			}
		} else if (this.aClass8_Sub1_Sub3_Sub2_Sub2_1 != null) {
			@Pc(32) int local32 = Static242.method3548(this.aClass8_Sub1_Sub3_Sub2_Sub2_1);
			if (local32 != local8) {
				this.anInt3954 = local32;
				@Pc(42) Class227 local42 = this.aClass8_Sub1_Sub3_Sub2_Sub2_1.aClass227_1;
				if (local42.anIntArray341 != null) {
					local42 = local42.method5322(Static413.aClass118_1);
				}
				if (local42 == null) {
					this.anInt3955 = this.anInt3946 = this.anInt3944 = 0;
					this.anInt3945 = 256;
					this.anInt3958 = 256;
					this.aBoolean307 = this.aClass8_Sub1_Sub3_Sub2_Sub2_1.aClass227_1.aBoolean465;
				} else {
					this.anInt3946 = local42.anInt6255 << 9;
					this.anInt3944 = local42.anInt6239 << 9;
					this.anInt3958 = local42.anInt6249;
					this.anInt3955 = local42.anInt6235;
					this.anInt3945 = local42.anInt6247;
					this.aBoolean307 = local42.aBoolean465;
				}
			}
		} else if (this.aClass8_Sub1_Sub3_Sub2_Sub1_2 != null) {
			this.anInt3954 = Static592.method8586(this.aClass8_Sub1_Sub3_Sub2_Sub1_2);
			this.aBoolean307 = this.aClass8_Sub1_Sub3_Sub2_Sub1_2.aBoolean330;
			this.anInt3946 = this.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt4190 << 9;
			this.anInt3955 = this.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt4209;
			this.anInt3958 = 256;
			this.anInt3945 = 256;
			this.anInt3944 = 0;
		}
		if (this.anInt3954 == local8 && local19 == this.aBoolean307) {
			return;
		}
		if (this.aClass5_Sub16_Sub3_2 == null) {
			return;
		}
		Static91.aClass5_Sub16_Sub1_1.method2554(this.aClass5_Sub16_Sub3_2);
		this.aClass5_Sub37_2 = null;
		this.aClass5_Sub24_Sub1_2 = null;
		this.aClass5_Sub16_Sub3_2 = null;
	}
}
