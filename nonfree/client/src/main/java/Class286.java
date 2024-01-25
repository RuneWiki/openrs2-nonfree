import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class286 {

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "Lclient!tq;")
	private final Class340 aClass340_44 = new Class340(64);

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "Lclient!wm;")
	private final Class390 aClass390_91;

	@OriginalMember(owner = "client!qea", name = "m", descriptor = "Lclient!mp;")
	public final Class236 aClass236_1;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;Lclient!mp;)V")
	public Class286(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Class236 arg3) {
		this.aClass390_91 = arg2;
		this.aClass390_91.method8913(32);
		this.aClass236_1 = arg3;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)V")
	public void method6791() {
		@Pc(6) Class340 local6 = this.aClass340_44;
		synchronized (this.aClass340_44) {
			this.aClass340_44.method7996(5);
		}
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(IB)Lclient!in;")
	public Class167 method6793(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_44;
		@Pc(16) Class167 local16;
		synchronized (this.aClass340_44) {
			local16 = (Class167) this.aClass340_44.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_91;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_91) {
			local38 = this.aClass390_91.method8914(32, arg0);
		}
		local16 = new Class167();
		local16.aClass286_1 = this;
		if (local38 != null) {
			local16.method4112(new Class5_Sub41(local38));
		}
		@Pc(68) Class340 local68 = this.aClass340_44;
		synchronized (this.aClass340_44) {
			this.aClass340_44.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(Z)V")
	public void method6795() {
		@Pc(10) Class340 local10 = this.aClass340_44;
		synchronized (this.aClass340_44) {
			this.aClass340_44.method7987();
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public void method6796() {
		@Pc(2) Class340 local2 = this.aClass340_44;
		synchronized (this.aClass340_44) {
			this.aClass340_44.method8000();
		}
	}
}
