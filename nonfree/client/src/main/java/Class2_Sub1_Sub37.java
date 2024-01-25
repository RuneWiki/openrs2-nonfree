import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class2_Sub1_Sub37 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
	private int anInt6857 = 2;

	@OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
	private int anInt6854 = 2048;

	@OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
	private int anInt6858 = 0;

	@OriginalMember(owner = "client!vq", name = "T", descriptor = "[S")
	private short[] aShortArray115 = new short[512];

	@OriginalMember(owner = "client!vq", name = "V", descriptor = "I")
	private int anInt6862 = 5;

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "[B")
	private byte[] aByteArray101 = new byte[512];

	@OriginalMember(owner = "client!vq", name = "X", descriptor = "I")
	private int anInt6864 = 5;

	@OriginalMember(owner = "client!vq", name = "ab", descriptor = "I")
	private int anInt6866 = 1;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt6862 = this.anInt6864 = arg1.method5732();
		} else if (arg0 == 1) {
			this.anInt6858 = arg1.method5732();
		} else if (arg0 == 2) {
			this.anInt6854 = arg1.method5753();
		} else if (arg0 == 3) {
			this.anInt6857 = arg1.method5732();
		} else if (arg0 == 4) {
			this.anInt6866 = arg1.method5732();
		} else if (arg0 == 5) {
			this.anInt6862 = arg1.method5732();
		} else if (arg0 == 6) {
			this.anInt6864 = arg1.method5732();
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		this.aByteArray101 = Static19.method213(this.anInt6858);
		this.method5933();
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
	private void method5933() {
		@Pc(12) Random local12 = new Random((long) this.anInt6858);
		this.aShortArray115 = new short[512];
		if (this.anInt6854 > 0) {
			for (@Pc(22) int local22 = 0; local22 < 512; local22++) {
				this.aShortArray115[local22] = (short) Static371.method5907(this.anInt6854, local12);
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(29) int local29 = this.anInt6864 * Static229.anIntArray382[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static391.anInt7118; local39++) {
				Static24.anInt367 = Integer.MAX_VALUE;
				Static10.anInt6518 = Integer.MAX_VALUE;
				Static114.anInt2524 = Integer.MAX_VALUE;
				Static127.anInt2767 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt6862 * Static167.anIntArray267[local39] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(153) int local153;
				for (@Pc(71) int local71 = local33 - 1; local71 <= local37; local71++) {
					@Pc(96) int local96 = this.aByteArray101[(local71 < this.anInt6864 ? local71 : local71 - this.anInt6864) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(125) int local125 = (this.aByteArray101[(local100 >= this.anInt6862 ? local100 - this.anInt6862 : local100) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local125 + 1;
						@Pc(138) int local138 = local59 - this.aShortArray115[local125] - (local100 << 12);
						@Pc(150) int local150 = local29 - (local71 << 12) - this.aShortArray115[local129];
						local153 = this.anInt6866;
						@Pc(188) int local188;
						if (local153 == 1) {
							local188 = local150 * local150 + local138 * local138 >> 12;
						} else if (local153 == 3) {
							local150 = local150 < 0 ? -local150 : local150;
							local138 = local138 >= 0 ? local138 : -local138;
							local188 = local150 >= local138 ? local150 : local138;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 < 0 ? -local138 : local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 >= 0 ? local150 : -local150) / 4096.0F)) * 4096.0D);
							local188 = local150 + local138;
							local188 = local188 * local188 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local138 *= local138;
							local188 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local150) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local188 = (local150 >= 0 ? local150 : -local150) + (local138 < 0 ? -local138 : local138);
						} else {
							local188 = (int) (Math.sqrt((double) ((float) (local150 * local150 + local138 * local138) / 1.6777216E7F)) * 4096.0D);
						}
						if (local188 < Static127.anInt2767) {
							Static24.anInt367 = Static10.anInt6518;
							Static10.anInt6518 = Static114.anInt2524;
							Static114.anInt2524 = Static127.anInt2767;
							Static127.anInt2767 = local188;
						} else if (local188 < Static114.anInt2524) {
							Static24.anInt367 = Static10.anInt6518;
							Static10.anInt6518 = Static114.anInt2524;
							Static114.anInt2524 = local188;
						} else if (local188 < Static10.anInt6518) {
							Static24.anInt367 = Static10.anInt6518;
							Static10.anInt6518 = local188;
						} else if (Static24.anInt367 > local188) {
							Static24.anInt367 = local188;
						}
					}
				}
				local153 = this.anInt6857;
				if (local153 == 0) {
					local16[local39] = Static127.anInt2767;
				} else if (local153 == 1) {
					local16[local39] = Static114.anInt2524;
				} else if (local153 == 3) {
					local16[local39] = Static10.anInt6518;
				} else if (local153 == 4) {
					local16[local39] = Static24.anInt367;
				} else if (local153 == 2) {
					local16[local39] = Static114.anInt2524 - Static127.anInt2767;
				}
			}
		}
		return local16;
	}
}
