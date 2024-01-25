import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class47 {

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "Lclient!jn;")
	private final Class167 aClass167_4 = new Class167(256);

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "Lclient!vo;")
	private final Class348 aClass348_24;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class47(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_24 = arg2;
		this.aClass348_24.method7981(26);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
	public void method1271() {
		@Pc(6) Class167 local6 = this.aClass167_4;
		synchronized (this.aClass167_4) {
			this.aClass167_4.method3975();
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BI)V")
	public void method1275() {
		@Pc(11) Class167 local11 = this.aClass167_4;
		synchronized (this.aClass167_4) {
			this.aClass167_4.method3964(5);
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IB)Lclient!oaa;")
	public Class4_Sub6_Sub15 method1276(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_4;
		@Pc(18) Class4_Sub6_Sub15 local18;
		synchronized (this.aClass167_4) {
			local18 = (Class4_Sub6_Sub15) this.aClass167_4.method3966((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class348 local31 = this.aClass348_24;
		@Pc(42) byte[] local42;
		synchronized (this.aClass348_24) {
			local42 = this.aClass348_24.method7964(arg0, 26);
		}
		local18 = new Class4_Sub6_Sub15();
		if (local42 != null) {
			local18.method5528(new Class4_Sub13(local42));
		}
		@Pc(69) Class167 local69 = this.aClass167_4;
		synchronized (this.aClass167_4) {
			this.aClass167_4.method3974((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	public void method1277() {
		@Pc(2) Class167 local2 = this.aClass167_4;
		synchronized (this.aClass167_4) {
			this.aClass167_4.method3961();
		}
	}
}
