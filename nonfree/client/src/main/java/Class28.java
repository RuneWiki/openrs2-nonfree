import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class28 {

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Lclient!ng;")
	private final Class167 aClass167_13 = new Class167(64);

	@OriginalMember(owner = "client!br", name = "m", descriptor = "I")
	public int anInt713 = 0;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "Lclient!ic;")
	private final Class113 aClass113_14;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "I")
	public final int anInt711;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class28(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_14 = arg2;
		this.anInt711 = this.aClass113_14.method2271(4);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	public void method610() {
		@Pc(6) Class167 local6 = this.aClass167_13;
		synchronized (this.aClass167_13) {
			this.aClass167_13.method3390();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public void method614() {
		@Pc(2) Class167 local2 = this.aClass167_13;
		synchronized (this.aClass167_13) {
			this.aClass167_13.method3389();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Lclient!wc;")
	public Class258 method615(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_13;
		@Pc(16) Class258 local16;
		synchronized (this.aClass167_13) {
			local16 = (Class258) this.aClass167_13.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass113_14.method2274(4, arg0);
		local16 = new Class258();
		local16.anInt7303 = arg0;
		local16.aClass28_8 = this;
		if (local41 != null) {
			local16.method5516(new Class1_Sub11(local41));
		}
		local16.method5514();
		@Pc(66) Class167 local66 = this.aClass167_13;
		synchronized (this.aClass167_13) {
			this.aClass167_13.method3392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V")
	public void method617() {
		@Pc(6) Class167 local6 = this.aClass167_13;
		synchronized (this.aClass167_13) {
			this.aClass167_13.method3384(5);
		}
	}
}
