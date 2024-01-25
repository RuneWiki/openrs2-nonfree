import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class152 {

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Lclient!qr;")
	public Class6_Sub6_Sub1 aClass6_Sub6_Sub1_2;

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "Lclient!jt;")
	public Class161 aClass161_1;

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "Lclient!ju;")
	public Class6_Sub23 aClass6_Sub23_1;

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "Lclient!ji;")
	public Class6_Sub15_Sub2 aClass6_Sub15_Sub2_2;

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
	public final int anInt4379;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
	public final int anInt4378;

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
	public final int anInt4382;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public int anInt4381;

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "B")
	public final byte aByte53;

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
	public final int anInt4380;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(BIIIII)V")
	public Class152(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4379 = arg5;
		this.anInt4378 = arg4;
		this.anInt4382 = arg1;
		this.anInt4381 = arg3;
		this.aByte53 = arg0;
		this.anInt4380 = arg2;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Z")
	public boolean method3734() {
		return this.aByte53 == 2 || this.aByte53 == 3;
	}
}
