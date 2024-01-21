import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
	private int anInt2304 = 5;

	@OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
	private int anInt2302 = 1;

	@OriginalMember(owner = "client!kf", name = "lb", descriptor = "I")
	private int anInt2309 = 5;

	@OriginalMember(owner = "client!kf", name = "ob", descriptor = "[S")
	private short[] aShortArray29 = new short[512];

	@OriginalMember(owner = "client!kf", name = "mb", descriptor = "I")
	private int anInt2310 = 2;

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "[B")
	private byte[] aByteArray23 = new byte[512];

	@OriginalMember(owner = "client!kf", name = "sb", descriptor = "I")
	private int anInt2313 = 0;

	@OriginalMember(owner = "client!kf", name = "pb", descriptor = "I")
	private int anInt2311 = 2048;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		this.aByteArray23 = Static103.method1781(this.anInt2313);
		this.method1787();
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(33) int local33 = this.anInt2309 * Static187.anIntArray362[arg0] + 2048;
			@Pc(37) int local37 = local33 >> 12;
			@Pc(41) int local41 = local37 + 1;
			for (@Pc(43) int local43 = 0; local43 < Static115.anInt2578; local43++) {
				Static30.anInt775 = Integer.MAX_VALUE;
				Static25.anInt670 = Integer.MAX_VALUE;
				Static191.anInt4292 = Integer.MAX_VALUE;
				Static105.anInt2368 = Integer.MAX_VALUE;
				@Pc(62) int local62 = Static45.anIntArray97[local43] * this.anInt2304 + 2048;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(70) int local70 = local66 + 1;
				@Pc(158) int local158;
				for (@Pc(74) int local74 = local37 - 1; local74 <= local41; local74++) {
					@Pc(99) int local99 = this.aByteArray23[(local74 < this.anInt2309 ? local74 : local74 - this.anInt2309) & 0xFF] & 0xFF;
					for (@Pc(103) int local103 = local66 - 1; local103 <= local70; local103++) {
						@Pc(129) int local129 = (this.aByteArray23[local99 + (local103 >= this.anInt2304 ? local103 - this.anInt2304 : local103) & 0xFF] & 0xFF) * 2;
						@Pc(133) int local133 = local129 + 1;
						@Pc(143) int local143 = local62 - this.aShortArray29[local129] - (local103 << 12);
						@Pc(155) int local155 = local33 - this.aShortArray29[local133] - (local74 << 12);
						local158 = this.anInt2302;
						@Pc(190) int local190;
						if (local158 == 1) {
							local190 = local143 * local143 + local155 * local155 >> 12;
						} else if (local158 == 3) {
							local155 = local155 < 0 ? -local155 : local155;
							local143 = local143 >= 0 ? local143 : -local143;
							local190 = local155 >= local143 ? local155 : local143;
						} else if (local158 == 4) {
							local143 = (int) (Math.sqrt((double) ((float) (local143 >= 0 ? local143 : -local143) / 4096.0F)) * 4096.0D);
							local155 = (int) (Math.sqrt((double) ((float) (local155 >= 0 ? local155 : -local155) / 4096.0F)) * 4096.0D);
							local190 = local143 + local155;
							local190 = local190 * local190 >> 12;
						} else if (local158 == 5) {
							local143 *= local143;
							local155 *= local155;
							local190 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local155 + local143) / 1.6777216E7F))) * 4096.0D);
						} else if (local158 == 2) {
							local190 = (local155 < 0 ? -local155 : local155) + (local143 < 0 ? -local143 : local143);
						} else {
							local190 = (int) (Math.sqrt((double) ((float) (local155 * local155 + local143 * local143) / 1.6777216E7F)) * 4096.0D);
						}
						if (local190 < Static105.anInt2368) {
							Static30.anInt775 = Static25.anInt670;
							Static25.anInt670 = Static191.anInt4292;
							Static191.anInt4292 = Static105.anInt2368;
							Static105.anInt2368 = local190;
						} else if (local190 < Static191.anInt4292) {
							Static30.anInt775 = Static25.anInt670;
							Static25.anInt670 = Static191.anInt4292;
							Static191.anInt4292 = local190;
						} else if (local190 < Static25.anInt670) {
							Static30.anInt775 = Static25.anInt670;
							Static25.anInt670 = local190;
						} else if (local190 < Static30.anInt775) {
							Static30.anInt775 = local190;
						}
					}
				}
				local158 = this.anInt2310;
				if (local158 == 0) {
					local11[local43] = Static105.anInt2368;
				} else if (local158 == 1) {
					local11[local43] = Static191.anInt4292;
				} else if (local158 == 3) {
					local11[local43] = Static25.anInt670;
				} else if (local158 == 4) {
					local11[local43] = Static30.anInt775;
				} else if (local158 == 2) {
					local11[local43] = Static191.anInt4292 - Static105.anInt2368;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2304 = this.anInt2309 = arg0.method2771();
		} else if (arg1 == 1) {
			this.anInt2313 = arg0.method2771();
		} else if (arg1 == 2) {
			this.anInt2311 = arg0.method2765();
		} else if (arg1 == 3) {
			this.anInt2310 = arg0.method2771();
		} else if (arg1 == 4) {
			this.anInt2302 = arg0.method2771();
		} else if (arg1 == 5) {
			this.anInt2304 = arg0.method2771();
		} else if (arg1 == 6) {
			this.anInt2309 = arg0.method2771();
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
	private void method1787() {
		@Pc(8) Random local8 = new Random((long) this.anInt2313);
		this.aShortArray29 = new short[512];
		if (this.anInt2311 > 0) {
			for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
				this.aShortArray29[local21] = (short) Static132.method2265(this.anInt2311, local8);
			}
		}
	}
}
