import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public final class Class226 implements Interface2 {

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
	public final int anInt6185;

	@OriginalMember(owner = "client!nga", name = "p", descriptor = "Lclient!fn;")
	public final Class103 aClass103_15;

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
	public final int anInt6190;

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
	public final int anInt6187;

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
	public final int anInt6188;

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
	public final int anInt6184;

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "Lclient!tl;")
	public final Class314 aClass314_8;

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
	public final int anInt6183;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
	public final int anInt6179;

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
	public final int anInt6180;

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
	public final int anInt6181;

	@OriginalMember(owner = "client!nga", name = "o", descriptor = "I")
	public final int anInt6189;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!tl;Lclient!fn;IIIIIIIIII)V")
	public Class226(@OriginalArg(0) String arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt6185 = arg3;
		this.aClass103_15 = arg2;
		this.aString64 = arg0;
		this.anInt6190 = arg8;
		this.anInt6187 = arg11;
		this.anInt6188 = arg6;
		this.anInt6184 = arg12;
		this.aClass314_8 = arg1;
		this.anInt6183 = arg5;
		this.anInt6179 = arg4;
		this.anInt6180 = arg9;
		this.anInt6181 = arg7;
		this.anInt6189 = arg10;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return Static558.aClass307_17;
	}
}
