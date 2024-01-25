import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class208 {

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "F")
	public float aFloat91 = 1.0F;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "F")
	public float aFloat93 = 0.25F;

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "F")
	public float aFloat94 = 1.0F;

	@OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
	public int anInt5419;

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
	public int anInt5415;

	@OriginalMember(owner = "client!kea", name = "y", descriptor = "I")
	public int anInt5428;

	@OriginalMember(owner = "client!kea", name = "x", descriptor = "I")
	public int anInt5420;

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
	public int anInt5426;

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "Lclient!ih;")
	public Class113 aClass113_2;

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!kea", name = "r", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "Lclient!jr;")
	public Class200 aClass200_3;

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
	public int anInt5417;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "()V")
	public Class208() {
		this.anInt5419 = -50;
		this.anInt5415 = -60;
		this.anInt5428 = -50;
		this.anInt5420 = Static680.anInt10648;
		this.anInt5426 = Static329.anInt5319;
		this.aClass113_2 = Static681.aClass113_4;
		this.aFloat96 = 0.69921875F;
		this.aFloat92 = 1.2F;
		this.aClass200_3 = Static58.aClass200_1;
		this.aFloat95 = 1.1523438F;
		this.anInt5417 = 0;
	}

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class208(@OriginalArg(0) Class3_Sub2 arg0) {
		this.method4838(arg0);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!ika;B)V")
	public void method4838(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(9) int local9 = arg0.method2048(255);
		if (Static580.aClass3_Sub22_24.aClass21_Sub2_1.method1740() == 1 && Static126.aClass22_3.method9362() > 0) {
			if ((local9 & 0x1) == 0) {
				this.anInt5426 = Static329.anInt5319;
			} else {
				this.anInt5426 = arg0.method2036();
			}
			if ((local9 & 0x2) == 0) {
				this.aFloat95 = 1.1523438F;
			} else {
				this.aFloat95 = (float) arg0.method2028(-14795) / 256.0F;
			}
			if ((local9 & 0x4) == 0) {
				this.aFloat96 = 0.69921875F;
			} else {
				this.aFloat96 = (float) arg0.method2028(-14795) / 256.0F;
			}
			if ((local9 & 0x8) == 0) {
				this.aFloat92 = 1.2F;
			} else {
				this.aFloat92 = (float) arg0.method2028(-14795) / 256.0F;
			}
		} else {
			if ((local9 & 0x1) != 0) {
				arg0.method2036();
			}
			if ((local9 & 0x2) != 0) {
				arg0.method2028(-14795);
			}
			if ((local9 & 0x4) != 0) {
				arg0.method2028(-14795);
			}
			if ((local9 & 0x8) != 0) {
				arg0.method2028(-14795);
			}
			this.aFloat96 = 0.69921875F;
			this.aFloat95 = 1.1523438F;
			this.anInt5426 = Static329.anInt5319;
			this.aFloat92 = 1.2F;
		}
		if ((local9 & 0x10) == 0) {
			this.anInt5415 = -60;
			this.anInt5419 = -50;
			this.anInt5428 = -50;
		} else {
			this.anInt5428 = arg0.method2017();
			this.anInt5415 = arg0.method2017();
			this.anInt5419 = arg0.method2017();
		}
		if ((local9 & 0x20) == 0) {
			this.anInt5420 = Static680.anInt10648;
		} else {
			this.anInt5420 = arg0.method2036();
		}
		if ((local9 & 0x40) == 0) {
			this.anInt5417 = 0;
		} else {
			this.anInt5417 = arg0.method2028(-14795);
		}
		if ((local9 & 0x80) == 0) {
			this.aClass113_2 = Static681.aClass113_4;
			return;
		}
		@Pc(277) int local277 = arg0.method2028(-14795);
		@Pc(281) int local281 = arg0.method2028(-14795);
		@Pc(287) int local287 = arg0.method2028(-14795);
		@Pc(291) int local291 = arg0.method2028(-14795);
		@Pc(295) int local295 = arg0.method2028(-14795);
		@Pc(299) int local299 = arg0.method2028(-14795);
		this.aClass113_2 = Static397.method5357(local287, local277, local291, local295, local281, local299);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!kea;I)Z")
	public boolean method4839(@OriginalArg(0) Class208 arg0) {
		return this.anInt5426 == arg0.anInt5426 && arg0.aFloat95 == this.aFloat95 && arg0.aFloat96 == this.aFloat96 && this.aFloat92 == arg0.aFloat92 && this.aFloat93 == arg0.aFloat93 && this.aFloat91 == arg0.aFloat91 && arg0.aFloat94 == this.aFloat94 && arg0.anInt5420 == this.anInt5420 && this.anInt5417 == arg0.anInt5417 && arg0.aClass113_2 == this.aClass113_2 && this.aClass200_3 == arg0.aClass200_3;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!ika;Z)V")
	public void method4841(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aFloat91 = (float) (arg0.method2048(255) * 8) / 255.0F;
		this.aFloat93 = (float) (arg0.method2048(255) * 8) / 255.0F;
		this.aFloat94 = (float) (arg0.method2048(255) * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(Lclient!ika;B)V")
	public void method4843(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(16) int local16 = arg0.method2028(-14795);
		@Pc(20) int local20 = arg0.method2017();
		@Pc(24) int local24 = arg0.method2017();
		@Pc(28) int local28 = arg0.method2017();
		@Pc(32) int local32 = arg0.method2028(-14795);
		Static332.anInt5342 = local32;
		this.aClass200_3 = Static577.method7507(local24, local16, local20, local28);
	}
}
