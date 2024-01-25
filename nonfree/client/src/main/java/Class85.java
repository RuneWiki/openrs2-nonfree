import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class85 implements Interface23 {

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "Lclient!op;")
	public final Class250 aClass250_3;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Lclient!pe;")
	public final Class258 aClass258_1;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public final int anInt2658;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	public final int anInt2666;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
	public final int anInt2664;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
	public final int anInt2663;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	public final int anInt2662;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	public final int anInt2659;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
	public final int anInt2661;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	public final int anInt2665;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Z")
	public final boolean aBoolean195;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(ILclient!pe;Lclient!op;IIIIIIIZ)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass250_3 = arg2;
		this.aClass258_1 = arg1;
		this.anInt2658 = arg4;
		this.anInt2666 = arg5;
		this.anInt2664 = arg3;
		this.anInt2663 = arg8;
		this.anInt2662 = arg7;
		this.anInt2659 = arg9;
		this.anInt2661 = arg0;
		this.anInt2665 = arg6;
		this.aBoolean195 = arg10;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return Static31.aClass307_1;
	}
}
