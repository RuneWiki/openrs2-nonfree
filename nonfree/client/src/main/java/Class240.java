import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class240 {

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "F")
	public float aFloat148 = 1.0F;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "F")
	public float aFloat150 = 0.25F;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "F")
	public float aFloat152 = 1.0F;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public final int anInt6887;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "F")
	public final float aFloat151;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public final int anInt6889;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public final int anInt6892;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public final int anInt6884;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public final int anInt6891;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "F")
	public final float aFloat147;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public final int anInt6888;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "F")
	public final float aFloat149;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!sv;")
	public final Class124 aClass124_2;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class240() {
		this.anInt6887 = 0;
		this.aFloat151 = 1.2F;
		this.anInt6889 = -50;
		this.anInt6892 = Static114.anInt2634;
		this.anInt6884 = -60;
		this.anInt6891 = -50;
		this.aFloat147 = 1.1523438F;
		this.anInt6888 = Static9.anInt120;
		this.aFloat149 = 0.69921875F;
		this.aClass124_2 = Static500.aClass124_3;
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!daa;)V")
	public Class240(@OriginalArg(0) Class12_Sub8 arg0) {
		@Pc(16) int local16 = arg0.method5216();
		if (Static208.aClass12_Sub10_Sub1_1.method2038(Static148.anInt6867) && Static497.aClass42_9.method5825() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6892 = Static114.anInt2634;
			} else {
				this.anInt6892 = arg0.method5225();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat147 = 1.1523438F;
			} else {
				this.aFloat147 = (float) arg0.method5199() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat149 = 0.69921875F;
			} else {
				this.aFloat149 = (float) arg0.method5199() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat151 = 1.2F;
			} else {
				this.aFloat151 = (float) arg0.method5199() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5225();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5199();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5199();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5199();
			}
			this.aFloat151 = 1.2F;
			this.aFloat147 = 1.1523438F;
			this.aFloat149 = 0.69921875F;
			this.anInt6892 = Static114.anInt2634;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6884 = -60;
			this.anInt6891 = -50;
			this.anInt6889 = -50;
		} else {
			this.anInt6889 = arg0.method5217();
			this.anInt6884 = arg0.method5217();
			this.anInt6891 = arg0.method5217();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6888 = Static9.anInt120;
		} else {
			this.anInt6888 = arg0.method5225();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6887 = 0;
		} else {
			this.anInt6887 = arg0.method5199();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass124_2 = Static500.aClass124_3;
		} else {
			@Pc(222) int local222 = arg0.method5199();
			@Pc(226) int local226 = arg0.method5199();
			@Pc(230) int local230 = arg0.method5199();
			@Pc(234) int local234 = arg0.method5199();
			@Pc(238) int local238 = arg0.method5199();
			@Pc(242) int local242 = arg0.method5199();
			this.aClass124_2 = Static172.method6605(local222, local242, local238, local234, local226, local230);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!pe;)Z")
	public boolean method5762(@OriginalArg(1) Class240 arg0) {
		return arg0.anInt6892 == this.anInt6892 && arg0.aFloat147 == this.aFloat147 && this.aFloat149 == arg0.aFloat149 && this.aFloat151 == arg0.aFloat151 && this.aFloat150 == arg0.aFloat150 && arg0.aFloat152 == this.aFloat152 && this.aFloat148 == arg0.aFloat148 && this.anInt6888 == arg0.anInt6888 && arg0.anInt6887 == this.anInt6887 && this.aClass124_2 == arg0.aClass124_2;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!daa;I)V")
	public void method5765(@OriginalArg(0) Class12_Sub8 arg0) {
		this.aFloat152 = (float) (arg0.method5216() * 8) / 255.0F;
		this.aFloat150 = (float) (arg0.method5216() * 8) / 255.0F;
		this.aFloat148 = (float) (arg0.method5216() * 8) / 255.0F;
	}
}
