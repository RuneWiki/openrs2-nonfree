import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class263 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Lclient!wm;")
	private final Class267 aClass267_83 = new Class267(128);

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!ph;")
	private final Class187 aClass187_127;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class263(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_127 = arg2;
		if (this.aClass187_127 != null) {
			@Pc(20) int local20 = this.aClass187_127.method4302() - 1;
			this.aClass187_127.method4306(local20);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lclient!am;")
	public Class12 method5783(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_83;
		@Pc(16) Class12 local16;
		synchronized (this.aClass267_83) {
			local16 = (Class12) this.aClass267_83.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass187_127.method4300(Static284.method4020(arg0), Static405.method5344(arg0));
		local16 = new Class12();
		if (local45 != null) {
			local16.method167(new Class10_Sub8(local45));
		}
		@Pc(61) Class267 local61 = this.aClass267_83;
		synchronized (this.aClass267_83) {
			this.aClass267_83.method6008(local16, (long) arg0);
			return local16;
		}
	}
}
