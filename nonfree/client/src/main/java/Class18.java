import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class18 {

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!ng;")
	private final Class167 aClass167_4 = new Class167(128);

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!ic;")
	private final Class113 aClass113_9;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class18(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_9 = arg2;
		this.aClass113_9.method2271(1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public void method389() {
		@Pc(2) Class167 local2 = this.aClass167_4;
		synchronized (this.aClass167_4) {
			this.aClass167_4.method3390();
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public void method390() {
		@Pc(2) Class167 local2 = this.aClass167_4;
		synchronized (this.aClass167_4) {
			this.aClass167_4.method3389();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public void method391() {
		@Pc(6) Class167 local6 = this.aClass167_4;
		synchronized (this.aClass167_4) {
			this.aClass167_4.method3384(5);
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Lclient!ev;")
	public Class73 method392(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_4;
		@Pc(16) Class73 local16;
		synchronized (this.aClass167_4) {
			local16 = (Class73) this.aClass167_4.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass113_9.method2274(1, arg0);
		local16 = new Class73();
		if (local33 != null) {
			local16.method1484(new Class1_Sub11(local33));
		}
		@Pc(57) Class167 local57 = this.aClass167_4;
		synchronized (this.aClass167_4) {
			this.aClass167_4.method3392(local16, (long) arg0);
			return local16;
		}
	}
}
