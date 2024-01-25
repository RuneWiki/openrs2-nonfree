import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Z")
	public boolean aBoolean395;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Z")
	public boolean aBoolean397;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Z")
	public final boolean aBoolean398;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!mo;")
	public final Class187_Sub1 aClass187_Sub1_1;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	public final int anInt4635;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	public final int anInt4636;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(ILclient!mo;IZ)V")
	public Class3_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class187_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean398 = arg3;
		this.aClass187_Sub1_1 = arg1;
		this.anInt4635 = arg2;
		this.anInt4636 = arg0;
	}
}
