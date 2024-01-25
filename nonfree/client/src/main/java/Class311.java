import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class311 {

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!tja;")
	private final Class352 aClass352_59 = new Class352(128);

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!bt;")
	private final Class34 aClass34_107;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class311(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_107 = arg2;
		if (this.aClass34_107 != null) {
			@Pc(20) int local20 = this.aClass34_107.method1247() - 1;
			this.aClass34_107.method1233(local20);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!vs;")
	public Class381 method6971(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_59;
		@Pc(16) Class381 local16;
		synchronized (this.aClass352_59) {
			local16 = (Class381) this.aClass352_59.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass34_107.method1239(Static502.method6841(arg0), Static519.method7015(arg0));
		local16 = new Class381();
		if (local37 != null) {
			local16.method8609(new Class4_Sub11(local37));
		}
		@Pc(53) Class352 local53 = this.aClass352_59;
		synchronized (this.aClass352_59) {
			this.aClass352_59.method7655((long) arg0, local16);
			return local16;
		}
	}
}
