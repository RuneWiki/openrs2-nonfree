import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class277 {

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	private int anInt7313 = -1;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
	public boolean aBoolean524 = true;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	private final int anInt7311;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private final int anInt7315;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!wg;")
	private final Class386 aClass386_2;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_31;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	private final int anInt7310;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!rba;")
	private Class10_Sub2 aClass10_Sub2_5;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Lclient!vv;")
	private Interface27 anInterface27_3;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Lclient!ts;")
	private Class167_Sub2 aClass167_Sub2_1;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!lf;Lclient!wg;Lclient!bja;IIIII)V")
	public Class277(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class35_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7311 = arg7;
		this.anInt7315 = arg6;
		this.aClass386_2 = arg1;
		this.aClass95_Sub3_31 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local37 + local35) * arg2.anInt9149;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray5[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt7310 = local27;
		if (local27 <= 0) {
			this.aClass10_Sub2_5 = null;
		} else {
			@Pc(96) Class3_Sub4 local96 = new Class3_Sub4(local27 * 2);
			@Pc(117) int local117;
			@Pc(125) short[] local125;
			@Pc(129) int local129;
			@Pc(115) int local115;
			if (this.aClass95_Sub3_31.aBoolean369) {
				for (local50 = 0; local50 < local25; local50++) {
					local115 = local31 + arg2.anInt9149 * (local35 + local50);
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray5[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local96.method7956(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local115 = (local35 + local50) * arg2.anInt9149 + local31;
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray5[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local96.method7942(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface27_3 = this.aClass95_Sub3_31.method4884(local96.aByteArray90, false, local96.anInt9739);
			this.aClass167_Sub2_1 = new Class167_Sub2(this.aClass95_Sub3_31, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public void method6127() {
		this.method6132(this.anInt7310, this.anInterface27_3);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BIZ)V")
	public void method6128(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass167_Sub2_1.method7795(arg1 * this.aClass95_Sub3_31.method4856(5123), arg0);
		this.method6132(arg1, this.aClass167_Sub2_1);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	private void method6131() {
		if (!this.aBoolean524) {
			return;
		}
		this.aBoolean524 = false;
		@Pc(16) byte[] local16 = this.aClass386_2.aByteArray102;
		@Pc(20) byte[] local20 = this.aClass95_Sub3_31.aByteArray47;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass386_2.anInt10728;
		@Pc(36) int local36 = this.anInt7311 * this.aClass386_2.anInt10728 + this.anInt7315;
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
		if (this.aClass10_Sub2_5 != null && this.anInt7313 == local22) {
			this.aBoolean524 = false;
			return;
		}
		this.anInt7313 = local22;
		local49 = 0;
		local36 = this.anInt7315 + this.anInt7311 * local26;
		for (@Pc(99) int local99 = -128; local99 < 0; local99++) {
			for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
				if (local16[local36] == 0) {
					@Pc(111) int local111 = 0;
					if (local16[local36 - 1] != 0) {
						local111++;
					}
					if (local16[local36 + 1] != 0) {
						local111++;
					}
					if (local16[local36 - local26] != 0) {
						local111++;
					}
					if (local16[local26 + local36] != 0) {
						local111++;
					}
					local20[local49++] = (byte) (local111 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass386_2.anInt10728 - 128;
		}
		if (this.aClass10_Sub2_5 == null) {
			this.aClass10_Sub2_5 = new Class10_Sub2(this.aClass95_Sub3_31, 3553, 6406, 128, 128, false, this.aClass95_Sub3_31.aByteArray47, 6406, false);
			this.aClass10_Sub2_5.method2859(false, false);
			this.aClass10_Sub2_5.method6097(true);
		} else {
			this.aClass10_Sub2_5.method2858(this.aClass95_Sub3_31.aByteArray47, 6406, false, 128, 128);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!vv;I)V")
	private void method6132(@OriginalArg(0) int arg0, @OriginalArg(1) Interface27 arg1) {
		if (arg0 != 0) {
			this.method6131();
			this.aClass95_Sub3_31.method4864(this.aClass10_Sub2_5);
			this.aClass95_Sub3_31.method4837(0, arg0, arg1);
		}
	}
}
