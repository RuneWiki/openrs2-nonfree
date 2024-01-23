import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "Lclient!kh;")
	private Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "Lclient!kh;")
	private Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "Lclient!kh;")
	private Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "[Lclient!kh;")
	private Class1_Sub1[] aClass1_Sub1Array7;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!im;)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(7) int local7 = arg0.method2655();
		@Pc(10) int[][] local10 = new int[local7][];
		this.aClass1_Sub1Array7 = new Class1_Sub1[local7];
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20;
		@Pc(31) Class1_Sub1 local31;
		@Pc(51) int local51;
		@Pc(58) int local58;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = Static55.method1115(arg0);
			if (local31.method4751() >= 0) {
				local16++;
			}
			if (local31.method4761() >= 0) {
				local18++;
			}
			local51 = local31.aClass1_Sub1Array42.length;
			local10[local20] = new int[local51];
			for (local58 = 0; local58 < local51; local58++) {
				local10[local20][local58] = arg0.method2655();
			}
			this.aClass1_Sub1Array7[local20] = local31;
		}
		this.anIntArray158 = new int[local18];
		this.anIntArray157 = new int[local16];
		local18 = 0;
		local16 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = this.aClass1_Sub1Array7[local20];
			local51 = local31.aClass1_Sub1Array42.length;
			for (local58 = 0; local58 < local51; local58++) {
				local31.aClass1_Sub1Array42[local58] = this.aClass1_Sub1Array7[local10[local20][local58]];
			}
			local58 = local31.method4751();
			@Pc(142) int local142 = local31.method4761();
			if (local58 > 0) {
				this.anIntArray157[local16++] = local58;
			}
			if (local142 > 0) {
				this.anIntArray158[local18++] = local142;
			}
			local10[local20] = null;
		}
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array7[arg0.method2655()];
		local10 = null;
		this.aClass1_Sub1_3 = this.aClass1_Sub1Array7[arg0.method2655()];
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array7[arg0.method2655()];
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZLclient!mn;DILclient!kb;)Lclient!kg;")
	public Class1_Sub2_Sub14_Sub1_Sub1 method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) double arg3, @OriginalArg(6) Class83 arg4) {
		Static24.method402(arg3);
		Static75.anInterface3_1 = arg2;
		Static92.aClass83_60 = arg4;
		Static254.method4235(arg1, arg0);
		@Pc(22) Class1_Sub2_Sub14_Sub1_Sub1 local22 = new Class1_Sub2_Sub14_Sub1_Sub1(arg0, arg1);
		@Pc(39) int local39;
		for (local39 = 0; local39 < this.aClass1_Sub1Array7.length; local39++) {
			this.aClass1_Sub1Array7[local39].method4748(arg0, arg1);
		}
		local39 = 0;
		@Pc(63) int local63;
		for (local63 = 0; local63 < arg1; local63++) {
			@Pc(86) int[] local86;
			@Pc(94) int[] local94;
			@Pc(90) int[] local90;
			@Pc(102) int[] local102;
			if (this.aClass1_Sub1_1.aBoolean324) {
				local102 = this.aClass1_Sub1_1.method4757(local63);
				local94 = local102;
				local86 = local102;
				local90 = local102;
			} else {
				@Pc(82) int[][] local82 = this.aClass1_Sub1_1.method4749(local63);
				local86 = local82[0];
				local90 = local82[2];
				local94 = local82[1];
			}
			if (this.aClass1_Sub1_3.aBoolean324) {
				local102 = this.aClass1_Sub1_3.method4757(local63);
			} else {
				local102 = this.aClass1_Sub1_3.method4749(local63)[0];
			}
			for (@Pc(132) int local132 = arg0 - 1; local132 >= 0; local132--) {
				@Pc(140) int local140 = local86[local132] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(159) int local159 = local94[local132] >> 4;
				local140 = Static218.anIntArray495[local140];
				if (local159 > 255) {
					local159 = 255;
				}
				if (local159 < 0) {
					local159 = 0;
				}
				local159 = Static218.anIntArray495[local159];
				@Pc(188) int local188 = local90[local132] >> 4;
				if (local188 > 255) {
					local188 = 255;
				}
				if (local188 < 0) {
					local188 = 0;
				}
				local188 = Static218.anIntArray495[local188];
				@Pc(219) int local219;
				if (local140 == 0 && local159 == 0 && local188 == 0) {
					local219 = 0;
				} else {
					local219 = local102[local132] >> 4;
					if (local219 > 255) {
						local219 = 255;
					}
					if (local219 < 0) {
						local219 = 0;
					}
				}
				local22.anIntArray294[local39++] = (local219 << 24) + (local140 << 16) + (local159 << 8) + local188;
			}
		}
		for (local63 = 0; local63 < this.aClass1_Sub1Array7.length; local63++) {
			this.aClass1_Sub1Array7[local63].method4762();
		}
		return local22;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLclient!mn;ILclient!kb;DI)Lclient!n;")
	public Class1_Sub2_Sub14_Sub1 method1154(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class83 arg3, @OriginalArg(5) double arg4) {
		Static24.method402(arg4);
		Static92.aClass83_60 = arg3;
		Static75.anInterface3_1 = arg1;
		Static254.method4235(arg0, arg2);
		@Pc(24) Class1_Sub2_Sub14_Sub1 local24 = new Class1_Sub2_Sub14_Sub1(arg2, arg0);
		@Pc(26) int local26;
		for (local26 = 0; local26 < this.aClass1_Sub1Array7.length; local26++) {
			this.aClass1_Sub1Array7[local26].method4748(arg2, arg0);
		}
		local26 = 0;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg0; local46++) {
			@Pc(73) int[] local73;
			@Pc(69) int[] local69;
			@Pc(71) int[] local71;
			if (this.aClass1_Sub1_1.aBoolean324) {
				@Pc(67) int[] local67 = this.aClass1_Sub1_1.method4757(local46);
				local69 = local67;
				local71 = local67;
				local73 = local67;
			} else {
				@Pc(81) int[][] local81 = this.aClass1_Sub1_1.method4749(local46);
				local73 = local81[0];
				local71 = local81[2];
				local69 = local81[1];
			}
			for (@Pc(95) int local95 = 0; local95 != arg2; local95++) {
				@Pc(104) int local104 = local73[local95] >> 4;
				if (local104 > 255) {
					local104 = 255;
				}
				@Pc(118) int local118 = local71[local95] >> 4;
				if (local104 < 0) {
					local104 = 0;
				}
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(144) int local144 = local69[local95] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				local104 = Static218.anIntArray495[local104];
				local118 = Static218.anIntArray495[local118];
				if (local144 < 0) {
					local144 = 0;
				}
				local144 = Static218.anIntArray495[local144];
				local24.anIntArray294[local26++] = local118 + (local104 << 16) + (local144 << 8);
			}
		}
		for (local46 = 0; local46 < this.aClass1_Sub1Array7.length; local46++) {
			this.aClass1_Sub1Array7[local46].method4762();
		}
		return local24;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!mn;BZZDIILclient!kb;)[I")
	public int[] method1155(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class83 arg6) {
		Static24.method402(arg3);
		Static75.anInterface3_1 = arg0;
		@Pc(15) int[] local15 = new int[arg5 * arg4];
		Static92.aClass83_60 = arg6;
		Static254.method4235(arg5, arg4);
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.aClass1_Sub1Array7.length; local23++) {
			this.aClass1_Sub1Array7[local23].method4748(arg4, arg5);
		}
		@Pc(47) int local47 = 0;
		@Pc(53) int local53;
		@Pc(51) byte local51;
		if (arg1) {
			local51 = -1;
			local53 = -1;
			local23 = arg4 - 1;
		} else {
			local53 = arg4;
			local23 = 0;
			local51 = 1;
		}
		@Pc(67) int local67;
		for (local67 = 0; local67 < arg5; local67++) {
			if (arg2) {
				local47 = local67;
			}
			@Pc(101) int[] local101;
			@Pc(97) int[] local97;
			@Pc(93) int[] local93;
			if (this.aClass1_Sub1_1.aBoolean324) {
				@Pc(109) int[] local109 = this.aClass1_Sub1_1.method4757(local67);
				local93 = local109;
				local97 = local109;
				local101 = local109;
			} else {
				@Pc(89) int[][] local89 = this.aClass1_Sub1_1.method4749(local67);
				local93 = local89[2];
				local97 = local89[1];
				local101 = local89[0];
			}
			for (@Pc(117) int local117 = local23; local117 != local53; local117 += local51) {
				@Pc(126) int local126 = local101[local117] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				@Pc(140) int local140 = local97[local117] >> 4;
				@Pc(146) int local146 = local93[local117] >> 4;
				if (local146 > 255) {
					local146 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				local126 = Static218.anIntArray495[local126];
				if (local146 < 0) {
					local146 = 0;
				}
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				local140 = Static218.anIntArray495[local140];
				local146 = Static218.anIntArray495[local146];
				local15[local47++] = (local126 << 16) + (local140 << 8) + local146;
				if (arg2) {
					local47 += arg4 - 1;
				}
			}
		}
		for (local67 = 0; local67 < this.aClass1_Sub1Array7.length; local67++) {
			this.aClass1_Sub1Array7[local67].method4762();
		}
		return local15;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IDIIZLclient!kb;Lclient!mn;)[I")
	public int[] method1158(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class83 arg4, @OriginalArg(6) Interface3 arg5) {
		Static24.method402(arg1);
		Static75.anInterface3_1 = arg5;
		Static92.aClass83_60 = arg4;
		@Pc(19) int[] local19 = new int[arg0 * arg2 * 4];
		Static254.method4235(arg0, arg2);
		@Pc(33) int local33;
		for (local33 = 0; local33 < this.aClass1_Sub1Array7.length; local33++) {
			this.aClass1_Sub1Array7[local33].method4748(arg2, arg0);
		}
		local33 = 0;
		@Pc(53) int local53;
		for (local53 = 0; local53 < arg0; local53++) {
			if (arg3) {
				local33 = local53;
			}
			@Pc(79) int[] local79;
			@Pc(77) int[] local77;
			@Pc(81) int[] local81;
			@Pc(75) int[] local75;
			if (this.aClass1_Sub1_1.aBoolean324) {
				local75 = this.aClass1_Sub1_1.method4757(local53);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass1_Sub1_1.method4749(local53);
				local77 = local89[1];
				local81 = local89[2];
				local79 = local89[0];
			}
			if (this.aClass1_Sub1_3.aBoolean324) {
				local75 = this.aClass1_Sub1_3.method4757(local53);
			} else {
				local75 = this.aClass1_Sub1_3.method4749(local53)[0];
			}
			for (@Pc(125) int local125 = arg2 - 1; local125 >= 0; local125--) {
				@Pc(136) int local136 = local81[local125] >> 4;
				@Pc(142) int local142 = local79[local125] >> 4;
				@Pc(148) int local148 = local77[local125] >> 4;
				if (local148 > 255) {
					local148 = 255;
				}
				if (local148 < 0) {
					local148 = 0;
				}
				local148 = Static218.anIntArray495[local148];
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				local136 = Static218.anIntArray495[local136];
				local142 = Static218.anIntArray495[local142];
				@Pc(211) int local211;
				if (local142 == 0 && local148 == 0 && local136 == 0) {
					local211 = 0;
				} else {
					local211 = local75[local125] >> 4;
					if (local211 > 255) {
						local211 = 255;
					}
					if (local211 < 0) {
						local211 = 0;
					}
				}
				local19[local33++] = (local211 << 24) + (local142 << 16) + (local148 << 8) + local136;
				if (arg3) {
					local33 += arg2 - 1;
				}
			}
		}
		for (local53 = 0; local53 < this.aClass1_Sub1Array7.length; local53++) {
			this.aClass1_Sub1Array7[local53].method4762();
		}
		return local19;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!mn;ZIILclient!kb;B)[F")
	public float[] method1160(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class83 arg4) {
		Static92.aClass83_60 = arg4;
		Static75.anInterface3_1 = arg0;
		@Pc(16) float[] local16 = new float[arg3 * arg2 * 4];
		Static254.method4235(arg2, arg3);
		@Pc(28) int local28;
		for (local28 = 0; local28 < this.aClass1_Sub1Array7.length; local28++) {
			this.aClass1_Sub1Array7[local28].method4748(arg3, arg2);
		}
		local28 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg2; local50++) {
			if (arg1) {
				local28 = local50 << 2;
			}
			@Pc(78) int[] local78;
			@Pc(86) int[] local86;
			@Pc(82) int[] local82;
			if (this.aClass1_Sub1_1.aBoolean324) {
				@Pc(94) int[] local94 = this.aClass1_Sub1_1.method4757(local50);
				local78 = local94;
				local82 = local94;
				local86 = local94;
			} else {
				@Pc(74) int[][] local74 = this.aClass1_Sub1_1.method4749(local50);
				local78 = local74[0];
				local82 = local74[2];
				local86 = local74[1];
			}
			@Pc(110) int[] local110;
			if (this.aClass1_Sub1_3.aBoolean324) {
				local110 = this.aClass1_Sub1_3.method4757(local50);
			} else {
				local110 = this.aClass1_Sub1_3.method4749(local50)[0];
			}
			@Pc(132) int[] local132;
			if (this.aClass1_Sub1_2.aBoolean324) {
				local132 = this.aClass1_Sub1_2.method4757(local50);
			} else {
				local132 = this.aClass1_Sub1_2.method4749(local50)[0];
			}
			for (@Pc(144) int local144 = arg3 - 1; local144 >= 0; local144--) {
				@Pc(156) float local156 = (float) local110[local144] / 4096.0F;
				if (local156 < 0.0F) {
					local156 = 0.0F;
				} else if (local156 > 1.0F) {
					local156 = 1.0F;
				}
				@Pc(183) float local183 = ((float) local132[local144] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local16[local28++] = (float) local78[local144] * local183;
				local16[local28++] = local183 * (float) local86[local144];
				local16[local28++] = (float) local82[local144] * local183;
				local16[local28++] = local156;
				if (arg1) {
					local28 += (arg3 << 2) - 4;
				}
			}
		}
		for (local50 = 0; local50 < this.aClass1_Sub1Array7.length; local50++) {
			this.aClass1_Sub1Array7[local50].method4762();
		}
		return local16;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!kb;Lclient!mn;B)Z")
	public boolean method1162(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Interface3 arg1) {
		@Pc(18) int local18;
		if (Static12.anInt293 <= 0) {
			for (local18 = 0; local18 < this.anIntArray157.length; local18++) {
				if (!arg0.method2302(this.anIntArray157[local18])) {
					return false;
				}
			}
		} else {
			for (local18 = 0; local18 < this.anIntArray157.length; local18++) {
				if (!arg0.method2299(this.anIntArray157[local18], Static12.anInt293)) {
					return false;
				}
			}
		}
		for (local18 = 0; local18 < this.anIntArray158.length; local18++) {
			if (!arg1.method4405(this.anIntArray158[local18])) {
				return false;
			}
		}
		return true;
	}
}
