import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class237 {

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!ad;")
	private final Class5 aClass5_54 = new Class5(64);

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Lclient!dn;")
	private final Class56 aClass56_85;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class237(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_85 = arg2;
		this.aClass56_85.method1373(32);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V")
	public void method5478() {
		@Pc(14) Class5 local14 = this.aClass5_54;
		synchronized (this.aClass5_54) {
			this.aClass5_54.method106(5);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Lclient!kn;")
	public Class137 method5479(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_54;
		@Pc(16) Class137 local16;
		synchronized (this.aClass5_54) {
			local16 = (Class137) this.aClass5_54.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass56_85.method1384(32, arg0);
		local16 = new Class137();
		if (local41 != null) {
			local16.method3442(new Class3_Sub2(local41));
		}
		@Pc(57) Class5 local57 = this.aClass5_54;
		synchronized (this.aClass5_54) {
			this.aClass5_54.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method5480() {
		@Pc(6) Class5 local6 = this.aClass5_54;
		synchronized (this.aClass5_54) {
			this.aClass5_54.method110();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public void method5481() {
		@Pc(2) Class5 local2 = this.aClass5_54;
		synchronized (this.aClass5_54) {
			this.aClass5_54.method116();
		}
	}
}
