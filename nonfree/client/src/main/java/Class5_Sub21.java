import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class5_Sub21 extends Class5 {

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Z")
	public boolean aBoolean186;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Z")
	public boolean aBoolean187;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Z")
	public boolean aBoolean188;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!ne;")
	public final Class73_Sub1 aClass73_Sub1_1;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "I")
	public final int anInt2440;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Z")
	public final boolean aBoolean185;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	public final int anInt2436;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILclient!ne;IZ)V")
	public Class5_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class73_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass73_Sub1_1 = arg1;
		this.anInt2440 = arg2;
		this.aBoolean185 = arg3;
		this.anInt2436 = arg0;
	}
}
