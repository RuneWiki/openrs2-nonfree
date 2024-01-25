import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class132 {

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!co;")
	private Class41 aClass41_48 = new Class41(64);

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!g;")
	private final Class83 aClass83_71;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class132(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_71 = arg2;
		if (this.aClass83_71 != null) {
			@Pc(20) int local20 = this.aClass83_71.method1956() - 1;
			this.aClass83_71.method1955(local20);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)V")
	public void method3433() {
		@Pc(2) Class41 local2 = this.aClass41_48;
		synchronized (this.aClass41_48) {
			this.aClass41_48.method826(5);
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	public void method3437() {
		@Pc(2) Class41 local2 = this.aClass41_48;
		synchronized (this.aClass41_48) {
			this.aClass41_48.method829();
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)Lclient!wq;")
	public Class250 method3438(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_48;
		@Pc(16) Class250 local16;
		synchronized (this.aClass41_48) {
			local16 = (Class250) this.aClass41_48.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) byte[] local42 = this.aClass83_71.method1968(Static51.method791(arg0), Static29.method336(arg0));
		local16 = new Class250();
		if (local42 != null) {
			local16.method6105(new Class2_Sub24(local42));
		}
		@Pc(58) Class41 local58 = this.aClass41_48;
		synchronized (this.aClass41_48) {
			this.aClass41_48.method832((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
	public void method3439() {
		@Pc(12) Class41 local12 = this.aClass41_48;
		synchronized (this.aClass41_48) {
			this.aClass41_48.method825();
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(II)V")
	public void method3441(@OriginalArg(1) int arg0) {
		@Pc(2) Class41 local2 = this.aClass41_48;
		synchronized (this.aClass41_48) {
			this.aClass41_48.method825();
			this.aClass41_48 = new Class41(arg0);
		}
	}
}
