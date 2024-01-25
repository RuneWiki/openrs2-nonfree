import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Lclient!ld;")
	public final Class137_Sub1_Sub1 aClass137_Sub1_Sub1_1;

	static {
		new Class174(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!nq;II[B)V")
	public Class14_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass137_Sub1_Sub1_1 = Static368.method5133(arg1, arg0, arg2, arg3);
		this.aClass137_Sub1_Sub1_1.method3346(false, false);
	}
}
