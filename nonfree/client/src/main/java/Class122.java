import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class122 {

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "Lclient!oo;")
	private final Class264 aClass264_24 = new Class264(64);

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "Lclient!wia;")
	private final Class386 aClass386_46;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "Lclient!wia;")
	private final Class386 aClass386_45;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(ILclient!wia;Lclient!wia;)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_46 = arg1;
		this.aClass386_45 = arg2;
		if (this.aClass386_46 != null) {
			this.aClass386_46.method9210(0);
		}
		if (this.aClass386_45 != null) {
			this.aClass386_45.method9210(0);
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI)Lclient!uj;")
	public Class14_Sub3_Sub18 method2909(@OriginalArg(1) int arg0) {
		@Pc(11) Class14_Sub3_Sub18 local11 = (Class14_Sub3_Sub18) this.aClass264_24.method6367((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(33) byte[] local33;
		if (arg0 >= 32768) {
			local33 = this.aClass386_45.method9196(arg0 & 0x7FFF, 0);
		} else {
			local33 = this.aClass386_46.method9196(arg0, 0);
		}
		local11 = new Class14_Sub3_Sub18();
		if (local33 != null) {
			local11.method8511(new Class14_Sub29(local33));
		}
		if (arg0 >= 32768) {
			local11.method8506();
		}
		this.aClass264_24.method6364((long) arg0, local11);
		return local11;
	}
}
