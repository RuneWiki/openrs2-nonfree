import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class41 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	private int anInt1752;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Z")
	public boolean aBoolean87;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIZ)V")
	public void method1178(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray237[arg1];
		if (arg0) {
			local8++;
			if (local8 >= Static40.aShortArrayArray3[arg1].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static40.aShortArrayArray3[arg1].length - 1;
			}
		}
		this.anIntArray237[arg1] = local8;
		this.method1189();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
	public void method1179(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean87) {
			this.method1182(this.anIntArray237, arg0, -1, null);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[IZI[I)V")
	public void method1182(@OriginalArg(1) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static160.anInt3952; local12++) {
					@Pc(18) Class1_Sub1_Sub4 local18 = Static114.method2031(local12);
					if (local18 != null && !local18.aBoolean35 && local8 + (arg1 ? 7 : 0) == local18.anInt724) {
						arg3[Static18.anIntArray78[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray238 = arg3;
		this.anIntArray237 = arg0;
		this.anInt1752 = arg2;
		this.aBoolean87 = arg1;
		this.method1189();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wf;II)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method1183(@OriginalArg(0) Class1_Sub1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1752 != -1) {
			return Static2.method111(this.anInt1752).method988(arg1, arg0);
		}
		@Pc(31) Class1_Sub1_Sub1_Sub2 local31 = (Class1_Sub1_Sub1_Sub2) Static142.aClass79_23.method2657(this.aLong55);
		if (local31 == null) {
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
				@Pc(44) int local44 = this.anIntArray238[local37];
				if (local44 >= 256 && local44 < 512 && !Static114.method2031(local44 - 256).method412()) {
					local35 = true;
				}
				if (local44 >= 512 && !Static2.method118(local44 - 512).method708(this.aBoolean87)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(91) int local91 = 0;
			@Pc(94) Class1_Sub1_Sub1_Sub6[] local94 = new Class1_Sub1_Sub1_Sub6[12];
			for (@Pc(96) int local96 = 0; local96 < 12; local96++) {
				@Pc(103) int local103 = this.anIntArray238[local96];
				@Pc(119) Class1_Sub1_Sub1_Sub6 local119;
				if (local103 >= 256 && local103 < 512) {
					local119 = Static114.method2031(local103 - 256).method414();
					if (local119 != null) {
						local94[local91++] = local119;
					}
				}
				if (local103 >= 512) {
					local119 = Static2.method118(local103 - 512).method706(this.aBoolean87);
					if (local119 != null) {
						local94[local91++] = local119;
					}
				}
			}
			@Pc(158) Class1_Sub1_Sub1_Sub6 local158 = new Class1_Sub1_Sub1_Sub6(local94, local91);
			for (@Pc(160) int local160 = 0; local160 < 5; local160++) {
				if (Static40.aShortArrayArray3[local160].length > this.anIntArray237[local160]) {
					local158.method2593(Static118.aShortArray32[local160], Static40.aShortArrayArray3[local160][this.anIntArray237[local160]]);
				}
				if (Static120.aShortArrayArray5[local160].length > this.anIntArray237[local160]) {
					local158.method2593(Static27.aShortArray14[local160], Static120.aShortArrayArray5[local160][this.anIntArray237[local160]]);
				}
			}
			local31 = local158.method2609(64, 768, -50, -10, -50, true);
			Static142.aClass79_23.method2658(this.aLong55, local31);
		}
		if (arg0 != null) {
			local31 = arg0.method3100(local31, arg1);
		}
		return local31;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)I")
	public int method1184() {
		return this.anInt1752 == -1 ? this.anIntArray238[1] + (this.anIntArray238[8] << 10) + (this.anIntArray237[4] << 20) + (this.anIntArray237[0] << 25) + (this.anIntArray238[0] << 15) + (this.anIntArray238[11] << 5) : 305419896 - -Static2.method111(this.anInt1752).anInt1518;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!jg;B)V")
	public void method1185(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method862(this.aBoolean87 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray238[Static18.anIntArray78[local16]];
			if (local25 == 0) {
				arg0.method862(-1);
			} else {
				arg0.method862(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method862(this.anIntArray237[local25]);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!wf;IILclient!wf;)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method1188(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub18 arg3) {
		if (this.anInt1752 != -1) {
			return Static2.method111(this.anInt1752).method984(arg2, arg0, arg3, arg1);
		}
		@Pc(23) long local23 = this.aLong55;
		@Pc(26) int[] local26 = this.anIntArray238;
		if (arg3 != null && (arg3.anInt4300 >= 0 || arg3.anInt4307 >= 0)) {
			local26 = new int[12];
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local26[local42] = this.anIntArray238[local42];
			}
			if (arg3.anInt4300 >= 0) {
				local23 += arg3.anInt4300 - this.anIntArray238[5] << 8;
				local26[5] = arg3.anInt4300;
			}
			if (arg3.anInt4307 >= 0) {
				local23 += arg3.anInt4307 - this.anIntArray238[3] << 16;
				local26[3] = arg3.anInt4307;
			}
		}
		@Pc(106) Class1_Sub1_Sub1_Sub2 local106 = (Class1_Sub1_Sub1_Sub2) Static171.aClass79_27.method2657(local23);
		if (local106 == null) {
			@Pc(110) boolean local110 = false;
			for (@Pc(112) int local112 = 0; local112 < 12; local112++) {
				@Pc(118) int local118 = local26[local112];
				if (local118 >= 256 && local118 < 512 && !Static114.method2031(local118 - 256).method416()) {
					local110 = true;
				}
				if (local118 >= 512 && !Static2.method118(local118 - 512).method698(this.aBoolean87)) {
					local110 = true;
				}
			}
			if (local110) {
				if (this.aLong56 != -1L) {
					local106 = (Class1_Sub1_Sub1_Sub2) Static171.aClass79_27.method2657(this.aLong56);
				}
				if (local106 == null) {
					return null;
				}
			}
			if (local106 == null) {
				@Pc(184) Class1_Sub1_Sub1_Sub6[] local184 = new Class1_Sub1_Sub1_Sub6[12];
				@Pc(186) int local186 = 0;
				for (@Pc(188) int local188 = 0; local188 < 12; local188++) {
					@Pc(194) int local194 = local26[local188];
					@Pc(208) Class1_Sub1_Sub1_Sub6 local208;
					if (local194 >= 256 && local194 < 512) {
						local208 = Static114.method2031(local194 - 256).method418();
						if (local208 != null) {
							local184[local186++] = local208;
						}
					}
					if (local194 >= 512) {
						local208 = Static2.method118(local194 - 512).method701(this.aBoolean87);
						if (local208 != null) {
							local184[local186++] = local208;
						}
					}
				}
				@Pc(251) Class1_Sub1_Sub1_Sub6 local251 = new Class1_Sub1_Sub1_Sub6(local184, local186);
				for (@Pc(253) int local253 = 0; local253 < 5; local253++) {
					if (this.anIntArray237[local253] < Static40.aShortArrayArray3[local253].length) {
						local251.method2593(Static118.aShortArray32[local253], Static40.aShortArrayArray3[local253][this.anIntArray237[local253]]);
					}
					if (this.anIntArray237[local253] < Static120.aShortArrayArray5[local253].length) {
						local251.method2593(Static27.aShortArray14[local253], Static120.aShortArrayArray5[local253][this.anIntArray237[local253]]);
					}
				}
				local106 = local251.method2609(64, 850, -30, -50, -30, true);
				Static171.aClass79_27.method2658(local23, local106);
				this.aLong56 = local23;
			}
		}
		if (arg3 == null && arg1 == null) {
			return local106;
		}
		@Pc(349) Class1_Sub1_Sub1_Sub2 local349;
		if (arg3 != null && arg1 != null) {
			local349 = arg3.method3101(arg1, arg2, arg0, local106);
		} else if (arg3 == null) {
			local349 = arg1.method3102(local106, arg2);
		} else {
			local349 = arg3.method3102(local106, arg0);
		}
		return local349;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	private void method1189() {
		@Pc(10) int local10 = this.anIntArray238[5];
		@Pc(15) int local15 = this.anIntArray238[9];
		@Pc(18) long local18 = this.aLong55;
		this.anIntArray238[5] = local15;
		this.anIntArray238[9] = local10;
		this.aLong55 = 0L;
		for (@Pc(41) int local41 = 0; local41 < 12; local41++) {
			this.aLong55 <<= 0x4;
			if (this.anIntArray238[local41] >= 256) {
				this.aLong55 += this.anIntArray238[local41] - 256;
			}
		}
		if (this.anIntArray238[0] >= 256) {
			this.aLong55 += this.anIntArray238[0] - 256 >> 4;
		}
		if (this.anIntArray238[1] >= 256) {
			this.aLong55 += this.anIntArray238[1] - 256 >> 8;
		}
		for (@Pc(115) int local115 = 0; local115 < 5; local115++) {
			this.aLong55 <<= 0x3;
			this.aLong55 += this.anIntArray237[local115];
		}
		this.aLong55 <<= 0x1;
		this.anIntArray238[5] = local10;
		this.anIntArray238[9] = local15;
		this.aLong55 += this.aBoolean87 ? 1 : 0;
		if (local18 != 0L && this.aLong55 != local18) {
			Static171.aClass79_27.method2653(local18);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)V")
	public void method1190(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean87) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray238[Static18.anIntArray78[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(48) Class1_Sub1_Sub4 local48;
		do {
			if (arg1) {
				local19++;
				if (Static160.anInt3952 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static160.anInt3952 - 1;
				}
			}
			local48 = Static114.method2031(local19);
		} while (local48 == null || local48.aBoolean35 || local48.anInt724 != (this.aBoolean87 ? 7 : 0) + arg0);
		this.anIntArray238[Static18.anIntArray78[arg0]] = local19 + 256;
		this.method1189();
	}
}
