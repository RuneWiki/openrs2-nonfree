import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class311 {

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "Lclient!gg;")
	private final Class112 aClass112_58 = new Class112(128);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!kha;")
	private final Class181 aClass181_109;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class311(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_109 = arg2;
		if (this.aClass181_109 != null) {
			@Pc(20) int local20 = this.aClass181_109.method5029() - 1;
			this.aClass181_109.method5025(local20);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lclient!rm;")
	public Class292 method7468(@OriginalArg(0) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_58;
		@Pc(16) Class292 local16;
		synchronized (this.aClass112_58) {
			local16 = (Class292) this.aClass112_58.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass181_109.method5023(Static26.method459(arg0), Static153.method3330(arg0));
		local16 = new Class292();
		if (local37 != null) {
			local16.method7220(new Class3_Sub15(local37));
		}
		@Pc(58) Class112 local58 = this.aClass112_58;
		synchronized (this.aClass112_58) {
			this.aClass112_58.method3636((long) arg0, local16);
			return local16;
		}
	}
}
