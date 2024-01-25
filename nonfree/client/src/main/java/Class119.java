import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class119 implements Interface14 {

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	public final int anInt2776;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
	public final int anInt2778;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	public final int anInt2773;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!fda;")
	public final Class112 aClass112_6;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!aba;")
	public final Class4 aClass4_6;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
	public final int anInt2777;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Z")
	public final boolean aBoolean191;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	public final int anInt2779;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
	public final int anInt2774;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
	public final int anInt2775;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
	public final int anInt2772;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(ILclient!fda;Lclient!aba;IIIIIIIZ)V")
	public Class119(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt2776 = arg6;
		this.anInt2778 = arg5;
		this.anInt2773 = arg9;
		this.aClass112_6 = arg1;
		this.aClass4_6 = arg2;
		this.anInt2777 = arg3;
		this.aBoolean191 = arg10;
		this.anInt2779 = arg0;
		this.anInt2774 = arg8;
		this.anInt2775 = arg4;
		this.anInt2772 = arg7;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return Static460.aClass370_7;
	}
}
