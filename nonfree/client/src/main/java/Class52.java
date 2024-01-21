import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class52 {

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	public final int anInt3253;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public final int anInt3247;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	public final int anInt3246;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public final int anInt3250;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
	public final int anInt3244;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	public final int anInt3251;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3253 = arg5;
		this.anInt3247 = arg2;
		this.anInt3246 = arg3;
		this.anInt3250 = arg0;
		this.anInt3244 = arg4;
		this.aBoolean139 = arg6;
		this.anInt3251 = arg1;
	}
}
