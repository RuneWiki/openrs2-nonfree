import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class267 {

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "Lclient!ng;")
	private final Class167 aClass167_101 = new Class167(256);

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!ic;")
	private final Class113 aClass113_133;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class267(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_133 = arg2;
		this.aClass113_133.method2271(26);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	public void method5600() {
		@Pc(2) Class167 local2 = this.aClass167_101;
		synchronized (this.aClass167_101) {
			this.aClass167_101.method3384(5);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
	public void method5601() {
		@Pc(2) Class167 local2 = this.aClass167_101;
		synchronized (this.aClass167_101) {
			this.aClass167_101.method3390();
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)Lclient!ch;")
	public Class1_Sub3_Sub3 method5602(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_101;
		@Pc(16) Class1_Sub3_Sub3 local16;
		synchronized (this.aClass167_101) {
			local16 = (Class1_Sub3_Sub3) this.aClass167_101.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass113_133.method2274(26, arg0);
		local16 = new Class1_Sub3_Sub3();
		if (local38 != null) {
			local16.method731(new Class1_Sub11(local38));
		}
		@Pc(56) Class167 local56 = this.aClass167_101;
		synchronized (this.aClass167_101) {
			this.aClass167_101.method3392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public void method5605() {
		@Pc(11) Class167 local11 = this.aClass167_101;
		synchronized (this.aClass167_101) {
			this.aClass167_101.method3389();
		}
	}
}
