import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class161 {

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "F")
	public float aFloat27 = 1.0F;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "F")
	public float aFloat30 = 0.25F;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "F")
	public float aFloat31 = 1.0F;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	public final int anInt3900;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "F")
	public final float aFloat28;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "F")
	public final float aFloat29;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!as;")
	public final Class16 aClass16_4;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
	public final int anInt3904;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	public final int anInt3907;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	public final int anInt3905;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "F")
	public final float aFloat26;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public final int anInt3901;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	public final int anInt3896;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class161() {
		this.anInt3900 = -60;
		this.aFloat28 = 0.69921875F;
		this.aFloat29 = 1.2F;
		this.aClass16_4 = Static39.aClass16_2;
		this.anInt3904 = Static394.anInt6424;
		this.anInt3907 = Static130.anInt2407;
		this.anInt3905 = -50;
		this.aFloat26 = 1.1523438F;
		this.anInt3901 = 0;
		this.anInt3896 = -50;
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class161(@OriginalArg(0) Class1_Sub33 arg0) {
		@Pc(16) int local16 = arg0.method5174();
		if (Static188.aClass135_Sub1_1.aBoolean332 && Static330.aClass164_8.method5337() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3904 = Static394.anInt6424;
			} else {
				this.anInt3904 = arg0.method5150();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat26 = 1.1523438F;
			} else {
				this.aFloat26 = (float) arg0.method5177() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat28 = 0.69921875F;
			} else {
				this.aFloat28 = (float) arg0.method5177() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat29 = 1.2F;
			} else {
				this.aFloat29 = (float) arg0.method5177() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5150();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5177();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5177();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5177();
			}
			this.aFloat29 = 1.2F;
			this.aFloat26 = 1.1523438F;
			this.anInt3904 = Static394.anInt6424;
			this.aFloat28 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3896 = -50;
			this.anInt3900 = -60;
			this.anInt3905 = -50;
		} else {
			this.anInt3896 = arg0.method5180();
			this.anInt3900 = arg0.method5180();
			this.anInt3905 = arg0.method5180();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3907 = Static130.anInt2407;
		} else {
			this.anInt3907 = arg0.method5150();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3901 = 0;
		} else {
			this.anInt3901 = arg0.method5177();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass16_4 = Static39.aClass16_2;
		} else {
			this.aClass16_4 = Static22.method3209(arg0.method5177(), arg0.method5177(), arg0.method5177(), arg0.method5177(), arg0.method5177(), arg0.method5177());
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!re;)V")
	public void method3213(@OriginalArg(1) Class1_Sub33 arg0) {
		this.aFloat27 = (float) (arg0.method5174() * 8) / 255.0F;
		this.aFloat30 = (float) (arg0.method5174() * 8) / 255.0F;
		this.aFloat31 = (float) (arg0.method5174() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!nd;)Z")
	public boolean method3216(@OriginalArg(1) Class161 arg0) {
		return this.anInt3904 == arg0.anInt3904 && this.aFloat26 == arg0.aFloat26 && arg0.aFloat28 == this.aFloat28 && this.aFloat29 == arg0.aFloat29 && arg0.aFloat30 == this.aFloat30 && arg0.aFloat27 == this.aFloat27 && this.aFloat31 == arg0.aFloat31 && this.anInt3907 == arg0.anInt3907 && this.anInt3901 == arg0.anInt3901 && this.aClass16_4 == arg0.aClass16_4;
	}
}
