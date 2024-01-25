import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class314 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!tq;")
	private final Class340 aClass340_52 = new Class340(128);

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!wm;")
	private final Class390 aClass390_101;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class314(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_101 = arg2;
		this.aClass390_101.method8913(1);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public void method7467() {
		@Pc(7) Class340 local7 = this.aClass340_52;
		synchronized (this.aClass340_52) {
			this.aClass340_52.method8000();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Lclient!tg;")
	public Class335 method7470(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_52;
		@Pc(16) Class335 local16;
		synchronized (this.aClass340_52) {
			local16 = (Class335) this.aClass340_52.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_101;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_101) {
			local38 = this.aClass390_101.method8914(1, arg0);
		}
		local16 = new Class335();
		if (local38 != null) {
			local16.method7760(new Class5_Sub41(local38));
		}
		@Pc(60) Class340 local60 = this.aClass340_52;
		synchronized (this.aClass340_52) {
			this.aClass340_52.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public void method7472() {
		@Pc(14) Class340 local14 = this.aClass340_52;
		synchronized (this.aClass340_52) {
			this.aClass340_52.method7996(5);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public void method7474() {
		@Pc(2) Class340 local2 = this.aClass340_52;
		synchronized (this.aClass340_52) {
			this.aClass340_52.method7987();
		}
	}
}
