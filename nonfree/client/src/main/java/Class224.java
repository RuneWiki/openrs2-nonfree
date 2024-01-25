import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class224 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Lclient!ut;")
	public Class6_Sub37_Sub1 aClass6_Sub37_Sub1_1;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "Lclient!pn;")
	public Class258 aClass258_1;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!cba;")
	public Class6_Sub7 aClass6_Sub7_1;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "Lclient!ia;")
	public Class6_Sub3_Sub3 aClass6_Sub3_Sub3_1;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "Lclient!vs;")
	public final Class20_Sub2 aClass20_Sub2_17;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public int anInt6904;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	public final int anInt6910;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public final int anInt6908;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	public final int anInt6911;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
	public final int anInt6907;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
	public final int anInt6909;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(BIIIIIILclient!vs;)V")
	public Class224(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class20_Sub2 arg7) {
		this.aClass20_Sub2_17 = arg7;
		this.anInt6904 = arg3;
		this.anInt6910 = arg1;
		this.anInt6908 = arg2;
		this.anInt6911 = arg4;
		this.aByte78 = arg0;
		this.anInt6907 = arg6;
		this.anInt6909 = arg5;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Z")
	public boolean method5926() {
		return this.aByte78 == 2 || this.aByte78 == 3;
	}
}
