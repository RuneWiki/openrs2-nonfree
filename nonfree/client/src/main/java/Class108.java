import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class108 {

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "Lclient!ng;")
	private final Class167 aClass167_44 = new Class167(64);

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "Lclient!ic;")
	private final Class113 aClass113_57;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class108(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_57 = arg2;
		if (this.aClass113_57 != null) {
			this.aClass113_57.method2271(35);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Lclient!pi;")
	public Class191 method2209(@OriginalArg(1) int arg0) {
		@Pc(11) Class167 local11 = this.aClass167_44;
		@Pc(21) Class191 local21;
		synchronized (this.aClass167_44) {
			local21 = (Class191) this.aClass167_44.method3386((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass113_57.method2274(35, arg0);
		local21 = new Class191();
		if (local38 != null) {
			local21.method4009(new Class1_Sub11(local38));
		}
		local21.method4007();
		@Pc(57) Class167 local57 = this.aClass167_44;
		synchronized (this.aClass167_44) {
			this.aClass167_44.method3392(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public void method2211() {
		@Pc(2) Class167 local2 = this.aClass167_44;
		synchronized (this.aClass167_44) {
			this.aClass167_44.method3390();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	public void method2212() {
		@Pc(10) Class167 local10 = this.aClass167_44;
		synchronized (this.aClass167_44) {
			this.aClass167_44.method3389();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
	public void method2213() {
		@Pc(2) Class167 local2 = this.aClass167_44;
		synchronized (this.aClass167_44) {
			this.aClass167_44.method3384(5);
		}
	}
}
