import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class172 {

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "F")
	public float aFloat62 = 1.0F;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "F")
	public float aFloat59 = 1.0F;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "F")
	public float aFloat60 = 0.25F;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "F")
	public final float aFloat63;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	public final int anInt5219;

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
	public final int anInt5231;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
	public final int anInt5221;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
	public final int anInt5227;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!hs;")
	public final Class78 aClass78_6;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "F")
	public final float aFloat61;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	public final int anInt5217;

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
	public final int anInt5222;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "F")
	public final float aFloat64;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	public Class172() {
		this.aFloat63 = 1.2F;
		this.anInt5219 = -50;
		this.anInt5231 = -50;
		this.anInt5221 = -60;
		this.anInt5227 = Static331.anInt3765;
		this.aClass78_6 = Static12.aClass78_1;
		this.aFloat61 = 1.1523438F;
		this.anInt5217 = 0;
		this.anInt5222 = Static8.anInt112;
		this.aFloat64 = 0.69921875F;
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class172(@OriginalArg(0) Class1_Sub21 arg0) {
		@Pc(16) int local16 = arg0.method5720();
		if (Static50.aBoolean83 && Static152.aClass105_9.method4279() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5227 = Static331.anInt3765;
			} else {
				this.anInt5227 = arg0.method5716();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat61 = 1.1523438F;
			} else {
				this.aFloat61 = (float) arg0.method5715() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat64 = 0.69921875F;
			} else {
				this.aFloat64 = (float) arg0.method5715() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat63 = 1.2F;
			} else {
				this.aFloat63 = (float) arg0.method5715() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5716();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5715();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5715();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5715();
			}
			this.aFloat61 = 1.1523438F;
			this.aFloat63 = 1.2F;
			this.anInt5227 = Static331.anInt3765;
			this.aFloat64 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5231 = -50;
			this.anInt5219 = -50;
			this.anInt5221 = -60;
		} else {
			this.anInt5231 = arg0.method5691();
			this.anInt5221 = arg0.method5691();
			this.anInt5219 = arg0.method5691();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5222 = Static8.anInt112;
		} else {
			this.anInt5222 = arg0.method5716();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5217 = 0;
		} else {
			this.anInt5217 = arg0.method5715();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass78_6 = Static12.aClass78_1;
		} else {
			this.aClass78_6 = Static275.method4909(arg0.method5715(), arg0.method5715(), arg0.method5715(), arg0.method5715(), arg0.method5715(), arg0.method5715());
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!qs;B)Z")
	public boolean method4538(@OriginalArg(0) Class172 arg0) {
		return arg0.anInt5227 == this.anInt5227 && arg0.aFloat61 == this.aFloat61 && this.aFloat64 == arg0.aFloat64 && this.aFloat63 == arg0.aFloat63 && this.aFloat60 == arg0.aFloat60 && arg0.aFloat59 == this.aFloat59 && arg0.aFloat62 == this.aFloat62 && this.anInt5222 == arg0.anInt5222 && arg0.anInt5217 == this.anInt5217 && arg0.aClass78_6 == this.aClass78_6;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method4542(@OriginalArg(0) Class1_Sub21 arg0) {
		this.aFloat59 = (float) (arg0.method5720() * 8) / 255.0F;
		this.aFloat60 = (float) (arg0.method5720() * 8) / 255.0F;
		this.aFloat62 = (float) (arg0.method5720() * 8) / 255.0F;
	}
}
