import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
	private int anInt4125 = 2;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	private int anInt4118 = 5;

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "[B")
	private byte[] aByteArray53 = new byte[512];

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
	private int anInt4121 = 0;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
	private int anInt4117 = 1;

	@OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
	private int anInt4128 = 5;

	@OriginalMember(owner = "client!oa", name = "db", descriptor = "I")
	private int anInt4129 = 2048;

	@OriginalMember(owner = "client!oa", name = "hb", descriptor = "[S")
	private short[] aShortArray63 = new short[512];

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		this.aByteArray53 = Static132.method2273(this.anInt4121);
		this.method3312();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)V")
	private void method3312() {
		@Pc(8) Random local8 = new Random((long) this.anInt4121);
		this.aShortArray63 = new short[512];
		if (this.anInt4129 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray63[local27] = (short) Static13.method291(this.anInt4129, local8);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(30) int local30 = this.anInt4128 * Static98.anIntArray221[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static75.anInt1848; local40++) {
				Static281.anInt6016 = Integer.MAX_VALUE;
				Static277.anInt5946 = Integer.MAX_VALUE;
				Static138.anInt3117 = Integer.MAX_VALUE;
				Static233.anInt5146 = Integer.MAX_VALUE;
				@Pc(60) int local60 = this.anInt4118 * Static157.anIntArray331[local40] + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(158) int local158;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(98) int local98 = this.aByteArray53[(this.anInt4128 <= local72 ? local72 - this.anInt4128 : local72) & 0xFF] & 0xFF;
					for (@Pc(102) int local102 = local64 - 1; local102 <= local68; local102++) {
						@Pc(131) int local131 = (this.aByteArray53[(this.anInt4118 > local102 ? local102 : local102 - this.anInt4118) + local98 & 0xFF] & 0xFF) * 2;
						@Pc(136) int local136 = local60 - (local102 << 12);
						@Pc(140) int local140 = local131 + 1;
						@Pc(143) int local143 = local136 - this.aShortArray63[local131];
						@Pc(155) int local155 = local30 - (local72 << 12) - this.aShortArray63[local140];
						local158 = this.anInt4117;
						@Pc(199) int local199;
						if (local158 == 1) {
							local199 = local143 * local143 + local155 * local155 >> 12;
						} else if (local158 == 3) {
							local143 = local143 < 0 ? -local143 : local143;
							local155 = local155 < 0 ? -local155 : local155;
							local199 = local155 < local143 ? local143 : local155;
						} else if (local158 == 4) {
							local143 = (int) (Math.sqrt((double) ((float) (local143 < 0 ? -local143 : local143) / 4096.0F)) * 4096.0D);
							local155 = (int) (Math.sqrt((double) ((float) (local155 >= 0 ? local155 : -local155) / 4096.0F)) * 4096.0D);
							local199 = local143 + local155;
							local199 = local199 * local199 >> 12;
						} else if (local158 == 5) {
							local143 *= local143;
							local155 *= local155;
							local199 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local143 + local155) / 1.6777216E7F))) * 4096.0D);
						} else if (local158 == 2) {
							local199 = (local155 >= 0 ? local155 : -local155) + (local143 >= 0 ? local143 : -local143);
						} else {
							local199 = (int) (Math.sqrt((double) ((float) (local143 * local143 + local155 * local155) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static233.anInt5146 > local199) {
							Static281.anInt6016 = Static277.anInt5946;
							Static277.anInt5946 = Static138.anInt3117;
							Static138.anInt3117 = Static233.anInt5146;
							Static233.anInt5146 = local199;
						} else if (Static138.anInt3117 > local199) {
							Static281.anInt6016 = Static277.anInt5946;
							Static277.anInt5946 = Static138.anInt3117;
							Static138.anInt3117 = local199;
						} else if (local199 < Static277.anInt5946) {
							Static281.anInt6016 = Static277.anInt5946;
							Static277.anInt5946 = local199;
						} else if (Static281.anInt6016 > local199) {
							Static281.anInt6016 = local199;
						}
					}
				}
				local158 = this.anInt4125;
				if (local158 == 0) {
					local13[local40] = Static233.anInt5146;
				} else if (local158 == 1) {
					local13[local40] = Static138.anInt3117;
				} else if (local158 == 3) {
					local13[local40] = Static277.anInt5946;
				} else if (local158 == 4) {
					local13[local40] = Static281.anInt6016;
				} else if (local158 == 2) {
					local13[local40] = Static138.anInt3117 - Static233.anInt5146;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4118 = this.anInt4128 = arg0.method2655();
		} else if (arg1 == 1) {
			this.anInt4121 = arg0.method2655();
		} else if (arg1 == 2) {
			this.anInt4129 = arg0.method2652();
		} else if (arg1 == 3) {
			this.anInt4125 = arg0.method2655();
		} else if (arg1 == 4) {
			this.anInt4117 = arg0.method2655();
		} else if (arg1 == 5) {
			this.anInt4118 = arg0.method2655();
		} else if (arg1 == 6) {
			this.anInt4128 = arg0.method2655();
		}
	}
}
