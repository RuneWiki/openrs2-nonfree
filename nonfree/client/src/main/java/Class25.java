import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class Class25 implements Interface4 {

	@OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
	public final int anInt7824;

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
	public final int anInt7822;

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "Lclient!cga;")
	public final Class50 aClass50_10;

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "Lclient!eda;")
	public final Class83 aClass83_9;

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
	public final int anInt7821;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(ILclient!eda;Lclient!cga;II)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7824 = arg3;
		this.anInt7822 = arg0;
		this.aClass50_10 = arg2;
		this.aClass83_9 = arg1;
		this.anInt7821 = arg4;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return Static461.aClass146_7;
	}
}
