import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public final class Class14_Sub27 extends Class14 {

	@OriginalMember(owner = "client!mha", name = "x", descriptor = "Z")
	public boolean aBoolean475;

	@OriginalMember(owner = "client!mha", name = "l", descriptor = "Z")
	public boolean aBoolean476;

	@OriginalMember(owner = "client!mha", name = "r", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!mha", name = "n", descriptor = "I")
	public final int anInt6682;

	@OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
	public final int anInt6684;

	@OriginalMember(owner = "client!mha", name = "u", descriptor = "Z")
	public final boolean aBoolean477;

	@OriginalMember(owner = "client!mha", name = "t", descriptor = "Lclient!lga;")
	public final Class147_Sub1 aClass147_Sub1_1;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(ILclient!lga;IZ)V")
	public Class14_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class147_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt6682 = arg2;
		this.anInt6684 = arg0;
		this.aBoolean477 = arg3;
		this.aClass147_Sub1_1 = arg1;
	}
}
