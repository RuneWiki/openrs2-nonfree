import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!km", name = "j", descriptor = "I")
	public int anInt5931;

	@OriginalMember(owner = "client!km", name = "k", descriptor = "Lclient!kba;")
	public Class3_Sub28 aClass3_Sub28_2;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public int anInt5932;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "Lclient!ts;")
	public Class330 aClass330_1;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "I")
	public int anInt5934;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "I")
	public int anInt5935;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "Lclient!wq;")
	public Class9_Sub2_Sub1_Sub2_Sub2 aClass9_Sub2_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "Z")
	public boolean aBoolean434;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "I")
	public int anInt5936;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "Z")
	public boolean aBoolean435;

	@OriginalMember(owner = "client!km", name = "v", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "I")
	public int anInt5937;

	@OriginalMember(owner = "client!km", name = "x", descriptor = "I")
	public int anInt5938;

	@OriginalMember(owner = "client!km", name = "y", descriptor = "Lclient!kca;")
	public Class3_Sub3_Sub5 aClass3_Sub3_Sub5_3;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "I")
	public int anInt5939;

	@OriginalMember(owner = "client!km", name = "A", descriptor = "I")
	public int anInt5940;

	@OriginalMember(owner = "client!km", name = "B", descriptor = "Lclient!cea;")
	public Class9_Sub2_Sub1_Sub2_Sub1 aClass9_Sub2_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!km", name = "C", descriptor = "I")
	public int anInt5941;

	@OriginalMember(owner = "client!km", name = "E", descriptor = "I")
	public int anInt5943;

	@OriginalMember(owner = "client!km", name = "F", descriptor = "Lclient!kba;")
	public Class3_Sub28 aClass3_Sub28_3;

	@OriginalMember(owner = "client!km", name = "I", descriptor = "Lclient!kca;")
	public Class3_Sub3_Sub5 aClass3_Sub3_Sub5_4;

	@OriginalMember(owner = "client!km", name = "J", descriptor = "I")
	public int anInt5946;

	@OriginalMember(owner = "client!km", name = "K", descriptor = "I")
	public int anInt5947;

	@OriginalMember(owner = "client!km", name = "L", descriptor = "Lclient!wo;")
	public Class3_Sub18_Sub1 aClass3_Sub18_Sub1_3;

	@OriginalMember(owner = "client!km", name = "N", descriptor = "Z")
	public boolean aBoolean436;

	@OriginalMember(owner = "client!km", name = "O", descriptor = "Lclient!wo;")
	public Class3_Sub18_Sub1 aClass3_Sub18_Sub1_4;

	@OriginalMember(owner = "client!km", name = "P", descriptor = "I")
	public int anInt5949;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	public int anInt5933 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public void method5121() {
		@Pc(8) int local8 = this.anInt5932;
		@Pc(11) boolean local11 = this.aBoolean436;
		if (this.aClass330_1 != null) {
			@Pc(20) Class330 local20 = this.aClass330_1.method7892(Static183.aClass285_1);
			if (local20 == null) {
				this.aBoolean436 = false;
				this.anInt5939 = 0;
				this.aBoolean435 = false;
				this.anInt5935 = 256;
				this.anInt5932 = -1;
				this.anInt5949 = 0;
				this.anInt5931 = 0;
				this.anInt5936 = 0;
				this.anIntArray317 = null;
				this.anInt5943 = 0;
				this.anInt5938 = 256;
			} else {
				this.anInt5939 = local20.anInt9206;
				this.aBoolean436 = local20.aBoolean683;
				this.anInt5932 = local20.anInt9189;
				this.anInt5931 = local20.anInt9205;
				this.anInt5938 = local20.anInt9188;
				this.anInt5935 = local20.anInt9225;
				this.anInt5943 = local20.anInt9208;
				this.anInt5936 = local20.anInt9224 << 9;
				this.aBoolean435 = local20.aBoolean685;
				this.anIntArray317 = local20.anIntArray579;
			}
		} else if (this.aClass9_Sub2_Sub1_Sub2_Sub2_1 != null) {
			@Pc(109) int local109 = Static14.method244(this.aClass9_Sub2_Sub1_Sub2_Sub2_1);
			if (local8 != local109) {
				this.anInt5932 = local109;
				@Pc(123) Class309 local123 = this.aClass9_Sub2_Sub1_Sub2_Sub2_1.aClass309_1;
				if (local123.anIntArray553 != null) {
					local123 = local123.method7594(Static183.aClass285_1);
				}
				if (local123 == null) {
					this.anInt5935 = 256;
					this.anInt5931 = this.anInt5936 = this.anInt5949 = 0;
					this.anInt5938 = 256;
					this.aBoolean436 = this.aClass9_Sub2_Sub1_Sub2_Sub2_1.aClass309_1.aBoolean657;
				} else {
					this.aBoolean436 = local123.aBoolean657;
					this.anInt5936 = local123.lb << 9;
					this.anInt5935 = local123.anInt8835;
					this.anInt5938 = local123.anInt8861;
					this.anInt5931 = local123.anInt8854;
					this.anInt5949 = local123.anInt8848 << 9;
				}
			}
		} else if (this.aClass9_Sub2_Sub1_Sub2_Sub1_2 != null) {
			this.anInt5932 = Static471.method6968(this.aClass9_Sub2_Sub1_Sub2_Sub1_2);
			this.anInt5949 = 0;
			this.anInt5931 = this.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt1304;
			this.anInt5936 = this.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt1324 << 9;
			this.anInt5935 = 256;
			this.aBoolean436 = this.aClass9_Sub2_Sub1_Sub2_Sub1_2.aBoolean78;
			this.anInt5938 = 256;
		}
		if ((local8 != this.anInt5932 || this.aBoolean436 != local11) && this.aClass3_Sub3_Sub5_3 != null) {
			Static304.aClass3_Sub3_Sub3_3.method2976(this.aClass3_Sub3_Sub5_3);
			this.aClass3_Sub3_Sub5_3 = null;
			this.aClass3_Sub28_2 = null;
			this.aClass3_Sub18_Sub1_4 = null;
		}
	}
}
