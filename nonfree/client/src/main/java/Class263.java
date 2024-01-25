import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class263 {

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "Lclient!iha;")
	private final Class168 aClass168_61 = new Class168(64);

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "Lclient!gda;")
	private final Class126 aClass126_190;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "Lclient!gda;")
	private final Class126 aClass126_191;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(ILclient!gda;Lclient!gda;)V")
	public Class263(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_190 = arg2;
		this.aClass126_191 = arg1;
		if (this.aClass126_191 != null) {
			this.aClass126_191.method3062(0);
		}
		if (this.aClass126_190 != null) {
			this.aClass126_190.method3062(0);
		}
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(II)Lclient!bda;")
	public Class5_Sub1_Sub2 method6099(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub1_Sub2 local11 = (Class5_Sub1_Sub2) this.aClass168_61.method3860((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(26) byte[] local26;
		if (arg0 < 32768) {
			local26 = this.aClass126_191.method3086(arg0, 0);
		} else {
			local26 = this.aClass126_190.method3086(arg0 & 0x7FFF, 0);
		}
		local11 = new Class5_Sub1_Sub2();
		if (local26 != null) {
			local11.method536(new Class5_Sub36(local26));
		}
		if (arg0 >= 32768) {
			local11.method532();
		}
		this.aClass168_61.method3853((long) arg0, local11);
		return local11;
	}
}
