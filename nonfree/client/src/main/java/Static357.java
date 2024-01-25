import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!la;")
	public static Class208 aClass208_80;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable8 = new Hashtable();

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public static int anInt6271 = 0;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray16 = new int[2][][];

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public static int anInt6272 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([Lclient!df;II)V")
	public static void method5333(@OriginalArg(0) Class8_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class8_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10361;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10361 > local27 + (local29 & 0x1)) {
				@Pc(44) Class8_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method5333(arg0, arg1, local10 - 1);
		method5333(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5334(@OriginalArg(1) String arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static444.aStringArray55.length; local14++) {
			if (Static444.aStringArray55[local14].equalsIgnoreCase(arg0)) {
				return local14;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ub;I)V")
	public static void method5336(@OriginalArg(1) Class5_Sub23_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) boolean local18 = arg0.method8550(1) == 1;
		if (local18) {
			Static129.anIntArray122[Static226.anInt3673++] = arg1;
		}
		@Pc(35) int local35 = arg0.method8550(2);
		@Pc(39) Class8_Sub1_Sub3_Sub2_Sub1 local39 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[arg1];
		if (local35 != 0) {
			@Pc(167) int local167;
			@Pc(172) int local172;
			@Pc(177) int local177;
			if (local35 == 1) {
				local167 = arg0.method8550(3);
				local172 = local39.anIntArray414[0];
				local177 = local39.anIntArray415[0];
				if (local167 == 0) {
					local177--;
					local172--;
				} else if (local167 == 1) {
					local177--;
				} else if (local167 == 2) {
					local177--;
					local172++;
				} else if (local167 == 3) {
					local172--;
				} else if (local167 == 4) {
					local172++;
				} else if (local167 == 5) {
					local177++;
					local172--;
				} else if (local167 == 6) {
					local177++;
				} else if (local167 == 7) {
					local177++;
					local172++;
				}
				if (local18) {
					local39.anInt4187 = local172;
					local39.aBoolean329 = true;
					local39.anInt4214 = local177;
				} else {
					local39.method3601(Static10.aByteArray1[arg1], local177, local172);
				}
			} else if (local35 == 2) {
				local167 = arg0.method8550(4);
				local172 = local39.anIntArray414[0];
				local177 = local39.anIntArray415[0];
				if (local167 == 0) {
					local177 -= 2;
					local172 -= 2;
				} else if (local167 == 1) {
					local177 -= 2;
					local172--;
				} else if (local167 == 2) {
					local177 -= 2;
				} else if (local167 == 3) {
					local172++;
					local177 -= 2;
				} else if (local167 == 4) {
					local172 += 2;
					local177 -= 2;
				} else if (local167 == 5) {
					local177--;
					local172 -= 2;
				} else if (local167 == 6) {
					local177--;
					local172 += 2;
				} else if (local167 == 7) {
					local172 -= 2;
				} else if (local167 == 8) {
					local172 += 2;
				} else if (local167 == 9) {
					local177++;
					local172 -= 2;
				} else if (local167 == 10) {
					local177++;
					local172 += 2;
				} else if (local167 == 11) {
					local172 -= 2;
					local177 += 2;
				} else if (local167 == 12) {
					local177 += 2;
					local172--;
				} else if (local167 == 13) {
					local177 += 2;
				} else if (local167 == 14) {
					local177 += 2;
					local172++;
				} else if (local167 == 15) {
					local177 += 2;
					local172 += 2;
				}
				if (local18) {
					local39.aBoolean329 = true;
					local39.anInt4187 = local172;
					local39.anInt4214 = local177;
				} else {
					local39.method3601(Static10.aByteArray1[arg1], local177, local172);
				}
			} else {
				local167 = arg0.method8550(1);
				@Pc(538) int local538;
				@Pc(548) int local548;
				@Pc(561) int local561;
				@Pc(568) int local568;
				if (local167 == 0) {
					local172 = arg0.method8550(12);
					local177 = local172 >> 10;
					local538 = local172 >> 5 & 0x1F;
					if (local538 > 15) {
						local538 -= 32;
					}
					local548 = local172 & 0x1F;
					if (local548 > 15) {
						local548 -= 32;
					}
					local561 = local39.anIntArray414[0] + local538;
					local568 = local548 + local39.anIntArray415[0];
					if (local18) {
						local39.aBoolean329 = true;
						local39.anInt4187 = local561;
						local39.anInt4214 = local568;
					} else {
						local39.method3601(Static10.aByteArray1[arg1], local568, local561);
					}
					local39.aByte145 = local39.aByte146 = (byte) (local177 + local39.aByte145 & 0x3);
					if (Static90.method1353(1, local568, local561)) {
						local39.aByte146++;
					}
					if (arg1 == Static279.anInt4838) {
						if (local39.aByte145 != Static240.anInt3974) {
							Static554.aBoolean714 = true;
						}
						Static240.anInt3974 = local39.aByte145;
					}
				} else {
					local172 = arg0.method8550(30);
					local177 = local172 >> 28;
					local538 = local172 >> 14 & 0x3FFF;
					local548 = local172 & 0x3FFF;
					local561 = (Static622.anInt10188 + local39.anIntArray414[0] + local538 & 0x3FFF) - Static622.anInt10188;
					local568 = (local548 + Static668.anInt10683 + local39.anIntArray415[0] & 0x3FFF) - Static668.anInt10683;
					if (local18) {
						local39.anInt4214 = local568;
						local39.aBoolean329 = true;
						local39.anInt4187 = local561;
					} else {
						local39.method3601(Static10.aByteArray1[arg1], local568, local561);
					}
					local39.aByte145 = local39.aByte146 = (byte) (local177 + local39.aByte145 & 0x3);
					if (Static90.method1353(1, local568, local561)) {
						local39.aByte146++;
					}
					if (Static279.anInt4838 == arg1) {
						Static240.anInt3974 = local39.aByte145;
					}
				}
			}
		} else if (local18) {
			local39.aBoolean329 = false;
		} else if (Static279.anInt4838 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(69) Class136 local69 = Static601.aClass136Array1[arg1] = new Class136();
			local69.anInt2999 = (local39.aByte145 << 28) - (-(local39.anIntArray414[0] + Static622.anInt10188 >> 6 << 14) - (local39.anIntArray415[0] + Static668.anInt10683 >> 6));
			if (local39.anInt4199 == -1) {
				local69.anInt2997 = local39.aClass270_7.method6422(5);
			} else {
				local69.anInt2997 = local39.anInt4199;
			}
			local69.aBoolean252 = local39.aBoolean328;
			local69.anInt2998 = local39.anInt7041;
			local69.aBoolean251 = local39.aBoolean325;
			if (local39.anInt4190 > 0) {
				Static593.method8591(local39);
			}
			Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method8550(1) != 0) {
				Static403.method5924(arg1, arg0);
			}
		}
	}
}
