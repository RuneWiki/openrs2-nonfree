import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class226_Sub1 extends Class226 {

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
	public final int anInt6819;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(ILclient!mp;Lclient!fe;III)V")
	public Class226_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6819 = arg5;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)Lclient!hl;")
	@Override
	public Class148 method9592() {
		return Static645.aClass148_20;
	}
}
