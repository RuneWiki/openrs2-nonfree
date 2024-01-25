import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "Z")
	public boolean aBoolean110;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "Z")
	public boolean aBoolean111;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "Z")
	public boolean aBoolean113;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
	public final int anInt1621;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Lclient!dq;")
	public final Class78_Sub1 aClass78_Sub1_1;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "Z")
	public final boolean aBoolean112;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	public final int anInt1619;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(ILclient!dq;IZ)V")
	public Class2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class78_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1621 = arg2;
		this.aClass78_Sub1_1 = arg1;
		this.aBoolean112 = arg3;
		this.anInt1619 = arg0;
	}
}
