import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class237 implements Interface12 {

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public final int anInt6443;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public final int anInt6436;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public final int anInt6444;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public final int anInt6442;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public final int anInt6439;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public final int anInt6438;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public final int anInt6441;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public final int anInt6446;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public final int anInt6437;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!oea;")
	public final Class252 aClass252_10;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString53;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public final int anInt6445;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!eha;")
	public final Class97 aClass97_11;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!eha;Lclient!oea;IIIIIIIIII)V")
	public Class237(@OriginalArg(0) String arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class252 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt6443 = arg9;
		this.anInt6436 = arg3;
		this.anInt6444 = arg5;
		this.anInt6442 = arg10;
		this.anInt6439 = arg6;
		this.anInt6438 = arg8;
		this.anInt6441 = arg12;
		this.anInt6446 = arg7;
		this.anInt6437 = arg4;
		this.aClass252_10 = arg2;
		this.aString53 = arg0;
		this.anInt6445 = arg11;
		this.aClass97_11 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Lclient!hm;")
	@Override
	public Class151 method8831() {
		return Static225.aClass151_4;
	}
}
