import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class57 {

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	private int anInt1537 = -1;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "Z")
	public boolean aBoolean102 = true;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
	private final int anInt1539;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_6;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
	private final int anInt1545;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "Lclient!fu;")
	private final Class89 aClass89_1;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
	private final int anInt1540;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "Lclient!ml;")
	private Class65_Sub2 aClass65_Sub2_1;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Lclient!it;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!or;")
	private Class62_Sub2 aClass62_Sub2_1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!ug;Lclient!fu;Lclient!ul;IIIII)V")
	public Class57(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) Class41_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1539 = arg7;
		this.aClass135_Sub2_6 = arg0;
		this.anInt1545 = arg6;
		this.aClass89_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt6908 * (local37 + local35);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray7[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt1540 = local27;
		if (local27 <= 0) {
			this.aClass65_Sub2_1 = null;
		} else {
			@Pc(93) Class4_Sub9 local93 = new Class4_Sub9(local27 * 2);
			@Pc(114) int local114;
			@Pc(122) short[] local122;
			@Pc(126) int local126;
			@Pc(112) int local112;
			if (this.aClass135_Sub2_6.aBoolean474) {
				for (local50 = 0; local50 < local25; local50++) {
					local112 = arg2.anInt6908 * (local50 + local35) + local31;
					for (local114 = 0; local114 < local25; local114++) {
						local122 = arg2.aShortArrayArray7[local112++];
						if (local122 != null) {
							for (local126 = 0; local126 < local122.length; local126++) {
								local93.method5029(local122[local126] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local112 = arg2.anInt6908 * (local35 + local50) + local31;
					for (local114 = 0; local114 < local25; local114++) {
						local122 = arg2.aShortArrayArray7[local112++];
						if (local122 != null) {
							for (local126 = 0; local126 < local122.length; local126++) {
								local93.method5060(local122[local126] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface7_1 = this.aClass135_Sub2_6.method5423(false, local93.aByteArray81, local93.anInt6207);
			this.aClass62_Sub2_1 = new Class62_Sub2(this.aClass135_Sub2_6, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([BIII)V")
	public void method1251(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass62_Sub2_1.method3829(arg1 * this.aClass135_Sub2_6.method5482(5123), arg0);
		this.method1256(arg1, this.aClass62_Sub2_1);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
	public void method1252() {
		this.method1256(this.anInt1540, this.anInterface7_1);
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
	private void method1255() {
		if (!this.aBoolean102) {
			return;
		}
		this.aBoolean102 = false;
		@Pc(16) byte[] local16 = this.aClass89_1.aByteArray16;
		@Pc(24) byte[] local24 = this.aClass135_Sub2_6.aByteArray84;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = this.aClass89_1.anInt2180;
		@Pc(40) int local40 = this.anInt1545 + this.anInt1539 * this.aClass89_1.anInt2180;
		@Pc(53) int local53;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local26 = (local26 << 8) - local26;
			for (local53 = -128; local53 < 0; local53++) {
				if (local16[local40++] != 0) {
					local26++;
				}
			}
			local40 += local30 - 128;
		}
		if (this.aClass65_Sub2_1 != null && this.anInt1537 == local26) {
			this.aBoolean102 = false;
			return;
		}
		this.anInt1537 = local26;
		local53 = 0;
		local40 = this.anInt1545 + this.anInt1539 * local30;
		for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
				if (local16[local40] == 0) {
					@Pc(121) int local121 = 0;
					if (local16[local40 - 1] != 0) {
						local121++;
					}
					if (local16[local40 + 1] != 0) {
						local121++;
					}
					if (local16[local40 - local30] != 0) {
						local121++;
					}
					if (local16[local40 + local30] != 0) {
						local121++;
					}
					local24[local53++] = (byte) (local121 * 17);
				} else {
					local24[local53++] = 68;
				}
				local40++;
			}
			local40 += this.aClass89_1.anInt2180 - 128;
		}
		if (this.aClass65_Sub2_1 == null) {
			this.aClass65_Sub2_1 = new Class65_Sub2(this.aClass135_Sub2_6, 3553, 6406, 128, 128, false, this.aClass135_Sub2_6.aByteArray84, 6406, false);
			this.aClass65_Sub2_1.method3589(false, false);
			this.aClass65_Sub2_1.method4771(true);
		} else {
			this.aClass65_Sub2_1.method3586(128, this.aClass135_Sub2_6.aByteArray84, 128, 6406, false);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!it;I)V")
	private void method1256(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		if (arg0 != 0) {
			this.method1255();
			this.aClass135_Sub2_6.method5458(this.aClass65_Sub2_1);
			this.aClass135_Sub2_6.method5479(arg1, 0, arg0);
		}
	}
}
