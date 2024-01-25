import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class145_Sub3 extends Class145 {

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "Lclient!wn;")
	public final Interface20 anInterface20_4;

	static {
		new Class88("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!wr;II[B)V")
	public Class145_Sub3(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface20_4 = arg0.method5969(arg2, Static61.aClass72_1, false, arg1, arg3);
		this.anInterface20_4.method6988(false, false);
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!wr;II[I)V")
	public Class145_Sub3(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface20_4 = arg0.method5960(arg2, arg3, arg1, false);
		this.anInterface20_4.method6988(false, false);
	}
}
