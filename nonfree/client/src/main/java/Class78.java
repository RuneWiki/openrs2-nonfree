import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class78 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Z")
	public boolean aBoolean126 = true;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	private int anInt2114 = -1;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "Lclient!en;")
	private final Class62 aClass62_2;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	private final int anInt2113;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
	private final int anInt2112;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_9;

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
	private final int anInt2117;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "Lclient!wv;")
	private Class137_Sub1 aClass137_Sub1_1;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Lclient!vf;")
	private Interface13 anInterface13_2;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "Lclient!li;")
	private Class89_Sub2 aClass89_Sub2_1;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!nq;Lclient!en;Lclient!e;IIIII)V")
	public Class78(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class55_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass62_2 = arg1;
		this.anInt2113 = arg6;
		this.anInt2112 = arg7;
		this.aClass167_Sub1_9 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt4614 * (local37 + local35);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray1[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt2117 = local27;
		if (local27 <= 0) {
			this.aClass137_Sub1_1 = null;
		} else {
			@Pc(93) Class3_Sub25 local93 = new Class3_Sub25(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass167_Sub1_9.aBoolean349) {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = local31 + (local50 + local35) * arg2.anInt4614;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray1[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method4123(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = arg2.anInt4614 * (local35 + local50) + local31;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray1[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method4120(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface13_2 = this.aClass167_Sub1_9.method4047(false, local93.anInt4974, local93.aByteArray88);
			this.aClass89_Sub2_1 = new Class89_Sub2(this.aClass167_Sub1_9, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II[BI)V")
	public void method1924(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass89_Sub2_1.method4215(this.aClass167_Sub1_9.method3978(5123) * arg0, arg1);
		this.method1928(this.aClass89_Sub2_1, arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	private void method1927() {
		if (!this.aBoolean126) {
			return;
		}
		this.aBoolean126 = false;
		@Pc(16) byte[] local16 = this.aClass62_2.aByteArray31;
		@Pc(20) byte[] local20 = this.aClass167_Sub1_9.aByteArray87;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass62_2.anInt1713;
		@Pc(37) int local37 = this.anInt2113 + this.anInt2112 * this.aClass62_2.anInt1713;
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
		if (this.aClass137_Sub1_1 != null && local22 == this.anInt2114) {
			this.aBoolean126 = false;
			return;
		}
		this.anInt2114 = local22;
		local50 = 0;
		local37 = this.anInt2112 * local26 + this.anInt2113;
		for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
			for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
				if (local16[local37] == 0) {
					@Pc(115) int local115 = 0;
					if (local16[local37 - 1] != 0) {
						local115++;
					}
					if (local16[local37 + 1] != 0) {
						local115++;
					}
					if (local16[local37 - local26] != 0) {
						local115++;
					}
					if (local16[local37 + local26] != 0) {
						local115++;
					}
					local20[local50++] = (byte) (local115 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass62_2.anInt1713 - 128;
		}
		if (this.aClass137_Sub1_1 == null) {
			this.aClass137_Sub1_1 = new Class137_Sub1(this.aClass167_Sub1_9, 3553, 6406, 128, 128, false, this.aClass167_Sub1_9.aByteArray87, 6406, false);
			this.aClass137_Sub1_1.method3346(false, false);
			this.aClass137_Sub1_1.method5783(true);
		} else {
			this.aClass137_Sub1_1.method3350(128, this.aClass167_Sub1_9.aByteArray87, 128, 6406, false);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!vf;II)V")
	private void method1928(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method1927();
			this.aClass167_Sub1_9.method4028(this.aClass137_Sub1_1);
			this.aClass167_Sub1_9.method4018(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	public void method1929() {
		this.method1928(this.anInterface13_2, this.anInt2117);
	}
}
