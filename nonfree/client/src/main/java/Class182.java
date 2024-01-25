import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class182 {

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "F")
	public float aFloat114 = 1.0F;

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "F")
	public float aFloat115 = 1.0F;

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "F")
	public float aFloat117 = 0.25F;

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
	public final int anInt4941;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
	public final int anInt4943;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
	public final int anInt4939;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "F")
	public final float aFloat113;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "Lclient!en;")
	public final Class106 aClass106_3;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
	public final int anInt4935;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
	public final int anInt4932;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "F")
	public final float aFloat112;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "F")
	public final float aFloat116;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
	public final int anInt4934;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class182() {
		this.anInt4941 = -50;
		this.anInt4943 = 0;
		this.anInt4939 = Static301.anInt5502;
		this.aFloat113 = 1.1523438F;
		this.aClass106_3 = Static235.aClass106_2;
		this.anInt4935 = -50;
		this.anInt4932 = -60;
		this.aFloat112 = 0.69921875F;
		this.aFloat116 = 1.2F;
		this.anInt4934 = Static82.anInt1887;
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class182(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(16) int local16 = arg0.method4888();
		if (Static227.aClass3_Sub15_11.aClass17_Sub2_1.method725() == 1 && Static355.aClass16_6.method8130() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt4934 = Static82.anInt1887;
			} else {
				this.anInt4934 = arg0.method4868();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat113 = 1.1523438F;
			} else {
				this.aFloat113 = (float) arg0.method4858() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat112 = 0.69921875F;
			} else {
				this.aFloat112 = (float) arg0.method4858() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat116 = 1.2F;
			} else {
				this.aFloat116 = (float) arg0.method4858() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4868();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4858();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4858();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4858();
			}
			this.anInt4934 = Static82.anInt1887;
			this.aFloat112 = 0.69921875F;
			this.aFloat116 = 1.2F;
			this.aFloat113 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4935 = -50;
			this.anInt4932 = -60;
			this.anInt4941 = -50;
		} else {
			this.anInt4941 = arg0.method4869();
			this.anInt4932 = arg0.method4869();
			this.anInt4935 = arg0.method4869();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4939 = Static301.anInt5502;
		} else {
			this.anInt4939 = arg0.method4868();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4943 = 0;
		} else {
			this.anInt4943 = arg0.method4858();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass106_3 = Static235.aClass106_2;
		} else {
			@Pc(222) int local222 = arg0.method4858();
			@Pc(226) int local226 = arg0.method4858();
			@Pc(230) int local230 = arg0.method4858();
			@Pc(234) int local234 = arg0.method4858();
			@Pc(238) int local238 = arg0.method4858();
			@Pc(242) int local242 = arg0.method4858();
			this.aClass106_3 = Static533.method7424(local242, local234, local238, local222, local226, local230);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!ir;I)Z")
	public boolean method4137(@OriginalArg(0) Class182 arg0) {
		return this.anInt4934 == arg0.anInt4934 && this.aFloat113 == arg0.aFloat113 && arg0.aFloat112 == this.aFloat112 && this.aFloat116 == arg0.aFloat116 && arg0.aFloat117 == this.aFloat117 && this.aFloat115 == arg0.aFloat115 && arg0.aFloat114 == this.aFloat114 && this.anInt4939 == arg0.anInt4939 && this.anInt4943 == arg0.anInt4943 && arg0.aClass106_3 == this.aClass106_3;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!fca;B)V")
	public void method4138(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aFloat115 = (float) (arg0.method4888() * 8) / 255.0F;
		this.aFloat117 = (float) (arg0.method4888() * 8) / 255.0F;
		this.aFloat114 = (float) (arg0.method4888() * 8) / 255.0F;
	}
}
