import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class32 {

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Lclient!sw;")
	private Class277 aClass277_10 = new Class277(128);

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "Lclient!sw;")
	public Class277 aClass277_11 = new Class277(64);

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "Lclient!dn;")
	private final Class69 aClass69_13;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Lclient!dn;")
	public final Class69 aClass69_12;

	static {
		new Class45("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;Lclient!dn;)V")
	public Class32(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) Class69 arg3) {
		this.aClass69_13 = arg2;
		this.aClass69_12 = arg3;
		this.aClass69_13.method1884(36);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	public void method1125() {
		@Pc(13) Class277 local13 = this.aClass277_10;
		synchronized (this.aClass277_10) {
			this.aClass277_10.method7019();
		}
		local13 = this.aClass277_11;
		synchronized (this.aClass277_11) {
			this.aClass277_11.method7019();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public void method1127() {
		@Pc(6) Class277 local6 = this.aClass277_10;
		synchronized (this.aClass277_10) {
			this.aClass277_10.method7026();
		}
		local6 = this.aClass277_11;
		synchronized (this.aClass277_11) {
			this.aClass277_11.method7026();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZ)V")
	public void method1128() {
		@Pc(2) Class277 local2 = this.aClass277_10;
		synchronized (this.aClass277_10) {
			this.aClass277_10.method7018(5);
		}
		local2 = this.aClass277_11;
		synchronized (this.aClass277_11) {
			this.aClass277_11.method7018(5);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)Lclient!di;")
	public Class65 method1129(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_10;
		@Pc(16) Class65 local16;
		synchronized (this.aClass277_10) {
			local16 = (Class65) this.aClass277_10.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_13;
		@Pc(38) byte[] local38;
		synchronized (this.aClass69_13) {
			local38 = this.aClass69_13.method1888(arg0, 36);
		}
		local16 = new Class65();
		local16.aClass32_1 = this;
		local16.anInt1916 = arg0;
		if (local38 != null) {
			local16.method1826(new Class1_Sub17(local38));
		}
		local16.method1821();
		@Pc(74) Class277 local74 = this.aClass277_10;
		synchronized (this.aClass277_10) {
			this.aClass277_10.method7016(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZ)V")
	public void method1130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass277_10 = new Class277(arg0);
		this.aClass277_11 = new Class277(arg1);
	}
}
