import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class249 {

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_64 = new Class307(64);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!ik;")
	private final Class182 aClass182_84;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!ik;")
	private final Class182 aClass182_85;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(ILclient!ik;Lclient!ik;)V")
	public Class249(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_84 = arg2;
		this.aClass182_85 = arg1;
		if (this.aClass182_85 != null) {
			this.aClass182_85.method3970(0);
		}
		if (this.aClass182_84 != null) {
			this.aClass182_84.method3970(0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Lclient!baa;")
	public Class3_Sub7_Sub2 method5448(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub7_Sub2 local11 = (Class3_Sub7_Sub2) this.aClass307_64.method7002((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(37) byte[] local37;
		if (arg0 >= 32768) {
			local37 = this.aClass182_84.method3985(arg0 & 0x7FFF, 0);
		} else {
			local37 = this.aClass182_85.method3985(arg0, 0);
		}
		local11 = new Class3_Sub7_Sub2();
		if (local37 != null) {
			local11.method1093(new Class3_Sub2(local37));
		}
		if (arg0 >= 32768) {
			local11.method1089();
		}
		this.aClass307_64.method7000(local11, (long) arg0);
		return local11;
	}
}
