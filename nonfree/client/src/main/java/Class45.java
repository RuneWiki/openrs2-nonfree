import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class45 {

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!wi;")
	private Class268 aClass268_9 = new Class268(128);

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "Lclient!wi;")
	public Class268 aClass268_10 = new Class268(64);

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "Lclient!uu;")
	private final Class250 aClass250_21;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!uu;")
	public final Class250 aClass250_20;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;Lclient!uu;)V")
	public Class45(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_21 = arg2;
		this.aClass250_20 = arg3;
		this.aClass250_21.method5815(36);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	public void method1251() {
		@Pc(7) Class268 local7 = this.aClass268_9;
		synchronized (this.aClass268_9) {
			this.aClass268_9.method6160();
		}
		local7 = this.aClass268_10;
		synchronized (this.aClass268_10) {
			this.aClass268_10.method6160();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public void method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass268_9 = new Class268(arg0);
		this.aClass268_10 = new Class268(arg1);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lclient!mk;")
	public Class152 method1255(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_9;
		@Pc(16) Class152 local16;
		synchronized (this.aClass268_9) {
			local16 = (Class152) this.aClass268_9.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_21;
		@Pc(38) byte[] local38;
		synchronized (this.aClass250_21) {
			local38 = this.aClass250_21.method5806(36, arg0);
		}
		local16 = new Class152();
		local16.aClass45_4 = this;
		local16.anInt4343 = arg0;
		if (local38 != null) {
			local16.method3613(new Class3_Sub25(local38));
		}
		local16.method3607();
		@Pc(69) Class268 local69 = this.aClass268_9;
		synchronized (this.aClass268_9) {
			this.aClass268_9.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
	public void method1257() {
		@Pc(6) Class268 local6 = this.aClass268_9;
		synchronized (this.aClass268_9) {
			this.aClass268_9.method6173(5);
		}
		local6 = this.aClass268_10;
		synchronized (this.aClass268_10) {
			this.aClass268_10.method6173(5);
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	public void method1260() {
		@Pc(10) Class268 local10 = this.aClass268_9;
		synchronized (this.aClass268_9) {
			this.aClass268_9.method6168();
		}
		local10 = this.aClass268_10;
		synchronized (this.aClass268_10) {
			this.aClass268_10.method6168();
		}
	}
}
