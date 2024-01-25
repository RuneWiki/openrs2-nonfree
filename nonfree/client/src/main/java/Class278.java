import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class278 {

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "Z")
	public boolean aBoolean570 = true;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
	private int anInt8204 = -1;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
	private final int anInt8199;

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_35;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
	private final int anInt8198;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "Lclient!lea;")
	private final Class210 aClass210_1;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
	private final int anInt8203;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "Lclient!kda;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "Lclient!mga;")
	private Class40_Sub2 aClass40_Sub2_2;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "Lclient!km;")
	private Class66_Sub1 aClass66_Sub1_5;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!qfa;Lclient!lea;Lclient!re;IIIII)V")
	public Class278(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class51_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8199 = arg7;
		this.aClass137_Sub3_35 = arg0;
		this.anInt8198 = arg6;
		this.aClass210_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = arg2.anInt9511 * (local37 + local35) + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray17[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt8203 = local27;
		if (local27 <= 0) {
			this.aClass66_Sub1_5 = null;
		} else {
			@Pc(97) Class14_Sub29 local97 = new Class14_Sub29(local27 * 2);
			@Pc(116) int local116;
			@Pc(124) short[] local124;
			@Pc(128) int local128;
			@Pc(114) int local114;
			if (this.aClass137_Sub3_35.aBoolean594) {
				for (local51 = 0; local51 < local25; local51++) {
					local114 = local31 + arg2.anInt9511 * (local51 + local35);
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray17[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method5859(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local114 = local31 + (local35 + local51) * arg2.anInt9511;
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray17[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method5867(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface12_3 = this.aClass137_Sub3_35.method7075(local97.aByteArray84, local97.anInt7264, false);
			this.aClass40_Sub2_2 = new Class40_Sub2(this.aClass137_Sub3_35, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	public void method6833() {
		this.method6834(this.anInterface12_3, this.anInt8203);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!kda;IB)V")
	private void method6834(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method6835();
			this.aClass137_Sub3_35.method7090(this.aClass66_Sub1_5);
			this.aClass137_Sub3_35.method7063(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	private void method6835() {
		if (!this.aBoolean570) {
			return;
		}
		this.aBoolean570 = false;
		@Pc(16) byte[] local16 = this.aClass210_1.aByteArray73;
		@Pc(20) byte[] local20 = this.aClass137_Sub3_35.aByteArray98;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass210_1.anInt6186;
		@Pc(37) int local37 = this.anInt8198 + this.aClass210_1.anInt6186 * this.anInt8199;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local50 = -128; local50 < 0; local50++) {
				if (local16[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.aClass66_Sub1_5 != null && this.anInt8204 == local22) {
			this.aBoolean570 = false;
			return;
		}
		this.anInt8204 = local22;
		local37 = local26 * this.anInt8199 + this.anInt8198;
		local50 = 0;
		for (@Pc(99) int local99 = -128; local99 < 0; local99++) {
			for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
				if (local16[local37] == 0) {
					@Pc(111) int local111 = 0;
					if (local16[local37 - 1] != 0) {
						local111++;
					}
					if (local16[local37 + 1] != 0) {
						local111++;
					}
					if (local16[local37 - local26] != 0) {
						local111++;
					}
					if (local16[local26 + local37] != 0) {
						local111++;
					}
					local20[local50++] = (byte) (local111 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass210_1.anInt6186 - 128;
		}
		if (this.aClass66_Sub1_5 == null) {
			this.aClass66_Sub1_5 = new Class66_Sub1(this.aClass137_Sub3_35, 3553, 6406, 128, 128, false, this.aClass137_Sub3_35.aByteArray98, 6406, false);
			this.aClass66_Sub1_5.method1669(false, false);
			this.aClass66_Sub1_5.method6848(true);
		} else {
			this.aClass66_Sub1_5.method1668(this.aClass137_Sub3_35.aByteArray98, 128, false, 128, 6406);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III[B)V")
	public void method6836(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass40_Sub2_2.method5494(arg1, this.aClass137_Sub3_35.method7052(5123) * arg0);
		this.method6834(this.aClass40_Sub2_2, arg0);
	}
}
