import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class325 {

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "Lclient!wq;")
	private final Class391 aClass391_56 = new Class391(64);

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Lclient!la;")
	private final Class208 aClass208_127;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!kca;")
	public final Class196 aClass196_2;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!to;ILclient!la;Lclient!kca;)V")
	public Class325(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Class196 arg3) {
		this.aClass208_127 = arg2;
		this.aClass208_127.method5005(32);
		this.aClass196_2 = arg3;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)V")
	public void method7978() {
		@Pc(2) Class391 local2 = this.aClass391_56;
		synchronized (this.aClass391_56) {
			this.aClass391_56.method9274(5);
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)Lclient!eea;")
	public Class101 method7979(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_56;
		@Pc(16) Class101 local16;
		synchronized (this.aClass391_56) {
			local16 = (Class101) this.aClass391_56.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_127;
		@Pc(47) byte[] local47;
		synchronized (this.aClass208_127) {
			local47 = this.aClass208_127.method4991(32, arg0, -119);
		}
		local16 = new Class101();
		local16.aClass325_1 = this;
		if (local47 != null) {
			local16.method1909(new Class5_Sub23(local47));
		}
		@Pc(76) Class391 local76 = this.aClass391_56;
		synchronized (this.aClass391_56) {
			this.aClass391_56.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
	public void method7981(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_56;
		synchronized (this.aClass391_56) {
			if (arg0 >= -78) {
				Static549.method7980(48, false, (Class8_Sub1_Sub3_Sub2_Sub2) null);
			}
			this.aClass391_56.method9276(0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V")
	public void method7984() {
		@Pc(6) Class391 local6 = this.aClass391_56;
		synchronized (this.aClass391_56) {
			this.aClass391_56.method9286();
		}
	}
}
