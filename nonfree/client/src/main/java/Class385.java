import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public final class Class385 implements Interface27 {

	@OriginalMember(owner = "client!wda", name = "q", descriptor = "Lclient!fe;")
	public final Class103 aClass103_13;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
	public final int anInt11216;

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
	public final int anInt11214;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
	public final int anInt11217;

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
	public final int anInt11210;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
	public final int anInt11221;

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
	public final int anInt11220;

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
	public final int anInt11213;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
	public final int anInt11218;

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
	public final int anInt11211;

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "Lclient!mp;")
	public final Class236 aClass236_13;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString129;

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
	public final int anInt11219;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!mp;Lclient!fe;IIIIIIIIII)V")
	public Class385(@OriginalArg(0) String arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass103_13 = arg2;
		this.anInt11216 = arg10;
		this.anInt11214 = arg11;
		this.anInt11217 = arg12;
		this.anInt11210 = arg4;
		this.anInt11221 = arg7;
		this.anInt11220 = arg8;
		this.anInt11213 = arg5;
		this.anInt11218 = arg6;
		this.anInt11211 = arg9;
		this.aClass236_13 = arg1;
		this.aString129 = arg0;
		this.anInt11219 = arg3;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Lclient!hl;")
	@Override
	public Class148 method9592() {
		return Static135.aClass148_6;
	}
}
