import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class5_Sub27 extends Class5 {

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Z")
	public boolean aBoolean262;

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "Z")
	public boolean aBoolean263;

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "Z")
	public boolean aBoolean265;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "Z")
	public final boolean aBoolean264;

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "Lclient!eq;")
	public final Class104_Sub1 aClass104_Sub1_1;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
	public final int anInt3825;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	public final int anInt3824;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(ILclient!eq;IZ)V")
	public Class5_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean264 = arg3;
		this.aClass104_Sub1_1 = arg1;
		this.anInt3825 = arg0;
		this.anInt3824 = arg2;
	}
}
