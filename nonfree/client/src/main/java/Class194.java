import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class194 {

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	private int anInt4996 = -1;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
	public boolean aBoolean375 = true;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_16;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!tv;")
	private final Class342 aClass342_1;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	private final int anInt4995;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	private final int anInt4993;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	private final int anInt4999;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!sda;")
	private Interface21 anInterface21_2;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!mn;")
	private Class164_Sub2 aClass164_Sub2_1;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!wo;")
	private Class167_Sub3 aClass167_Sub3_3;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!rs;Lclient!tv;Lclient!ru;IIIII)V")
	public Class194(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) Class61_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass133_Sub3_16 = arg0;
		this.aClass342_1 = arg1;
		this.anInt4995 = arg6;
		this.anInt4993 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt10026 * (local37 + local35);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray26[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt4999 = local27;
		if (local27 <= 0) {
			this.aClass167_Sub3_3 = null;
		} else {
			@Pc(92) Class5_Sub22 local92 = new Class5_Sub22(local27 * 2);
			@Pc(111) int local111;
			@Pc(119) short[] local119;
			@Pc(123) int local123;
			@Pc(109) int local109;
			if (this.aClass133_Sub3_16.aBoolean611) {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = arg2.anInt10026 * (local35 + local50) + local31;
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray26[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method5918(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = (local50 + local35) * arg2.anInt10026 + local31;
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray26[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method5948(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface21_2 = this.aClass133_Sub3_16.method7371(local92.aByteArray71, false, local92.anInt6629);
			this.aClass164_Sub2_1 = new Class164_Sub2(this.aClass133_Sub3_16, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([BZII)V")
	public void method4489(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass164_Sub2_1.method8974(arg0, this.aClass133_Sub3_16.method7340(5123) * arg1);
		this.method4491(arg1, this.aClass164_Sub2_1);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	private void method4490() {
		if (!this.aBoolean375) {
			return;
		}
		this.aBoolean375 = false;
		@Pc(16) byte[] local16 = this.aClass342_1.aByteArray99;
		@Pc(20) byte[] local20 = this.aClass133_Sub3_16.aByteArray91;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass342_1.anInt9354;
		@Pc(36) int local36 = this.aClass342_1.anInt9354 * this.anInt4993 + this.anInt4995;
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
		if (this.aClass167_Sub3_3 != null && local22 == this.anInt4996) {
			this.aBoolean375 = false;
			return;
		}
		this.anInt4996 = local22;
		local36 = local26 * this.anInt4993 + this.anInt4995;
		local48 = 0;
		for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
			for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
				if (local16[local36] == 0) {
					@Pc(123) int local123 = 0;
					if (local16[local36 - 1] != 0) {
						local123++;
					}
					if (local16[local36 + 1] != 0) {
						local123++;
					}
					if (local16[local36 - local26] != 0) {
						local123++;
					}
					if (local16[local36 + local26] != 0) {
						local123++;
					}
					local20[local48++] = (byte) (local123 * 17);
				} else {
					local20[local48++] = 68;
				}
				local36++;
			}
			local36 += this.aClass342_1.anInt9354 - 128;
		}
		if (this.aClass167_Sub3_3 == null) {
			this.aClass167_Sub3_3 = new Class167_Sub3(this.aClass133_Sub3_16, 3553, 6406, 128, 128, false, this.aClass133_Sub3_16.aByteArray91, 6406, false);
			this.aClass167_Sub3_3.method7524(false, false);
			this.aClass167_Sub3_3.method8013(true);
		} else {
			this.aClass167_Sub3_3.method7520(128, 128, 6406, false, this.aClass133_Sub3_16.aByteArray91);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!sda;Z)V")
	private void method4491(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		if (arg0 != 0) {
			this.method4490();
			this.aClass133_Sub3_16.method7375(this.aClass167_Sub3_3);
			this.aClass133_Sub3_16.method7383(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public void method4492() {
		this.method4491(this.anInt4999, this.anInterface21_2);
	}
}
