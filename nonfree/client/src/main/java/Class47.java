import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class47 {

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!nj;")
	private final Class171 aClass171_5 = new Class171(128);

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "Lclient!mg;")
	private final Class160 aClass160_7;

	static {
		new Class209("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class47(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_7 = arg2;
		this.aClass160_7.method3722(1);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	public void method896() {
		@Pc(6) Class171 local6 = this.aClass171_5;
		synchronized (this.aClass171_5) {
			this.aClass171_5.method3933(5);
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V")
	public void method898() {
		@Pc(2) Class171 local2 = this.aClass171_5;
		synchronized (this.aClass171_5) {
			this.aClass171_5.method3934();
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)V")
	public void method899() {
		@Pc(10) Class171 local10 = this.aClass171_5;
		synchronized (this.aClass171_5) {
			this.aClass171_5.method3936();
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(IB)Lclient!wv;")
	public Class269 method901(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_5;
		@Pc(16) Class269 local16;
		synchronized (this.aClass171_5) {
			local16 = (Class269) this.aClass171_5.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass160_7.method3696(arg0, 1);
		local16 = new Class269();
		if (local38 != null) {
			local16.method5863(new Class2_Sub23(local38));
		}
		@Pc(54) Class171 local54 = this.aClass171_5;
		synchronized (this.aClass171_5) {
			this.aClass171_5.method3940((long) arg0, local16);
			return local16;
		}
	}
}
