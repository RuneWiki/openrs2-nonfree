import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class247 implements Interface24 {

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Lclient!rq;")
	public final Class306 aClass306_9;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "I")
	public final int anInt6303;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public final int anInt6296;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString85;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	public final int anInt6298;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Lclient!vfa;")
	public final Class361 aClass361_8;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	public final int anInt6302;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public final int anInt6293;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public final int anInt6295;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "I")
	public final int anInt6304;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	public final int anInt6300;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	public final int anInt6294;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public final int anInt6297;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!vfa;Lclient!rq;IIIIIIIIII)V")
	public Class247(@OriginalArg(0) String arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class306 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass306_9 = arg2;
		this.anInt6303 = arg5;
		this.anInt6296 = arg3;
		this.aString85 = arg0;
		this.anInt6298 = arg8;
		this.aClass361_8 = arg1;
		this.anInt6302 = arg11;
		this.anInt6293 = arg9;
		this.anInt6295 = arg7;
		this.anInt6304 = arg10;
		this.anInt6300 = arg12;
		this.anInt6294 = arg6;
		this.anInt6297 = arg4;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Lclient!ag;")
	@Override
	public Class8 method8040() {
		return Static488.aClass8_6;
	}
}
