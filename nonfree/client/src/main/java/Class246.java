import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class246 {

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public int anInt6579;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!jk;")
	private final Class137 aClass137_54 = new Class137(64);

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Lclient!jk;")
	public final Class137 aClass137_55 = new Class137(30);

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!qn;")
	public final Class211 aClass211_89;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!qn;")
	private final Class211 aClass211_88;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;Lclient!qn;)V")
	public Class246(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_89 = arg3;
		this.aClass211_88 = arg2;
		@Pc(26) int local26 = this.aClass211_88.method4368() - 1;
		this.aClass211_88.method4365(local26);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
	public void method5322() {
		@Pc(6) Class137 local6 = this.aClass137_54;
		synchronized (this.aClass137_54) {
			this.aClass137_54.method2745(5);
		}
		local6 = this.aClass137_55;
		synchronized (this.aClass137_55) {
			this.aClass137_55.method2745(5);
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)Lclient!mj;")
	public Class172 method5323(@OriginalArg(1) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_54;
		@Pc(16) Class172 local16;
		synchronized (this.aClass137_54) {
			local16 = (Class172) this.aClass137_54.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_88;
		@Pc(42) byte[] local42;
		synchronized (this.aClass211_88) {
			local42 = this.aClass211_88.method4377(Static387.method5127(arg0), Static219.method2989(arg0));
		}
		local16 = new Class172();
		local16.aClass246_1 = this;
		local16.anInt4076 = arg0;
		if (local42 != null) {
			local16.method3243(new Class4_Sub9(local42));
		}
		@Pc(70) Class137 local70 = this.aClass137_54;
		synchronized (this.aClass137_54) {
			this.aClass137_54.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public void method5325() {
		@Pc(6) Class137 local6 = this.aClass137_54;
		synchronized (this.aClass137_54) {
			this.aClass137_54.method2739();
		}
		local6 = this.aClass137_55;
		synchronized (this.aClass137_55) {
			this.aClass137_55.method2739();
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)V")
	public void method5326(@OriginalArg(1) int arg0) {
		this.anInt6579 = arg0;
		@Pc(9) Class137 local9 = this.aClass137_55;
		synchronized (this.aClass137_55) {
			this.aClass137_55.method2739();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public void method5327() {
		@Pc(6) Class137 local6 = this.aClass137_54;
		synchronized (this.aClass137_54) {
			this.aClass137_54.method2737();
		}
		local6 = this.aClass137_55;
		synchronized (this.aClass137_55) {
			this.aClass137_55.method2737();
		}
	}
}
