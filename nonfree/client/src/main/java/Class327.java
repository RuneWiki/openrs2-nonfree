import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class327 implements Interface18 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	public final int anInt9317;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
	public final int anInt9308;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "Lclient!qk;")
	public final Class304 aClass304_13;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Lclient!kr;")
	public final Class216 aClass216_11;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	public final int anInt9316;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "Z")
	public final boolean aBoolean682;

	@OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
	public final int anInt9313;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
	public final int anInt9312;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
	public final int anInt9307;

	@OriginalMember(owner = "client!rq", name = "q", descriptor = "I")
	public final int anInt9309;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
	public final int anInt9315;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(ILclient!qk;Lclient!kr;IIIIIIIZ)V")
	public Class327(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(2) Class216 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt9317 = arg7;
		this.anInt9308 = arg0;
		this.aClass304_13 = arg1;
		this.aClass216_11 = arg2;
		this.anInt9316 = arg9;
		this.aBoolean682 = arg10;
		this.anInt9313 = arg4;
		this.anInt9312 = arg5;
		this.anInt9307 = arg8;
		this.anInt9309 = arg3;
		this.anInt9315 = arg6;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static660.aClass409_15;
	}
}
