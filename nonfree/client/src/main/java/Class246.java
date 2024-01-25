import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class246 {

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "Z")
	public boolean aBoolean477 = true;

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
	private int anInt7092 = -1;

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_42;

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
	private final int anInt7089;

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "Lclient!hm;")
	private final Class103 aClass103_2;

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
	private final int anInt7084;

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
	private final int anInt7086;

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "Lclient!cd;")
	private Class31_Sub1 aClass31_Sub1_5;

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "Lclient!fp;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "Lclient!as;")
	private Class15_Sub1 aClass15_Sub1_2;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!tt;Lclient!hm;Lclient!jk;IIIII)V")
	public Class246(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) Class125_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass200_Sub2_42 = arg0;
		this.anInt7089 = arg7;
		this.aClass103_2 = arg1;
		this.anInt7084 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + (local35 + local37) * arg2.anInt6301;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray7[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt7086 = local27;
		if (local27 <= 0) {
			this.aClass31_Sub1_5 = null;
		} else {
			@Pc(97) Class5_Sub15 local97 = new Class5_Sub15(local27 * 2);
			@Pc(117) int local117;
			@Pc(125) short[] local125;
			@Pc(129) int local129;
			@Pc(115) int local115;
			if (this.aClass200_Sub2_42.aBoolean433) {
				for (local51 = 0; local51 < local25; local51++) {
					local115 = local31 + (local35 + local51) * arg2.anInt6301;
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray7[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local97.method5566(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local115 = local31 + arg2.anInt6301 * (local35 + local51);
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray7[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local97.method5568(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface5_5 = this.aClass200_Sub2_42.method5324(local97.anInt7013, false, local97.aByteArray93);
			this.aClass15_Sub1_2 = new Class15_Sub1(this.aClass200_Sub2_42, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public void method5617() {
		this.method5620(this.anInterface5_5, this.anInt7086);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II[BI)V")
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass15_Sub1_2.method1489(arg1, this.aClass200_Sub2_42.method5349(5123) * arg0);
		this.method5620(this.aClass15_Sub1_2, arg0);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLclient!fp;I)V")
	private void method5620(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method5621();
			this.aClass200_Sub2_42.method5312(this.aClass31_Sub1_5);
			this.aClass200_Sub2_42.method5325(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	private void method5621() {
		if (!this.aBoolean477) {
			return;
		}
		this.aBoolean477 = false;
		@Pc(16) byte[] local16 = this.aClass103_2.aByteArray36;
		@Pc(20) byte[] local20 = this.aClass200_Sub2_42.aByteArray86;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass103_2.anInt2747;
		@Pc(36) int local36 = this.anInt7084 + this.aClass103_2.anInt2747 * this.anInt7089;
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
		if (this.aClass31_Sub1_5 != null && local22 == this.anInt7092) {
			this.aBoolean477 = false;
			return;
		}
		this.anInt7092 = local22;
		local36 = local26 * this.anInt7089 + this.anInt7084;
		local49 = 0;
		for (@Pc(98) int local98 = -128; local98 < 0; local98++) {
			for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
				if (local16[local36] == 0) {
					@Pc(110) int local110 = 0;
					if (local16[local36 - 1] != 0) {
						local110++;
					}
					if (local16[local36 + 1] != 0) {
						local110++;
					}
					if (local16[local36 - local26] != 0) {
						local110++;
					}
					if (local16[local26 + local36] != 0) {
						local110++;
					}
					local20[local49++] = (byte) (local110 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass103_2.anInt2747 - 128;
		}
		if (this.aClass31_Sub1_5 == null) {
			this.aClass31_Sub1_5 = new Class31_Sub1(this.aClass200_Sub2_42, 3553, 6406, 128, 128, false, this.aClass200_Sub2_42.aByteArray86, 6406, false);
			this.aClass31_Sub1_5.method1520(false, false);
			this.aClass31_Sub1_5.method4591(true);
		} else {
			this.aClass31_Sub1_5.method1525(128, this.aClass200_Sub2_42.aByteArray86, 6406, 128, false);
		}
	}
}
