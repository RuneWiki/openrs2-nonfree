import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class252 {

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Lclient!ad;")
	private final Class5 aClass5_61 = new Class5(128);

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!dn;")
	private final Class56 aClass56_91;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class252(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_91 = arg2;
		this.aClass56_91.method1373(1);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)V")
	public void method5692() {
		@Pc(6) Class5 local6 = this.aClass5_61;
		synchronized (this.aClass5_61) {
			this.aClass5_61.method106(5);
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public void method5693() {
		@Pc(6) Class5 local6 = this.aClass5_61;
		synchronized (this.aClass5_61) {
			this.aClass5_61.method110();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public void method5694() {
		@Pc(6) Class5 local6 = this.aClass5_61;
		synchronized (this.aClass5_61) {
			this.aClass5_61.method116();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lclient!uv;")
	public Class243 method5695(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_61;
		@Pc(16) Class243 local16;
		synchronized (this.aClass5_61) {
			local16 = (Class243) this.aClass5_61.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass56_91.method1384(1, arg0);
		local16 = new Class243();
		if (local33 != null) {
			local16.method5564(new Class3_Sub2(local33));
		}
		@Pc(54) Class5 local54 = this.aClass5_61;
		synchronized (this.aClass5_61) {
			this.aClass5_61.method114((long) arg0, local16);
			return local16;
		}
	}
}
