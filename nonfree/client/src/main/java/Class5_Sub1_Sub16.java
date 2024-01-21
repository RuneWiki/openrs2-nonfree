import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class5_Sub1_Sub16 extends Class5_Sub1 {

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "[B")
	public static final byte[] aByteArray24 = new byte[32896];

	@OriginalMember(owner = "client!id", name = "N", descriptor = "[I")
	private final int[] anIntArray172 = new int[3];

	@OriginalMember(owner = "client!id", name = "S", descriptor = "I")
	private int anInt1772 = 4096;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "I")
	private int anInt1771 = 409;

	@OriginalMember(owner = "client!id", name = "M", descriptor = "I")
	private int anInt1768 = 4096;

	@OriginalMember(owner = "client!id", name = "V", descriptor = "I")
	private int anInt1775 = 4096;

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			for (@Pc(19) int local19 = 0; local19 <= local16; local19++) {
				aByteArray24[local14++] = (byte) (255.0D / Math.sqrt((double) ((float) (local16 * local16 + local19 * local19 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1771 = arg0.method3077();
		} else if (arg1 == 1) {
			this.anInt1772 = arg0.method3077();
		} else if (arg1 == 2) {
			this.anInt1775 = arg0.method3077();
		} else if (arg1 == 3) {
			this.anInt1768 = arg0.method3077();
		} else if (arg1 == 4) {
			@Pc(60) int local60 = arg0.method3072();
			this.anIntArray172[1] = local60 >> 4 & 0xFF0;
			this.anIntArray172[2] = local60 >> 12 & 0x0;
			this.anIntArray172[0] = (local60 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(31) int[][] local31 = this.method3191(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[2];
			@Pc(43) int[] local43 = local31[1];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static174.anInt3489; local57++) {
				@Pc(63) int local63 = local35[local57];
				@Pc(71) int local71 = local63 - this.anIntArray172[0];
				if (local71 < 0) {
					local71 = -local71;
				}
				if (local71 > this.anInt1771) {
					local47[local57] = local63;
					local51[local57] = local43[local57];
					local55[local57] = local39[local57];
				} else {
					@Pc(102) int local102 = local43[local57];
					local71 = local102 - this.anIntArray172[1];
					if (local71 < 0) {
						local71 = -local71;
					}
					if (this.anInt1771 < local71) {
						local47[local57] = local63;
						local51[local57] = local102;
						local55[local57] = local39[local57];
					} else {
						@Pc(138) int local138 = local39[local57];
						local71 = local138 - this.anIntArray172[2];
						if (local71 < 0) {
							local71 = -local71;
						}
						if (local71 > this.anInt1771) {
							local47[local57] = local63;
							local51[local57] = local102;
							local55[local57] = local138;
						} else {
							local47[local57] = this.anInt1768 * local63 >> 12;
							local51[local57] = local102 * this.anInt1775 >> 12;
							local55[local57] = local138 * this.anInt1772 >> 12;
						}
					}
				}
			}
		}
		return local21;
	}
}
