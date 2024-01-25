import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class70 {

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "Lclient!tq;")
	public final Class340 aClass340_7 = new Class340(20);

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "Lclient!tq;")
	private final Class340 aClass340_8 = new Class340(64);

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Lclient!wm;")
	private final Class390 aClass390_18;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "Lclient!wm;")
	public final Class390 aClass390_17;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;Lclient!wm;)V")
	public Class70(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Class390 arg3) {
		this.aClass390_18 = arg2;
		this.aClass390_17 = arg3;
		this.aClass390_18.method8913(46);
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
	public void method1845() {
		@Pc(2) Class340 local2 = this.aClass340_8;
		synchronized (this.aClass340_8) {
			this.aClass340_8.method8000();
		}
		local2 = this.aClass340_7;
		synchronized (this.aClass340_7) {
			this.aClass340_7.method8000();
		}
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
	public void method1846() {
		@Pc(6) Class340 local6 = this.aClass340_8;
		synchronized (this.aClass340_8) {
			this.aClass340_8.method7987();
		}
		local6 = this.aClass340_7;
		synchronized (this.aClass340_7) {
			this.aClass340_7.method7987();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Lclient!eja;")
	public Class102 method1847(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_8;
		@Pc(16) Class102 local16;
		synchronized (this.aClass340_8) {
			local16 = (Class102) this.aClass340_8.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class390 local35 = this.aClass390_18;
		@Pc(44) byte[] local44;
		synchronized (this.aClass390_18) {
			local44 = this.aClass390_18.method8914(46, arg0);
		}
		local16 = new Class102();
		local16.aClass70_1 = this;
		if (local44 != null) {
			local16.method2485(new Class5_Sub41(local44));
		}
		@Pc(69) Class340 local69 = this.aClass340_8;
		synchronized (this.aClass340_8) {
			this.aClass340_8.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)V")
	public void method1849() {
		@Pc(2) Class340 local2 = this.aClass340_8;
		synchronized (this.aClass340_8) {
			this.aClass340_8.method7996(5);
		}
		local2 = this.aClass340_7;
		synchronized (this.aClass340_7) {
			this.aClass340_7.method7996(5);
		}
	}
}
