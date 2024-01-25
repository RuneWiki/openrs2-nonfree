import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class157 {

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!me;")
	private final Class211 aClass211_31 = new Class211(64);

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!me;")
	private final Class211 aClass211_32 = new Class211(100);

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Lclient!pe;")
	private final Class254 aClass254_71;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;Lclient!pe;Lclient!pe;)V")
	public Class157(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) Class254 arg4) {
		this.aClass254_71 = arg2;
		if (this.aClass254_71 != null) {
			@Pc(26) int local26 = this.aClass254_71.method6421() - 1;
			this.aClass254_71.method6396(local26);
		}
		Static513.method355(arg4, arg3);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public void method3731() {
		@Pc(6) Class211 local6 = this.aClass211_31;
		synchronized (this.aClass211_31) {
			this.aClass211_31.method5538(5);
		}
		local6 = this.aClass211_32;
		synchronized (this.aClass211_32) {
			this.aClass211_32.method5538(5);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public void method3732() {
		@Pc(2) Class211 local2 = this.aClass211_31;
		synchronized (this.aClass211_31) {
			this.aClass211_31.method5535();
		}
		local2 = this.aClass211_32;
		synchronized (this.aClass211_32) {
			this.aClass211_32.method5535();
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Lclient!jq;")
	public Class174 method3734(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_31;
		@Pc(16) Class174 local16;
		synchronized (this.aClass211_31) {
			local16 = (Class174) this.aClass211_31.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_71;
		@Pc(42) byte[] local42;
		synchronized (this.aClass254_71) {
			local42 = this.aClass254_71.method6401(Static53.method1290(arg0), Static268.method4691(arg0));
		}
		local16 = new Class174();
		local16.anInt5481 = arg0;
		local16.aClass157_1 = this;
		if (local42 != null) {
			local16.method4542(new Class3_Sub7(local42));
		}
		local16.method4539();
		@Pc(81) Class211 local81 = this.aClass211_31;
		synchronized (this.aClass211_31) {
			this.aClass211_31.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)Lclient!ga;")
	public Class3_Sub4_Sub12 method3737(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_32;
		@Pc(16) Class3_Sub4_Sub12 local16;
		synchronized (this.aClass211_32) {
			local16 = (Class3_Sub4_Sub12) this.aClass211_32.method5534((long) arg0);
			if (local16 == null) {
				local16 = new Class3_Sub4_Sub12(arg0);
				this.aClass211_32.method5529((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method2963() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	public void method3739() {
		@Pc(6) Class211 local6 = this.aClass211_31;
		synchronized (this.aClass211_31) {
			this.aClass211_31.method5537();
		}
		local6 = this.aClass211_32;
		synchronized (this.aClass211_32) {
			this.aClass211_32.method5537();
		}
	}
}
