import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class130 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "F")
	public float aFloat97 = 0.25F;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "F")
	public float aFloat95 = 1.0F;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "F")
	public float aFloat98 = 1.0F;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public final int anInt3686;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public final int anInt3688;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
	public final int anInt3691;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public final int anInt3692;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "F")
	public final float aFloat96;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
	public final int anInt3687;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	public final int anInt3685;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "F")
	public final float aFloat99;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "F")
	public final float aFloat100;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!wn;")
	public final Class209 aClass209_2;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class130() {
		this.anInt3686 = -50;
		this.anInt3688 = Static172.anInt3236;
		this.anInt3691 = -60;
		this.anInt3692 = Static413.anInt7318;
		this.aFloat96 = 0.69921875F;
		this.anInt3687 = -50;
		this.anInt3685 = 0;
		this.aFloat99 = 1.1523438F;
		this.aFloat100 = 1.2F;
		this.aClass209_2 = Static504.aClass209_6;
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class130(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(16) int local16 = arg0.method7974();
		if (Static86.aClass1_Sub30_Sub1_1.method5019(Static286.anInt5239) && Static432.aClass78_112.method6777() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3692 = Static413.anInt7318;
			} else {
				this.anInt3692 = arg0.method7940();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat99 = 1.1523438F;
			} else {
				this.aFloat99 = (float) arg0.method7945() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat96 = 0.69921875F;
			} else {
				this.aFloat96 = (float) arg0.method7945() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat100 = 1.2F;
			} else {
				this.aFloat100 = (float) arg0.method7945() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method7940();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method7945();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method7945();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method7945();
			}
			this.anInt3692 = Static413.anInt7318;
			this.aFloat100 = 1.2F;
			this.aFloat96 = 0.69921875F;
			this.aFloat99 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3687 = -50;
			this.anInt3686 = -50;
			this.anInt3691 = -60;
		} else {
			this.anInt3686 = arg0.method7975();
			this.anInt3691 = arg0.method7975();
			this.anInt3687 = arg0.method7975();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3688 = Static172.anInt3236;
		} else {
			this.anInt3688 = arg0.method7940();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3685 = 0;
		} else {
			this.anInt3685 = arg0.method7945();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass209_2 = Static504.aClass209_6;
		} else {
			@Pc(213) int local213 = arg0.method7945();
			@Pc(217) int local217 = arg0.method7945();
			@Pc(221) int local221 = arg0.method7945();
			@Pc(225) int local225 = arg0.method7945();
			@Pc(229) int local229 = arg0.method7945();
			@Pc(233) int local233 = arg0.method7945();
			this.aClass209_2 = Static225.method3349(local225, local213, local217, local221, local233, local229);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!hd;I)Z")
	public boolean method3010(@OriginalArg(0) Class130 arg0) {
		return this.anInt3692 == arg0.anInt3692 && arg0.aFloat99 == this.aFloat99 && this.aFloat96 == arg0.aFloat96 && this.aFloat100 == arg0.aFloat100 && arg0.aFloat97 == this.aFloat97 && this.aFloat98 == arg0.aFloat98 && this.aFloat95 == arg0.aFloat95 && arg0.anInt3688 == this.anInt3688 && this.anInt3685 == arg0.anInt3685 && arg0.aClass209_2 == this.aClass209_2;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ac;I)V")
	public void method3011(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aFloat98 = (float) (arg0.method7974() * 8) / 255.0F;
		this.aFloat97 = (float) (arg0.method7974() * 8) / 255.0F;
		this.aFloat95 = (float) (arg0.method7974() * 8) / 255.0F;
	}
}
