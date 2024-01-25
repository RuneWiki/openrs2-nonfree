import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class99 implements Interface18 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
	public final int anInt2841;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
	public final int anInt2843;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
	public final int anInt2838;

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!kr;")
	public final Class216 aClass216_7;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
	public final int anInt2836;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString51;

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
	public final int anInt2844;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
	public final int anInt2840;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
	public final int anInt2845;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	public final int anInt2835;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	public final int anInt2842;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Lclient!qk;")
	public final Class304 aClass304_7;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public final int anInt2837;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!qk;Lclient!kr;IIIIIIIIII)V")
	public Class99(@OriginalArg(0) String arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(2) Class216 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt2841 = arg3;
		this.anInt2843 = arg12;
		this.anInt2838 = arg7;
		this.aClass216_7 = arg2;
		this.anInt2836 = arg8;
		this.aString51 = arg0;
		this.anInt2844 = arg6;
		this.anInt2840 = arg10;
		this.anInt2845 = arg5;
		this.anInt2835 = arg11;
		this.anInt2842 = arg9;
		this.aClass304_7 = arg1;
		this.anInt2837 = arg4;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static248.aClass409_9;
	}
}
