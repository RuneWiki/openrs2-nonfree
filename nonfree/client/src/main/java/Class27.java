import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class27 {

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
	public int anInt685;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "Lclient!ng;")
	private final Class167 aClass167_10 = new Class167(64);

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "Lclient!ng;")
	public final Class167 aClass167_11 = new Class167(50);

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "Lclient!ng;")
	public final Class167 aClass167_12 = new Class167(5);

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "Lclient!ic;")
	private final Class113 aClass113_13;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "Z")
	public boolean aBoolean51;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!ic;")
	public final Class113 aClass113_12;

	static {
		new Class151("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ai;IZLclient!ic;Lclient!ic;)V")
	public Class27(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) Class113 arg4) {
		this.aClass113_13 = arg3;
		this.aBoolean51 = arg2;
		this.aClass113_12 = arg4;
		if (this.aClass113_13 != null) {
			@Pc(38) int local38 = this.aClass113_13.method2272() - 1;
			this.aClass113_13.method2271(local38);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZZ)V")
	public void method586(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean51 != arg0) {
			this.aBoolean51 = arg0;
			this.method592();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public void method587() {
		@Pc(14) Class167 local14 = this.aClass167_11;
		synchronized (this.aClass167_11) {
			this.aClass167_11.method3390();
		}
		local14 = this.aClass167_12;
		synchronized (this.aClass167_12) {
			this.aClass167_12.method3390();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)Lclient!va;")
	public Class246 method588(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_10;
		@Pc(16) Class246 local16;
		synchronized (this.aClass167_10) {
			local16 = (Class246) this.aClass167_10.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass113_13.method2274(Static312.method4045(arg0), Static309.method4031(arg0));
		local16 = new Class246();
		local16.aClass27_2 = this;
		local16.anInt6859 = arg0;
		if (local37 != null) {
			local16.method5253(new Class1_Sub11(local37));
		}
		local16.method5251();
		@Pc(67) Class167 local67 = this.aClass167_10;
		synchronized (this.aClass167_10) {
			this.aClass167_10.method3392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public void method591() {
		@Pc(6) Class167 local6 = this.aClass167_10;
		synchronized (this.aClass167_10) {
			this.aClass167_10.method3384(5);
		}
		local6 = this.aClass167_11;
		synchronized (this.aClass167_11) {
			this.aClass167_11.method3384(5);
		}
		local6 = this.aClass167_12;
		synchronized (this.aClass167_12) {
			this.aClass167_12.method3384(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public void method592() {
		@Pc(10) Class167 local10 = this.aClass167_10;
		synchronized (this.aClass167_10) {
			this.aClass167_10.method3390();
		}
		local10 = this.aClass167_11;
		synchronized (this.aClass167_11) {
			this.aClass167_11.method3390();
		}
		local10 = this.aClass167_12;
		synchronized (this.aClass167_12) {
			this.aClass167_12.method3390();
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)V")
	public void method593(@OriginalArg(0) int arg0) {
		this.anInt685 = arg0;
		@Pc(9) Class167 local9 = this.aClass167_11;
		synchronized (this.aClass167_11) {
			this.aClass167_11.method3390();
		}
		local9 = this.aClass167_12;
		synchronized (this.aClass167_12) {
			this.aClass167_12.method3390();
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
	public void method594() {
		@Pc(2) Class167 local2 = this.aClass167_10;
		synchronized (this.aClass167_10) {
			this.aClass167_10.method3389();
		}
		local2 = this.aClass167_11;
		synchronized (this.aClass167_11) {
			this.aClass167_11.method3389();
		}
		local2 = this.aClass167_12;
		synchronized (this.aClass167_12) {
			this.aClass167_12.method3389();
		}
	}
}
