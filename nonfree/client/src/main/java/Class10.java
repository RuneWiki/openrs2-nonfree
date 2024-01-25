import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class Class10 implements Interface10 {

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
	public final int anInt7624;

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
	public final int anInt7623;

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
	public final int anInt7626;

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
	public final int anInt7622;

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "Lclient!hv;")
	public final Class137 aClass137_13;

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "Lclient!rn;")
	public final Class277 aClass277_10;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
	public final int anInt7621;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!rn;Lclient!hv;IIIII)V")
	public Class10(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7624 = arg6;
		this.anInt7623 = arg5;
		this.anInt7626 = arg3;
		this.anInt7622 = arg2;
		this.aClass137_13 = arg1;
		this.aClass277_10 = arg0;
		this.anInt7621 = arg4;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return null;
	}
}
