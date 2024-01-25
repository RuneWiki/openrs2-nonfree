import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class88 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	private int anInt2654 = -1;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_17;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	private final int anInt2657;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!lo;")
	private final Class123 aClass123_1;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	private final int anInt2656;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	private final int anInt2655;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!fc;")
	private Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!eo;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!po;Lclient!lo;Lclient!wa;IIIII)V")
	public Class88(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(2) Class3_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass59_Sub1_17 = arg0;
		this.anInt2657 = arg7;
		this.aClass123_1 = arg1;
		this.anInt2656 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(51) int local51;
		@Pc(53) int local53;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local51 = local29 + (local35 + local33) * arg2.anInt6360;
			for (local53 = 0; local53 < local23; local53++) {
				@Pc(62) short[] local62 = arg2.aShortArrayArray16[local51++];
				if (local62 != null) {
					local25 += local62.length;
				}
			}
		}
		this.anInt2655 = local25;
		if (local25 <= 0) {
			this.aClass11_Sub1_3 = null;
		} else {
			@Pc(94) Class5_Sub1 local94 = new Class5_Sub1(local25 * 2);
			@Pc(124) short[] local124;
			@Pc(128) int local128;
			@Pc(115) int local115;
			if (this.aClass59_Sub1_17.aBoolean350) {
				for (local51 = 0; local51 < local23; local51++) {
					local53 = (local33 + local51) * arg2.anInt6360 + local29;
					for (local115 = 0; local115 < local23; local115++) {
						local124 = arg2.aShortArrayArray16[local53++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local94.method1870(local124[local128]);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local23; local51++) {
					local53 = (local33 + local51) * arg2.anInt6360 + local29;
					for (local115 = 0; local115 < local23; local115++) {
						local124 = arg2.aShortArrayArray16[local53++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local94.method1829(local124[local128]);
							}
						}
					}
				}
			}
			this.anInterface2_1 = this.aClass59_Sub1_17.method4312(local94.aByteArray18, local94.anInt2029, false);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public void method2465() {
		this.method2466(this.anInt2655, this.anInterface2_1);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!eo;)V")
	public void method2466(@OriginalArg(0) int arg0, @OriginalArg(2) Interface2 arg1) {
		if (arg0 != 0) {
			this.method2467();
			this.aClass59_Sub1_17.method4296(this.aClass11_Sub1_3);
			this.aClass59_Sub1_17.method4318(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	private void method2467() {
		if (!this.aBoolean179) {
			return;
		}
		this.aBoolean179 = false;
		@Pc(10) byte[] local10 = this.aClass123_1.aByteArray43;
		@Pc(12) byte[] local12 = Static128.aByteArray23;
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = this.aClass123_1.anInt3594;
		@Pc(28) int local28 = this.anInt2656 + this.aClass123_1.anInt3594 * this.anInt2657;
		@Pc(30) int local30;
		@Pc(44) int local44;
		for (local30 = -128; local30 < 0; local30++) {
			local14 = (local14 << 8) - local14;
			for (local44 = -128; local44 < 0; local44++) {
				if (local10[local28++] != 0) {
					local14++;
				}
			}
			local28 += local18 - 128;
		}
		if (this.aClass11_Sub1_3 != null && local14 == this.anInt2654) {
			this.aBoolean179 = false;
			return;
		}
		this.anInt2654 = local14;
		local30 = 0;
		local28 = this.anInt2656 + this.anInt2657 * local18;
		for (local44 = -128; local44 < 0; local44++) {
			for (@Pc(111) int local111 = -128; local111 < 0; local111++) {
				if (local10[local28] == 0) {
					@Pc(125) int local125 = 0;
					if (local10[local28 - 1] != 0) {
						local125++;
					}
					if (local10[local28 + 1] != 0) {
						local125++;
					}
					if (local10[local28 - local18] != 0) {
						local125++;
					}
					if (local10[local28 + local18] != 0) {
						local125++;
					}
					local12[local30++] = (byte) (local125 * 17);
				} else {
					local12[local30++] = 68;
				}
				local28++;
			}
			local28 += this.aClass123_1.anInt3594 - 128;
		}
		if (this.aClass11_Sub1_3 == null) {
			this.aClass11_Sub1_3 = new Class11_Sub1(this.aClass59_Sub1_17, 3553, 6406, 128, 128, false, Static128.aByteArray23, 6406, false);
			this.aClass11_Sub1_3.method387(false, false);
			this.aClass11_Sub1_3.method3575(true);
		} else {
			this.aClass11_Sub1_3.method388(128, 128, Static128.aByteArray23, 6406, false);
		}
	}
}
