import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class331 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!lga;")
	private final Class207 aClass207_56 = new Class207(64);

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!sea;")
	private final Class308 aClass308_178;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	public final int anInt8963;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class331(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_178 = arg2;
		this.anInt8963 = this.aClass308_178.method6568(19);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(BI)Lclient!bo;")
	public Class29 method7271(@OriginalArg(1) int arg0) {
		@Pc(11) Class207 local11 = this.aClass207_56;
		@Pc(21) Class29 local21;
		synchronized (this.aClass207_56) {
			local21 = (Class29) this.aClass207_56.method4390((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class308 local34 = this.aClass308_178;
		@Pc(43) byte[] local43;
		synchronized (this.aClass308_178) {
			local43 = this.aClass308_178.method6569(19, arg0);
		}
		local21 = new Class29();
		if (local43 != null) {
			local21.method758(new Class1_Sub3(local43));
		}
		@Pc(65) Class207 local65 = this.aClass207_56;
		synchronized (this.aClass207_56) {
			this.aClass207_56.method4391((long) arg0, local21);
			return local21;
		}
	}
}
