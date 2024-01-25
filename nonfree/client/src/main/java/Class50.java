import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class50 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "F")
	public float aFloat18 = 1.0F;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "F")
	public float aFloat19 = 0.25F;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "F")
	public float aFloat20 = 1.0F;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public final int anInt1839;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "F")
	public final float aFloat22;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "F")
	public final float aFloat21;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Lclient!ro;")
	public final Class81 aClass81_2;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "F")
	public final float aFloat17;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	public final int anInt1836;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public final int anInt1832;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	public final int anInt1831;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public final int anInt1830;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	public final int anInt1833;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class50() {
		this.anInt1839 = 0;
		this.aFloat22 = 0.69921875F;
		this.aFloat21 = 1.1523438F;
		this.aClass81_2 = Static6.aClass81_1;
		this.aFloat17 = 1.2F;
		this.anInt1836 = -60;
		this.anInt1832 = Static24.anInt495;
		this.anInt1831 = -50;
		this.anInt1830 = Static40.anInt1098;
		this.anInt1833 = -50;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class50(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(16) int local16 = arg0.method3440();
		if (Static237.aBoolean480 && Static243.aClass47_10.method2745() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt1830 = Static40.anInt1098;
			} else {
				this.anInt1830 = arg0.method3418();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat21 = 1.1523438F;
			} else {
				this.aFloat21 = (float) arg0.method3401() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat22 = 0.69921875F;
			} else {
				this.aFloat22 = (float) arg0.method3401() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat17 = 1.2F;
			} else {
				this.aFloat17 = (float) arg0.method3401() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3418();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3401();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3401();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3401();
			}
			this.aFloat21 = 1.1523438F;
			this.aFloat22 = 0.69921875F;
			this.anInt1830 = Static40.anInt1098;
			this.aFloat17 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1831 = -50;
			this.anInt1833 = -50;
			this.anInt1836 = -60;
		} else {
			this.anInt1831 = arg0.method3447();
			this.anInt1836 = arg0.method3447();
			this.anInt1833 = arg0.method3447();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1832 = Static24.anInt495;
		} else {
			this.anInt1832 = arg0.method3418();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1839 = 0;
		} else {
			this.anInt1839 = arg0.method3401();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass81_2 = Static6.aClass81_1;
		} else {
			this.aClass81_2 = Static272.method4651(arg0.method3401(), arg0.method3401(), arg0.method3401(), arg0.method3401(), arg0.method3401(), arg0.method3401());
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ec;)Z")
	public boolean method1649(@OriginalArg(1) Class50 arg0) {
		return arg0.anInt1830 == this.anInt1830 && arg0.aFloat21 == this.aFloat21 && this.aFloat22 == arg0.aFloat22 && this.aFloat17 == arg0.aFloat17 && this.aFloat19 == arg0.aFloat19 && arg0.aFloat18 == this.aFloat18 && this.aFloat20 == arg0.aFloat20 && arg0.anInt1832 == this.anInt1832 && this.anInt1839 == arg0.anInt1839 && arg0.aClass81_2 == this.aClass81_2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!lf;B)V")
	public void method1650(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aFloat18 = (float) (arg0.method3440() * 8) / 255.0F;
		this.aFloat19 = (float) (arg0.method3440() * 8) / 255.0F;
		this.aFloat20 = (float) (arg0.method3440() * 8) / 255.0F;
	}
}
