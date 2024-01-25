import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class290 {

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
	private int anInt7501 = -1;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "Z")
	public boolean aBoolean556 = true;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_35;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "Lclient!em;")
	private final Class93 aClass93_2;

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
	private final int anInt7502;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
	private final int anInt7506;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
	private final int anInt7500;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "Lclient!fq;")
	private Class65_Sub1 aClass65_Sub1_4;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "Lclient!vi;")
	private Interface26 anInterface26_5;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "Lclient!iia;")
	private Class153_Sub1 aClass153_Sub1_2;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!ep;Lclient!em;Lclient!dn;IIIII)V")
	public Class290(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class76_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass95_Sub1_35 = arg0;
		this.aClass93_2 = arg1;
		this.anInt7502 = arg7;
		this.anInt7506 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local37 + local35) * arg2.anInt8791;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray13[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt7500 = local27;
		if (local27 <= 0) {
			this.aClass65_Sub1_4 = null;
		} else {
			@Pc(100) Class2_Sub22 local100 = new Class2_Sub22(local27 * 2);
			@Pc(119) int local119;
			@Pc(127) short[] local127;
			@Pc(131) int local131;
			@Pc(117) int local117;
			if (this.aClass95_Sub1_35.aBoolean174) {
				for (local50 = 0; local50 < local25; local50++) {
					local117 = local31 + arg2.anInt8791 * (local35 + local50);
					for (local119 = 0; local119 < local25; local119++) {
						local127 = arg2.aShortArrayArray13[local117++];
						if (local127 != null) {
							for (local131 = 0; local131 < local127.length; local131++) {
								local100.method8500(local127[local131] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local117 = local31 + arg2.anInt8791 * (local35 + local50);
					for (local119 = 0; local119 < local25; local119++) {
						local127 = arg2.aShortArrayArray13[local117++];
						if (local127 != null) {
							for (local131 = 0; local131 < local127.length; local131++) {
								local100.method8492(local127[local131] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface26_5 = this.aClass95_Sub1_35.method2107(local100.anInt10247, local100.aByteArray115, false);
			this.aClass153_Sub1_2 = new Class153_Sub1(this.aClass95_Sub1_35, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BILclient!vi;)V")
	private void method6343(@OriginalArg(1) int arg0, @OriginalArg(2) Interface26 arg1) {
		if (arg0 != 0) {
			this.method6344();
			this.aClass95_Sub1_35.method2077(this.aClass65_Sub1_4);
			this.aClass95_Sub1_35.method2118(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
	private void method6344() {
		if (!this.aBoolean556) {
			return;
		}
		this.aBoolean556 = false;
		@Pc(16) byte[] local16 = this.aClass93_2.aByteArray32;
		@Pc(20) byte[] local20 = this.aClass95_Sub1_35.aByteArray33;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass93_2.anInt2266;
		@Pc(45) int local45 = this.anInt7506 + this.aClass93_2.anInt2266 * this.anInt7502;
		@Pc(58) int local58;
		for (@Pc(47) int local47 = -128; local47 < 0; local47++) {
			local22 = (local22 << 8) - local22;
			for (local58 = -128; local58 < 0; local58++) {
				if (local16[local45++] != 0) {
					local22++;
				}
			}
			local45 += local26 - 128;
		}
		if (this.aClass65_Sub1_4 != null && local22 == this.anInt7501) {
			this.aBoolean556 = false;
			return;
		}
		this.anInt7501 = local22;
		local45 = this.anInt7506 + this.anInt7502 * local26;
		local58 = 0;
		for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
			for (@Pc(114) int local114 = -128; local114 < 0; local114++) {
				if (local16[local45] == 0) {
					@Pc(125) int local125 = 0;
					if (local16[local45 - 1] != 0) {
						local125++;
					}
					if (local16[local45 + 1] != 0) {
						local125++;
					}
					if (local16[local45 - local26] != 0) {
						local125++;
					}
					if (local16[local26 + local45] != 0) {
						local125++;
					}
					local20[local58++] = (byte) (local125 * 17);
				} else {
					local20[local58++] = 68;
				}
				local45++;
			}
			local45 += this.aClass93_2.anInt2266 - 128;
		}
		if (this.aClass65_Sub1_4 == null) {
			this.aClass65_Sub1_4 = new Class65_Sub1(this.aClass95_Sub1_35, 3553, 6406, 128, 128, false, this.aClass95_Sub1_35.aByteArray33, 6406, false);
			this.aClass65_Sub1_4.method1424(false, false);
			this.aClass65_Sub1_4.method6836(true);
		} else {
			this.aClass65_Sub1_4.method1426(false, this.aClass95_Sub1_35.aByteArray33, 128, 128, 6406);
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
	public void method6346() {
		this.method6343(this.anInt7500, this.anInterface26_5);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[BII)V")
	public void method6347(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass153_Sub1_2.method5675(arg0, arg1 * this.aClass95_Sub1_35.method2117(5123));
		this.method6343(arg1, this.aClass153_Sub1_2);
	}
}
