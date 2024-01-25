import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class144 {

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	private int anInt4109 = -1;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "Z")
	public boolean aBoolean313 = true;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	private final int anInt4103;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_19;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	private final int anInt4102;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "Lclient!mg;")
	private final Class200 aClass200_1;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	private final int anInt4108;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "Lclient!qa;")
	private Interface15 anInterface15_2;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Lclient!ho;")
	private Class135_Sub1 aClass135_Sub1_1;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Lclient!waa;")
	private Class16_Sub1 aClass16_Sub1_2;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!en;Lclient!mg;Lclient!ot;IIIII)V")
	public Class144(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) Class46_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4103 = arg6;
		this.aClass90_Sub1_19 = arg0;
		this.anInt4102 = arg7;
		this.aClass200_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = (local35 + local37) * arg2.anInt9997 + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray22[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt4108 = local27;
		if (local27 <= 0) {
			this.aClass16_Sub1_2 = null;
		} else {
			@Pc(89) Class6_Sub12 local89 = new Class6_Sub12(local27 * 2);
			@Pc(108) int local108;
			@Pc(116) short[] local116;
			@Pc(120) int local120;
			@Pc(106) int local106;
			if (this.aClass90_Sub1_19.aBoolean176) {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = local31 + arg2.anInt9997 * (local35 + local50);
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray22[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local89.method6032(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = local31 + (local50 + local35) * arg2.anInt9997;
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray22[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local89.method6021(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface15_2 = this.aClass90_Sub1_19.method2065(local89.aByteArray97, local89.anInt7556, false);
			this.aClass135_Sub1_1 = new Class135_Sub1(this.aClass90_Sub1_19, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	public void method3516() {
		this.method3521(this.anInterface15_2, this.anInt4108);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([BZII)V")
	public void method3517(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass135_Sub1_1.method3357(this.aClass90_Sub1_19.method2080(5123) * arg1, arg0);
		this.method3521(this.aClass135_Sub1_1, arg1);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
	private void method3520() {
		if (!this.aBoolean313) {
			return;
		}
		this.aBoolean313 = false;
		@Pc(16) byte[] local16 = this.aClass200_1.aByteArray78;
		@Pc(20) byte[] local20 = this.aClass90_Sub1_19.aByteArray30;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass200_1.anInt6109;
		@Pc(36) int local36 = this.anInt4102 * this.aClass200_1.anInt6109 + this.anInt4103;
		@Pc(49) int local49;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local49 = -128; local49 < 0; local49++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass16_Sub1_2 != null && local22 == this.anInt4109) {
			this.aBoolean313 = false;
			return;
		}
		this.anInt4109 = local22;
		local49 = 0;
		local36 = this.anInt4102 * local26 + this.anInt4103;
		for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
			for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
				if (local16[local36] == 0) {
					@Pc(120) int local120 = 0;
					if (local16[local36 - 1] != 0) {
						local120++;
					}
					if (local16[local36 + 1] != 0) {
						local120++;
					}
					if (local16[local36 - local26] != 0) {
						local120++;
					}
					if (local16[local26 + local36] != 0) {
						local120++;
					}
					local20[local49++] = (byte) (local120 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass200_1.anInt6109 - 128;
		}
		if (this.aClass16_Sub1_2 == null) {
			this.aClass16_Sub1_2 = new Class16_Sub1(this.aClass90_Sub1_19, 3553, 6406, 128, 128, false, this.aClass90_Sub1_19.aByteArray30, 6406, false);
			this.aClass16_Sub1_2.method303(false, false);
			this.aClass16_Sub1_2.method7843(true);
		} else {
			this.aClass16_Sub1_2.method299(128, this.aClass90_Sub1_19.aByteArray30, false, 128, 6406);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!qa;II)V")
	private void method3521(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method3520();
			this.aClass90_Sub1_19.method2126(this.aClass16_Sub1_2);
			this.aClass90_Sub1_19.method2144(arg1, arg0, 0);
		}
	}
}
