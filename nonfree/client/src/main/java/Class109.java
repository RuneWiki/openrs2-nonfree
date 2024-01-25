import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class109 implements Interface3 {

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public final int anInt2737;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
	public final boolean aBoolean200;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Lclient!ft;")
	public final Class125 aClass125_6;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
	public final int anInt2739;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public final int anInt2741;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public final int anInt2736;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public final int anInt2740;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
	public final int anInt2742;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public final int anInt2735;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!ps;")
	public final Class291 aClass291_4;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public final int anInt2734;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(ILclient!ps;Lclient!ft;IIIIIIIZ)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt2737 = arg7;
		this.aBoolean200 = arg10;
		this.aClass125_6 = arg2;
		this.anInt2739 = arg4;
		this.anInt2741 = arg5;
		this.anInt2736 = arg0;
		this.anInt2740 = arg6;
		this.anInt2742 = arg3;
		this.anInt2735 = arg9;
		this.aClass291_4 = arg1;
		this.anInt2734 = arg8;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return Static340.aClass210_9;
	}
}
