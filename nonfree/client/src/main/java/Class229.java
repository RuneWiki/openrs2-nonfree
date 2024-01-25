import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class229 implements Interface9 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
	public final int anInt6255;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
	public final int anInt6264;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "Z")
	public final boolean aBoolean480;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	public final int anInt6253;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!eaa;")
	public final Class92 aClass92_10;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	public final int anInt6254;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	public final int anInt6259;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	public final int anInt6261;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!cq;")
	public final Class65 aClass65_13;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
	public final int anInt6262;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
	public final int anInt6258;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(ILclient!eaa;Lclient!cq;IIIIIIIZ)V")
	public Class229(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt6255 = arg5;
		this.anInt6264 = arg0;
		this.aBoolean480 = arg10;
		this.anInt6253 = arg4;
		this.aClass92_10 = arg1;
		this.anInt6254 = arg7;
		this.anInt6259 = arg6;
		this.anInt6261 = arg8;
		this.aClass65_13 = arg2;
		this.anInt6262 = arg3;
		this.anInt6258 = arg9;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return Static492.aClass6_32;
	}
}
