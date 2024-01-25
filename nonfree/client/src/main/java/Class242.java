import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class242 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "[I")
	public static final int[] anIntArray404;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!ng;")
	private final Class167 aClass167_93 = new Class167(128);

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!ic;")
	private final Class113 aClass113_126;

	static {
		new Class151("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
		anIntArray404 = new int[256];
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray404[local10] = local13;
		}
		new Class151("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class242(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_126 = arg2;
		if (this.aClass113_126 != null) {
			@Pc(20) int local20 = this.aClass113_126.method2272() - 1;
			this.aClass113_126.method2271(local20);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Lclient!ei;")
	public Class64 method5027(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_93;
		@Pc(16) Class64 local16;
		synchronized (this.aClass167_93) {
			local16 = (Class64) this.aClass167_93.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass113_126.method2274(Static445.method5572(arg0), Static133.method1797(arg0));
		local16 = new Class64();
		if (local39 != null) {
			local16.method1323(new Class1_Sub11(local39));
		}
		@Pc(55) Class167 local55 = this.aClass167_93;
		synchronized (this.aClass167_93) {
			this.aClass167_93.method3392(local16, (long) arg0);
			return local16;
		}
	}
}
