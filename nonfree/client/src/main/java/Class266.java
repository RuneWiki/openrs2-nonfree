import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class266 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Lclient!jj;")
	public Class1_Sub25_Sub1 aClass1_Sub25_Sub1_2;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!kl;")
	public Class1_Sub29 aClass1_Sub29_1;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "Lclient!rk;")
	public Class211 aClass211_1;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "Lclient!rd;")
	public Class1_Sub6_Sub3 aClass1_Sub6_Sub3_4;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
	public final int anInt7422;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
	public int anInt7428;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public final int anInt7426;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "B")
	public final byte aByte105;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public final int anInt7427;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	public final int anInt7425;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(BIIIII)V")
	public Class266(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7422 = arg1;
		this.anInt7428 = arg3;
		this.anInt7426 = arg4;
		this.aByte105 = arg0;
		this.anInt7427 = arg5;
		this.anInt7425 = arg2;
	}
}
