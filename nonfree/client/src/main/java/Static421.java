import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_183 = new Class129(27, 4);

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Lclient!rp;")
	public static final Class212 aClass212_2 = new Class212(2);

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_115 = new Class194(77, -1);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!uu;II)V")
	public static void method5521(@OriginalArg(0) Class5_Sub15_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method5610(1) == 1;
		if (local15) {
			Static52.anIntArray44[Static246.anInt3974++] = arg1;
		}
		@Pc(30) int local30 = arg0.method5610(2);
		@Pc(34) Class2_Sub1_Sub3_Sub2 local34 = Static359.aClass2_Sub1_Sub3_Sub2Array1[arg1];
		if (local30 != 0) {
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local30 == 1) {
				local146 = arg0.method5610(3);
				local151 = local34.anIntArray434[0];
				local156 = local34.anIntArray433[0];
				if (local146 == 0) {
					local156--;
					local151--;
				} else if (local146 == 1) {
					local156--;
				} else if (local146 == 2) {
					local151++;
					local156--;
				} else if (local146 == 3) {
					local151--;
				} else if (local146 == 4) {
					local151++;
				} else if (local146 == 5) {
					local156++;
					local151--;
				} else if (local146 == 6) {
					local156++;
				} else if (local146 == 7) {
					local151++;
					local156++;
				}
				if (local15) {
					local34.anInt6206 = local151;
					local34.aBoolean414 = true;
					local34.anInt6220 = local156;
				} else {
					local34.method4926(local156, Static142.aByteArray31[arg1], local151);
				}
			} else if (local30 == 2) {
				local146 = arg0.method5610(4);
				local151 = local34.anIntArray434[0];
				local156 = local34.anIntArray433[0];
				if (local146 == 0) {
					local151 -= 2;
					local156 -= 2;
				} else if (local146 == 1) {
					local156 -= 2;
					local151--;
				} else if (local146 == 2) {
					local156 -= 2;
				} else if (local146 == 3) {
					local156 -= 2;
					local151++;
				} else if (local146 == 4) {
					local151 += 2;
					local156 -= 2;
				} else if (local146 == 5) {
					local156--;
					local151 -= 2;
				} else if (local146 == 6) {
					local156--;
					local151 += 2;
				} else if (local146 == 7) {
					local151 -= 2;
				} else if (local146 == 8) {
					local151 += 2;
				} else if (local146 == 9) {
					local151 -= 2;
					local156++;
				} else if (local146 == 10) {
					local151 += 2;
					local156++;
				} else if (local146 == 11) {
					local151 -= 2;
					local156 += 2;
				} else if (local146 == 12) {
					local156 += 2;
					local151--;
				} else if (local146 == 13) {
					local156 += 2;
				} else if (local146 == 14) {
					local156 += 2;
					local151++;
				} else if (local146 == 15) {
					local156 += 2;
					local151 += 2;
				}
				if (local15) {
					local34.aBoolean414 = true;
					local34.anInt6220 = local156;
					local34.anInt6206 = local151;
				} else {
					local34.method4926(local156, Static142.aByteArray31[arg1], local151);
				}
			} else {
				local146 = arg0.method5610(1);
				@Pc(434) int local434;
				@Pc(444) int local444;
				@Pc(456) int local456;
				@Pc(463) int local463;
				if (local146 == 0) {
					local151 = arg0.method5610(12);
					local156 = local151 >> 10;
					local434 = local151 >> 5 & 0x1F;
					if (local434 > 15) {
						local434 -= 32;
					}
					local444 = local151 & 0x1F;
					if (local444 > 15) {
						local444 -= 32;
					}
					local456 = local34.anIntArray434[0] + local434;
					local463 = local444 + local34.anIntArray433[0];
					if (local15) {
						local34.anInt6206 = local456;
						local34.aBoolean414 = true;
						local34.anInt6220 = local463;
					} else {
						local34.method4926(local463, Static142.aByteArray31[arg1], local456);
					}
					local34.aByte105 = (byte) (local156 + local34.aByte105 & 0x3);
					if (Static43.anInt5302 == arg1) {
						Static6.anInt131 = local34.aByte105;
					}
				} else {
					local151 = arg0.method5610(30);
					local156 = local151 >> 28;
					local434 = local151 >> 14 & 0x3FFF;
					local444 = local151 & 0x3FFF;
					local456 = (local434 + Static31.anInt618 + local34.anIntArray434[0] & 0x3FFF) - Static31.anInt618;
					local463 = (local444 + Static226.anInt3768 + local34.anIntArray433[0] & 0x3FFF) - Static226.anInt3768;
					if (local15) {
						local34.anInt6220 = local463;
						local34.aBoolean414 = true;
						local34.anInt6206 = local456;
					} else {
						local34.method4926(local463, Static142.aByteArray31[arg1], local456);
					}
					local34.aByte105 = (byte) (local156 + local34.aByte105 & 0x3);
					if (Static43.anInt5302 == arg1) {
						Static6.anInt131 = local34.aByte105;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean414 = false;
		} else if (Static43.anInt5302 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(61) Class105 local61 = Static99.aClass105Array1[arg1] = new Class105();
			local61.anInt2839 = (Static226.anInt3768 + local34.anIntArray433[0] >> 6) + ((local34.aByte105 << 28) + (local34.anIntArray434[0] + Static31.anInt618 >> 6 << 14));
			if (local34.anInt6215 == -1) {
				local61.anInt2835 = local34.aClass110_7.method2353();
			} else {
				local61.anInt2835 = local34.anInt6215;
			}
			local61.anInt2833 = local34.anInt6176;
			local61.aBoolean182 = local34.aBoolean412;
			if (local34.anInt6204 > 0) {
				Static425.method5641(local34);
			}
			Static359.aClass2_Sub1_Sub3_Sub2Array1[arg1] = null;
			if (arg0.method5610(1) != 0) {
				Static136.method6009(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method5525(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
