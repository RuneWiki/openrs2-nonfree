import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class174 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!tq;")
	private final Class340 aClass340_31 = new Class340(64);

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!wm;")
	private final Class390 aClass390_66;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!wm;")
	private final Class390 aClass390_65;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILclient!wm;Lclient!wm;)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_66 = arg2;
		this.aClass390_65 = arg1;
		if (this.aClass390_65 != null) {
			this.aClass390_65.method8913(0);
		}
		if (this.aClass390_66 != null) {
			this.aClass390_66.method8913(0);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!waa;")
	public Class5_Sub3_Sub21 method4246(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub3_Sub21 local11 = (Class5_Sub3_Sub21) this.aClass340_31.method7999((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass390_65.method8914(0, arg0);
		} else {
			local27 = this.aClass390_66.method8914(0, arg0 & 0x7FFF);
		}
		local11 = new Class5_Sub3_Sub21();
		if (local27 != null) {
			local11.method8690(new Class5_Sub41(local27));
		}
		if (arg0 >= 32768) {
			local11.method8693();
		}
		this.aClass340_31.method7986((long) arg0, local11);
		return local11;
	}
}
