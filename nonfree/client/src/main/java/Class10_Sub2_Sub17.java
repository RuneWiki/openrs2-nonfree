import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class10_Sub2_Sub17 extends Class10_Sub2 {

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	private int anInt3343 = 0;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	private int anInt3339 = 1;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
	private int anInt3342 = 2048;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "[B")
	private byte[] aByteArray45 = new byte[512];

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	private int anInt3338 = 2;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "[S")
	private short[] aShortArray50 = new short[512];

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	private int anInt3340 = 5;

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
	private int anInt3350 = 5;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		this.aByteArray45 = Static450.method5996(this.anInt3343);
		this.method2800();
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(30) int local30 = Static67.anIntArray106[arg0] * this.anInt3350 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static121.anInt2458; local40++) {
				Static99.anInt2053 = Integer.MAX_VALUE;
				Static124.anInt2564 = Integer.MAX_VALUE;
				Static111.anInt5896 = Integer.MAX_VALUE;
				Static114.anInt2297 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static182.anIntArray374[local40] * this.anInt3340 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(153) int local153;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray45[(this.anInt3350 > local71 ? local71 : local71 - this.anInt3350) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(126) int local126 = (this.aByteArray45[local96 + (this.anInt3340 > local100 ? local100 : local100 - this.anInt3340) & 0xFF] & 0xFF) * 2;
						@Pc(131) int local131 = local59 - (local100 << 12);
						@Pc(135) int local135 = local126 + 1;
						@Pc(138) int local138 = local131 - this.aShortArray50[local126];
						@Pc(150) int local150 = local30 - this.aShortArray50[local135] - (local71 << 12);
						local153 = this.anInt3339;
						@Pc(183) int local183;
						if (local153 == 1) {
							local183 = local138 * local138 + local150 * local150 >> 12;
						} else if (local153 == 3) {
							local138 = local138 >= 0 ? local138 : -local138;
							local150 = local150 >= 0 ? local150 : -local150;
							local183 = local150 >= local138 ? local150 : local138;
						} else if (local153 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 < 0 ? -local138 : local138) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 >= 0 ? local150 : -local150) / 4096.0F)) * 4096.0D);
							local183 = local138 + local150;
							local183 = local183 * local183 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local138 *= local138;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local150) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local183 = (local150 < 0 ? -local150 : local150) + (local138 >= 0 ? local138 : -local138);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local138 * local138 + local150 * local150) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static114.anInt2297 > local183) {
							Static99.anInt2053 = Static124.anInt2564;
							Static124.anInt2564 = Static111.anInt5896;
							Static111.anInt5896 = Static114.anInt2297;
							Static114.anInt2297 = local183;
						} else if (local183 < Static111.anInt5896) {
							Static99.anInt2053 = Static124.anInt2564;
							Static124.anInt2564 = Static111.anInt5896;
							Static111.anInt5896 = local183;
						} else if (local183 < Static124.anInt2564) {
							Static99.anInt2053 = Static124.anInt2564;
							Static124.anInt2564 = local183;
						} else if (local183 < Static99.anInt2053) {
							Static99.anInt2053 = local183;
						}
					}
				}
				local153 = this.anInt3338;
				if (local153 == 0) {
					local17[local40] = Static114.anInt2297;
				} else if (local153 == 1) {
					local17[local40] = Static111.anInt5896;
				} else if (local153 == 3) {
					local17[local40] = Static124.anInt2564;
				} else if (local153 == 4) {
					local17[local40] = Static99.anInt2053;
				} else if (local153 == 2) {
					local17[local40] = Static111.anInt5896 - Static114.anInt2297;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3340 = this.anInt3350 = arg1.method2502();
		} else if (arg0 == 1) {
			this.anInt3343 = arg1.method2502();
		} else if (arg0 == 2) {
			this.anInt3342 = arg1.method2485();
		} else if (arg0 == 3) {
			this.anInt3338 = arg1.method2502();
		} else if (arg0 == 4) {
			this.anInt3339 = arg1.method2502();
		} else if (arg0 == 5) {
			this.anInt3340 = arg1.method2502();
		} else if (arg0 == 6) {
			this.anInt3350 = arg1.method2502();
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V")
	private void method2800() {
		@Pc(20) Random local20 = new Random((long) this.anInt3343);
		this.aShortArray50 = new short[512];
		if (this.anInt3342 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray50[local29] = (short) Static434.method5743(local20, this.anInt3342);
			}
		}
	}
}
