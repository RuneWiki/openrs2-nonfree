import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class97_Sub1 extends Class97 {

	@OriginalMember(owner = "client!on", name = "q", descriptor = "I")
	public final int anInt6639;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(ILclient!ut;Lclient!gi;III)V")
	public Class97_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6639 = arg5;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)Lclient!rw;")
	@Override
	public Class297 method7306() {
		return Static5.aClass297_2;
	}
}
