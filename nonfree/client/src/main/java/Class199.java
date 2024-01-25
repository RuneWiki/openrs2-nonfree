import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class199 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
	public boolean aBoolean448 = true;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	private int anInt6138 = -1;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	private final int anInt6140;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_38;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	private final int anInt6137;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "Lclient!dm;")
	private final Class53 aClass53_2;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	private final int anInt6139;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Lclient!ui;")
	private Interface9 anInterface9_5;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Lclient!oe;")
	private Class92_Sub4 aClass92_Sub4_6;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!hd;Lclient!dm;Lclient!ag;IIIII)V")
	public Class199(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class8_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6140 = arg7;
		this.aClass89_Sub1_38 = arg0;
		this.anInt6137 = arg6;
		this.aClass53_2 = arg1;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(52) int local52;
		@Pc(54) int local54;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local52 = local29 + (local33 + local35) * arg2.anInt4755;
			for (local54 = 0; local54 < local23; local54++) {
				@Pc(67) short[] local67 = arg2.aShortArrayArray1[local52++];
				if (local67 != null) {
					local25 += local67.length;
				}
			}
		}
		this.anInt6139 = local25;
		if (local25 > 0) {
			@Pc(94) Class7_Sub3 local94 = new Class7_Sub3(local25 * 2);
			@Pc(124) short[] local124;
			@Pc(128) int local128;
			@Pc(115) int local115;
			if (this.aClass89_Sub1_38.aBoolean195) {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = local29 + (local33 + local52) * arg2.anInt4755;
					for (local115 = 0; local115 < local23; local115++) {
						local124 = arg2.aShortArrayArray1[local54++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local94.method2788(local124[local128]);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = local29 + arg2.anInt4755 * (local33 + local52);
					for (local115 = 0; local115 < local23; local115++) {
						local124 = arg2.aShortArrayArray1[local54++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local94.method2753(local124[local128]);
							}
						}
					}
				}
			}
			this.anInterface9_5 = this.aClass89_Sub1_38.method2408(local94.aByteArray33, local94.anInt3005, false);
		} else {
			this.aClass92_Sub4_6 = null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ui;ZI)V")
	public void method5189(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method5190();
			this.aClass89_Sub1_38.method2445(this.aClass92_Sub4_6);
			this.aClass89_Sub1_38.method2398(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	private void method5190() {
		if (!this.aBoolean448) {
			return;
		}
		this.aBoolean448 = false;
		@Pc(10) byte[] local10 = this.aClass53_2.aByteArray19;
		@Pc(12) byte[] local12 = Static322.aByteArray92;
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = this.aClass53_2.anInt1602;
		@Pc(28) int local28 = this.anInt6137 + this.anInt6140 * this.aClass53_2.anInt1602;
		@Pc(30) int local30;
		for (local30 = -128; local30 < 0; local30++) {
			local14 = (local14 << 8) - local14;
			for (@Pc(41) int local41 = -128; local41 < 0; local41++) {
				if (local10[local28++] != 0) {
					local14++;
				}
			}
			local28 += local18 - 128;
		}
		if (this.aClass92_Sub4_6 != null && local14 == this.anInt6138) {
			this.aBoolean448 = false;
			return;
		}
		this.anInt6138 = local14;
		local28 = this.anInt6140 * local18 + this.anInt6137;
		local30 = 0;
		for (@Pc(101) int local101 = -128; local101 < 0; local101++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
				if (local10[local28] == 0) {
					@Pc(126) int local126 = 0;
					if (local10[local28 - 1] != 0) {
						local126++;
					}
					if (local10[local28 + 1] != 0) {
						local126++;
					}
					if (local10[local28 - local18] != 0) {
						local126++;
					}
					if (local10[local18 + local28] != 0) {
						local126++;
					}
					local12[local30++] = (byte) (local126 * 17);
				} else {
					local12[local30++] = 68;
				}
				local28++;
			}
			local28 += this.aClass53_2.anInt1602 - 128;
		}
		if (this.aClass92_Sub4_6 == null) {
			this.aClass92_Sub4_6 = new Class92_Sub4(this.aClass89_Sub1_38, 3553, 6406, 128, 128, false, Static322.aByteArray92, 6406, false);
			this.aClass92_Sub4_6.method3530(false, false);
			this.aClass92_Sub4_6.method3517(true);
		} else {
			this.aClass92_Sub4_6.method3531(128, 128, Static322.aByteArray92, 6406, false);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method5191() {
		this.method5189(this.anInterface9_5, this.anInt6139);
	}
}
