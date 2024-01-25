import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class40 {

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "F")
	public float aFloat63 = 0.25F;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "F")
	public float aFloat64 = 1.0F;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "F")
	public float aFloat65 = 1.0F;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "F")
	public final float aFloat61;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	public final int anInt1874;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!di;")
	public final Class31 aClass31_1;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
	public final int anInt1881;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
	public final int anInt1879;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
	public final int anInt1878;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
	public final int anInt1880;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
	public final int anInt1876;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "F")
	public final float aFloat60;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "F")
	public final float aFloat62;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class40() {
		this.aFloat61 = 0.69921875F;
		this.anInt1874 = -50;
		this.aClass31_1 = Static344.aClass31_4;
		this.anInt1881 = -50;
		this.anInt1879 = Static352.anInt6859;
		this.anInt1878 = -60;
		this.anInt1880 = Static578.anInt9856;
		this.anInt1876 = 0;
		this.aFloat60 = 1.1523438F;
		this.aFloat62 = 1.2F;
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class40(@OriginalArg(0) Class6_Sub8 arg0) {
		@Pc(16) int local16 = arg0.method8246();
		if (Static87.aClass6_Sub33_6.aClass14_Sub10_1.method3033() == 1 && Static443.aClass5_12.method6185() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt1880 = Static578.anInt9856;
			} else {
				this.anInt1880 = arg0.method8236();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat60 = 1.1523438F;
			} else {
				this.aFloat60 = (float) arg0.method8220() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat61 = 0.69921875F;
			} else {
				this.aFloat61 = (float) arg0.method8220() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat62 = 1.2F;
			} else {
				this.aFloat62 = (float) arg0.method8220() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8236();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8220();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8220();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8220();
			}
			this.aFloat60 = 1.1523438F;
			this.aFloat62 = 1.2F;
			this.anInt1880 = Static578.anInt9856;
			this.aFloat61 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1878 = -60;
			this.anInt1881 = -50;
			this.anInt1874 = -50;
		} else {
			this.anInt1874 = arg0.method8231();
			this.anInt1878 = arg0.method8231();
			this.anInt1881 = arg0.method8231();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1879 = Static352.anInt6859;
		} else {
			this.anInt1879 = arg0.method8236();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1876 = 0;
		} else {
			this.anInt1876 = arg0.method8220();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass31_1 = Static344.aClass31_4;
		} else {
			@Pc(223) int local223 = arg0.method8220();
			@Pc(227) int local227 = arg0.method8220();
			@Pc(231) int local231 = arg0.method8220();
			@Pc(235) int local235 = arg0.method8220();
			@Pc(239) int local239 = arg0.method8220();
			@Pc(243) int local243 = arg0.method8220();
			this.aClass31_1 = Static24.method699(local235, local243, local239, local231, local223, local227);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!ji;)V")
	public void method1716(@OriginalArg(1) Class6_Sub8 arg0) {
		this.aFloat65 = (float) (arg0.method8246() * 8) / 255.0F;
		this.aFloat63 = (float) (arg0.method8246() * 8) / 255.0F;
		this.aFloat64 = (float) (arg0.method8246() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLclient!ca;)Z")
	public boolean method1718(@OriginalArg(1) Class40 arg0) {
		return this.anInt1880 == arg0.anInt1880 && this.aFloat60 == arg0.aFloat60 && this.aFloat61 == arg0.aFloat61 && this.aFloat62 == arg0.aFloat62 && arg0.aFloat63 == this.aFloat63 && arg0.aFloat65 == this.aFloat65 && arg0.aFloat64 == this.aFloat64 && arg0.anInt1879 == this.anInt1879 && this.anInt1876 == arg0.anInt1876 && this.aClass31_1 == arg0.aClass31_1;
	}
}
