import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class60 {

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "Lclient!jn;")
	private Class167 aClass167_6 = new Class167(64);

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "Lclient!vo;")
	private final Class348 aClass348_27;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class60(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_27 = arg2;
		if (this.aClass348_27 != null) {
			@Pc(20) int local20 = this.aClass348_27.method7985() - 1;
			this.aClass348_27.method7981(local20);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public void method1596() {
		@Pc(6) Class167 local6 = this.aClass167_6;
		synchronized (this.aClass167_6) {
			this.aClass167_6.method3975();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BI)Lclient!ma;")
	public Class207 method1598(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_6;
		@Pc(16) Class207 local16;
		synchronized (this.aClass167_6) {
			local16 = (Class207) this.aClass167_6.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_27;
		@Pc(42) byte[] local42;
		synchronized (this.aClass348_27) {
			local42 = this.aClass348_27.method7964(Static372.method5572(arg0), Static546.method7656(arg0));
		}
		local16 = new Class207();
		if (local42 != null) {
			local16.method4907(new Class4_Sub13(local42));
		}
		@Pc(64) Class167 local64 = this.aClass167_6;
		synchronized (this.aClass167_6) {
			this.aClass167_6.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
	public void method1602() {
		@Pc(2) Class167 local2 = this.aClass167_6;
		synchronized (this.aClass167_6) {
			this.aClass167_6.method3961();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	public void method1603(@OriginalArg(0) int arg0) {
		@Pc(2) Class167 local2 = this.aClass167_6;
		synchronized (this.aClass167_6) {
			this.aClass167_6.method3961();
			this.aClass167_6 = new Class167(arg0);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)V")
	public void method1604() {
		@Pc(2) Class167 local2 = this.aClass167_6;
		synchronized (this.aClass167_6) {
			this.aClass167_6.method3964(5);
		}
	}
}
