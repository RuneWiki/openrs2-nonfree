import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class129 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	public int anInt3245 = 0;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	public int anInt3251 = 0;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Lclient!rp;")
	private final Class220 aClass220_25 = new Class220(64);

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Lclient!hm;")
	private Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Lclient!lt;")
	private final Class158 aClass158_40;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!lt;")
	private final Class158 aClass158_41;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(ILclient!lt;Lclient!lt;Lclient!hm;)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) Interface6 arg3) {
		this.anInterface6_1 = arg3;
		this.aClass158_40 = arg2;
		this.aClass158_41 = arg1;
		if (this.aClass158_41 != null) {
			this.anInt3251 = this.aClass158_41.method3683(1);
		}
		if (this.aClass158_40 != null) {
			this.anInt3245 = this.aClass158_40.method3683(1);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!hi;I[IJ)Ljava/lang/String;")
	public String method2906(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface6_1 != null) {
			@Pc(24) String local24 = this.anInterface6_1.method4094(arg2, arg0, arg1);
			if (local24 != null) {
				return local24;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lclient!dq;")
	public Class6_Sub1_Sub6 method2908(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub1_Sub6 local11 = (Class6_Sub1_Sub6) this.aClass220_25.method4990((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass158_40.method3672(arg0 & 0x7FFF, 1);
		} else {
			local27 = this.aClass158_41.method3672(arg0, 1);
		}
		local11 = new Class6_Sub1_Sub6();
		local11.aClass129_1 = this;
		if (local27 != null) {
			local11.method1437(new Class6_Sub15(local27));
		}
		if (arg0 >= 32768) {
			local11.method1432();
		}
		this.aClass220_25.method4996(local11, (long) arg0);
		return local11;
	}
}
