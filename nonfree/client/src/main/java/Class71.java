import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class71 {

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "Lclient!co;")
	private final Class41 aClass41_23 = new Class41(64);

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "Lclient!g;")
	private final Class83 aClass83_43;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
	public final int anInt1975;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class71(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_43 = arg2;
		this.anInt1975 = this.aClass83_43.method1955(19);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)Lclient!rr;")
	public Class205 method1558(@OriginalArg(0) int arg0) {
		@Pc(15) Class41 local15 = this.aClass41_23;
		@Pc(25) Class205 local25;
		synchronized (this.aClass41_23) {
			local25 = (Class205) this.aClass41_23.method823((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(42) byte[] local42 = this.aClass83_43.method1968(arg0, 19);
		local25 = new Class205();
		if (local42 != null) {
			local25.method5035(new Class2_Sub24(local42));
		}
		@Pc(58) Class41 local58 = this.aClass41_23;
		synchronized (this.aClass41_23) {
			this.aClass41_23.method832((long) arg0, local25);
			return local25;
		}
	}
}
