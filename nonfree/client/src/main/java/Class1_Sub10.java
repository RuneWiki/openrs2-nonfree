import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "[I")
	public static int[] anIntArray231 = new int[256];

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	public final int anInt1958;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	private final int anInt1956;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "[[I")
	public final int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "[I")
	public final int[] anIntArray232;

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
			anIntArray231[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1958 = arg0;
		@Pc(9) Class1_Sub5 local9 = new Class1_Sub5(arg1);
		this.anInt1956 = local9.method716();
		this.anIntArrayArray39 = new int[this.anInt1956][];
		this.anIntArray232 = new int[this.anInt1956];
		for (@Pc(26) int local26 = 0; local26 < this.anInt1956; local26++) {
			this.anIntArray232[local26] = local9.method716();
		}
		for (@Pc(41) int local41 = 0; local41 < this.anInt1956; local41++) {
			this.anIntArrayArray39[local41] = new int[local9.method716()];
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt1956; local57++) {
			for (@Pc(60) int local60 = 0; local60 < this.anIntArrayArray39[local57].length; local60++) {
				this.anIntArrayArray39[local57][local60] = local9.method716();
			}
		}
	}
}
