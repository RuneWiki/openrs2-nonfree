import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class107 {

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "Lclient!jn;")
	private final Class167 aClass167_8 = new Class167(64);

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Lclient!vo;")
	private final Class348 aClass348_35;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class107(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_35 = arg2;
		if (this.aClass348_35 != null) {
			this.aClass348_35.method7981(11);
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	public void method2501() {
		@Pc(8) Class167 local8 = this.aClass167_8;
		synchronized (this.aClass167_8) {
			this.aClass167_8.method3975();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	public void method2502() {
		@Pc(6) Class167 local6 = this.aClass167_8;
		synchronized (this.aClass167_8) {
			this.aClass167_8.method3964(5);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)Lclient!qfa;")
	public Class275 method2503(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_8;
		@Pc(16) Class275 local16;
		synchronized (this.aClass167_8) {
			local16 = (Class275) this.aClass167_8.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_35;
		@Pc(38) byte[] local38;
		synchronized (this.aClass348_35) {
			local38 = this.aClass348_35.method7964(arg0, 11);
		}
		local16 = new Class275();
		if (local38 != null) {
			local16.method6376(new Class4_Sub13(local38));
		}
		@Pc(66) Class167 local66 = this.aClass167_8;
		synchronized (this.aClass167_8) {
			this.aClass167_8.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public void method2504() {
		@Pc(6) Class167 local6 = this.aClass167_8;
		synchronized (this.aClass167_8) {
			this.aClass167_8.method3961();
		}
	}
}
