import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class263 {

	@OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
	public int anInt7068;

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "Lclient!kh;")
	private final Class134 aClass134_57 = new Class134(64);

	@OriginalMember(owner = "client!vv", name = "q", descriptor = "Lclient!kh;")
	public final Class134 aClass134_58 = new Class134(30);

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "Lclient!ul;")
	private final Class246 aClass246_215;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "Lclient!ul;")
	public final Class246 aClass246_214;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;Lclient!ul;)V")
	public Class263(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_215 = arg2;
		this.aClass246_214 = arg3;
		@Pc(26) int local26 = this.aClass246_215.method5502() - 1;
		this.aClass246_215.method5492(local26);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
	public void method5776() {
		@Pc(2) Class134 local2 = this.aClass134_57;
		synchronized (this.aClass134_57) {
			this.aClass134_57.method3267();
		}
		local2 = this.aClass134_58;
		synchronized (this.aClass134_58) {
			this.aClass134_58.method3267();
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V")
	public void method5778() {
		@Pc(6) Class134 local6 = this.aClass134_57;
		synchronized (this.aClass134_57) {
			this.aClass134_57.method3270(5);
		}
		local6 = this.aClass134_58;
		synchronized (this.aClass134_58) {
			this.aClass134_58.method3270(5);
		}
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)V")
	public void method5779() {
		@Pc(6) Class134 local6 = this.aClass134_57;
		synchronized (this.aClass134_57) {
			this.aClass134_57.method3272();
		}
		local6 = this.aClass134_58;
		synchronized (this.aClass134_58) {
			this.aClass134_58.method3272();
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)Lclient!ci;")
	public Class38 method5782(@OriginalArg(0) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_57;
		@Pc(16) Class38 local16;
		synchronized (this.aClass134_57) {
			local16 = (Class38) this.aClass134_57.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_215;
		@Pc(42) byte[] local42;
		synchronized (this.aClass246_215) {
			local42 = this.aClass246_215.method5477(Static442.method5832(arg0), Static161.method2623(arg0));
		}
		local16 = new Class38();
		local16.aClass263_1 = this;
		local16.anInt1009 = arg0;
		if (local42 != null) {
			local16.method917(new Class1_Sub5(local42));
		}
		@Pc(78) Class134 local78 = this.aClass134_57;
		synchronized (this.aClass134_57) {
			this.aClass134_57.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)V")
	public void method5785(@OriginalArg(1) int arg0) {
		this.anInt7068 = arg0;
		@Pc(15) Class134 local15 = this.aClass134_58;
		synchronized (this.aClass134_58) {
			this.aClass134_58.method3272();
		}
	}
}
