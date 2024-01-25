import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class286 {

	@OriginalMember(owner = "client!qia", name = "e", descriptor = "Z")
	public boolean aBoolean613 = true;

	@OriginalMember(owner = "client!qia", name = "m", descriptor = "I")
	private int anInt8106 = -1;

	@OriginalMember(owner = "client!qia", name = "o", descriptor = "Lclient!qga;")
	private final Class284 aClass284_2;

	@OriginalMember(owner = "client!qia", name = "d", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_35;

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "I")
	private final int anInt8103;

	@OriginalMember(owner = "client!qia", name = "l", descriptor = "I")
	private final int anInt8105;

	@OriginalMember(owner = "client!qia", name = "n", descriptor = "I")
	private final int anInt8107;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "Lclient!m;")
	private Interface17 anInterface17_4;

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "Lclient!hb;")
	private Class17_Sub1 aClass17_Sub1_2;

	@OriginalMember(owner = "client!qia", name = "f", descriptor = "Lclient!tca;")
	private Class85_Sub3 aClass85_Sub3_5;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!dia;Lclient!qga;Lclient!ct;IIIII)V")
	public Class286(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class21_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass284_2 = arg1;
		this.aClass13_Sub2_35 = arg0;
		this.anInt8103 = arg7;
		this.anInt8105 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt9129 * (local35 + local37);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray3[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt8107 = local27;
		if (local27 <= 0) {
			this.aClass85_Sub3_5 = null;
		} else {
			@Pc(92) Class3_Sub25 local92 = new Class3_Sub25(local27 * 2);
			@Pc(111) int local111;
			@Pc(119) short[] local119;
			@Pc(123) int local123;
			@Pc(109) int local109;
			if (this.aClass13_Sub2_35.aBoolean166) {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = local31 + arg2.anInt9129 * (local35 + local50);
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray3[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method8649(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = local31 + (local50 + local35) * arg2.anInt9129;
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray3[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method8602(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface17_4 = this.aClass13_Sub2_35.method1968(local92.anInt9765, false, local92.aByteArray106);
			this.aClass17_Sub1_2 = new Class17_Sub1(this.aClass13_Sub2_35, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
	public void method7086() {
		this.method7090(this.anInterface17_4, this.anInt8107);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(III[B)V")
	public void method7087(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass17_Sub1_2.method6786(arg0 * this.aClass13_Sub2_35.method2029(5123), arg1);
		this.method7090(this.aClass17_Sub1_2, arg0);
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)V")
	private void method7089() {
		if (!this.aBoolean613) {
			return;
		}
		this.aBoolean613 = false;
		@Pc(16) byte[] local16 = this.aClass284_2.aByteArray85;
		@Pc(20) byte[] local20 = this.aClass13_Sub2_35.aByteArray13;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass284_2.anInt8055;
		@Pc(36) int local36 = this.anInt8103 * this.aClass284_2.anInt8055 + this.anInt8105;
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
		if (this.aClass85_Sub3_5 != null && this.anInt8106 == local22) {
			this.aBoolean613 = false;
			return;
		}
		this.anInt8106 = local22;
		local36 = this.anInt8103 * local26 + this.anInt8105;
		local49 = 0;
		for (@Pc(99) int local99 = -128; local99 < 0; local99++) {
			for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
				if (local16[local36] == 0) {
					@Pc(114) int local114 = 0;
					if (local16[local36 - 1] != 0) {
						local114++;
					}
					if (local16[local36 + 1] != 0) {
						local114++;
					}
					if (local16[local36 - local26] != 0) {
						local114++;
					}
					if (local16[local36 + local26] != 0) {
						local114++;
					}
					local20[local49++] = (byte) (local114 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass284_2.anInt8055 - 128;
		}
		if (this.aClass85_Sub3_5 == null) {
			this.aClass85_Sub3_5 = new Class85_Sub3(this.aClass13_Sub2_35, 3553, 6406, 128, 128, false, this.aClass13_Sub2_35.aByteArray13, 6406, false);
			this.aClass85_Sub3_5.method5365(false, false);
			this.aClass85_Sub3_5.method7875(true);
		} else {
			this.aClass85_Sub3_5.method5368(128, false, 128, this.aClass13_Sub2_35.aByteArray13, 6406);
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!m;II)V")
	private void method7090(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method7089();
			this.aClass13_Sub2_35.method2024(this.aClass85_Sub3_5);
			this.aClass13_Sub2_35.method1957(arg0, arg1, 0);
		}
	}
}
