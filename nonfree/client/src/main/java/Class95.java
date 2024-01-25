import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class95 implements Interface10 {

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
	public final int anInt2240;

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "Lclient!rn;")
	public final Class277 aClass277_3;

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
	public final int anInt2244;

	@OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
	public final int anInt2245;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
	public final int anInt2234;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
	public final int anInt2238;

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "Lclient!hv;")
	public final Class137 aClass137_4;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "Z")
	public final boolean aBoolean146;

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
	public final int anInt2235;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
	public final int anInt2241;

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
	public final int anInt2239;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(ILclient!rn;Lclient!hv;IIIIIIIZ)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt2240 = arg5;
		this.aClass277_3 = arg1;
		this.anInt2244 = arg4;
		this.anInt2245 = arg8;
		this.anInt2234 = arg0;
		this.anInt2238 = arg3;
		this.aClass137_4 = arg2;
		this.aBoolean146 = arg10;
		this.anInt2235 = arg6;
		this.anInt2241 = arg9;
		this.anInt2239 = arg7;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return Static227.aClass165_8;
	}
}
