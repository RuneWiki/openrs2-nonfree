import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uia")
public final class Class350 {

	@OriginalMember(owner = "client!uia", name = "i", descriptor = "Lclient!wq;")
	private final Class391 aClass391_61 = new Class391(64);

	@OriginalMember(owner = "client!uia", name = "j", descriptor = "Lclient!wq;")
	public final Class391 aClass391_62 = new Class391(2);

	@OriginalMember(owner = "client!uia", name = "h", descriptor = "Lclient!la;")
	private final Class208 aClass208_135;

	@OriginalMember(owner = "client!uia", name = "f", descriptor = "Lclient!la;")
	public final Class208 aClass208_136;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lclient!to;ILclient!la;Lclient!la;)V")
	public Class350(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Class208 arg3) {
		this.aClass208_135 = arg2;
		this.aClass208_136 = arg3;
		this.aClass208_135.method5005(33);
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IZ)Lclient!ad;")
	public Class6 method8665(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_61;
		@Pc(16) Class6 local16;
		synchronized (this.aClass391_61) {
			local16 = (Class6) this.aClass391_61.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_135;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_135) {
			local39 = this.aClass208_135.method4991(33, arg0, 14);
		}
		local16 = new Class6();
		local16.aClass350_1 = this;
		if (local39 != null) {
			local16.method92(new Class5_Sub23(local39));
		}
		@Pc(66) Class391 local66 = this.aClass391_61;
		synchronized (this.aClass391_61) {
			this.aClass391_61.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(B)V")
	public void method8666() {
		@Pc(6) Class391 local6 = this.aClass391_61;
		synchronized (this.aClass391_61) {
			this.aClass391_61.method9276(0);
		}
		local6 = this.aClass391_62;
		synchronized (this.aClass391_62) {
			this.aClass391_62.method9276(0);
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)V")
	public void method8668() {
		@Pc(2) Class391 local2 = this.aClass391_61;
		synchronized (this.aClass391_61) {
			this.aClass391_61.method9274(5);
		}
		local2 = this.aClass391_62;
		synchronized (this.aClass391_62) {
			this.aClass391_62.method9274(5);
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V")
	public void method8669() {
		@Pc(6) Class391 local6 = this.aClass391_61;
		synchronized (this.aClass391_61) {
			this.aClass391_61.method9286();
		}
		local6 = this.aClass391_62;
		synchronized (this.aClass391_62) {
			this.aClass391_62.method9286();
		}
	}
}
