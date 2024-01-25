import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "Z")
	public boolean aBoolean414;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "Z")
	public boolean aBoolean415;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "Lclient!gl;")
	public final Class121_Sub1 aClass121_Sub1_1;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	public final int anInt5753;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
	public final int anInt5756;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "Z")
	public final boolean aBoolean413;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(ILclient!gl;IZ)V")
	public Class3_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) Class121_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass121_Sub1_1 = arg1;
		this.anInt5753 = arg0;
		this.anInt5756 = arg2;
		this.aBoolean413 = arg3;
	}
}
