import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public final class Class5_Sub40 extends Class5 {

	@OriginalMember(owner = "client!lja", name = "l", descriptor = "Z")
	public boolean aBoolean561;

	@OriginalMember(owner = "client!lja", name = "n", descriptor = "Z")
	public boolean aBoolean562;

	@OriginalMember(owner = "client!lja", name = "p", descriptor = "Z")
	public boolean aBoolean563;

	@OriginalMember(owner = "client!lja", name = "o", descriptor = "I")
	public final int anInt6339;

	@OriginalMember(owner = "client!lja", name = "m", descriptor = "I")
	public final int anInt6338;

	@OriginalMember(owner = "client!lja", name = "r", descriptor = "Lclient!rf;")
	public final Class140_Sub1 aClass140_Sub1_1;

	@OriginalMember(owner = "client!lja", name = "q", descriptor = "Z")
	public final boolean aBoolean564;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(ILclient!rf;IZ)V")
	public Class5_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) Class140_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt6339 = arg2;
		this.anInt6338 = arg0;
		this.aClass140_Sub1_1 = arg1;
		this.aBoolean564 = arg3;
	}
}
