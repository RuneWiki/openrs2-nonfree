import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "[Lclient!daa;")
	public Class56[] aClass56Array1;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "[Lclient!bp;")
	public Class3_Sub6_Sub1[] aClass3_Sub6_Sub1Array1;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
	public int anInt3407;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	private Class3_Sub15() {
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V")
	public Class3_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aClass56Array1 = new Class56[128];
		this.aShortArray59 = new short[128];
		this.aByteArray50 = new byte[128];
		this.aClass3_Sub6_Sub1Array1 = new Class3_Sub6_Sub1[128];
		this.anIntArray219 = new int[128];
		this.aByteArray49 = new byte[128];
		this.aByteArray51 = new byte[128];
		@Pc(34) Class3_Sub7 local34 = new Class3_Sub7(arg0);
		@Pc(36) int local36;
		for (local36 = 0; local34.aByteArray86[local34.anInt7869 + local36] != 0; local36++) {
		}
		@Pc(49) byte[] local49 = new byte[local36];
		for (@Pc(51) int local51 = 0; local51 < local36; local51++) {
			local49[local51] = local34.method6529();
		}
		local36++;
		local34.anInt7869++;
		@Pc(72) int local72 = local34.anInt7869;
		local34.anInt7869 += local36;
		@Pc(80) int local80;
		for (local80 = 0; local34.aByteArray86[local80 + local34.anInt7869] != 0; local80++) {
		}
		@Pc(93) byte[] local93 = new byte[local80];
		for (@Pc(95) int local95 = 0; local95 < local80; local95++) {
			local93[local95] = local34.method6529();
		}
		local34.anInt7869++;
		local80++;
		@Pc(116) int local116 = local34.anInt7869;
		local34.anInt7869 += local80;
		@Pc(124) int local124;
		for (local124 = 0; local34.aByteArray86[local34.anInt7869 + local124] != 0; local124++) {
		}
		@Pc(137) byte[] local137 = new byte[local124];
		for (@Pc(139) int local139 = 0; local139 < local124; local139++) {
			local137[local139] = local34.method6529();
		}
		local124++;
		local34.anInt7869++;
		@Pc(160) byte[] local160 = new byte[local124];
		@Pc(167) int local167;
		@Pc(178) int local178;
		@Pc(183) int local183;
		if (local124 <= 1) {
			local167 = local124;
		} else {
			local160[1] = 1;
			local167 = 2;
			@Pc(176) int local176 = 1;
			for (local178 = 2; local178 < local124; local178++) {
				local183 = local34.method6538();
				if (local183 == 0) {
					local176 = local167++;
				} else {
					if (local176 >= local183) {
						local183--;
					}
					local176 = local183;
				}
				local160[local178] = (byte) local176;
			}
		}
		@Pc(214) Class56[] local214 = new Class56[local167];
		for (local178 = 0; local178 < local214.length; local178++) {
			@Pc(225) Class56 local225 = local214[local178] = new Class56();
			@Pc(229) int local229 = local34.method6538();
			if (local229 > 0) {
				local225.aByteArray20 = new byte[local229 * 2];
			}
			local229 = local34.method6538();
			if (local229 > 0) {
				local225.aByteArray19 = new byte[local229 * 2 + 2];
				local225.aByteArray19[1] = 64;
			}
		}
		local183 = local34.method6538();
		@Pc(284) byte[] local284 = local183 > 0 ? new byte[local183 * 2] : null;
		local183 = local34.method6538();
		@Pc(300) byte[] local300 = local183 > 0 ? new byte[local183 * 2] : null;
		@Pc(302) int local302;
		for (local302 = 0; local34.aByteArray86[local302 + local34.anInt7869] != 0; local302++) {
		}
		@Pc(318) byte[] local318 = new byte[local302];
		for (@Pc(320) int local320 = 0; local320 < local302; local320++) {
			local318[local320] = local34.method6529();
		}
		local302++;
		local34.anInt7869++;
		@Pc(344) int local344 = 0;
		for (@Pc(346) int local346 = 0; local346 < 128; local346++) {
			local344 += local34.method6538();
			this.aShortArray59[local346] = (short) local344;
		}
		local344 = 0;
		for (@Pc(369) int local369 = 0; local369 < 128; local369++) {
			local344 += local34.method6538();
			this.aShortArray59[local369] = (short) (this.aShortArray59[local369] + (local344 << 8));
		}
		@Pc(395) int local395 = 0;
		@Pc(397) int local397 = 0;
		@Pc(399) int local399 = 0;
		for (@Pc(401) int local401 = 0; local401 < 128; local401++) {
			if (local395 == 0) {
				if (local318.length > local397) {
					local395 = local318[local397++];
				} else {
					local395 = -1;
				}
				local399 = local34.method6524();
			}
			this.aShortArray59[local401] = (short) (this.aShortArray59[local401] + ((local399 - 1 & 0x2) << 14));
			this.anIntArray219[local401] = local399;
			local395--;
		}
		local395 = 0;
		local397 = 0;
		@Pc(460) int local460 = 0;
		for (@Pc(462) int local462 = 0; local462 < 128; local462++) {
			if (this.anIntArray219[local462] != 0) {
				if (local395 == 0) {
					local460 = local34.aByteArray86[local72++] - 1;
					if (local397 >= local49.length) {
						local395 = -1;
					} else {
						local395 = local49[local397++];
					}
				}
				local395--;
				this.aByteArray49[local462] = (byte) local460;
			}
		}
		local397 = 0;
		local395 = 0;
		@Pc(515) int local515 = 0;
		for (@Pc(517) int local517 = 0; local517 < 128; local517++) {
			if (this.anIntArray219[local517] != 0) {
				if (local395 == 0) {
					local515 = local34.aByteArray86[local116++] + 16 << 2;
					if (local397 >= local93.length) {
						local395 = -1;
					} else {
						local395 = local93[local397++];
					}
				}
				this.aByteArray50[local517] = (byte) local515;
				local395--;
			}
		}
		local395 = 0;
		local397 = 0;
		@Pc(571) Class56 local571 = null;
		for (@Pc(573) int local573 = 0; local573 < 128; local573++) {
			if (this.anIntArray219[local573] != 0) {
				if (local395 == 0) {
					local571 = local214[local160[local397]];
					if (local137.length <= local397) {
						local395 = -1;
					} else {
						local395 = local137[local397++];
					}
				}
				this.aClass56Array1[local573] = local571;
				local395--;
			}
		}
		local395 = 0;
		local397 = 0;
		@Pc(621) int local621 = 0;
		for (@Pc(623) int local623 = 0; local623 < 128; local623++) {
			if (local395 == 0) {
				if (local397 < local318.length) {
					local395 = local318[local397++];
				} else {
					local395 = -1;
				}
				if (this.anIntArray219[local623] > 0) {
					local621 = local34.method6538() + 1;
				}
			}
			local395--;
			this.aByteArray51[local623] = (byte) local621;
		}
		this.anInt3407 = local34.method6538() + 1;
		@Pc(683) int local683;
		for (@Pc(673) int local673 = 0; local673 < local167; local673++) {
			@Pc(678) Class56 local678 = local214[local673];
			if (local678.aByteArray20 != null) {
				for (local683 = 1; local683 < local678.aByteArray20.length; local683 += 2) {
					local678.aByteArray20[local683] = local34.method6529();
				}
			}
			if (local678.aByteArray19 != null) {
				for (local683 = 3; local683 < local678.aByteArray19.length - 2; local683 += 2) {
					local678.aByteArray19[local683] = local34.method6529();
				}
			}
		}
		@Pc(734) int local734;
		if (local284 != null) {
			for (local734 = 1; local734 < local284.length; local734 += 2) {
				local284[local734] = local34.method6529();
			}
		}
		if (local300 != null) {
			for (local734 = 1; local734 < local300.length; local734 += 2) {
				local300[local734] = local34.method6529();
			}
		}
		@Pc(780) int local780;
		for (local734 = 0; local734 < local167; local734++) {
			@Pc(773) Class56 local773 = local214[local734];
			if (local773.aByteArray19 != null) {
				local344 = 0;
				for (local780 = 2; local780 < local773.aByteArray19.length; local780 += 2) {
					local344 = local344 + local34.method6538() + 1;
					local773.aByteArray19[local780] = (byte) local344;
				}
			}
		}
		@Pc(823) int local823;
		for (local683 = 0; local683 < local167; local683++) {
			@Pc(816) Class56 local816 = local214[local683];
			if (local816.aByteArray20 != null) {
				local344 = 0;
				for (local823 = 2; local823 < local816.aByteArray20.length; local823 += 2) {
					local344 -= -local34.method6538() - 1;
					local816.aByteArray20[local823] = (byte) local344;
				}
			}
		}
		@Pc(894) int local894;
		@Pc(916) int local916;
		@Pc(921) byte local921;
		@Pc(940) int local940;
		@Pc(942) int local942;
		@Pc(951) int local951;
		@Pc(888) byte local888;
		@Pc(993) int local993;
		if (local284 != null) {
			local344 = local34.method6538();
			local284[0] = (byte) local344;
			for (local780 = 2; local780 < local284.length; local780 += 2) {
				local344 = local344 + local34.method6538() + 1;
				local284[local780] = (byte) local344;
			}
			local888 = local284[0];
			@Pc(892) byte local892 = local284[1];
			for (local894 = 0; local894 < local888; local894++) {
				this.aByteArray51[local894] = (byte) (local892 * this.aByteArray51[local894] + 32 >> 6);
			}
			for (local916 = 2; local916 < local284.length; local916 += 2) {
				local921 = local284[local916];
				@Pc(927) byte local927 = local284[local916 + 1];
				local940 = local892 * (local921 - local888) + (local921 - local888) / 2;
				for (local942 = local888; local942 < local921; local942++) {
					local951 = Static44.method1171(local921 - local888, local940);
					this.aByteArray51[local942] = (byte) (this.aByteArray51[local942] * local951 + 32 >> 6);
					local940 += local927 - local892;
				}
				local888 = local921;
				local892 = local927;
			}
			for (local993 = local888; local993 < 128; local993++) {
				this.aByteArray51[local993] = (byte) (local892 * this.aByteArray51[local993] + 32 >> 6);
			}
		}
		@Pc(1055) int local1055;
		if (local300 != null) {
			local344 = local34.method6538();
			local300[0] = (byte) local344;
			for (local780 = 2; local780 < local300.length; local780 += 2) {
				local344 += local34.method6538() + 1;
				local300[local780] = (byte) local344;
			}
			local888 = local300[0];
			local1055 = local300[1] << 1;
			for (local894 = 0; local894 < local888; local894++) {
				local916 = (this.aByteArray50[local894] & 0xFF) + local1055;
				if (local916 < 0) {
					local916 = 0;
				}
				if (local916 > 128) {
					local916 = 128;
				}
				this.aByteArray50[local894] = (byte) local916;
			}
			@Pc(1107) int local1107;
			for (local916 = 2; local916 < local300.length; local916 += 2) {
				local921 = local300[local916];
				local1107 = local300[local916 + 1] << 1;
				local940 = (local921 - local888) / 2 + local1055 * (local921 - local888);
				for (local942 = local888; local942 < local921; local942++) {
					local951 = Static44.method1171(local921 - local888, local940);
					@Pc(1140) int local1140 = local951 + (this.aByteArray50[local942] & 0xFF);
					if (local1140 < 0) {
						local1140 = 0;
					}
					if (local1140 > 128) {
						local1140 = 128;
					}
					local940 += local1107 - local1055;
					this.aByteArray50[local942] = (byte) local1140;
				}
				local888 = local921;
				local1055 = local1107;
			}
			for (local993 = local888; local993 < 128; local993++) {
				local1107 = (this.aByteArray50[local993] & 0xFF) + local1055;
				if (local1107 < 0) {
					local1107 = 0;
				}
				if (local1107 > 128) {
					local1107 = 128;
				}
				this.aByteArray50[local993] = (byte) local1107;
			}
		}
		for (local780 = 0; local780 < local167; local780++) {
			local214[local780].anInt1921 = local34.method6538();
		}
		for (local823 = 0; local823 < local167; local823++) {
			@Pc(1241) Class56 local1241 = local214[local823];
			if (local1241.aByteArray20 != null) {
				local1241.anInt1922 = local34.method6538();
			}
			if (local1241.aByteArray19 != null) {
				local1241.anInt1920 = local34.method6538();
			}
			if (local1241.anInt1921 > 0) {
				local1241.anInt1923 = local34.method6538();
			}
		}
		for (local1055 = 0; local1055 < local167; local1055++) {
			local214[local1055].anInt1917 = local34.method6538();
		}
		for (local894 = 0; local894 < local167; local894++) {
			@Pc(1293) Class56 local1293 = local214[local894];
			if (local1293.anInt1917 > 0) {
				local1293.anInt1916 = local34.method6538();
			}
		}
		for (local916 = 0; local916 < local167; local916++) {
			@Pc(1312) Class56 local1312 = local214[local916];
			if (local1312.anInt1916 > 0) {
				local1312.anInt1919 = local34.method6538();
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BBLclient!hf;[I)Z")
	public boolean method3007(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class138 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class3_Sub6_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(31) int local31 = this.anIntArray219[local19];
				if (local31 != 0) {
					if (local31 != local15) {
						local15 = local31--;
						if ((local31 & 0x1) == 0) {
							local17 = arg1.method3283(local31 >> 2, arg2);
						} else {
							local17 = arg1.method3284(local31 >> 2, arg2);
						}
						if (local17 == null) {
							local13 = false;
						}
					}
					if (local17 != null) {
						this.aClass3_Sub6_Sub1Array1[local19] = local17;
						this.anIntArray219[local19] = 0;
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public void method3009() {
		this.anIntArray219 = null;
	}
}
