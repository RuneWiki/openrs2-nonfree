import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
	public boolean aBoolean285;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Z")
	public boolean aBoolean286;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Z")
	public boolean aBoolean287;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Z")
	public final boolean aBoolean288;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
	public final int anInt4043;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	public final int anInt4041;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!ll;")
	public final Class209_Sub1 aClass209_Sub1_1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILclient!ll;IZ)V")
	public Class2_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class209_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean288 = arg3;
		this.anInt4043 = arg0;
		this.anInt4041 = arg2;
		this.aClass209_Sub1_1 = arg1;
	}
}
