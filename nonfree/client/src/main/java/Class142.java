import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class142 {

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!jv;")
	private final Class126 aClass126_27 = new Class126(64);

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!bu;")
	private final Class32 aClass32_51;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class142(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_51 = arg2;
		this.aClass32_51.method790(5);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Lclient!bv;")
	public Class3_Sub4_Sub3 method3379(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_27;
		@Pc(16) Class3_Sub4_Sub3 local16;
		synchronized (this.aClass126_27) {
			local16 = (Class3_Sub4_Sub3) this.aClass126_27.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass32_51.method785(arg0, 5);
		local16 = new Class3_Sub4_Sub3();
		if (local39 != null) {
			local16.method827(new Class3_Sub7(local39));
		}
		@Pc(55) Class126 local55 = this.aClass126_27;
		synchronized (this.aClass126_27) {
			this.aClass126_27.method3132((long) arg0, local16);
			return local16;
		}
	}
}
