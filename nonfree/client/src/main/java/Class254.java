import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class254 {

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!jv;")
	private final Class126 aClass126_60 = new Class126(64);

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!bu;")
	private final Class32 aClass32_86;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	public final int anInt6889;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class254(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_86 = arg2;
		this.anInt6889 = this.aClass32_86.method790(19);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lclient!em;")
	public Class65 method5382(@OriginalArg(1) int arg0) {
		@Pc(14) Class126 local14 = this.aClass126_60;
		@Pc(24) Class65 local24;
		synchronized (this.aClass126_60) {
			local24 = (Class65) this.aClass126_60.method3141((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass32_86.method785(arg0, 19);
		local24 = new Class65();
		if (local41 != null) {
			local24.method1688(new Class3_Sub7(local41));
		}
		@Pc(57) Class126 local57 = this.aClass126_60;
		synchronized (this.aClass126_60) {
			this.aClass126_60.method3132((long) arg0, local24);
			return local24;
		}
	}
}
