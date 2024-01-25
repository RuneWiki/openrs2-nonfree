import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class176 {

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!tq;")
	private final Class340 aClass340_32 = new Class340(64);

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!tq;")
	public final Class340 aClass340_33 = new Class340(2);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!wm;")
	public final Class390 aClass390_69;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!wm;")
	private final Class390 aClass390_70;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;Lclient!wm;)V")
	public Class176(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Class390 arg3) {
		this.aClass390_69 = arg3;
		this.aClass390_70 = arg2;
		this.aClass390_70.method8913(33);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)V")
	public void method4503() {
		@Pc(2) Class340 local2 = this.aClass340_32;
		synchronized (this.aClass340_32) {
			this.aClass340_32.method7996(5);
		}
		local2 = this.aClass340_33;
		synchronized (this.aClass340_33) {
			this.aClass340_33.method7996(5);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public void method4504() {
		@Pc(6) Class340 local6 = this.aClass340_32;
		synchronized (this.aClass340_32) {
			this.aClass340_32.method7987();
		}
		local6 = this.aClass340_33;
		synchronized (this.aClass340_33) {
			this.aClass340_33.method7987();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method4507() {
		@Pc(6) Class340 local6 = this.aClass340_32;
		synchronized (this.aClass340_32) {
			this.aClass340_32.method8000();
		}
		local6 = this.aClass340_33;
		synchronized (this.aClass340_33) {
			this.aClass340_33.method8000();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!cca;")
	public Class55 method4509(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_32;
		@Pc(16) Class55 local16;
		synchronized (this.aClass340_32) {
			local16 = (Class55) this.aClass340_32.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_70;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_70) {
			local38 = this.aClass390_70.method8914(33, arg0);
		}
		local16 = new Class55();
		local16.aClass176_1 = this;
		if (local38 != null) {
			local16.method915(new Class5_Sub41(local38));
		}
		@Pc(65) Class340 local65 = this.aClass340_32;
		synchronized (this.aClass340_32) {
			this.aClass340_32.method7986((long) arg0, local16);
			return local16;
		}
	}
}
