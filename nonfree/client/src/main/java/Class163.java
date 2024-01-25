import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class163 {

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "F")
	public float aFloat49 = 1.0F;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "F")
	public float aFloat52 = 1.0F;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "F")
	public float aFloat50 = 0.25F;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	public final int anInt5017;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public final int anInt5014;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "F")
	public final float aFloat54;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	public final int anInt5010;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "F")
	public final float aFloat53;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "F")
	public final float aFloat51;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public final int anInt5009;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!bi;")
	public final Class23 aClass23_4;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	public final int anInt5011;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	public final int anInt5016;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class163() {
		this.anInt5017 = -60;
		this.anInt5014 = -50;
		this.aFloat54 = 1.1523438F;
		this.anInt5010 = Static407.anInt6698;
		this.aFloat53 = 1.2F;
		this.aFloat51 = 0.69921875F;
		this.anInt5009 = 0;
		this.aClass23_4 = Static328.aClass23_5;
		this.anInt5011 = -50;
		this.anInt5016 = Static219.anInt4146;
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!cu;)V")
	public Class163(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(16) int local16 = arg0.method2582();
		if (Static374.aClass20_Sub1_1.method1805(Static105.anInt2382) && Static166.aClass172_6.method5531() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5010 = Static407.anInt6698;
			} else {
				this.anInt5010 = arg0.method2589();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat54 = 1.1523438F;
			} else {
				this.aFloat54 = (float) arg0.method2588() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat51 = 0.69921875F;
			} else {
				this.aFloat51 = (float) arg0.method2588() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat53 = 1.2F;
			} else {
				this.aFloat53 = (float) arg0.method2588() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method2589();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method2588();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method2588();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method2588();
			}
			this.aFloat54 = 1.1523438F;
			this.aFloat53 = 1.2F;
			this.aFloat51 = 0.69921875F;
			this.anInt5010 = Static407.anInt6698;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5017 = -60;
			this.anInt5014 = -50;
			this.anInt5011 = -50;
		} else {
			this.anInt5011 = arg0.method2641();
			this.anInt5017 = arg0.method2641();
			this.anInt5014 = arg0.method2641();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5016 = Static219.anInt4146;
		} else {
			this.anInt5016 = arg0.method2589();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5009 = 0;
		} else {
			this.anInt5009 = arg0.method2588();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass23_4 = Static328.aClass23_5;
		} else {
			@Pc(229) int local229 = arg0.method2588();
			@Pc(233) int local233 = arg0.method2588();
			@Pc(237) int local237 = arg0.method2588();
			@Pc(241) int local241 = arg0.method2588();
			@Pc(245) int local245 = arg0.method2588();
			@Pc(249) int local249 = arg0.method2588();
			this.aClass23_4 = Static309.method4306(local249, local245, local241, local229, local233, local237);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method3846(@OriginalArg(0) Class3_Sub7 arg0) {
		this.aFloat49 = (float) (arg0.method2582() * 8) / 255.0F;
		this.aFloat50 = (float) (arg0.method2582() * 8) / 255.0F;
		this.aFloat52 = (float) (arg0.method2582() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ng;I)Z")
	public boolean method3847(@OriginalArg(0) Class163 arg0) {
		return this.anInt5010 == arg0.anInt5010 && arg0.aFloat54 == this.aFloat54 && arg0.aFloat51 == this.aFloat51 && arg0.aFloat53 == this.aFloat53 && this.aFloat50 == arg0.aFloat50 && arg0.aFloat49 == this.aFloat49 && arg0.aFloat52 == this.aFloat52 && arg0.anInt5016 == this.anInt5016 && this.anInt5009 == arg0.anInt5009 && this.aClass23_4 == arg0.aClass23_4;
	}
}
