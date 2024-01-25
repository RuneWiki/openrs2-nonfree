import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class204 {

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "Lclient!co;")
	private final Class41 aClass41_68 = new Class41(64);

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!g;")
	private final Class83 aClass83_109;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	public final int anInt5672;

	static {
		new Class62(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class204(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_109 = arg2;
		if (this.aClass83_109 == null) {
			this.anInt5672 = 0;
		} else {
			this.anInt5672 = this.aClass83_109.method1955(16);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	public void method5025() {
		@Pc(11) Class41 local11 = this.aClass41_68;
		synchronized (this.aClass41_68) {
			this.aClass41_68.method825();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
	public void method5026() {
		@Pc(2) Class41 local2 = this.aClass41_68;
		synchronized (this.aClass41_68) {
			this.aClass41_68.method826(5);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	public void method5027() {
		@Pc(2) Class41 local2 = this.aClass41_68;
		synchronized (this.aClass41_68) {
			this.aClass41_68.method829();
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)Lclient!hh;")
	public Class95 method5029(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_68;
		@Pc(16) Class95 local16;
		synchronized (this.aClass41_68) {
			local16 = (Class95) this.aClass41_68.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass83_109.method1968(arg0, 16);
		local16 = new Class95();
		if (local33 != null) {
			local16.method2291(new Class2_Sub24(local33));
		}
		@Pc(49) Class41 local49 = this.aClass41_68;
		synchronized (this.aClass41_68) {
			this.aClass41_68.method832((long) arg0, local16);
			return local16;
		}
	}
}
