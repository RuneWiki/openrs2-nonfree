import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class174 {

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "Lclient!ng;")
	private final Class167 aClass167_65 = new Class167(64);

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "Lclient!ic;")
	private final Class113 aClass113_85;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class174(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_85 = arg2;
		this.aClass113_85.method2271(32);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Lclient!di;")
	public Class51 method3490(@OriginalArg(0) int arg0) {
		@Pc(11) Class167 local11 = this.aClass167_65;
		@Pc(21) Class51 local21;
		synchronized (this.aClass167_65) {
			local21 = (Class51) this.aClass167_65.method3386((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass113_85.method2274(32, arg0);
		local21 = new Class51();
		if (local38 != null) {
			local21.method1123(new Class1_Sub11(local38));
		}
		@Pc(54) Class167 local54 = this.aClass167_65;
		synchronized (this.aClass167_65) {
			this.aClass167_65.method3392(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)V")
	public void method3493() {
		@Pc(10) Class167 local10 = this.aClass167_65;
		synchronized (this.aClass167_65) {
			this.aClass167_65.method3389();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public void method3494() {
		@Pc(10) Class167 local10 = this.aClass167_65;
		synchronized (this.aClass167_65) {
			this.aClass167_65.method3390();
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)V")
	public void method3495() {
		@Pc(2) Class167 local2 = this.aClass167_65;
		synchronized (this.aClass167_65) {
			this.aClass167_65.method3384(5);
		}
	}
}
