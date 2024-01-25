import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class161 {

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
	public int anInt4716;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!fr;")
	private Class91 aClass91_62 = new Class91(64);

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "Lclient!fr;")
	public final Class91 aClass91_63 = new Class91(500);

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "Lclient!fr;")
	public final Class91 aClass91_64 = new Class91(30);

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "Lclient!fr;")
	public final Class91 aClass91_65 = new Class91(50);

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "Lclient!qs;")
	private final Class211 aClass211_63;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Lclient!qs;")
	public final Class211 aClass211_62;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Z")
	public boolean aBoolean303;

	static {
		new Class158("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!wv;IZLclient!qs;Lclient!qs;)V")
	public Class161(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class211 arg3, @OriginalArg(4) Class211 arg4) {
		this.aClass211_63 = arg3;
		this.aClass211_62 = arg4;
		this.aBoolean303 = arg2;
		if (this.aClass211_63 != null) {
			@Pc(47) int local47 = this.aClass211_63.method4751() - 1;
			this.aClass211_63.method4772(local47);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V")
	public void method3623(@OriginalArg(1) int arg0) {
		this.aClass91_62 = new Class91(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
	public void method3625() {
		@Pc(2) Class91 local2 = this.aClass91_62;
		synchronized (this.aClass91_62) {
			this.aClass91_62.method1998(5);
		}
		local2 = this.aClass91_63;
		synchronized (this.aClass91_63) {
			this.aClass91_63.method1998(5);
		}
		local2 = this.aClass91_64;
		synchronized (this.aClass91_64) {
			this.aClass91_64.method1998(5);
		}
		local2 = this.aClass91_65;
		synchronized (this.aClass91_65) {
			this.aClass91_65.method1998(5);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)V")
	public void method3626(@OriginalArg(0) int arg0) {
		this.anInt4716 = arg0;
		@Pc(9) Class91 local9 = this.aClass91_63;
		synchronized (this.aClass91_63) {
			this.aClass91_63.method1999();
		}
		local9 = this.aClass91_64;
		synchronized (this.aClass91_64) {
			this.aClass91_64.method1999();
		}
		local9 = this.aClass91_65;
		synchronized (this.aClass91_65) {
			this.aClass91_65.method1999();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)Lclient!p;")
	public Class192 method3628(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_62;
		@Pc(16) Class192 local16;
		synchronized (this.aClass91_62) {
			local16 = (Class192) this.aClass91_62.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class211 local35 = this.aClass211_63;
		@Pc(48) byte[] local48;
		synchronized (this.aClass211_63) {
			local48 = this.aClass211_63.method4758(Static411.method5581(arg0), Static48.method897(arg0));
		}
		local16 = new Class192();
		local16.anInt5642 = arg0;
		local16.aClass161_3 = this;
		if (local48 != null) {
			local16.method4355(new Class1_Sub3(local48));
		}
		local16.method4356();
		if (local16.aBoolean357) {
			local16.anInt5664 = 0;
			local16.aBoolean360 = false;
		}
		if (!this.aBoolean303 && local16.aBoolean354) {
			local16.aStringArray36 = null;
			local16.anIntArray535 = null;
		}
		@Pc(100) Class91 local100 = this.aClass91_62;
		synchronized (this.aClass91_62) {
			this.aClass91_62.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
	public void method3629() {
		@Pc(6) Class91 local6 = this.aClass91_62;
		synchronized (this.aClass91_62) {
			this.aClass91_62.method1993();
		}
		local6 = this.aClass91_63;
		synchronized (this.aClass91_63) {
			this.aClass91_63.method1993();
		}
		local6 = this.aClass91_64;
		synchronized (this.aClass91_64) {
			this.aClass91_64.method1993();
		}
		local6 = this.aClass91_65;
		synchronized (this.aClass91_65) {
			this.aClass91_65.method1993();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)V")
	public void method3630(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean304) {
			this.aBoolean304 = arg0;
			this.method3633();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZB)V")
	public void method3631(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean303 != arg0) {
			this.aBoolean303 = arg0;
			this.method3633();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
	public void method3633() {
		@Pc(2) Class91 local2 = this.aClass91_62;
		synchronized (this.aClass91_62) {
			this.aClass91_62.method1999();
		}
		local2 = this.aClass91_63;
		synchronized (this.aClass91_63) {
			this.aClass91_63.method1999();
		}
		local2 = this.aClass91_64;
		synchronized (this.aClass91_64) {
			this.aClass91_64.method1999();
		}
		local2 = this.aClass91_65;
		synchronized (this.aClass91_65) {
			this.aClass91_65.method1999();
		}
	}
}
