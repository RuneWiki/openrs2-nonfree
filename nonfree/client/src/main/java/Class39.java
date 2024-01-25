import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class39 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!ft;")
	public Class6_Sub19_Sub1 aClass6_Sub19_Sub1_1;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "Lclient!id;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!fh;")
	public Class6_Sub18_Sub1 aClass6_Sub18_Sub1_1;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!hl;")
	public Class6_Sub22 aClass6_Sub22_1;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "I")
	public int anInt1134;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public final int anInt1128;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "I")
	public final int anInt1131;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public final int anInt1124;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "B")
	public final byte aByte21;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public final int anInt1127;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(BIIIII)V")
	public Class39(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1134 = arg3;
		this.anInt1128 = arg1;
		this.anInt1131 = arg2;
		this.anInt1124 = arg4;
		this.aByte21 = arg0;
		this.anInt1127 = arg5;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Z")
	public boolean method1125() {
		return this.aByte21 == 2 || this.aByte21 == 3;
	}
}
