import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class248 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "Lclient!si;")
	private Class338 aClass338_39 = new Class338(64);

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "Lclient!lb;")
	private final Class221 aClass221_118;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class248(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_118 = arg2;
		if (this.aClass221_118 != null) {
			@Pc(20) int local20 = this.aClass221_118.method5080() - 1;
			this.aClass221_118.method5065(local20);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)V")
	public void method6078(@OriginalArg(0) int arg0) {
		@Pc(2) Class338 local2 = this.aClass338_39;
		synchronized (this.aClass338_39) {
			this.aClass338_39.method8051();
			this.aClass338_39 = new Class338(arg0);
		}
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
	public void method6080() {
		@Pc(6) Class338 local6 = this.aClass338_39;
		synchronized (this.aClass338_39) {
			this.aClass338_39.method8051();
		}
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(II)Lclient!sq;")
	public Class345 method6082(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_39;
		@Pc(16) Class345 local16;
		synchronized (this.aClass338_39) {
			local16 = (Class345) this.aClass338_39.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class221 local38 = this.aClass221_118;
		@Pc(51) byte[] local51;
		synchronized (this.aClass221_118) {
			local51 = this.aClass221_118.method5089(Static611.method7557(arg0), Static254.method3964(arg0));
		}
		local16 = new Class345();
		if (local51 != null) {
			local16.method8160(new Class3_Sub28(local51));
		}
		@Pc(75) Class338 local75 = this.aClass338_39;
		synchronized (this.aClass338_39) {
			this.aClass338_39.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V")
	public void method6083() {
		@Pc(6) Class338 local6 = this.aClass338_39;
		synchronized (this.aClass338_39) {
			this.aClass338_39.method8047();
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(II)V")
	public void method6084() {
		@Pc(6) Class338 local6 = this.aClass338_39;
		synchronized (this.aClass338_39) {
			this.aClass338_39.method8052(5);
		}
	}
}
