import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class38 {

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!jv;")
	private final Class126 aClass126_10 = new Class126(64);

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!bu;")
	private final Class32 aClass32_19;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!bu;")
	private final Class32 aClass32_18;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(ILclient!bu;Lclient!bu;)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_19 = arg2;
		this.aClass32_18 = arg1;
		if (this.aClass32_18 != null) {
			this.aClass32_18.method790(0);
		}
		if (this.aClass32_19 != null) {
			this.aClass32_19.method790(0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)Lclient!rg;")
	public Class3_Sub4_Sub13 method866(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub4_Sub13 local11 = (Class3_Sub4_Sub13) this.aClass126_10.method3141((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(31) byte[] local31;
		if (arg0 >= 32768) {
			local31 = this.aClass32_19.method785(arg0 & 0x7FFF, 0);
		} else {
			local31 = this.aClass32_18.method785(arg0, 0);
		}
		local11 = new Class3_Sub4_Sub13();
		if (local31 != null) {
			local11.method4604(new Class3_Sub7(local31));
		}
		if (arg0 >= 32768) {
			local11.method4608();
		}
		this.aClass126_10.method3132((long) arg0, local11);
		return local11;
	}
}
