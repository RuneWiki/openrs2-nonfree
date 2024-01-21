import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "[B")
	public static final byte[] aByteArray22 = new byte[32896];

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	private int anInt1866 = 4096;

	static {
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			for (@Pc(27) int local27 = 0; local27 <= local24; local27++) {
				aByteArray22[local22++] = (byte) (255.0D / Math.sqrt((double) ((float) (local24 * local24 + local27 * local27 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(33) int[] local33 = this.method3569(arg0 - 1 & Static53.anInt1668, 0);
			@Pc(39) int[] local39 = this.method3569(arg0, 0);
			@Pc(49) int[] local49 = this.method3569(Static53.anInt1668 & arg0 + 1, 0);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static106.anInt3045; local63++) {
				@Pc(85) int local85 = (local39[Static96.anInt3099 & local63 + 1] - local39[local63 - 1 & Static96.anInt3099]) * this.anInt1866;
				@Pc(96) int local96 = (local49[local63] - local33[local63]) * this.anInt1866;
				@Pc(100) int local100 = local85 >> 12;
				@Pc(104) int local104 = local96 >> 12;
				@Pc(110) int local110 = local100 * local100 >> 12;
				@Pc(116) int local116 = local104 * local104 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local110 + local116 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137;
				@Pc(141) int local141;
				@Pc(139) int local139;
				if (local130 == 0) {
					local137 = 0;
					local139 = 0;
					local141 = 0;
				} else {
					local139 = 16777216 / local130;
					local141 = local96 / local130;
					local137 = local85 / local130;
				}
				if (this.aBoolean77) {
					local139 = (local139 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local53[local63] = local137;
				local57[local63] = local141;
				local61[local63] = local139;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt1866 = arg1.method234();
		} else if (arg0 == 1) {
			this.aBoolean77 = arg1.method218() == 1;
		}
	}
}
