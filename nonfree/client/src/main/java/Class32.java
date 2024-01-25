import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class32 {

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "Lclient!gw;")
	private final Class136 aClass136_10 = new Class136(64);

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
	public int anInt777 = 0;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Lclient!uu;")
	private final Class343 aClass343_32;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
	public final int anInt771;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class32(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_32 = arg2;
		this.anInt771 = this.aClass343_32.method8157(4);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
	public void method744() {
		@Pc(6) Class136 local6 = this.aClass136_10;
		synchronized (this.aClass136_10) {
			this.aClass136_10.method3132(5);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	public void method745() {
		@Pc(2) Class136 local2 = this.aClass136_10;
		synchronized (this.aClass136_10) {
			this.aClass136_10.method3142();
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	public void method746() {
		@Pc(11) Class136 local11 = this.aClass136_10;
		synchronized (this.aClass136_10) {
			this.aClass136_10.method3138();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)Lclient!be;")
	public Class27 method747(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_10;
		@Pc(16) Class27 local16;
		synchronized (this.aClass136_10) {
			local16 = (Class27) this.aClass136_10.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class343 local34 = this.aClass343_32;
		@Pc(43) byte[] local43;
		synchronized (this.aClass343_32) {
			local43 = this.aClass343_32.method8132(4, arg0);
		}
		local16 = new Class27();
		local16.anInt540 = arg0;
		local16.aClass32_1 = this;
		if (local43 != null) {
			local16.method500(new Class3_Sub9(local43));
		}
		local16.method499();
		@Pc(74) Class136 local74 = this.aClass136_10;
		synchronized (this.aClass136_10) {
			this.aClass136_10.method3135(local16, (long) arg0);
			return local16;
		}
	}
}
