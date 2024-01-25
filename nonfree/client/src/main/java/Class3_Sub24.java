import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "Z")
	public boolean aBoolean270;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "Z")
	public boolean aBoolean271;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "Z")
	public boolean aBoolean273;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
	public final int anInt3353;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
	public final int anInt3357;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "Z")
	public final boolean aBoolean272;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "Lclient!dp;")
	public final Class78_Sub1 aClass78_Sub1_1;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(ILclient!dp;IZ)V")
	public Class3_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class78_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3353 = arg2;
		this.anInt3357 = arg0;
		this.aBoolean272 = arg3;
		this.aClass78_Sub1_1 = arg1;
	}
}
