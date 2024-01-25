import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class189 {

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
	private int anInt5980 = -1;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Z")
	public boolean aBoolean401 = true;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
	private final int anInt5978;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "Lclient!wha;")
	private final Class374 aClass374_1;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	private final int anInt5982;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_32;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	private final int anInt5979;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!aw;")
	private Class3_Sub2 aClass3_Sub2_4;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!gh;")
	private Interface10 anInterface10_3;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!ck;")
	private Class54_Sub1 aClass54_Sub1_2;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!wh;Lclient!wha;Lclient!mh;IIIII)V")
	public Class189(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class374 arg1, @OriginalArg(2) Class199_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5978 = arg6;
		this.aClass374_1 = arg1;
		this.anInt5982 = arg7;
		this.aClass100_Sub3_32 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = arg2.anInt10111 * (local35 + local37) + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray9[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt5979 = local27;
		if (local27 <= 0) {
			this.aClass3_Sub2_4 = null;
		} else {
			@Pc(92) Class6_Sub40 local92 = new Class6_Sub40(local27 * 2);
			@Pc(111) int local111;
			@Pc(119) short[] local119;
			@Pc(123) int local123;
			@Pc(109) int local109;
			if (this.aClass100_Sub3_32.aBoolean700) {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = arg2.anInt10111 * (local35 + local50) + local31;
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray9[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method8561(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = local31 + arg2.anInt10111 * (local50 + local35);
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray9[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method8617(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface10_3 = this.aClass100_Sub3_32.method8916(false, local92.aByteArray113, local92.anInt10169);
			this.aClass54_Sub1_2 = new Class54_Sub1(this.aClass100_Sub3_32, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBLclient!gh;)V")
	private void method5236(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (arg0 != 0) {
			this.method5240();
			this.aClass100_Sub3_32.method8925(this.aClass3_Sub2_4);
			this.aClass100_Sub3_32.method8901(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BII[B)V")
	public void method5237(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass54_Sub1_2.method1317(this.aClass100_Sub3_32.method8894(5123) * arg0, arg1);
		this.method5236(arg0, this.aClass54_Sub1_2);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
	public void method5239() {
		this.method5236(this.anInt5979, this.anInterface10_3);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	private void method5240() {
		if (!this.aBoolean401) {
			return;
		}
		this.aBoolean401 = false;
		@Pc(16) byte[] local16 = this.aClass374_1.aByteArray124;
		@Pc(20) byte[] local20 = this.aClass100_Sub3_32.aByteArray123;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass374_1.anInt10634;
		@Pc(36) int local36 = this.anInt5982 * this.aClass374_1.anInt10634 + this.anInt5978;
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
		if (this.aClass3_Sub2_4 != null && local22 == this.anInt5980) {
			this.aBoolean401 = false;
			return;
		}
		this.anInt5980 = local22;
		local36 = this.anInt5982 * local26 + this.anInt5978;
		local49 = 0;
		for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
				if (local16[local36] == 0) {
					@Pc(117) int local117 = 0;
					if (local16[local36 - 1] != 0) {
						local117++;
					}
					if (local16[local36 + 1] != 0) {
						local117++;
					}
					if (local16[local36 - local26] != 0) {
						local117++;
					}
					if (local16[local36 + local26] != 0) {
						local117++;
					}
					local20[local49++] = (byte) (local117 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass374_1.anInt10634 - 128;
		}
		if (this.aClass3_Sub2_4 == null) {
			this.aClass3_Sub2_4 = new Class3_Sub2(this.aClass100_Sub3_32, 3553, 6406, 128, 128, false, this.aClass100_Sub3_32.aByteArray123, 6406, false);
			this.aClass3_Sub2_4.method3904(false, false);
			this.aClass3_Sub2_4.method5781(true);
		} else {
			this.aClass3_Sub2_4.method3903(128, this.aClass100_Sub3_32.aByteArray123, 128, 6406, false);
		}
	}
}
