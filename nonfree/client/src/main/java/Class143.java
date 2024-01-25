import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class143 {

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "Z")
	public boolean aBoolean333 = true;

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
	private int anInt4066 = -1;

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_10;

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
	private final int anInt4062;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
	private final int anInt4059;

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "Lclient!we;")
	private final Class383 aClass383_1;

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
	private final int anInt4060;

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "Lclient!gha;")
	private Class80_Sub2 aClass80_Sub2_2;

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "Lclient!pm;")
	private Interface23 anInterface23_4;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "Lclient!ww;")
	private Class274_Sub2 aClass274_Sub2_1;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!ck;Lclient!we;Lclient!lc;IIIII)V")
	public Class143(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) Class109_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass65_Sub1_10 = arg0;
		this.anInt4062 = arg7;
		this.anInt4059 = arg6;
		this.aClass383_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt9061 * (local37 + local35);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray8[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt4060 = local27;
		if (local27 <= 0) {
			this.aClass80_Sub2_2 = null;
		} else {
			@Pc(97) Class5_Sub41 local97 = new Class5_Sub41(local27 * 2);
			@Pc(116) int local116;
			@Pc(124) short[] local124;
			@Pc(128) int local128;
			@Pc(114) int local114;
			if (this.aClass65_Sub1_10.aBoolean97) {
				for (local50 = 0; local50 < local25; local50++) {
					local114 = local31 + (local35 + local50) * arg2.anInt9061;
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray8[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method7848(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local114 = local31 + arg2.anInt9061 * (local35 + local50);
					for (local116 = 0; local116 < local25; local116++) {
						local124 = arg2.aShortArrayArray8[local114++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local97.method7821(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface23_4 = this.aClass65_Sub1_10.method1292(local97.anInt9230, false, local97.aByteArray93);
			this.aClass274_Sub2_1 = new Class274_Sub2(this.aClass65_Sub1_10, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
	private void method3453() {
		if (!this.aBoolean333) {
			return;
		}
		this.aBoolean333 = false;
		@Pc(16) byte[] local16 = this.aClass383_1.aByteArray108;
		@Pc(20) byte[] local20 = this.aClass65_Sub1_10.aByteArray15;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass383_1.anInt10578;
		@Pc(36) int local36 = this.aClass383_1.anInt10578 * this.anInt4062 + this.anInt4059;
		@Pc(57) int local57;
		for (@Pc(46) int local46 = -128; local46 < 0; local46++) {
			local22 = (local22 << 8) - local22;
			for (local57 = -128; local57 < 0; local57++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass80_Sub2_2 != null && local22 == this.anInt4066) {
			this.aBoolean333 = false;
			return;
		}
		this.anInt4066 = local22;
		local57 = 0;
		local36 = local26 * this.anInt4062 + this.anInt4059;
		for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
			for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
				if (local16[local36] == 0) {
					@Pc(122) int local122 = 0;
					if (local16[local36 - 1] != 0) {
						local122++;
					}
					if (local16[local36 + 1] != 0) {
						local122++;
					}
					if (local16[local36 - local26] != 0) {
						local122++;
					}
					if (local16[local26 + local36] != 0) {
						local122++;
					}
					local20[local57++] = (byte) (local122 * 17);
				} else {
					local20[local57++] = 68;
				}
				local36++;
			}
			local36 += this.aClass383_1.anInt10578 - 128;
		}
		if (this.aClass80_Sub2_2 == null) {
			this.aClass80_Sub2_2 = new Class80_Sub2(this.aClass65_Sub1_10, 3553, 6406, 128, 128, false, this.aClass65_Sub1_10.aByteArray15, 6406, false);
			this.aClass80_Sub2_2.method7150(false, false);
			this.aClass80_Sub2_2.method7142(true);
		} else {
			this.aClass80_Sub2_2.method7151(this.aClass65_Sub1_10.aByteArray15, 128, 128, false, 6406);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I[BBI)V")
	public void method3454(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass274_Sub2_1.method9043(this.aClass65_Sub1_10.method1227(5123) * arg1, arg0);
		this.method3457(this.aClass274_Sub2_1, arg1);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
	public void method3456() {
		this.method3457(this.anInterface23_4, this.anInt4060);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!pm;BI)V")
	private void method3457(@OriginalArg(0) Interface23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method3453();
			this.aClass65_Sub1_10.method1286(this.aClass80_Sub2_2);
			this.aClass65_Sub1_10.method1291(arg0, arg1, 0);
		}
	}
}
