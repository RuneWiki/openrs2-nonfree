import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class232 {

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!cl;")
	public Class3_Sub6_Sub2 aClass3_Sub6_Sub2_4;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lclient!nq;")
	public Class3_Sub36 aClass3_Sub36_3;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!wc;")
	public Class358 aClass358_1;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Lclient!ee;")
	public Class3_Sub20_Sub1 aClass3_Sub20_Sub1_4;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "B")
	public final byte aByte83;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
	public final int anInt6292;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
	public final int anInt6297;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
	public final int anInt6293;

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
	public int anInt6298;

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
	public final int anInt6294;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(BIIIII)V")
	public Class232(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aByte83 = arg0;
		this.anInt6292 = arg4;
		this.anInt6297 = arg1;
		this.anInt6293 = arg5;
		this.anInt6298 = arg3;
		this.anInt6294 = arg2;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)Z")
	public boolean method5456() {
		return this.aByte83 == 2 || this.aByte83 == 3;
	}
}
