import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class5_Sub6_Sub36 extends Class5_Sub6 {

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "[B")
	private byte[] aByteArray89 = new byte[512];

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "[S")
	private short[] aShortArray107 = new short[512];

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
	private int anInt9130 = 5;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
	private int anInt9126 = 0;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
	private int anInt9128 = 2048;

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
	private int anInt9132 = 2;

	@OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
	private int anInt9136 = 1;

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
	private int anInt9129 = 5;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V")
	private void method7675() {
		@Pc(17) Random local17 = new Random((long) this.anInt9126);
		this.aShortArray107 = new short[512];
		if (this.anInt9128 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray107[local29] = (short) Static653.method8578(this.anInt9128, local17);
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		this.aByteArray89 = Static297.method523(this.anInt9126);
		this.method7675();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9130 = this.anInt9129 = arg0.method3642();
		} else if (arg1 == 1) {
			this.anInt9126 = arg0.method3642();
		} else if (arg1 == 2) {
			this.anInt9128 = arg0.method3698();
		} else if (arg1 == 3) {
			this.anInt9132 = arg0.method3642();
		} else if (arg1 == 4) {
			this.anInt9136 = arg0.method3642();
		} else if (arg1 == 5) {
			this.anInt9130 = arg0.method3642();
		} else if (arg1 == 6) {
			this.anInt9129 = arg0.method3642();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(29) int local29 = this.anInt9129 * Static508.anIntArray471[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static421.anInt7443; local39++) {
				Static446.anInt7816 = Integer.MAX_VALUE;
				Static624.anInt10013 = Integer.MAX_VALUE;
				Static482.anInt8295 = Integer.MAX_VALUE;
				Static316.anInt8167 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt9130 * Static207.anIntArray185[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(156) int local156;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(95) int local95 = this.aByteArray89[(this.anInt9129 > local70 ? local70 : local70 - this.anInt9129) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local62 - 1; local99 <= local66; local99++) {
						@Pc(128) int local128 = (this.aByteArray89[local95 + (local99 < this.anInt9130 ? local99 : local99 - this.anInt9130) & 0xFF] & 0xFF) * 2;
						@Pc(133) int local133 = local128 + 1;
						@Pc(141) int local141 = local58 - this.aShortArray107[local128] - (local99 << 12);
						@Pc(153) int local153 = local29 - this.aShortArray107[local133] - (local70 << 12);
						local156 = this.anInt9136;
						@Pc(190) int local190;
						if (local156 == 1) {
							local190 = local141 * local141 + local153 * local153 >> 12;
						} else if (local156 == 3) {
							local141 = local141 < 0 ? -local141 : local141;
							local153 = local153 < 0 ? -local153 : local153;
							local190 = local141 > local153 ? local141 : local153;
						} else if (local156 == 4) {
							local141 = (int) (Math.sqrt((double) ((float) (local141 < 0 ? -local141 : local141) / 4096.0F)) * 4096.0D);
							local153 = (int) (Math.sqrt((double) ((float) (local153 < 0 ? -local153 : local153) / 4096.0F)) * 4096.0D);
							local190 = local141 + local153;
							local190 = local190 * local190 >> 12;
						} else if (local156 == 5) {
							local153 *= local153;
							local141 *= local141;
							local190 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local153 + local141) / 1.6777216E7F))) * 4096.0D);
						} else if (local156 == 2) {
							local190 = (local141 >= 0 ? local141 : -local141) + (local153 >= 0 ? local153 : -local153);
						} else {
							local190 = (int) (Math.sqrt((double) ((float) (local153 * local153 + local141 * local141) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static316.anInt8167 > local190) {
							Static446.anInt7816 = Static624.anInt10013;
							Static624.anInt10013 = Static482.anInt8295;
							Static482.anInt8295 = Static316.anInt8167;
							Static316.anInt8167 = local190;
						} else if (local190 < Static482.anInt8295) {
							Static446.anInt7816 = Static624.anInt10013;
							Static624.anInt10013 = Static482.anInt8295;
							Static482.anInt8295 = local190;
						} else if (local190 < Static624.anInt10013) {
							Static446.anInt7816 = Static624.anInt10013;
							Static624.anInt10013 = local190;
						} else if (local190 < Static446.anInt7816) {
							Static446.anInt7816 = local190;
						}
					}
				}
				local156 = this.anInt9132;
				if (local156 == 0) {
					local11[local39] = Static316.anInt8167;
				} else if (local156 == 1) {
					local11[local39] = Static482.anInt8295;
				} else if (local156 == 3) {
					local11[local39] = Static624.anInt10013;
				} else if (local156 == 4) {
					local11[local39] = Static446.anInt7816;
				} else if (local156 == 2) {
					local11[local39] = Static482.anInt8295 - Static316.anInt8167;
				}
			}
		}
		return local11;
	}
}
