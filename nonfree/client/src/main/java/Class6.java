import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "g", descriptor = "F")
	public float aFloat5 = 0.25F;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "F")
	public float aFloat3 = 1.0F;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "F")
	public float aFloat6 = 1.0F;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public final int anInt182;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "I")
	public final int anInt192;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "I")
	public final int anInt188;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "F")
	public final float aFloat8;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!bd;")
	public final Class18 aClass18_2;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "F")
	public final float aFloat7;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "F")
	public final float aFloat4;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public final int anInt186;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	public final int anInt190;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "I")
	public final int anInt191;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class6() {
		this.anInt182 = -50;
		this.anInt192 = -50;
		this.anInt188 = 0;
		this.aFloat8 = 1.2F;
		this.aClass18_2 = Static230.aClass18_4;
		this.aFloat7 = 1.1523438F;
		this.aFloat4 = 0.69921875F;
		this.anInt186 = Static12.anInt376;
		this.anInt190 = Static28.anInt775;
		this.anInt191 = -60;
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!bk;)V")
	public Class6(@OriginalArg(0) Class5_Sub1 arg0) {
		@Pc(16) int local16 = arg0.method1832();
		if (Static8.aBoolean7 && Static26.aClass59_2.method4796() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt186 = Static12.anInt376;
			} else {
				this.anInt186 = arg0.method1826();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat7 = 1.1523438F;
			} else {
				this.aFloat7 = (float) arg0.method1845() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat4 = 0.69921875F;
			} else {
				this.aFloat4 = (float) arg0.method1845() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat8 = 1.2F;
			} else {
				this.aFloat8 = (float) arg0.method1845() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method1826();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method1845();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method1845();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method1845();
			}
			this.aFloat4 = 0.69921875F;
			this.aFloat8 = 1.2F;
			this.aFloat7 = 1.1523438F;
			this.anInt186 = Static12.anInt376;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt191 = -60;
			this.anInt192 = -50;
			this.anInt182 = -50;
		} else {
			this.anInt192 = arg0.method1834();
			this.anInt191 = arg0.method1834();
			this.anInt182 = arg0.method1834();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt190 = Static28.anInt775;
		} else {
			this.anInt190 = arg0.method1826();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt188 = 0;
		} else {
			this.anInt188 = arg0.method1845();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass18_2 = Static230.aClass18_4;
		} else {
			this.aClass18_2 = Static350.method5781(arg0.method1845(), arg0.method1845(), arg0.method1845(), arg0.method1845(), arg0.method1845(), arg0.method1845());
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!af;)Z")
	public boolean method187(@OriginalArg(1) Class6 arg0) {
		return arg0.anInt186 == this.anInt186 && this.aFloat7 == arg0.aFloat7 && this.aFloat4 == arg0.aFloat4 && arg0.aFloat8 == this.aFloat8 && arg0.aFloat5 == this.aFloat5 && arg0.aFloat3 == this.aFloat3 && this.aFloat6 == arg0.aFloat6 && arg0.anInt190 == this.anInt190 && arg0.anInt188 == this.anInt188 && this.aClass18_2 == arg0.aClass18_2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method188(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aFloat3 = (float) (arg0.method1832() * 8) / 255.0F;
		this.aFloat5 = (float) (arg0.method1832() * 8) / 255.0F;
		this.aFloat6 = (float) (arg0.method1832() * 8) / 255.0F;
	}
}
