import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
	private int anInt841 = 5;

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	private int anInt844 = 0;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
	private int anInt842 = 2;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "[B")
	private byte[] aByteArray10 = new byte[512];

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "[S")
	private short[] aShortArray5 = new short[512];

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
	private int anInt848 = 1;

	@OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
	private int anInt851 = 2048;

	@OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
	private int anInt853 = 5;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt841 = this.anInt853 = arg0.method6138();
		} else if (arg1 == 1) {
			this.anInt844 = arg0.method6138();
		} else if (arg1 == 2) {
			this.anInt851 = arg0.method6148();
		} else if (arg1 == 3) {
			this.anInt842 = arg0.method6138();
		} else if (arg1 == 4) {
			this.anInt848 = arg0.method6138();
		} else if (arg1 == 5) {
			this.anInt841 = arg0.method6138();
		} else if (arg1 == 6) {
			this.anInt853 = arg0.method6138();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		this.aByteArray10 = Static240.method3277(this.anInt844);
		this.method805();
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V")
	private void method805() {
		@Pc(26) Random local26 = new Random((long) this.anInt844);
		this.aShortArray5 = new short[512];
		if (this.anInt851 > 0) {
			for (@Pc(35) int local35 = 0; local35 < 512; local35++) {
				this.aShortArray5[local35] = (short) Static408.method1356(local26, this.anInt851);
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(29) int local29 = this.anInt853 * Static168.anIntArray524[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static398.anInt6955; local39++) {
				Static16.anInt5161 = Integer.MAX_VALUE;
				Static163.anInt2921 = Integer.MAX_VALUE;
				Static398.anInt6959 = Integer.MAX_VALUE;
				Static279.anInt5039 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt841 * Static427.anIntArray587[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(151) int local151;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(91) int local91 = this.aByteArray10[(local70 >= this.anInt853 ? local70 - this.anInt853 : local70) & 0xFF] & 0xFF;
					for (@Pc(95) int local95 = local62 - 1; local95 <= local66; local95++) {
						@Pc(124) int local124 = (this.aByteArray10[(this.anInt841 > local95 ? local95 : local95 - this.anInt841) + local91 & 0xFF] & 0xFF) * 2;
						@Pc(128) int local128 = local95 << 12;
						@Pc(132) int local132 = local124 + 1;
						@Pc(136) int local136 = local58 - local128 - this.aShortArray5[local124];
						@Pc(148) int local148 = local29 - this.aShortArray5[local132] - (local70 << 12);
						local151 = this.anInt848;
						@Pc(186) int local186;
						if (local151 == 1) {
							local186 = local148 * local148 + local136 * local136 >> 12;
						} else if (local151 == 3) {
							local148 = local148 >= 0 ? local148 : -local148;
							local136 = local136 < 0 ? -local136 : local136;
							local186 = local148 >= local136 ? local148 : local136;
						} else if (local151 == 4) {
							local136 = (int) (Math.sqrt((double) ((float) (local136 < 0 ? -local136 : local136) / 4096.0F)) * 4096.0D);
							local148 = (int) (Math.sqrt((double) ((float) (local148 >= 0 ? local148 : -local148) / 4096.0F)) * 4096.0D);
							local186 = local148 + local136;
							local186 = local186 * local186 >> 12;
						} else if (local151 == 5) {
							local148 *= local148;
							local136 *= local136;
							local186 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local148 + local136) / 1.6777216E7F))) * 4096.0D);
						} else if (local151 == 2) {
							local186 = (local148 >= 0 ? local148 : -local148) + (local136 >= 0 ? local136 : -local136);
						} else {
							local186 = (int) (Math.sqrt((double) ((float) (local148 * local148 + local136 * local136) / 1.6777216E7F)) * 4096.0D);
						}
						if (local186 < Static279.anInt5039) {
							Static16.anInt5161 = Static163.anInt2921;
							Static163.anInt2921 = Static398.anInt6959;
							Static398.anInt6959 = Static279.anInt5039;
							Static279.anInt5039 = local186;
						} else if (local186 < Static398.anInt6959) {
							Static16.anInt5161 = Static163.anInt2921;
							Static163.anInt2921 = Static398.anInt6959;
							Static398.anInt6959 = local186;
						} else if (Static163.anInt2921 > local186) {
							Static16.anInt5161 = Static163.anInt2921;
							Static163.anInt2921 = local186;
						} else if (local186 < Static16.anInt5161) {
							Static16.anInt5161 = local186;
						}
					}
				}
				local151 = this.anInt842;
				if (local151 == 0) {
					local11[local39] = Static279.anInt5039;
				} else if (local151 == 1) {
					local11[local39] = Static398.anInt6959;
				} else if (local151 == 3) {
					local11[local39] = Static163.anInt2921;
				} else if (local151 == 4) {
					local11[local39] = Static16.anInt5161;
				} else if (local151 == 2) {
					local11[local39] = Static398.anInt6959 - Static279.anInt5039;
				}
			}
		}
		return local11;
	}
}
