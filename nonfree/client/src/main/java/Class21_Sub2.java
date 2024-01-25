import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
	public final int anInt7277;

	@OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
	public final int anInt7274;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!og;Lclient!gi;IIIIIIIII)V")
	public Class21_Sub2(@OriginalArg(0) Class266 arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt7277 = arg10;
		this.anInt7274 = arg9;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return Static360.aClass108_8;
	}
}
