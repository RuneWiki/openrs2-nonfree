import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class113 {

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "F")
	public float aFloat63 = 0.25F;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "F")
	public float aFloat60 = 1.0F;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "F")
	public float aFloat65 = 1.0F;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	public final int anInt2889;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public final int anInt2892;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
	public final int anInt2894;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "F")
	public final float aFloat62;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!jia;")
	public final Class68 aClass68_1;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "F")
	public final float aFloat61;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	public final int anInt2893;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
	public final int anInt2890;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "F")
	public final float aFloat64;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
	public final int anInt2896;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class113() {
		this.anInt2889 = Static538.anInt8334;
		this.anInt2892 = -50;
		this.anInt2894 = 0;
		this.aFloat62 = 0.69921875F;
		this.aClass68_1 = Static198.aClass68_2;
		this.aFloat61 = 1.2F;
		this.anInt2893 = Static574.anInt8897;
		this.anInt2890 = -60;
		this.aFloat64 = 1.1523438F;
		this.anInt2896 = -50;
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class113(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(16) int local16 = arg0.method8865();
		if (Static124.aClass4_Sub20_4.aClass8_Sub1_1.method177() == 1 && Static449.aClass33_11.method8086() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt2893 = Static574.anInt8897;
			} else {
				this.anInt2893 = arg0.method8850();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat64 = 1.1523438F;
			} else {
				this.aFloat64 = (float) arg0.method8859() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat62 = 0.69921875F;
			} else {
				this.aFloat62 = (float) arg0.method8859() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat61 = 1.2F;
			} else {
				this.aFloat61 = (float) arg0.method8859() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8850();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8859();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8859();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8859();
			}
			this.aFloat62 = 0.69921875F;
			this.aFloat61 = 1.2F;
			this.anInt2893 = Static574.anInt8897;
			this.aFloat64 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2890 = -60;
			this.anInt2892 = -50;
			this.anInt2896 = -50;
		} else {
			this.anInt2892 = arg0.method8834();
			this.anInt2890 = arg0.method8834();
			this.anInt2896 = arg0.method8834();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2889 = Static538.anInt8334;
		} else {
			this.anInt2889 = arg0.method8850();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2894 = 0;
		} else {
			this.anInt2894 = arg0.method8859();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass68_1 = Static198.aClass68_2;
		} else {
			@Pc(211) int local211 = arg0.method8859();
			@Pc(215) int local215 = arg0.method8859();
			@Pc(219) int local219 = arg0.method8859();
			@Pc(223) int local223 = arg0.method8859();
			@Pc(227) int local227 = arg0.method8859();
			@Pc(231) int local231 = arg0.method8859();
			this.aClass68_1 = Static101.method2026(local211, local223, local231, local219, local215, local227);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!fg;)Z")
	public boolean method2705(@OriginalArg(1) Class113 arg0) {
		return arg0.anInt2893 == this.anInt2893 && this.aFloat64 == arg0.aFloat64 && this.aFloat62 == arg0.aFloat62 && this.aFloat61 == arg0.aFloat61 && this.aFloat63 == arg0.aFloat63 && arg0.aFloat65 == this.aFloat65 && arg0.aFloat60 == this.aFloat60 && this.anInt2889 == arg0.anInt2889 && arg0.anInt2894 == this.anInt2894 && this.aClass68_1 == arg0.aClass68_1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!es;)V")
	public void method2708(@OriginalArg(1) Class4_Sub11 arg0) {
		this.aFloat65 = (float) (arg0.method8865() * 8) / 255.0F;
		this.aFloat63 = (float) (arg0.method8865() * 8) / 255.0F;
		this.aFloat60 = (float) (arg0.method8865() * 8) / 255.0F;
	}
}
