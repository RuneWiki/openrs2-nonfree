import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class256_Sub1 extends Class256 {

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	public final int anInt5988;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(ILclient!ps;Lclient!ft;III)V")
	public Class256_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5988 = arg5;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return Static132.aClass210_6;
	}
}
