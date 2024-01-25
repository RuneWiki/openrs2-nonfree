import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class141_Sub3 extends Class141 {

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "[B")
	public static final byte[] aByteArray93;

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
	private final int anInt8246;

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
	private final int anInt8241;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	private final int anInt8249;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
	private final int anInt8242;

	static {
		@Pc(1) int local1 = 0;
		aByteArray93 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray93[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIII)V")
	public Class141_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8246 = arg1;
		this.anInt8241 = arg0;
		this.anInt8249 = arg3;
		this.anInt8242 = arg2;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII)V")
	@Override
	public void method7715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8241 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt8242 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt8246 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt8249 >> 12;
		Static430.method6702(local39, super.anInt8957, local32, local25, local10);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8241 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt8242 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt8246 >> 12;
		@Pc(36) int local36 = this.anInt8249 * arg1 >> 12;
		Static534.method7806(super.anInt8957, local10, local29, local17, local36, super.anInt8955, super.anInt8951);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	@Override
	public void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt8241 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt8242 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt8246 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt8249 * arg0 >> 12;
		Static576.method8183(local32, local39, super.anInt8951, local25, super.anInt8955, local18);
	}
}
