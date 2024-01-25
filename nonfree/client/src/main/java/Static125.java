import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIZ)I")
	public static int method1833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return 1023 - arg2;
		} else if (local12 == 2) {
			return 1023 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([Lclient!bc;Lclient!pg;Z)Lclient!ie;")
	public static Class113 method1834(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class163_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong14 <= 0L) {
				return null;
			}
		}
		@Pc(36) long local36 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
			OpenGL.glAttachObjectARB(local36, arg0[local38].aLong14);
		}
		OpenGL.glLinkProgramARB(local36);
		OpenGL.glGetObjectParameterivARB(local36, 35714, Static7.anIntArray11, 0);
		if (Static7.anIntArray11[0] == 0) {
			if (Static7.anIntArray11[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local36, 35716, Static7.anIntArray11, 1);
			if (Static7.anIntArray11[1] > 1) {
				@Pc(87) byte[] local87 = new byte[Static7.anIntArray11[1]];
				OpenGL.glGetInfoLogARB(local36, Static7.anIntArray11[1], Static7.anIntArray11, 0, local87, 0);
				System.out.println(new String(local87));
			}
			if (Static7.anIntArray11[0] == 0) {
				for (@Pc(111) int local111 = 0; local111 < arg0.length; local111++) {
					OpenGL.glDetachObjectARB(local36, arg0[local111].aLong14);
				}
				OpenGL.glDeleteObjectARB(local36);
				return null;
			}
		}
		return new Class113(arg1, local36, arg0);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!dc;Z)V")
	public static void method1835(@OriginalArg(1) Class3_Sub4_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class173 local9 = arg0.method4001();
		if (arg0.anInt4977 == 0) {
			Static361.anInt6087 = 0;
			arg0.anInt4978 = 0;
			Static179.anInt3085 = -1;
			return;
		}
		if (arg0.anInt4903 != -1 && arg0.anInt4954 == 0) {
			@Pc(36) Class128 local36 = Static334.aClass62_2.method1418(arg0.anInt4903);
			if (arg0.anInt4976 > 0 && local36.anInt3328 == 0) {
				Static361.anInt6087 = 0;
				Static179.anInt3085 = -1;
				arg0.anInt4978++;
				return;
			}
			if (arg0.anInt4976 <= 0 && local36.anInt3341 == 0) {
				Static361.anInt6087 = 0;
				Static179.anInt3085 = -1;
				arg0.anInt4978++;
				return;
			}
		}
		@Pc(104) Class128 local104;
		@Pc(91) Class229 local91;
		if (arg0.anInt4964 != -1 && Static266.anInt4392 >= arg0.anInt4944) {
			local91 = Static431.aClass36_2.method696(arg0.anInt4964);
			if (local91.aBoolean449 && local91.anInt6240 != -1) {
				local104 = Static334.aClass62_2.method1418(local91.anInt6240);
				if (arg0.anInt4976 > 0 && local104.anInt3328 == 0) {
					arg0.anInt4978++;
					Static361.anInt6087 = 0;
					Static179.anInt3085 = -1;
					return;
				}
				if (arg0.anInt4976 <= 0 && local104.anInt3341 == 0) {
					arg0.anInt4978++;
					Static361.anInt6087 = 0;
					Static179.anInt3085 = -1;
					return;
				}
			}
		}
		if (arg0.anInt4964 != -1 && arg0.anInt4944 <= Static266.anInt4392) {
			local91 = Static431.aClass36_2.method696(arg0.anInt4964);
			if (local91.aBoolean449 && local91.anInt6240 != -1) {
				local104 = Static334.aClass62_2.method1418(local91.anInt6240);
				if (arg0.anInt4976 > 0 && local104.anInt3328 == 0) {
					Static179.anInt3085 = -1;
					Static361.anInt6087 = 0;
					arg0.anInt4978++;
					return;
				}
				if (arg0.anInt4976 <= 0 && local104.anInt3341 == 0) {
					Static179.anInt3085 = -1;
					Static361.anInt6087 = 0;
					arg0.anInt4978++;
					return;
				}
			}
		}
		@Pc(210) int local210 = arg0.anInt6833;
		@Pc(217) int local217 = arg0.anInt6835;
		@Pc(234) int local234 = arg0.anIntArray425[arg0.anInt4977 - 1] * 128 + arg0.method4009() * 64;
		@Pc(251) int local251 = arg0.anIntArray424[arg0.anInt4977 - 1] * 128 + arg0.method4009() * 64;
		if (local210 < local234) {
			if (local217 < local251) {
				arg0.method4003(10240);
			} else if (local251 < local217) {
				arg0.method4003(14336);
			} else {
				arg0.method4003(12288);
			}
		} else if (local234 >= local210) {
			if (local217 < local251) {
				arg0.method4003(8192);
			} else if (local251 < local217) {
				arg0.method4003(0);
			}
		} else if (local217 < local251) {
			arg0.method4003(6144);
		} else if (local251 >= local217) {
			arg0.method4003(4096);
		} else {
			arg0.method4003(2048);
		}
		@Pc(341) byte local341 = arg0.aByteArray64[arg0.anInt4977 - 1];
		if (!arg1 && (local234 - local210 > 256 || local234 - local210 < -256 || local251 - local217 > 256 || local251 - local217 < -256)) {
			arg0.anInt6833 = local234;
			arg0.anInt6835 = local251;
			arg0.method3999(false, arg0.anInt4906);
			arg0.anInt4977--;
			Static179.anInt3085 = -1;
			if (arg0.anInt4976 > 0) {
				arg0.anInt4976--;
			}
			Static361.anInt6087 = 0;
			return;
		}
		@Pc(405) int local405 = 4;
		@Pc(407) boolean local407 = true;
		if (arg0 instanceof Class3_Sub4_Sub1_Sub1) {
			local407 = ((Class3_Sub4_Sub1_Sub1) arg0).aClass245_1.aBoolean475;
		}
		@Pc(425) int local425;
		if (local407) {
			local425 = arg0.anInt4906 - arg0.aClass12_7.anInt198;
			if (local425 != 0 && arg0.anInt4936 == -1 && arg0.anInt4948 != 0) {
				local405 = 2;
			}
			if (!arg1 && arg0.anInt4977 > 2) {
				local405 = 6;
			}
			if (!arg1 && arg0.anInt4977 > 3) {
				local405 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4977 > 1) {
				local405 = 6;
			}
			if (!arg1 && arg0.anInt4977 > 2) {
				local405 = 8;
			}
		}
		if (arg0.anInt4978 > 0 && arg0.anInt4977 > 1) {
			arg0.anInt4978--;
			local405 = 8;
		}
		if (local341 == 2) {
			local405 <<= 0x1;
		} else if (local341 == 0) {
			local405 >>= 0x1;
		}
		Static361.anInt6087 = 0;
		if (local9.anInt4479 != -1) {
			local405 <<= 0x7;
			if (arg0.anInt4977 == 1) {
				local425 = arg0.anInt4975 * arg0.anInt4975;
				@Pc(599) int local599 = (arg0.anInt6833 <= local234 ? local234 - arg0.anInt6833 : -local234 + arg0.anInt6833) << 7;
				@Pc(616) int local616 = (local251 < arg0.anInt6835 ? arg0.anInt6835 - local251 : local251 - arg0.anInt6835) << 7;
				@Pc(623) int local623 = local599 <= local616 ? local616 : local599;
				@Pc(630) int local630 = local623 * local9.anInt4479 * 2;
				if (local630 < local425) {
					arg0.anInt4975 /= 2;
				} else if (local425 / 2 > local623) {
					arg0.anInt4975 -= local9.anInt4479;
					if (arg0.anInt4975 < 0) {
						arg0.anInt4975 = 0;
					}
				} else if (arg0.anInt4975 < local405) {
					arg0.anInt4975 += local9.anInt4479;
					if (arg0.anInt4975 > local405) {
						arg0.anInt4975 = local405;
					}
				}
			} else if (arg0.anInt4975 < local405) {
				arg0.anInt4975 += local9.anInt4479;
				if (arg0.anInt4975 > local405) {
					arg0.anInt4975 = local405;
				}
			} else if (arg0.anInt4975 > 0) {
				arg0.anInt4975 -= local9.anInt4479;
				if (arg0.anInt4975 < 0) {
					arg0.anInt4975 = 0;
				}
			}
			local405 = arg0.anInt4975 >> 7;
			if (local405 < 1) {
				local405 = 1;
			}
		}
		if (local234 == local210 && local251 == local217) {
			Static179.anInt3085 = -1;
		} else {
			if (local234 > local210) {
				arg0.anInt6833 += local405;
				Static361.anInt6087 |= 0x4;
				if (arg0.anInt6833 > local234) {
					arg0.anInt6833 = local234;
				}
			} else if (local210 > local234) {
				Static361.anInt6087 |= 0x8;
				arg0.anInt6833 -= local405;
				if (arg0.anInt6833 < local234) {
					arg0.anInt6833 = local234;
				}
			}
			if (local405 >= 8) {
				Static179.anInt3085 = 2;
			} else {
				Static179.anInt3085 = local341;
			}
			if (local251 > local217) {
				Static361.anInt6087 |= 0x1;
				arg0.anInt6835 += local405;
				if (arg0.anInt6835 > local251) {
					arg0.anInt6835 = local251;
				}
			} else if (local251 < local217) {
				Static361.anInt6087 |= 0x2;
				arg0.anInt6835 -= local405;
				if (arg0.anInt6835 < local251) {
					arg0.anInt6835 = local251;
				}
			}
		}
		if (local234 == arg0.anInt6833 && arg0.anInt6835 == local251) {
			if (arg0.anInt4976 > 0) {
				arg0.anInt4976--;
			}
			arg0.anInt4977--;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLclient!or;)[Lclient!tv;")
	public static Class238[] method1836(@OriginalArg(1) Class183 arg0) {
		if (!arg0.method3924()) {
			return new Class238[0];
		}
		@Pc(16) Class91 local16 = arg0.method3902();
		while (local16.anInt2446 == 0) {
			Static429.method5376(10L);
		}
		if (local16.anInt2446 == 2) {
			return new Class238[0];
		}
		@Pc(35) int[] local35 = (int[]) local16.anObject3;
		@Pc(46) Class238[] local46 = new Class238[local35.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(54) Class238 local54 = new Class238();
			local46[local48] = local54;
			local54.anInt6531 = local35[local48 << 2];
			local54.anInt6530 = local35[(local48 << 2) + 1];
			local54.anInt6534 = local35[(local48 << 2) + 2];
			local54.anInt6538 = local35[(local48 << 2) + 3];
		}
		return local46;
	}
}
