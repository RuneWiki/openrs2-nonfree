import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class58 {

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public int anInt1850;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!rt;")
	public Class217 aClass217_7;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	public int anInt1855;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Z")
	public boolean aBoolean111 = false;

	static {
		new Class7("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!ya;Z)Lclient!l;")
	public Class143 method1603(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt5452 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.anInt1855);
		@Pc(32) Class143 local32 = (Class143) this.aClass217_7.aClass134_48.method3266(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass217_7.aClass246_191.method5497(this.anInt1855)) {
			@Pc(59) Class51 local59 = Static461.method1450(this.aClass217_7.aClass246_191, this.anInt1855, 0);
			if (local59 != null) {
				local59.anInt1640 = local59.anInt1636 = local59.anInt1637 = local59.anInt1639 = 0;
				if (arg2) {
					local59.method1456();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local59.method1452();
				}
			}
			local32 = arg1.method4549(local59);
			if (local32 != null) {
				this.aClass217_7.aClass134_48.method3263(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Z")
	public boolean method1604() {
		return this.aClass217_7.aClass246_191.method5497(this.anInt1855);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!hp;)V")
	public void method1605(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5366();
			if (local3 == 0) {
				return;
			}
			this.method1607(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!hp;I)V")
	private void method1607(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt1855 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anInt1850 = arg1.method5399();
		} else if (arg0 == 3) {
			this.aBoolean111 = true;
		} else if (arg0 == 4) {
			this.anInt1855 = -1;
		}
	}
}
