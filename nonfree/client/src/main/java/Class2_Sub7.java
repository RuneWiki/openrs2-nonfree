import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
	public int anInt5216;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
	public int anInt5219;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	private int anInt5212 = -32768;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIJILclient!dc;)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class34_Sub1 arg10) {
		@Pc(13) Class2_Sub1 local13 = Static56.method1050(this.anInt5219).method1334(-1, 0, this.anInt5216, null, null, 0);
		if (local13 != null) {
			local13.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt5212 = local13.method3948();
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "()I")
	@Override
	public int method3948() {
		return this.anInt5212;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
