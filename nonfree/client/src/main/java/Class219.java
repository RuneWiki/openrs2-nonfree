import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class219 {

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "F")
	public float aFloat89 = 1.0F;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "F")
	public float aFloat92 = 0.25F;

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "F")
	public float aFloat90 = 1.0F;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
	public final int anInt6305;

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "F")
	public final float aFloat93;

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
	public final int anInt6313;

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "Lclient!oi;")
	public final Class82 aClass82_5;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
	public final int anInt6309;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "F")
	public final float aFloat88;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
	public final int anInt6306;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
	public final int anInt6308;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
	public final int anInt6310;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "F")
	public final float aFloat91;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
	public Class219() {
		this.anInt6305 = -50;
		this.aFloat93 = 1.1523438F;
		this.anInt6313 = -60;
		this.aClass82_5 = Static30.aClass82_1;
		this.anInt6309 = Static384.anInt6848;
		this.aFloat88 = 0.69921875F;
		this.anInt6306 = -50;
		this.anInt6308 = Static182.anInt3604;
		this.anInt6310 = 0;
		this.aFloat91 = 1.2F;
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class219(@OriginalArg(0) Class6_Sub1 arg0) {
		@Pc(16) int local16 = arg0.method6433();
		if (Static291.aClass28_Sub1_1.aBoolean74 && Static47.aClass66_3.method5012() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6308 = Static182.anInt3604;
			} else {
				this.anInt6308 = arg0.method6442();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat93 = 1.1523438F;
			} else {
				this.aFloat93 = (float) arg0.method6485() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat88 = 0.69921875F;
			} else {
				this.aFloat88 = (float) arg0.method6485() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat91 = 1.2F;
			} else {
				this.aFloat91 = (float) arg0.method6485() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6442();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method6485();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method6485();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method6485();
			}
			this.aFloat93 = 1.1523438F;
			this.anInt6308 = Static182.anInt3604;
			this.aFloat91 = 1.2F;
			this.aFloat88 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6305 = -50;
			this.anInt6306 = -50;
			this.anInt6313 = -60;
		} else {
			this.anInt6305 = arg0.method6428();
			this.anInt6313 = arg0.method6428();
			this.anInt6306 = arg0.method6428();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6309 = Static384.anInt6848;
		} else {
			this.anInt6309 = arg0.method6442();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6310 = 0;
		} else {
			this.anInt6310 = arg0.method6485();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass82_5 = Static30.aClass82_1;
		} else {
			@Pc(226) int local226 = arg0.method6485();
			@Pc(230) int local230 = arg0.method6485();
			@Pc(234) int local234 = arg0.method6485();
			@Pc(238) int local238 = arg0.method6485();
			@Pc(242) int local242 = arg0.method6485();
			@Pc(246) int local246 = arg0.method6485();
			this.aClass82_5 = Static179.method2948(local230, local246, local226, local238, local242, local234);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!ae;)V")
	public void method5246(@OriginalArg(1) Class6_Sub1 arg0) {
		this.aFloat90 = (float) (arg0.method6433() * 8) / 255.0F;
		this.aFloat92 = (float) (arg0.method6433() * 8) / 255.0F;
		this.aFloat89 = (float) (arg0.method6433() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ru;I)Z")
	public boolean method5249(@OriginalArg(0) Class219 arg0) {
		return this.anInt6308 == arg0.anInt6308 && this.aFloat93 == arg0.aFloat93 && this.aFloat88 == arg0.aFloat88 && arg0.aFloat91 == this.aFloat91 && arg0.aFloat92 == this.aFloat92 && this.aFloat90 == arg0.aFloat90 && arg0.aFloat89 == this.aFloat89 && arg0.anInt6309 == this.anInt6309 && this.anInt6310 == arg0.anInt6310 && this.aClass82_5 == arg0.aClass82_5;
	}
}
