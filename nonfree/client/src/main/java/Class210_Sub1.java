import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class210_Sub1 extends Class210 {

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
	public final int anInt6229;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(ILclient!fw;Lclient!dg;III)V")
	public Class210_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6229 = arg5;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return Static335.aClass136_35;
	}
}
