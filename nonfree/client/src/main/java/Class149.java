import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class149 {

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
	public int anInt4278;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Z")
	public boolean aBoolean311 = false;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!wi;")
	private Class268 aClass268_35 = new Class268(64);

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!wi;")
	public final Class268 aClass268_36 = new Class268(500);

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!wi;")
	public final Class268 aClass268_37 = new Class268(30);

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Lclient!wi;")
	public final Class268 aClass268_38 = new Class268(50);

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Z")
	public boolean aBoolean310;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!uu;")
	private final Class250 aClass250_65;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Lclient!uu;")
	public final Class250 aClass250_64;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!iv;IZLclient!uu;Lclient!uu;)V")
	public Class149(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class250 arg3, @OriginalArg(4) Class250 arg4) {
		this.aBoolean310 = arg2;
		this.aClass250_65 = arg3;
		this.aClass250_64 = arg4;
		if (this.aClass250_65 != null) {
			@Pc(47) int local47 = this.aClass250_65.method5819() - 1;
			this.aClass250_65.method5815(local47);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
	public void method3568(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean311) {
			this.aBoolean311 = arg0;
			this.method3575();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)V")
	public void method3570(@OriginalArg(1) int arg0) {
		this.aClass268_35 = new Class268(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public void method3572() {
		@Pc(6) Class268 local6 = this.aClass268_35;
		synchronized (this.aClass268_35) {
			this.aClass268_35.method6168();
		}
		local6 = this.aClass268_36;
		synchronized (this.aClass268_36) {
			this.aClass268_36.method6168();
		}
		local6 = this.aClass268_37;
		synchronized (this.aClass268_37) {
			this.aClass268_37.method6168();
		}
		local6 = this.aClass268_38;
		synchronized (this.aClass268_38) {
			this.aClass268_38.method6168();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)Lclient!cd;")
	public Class31 method3573(@OriginalArg(0) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_35;
		@Pc(16) Class31 local16;
		synchronized (this.aClass268_35) {
			local16 = (Class31) this.aClass268_35.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_65;
		@Pc(42) byte[] local42;
		synchronized (this.aClass250_65) {
			local42 = this.aClass250_65.method5806(Static381.method5286(arg0), Static96.method1665(arg0));
		}
		local16 = new Class31();
		local16.anInt791 = arg0;
		local16.aClass149_4 = this;
		if (local42 != null) {
			local16.method870(new Class3_Sub25(local42));
		}
		local16.method869();
		if (local16.aBoolean44) {
			local16.aBoolean52 = false;
			local16.anInt776 = 0;
		}
		if (!this.aBoolean310 && local16.aBoolean47) {
			local16.aStringArray6 = null;
			local16.anIntArray43 = null;
		}
		@Pc(102) Class268 local102 = this.aClass268_35;
		synchronized (this.aClass268_35) {
			this.aClass268_35.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IZ)V")
	public void method3574(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean310 != arg0) {
			this.aBoolean310 = arg0;
			this.method3575();
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public void method3575() {
		@Pc(10) Class268 local10 = this.aClass268_35;
		synchronized (this.aClass268_35) {
			this.aClass268_35.method6160();
		}
		local10 = this.aClass268_36;
		synchronized (this.aClass268_36) {
			this.aClass268_36.method6160();
		}
		local10 = this.aClass268_37;
		synchronized (this.aClass268_37) {
			this.aClass268_37.method6160();
		}
		local10 = this.aClass268_38;
		synchronized (this.aClass268_38) {
			this.aClass268_38.method6160();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public void method3576(@OriginalArg(1) int arg0) {
		this.anInt4278 = arg0;
		@Pc(9) Class268 local9 = this.aClass268_36;
		synchronized (this.aClass268_36) {
			this.aClass268_36.method6160();
		}
		local9 = this.aClass268_37;
		synchronized (this.aClass268_37) {
			this.aClass268_37.method6160();
		}
		local9 = this.aClass268_38;
		synchronized (this.aClass268_38) {
			this.aClass268_38.method6160();
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(ZI)V")
	public void method3577() {
		@Pc(2) Class268 local2 = this.aClass268_35;
		synchronized (this.aClass268_35) {
			this.aClass268_35.method6173(5);
		}
		local2 = this.aClass268_36;
		synchronized (this.aClass268_36) {
			this.aClass268_36.method6173(5);
		}
		local2 = this.aClass268_37;
		synchronized (this.aClass268_37) {
			this.aClass268_37.method6173(5);
		}
		local2 = this.aClass268_38;
		synchronized (this.aClass268_38) {
			this.aClass268_38.method6173(5);
		}
	}
}
