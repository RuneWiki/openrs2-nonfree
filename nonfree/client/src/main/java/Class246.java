import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class246 {

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "Lclient!ad;")
	private final Class5 aClass5_57 = new Class5(64);

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!dn;")
	private final Class56 aClass56_86;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class246(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_86 = arg2;
		this.aClass56_86.method1373(31);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public void method5626() {
		@Pc(6) Class5 local6 = this.aClass5_57;
		synchronized (this.aClass5_57) {
			this.aClass5_57.method116();
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	public void method5627() {
		@Pc(14) Class5 local14 = this.aClass5_57;
		synchronized (this.aClass5_57) {
			this.aClass5_57.method110();
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V")
	public void method5630() {
		@Pc(11) Class5 local11 = this.aClass5_57;
		synchronized (this.aClass5_57) {
			this.aClass5_57.method106(5);
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)Lclient!tt;")
	public Class228 method5631(@OriginalArg(1) int arg0) {
		@Pc(11) Class5 local11 = this.aClass5_57;
		@Pc(21) Class228 local21;
		synchronized (this.aClass5_57) {
			local21 = (Class228) this.aClass5_57.method104((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass56_86.method1384(31, arg0);
		local21 = new Class228();
		if (local38 != null) {
			local21.method5313(new Class3_Sub2(local38));
		}
		@Pc(54) Class5 local54 = this.aClass5_57;
		synchronized (this.aClass5_57) {
			this.aClass5_57.method114((long) arg0, local21);
			return local21;
		}
	}
}
