import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class299 {

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "F")
	public float aFloat145 = 1.0F;

	@OriginalMember(owner = "client!rea", name = "t", descriptor = "F")
	public float aFloat150 = 1.0F;

	@OriginalMember(owner = "client!rea", name = "s", descriptor = "F")
	public float aFloat149 = 0.25F;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
	public final int anInt7882;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "Lclient!mda;")
	public final Class49 aClass49_2;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
	public final int anInt7877;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
	public final int anInt7881;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "F")
	public final float aFloat147;

	@OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
	public final int anInt7885;

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
	public final int anInt7876;

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "F")
	public final float aFloat146;

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
	public final int anInt7883;

	@OriginalMember(owner = "client!rea", name = "q", descriptor = "F")
	public final float aFloat148;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V")
	public Class299() {
		this.anInt7882 = -60;
		this.aClass49_2 = Static446.aClass49_1;
		this.anInt7877 = -50;
		this.anInt7881 = Static349.anInt6068;
		this.aFloat147 = 1.1523438F;
		this.anInt7885 = 0;
		this.anInt7876 = Static67.anInt1828;
		this.aFloat146 = 1.2F;
		this.anInt7883 = -50;
		this.aFloat148 = 0.69921875F;
	}

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class299(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(16) int local16 = arg0.method2859();
		if (Static305.aClass2_Sub49_15.aClass33_Sub20_1.method5562() == 1 && Static28.aClass13_87.method8089() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt7876 = Static67.anInt1828;
			} else {
				this.anInt7876 = arg0.method2881();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat147 = 1.1523438F;
			} else {
				this.aFloat147 = (float) arg0.method2825() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat148 = 0.69921875F;
			} else {
				this.aFloat148 = (float) arg0.method2825() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat146 = 1.2F;
			} else {
				this.aFloat146 = (float) arg0.method2825() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method2881();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method2825();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method2825();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method2825();
			}
			this.aFloat148 = 0.69921875F;
			this.anInt7876 = Static67.anInt1828;
			this.aFloat147 = 1.1523438F;
			this.aFloat146 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt7877 = -50;
			this.anInt7883 = -50;
			this.anInt7882 = -60;
		} else {
			this.anInt7883 = arg0.method2836();
			this.anInt7882 = arg0.method2836();
			this.anInt7877 = arg0.method2836();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt7881 = Static349.anInt6068;
		} else {
			this.anInt7881 = arg0.method2881();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt7885 = 0;
		} else {
			this.anInt7885 = arg0.method2825();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass49_2 = Static446.aClass49_1;
		} else {
			@Pc(232) int local232 = arg0.method2825();
			@Pc(236) int local236 = arg0.method2825();
			@Pc(240) int local240 = arg0.method2825();
			@Pc(244) int local244 = arg0.method2825();
			@Pc(248) int local248 = arg0.method2825();
			@Pc(252) int local252 = arg0.method2825();
			this.aClass49_2 = Static321.method4911(local248, local240, local232, local244, local252, local236);
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!sl;)V")
	public void method6912(@OriginalArg(1) Class2_Sub17 arg0) {
		this.aFloat150 = (float) (arg0.method2859() * 8) / 255.0F;
		this.aFloat149 = (float) (arg0.method2859() * 8) / 255.0F;
		this.aFloat145 = (float) (arg0.method2859() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!rea;Z)Z")
	public boolean method6913(@OriginalArg(0) Class299 arg0) {
		return arg0.anInt7876 == this.anInt7876 && arg0.aFloat147 == this.aFloat147 && arg0.aFloat148 == this.aFloat148 && arg0.aFloat146 == this.aFloat146 && this.aFloat149 == arg0.aFloat149 && arg0.aFloat150 == this.aFloat150 && arg0.aFloat145 == this.aFloat145 && this.anInt7881 == arg0.anInt7881 && this.anInt7885 == arg0.anInt7885 && this.aClass49_2 == arg0.aClass49_2;
	}
}
