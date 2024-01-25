import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class265 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!vba;")
	private Class3_Sub10 aClass3_Sub10_52;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "J")
	private long aLong244;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[Lclient!vba;")
	private final Class3_Sub10[] aClass3_Sub10Array1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	private final int anInt8009;

	static {
		new Class67("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
	public Class265(@OriginalArg(0) int arg0) {
		this.aClass3_Sub10Array1 = new Class3_Sub10[arg0];
		this.anInt8009 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub10 local20 = this.aClass3_Sub10Array1[local10] = new Class3_Sub10();
			local20.aClass3_Sub10_60 = local20;
			local20.aClass3_Sub10_59 = local20;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(JI)Lclient!vba;")
	public Class3_Sub10 method6628(@OriginalArg(0) long arg0) {
		this.aLong244 = arg0;
		@Pc(20) Class3_Sub10 local20 = this.aClass3_Sub10Array1[(int) ((long) (this.anInt8009 - 1) & arg0)];
		for (this.aClass3_Sub10_52 = local20.aClass3_Sub10_59; this.aClass3_Sub10_52 != local20; this.aClass3_Sub10_52 = this.aClass3_Sub10_52.aClass3_Sub10_59) {
			if (arg0 == this.aClass3_Sub10_52.aLong277) {
				@Pc(35) Class3_Sub10 local35 = this.aClass3_Sub10_52;
				this.aClass3_Sub10_52 = this.aClass3_Sub10_52.aClass3_Sub10_59;
				return local35;
			}
		}
		this.aClass3_Sub10_52 = null;
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)Lclient!vba;")
	public Class3_Sub10 method6630() {
		if (this.aClass3_Sub10_52 == null) {
			return null;
		}
		@Pc(23) Class3_Sub10 local23 = this.aClass3_Sub10Array1[(int) (this.aLong244 & (long) (this.anInt8009 - 1))];
		while (local23 != this.aClass3_Sub10_52) {
			if (this.aLong244 == this.aClass3_Sub10_52.aLong277) {
				@Pc(39) Class3_Sub10 local39 = this.aClass3_Sub10_52;
				this.aClass3_Sub10_52 = this.aClass3_Sub10_52.aClass3_Sub10_59;
				return local39;
			}
			this.aClass3_Sub10_52 = this.aClass3_Sub10_52.aClass3_Sub10_59;
		}
		this.aClass3_Sub10_52 = null;
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!vba;J)V")
	public void method6632(@OriginalArg(1) Class3_Sub10 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_Sub10_60 != null) {
			arg0.method7643();
		}
		@Pc(21) Class3_Sub10 local21 = this.aClass3_Sub10Array1[(int) (arg1 & (long) (this.anInt8009 - 1))];
		arg0.aClass3_Sub10_60 = local21.aClass3_Sub10_60;
		arg0.aClass3_Sub10_59 = local21;
		arg0.aClass3_Sub10_60.aClass3_Sub10_59 = arg0;
		arg0.aClass3_Sub10_59.aClass3_Sub10_60 = arg0;
		arg0.aLong277 = arg1;
	}
}
