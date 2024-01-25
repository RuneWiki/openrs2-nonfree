import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public final class Class96 implements Interface2 {

	@OriginalMember(owner = "client!fda", name = "n", descriptor = "Lclient!fn;")
	public final Class103 aClass103_7;

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
	public final int anInt2707;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
	public final int anInt2704;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "Z")
	public final boolean aBoolean196;

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
	public final int anInt2709;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
	public final int anInt2703;

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "Lclient!tl;")
	public final Class314 aClass314_3;

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
	public final int anInt2705;

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
	public final int anInt2706;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
	public final int anInt2701;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
	public final int anInt2702;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(ILclient!tl;Lclient!fn;IIIIIIIZ)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass103_7 = arg2;
		this.anInt2707 = arg6;
		this.anInt2704 = arg5;
		this.aBoolean196 = arg10;
		this.anInt2709 = arg9;
		this.anInt2703 = arg7;
		this.aClass314_3 = arg1;
		this.anInt2705 = arg3;
		this.anInt2706 = arg0;
		this.anInt2701 = arg4;
		this.anInt2702 = arg8;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return Static305.aClass307_11;
	}
}
