import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class4_Sub34 extends Class4 {

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Z")
	public boolean aBoolean430;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
	public final int anInt5683;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "Z")
	public final boolean aBoolean431;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
	public final int anInt5684;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "Lclient!fa;")
	public final Class105_Sub1 aClass105_Sub1_1;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(ILclient!fa;IZ)V")
	public Class4_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) Class105_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5683 = arg2;
		this.aBoolean431 = arg3;
		this.anInt5684 = arg0;
		this.aClass105_Sub1_1 = arg1;
	}
}
