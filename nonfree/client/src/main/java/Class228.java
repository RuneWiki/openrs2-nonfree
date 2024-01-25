import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class228 {

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "Lclient!ng;")
	private final Class167 aClass167_86 = new Class167(64);

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "Lclient!ic;")
	private final Class113 aClass113_113;

	static {
		new Class151("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class228(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_113 = arg2;
		this.aClass113_113.method2271(5);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(IZ)Lclient!pt;")
	public Class1_Sub3_Sub14 method4845(@OriginalArg(0) int arg0) {
		@Pc(11) Class167 local11 = this.aClass167_86;
		@Pc(21) Class1_Sub3_Sub14 local21;
		synchronized (this.aClass167_86) {
			local21 = (Class1_Sub3_Sub14) this.aClass167_86.method3386((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass113_113.method2274(5, arg0);
		local21 = new Class1_Sub3_Sub14();
		if (local38 != null) {
			local21.method4100(new Class1_Sub11(local38));
		}
		@Pc(54) Class167 local54 = this.aClass167_86;
		synchronized (this.aClass167_86) {
			this.aClass167_86.method3392(local21, (long) arg0);
			return local21;
		}
	}
}
