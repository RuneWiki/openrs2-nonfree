import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class233 implements Interface19 {

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
	public final int anInt6475;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "Lclient!rc;")
	public final Class279 aClass279_11;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
	public final int anInt6479;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
	public final int anInt6476;

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
	public final int anInt6483;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
	public final int anInt6473;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
	public final int anInt6482;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
	public final int anInt6478;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "Lclient!ct;")
	public final Class62 aClass62_13;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
	public final int anInt6474;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
	public final int anInt6480;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
	public final int anInt6472;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ct;Lclient!rc;IIIIIIIIII)V")
	public Class233(@OriginalArg(0) String arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt6475 = arg5;
		this.aClass279_11 = arg2;
		this.anInt6479 = arg12;
		this.anInt6476 = arg8;
		this.anInt6483 = arg3;
		this.anInt6473 = arg10;
		this.anInt6482 = arg9;
		this.aString56 = arg0;
		this.anInt6478 = arg4;
		this.aClass62_13 = arg1;
		this.anInt6474 = arg11;
		this.anInt6480 = arg6;
		this.anInt6472 = arg7;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static161.aClass357_3;
	}
}
