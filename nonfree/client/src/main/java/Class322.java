import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class322 {

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_84 = new Class307(128);

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "Lclient!ik;")
	private final Class182 aClass182_106;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class322(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_106 = arg2;
		if (this.aClass182_106 != null) {
			@Pc(20) int local20 = this.aClass182_106.method3956() - 1;
			this.aClass182_106.method3970(local20);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IB)Lclient!ma;")
	public Class241 method7220(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_84;
		@Pc(16) Class241 local16;
		synchronized (this.aClass307_84) {
			local16 = (Class241) this.aClass307_84.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(44) byte[] local44 = this.aClass182_106.method3985(Static328.method7179(arg0), Static116.method2199(arg0));
		local16 = new Class241();
		if (local44 != null) {
			local16.method5333(new Class3_Sub2(local44));
		}
		@Pc(62) Class307 local62 = this.aClass307_84;
		synchronized (this.aClass307_84) {
			this.aClass307_84.method7000(local16, (long) arg0);
			return local16;
		}
	}
}
