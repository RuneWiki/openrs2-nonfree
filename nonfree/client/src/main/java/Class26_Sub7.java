import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class26_Sub7 extends Class26 {

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
	public int anInt3879;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
	public int anInt3887;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
	private int anInt3889 = -32768;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "()I")
	@Override
	public int method2995() {
		return this.anInt3889;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class26_Sub6 local14 = Static14.method275(this.anInt3887).method905(null, this.anInt3879, 0);
		if (local14 != null) {
			local14.method2993(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3889 = local14.method2995();
		}
	}
}
