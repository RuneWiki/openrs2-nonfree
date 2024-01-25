import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class50 {

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!rp;")
	private final Class220 aClass220_5 = new Class220(256);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!lt;")
	private final Class158 aClass158_16;

	static {
		new Class231("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class50(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_16 = arg2;
		this.aClass158_16.method3683(26);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public void method1390() {
		@Pc(2) Class220 local2 = this.aClass220_5;
		synchronized (this.aClass220_5) {
			this.aClass220_5.method4999();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)Lclient!al;")
	public Class6_Sub1_Sub2 method1391(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_5;
		@Pc(16) Class6_Sub1_Sub2 local16;
		synchronized (this.aClass220_5) {
			local16 = (Class6_Sub1_Sub2) this.aClass220_5.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass158_16.method3672(arg0, 26);
		local16 = new Class6_Sub1_Sub2();
		if (local33 != null) {
			local16.method164(new Class6_Sub15(local33));
		}
		@Pc(49) Class220 local49 = this.aClass220_5;
		synchronized (this.aClass220_5) {
			this.aClass220_5.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	public void method1392() {
		@Pc(6) Class220 local6 = this.aClass220_5;
		synchronized (this.aClass220_5) {
			this.aClass220_5.method4998(5);
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
	public void method1395() {
		@Pc(2) Class220 local2 = this.aClass220_5;
		synchronized (this.aClass220_5) {
			this.aClass220_5.method4987();
		}
	}
}
