import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class190 {

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Z")
	public boolean aBoolean422 = true;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
	private int anInt5587 = -1;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!cu;")
	private final Class55 aClass55_1;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
	private final int anInt5585;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_19;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
	private final int anInt5584;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	private final int anInt5577;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!uq;")
	private Interface22 anInterface22_3;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!tf;")
	private Class21_Sub2 aClass21_Sub2_1;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!saa;")
	private Class77_Sub1 aClass77_Sub1_3;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!kga;Lclient!cu;Lclient!sm;IIIII)V")
	public Class190(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) Class83_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass55_1 = arg1;
		this.anInt5585 = arg6;
		this.aClass44_Sub3_19 = arg0;
		this.anInt5584 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = arg2.anInt8829 * (local37 + local35) + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray10[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt5577 = local27;
		if (local27 <= 0) {
			this.aClass77_Sub1_3 = null;
		} else {
			@Pc(90) Class4_Sub11 local90 = new Class4_Sub11(local27 * 2);
			@Pc(109) int local109;
			@Pc(117) short[] local117;
			@Pc(121) int local121;
			@Pc(107) int local107;
			if (this.aClass44_Sub3_19.aBoolean399) {
				for (local51 = 0; local51 < local25; local51++) {
					local107 = arg2.anInt8829 * (local51 + local35) + local31;
					for (local109 = 0; local109 < local25; local109++) {
						local117 = arg2.aShortArrayArray10[local107++];
						if (local117 != null) {
							for (local121 = 0; local121 < local117.length; local121++) {
								local90.method4937(local117[local121] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local107 = arg2.anInt8829 * (local35 + local51) + local31;
					for (local109 = 0; local109 < local25; local109++) {
						local117 = arg2.aShortArrayArray10[local107++];
						if (local117 != null) {
							for (local121 = 0; local121 < local117.length; local121++) {
								local90.method4912(local117[local121] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface22_3 = this.aClass44_Sub3_19.method4653(local90.aByteArray68, false, local90.anInt5831);
			this.aClass21_Sub2_1 = new Class21_Sub2(this.aClass44_Sub3_19, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public void method4721() {
		this.method4727(this.anInt5577, this.anInterface22_3);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([BIIB)V")
	public void method4724(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass21_Sub2_1.method7399(arg0, arg1 * this.aClass44_Sub3_19.method4655(5123));
		this.method4727(arg1, this.aClass21_Sub2_1);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	private void method4725() {
		if (!this.aBoolean422) {
			return;
		}
		this.aBoolean422 = false;
		@Pc(16) byte[] local16 = this.aClass55_1.aByteArray12;
		@Pc(20) byte[] local20 = this.aClass44_Sub3_19.aByteArray59;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass55_1.anInt1279;
		@Pc(36) int local36 = this.anInt5585 + this.aClass55_1.anInt1279 * this.anInt5584;
		@Pc(48) int local48;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local48 = -128; local48 < 0; local48++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass77_Sub1_3 != null && this.anInt5587 == local22) {
			this.aBoolean422 = false;
			return;
		}
		this.anInt5587 = local22;
		local48 = 0;
		local36 = this.anInt5585 + local26 * this.anInt5584;
		for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
				if (local16[local36] == 0) {
					@Pc(124) int local124 = 0;
					if (local16[local36 - 1] != 0) {
						local124++;
					}
					if (local16[local36 + 1] != 0) {
						local124++;
					}
					if (local16[local36 - local26] != 0) {
						local124++;
					}
					if (local16[local36 + local26] != 0) {
						local124++;
					}
					local20[local48++] = (byte) (local124 * 17);
				} else {
					local20[local48++] = 68;
				}
				local36++;
			}
			local36 += this.aClass55_1.anInt1279 - 128;
		}
		if (this.aClass77_Sub1_3 == null) {
			this.aClass77_Sub1_3 = new Class77_Sub1(this.aClass44_Sub3_19, 3553, 6406, 128, 128, false, this.aClass44_Sub3_19.aByteArray59, 6406, false);
			this.aClass77_Sub1_3.method2266(false, false);
			this.aClass77_Sub1_3.method7076(true);
		} else {
			this.aClass77_Sub1_3.method2267(128, false, 128, this.aClass44_Sub3_19.aByteArray59, 6406);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!uq;)V")
	private void method4727(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
		if (arg0 != 0) {
			this.method4725();
			this.aClass44_Sub3_19.method4605(this.aClass77_Sub1_3);
			this.aClass44_Sub3_19.method4657(arg0, 0, arg1);
		}
	}
}
