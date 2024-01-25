import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class41 {

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "F")
	public float aFloat71 = 0.25F;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "F")
	public float aFloat73 = 1.0F;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "F")
	public float aFloat75 = 1.0F;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	public final int anInt1873;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "F")
	public final float aFloat70;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "Lclient!wh;")
	public final Class78 aClass78_1;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
	public final int anInt1878;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
	public final int anInt1880;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	public final int anInt1879;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public final int anInt1875;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "F")
	public final float aFloat72;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	public final int anInt1876;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "F")
	public final float aFloat74;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class41() {
		this.anInt1873 = -50;
		this.aFloat70 = 1.2F;
		this.aClass78_1 = Static534.aClass78_4;
		this.anInt1878 = 0;
		this.anInt1880 = Static60.anInt2006;
		this.anInt1879 = -60;
		this.anInt1875 = -50;
		this.aFloat72 = 0.69921875F;
		this.anInt1876 = Static60.anInt2003;
		this.aFloat74 = 1.1523438F;
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!cea;)V")
	public Class41(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(16) int local16 = arg0.method8383();
		if (Static74.aClass2_Sub13_5.aClass14_Sub8_1.method3544() == 1 && Static273.aClass20_8.method7307() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt1876 = Static60.anInt2003;
			} else {
				this.anInt1876 = arg0.method8381();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat74 = 1.1523438F;
			} else {
				this.aFloat74 = (float) arg0.method8326() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat72 = 0.69921875F;
			} else {
				this.aFloat72 = (float) arg0.method8326() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat70 = 1.2F;
			} else {
				this.aFloat70 = (float) arg0.method8326() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8381();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8326();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8326();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8326();
			}
			this.anInt1876 = Static60.anInt2003;
			this.aFloat74 = 1.1523438F;
			this.aFloat72 = 0.69921875F;
			this.aFloat70 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1879 = -60;
			this.anInt1873 = -50;
			this.anInt1875 = -50;
		} else {
			this.anInt1875 = arg0.method8368();
			this.anInt1879 = arg0.method8368();
			this.anInt1873 = arg0.method8368();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1880 = Static60.anInt2006;
		} else {
			this.anInt1880 = arg0.method8381();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1878 = 0;
		} else {
			this.anInt1878 = arg0.method8326();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass78_1 = Static534.aClass78_4;
		} else {
			@Pc(231) int local231 = arg0.method8326();
			@Pc(235) int local235 = arg0.method8326();
			@Pc(239) int local239 = arg0.method8326();
			@Pc(243) int local243 = arg0.method8326();
			@Pc(247) int local247 = arg0.method8326();
			@Pc(251) int local251 = arg0.method8326();
			this.aClass78_1 = Static518.method7860(local247, local243, local231, local251, local235, local239);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!cea;)V")
	public void method1769(@OriginalArg(1) Class2_Sub11 arg0) {
		this.aFloat73 = (float) (arg0.method8383() * 8) / 255.0F;
		this.aFloat71 = (float) (arg0.method8383() * 8) / 255.0F;
		this.aFloat75 = (float) (arg0.method8383() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!bp;B)Z")
	public boolean method1770(@OriginalArg(0) Class41 arg0) {
		return arg0.anInt1876 == this.anInt1876 && this.aFloat74 == arg0.aFloat74 && arg0.aFloat72 == this.aFloat72 && this.aFloat70 == arg0.aFloat70 && arg0.aFloat71 == this.aFloat71 && arg0.aFloat73 == this.aFloat73 && arg0.aFloat75 == this.aFloat75 && this.anInt1880 == arg0.anInt1880 && this.anInt1878 == arg0.anInt1878 && arg0.aClass78_1 == this.aClass78_1;
	}
}
