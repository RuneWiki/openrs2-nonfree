import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class93 {

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "Lclient!tq;")
	private Class340 aClass340_12 = new Class340(128);

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "Lclient!tq;")
	public Class340 aClass340_13 = new Class340(64);

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lclient!wm;")
	public final Class390 aClass390_25;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "Lclient!wm;")
	private final Class390 aClass390_26;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;Lclient!wm;)V")
	public Class93(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Class390 arg3) {
		this.aClass390_25 = arg3;
		this.aClass390_26 = arg2;
		this.aClass390_26.method8913(36);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZII)V")
	public void method2279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass340_12 = new Class340(arg0);
		this.aClass340_13 = new Class340(arg1);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZ)Lclient!ek;")
	public Class103 method2280(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_12;
		@Pc(16) Class103 local16;
		synchronized (this.aClass340_12) {
			local16 = (Class103) this.aClass340_12.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class390 local34 = this.aClass390_26;
		@Pc(43) byte[] local43;
		synchronized (this.aClass390_26) {
			local43 = this.aClass390_26.method8914(36, arg0);
		}
		local16 = new Class103();
		local16.aClass93_4 = this;
		local16.anInt2818 = arg0;
		if (local43 != null) {
			local16.method2493(new Class5_Sub41(local43));
		}
		local16.method2496();
		@Pc(74) Class340 local74 = this.aClass340_12;
		synchronized (this.aClass340_12) {
			this.aClass340_12.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	public void method2281() {
		@Pc(6) Class340 local6 = this.aClass340_12;
		synchronized (this.aClass340_12) {
			this.aClass340_12.method7987();
		}
		local6 = this.aClass340_13;
		synchronized (this.aClass340_13) {
			this.aClass340_13.method7987();
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IB)V")
	public void method2282() {
		@Pc(6) Class340 local6 = this.aClass340_12;
		synchronized (this.aClass340_12) {
			this.aClass340_12.method7996(5);
		}
		local6 = this.aClass340_13;
		synchronized (this.aClass340_13) {
			this.aClass340_13.method7996(5);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
	public void method2283() {
		@Pc(2) Class340 local2 = this.aClass340_12;
		synchronized (this.aClass340_12) {
			this.aClass340_12.method8000();
		}
		local2 = this.aClass340_13;
		synchronized (this.aClass340_13) {
			this.aClass340_13.method8000();
		}
	}
}
