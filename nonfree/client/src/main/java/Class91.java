import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class91 {

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
	public int anInt2502;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "Lclient!tq;")
	private final Class340 aClass340_10 = new Class340(64);

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "Lclient!tq;")
	public final Class340 aClass340_11 = new Class340(60);

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "Lclient!wm;")
	public final Class390 aClass390_24;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Lclient!wm;")
	private final Class390 aClass390_23;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;Lclient!wm;)V")
	public Class91(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Class390 arg3) {
		this.aClass390_24 = arg3;
		this.aClass390_23 = arg2;
		@Pc(26) int local26 = this.aClass390_23.method8918() - 1;
		this.aClass390_23.method8913(local26);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
	public void method2240() {
		@Pc(6) Class340 local6 = this.aClass340_10;
		synchronized (this.aClass340_10) {
			this.aClass340_10.method7987();
		}
		local6 = this.aClass340_11;
		synchronized (this.aClass340_11) {
			this.aClass340_11.method7987();
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
	public void method2241() {
		@Pc(2) Class340 local2 = this.aClass340_10;
		synchronized (this.aClass340_10) {
			this.aClass340_10.method8000();
		}
		local2 = this.aClass340_11;
		synchronized (this.aClass340_11) {
			this.aClass340_11.method8000();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BI)V")
	public void method2242() {
		@Pc(6) Class340 local6 = this.aClass340_10;
		synchronized (this.aClass340_10) {
			this.aClass340_10.method7996(5);
		}
		local6 = this.aClass340_11;
		synchronized (this.aClass340_11) {
			this.aClass340_11.method7996(5);
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(BI)Lclient!tm;")
	public Class338 method2243(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_10;
		@Pc(16) Class338 local16;
		synchronized (this.aClass340_10) {
			local16 = (Class338) this.aClass340_10.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_23;
		@Pc(42) byte[] local42;
		synchronized (this.aClass390_23) {
			local42 = this.aClass390_23.method8914(Static570.method7873(arg0), Static553.method7675(arg0));
		}
		local16 = new Class338();
		local16.aClass91_2 = this;
		local16.anInt9386 = arg0;
		if (local42 != null) {
			local16.method7935(new Class5_Sub41(local42));
		}
		@Pc(78) Class340 local78 = this.aClass340_10;
		synchronized (this.aClass340_10) {
			this.aClass340_10.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)V")
	public void method2244(@OriginalArg(0) int arg0) {
		this.anInt2502 = arg0;
		@Pc(9) Class340 local9 = this.aClass340_11;
		synchronized (this.aClass340_11) {
			this.aClass340_11.method7987();
		}
	}
}
