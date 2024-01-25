import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "Z")
	public final boolean aBoolean602;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
	public final int anInt7953;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
	public final int anInt7955;

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
	public final int anInt7956;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
	public final int anInt7954;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	public final int anInt7950;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean602 = arg5;
		this.anInt7953 = arg4;
		this.anInt7955 = arg2;
		this.anInt7956 = arg1;
		this.anInt7954 = arg0;
		this.anInt7950 = arg3;
	}
}
