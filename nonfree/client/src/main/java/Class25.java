import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public abstract class Class25 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "[I")
	public static int[] anIntArray608 = new int[256];

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(13) int local13 = local6;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray608[local6] = local13;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()Z")
	public boolean method4766() {
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	public abstract void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	public abstract void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!h;IIIZ)V")
	public void method4770(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lclient!h;")
	public Class25 method4771() {
		return this;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
	public abstract int method4773();
}
