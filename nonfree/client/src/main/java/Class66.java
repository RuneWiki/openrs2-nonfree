import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class66 {

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Lclient!tq;")
	private final Class340 aClass340_5 = new Class340(64);

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "Lclient!tq;")
	private final Class340 aClass340_6 = new Class340(100);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "Lclient!wm;")
	private final Class390 aClass390_14;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;Lclient!wm;Lclient!wm;)V")
	public Class66(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Class390 arg3, @OriginalArg(4) Class390 arg4) {
		this.aClass390_14 = arg2;
		if (this.aClass390_14 != null) {
			@Pc(26) int local26 = this.aClass390_14.method8918() - 1;
			this.aClass390_14.method8913(local26);
		}
		Static596.method2931(arg3, arg4);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public void method1766() {
		@Pc(14) Class340 local14 = this.aClass340_5;
		synchronized (this.aClass340_5) {
			this.aClass340_5.method8000();
		}
		local14 = this.aClass340_6;
		synchronized (this.aClass340_6) {
			this.aClass340_6.method8000();
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)Lclient!is;")
	public Class5_Sub3_Sub9 method1767(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_6;
		synchronized (this.aClass340_6) {
			@Pc(16) Class5_Sub3_Sub9 local16 = (Class5_Sub3_Sub9) this.aClass340_6.method7999((long) arg0);
			if (local16 == null) {
				local16 = new Class5_Sub3_Sub9(arg0);
				this.aClass340_6.method7986((long) arg0, local16);
			}
			return local16.method4155() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)Lclient!jba;")
	public Class175 method1768(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_5;
		@Pc(16) Class175 local16;
		synchronized (this.aClass340_5) {
			local16 = (Class175) this.aClass340_5.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_14;
		@Pc(42) byte[] local42;
		synchronized (this.aClass390_14) {
			local42 = this.aClass390_14.method8914(Static152.method2751(arg0), Static15.method212(arg0));
		}
		local16 = new Class175();
		local16.aClass66_1 = this;
		local16.anInt5031 = arg0;
		if (local42 != null) {
			local16.method4257(new Class5_Sub41(local42));
		}
		local16.method4256();
		@Pc(79) Class340 local79 = this.aClass340_5;
		synchronized (this.aClass340_5) {
			this.aClass340_5.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V")
	public void method1769() {
		@Pc(2) Class340 local2 = this.aClass340_5;
		synchronized (this.aClass340_5) {
			this.aClass340_5.method7996(5);
		}
		@Pc(30) Class340 local30 = this.aClass340_6;
		synchronized (this.aClass340_6) {
			this.aClass340_6.method7996(5);
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
	public void method1771() {
		@Pc(6) Class340 local6 = this.aClass340_5;
		synchronized (this.aClass340_5) {
			this.aClass340_5.method7987();
		}
		local6 = this.aClass340_6;
		synchronized (this.aClass340_6) {
			this.aClass340_6.method7987();
		}
	}
}
