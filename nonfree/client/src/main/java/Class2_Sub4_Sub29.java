import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class2_Sub4_Sub29 extends Class2_Sub4 {

	@OriginalMember(owner = "client!rfa", name = "K", descriptor = "[B")
	private byte[] aByteArray72 = new byte[512];

	@OriginalMember(owner = "client!rfa", name = "J", descriptor = "[S")
	private short[] aShortArray114 = new short[512];

	@OriginalMember(owner = "client!rfa", name = "L", descriptor = "I")
	private int anInt7397 = 2048;

	@OriginalMember(owner = "client!rfa", name = "D", descriptor = "I")
	private int anInt7391 = 5;

	@OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
	private int anInt7394 = 5;

	@OriginalMember(owner = "client!rfa", name = "F", descriptor = "I")
	private int anInt7393 = 0;

	@OriginalMember(owner = "client!rfa", name = "N", descriptor = "I")
	private int anInt7398 = 1;

	@OriginalMember(owner = "client!rfa", name = "R", descriptor = "I")
	private int anInt7401 = 2;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(29) int local29 = this.anInt7394 * Static13.anIntArray418[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static143.anInt7434; local39++) {
				Static151.anInt2437 = Integer.MAX_VALUE;
				Static430.anInt6945 = Integer.MAX_VALUE;
				Static179.anInt2670 = Integer.MAX_VALUE;
				Static26.anInt443 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt7391 * Static519.anIntArray155[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(153) int local153;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(95) int local95 = this.aByteArray72[(local70 >= this.anInt7394 ? local70 - this.anInt7394 : local70) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local62 - 1; local99 <= local66; local99++) {
						@Pc(125) int local125 = (this.aByteArray72[local95 + (local99 >= this.anInt7391 ? local99 - this.anInt7391 : local99) & 0xFF] & 0xFF) * 2;
						@Pc(130) int local130 = local125 + 1;
						@Pc(138) int local138 = local58 - this.aShortArray114[local125] - (local99 << 12);
						@Pc(150) int local150 = local29 - (local70 << 12) - this.aShortArray114[local130];
						local153 = this.anInt7398;
						@Pc(184) int local184;
						if (local153 == 1) {
							local184 = local150 * local150 + local138 * local138 >> 12;
						} else if (local153 == 3) {
							local138 = local138 < 0 ? -local138 : local138;
							local150 = local150 >= 0 ? local150 : -local150;
							local184 = local138 <= local150 ? local150 : local138;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 < 0 ? -local138 : local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 < 0 ? -local150 : local150) / 4096.0F)) * 4096.0D);
							local184 = local138 + local150;
							local184 = local184 * local184 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local138 *= local138;
							local184 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local150 + local138) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local184 = (local138 >= 0 ? local138 : -local138) + (local150 >= 0 ? local150 : -local150);
						} else {
							local184 = (int) (Math.sqrt((double) ((float) (local150 * local150 + local138 * local138) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static26.anInt443 > local184) {
							Static151.anInt2437 = Static430.anInt6945;
							Static430.anInt6945 = Static179.anInt2670;
							Static179.anInt2670 = Static26.anInt443;
							Static26.anInt443 = local184;
						} else if (Static179.anInt2670 > local184) {
							Static151.anInt2437 = Static430.anInt6945;
							Static430.anInt6945 = Static179.anInt2670;
							Static179.anInt2670 = local184;
						} else if (local184 < Static430.anInt6945) {
							Static151.anInt2437 = Static430.anInt6945;
							Static430.anInt6945 = local184;
						} else if (local184 < Static151.anInt2437) {
							Static151.anInt2437 = local184;
						}
					}
				}
				local153 = this.anInt7401;
				if (local153 == 0) {
					local16[local39] = Static26.anInt443;
				} else if (local153 == 1) {
					local16[local39] = Static179.anInt2670;
				} else if (local153 == 3) {
					local16[local39] = Static430.anInt6945;
				} else if (local153 == 4) {
					local16[local39] = Static151.anInt2437;
				} else if (local153 == 2) {
					local16[local39] = Static179.anInt2670 - Static26.anInt443;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)V")
	private void method5967() {
		@Pc(20) Random local20 = new Random((long) this.anInt7393);
		this.aShortArray114 = new short[512];
		if (this.anInt7397 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray114[local32] = (short) Static328.method4754(local20, this.anInt7397);
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt7391 = this.anInt7394 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt7393 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt7397 = arg1.method4518();
		} else if (arg0 == 3) {
			this.anInt7401 = arg1.method4464();
		} else if (arg0 == 4) {
			this.anInt7398 = arg1.method4464();
		} else if (arg0 == 5) {
			this.anInt7391 = arg1.method4464();
		} else if (arg0 == 6) {
			this.anInt7394 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		this.aByteArray72 = Static244.method3479(this.anInt7393);
		this.method5967();
	}
}
