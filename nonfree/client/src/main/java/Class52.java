import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class52 {

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "Lclient!me;")
	private final Class211 aClass211_15 = new Class211(64);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "Lclient!pe;")
	private final Class254 aClass254_25;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	public final int anInt1878;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class52(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_25 = arg2;
		if (this.aClass254_25 == null) {
			this.anInt1878 = 0;
		} else {
			this.anInt1878 = this.aClass254_25.method6396(16);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI)Lclient!vl;")
	public Class342 method1764(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_15;
		@Pc(16) Class342 local16;
		synchronized (this.aClass211_15) {
			local16 = (Class342) this.aClass211_15.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class254 local35 = this.aClass254_25;
		@Pc(44) byte[] local44;
		synchronized (this.aClass254_25) {
			local44 = this.aClass254_25.method6401(16, arg0);
		}
		local16 = new Class342();
		if (local44 != null) {
			local16.method8104(new Class3_Sub7(local44));
		}
		@Pc(66) Class211 local66 = this.aClass211_15;
		synchronized (this.aClass211_15) {
			this.aClass211_15.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
	public void method1765() {
		@Pc(2) Class211 local2 = this.aClass211_15;
		synchronized (this.aClass211_15) {
			this.aClass211_15.method5537();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	public void method1767() {
		@Pc(6) Class211 local6 = this.aClass211_15;
		synchronized (this.aClass211_15) {
			this.aClass211_15.method5538(5);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public void method1768() {
		@Pc(6) Class211 local6 = this.aClass211_15;
		synchronized (this.aClass211_15) {
			this.aClass211_15.method5535();
		}
	}
}
