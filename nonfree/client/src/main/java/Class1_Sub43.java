import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "Z")
	public final boolean aBoolean496;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	public final int anInt7501;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
	public final int anInt7500;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
	public final int anInt7498;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
	public final int anInt7502;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
	public final int anInt7503;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean496 = arg5;
		this.anInt7501 = arg2;
		this.anInt7500 = arg1;
		this.anInt7498 = arg0;
		this.anInt7502 = arg3;
		this.anInt7503 = arg4;
	}
}
