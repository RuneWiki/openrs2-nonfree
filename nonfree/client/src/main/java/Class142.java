import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class142 {

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "F")
	public float aFloat69 = 1.0F;

	@OriginalMember(owner = "client!jda", name = "o", descriptor = "F")
	public float aFloat71 = 1.0F;

	@OriginalMember(owner = "client!jda", name = "l", descriptor = "F")
	public float aFloat70 = 0.25F;

	@OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
	public final int anInt3968;

	@OriginalMember(owner = "client!jda", name = "s", descriptor = "I")
	public final int anInt3967;

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
	public final int anInt3963;

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "F")
	public final float aFloat68;

	@OriginalMember(owner = "client!jda", name = "q", descriptor = "F")
	public final float aFloat72;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
	public final int anInt3960;

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
	public final int anInt3964;

	@OriginalMember(owner = "client!jda", name = "n", descriptor = "Lclient!lh;")
	public final Class58 aClass58_3;

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "F")
	public final float aFloat67;

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
	public final int anInt3961;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V")
	public Class142() {
		this.anInt3968 = Static266.anInt4919;
		this.anInt3967 = -60;
		this.anInt3963 = -50;
		this.aFloat68 = 0.69921875F;
		this.aFloat72 = 1.1523438F;
		this.anInt3960 = 0;
		this.anInt3964 = Static108.anInt2105;
		this.aClass58_3 = Static282.aClass58_4;
		this.aFloat67 = 1.2F;
		this.anInt3961 = -50;
	}

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!ps;)V")
	public Class142(@OriginalArg(0) Class2_Sub29 arg0) {
		@Pc(16) int local16 = arg0.method5170();
		if (Static281.aClass2_Sub19_Sub1_1.method2134(Static266.anInt4923) && Static525.aClass39_12.method6053() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3964 = Static108.anInt2105;
			} else {
				this.anInt3964 = arg0.method5198();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat72 = 1.1523438F;
			} else {
				this.aFloat72 = (float) arg0.method5229() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat68 = 0.69921875F;
			} else {
				this.aFloat68 = (float) arg0.method5229() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat67 = 1.2F;
			} else {
				this.aFloat67 = (float) arg0.method5229() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5198();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5229();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5229();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5229();
			}
			this.aFloat68 = 0.69921875F;
			this.aFloat72 = 1.1523438F;
			this.anInt3964 = Static108.anInt2105;
			this.aFloat67 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3967 = -60;
			this.anInt3963 = -50;
			this.anInt3961 = -50;
		} else {
			this.anInt3963 = arg0.method5231();
			this.anInt3967 = arg0.method5231();
			this.anInt3961 = arg0.method5231();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3968 = Static266.anInt4919;
		} else {
			this.anInt3968 = arg0.method5198();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3960 = 0;
		} else {
			this.anInt3960 = arg0.method5229();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass58_3 = Static282.aClass58_4;
		} else {
			@Pc(223) int local223 = arg0.method5229();
			@Pc(227) int local227 = arg0.method5229();
			@Pc(231) int local231 = arg0.method5229();
			@Pc(235) int local235 = arg0.method5229();
			@Pc(239) int local239 = arg0.method5229();
			@Pc(243) int local243 = arg0.method5229();
			this.aClass58_3 = Static69.method1445(local223, local231, local239, local235, local243, local227);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ps;I)V")
	public void method3486(@OriginalArg(0) Class2_Sub29 arg0) {
		this.aFloat69 = (float) (arg0.method5170() * 8) / 255.0F;
		this.aFloat70 = (float) (arg0.method5170() * 8) / 255.0F;
		this.aFloat71 = (float) (arg0.method5170() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!jda;)Z")
	public boolean method3487(@OriginalArg(1) Class142 arg0) {
		return this.anInt3964 == arg0.anInt3964 && arg0.aFloat72 == this.aFloat72 && arg0.aFloat68 == this.aFloat68 && this.aFloat67 == arg0.aFloat67 && this.aFloat70 == arg0.aFloat70 && arg0.aFloat69 == this.aFloat69 && this.aFloat71 == arg0.aFloat71 && arg0.anInt3968 == this.anInt3968 && this.anInt3960 == arg0.anInt3960 && arg0.aClass58_3 == this.aClass58_3;
	}
}
