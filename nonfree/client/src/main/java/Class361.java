import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class361 implements Interface24 {

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
	public final int anInt10281;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Lclient!cu;")
	public final Class60 aClass60_12;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public final int anInt10274;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
	public final int anInt10280;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
	public final int anInt10279;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "Z")
	public final boolean aBoolean738;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Lclient!kda;")
	public final Class173 aClass173_13;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
	public final int anInt10278;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	public final int anInt10277;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
	public final int anInt10273;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
	public final int anInt10272;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(ILclient!kda;Lclient!cu;IIIIIIIZ)V")
	public Class361(@OriginalArg(0) int arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt10281 = arg5;
		this.aClass60_12 = arg2;
		this.anInt10274 = arg9;
		this.anInt10280 = arg0;
		this.anInt10279 = arg6;
		this.aBoolean738 = arg10;
		this.aClass173_13 = arg1;
		this.anInt10278 = arg8;
		this.anInt10277 = arg4;
		this.anInt10273 = arg7;
		this.anInt10272 = arg3;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return Static124.aClass138_2;
	}
}
