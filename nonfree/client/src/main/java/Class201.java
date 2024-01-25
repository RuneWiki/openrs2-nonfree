import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class201 {

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
	public int anInt5753;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Lclient!wi;")
	private final Class268 aClass268_47 = new Class268(64);

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "Lclient!wi;")
	public final Class268 aClass268_48 = new Class268(30);

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Lclient!uu;")
	public final Class250 aClass250_85;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "Lclient!uu;")
	private final Class250 aClass250_86;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;Lclient!uu;)V")
	public Class201(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_85 = arg3;
		this.aClass250_86 = arg2;
		@Pc(26) int local26 = this.aClass250_86.method5819() - 1;
		this.aClass250_86.method5815(local26);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public void method4770() {
		@Pc(6) Class268 local6 = this.aClass268_47;
		synchronized (this.aClass268_47) {
			this.aClass268_47.method6160();
		}
		local6 = this.aClass268_48;
		synchronized (this.aClass268_48) {
			this.aClass268_48.method6160();
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public void method4771() {
		@Pc(2) Class268 local2 = this.aClass268_47;
		synchronized (this.aClass268_47) {
			this.aClass268_47.method6168();
		}
		local2 = this.aClass268_48;
		synchronized (this.aClass268_48) {
			this.aClass268_48.method6168();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	public void method4773(@OriginalArg(0) int arg0) {
		this.anInt5753 = arg0;
		@Pc(13) Class268 local13 = this.aClass268_48;
		synchronized (this.aClass268_48) {
			this.aClass268_48.method6160();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)Lclient!ds;")
	public Class52 method4775(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_47;
		@Pc(16) Class52 local16;
		synchronized (this.aClass268_47) {
			local16 = (Class52) this.aClass268_47.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class250 local37 = this.aClass250_86;
		@Pc(50) byte[] local50;
		synchronized (this.aClass250_86) {
			local50 = this.aClass250_86.method5806(Static276.method3809(arg0), Static404.method5525(arg0));
		}
		local16 = new Class52();
		local16.aClass201_1 = this;
		local16.anInt1392 = arg0;
		if (local50 != null) {
			local16.method1409(new Class3_Sub25(local50));
		}
		@Pc(78) Class268 local78 = this.aClass268_47;
		synchronized (this.aClass268_47) {
			this.aClass268_47.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)V")
	public void method4776() {
		@Pc(6) Class268 local6 = this.aClass268_47;
		synchronized (this.aClass268_47) {
			this.aClass268_47.method6173(5);
		}
		local6 = this.aClass268_48;
		synchronized (this.aClass268_48) {
			this.aClass268_48.method6173(5);
		}
	}
}
