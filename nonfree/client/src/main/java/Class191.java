import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class191 {

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "F")
	public float aFloat152 = 0.25F;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "F")
	public float aFloat153 = 1.0F;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "F")
	public float aFloat151 = 1.0F;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public int anInt6038;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public int anInt6037;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public int anInt6039;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
	public int anInt6047;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public int anInt6041;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	public int anInt6040;

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Lclient!ib;")
	public Class4_Sub3_Sub10 aClass4_Sub3_Sub10_7;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class191() {
		this.anInt6038 = Static178.anInt3364;
		this.aFloat149 = 1.2F;
		this.anInt6037 = -50;
		this.anInt6039 = -50;
		this.anInt6047 = 0;
		this.aFloat148 = 1.1523438F;
		this.anInt6041 = -60;
		this.aFloat150 = 0.69921875F;
		this.anInt6040 = Static178.anInt3365;
		if (Static88.anIntArray163 != null) {
			this.aClass4_Sub3_Sub10_7 = Static116.method1839(Static88.anIntArray163[0], Static88.anIntArray163[1], Static88.anIntArray163[2], Static88.anIntArray163[3], Static88.anIntArray163[4], Static88.anIntArray163[5]);
		}
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class191(@OriginalArg(0) Class4_Sub10 arg0) {
		@Pc(16) int local16 = arg0.method4666();
		if ((local16 & 0x1) == 0) {
			this.anInt6038 = Static178.anInt3364;
		} else {
			this.anInt6038 = arg0.method4632();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat148 = 1.1523438F;
		} else {
			this.aFloat148 = (float) arg0.method4653() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat150 = 0.69921875F;
		} else {
			this.aFloat150 = (float) arg0.method4653() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat149 = 1.2F;
		} else {
			this.aFloat149 = (float) arg0.method4653() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6037 = -50;
			this.anInt6039 = -50;
			this.anInt6041 = -60;
		} else {
			this.anInt6039 = arg0.method4613();
			this.anInt6041 = arg0.method4613();
			this.anInt6037 = arg0.method4613();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6040 = Static178.anInt3365;
		} else {
			this.anInt6040 = arg0.method4632();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6047 = 0;
		} else {
			this.anInt6047 = arg0.method4653();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass4_Sub3_Sub10_7 = Static116.method1839(arg0.method4653(), arg0.method4653(), arg0.method4653(), arg0.method4653(), arg0.method4653(), arg0.method4653());
		} else if (Static88.anIntArray163 != null) {
			this.aClass4_Sub3_Sub10_7 = Static116.method1839(Static88.anIntArray163[0], Static88.anIntArray163[1], Static88.anIntArray163[2], Static88.anIntArray163[3], Static88.anIntArray163[4], Static88.anIntArray163[5]);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method4823(@OriginalArg(0) Class4_Sub10 arg0) {
		this.aFloat151 = (float) (arg0.method4666() * 8) / 255.0F;
		this.aFloat152 = (float) (arg0.method4666() * 8) / 255.0F;
		this.aFloat153 = (float) (arg0.method4666() * 8) / 255.0F;
	}
}
