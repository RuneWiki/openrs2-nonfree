import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class19 {

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Lclient!ff;")
	private final Class83 aClass83_3 = new Class83(64);

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!vh;")
	private final Class250 aClass250_6;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class19(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_6 = arg2;
		this.aClass250_6.method5653(5);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)Lclient!ak;")
	public Class1_Sub2_Sub2 method471(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_3;
		@Pc(16) Class1_Sub2_Sub2 local16;
		synchronized (this.aClass83_3) {
			local16 = (Class1_Sub2_Sub2) this.aClass83_3.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass250_6.method5667(arg0, 5);
		local16 = new Class1_Sub2_Sub2();
		if (local33 != null) {
			local16.method293(new Class1_Sub1(local33));
		}
		@Pc(55) Class83 local55 = this.aClass83_3;
		synchronized (this.aClass83_3) {
			this.aClass83_3.method1675((long) arg0, local16);
			return local16;
		}
	}
}
