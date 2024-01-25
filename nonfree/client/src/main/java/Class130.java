import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class130 {

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!kba;")
	public Class3_Sub28 aClass3_Sub28_1;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Lclient!kca;")
	public Class3_Sub3_Sub5 aClass3_Sub3_Sub5_2;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Lclient!wo;")
	public Class3_Sub18_Sub1 aClass3_Sub18_Sub1_2;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!gb;")
	public Class120 aClass120_1;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
	public final int anInt3529;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	public int anInt3531;

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
	public final int anInt3530;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
	public final int anInt3526;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
	public final int anInt3528;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Lclient!uq;")
	public final Class9_Sub2 aClass9_Sub2_12;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
	public final int anInt3532;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(BIIIIIILclient!uq;)V")
	public Class130(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class9_Sub2 arg7) {
		this.anInt3529 = arg2;
		this.anInt3531 = arg3;
		this.anInt3530 = arg5;
		this.aByte59 = arg0;
		this.anInt3526 = arg4;
		this.anInt3528 = arg1;
		this.aClass9_Sub2_12 = arg7;
		this.anInt3532 = arg6;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Z")
	public boolean method3039() {
		return this.aByte59 == 2 || this.aByte59 == 3;
	}
}
