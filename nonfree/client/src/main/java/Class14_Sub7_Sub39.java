import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class14_Sub7_Sub39 extends Class14_Sub7 {

	@OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
	private int anInt11075 = 0;

	@OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
	private int anInt11076 = 5;

	@OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
	private int anInt11078 = 2;

	@OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
	private int anInt11071 = 2048;

	@OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
	private int anInt11074 = 1;

	@OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
	private int anInt11077 = 5;

	@OriginalMember(owner = "client!wm", name = "R", descriptor = "[S")
	private short[] aShortArray147 = new short[512];

	@OriginalMember(owner = "client!wm", name = "O", descriptor = "[B")
	private byte[] aByteArray110 = new byte[512];

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		this.aByteArray110 = Static574.method8194(this.anInt11075);
		this.method9392();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt11077 = this.anInt11076 = arg1.method7695(110);
		} else if (arg0 == 1) {
			this.anInt11075 = arg1.method7695(119);
		} else if (arg0 == 2) {
			this.anInt11071 = arg1.method7717(-1978450544);
		} else if (arg0 == 3) {
			this.anInt11078 = arg1.method7695(112);
		} else if (arg0 == 4) {
			this.anInt11074 = arg1.method7695(105);
		} else if (arg0 == 5) {
			this.anInt11077 = arg1.method7695(123);
		} else if (arg0 == 6) {
			this.anInt11076 = arg1.method7695(126);
		}
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(I)V")
	private void method9392() {
		@Pc(20) Random local20 = new Random((long) this.anInt11075);
		this.aShortArray147 = new short[512];
		if (this.anInt11071 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray147[local29] = (short) Static645.method9067(this.anInt11071, local20);
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(32) int local32 = this.anInt11076 * Static655.anIntArray573[arg0] + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static613.anInt10114; local42++) {
				Static317.anInt5549 = Integer.MAX_VALUE;
				Static381.anInt6707 = Integer.MAX_VALUE;
				Static391.anInt6812 = Integer.MAX_VALUE;
				Static554.anInt9275 = Integer.MAX_VALUE;
				@Pc(62) int local62 = this.anInt11077 * Static588.anIntArray506[local42] + 2048;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(70) int local70 = local66 + 1;
				@Pc(167) int local167;
				for (@Pc(74) int local74 = local36 - 1; local74 <= local40; local74++) {
					@Pc(102) int local102 = this.aByteArray110[(local74 >= this.anInt11076 ? local74 - this.anInt11076 : local74) & 0xFF] & 0xFF;
					for (@Pc(106) int local106 = local66 - 1; local106 <= local70; local106++) {
						@Pc(138) int local138 = (this.aByteArray110[(local106 >= this.anInt11077 ? local106 - this.anInt11077 : local106) + local102 & 0xFF] & 0xFF) * 2;
						@Pc(142) int local142 = -(local106 << 12);
						@Pc(146) int local146 = local138 + 1;
						@Pc(151) int local151 = local142 + local62 - this.aShortArray147[local138];
						@Pc(164) int local164 = local32 - (local74 << 12) - this.aShortArray147[local146];
						local167 = this.anInt11074;
						@Pc(207) int local207;
						if (local167 == 1) {
							local207 = local151 * local151 + local164 * local164 >> 12;
						} else if (local167 == 3) {
							local164 = local164 >= 0 ? local164 : -local164;
							local151 = local151 < 0 ? -local151 : local151;
							local207 = local151 <= local164 ? local164 : local151;
						} else if (local167 == 4) {
							local151 = (int) (Math.sqrt((double) ((float) (local151 < 0 ? -local151 : local151) / 4096.0F)) * 4096.0D);
							local164 = (int) (Math.sqrt((double) ((float) (local164 >= 0 ? local164 : -local164) / 4096.0F)) * 4096.0D);
							local207 = local151 + local164;
							local207 = local207 * local207 >> 12;
						} else if (local167 == 5) {
							local164 *= local164;
							local151 *= local151;
							local207 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local151 + local164) / 1.6777216E7F))) * 4096.0D);
						} else if (local167 == 2) {
							local207 = (local164 >= 0 ? local164 : -local164) + (local151 < 0 ? -local151 : local151);
						} else {
							local207 = (int) (Math.sqrt((double) ((float) (local164 * local164 + local151 * local151) / 1.6777216E7F)) * 4096.0D);
						}
						if (local207 < Static554.anInt9275) {
							Static317.anInt5549 = Static381.anInt6707;
							Static381.anInt6707 = Static391.anInt6812;
							Static391.anInt6812 = Static554.anInt9275;
							Static554.anInt9275 = local207;
						} else if (local207 < Static391.anInt6812) {
							Static317.anInt5549 = Static381.anInt6707;
							Static381.anInt6707 = Static391.anInt6812;
							Static391.anInt6812 = local207;
						} else if (Static381.anInt6707 > local207) {
							Static317.anInt5549 = Static381.anInt6707;
							Static381.anInt6707 = local207;
						} else if (local207 < Static317.anInt5549) {
							Static317.anInt5549 = local207;
						}
					}
				}
				local167 = this.anInt11078;
				if (local167 == 0) {
					local19[local42] = Static554.anInt9275;
				} else if (local167 == 1) {
					local19[local42] = Static391.anInt6812;
				} else if (local167 == 3) {
					local19[local42] = Static381.anInt6707;
				} else if (local167 == 4) {
					local19[local42] = Static317.anInt5549;
				} else if (local167 == 2) {
					local19[local42] = Static391.anInt6812 - Static554.anInt9275;
				}
			}
		}
		return local19;
	}
}
