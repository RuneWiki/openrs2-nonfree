import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class352 {

	@OriginalMember(owner = "client!wea", name = "k", descriptor = "Z")
	public boolean aBoolean843 = true;

	@OriginalMember(owner = "client!wea", name = "m", descriptor = "I")
	private int anInt10213 = -1;

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "I")
	private final int anInt10211;

	@OriginalMember(owner = "client!wea", name = "n", descriptor = "Lclient!tfa;")
	private final Class309 aClass309_1;

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_41;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
	private final int anInt10206;

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
	private final int anInt10208;

	@OriginalMember(owner = "client!wea", name = "o", descriptor = "Lclient!ul;")
	private Interface21 anInterface21_5;

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "Lclient!ur;")
	private Class94_Sub2 aClass94_Sub2_2;

	@OriginalMember(owner = "client!wea", name = "j", descriptor = "Lclient!vga;")
	private Class11_Sub2 aClass11_Sub2_5;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!ji;Lclient!tfa;Lclient!wo;IIIII)V")
	public Class352(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(2) Class4_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt10211 = arg7;
		this.aClass309_1 = arg1;
		this.aClass15_Sub3_41 = arg0;
		this.anInt10206 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = arg2.anInt10461 * (local37 + local35) + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray13[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt10208 = local27;
		if (local27 <= 0) {
			this.aClass11_Sub2_5 = null;
		} else {
			@Pc(89) Class3_Sub7 local89 = new Class3_Sub7(local27 * 2);
			@Pc(108) int local108;
			@Pc(116) short[] local116;
			@Pc(120) int local120;
			@Pc(106) int local106;
			if (this.aClass15_Sub3_41.aBoolean442) {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = local31 + (local50 + local35) * arg2.anInt10461;
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray13[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local89.method6528(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = arg2.anInt10461 * (local50 + local35) + local31;
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray13[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local89.method6498(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface21_5 = this.aClass15_Sub3_41.method4459(false, local89.aByteArray86, local89.anInt7869);
			this.aClass94_Sub2_2 = new Class94_Sub2(this.aClass15_Sub3_41, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II[BI)V")
	public void method8270(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass94_Sub2_2.method7918(arg0, this.aClass15_Sub3_41.method4398(5123) * arg1);
		this.method8274(this.aClass94_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
	private void method8271() {
		if (!this.aBoolean843) {
			return;
		}
		this.aBoolean843 = false;
		@Pc(16) byte[] local16 = this.aClass309_1.aByteArray108;
		@Pc(24) byte[] local24 = this.aClass15_Sub3_41.aByteArray61;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = this.aClass309_1.anInt9314;
		@Pc(40) int local40 = this.aClass309_1.anInt9314 * this.anInt10211 + this.anInt10206;
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
		if (this.aClass11_Sub2_5 != null && local26 == this.anInt10213) {
			this.aBoolean843 = false;
			return;
		}
		this.anInt10213 = local26;
		local40 = local30 * this.anInt10211 + this.anInt10206;
		local53 = 0;
		for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
				if (local16[local40] == 0) {
					@Pc(114) int local114 = 0;
					if (local16[local40 - 1] != 0) {
						local114++;
					}
					if (local16[local40 + 1] != 0) {
						local114++;
					}
					if (local16[local40 - local30] != 0) {
						local114++;
					}
					if (local16[local30 + local40] != 0) {
						local114++;
					}
					local24[local53++] = (byte) (local114 * 17);
				} else {
					local24[local53++] = 68;
				}
				local40++;
			}
			local40 += this.aClass309_1.anInt9314 - 128;
		}
		if (this.aClass11_Sub2_5 == null) {
			this.aClass11_Sub2_5 = new Class11_Sub2(this.aClass15_Sub3_41, 3553, 6406, 128, 128, false, this.aClass15_Sub3_41.aByteArray61, 6406, false);
			this.aClass11_Sub2_5.method1633(false, false);
			this.aClass11_Sub2_5.method7412(true);
		} else {
			this.aClass11_Sub2_5.method1641(this.aClass15_Sub3_41.aByteArray61, false, 128, 6406, 128);
		}
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V")
	public void method8272() {
		this.method8274(this.anInterface21_5, this.anInt10208);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!ul;II)V")
	private void method8274(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method8271();
			this.aClass15_Sub3_41.method4377(this.aClass11_Sub2_5);
			this.aClass15_Sub3_41.method4453(arg1, arg0, 0);
		}
	}
}
