import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class59 {

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!wi;")
	private final Class268 aClass268_16 = new Class268(64);

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!wi;")
	private final Class268 aClass268_17 = new Class268(100);

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Lclient!uu;")
	private final Class250 aClass250_29;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;Lclient!uu;Lclient!uu;)V")
	public Class59(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3, @OriginalArg(4) Class250 arg4) {
		this.aClass250_29 = arg2;
		if (this.aClass250_29 != null) {
			@Pc(26) int local26 = this.aClass250_29.method5819() - 1;
			this.aClass250_29.method5815(local26);
		}
		Static228.method3283(arg3, arg4);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	public void method1547() {
		@Pc(2) Class268 local2 = this.aClass268_16;
		synchronized (this.aClass268_16) {
			this.aClass268_16.method6173(5);
		}
		local2 = this.aClass268_17;
		synchronized (this.aClass268_17) {
			this.aClass268_17.method6173(5);
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)Lclient!vs;")
	public Class3_Sub3_Sub17 method1548(@OriginalArg(0) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_17;
		@Pc(21) Class3_Sub3_Sub17 local21;
		synchronized (this.aClass268_17) {
			local21 = (Class3_Sub3_Sub17) this.aClass268_17.method6166((long) arg0);
			if (local21 == null) {
				local21 = new Class3_Sub3_Sub17(arg0);
				this.aClass268_17.method6164(local21, (long) arg0);
			}
		}
		synchronized (local21) {
			return local21.method6065() ? local21 : null;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public void method1550() {
		@Pc(2) Class268 local2 = this.aClass268_16;
		synchronized (this.aClass268_16) {
			this.aClass268_16.method6160();
		}
		local2 = this.aClass268_17;
		synchronized (this.aClass268_17) {
			this.aClass268_17.method6160();
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)Lclient!vr;")
	public Class261 method1552(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_16;
		@Pc(16) Class261 local16;
		synchronized (this.aClass268_16) {
			local16 = (Class261) this.aClass268_16.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_29;
		@Pc(42) byte[] local42;
		synchronized (this.aClass250_29) {
			local42 = this.aClass250_29.method5806(Static399.method2446(arg0), Static15.method315(arg0));
		}
		local16 = new Class261();
		local16.anInt7418 = arg0;
		local16.aClass59_4 = this;
		if (local42 != null) {
			local16.method6049(new Class3_Sub25(local42));
		}
		local16.method6047();
		@Pc(73) Class268 local73 = this.aClass268_16;
		synchronized (this.aClass268_16) {
			this.aClass268_16.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public void method1553() {
		@Pc(2) Class268 local2 = this.aClass268_16;
		synchronized (this.aClass268_16) {
			this.aClass268_16.method6168();
		}
		local2 = this.aClass268_17;
		synchronized (this.aClass268_17) {
			this.aClass268_17.method6168();
		}
	}
}
