import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class167_Sub1 extends Class167 {

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
	public final int anInt6598;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(ILclient!og;Lclient!ega;III)V")
	public Class167_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6598 = arg5;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class152 method5661() {
		return Static83.aClass152_3;
	}
}
