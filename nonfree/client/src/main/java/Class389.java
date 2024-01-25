import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class389 {

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Lclient!tq;")
	private final Class340 aClass340_69 = new Class340(64);

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "Lclient!wm;")
	private final Class390 aClass390_126;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	public final int anInt10681;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class389(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_126 = arg2;
		if (this.aClass390_126 == null) {
			this.anInt10681 = 0;
		} else {
			this.anInt10681 = this.aClass390_126.method8913(16);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	public void method8877() {
		@Pc(2) Class340 local2 = this.aClass340_69;
		synchronized (this.aClass340_69) {
			this.aClass340_69.method8000();
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
	public void method8879() {
		@Pc(2) Class340 local2 = this.aClass340_69;
		synchronized (this.aClass340_69) {
			this.aClass340_69.method7987();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)V")
	public void method8880() {
		@Pc(11) Class340 local11 = this.aClass340_69;
		synchronized (this.aClass340_69) {
			this.aClass340_69.method7996(5);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Lclient!aq;")
	public Class24 method8881(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_69;
		@Pc(16) Class24 local16;
		synchronized (this.aClass340_69) {
			local16 = (Class24) this.aClass340_69.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_126;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_126) {
			local38 = this.aClass390_126.method8914(16, arg0);
		}
		local16 = new Class24();
		if (local38 != null) {
			local16.method311(new Class5_Sub41(local38));
		}
		@Pc(66) Class340 local66 = this.aClass340_69;
		synchronized (this.aClass340_69) {
			this.aClass340_69.method7986((long) arg0, local16);
			return local16;
		}
	}
}
