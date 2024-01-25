import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Z")
	public boolean aBoolean552;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Z")
	public boolean aBoolean554;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Z")
	public boolean aBoolean555;

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
	public final int anInt8252;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
	public final int anInt8250;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Z")
	public final boolean aBoolean551;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "Lclient!rga;")
	public final Class253_Sub1 aClass253_Sub1_1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(ILclient!rga;IZ)V")
	public Class3_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) Class253_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt8252 = arg0;
		this.anInt8250 = arg2;
		this.aBoolean551 = arg3;
		this.aClass253_Sub1_1 = arg1;
	}
}
