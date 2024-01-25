import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class189 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "F")
	public float aFloat58 = 0.25F;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "F")
	public float aFloat57 = 1.0F;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "F")
	public float aFloat61 = 1.0F;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
	public final int anInt5257;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
	public final int anInt5255;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public final int anInt5254;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
	public final int anInt5256;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	public final int anInt5249;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
	public final int anInt5251;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "F")
	public final float aFloat60;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "F")
	public final float aFloat56;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "F")
	public final float aFloat59;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!aj;")
	public final Class10 aClass10_3;

	static {
		new Class62("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class189() {
		this.anInt5257 = Static46.anInt5338;
		this.anInt5255 = Static39.anInt671;
		this.anInt5254 = 0;
		this.anInt5256 = -50;
		this.anInt5249 = -50;
		this.anInt5251 = -60;
		this.aFloat60 = 1.1523438F;
		this.aFloat56 = 1.2F;
		this.aFloat59 = 0.69921875F;
		this.aClass10_3 = Static269.aClass10_2;
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!vt;)V")
	public Class189(@OriginalArg(0) Class2_Sub24 arg0) {
		@Pc(16) int local16 = arg0.method5732();
		if (Static382.aBoolean487 && Static92.aClass48_5.method2446() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5255 = Static39.anInt671;
			} else {
				this.anInt5255 = arg0.method5776();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat60 = 1.1523438F;
			} else {
				this.aFloat60 = (float) arg0.method5753() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat59 = 0.69921875F;
			} else {
				this.aFloat59 = (float) arg0.method5753() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat56 = 1.2F;
			} else {
				this.aFloat56 = (float) arg0.method5753() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5776();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5753();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5753();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5753();
			}
			this.aFloat59 = 0.69921875F;
			this.aFloat56 = 1.2F;
			this.aFloat60 = 1.1523438F;
			this.anInt5255 = Static39.anInt671;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5256 = -50;
			this.anInt5251 = -60;
			this.anInt5249 = -50;
		} else {
			this.anInt5256 = arg0.method5743();
			this.anInt5251 = arg0.method5743();
			this.anInt5249 = arg0.method5743();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5257 = Static46.anInt5338;
		} else {
			this.anInt5257 = arg0.method5776();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5254 = 0;
		} else {
			this.anInt5254 = arg0.method5753();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass10_3 = Static269.aClass10_2;
		} else {
			this.aClass10_3 = Static121.method5861(arg0.method5753(), arg0.method5753(), arg0.method5753(), arg0.method5753(), arg0.method5753(), arg0.method5753());
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!qe;)Z")
	public boolean method4694(@OriginalArg(1) Class189 arg0) {
		return this.anInt5255 == arg0.anInt5255 && this.aFloat60 == arg0.aFloat60 && arg0.aFloat59 == this.aFloat59 && arg0.aFloat56 == this.aFloat56 && this.aFloat58 == arg0.aFloat58 && this.aFloat61 == arg0.aFloat61 && this.aFloat57 == arg0.aFloat57 && this.anInt5257 == arg0.anInt5257 && arg0.anInt5254 == this.anInt5254 && arg0.aClass10_3 == this.aClass10_3;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!vt;)V")
	public void method4695(@OriginalArg(1) Class2_Sub24 arg0) {
		this.aFloat61 = (float) (arg0.method5732() * 8) / 255.0F;
		this.aFloat58 = (float) (arg0.method5732() * 8) / 255.0F;
		this.aFloat57 = (float) (arg0.method5732() * 8) / 255.0F;
	}
}
