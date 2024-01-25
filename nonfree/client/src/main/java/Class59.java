import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class59 {

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "I")
	public int anInt1572;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Lclient!rp;")
	private final Class220 aClass220_7 = new Class220(64);

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "Lclient!rp;")
	public final Class220 aClass220_8 = new Class220(50);

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "Lclient!rp;")
	public final Class220 aClass220_9 = new Class220(5);

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "Lclient!lt;")
	private final Class158 aClass158_19;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "Lclient!lt;")
	public final Class158 aClass158_20;

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "Z")
	public boolean aBoolean135;

	static {
		new Class231("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!cm;IZLclient!lt;Lclient!lt;)V")
	public Class59(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class158 arg3, @OriginalArg(4) Class158 arg4) {
		this.aClass158_19 = arg3;
		this.aClass158_20 = arg4;
		this.aBoolean135 = arg2;
		if (this.aClass158_19 != null) {
			@Pc(38) int local38 = this.aClass158_19.method3695() - 1;
			this.aClass158_19.method3683(local38);
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Lclient!at;")
	public Class17 method1468(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_7;
		@Pc(16) Class17 local16;
		synchronized (this.aClass220_7) {
			local16 = (Class17) this.aClass220_7.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass158_19.method3672(Static188.method2932(arg0), Static6.method93(arg0));
		local16 = new Class17();
		local16.anInt345 = arg0;
		local16.aClass59_1 = this;
		if (local37 != null) {
			local16.method290(new Class6_Sub15(local37));
		}
		local16.method281();
		@Pc(62) Class220 local62 = this.aClass220_7;
		synchronized (this.aClass220_7) {
			this.aClass220_7.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	public void method1471() {
		@Pc(2) Class220 local2 = this.aClass220_7;
		synchronized (this.aClass220_7) {
			this.aClass220_7.method4999();
		}
		local2 = this.aClass220_8;
		synchronized (this.aClass220_8) {
			this.aClass220_8.method4999();
		}
		local2 = this.aClass220_9;
		synchronized (this.aClass220_9) {
			this.aClass220_9.method4999();
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)V")
	public void method1472(@OriginalArg(0) int arg0) {
		this.anInt1572 = arg0;
		@Pc(9) Class220 local9 = this.aClass220_8;
		synchronized (this.aClass220_8) {
			this.aClass220_8.method4999();
		}
		local9 = this.aClass220_9;
		synchronized (this.aClass220_9) {
			this.aClass220_9.method4999();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZ)V")
	public void method1474(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean135) {
			this.aBoolean135 = arg0;
			this.method1471();
		}
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V")
	public void method1475() {
		@Pc(2) Class220 local2 = this.aClass220_7;
		synchronized (this.aClass220_7) {
			this.aClass220_7.method4987();
		}
		local2 = this.aClass220_8;
		synchronized (this.aClass220_8) {
			this.aClass220_8.method4987();
		}
		local2 = this.aClass220_9;
		synchronized (this.aClass220_9) {
			this.aClass220_9.method4987();
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
	public void method1476() {
		@Pc(2) Class220 local2 = this.aClass220_8;
		synchronized (this.aClass220_8) {
			this.aClass220_8.method4999();
		}
		local2 = this.aClass220_9;
		synchronized (this.aClass220_9) {
			this.aClass220_9.method4999();
		}
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(II)V")
	public void method1477() {
		@Pc(2) Class220 local2 = this.aClass220_7;
		synchronized (this.aClass220_7) {
			this.aClass220_7.method4998(5);
		}
		local2 = this.aClass220_8;
		synchronized (this.aClass220_8) {
			this.aClass220_8.method4998(5);
		}
		local2 = this.aClass220_9;
		synchronized (this.aClass220_9) {
			this.aClass220_9.method4998(5);
		}
	}
}
