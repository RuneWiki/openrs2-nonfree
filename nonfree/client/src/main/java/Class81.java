import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class81 {

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "Lclient!hp;")
	public Class108 aClass108_3;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
	public int anInt2453;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
	public int anInt2454;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "Z")
	public boolean aBoolean165 = false;

	static {
		new Class267("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!eq;IIZ)Lclient!qg;")
	public Class87 method2024(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (arg1 << 16 | this.anInt2453 | (arg2 ? 262144 : 0) | arg0.anInt5948 << 19);
		@Pc(32) Class87 local32 = (Class87) this.aClass108_3.aClass44_22.method1353(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass108_3.aClass100_28.method2492(this.anInt2453)) {
			@Pc(54) Class194 local54 = Static458.method4494(this.aClass108_3.aClass100_28, this.anInt2453, 0);
			if (local54 != null) {
				local54.anInt5387 = local54.anInt5385 = local54.anInt5384 = local54.anInt5388 = 0;
				if (arg2) {
					local54.method4495();
				}
				for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
					local54.method4488();
				}
			}
			local32 = arg0.method5038(local54);
			if (local32 != null) {
				this.aClass108_3.aClass44_22.method1349(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!ae;I)V")
	private void method2025(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt2453 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt2454 = arg1.method6435();
		} else if (arg0 == 3) {
			this.aBoolean165 = true;
		} else if (arg0 == 4) {
			this.anInt2453 = -1;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!ae;)V")
	public void method2026(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method2025(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)Z")
	public boolean method2027() {
		return this.aClass108_3.aClass100_28.method2492(this.anInt2453);
	}
}
