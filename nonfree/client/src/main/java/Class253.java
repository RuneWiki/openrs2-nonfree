import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class Class253 implements Interface10 {

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
	public final int anInt8132;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "Lclient!rn;")
	public final Class277 aClass277_11;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
	public final int anInt8135;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
	public final int anInt8137;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "Lclient!hv;")
	public final Class137 aClass137_14;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(ILclient!rn;Lclient!hv;II)V")
	public Class253(@OriginalArg(0) int arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8132 = arg3;
		this.aClass277_11 = arg1;
		this.anInt8135 = arg4;
		this.anInt8137 = arg0;
		this.aClass137_14 = arg2;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return Static153.aClass165_4;
	}
}
