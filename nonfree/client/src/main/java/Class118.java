import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class118 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
	public int anInt3090;

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
	public int anInt3091;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
	public int anInt3092;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
	public int anInt3094;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
	public int anInt3095;

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
	public int anInt3096;

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
	public int anInt3097;

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
	public int anInt3098;

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
	public int anInt3100;

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
	public int anInt3102;

	@OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
	public int anInt3105;

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
	public int anInt3106;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!fw;I)Z")
	public boolean method2644(@OriginalArg(0) Class118 arg0) {
		return arg0.anInt3097 == this.anInt3097 && arg0.anInt3092 == this.anInt3092 && this.anInt3100 == arg0.anInt3100;
	}
}
