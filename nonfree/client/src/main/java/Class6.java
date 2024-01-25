import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class Class6 implements Interface4 {

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
	public final int anInt2442;

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
	public final int anInt2444;

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
	public final int anInt2439;

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "Lclient!eda;")
	public final Class83 aClass83_8;

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
	public final int anInt2443;

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
	public final int anInt2440;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
	public final int anInt2436;

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "Lclient!cga;")
	public final Class50 aClass50_7;

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
	public final int anInt2437;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!eda;Lclient!cga;IIIIIII)V")
	public Class6(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt2442 = arg2;
		this.anInt2444 = arg8;
		this.anInt2439 = arg7;
		this.aClass83_8 = arg0;
		this.anInt2443 = arg3;
		this.anInt2440 = arg4;
		this.anInt2436 = arg5;
		this.aClass50_7 = arg1;
		this.anInt2437 = arg6;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return null;
	}
}
