import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class4_Sub4_Sub30 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qi", name = "S", descriptor = "[B")
	private byte[] aByteArray81 = new byte[512];

	@OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
	private int anInt5342 = 5;

	@OriginalMember(owner = "client!qi", name = "T", descriptor = "I")
	private int anInt5345 = 2;

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
	private int anInt5343 = 0;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
	private int anInt5339 = 1;

	@OriginalMember(owner = "client!qi", name = "X", descriptor = "I")
	private int anInt5347 = 2048;

	@OriginalMember(owner = "client!qi", name = "W", descriptor = "[S")
	private short[] aShortArray106 = new short[512];

	@OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
	private int anInt5337 = 5;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		this.aByteArray81 = Static110.method2038(this.anInt5343);
		this.method4426();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5342 = this.anInt5337 = arg1.method2380();
		} else if (arg0 == 1) {
			this.anInt5343 = arg1.method2380();
		} else if (arg0 == 2) {
			this.anInt5347 = arg1.method2404();
		} else if (arg0 == 3) {
			this.anInt5345 = arg1.method2380();
		} else if (arg0 == 4) {
			this.anInt5339 = arg1.method2380();
		} else if (arg0 == 5) {
			this.anInt5342 = arg1.method2380();
		} else if (arg0 == 6) {
			this.anInt5337 = arg1.method2380();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(29) int local29 = this.anInt5337 * Static64.anIntArray148[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static124.anInt3576; local39++) {
				Static224.anInt4675 = Integer.MAX_VALUE;
				Static121.anInt2733 = Integer.MAX_VALUE;
				Static210.anInt5560 = Integer.MAX_VALUE;
				Static158.anInt3546 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt5342 * Static149.anIntArray298[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(153) int local153;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(91) int local91 = this.aByteArray81[(local70 >= this.anInt5337 ? local70 - this.anInt5337 : local70) & 0xFF] & 0xFF;
					for (@Pc(95) int local95 = local62 - 1; local95 <= local66; local95++) {
						@Pc(125) int local125 = (this.aByteArray81[local91 + (this.anInt5342 <= local95 ? local95 - this.anInt5342 : local95) & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local125 + 1;
						@Pc(138) int local138 = local58 - this.aShortArray106[local125] - (local95 << 12);
						@Pc(150) int local150 = local29 - this.aShortArray106[local129] - (local70 << 12);
						local153 = this.anInt5339;
						@Pc(187) int local187;
						if (local153 == 1) {
							local187 = local138 * local138 + local150 * local150 >> 12;
						} else if (local153 == 3) {
							local150 = local150 >= 0 ? local150 : -local150;
							local138 = local138 < 0 ? -local138 : local138;
							local187 = local150 >= local138 ? local150 : local138;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 >= 0 ? local138 : -local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 >= 0 ? local150 : -local150) / 4096.0F)) * 4096.0D);
							local187 = local150 + local138;
							local187 = local187 * local187 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local138 *= local138;
							local187 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local150) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local187 = (local150 >= 0 ? local150 : -local150) + (local138 < 0 ? -local138 : local138);
						} else {
							local187 = (int) (Math.sqrt((double) ((float) (local150 * local150 + local138 * local138) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static158.anInt3546 > local187) {
							Static224.anInt4675 = Static121.anInt2733;
							Static121.anInt2733 = Static210.anInt5560;
							Static210.anInt5560 = Static158.anInt3546;
							Static158.anInt3546 = local187;
						} else if (local187 < Static210.anInt5560) {
							Static224.anInt4675 = Static121.anInt2733;
							Static121.anInt2733 = Static210.anInt5560;
							Static210.anInt5560 = local187;
						} else if (local187 < Static121.anInt2733) {
							Static224.anInt4675 = Static121.anInt2733;
							Static121.anInt2733 = local187;
						} else if (local187 < Static224.anInt4675) {
							Static224.anInt4675 = local187;
						}
					}
				}
				local153 = this.anInt5345;
				if (local153 == 0) {
					local16[local39] = Static158.anInt3546;
				} else if (local153 == 1) {
					local16[local39] = Static210.anInt5560;
				} else if (local153 == 3) {
					local16[local39] = Static121.anInt2733;
				} else if (local153 == 4) {
					local16[local39] = Static224.anInt4675;
				} else if (local153 == 2) {
					local16[local39] = Static210.anInt5560 - Static158.anInt3546;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
	private void method4426() {
		@Pc(12) Random local12 = new Random((long) this.anInt5343);
		this.aShortArray106 = new short[512];
		if (this.anInt5347 > 0) {
			for (@Pc(22) int local22 = 0; local22 < 512; local22++) {
				this.aShortArray106[local22] = (short) Static130.method2621(local12, this.anInt5347);
			}
		}
	}
}
