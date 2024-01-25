import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!qc;")
	public Class5_Sub4_Sub4_Sub2 aClass5_Sub4_Sub4_Sub2_1;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Z")
	public boolean aBoolean58;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!kk;")
	public Class3_Sub2_Sub3 aClass3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	public int anInt1257;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public int anInt1259;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	public int anInt1260;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	public int anInt1261;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "Lclient!kg;")
	public Class5_Sub4_Sub4_Sub1 aClass5_Sub4_Sub4_Sub1_1;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
	public int anInt1263;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
	public int anInt1267;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!qr;")
	public Class170 aClass170_1;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	public int anInt1268;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Lclient!kk;")
	public Class3_Sub2_Sub3 aClass3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
	public int anInt1269;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	public int anInt1270;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	public int anInt1271;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	public int anInt1272;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
	public int anInt1266 = 0;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public void method955() {
		@Pc(13) int local13 = this.anInt1259;
		if (this.aClass170_1 != null) {
			@Pc(95) Class170 local95 = this.aClass170_1.method4398();
			if (local95 == null) {
				this.anIntArray81 = null;
				this.anInt1270 = 0;
				this.anInt1263 = 0;
				this.anInt1260 = 0;
				this.anInt1259 = -1;
				this.anInt1269 = 0;
			} else {
				this.anIntArray81 = local95.anIntArray425;
				this.anInt1270 = local95.anInt5241 * 128;
				this.anInt1269 = local95.anInt5252;
				this.anInt1259 = local95.anInt5214;
				this.anInt1263 = local95.anInt5243;
				this.anInt1260 = local95.anInt5220;
			}
		} else if (this.aClass5_Sub4_Sub4_Sub2_1 != null) {
			@Pc(47) int local47 = Static350.method5690(this.aClass5_Sub4_Sub4_Sub2_1);
			if (local13 != local47) {
				this.anInt1259 = local47;
				@Pc(61) Class119 local61 = this.aClass5_Sub4_Sub4_Sub2_1.aClass119_1;
				if (local61.anIntArray248 != null) {
					local61 = local61.method2882();
				}
				if (local61 == null) {
					this.anInt1260 = this.anInt1270 = 0;
				} else {
					this.anInt1260 = local61.anInt3637;
					this.anInt1270 = local61.anInt3674 * 128;
				}
			}
		} else if (this.aClass5_Sub4_Sub4_Sub1_1 != null) {
			this.anInt1259 = Static286.method4914(this.aClass5_Sub4_Sub4_Sub1_1);
			this.anInt1270 = this.aClass5_Sub4_Sub4_Sub1_1.anInt3416 * 128;
			this.anInt1260 = this.aClass5_Sub4_Sub4_Sub1_1.anInt3427;
		}
		if (this.anInt1259 != local13 && this.aClass3_Sub2_Sub3_2 != null) {
			Static273.aClass3_Sub2_Sub2_2.method1367(this.aClass3_Sub2_Sub3_2);
			this.aClass3_Sub2_Sub3_2 = null;
		}
	}
}
