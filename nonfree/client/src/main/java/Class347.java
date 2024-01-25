import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class347 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "F")
	public float aFloat197 = 0.25F;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "F")
	public float aFloat198 = 1.0F;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "F")
	public float aFloat201 = 1.0F;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public final int anInt9686;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "F")
	public final float aFloat199;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!tea;")
	public final Class57 aClass57_5;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "F")
	public final float aFloat196;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	public final int anInt9684;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "F")
	public final float aFloat200;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	public final int anInt9688;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
	public final int anInt9685;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	public final int anInt9687;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public final int anInt9680;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class347() {
		this.anInt9686 = -50;
		this.aFloat199 = 1.1523438F;
		this.aClass57_5 = Static555.aClass57_3;
		this.aFloat196 = 1.2F;
		this.anInt9684 = Static160.anInt3184;
		this.aFloat200 = 0.69921875F;
		this.anInt9688 = 0;
		this.anInt9685 = -60;
		this.anInt9687 = Static9.anInt10600;
		this.anInt9680 = -50;
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class347(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(14) int local14 = arg0.method7816();
		if (Static172.aClass5_Sub50_14.aClass12_Sub4_1.method930() == 1 && Static367.aClass65_11.method6892() > 0) {
			if ((local14 & 0x1) == 0) {
				this.anInt9684 = Static160.anInt3184;
			} else {
				this.anInt9684 = arg0.method7804();
			}
			if ((local14 & 0x2) == 0) {
				this.aFloat199 = 1.1523438F;
			} else {
				this.aFloat199 = (float) arg0.method7860() / 256.0F;
			}
			if ((local14 & 0x4) == 0) {
				this.aFloat200 = 0.69921875F;
			} else {
				this.aFloat200 = (float) arg0.method7860() / 256.0F;
			}
			if ((local14 & 0x8) == 0) {
				this.aFloat196 = 1.2F;
			} else {
				this.aFloat196 = (float) arg0.method7860() / 256.0F;
			}
		} else {
			if ((local14 & 0x1) != 0) {
				arg0.method7804();
			}
			if ((local14 & 0x2) != 0) {
				arg0.method7860();
			}
			if ((local14 & 0x4) != 0) {
				arg0.method7860();
			}
			if ((local14 & 0x8) != 0) {
				arg0.method7860();
			}
			this.aFloat199 = 1.1523438F;
			this.anInt9684 = Static160.anInt3184;
			this.aFloat200 = 0.69921875F;
			this.aFloat196 = 1.2F;
		}
		if ((local14 & 0x10) == 0) {
			this.anInt9686 = -50;
			this.anInt9685 = -60;
			this.anInt9680 = -50;
		} else {
			this.anInt9686 = arg0.method7849();
			this.anInt9685 = arg0.method7849();
			this.anInt9680 = arg0.method7849();
		}
		if ((local14 & 0x20) == 0) {
			this.anInt9687 = Static9.anInt10600;
		} else {
			this.anInt9687 = arg0.method7804();
		}
		if ((local14 & 0x40) == 0) {
			this.anInt9688 = 0;
		} else {
			this.anInt9688 = arg0.method7860();
		}
		if ((local14 & 0x80) == 0) {
			this.aClass57_5 = Static555.aClass57_3;
		} else {
			@Pc(222) int local222 = arg0.method7860();
			@Pc(226) int local226 = arg0.method7860();
			@Pc(230) int local230 = arg0.method7860();
			@Pc(234) int local234 = arg0.method7860();
			@Pc(238) int local238 = arg0.method7860();
			@Pc(242) int local242 = arg0.method7860();
			this.aClass57_5 = Static319.method4990(local226, local222, local234, local230, local242, local238);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLclient!mc;)V")
	public void method8092(@OriginalArg(1) Class5_Sub41 arg0) {
		this.aFloat201 = (float) (arg0.method7816() * 8) / 255.0F;
		this.aFloat197 = (float) (arg0.method7816() * 8) / 255.0F;
		this.aFloat198 = (float) (arg0.method7816() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!uc;I)Z")
	public boolean method8096(@OriginalArg(0) Class347 arg0) {
		return this.anInt9684 == arg0.anInt9684 && arg0.aFloat199 == this.aFloat199 && arg0.aFloat200 == this.aFloat200 && this.aFloat196 == arg0.aFloat196 && arg0.aFloat197 == this.aFloat197 && arg0.aFloat201 == this.aFloat201 && arg0.aFloat198 == this.aFloat198 && this.anInt9687 == arg0.anInt9687 && arg0.anInt9688 == this.anInt9688 && arg0.aClass57_5 == this.aClass57_5;
	}
}
