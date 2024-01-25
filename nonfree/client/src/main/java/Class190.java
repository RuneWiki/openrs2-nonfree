import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class190 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!tq;")
	private final Class340 aClass340_36 = new Class340(128);

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!wm;")
	private final Class390 aClass390_75;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class190(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_75 = arg2;
		if (this.aClass390_75 != null) {
			@Pc(20) int local20 = this.aClass390_75.method8918() - 1;
			this.aClass390_75.method8913(local20);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Lclient!lv;")
	public Class221 method4808(@OriginalArg(0) int arg0) {
		@Pc(11) Class340 local11 = this.aClass340_36;
		@Pc(21) Class221 local21;
		synchronized (this.aClass340_36) {
			local21 = (Class221) this.aClass340_36.method7999((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass390_75.method8914(Static305.method4820(arg0), Static493.method7072(arg0));
		local21 = new Class221();
		if (local42 != null) {
			local21.method5365(new Class5_Sub41(local42));
		}
		@Pc(58) Class340 local58 = this.aClass340_36;
		synchronized (this.aClass340_36) {
			this.aClass340_36.method7986((long) arg0, local21);
			return local21;
		}
	}
}
