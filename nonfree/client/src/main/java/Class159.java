import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class159 {

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "F")
	public float aFloat48 = 1.0F;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "F")
	public float aFloat50 = 0.25F;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "F")
	public float aFloat49 = 1.0F;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
	public final int anInt4050;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	public final int anInt4051;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	public final int anInt4053;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Lclient!ks;")
	public final Class109 aClass109_2;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
	public final int anInt4046;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
	public final int anInt4048;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "F")
	public final float aFloat46;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	public final int anInt4052;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "F")
	public final float aFloat45;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "F")
	public final float aFloat47;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class159() {
		this.anInt4050 = -60;
		this.anInt4051 = 0;
		this.anInt4053 = -50;
		this.aClass109_2 = Static328.aClass109_4;
		this.anInt4046 = Static319.anInt5482;
		this.anInt4048 = Static340.anInt6975;
		this.aFloat46 = 1.1523438F;
		this.anInt4052 = -50;
		this.aFloat45 = 1.2F;
		this.aFloat47 = 0.69921875F;
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class159(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(16) int local16 = arg0.method3580();
		if (Static2.aClass148_Sub1_1.method3040(Static288.anInt4743) && Static420.aClass163_11.method5553() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt4046 = Static319.anInt5482;
			} else {
				this.anInt4046 = arg0.method3574();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat46 = 1.1523438F;
			} else {
				this.aFloat46 = (float) arg0.method3555() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat47 = 0.69921875F;
			} else {
				this.aFloat47 = (float) arg0.method3555() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat45 = 1.2F;
			} else {
				this.aFloat45 = (float) arg0.method3555() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3574();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3555();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3555();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3555();
			}
			this.aFloat45 = 1.2F;
			this.aFloat47 = 0.69921875F;
			this.aFloat46 = 1.1523438F;
			this.anInt4046 = Static319.anInt5482;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4053 = -50;
			this.anInt4050 = -60;
			this.anInt4052 = -50;
		} else {
			this.anInt4053 = arg0.method3558();
			this.anInt4050 = arg0.method3558();
			this.anInt4052 = arg0.method3558();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4048 = Static340.anInt6975;
		} else {
			this.anInt4048 = arg0.method3574();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4051 = 0;
		} else {
			this.anInt4051 = arg0.method3555();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass109_2 = Static328.aClass109_4;
		} else {
			@Pc(217) int local217 = arg0.method3555();
			@Pc(221) int local221 = arg0.method3555();
			@Pc(225) int local225 = arg0.method3555();
			@Pc(229) int local229 = arg0.method3555();
			@Pc(233) int local233 = arg0.method3555();
			@Pc(237) int local237 = arg0.method3555();
			this.aClass109_2 = Static84.method1210(local221, local233, local225, local217, local237, local229);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!mk;)Z")
	public boolean method3199(@OriginalArg(1) Class159 arg0) {
		return arg0.anInt4046 == this.anInt4046 && arg0.aFloat46 == this.aFloat46 && arg0.aFloat47 == this.aFloat47 && this.aFloat45 == arg0.aFloat45 && this.aFloat50 == arg0.aFloat50 && this.aFloat49 == arg0.aFloat49 && this.aFloat48 == arg0.aFloat48 && arg0.anInt4048 == this.anInt4048 && arg0.anInt4051 == this.anInt4051 && this.aClass109_2 == arg0.aClass109_2;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!sv;)V")
	public void method3201(@OriginalArg(1) Class2_Sub13 arg0) {
		this.aFloat49 = (float) (arg0.method3580() * 8) / 255.0F;
		this.aFloat50 = (float) (arg0.method3580() * 8) / 255.0F;
		this.aFloat48 = (float) (arg0.method3580() * 8) / 255.0F;
	}
}
