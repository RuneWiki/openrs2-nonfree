import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class338 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "Lclient!jn;")
	private final Class167 aClass167_62 = new Class167(64);

	@OriginalMember(owner = "client!vba", name = "l", descriptor = "Lclient!jn;")
	public final Class167 aClass167_63 = new Class167(2);

	@OriginalMember(owner = "client!vba", name = "j", descriptor = "Lclient!vo;")
	private final Class348 aClass348_123;

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "Lclient!vo;")
	public final Class348 aClass348_122;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;Lclient!vo;)V")
	public Class338(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2, @OriginalArg(3) Class348 arg3) {
		this.aClass348_123 = arg2;
		this.aClass348_122 = arg3;
		this.aClass348_123.method7981(33);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZI)Lclient!jm;")
	public Class166 method7710(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_62;
		@Pc(16) Class166 local16;
		synchronized (this.aClass167_62) {
			local16 = (Class166) this.aClass167_62.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) Class348 local45 = this.aClass348_123;
		@Pc(54) byte[] local54;
		synchronized (this.aClass348_123) {
			local54 = this.aClass348_123.method7964(arg0, 33);
		}
		local16 = new Class166();
		local16.aClass338_2 = this;
		if (local54 != null) {
			local16.method3957(new Class4_Sub13(local54));
		}
		@Pc(79) Class167 local79 = this.aClass167_62;
		synchronized (this.aClass167_62) {
			this.aClass167_62.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	public void method7711() {
		@Pc(2) Class167 local2 = this.aClass167_62;
		synchronized (this.aClass167_62) {
			this.aClass167_62.method3975();
		}
		local2 = this.aClass167_63;
		synchronized (this.aClass167_63) {
			this.aClass167_63.method3975();
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)V")
	public void method7712() {
		@Pc(2) Class167 local2 = this.aClass167_62;
		synchronized (this.aClass167_62) {
			this.aClass167_62.method3964(5);
		}
		local2 = this.aClass167_63;
		synchronized (this.aClass167_63) {
			this.aClass167_63.method3964(5);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)V")
	public void method7715() {
		@Pc(2) Class167 local2 = this.aClass167_62;
		synchronized (this.aClass167_62) {
			this.aClass167_62.method3961();
		}
		local2 = this.aClass167_63;
		synchronized (this.aClass167_63) {
			this.aClass167_63.method3961();
		}
	}
}
