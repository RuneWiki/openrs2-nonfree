import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class141 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!mca;")
	public Class2_Sub31_Sub1 aClass2_Sub31_Sub1_2;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!or;")
	public Class2_Sub12_Sub3 aClass2_Sub12_Sub3_2;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!av;")
	public Class2_Sub6 aClass2_Sub6_1;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!eg;")
	public Class70 aClass70_1;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public final int anInt3895;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public int anInt3894;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
	public final int anInt3897;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public final int anInt3893;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	public final int anInt3892;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(BIIIII)V")
	public Class141(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aByte59 = arg0;
		this.anInt3895 = arg5;
		this.anInt3894 = arg3;
		this.anInt3897 = arg2;
		this.anInt3893 = arg1;
		this.anInt3892 = arg4;
	}
}
