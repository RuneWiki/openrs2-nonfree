import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class122 {

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "[I")
	public static final int[] anIntArray238 = new int[256];

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
	public int anInt4353;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	public int anInt4355;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
	public int anInt4357;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	public int anInt4352 = 128;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
	public int anInt4358 = 128;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
	public int anInt4361;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray238[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(I)V")
	public Class122(@OriginalArg(0) int arg0) {
		this.anInt4361 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IIIIII)V")
	private Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4361 = arg0;
		this.anInt4355 = arg5;
		this.anInt4352 = arg2;
		this.anInt4353 = arg4;
		this.anInt4357 = arg3;
		this.anInt4358 = arg1;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!gs;I)V")
	public void method3530(@OriginalArg(0) Class122 arg0) {
		this.anInt4352 = arg0.anInt4352;
		this.anInt4358 = arg0.anInt4358;
		this.anInt4355 = arg0.anInt4355;
		this.anInt4361 = arg0.anInt4361;
		this.anInt4353 = arg0.anInt4353;
		this.anInt4357 = arg0.anInt4357;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)Lclient!gs;")
	public Class122 method3531() {
		return new Class122(this.anInt4361, this.anInt4358, this.anInt4352, this.anInt4357, this.anInt4353, this.anInt4355);
	}
}
