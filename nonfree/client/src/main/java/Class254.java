import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class254 {

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Lclient!ad;")
	private final Class5 aClass5_62 = new Class5(256);

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "Lclient!dn;")
	private final Class56 aClass56_92;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class254(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_92 = arg2;
		this.aClass56_92.method1373(26);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public void method5743() {
		@Pc(2) Class5 local2 = this.aClass5_62;
		synchronized (this.aClass5_62) {
			this.aClass5_62.method110();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public void method5744() {
		@Pc(2) Class5 local2 = this.aClass5_62;
		synchronized (this.aClass5_62) {
			this.aClass5_62.method106(5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V")
	public void method5747() {
		@Pc(2) Class5 local2 = this.aClass5_62;
		synchronized (this.aClass5_62) {
			this.aClass5_62.method116();
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)Lclient!ih;")
	public Class3_Sub3_Sub12 method5748(@OriginalArg(0) int arg0) {
		@Pc(13) Class5 local13 = this.aClass5_62;
		@Pc(23) Class3_Sub3_Sub12 local23;
		synchronized (this.aClass5_62) {
			local23 = (Class3_Sub3_Sub12) this.aClass5_62.method104((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(40) byte[] local40 = this.aClass56_92.method1384(26, arg0);
		local23 = new Class3_Sub3_Sub12();
		if (local40 != null) {
			local23.method2967(new Class3_Sub2(local40));
		}
		@Pc(56) Class5 local56 = this.aClass5_62;
		synchronized (this.aClass5_62) {
			this.aClass5_62.method114((long) arg0, local23);
			return local23;
		}
	}
}
