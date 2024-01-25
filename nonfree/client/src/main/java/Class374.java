import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class374 {

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
	public int anInt9819;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Z")
	public boolean aBoolean721 = false;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "Lclient!pja;")
	private Class279 aClass279_62 = new Class279(64);

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "Lclient!pja;")
	public final Class279 aClass279_63 = new Class279(500);

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "Lclient!pja;")
	public final Class279 aClass279_64 = new Class279(30);

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "Lclient!pja;")
	public final Class279 aClass279_65 = new Class279(50);

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!gj;")
	public final Class143 aClass143_137;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "Lclient!gj;")
	private final Class143 aClass143_138;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
	public boolean aBoolean722;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!im;IZLclient!gj;Lclient!gj;)V")
	public Class374(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class143 arg3, @OriginalArg(4) Class143 arg4) {
		this.aClass143_137 = arg4;
		this.aClass143_138 = arg3;
		this.aBoolean722 = arg2;
		if (this.aClass143_138 != null) {
			@Pc(47) int local47 = this.aClass143_138.method3116() - 1;
			this.aClass143_138.method3123(local47);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
	public void method8351(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean722) {
			this.aBoolean722 = arg0;
			this.method8352();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public void method8352() {
		@Pc(10) Class279 local10 = this.aClass279_62;
		synchronized (this.aClass279_62) {
			this.aClass279_62.method6638();
		}
		local10 = this.aClass279_63;
		synchronized (this.aClass279_63) {
			this.aClass279_63.method6638();
		}
		local10 = this.aClass279_64;
		synchronized (this.aClass279_64) {
			this.aClass279_64.method6638();
		}
		local10 = this.aClass279_65;
		synchronized (this.aClass279_65) {
			this.aClass279_65.method6638();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	public void method8353(@OriginalArg(1) int arg0) {
		this.aClass279_62 = new Class279(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
	public void method8355() {
		@Pc(6) Class279 local6 = this.aClass279_62;
		synchronized (this.aClass279_62) {
			this.aClass279_62.method6637();
		}
		local6 = this.aClass279_63;
		synchronized (this.aClass279_63) {
			this.aClass279_63.method6637();
		}
		local6 = this.aClass279_64;
		synchronized (this.aClass279_64) {
			this.aClass279_64.method6637();
		}
		local6 = this.aClass279_65;
		synchronized (this.aClass279_65) {
			this.aClass279_65.method6637();
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V")
	public void method8356(@OriginalArg(1) int arg0) {
		this.anInt9819 = arg0;
		@Pc(15) Class279 local15 = this.aClass279_63;
		synchronized (this.aClass279_63) {
			this.aClass279_63.method6638();
		}
		local15 = this.aClass279_64;
		synchronized (this.aClass279_64) {
			this.aClass279_64.method6638();
		}
		local15 = this.aClass279_65;
		synchronized (this.aClass279_65) {
			this.aClass279_65.method6638();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)Lclient!ij;")
	public Class178 method8357(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_62;
		@Pc(16) Class178 local16;
		synchronized (this.aClass279_62) {
			local16 = (Class178) this.aClass279_62.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class143 local35 = this.aClass143_138;
		@Pc(48) byte[] local48;
		synchronized (this.aClass143_138) {
			local48 = this.aClass143_138.method3125(Static278.method4417(arg0), Static374.method5526(arg0));
		}
		local16 = new Class178();
		local16.anInt4778 = arg0;
		local16.aClass374_1 = this;
		if (local48 != null) {
			local16.method4025(new Class3_Sub17(local48));
		}
		local16.method4014();
		if (local16.aBoolean392) {
			local16.anInt4737 = 0;
			local16.aBoolean385 = false;
		}
		if (!this.aBoolean722 && local16.aBoolean378) {
			local16.anIntArray316 = null;
			local16.aStringArray35 = null;
		}
		@Pc(100) Class279 local100 = this.aClass279_62;
		synchronized (this.aClass279_62) {
			this.aClass279_62.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V")
	public void method8358() {
		@Pc(6) Class279 local6 = this.aClass279_62;
		synchronized (this.aClass279_62) {
			this.aClass279_62.method6630(5);
		}
		local6 = this.aClass279_63;
		synchronized (this.aClass279_63) {
			this.aClass279_63.method6630(5);
		}
		local6 = this.aClass279_64;
		synchronized (this.aClass279_64) {
			this.aClass279_64.method6630(5);
		}
		local6 = this.aClass279_65;
		synchronized (this.aClass279_65) {
			this.aClass279_65.method6630(5);
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(ZI)V")
	public void method8359(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean721) {
			this.aBoolean721 = arg0;
			this.method8352();
		}
	}
}
