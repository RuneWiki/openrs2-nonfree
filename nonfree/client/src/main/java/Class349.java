import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class349 implements Interface10 {

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "Lclient!rn;")
	public final Class277 aClass277_12;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
	public final int anInt9612;

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
	public final int anInt9613;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	public final int anInt9615;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
	public final int anInt9614;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString121;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "Lclient!hv;")
	public final Class137 aClass137_15;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!rn;Lclient!hv;IIII)V")
	public Class349(@OriginalArg(0) String arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass277_12 = arg1;
		this.anInt9612 = arg5;
		this.anInt9613 = arg4;
		this.anInt9615 = arg3;
		this.anInt9614 = arg6;
		this.aString121 = arg0;
		this.aClass137_15 = arg2;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return Static348.aClass165_18;
	}
}
