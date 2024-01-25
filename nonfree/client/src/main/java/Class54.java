import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class54 {

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
	private int anInt1252;

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "Ljava/lang/Object;")
	private Object anObject2;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
	private int anInt1261;

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "Lclient!lba;")
	private Class218 aClass218_4;

	@OriginalMember(owner = "client!cba", name = "t", descriptor = "Ljava/lang/String;")
	private String aString7 = "null";

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1097(@OriginalArg(1) int arg0) {
		if (this.anObject2 == null) {
			return this.aString7;
		} else if (this.anObject2 instanceof Class218) {
			@Pc(61) Class2_Sub47 local61 = (Class2_Sub47) ((Class218) this.anObject2).method5095((long) arg0, 0);
			return local61 == null ? this.aString7 : local61.aString88;
		} else {
			@Pc(25) String[] local25 = (String[]) this.anObject2;
			if (arg0 >= 0 && arg0 < local25.length) {
				@Pc(44) String local44 = local25[arg0];
				return local44 == null ? this.aString7 : local44;
			} else {
				return this.aString7;
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)V")
	private void method1098() {
		@Pc(53) Class2_Sub22 local53;
		if (this.anObject2 instanceof Class218) {
			@Pc(216) Class218 local216 = (Class218) this.anObject2;
			this.aClass218_4 = new Class218(local216.method5089());
			@Pc(231) Class218 local231 = new Class218(local216.method5089());
			for (@Pc(236) Class2_Sub47 local236 = (Class2_Sub47) local216.method5092(); local236 != null; local236 = (Class2_Sub47) local216.method5096()) {
				@Pc(245) long local245 = Static351.method4861(local236.aString88, 2063193349);
				@Pc(251) Class2_Sub22 local251;
				for (local251 = (Class2_Sub22) local231.method5095(local245, 0); local251 != null && !local251.aString26.equals(local236.aString88); local251 = (Class2_Sub22) local231.method5100((byte) 78)) {
				}
				if (local251 == null) {
					local251 = new Class2_Sub22(local236.aString88, 0);
					local231.method5099(local251, local245);
				}
				local251.anInt2720++;
			}
			for (@Pc(308) Class2_Sub47 local308 = (Class2_Sub47) local216.method5092(); local308 != null; local308 = (Class2_Sub47) local216.method5096()) {
				@Pc(315) long local315 = Static351.method4861(local308.aString88, 2063193349);
				@Pc(322) Class2_Sub14 local322;
				for (local322 = (Class2_Sub14) this.aClass218_4.method5095(local315, 0); local322 != null && !local322.aString9.equals(local308.aString88); local322 = (Class2_Sub14) this.aClass218_4.method5100((byte) 61)) {
				}
				for (local53 = (Class2_Sub22) local231.method5095(local315, 0); local53 != null && !local53.aString26.equals(local308.aString88); local53 = (Class2_Sub22) local231.method5100((byte) 98)) {
				}
				@Pc(375) int local375 = local53.anInt2720--;
				if (local322 == null) {
					local322 = new Class2_Sub14(local308.aString88, local375);
					this.aClass218_4.method5099(local322, local315);
				}
				local322.anIntArray114[local322.anIntArray114.length - local375] = (int) local308.aLong352;
			}
			return;
		}
		@Pc(13) String[] local13 = (String[]) this.anObject2;
		@Pc(18) int local18 = Static330.method4577(local13.length);
		this.aClass218_4 = new Class218(local18);
		@Pc(29) Class218 local29 = new Class218(local18);
		for (@Pc(31) int local31 = 0; local31 < local13.length; local31++) {
			if (local13[local31] != null) {
				@Pc(43) String local43 = local13[local31];
				@Pc(47) long local47 = Static351.method4861(local43, 2063193349);
				for (local53 = (Class2_Sub22) local29.method5095(local47, 0); local53 != null && !local53.aString26.equals(local43); local53 = (Class2_Sub22) local29.method5100((byte) 72)) {
				}
				if (local53 == null) {
					local53 = new Class2_Sub22(local43, 0);
					local29.method5099(local53, local47);
				}
				local53.anInt2720++;
			}
		}
		for (@Pc(99) int local99 = 0; local99 < local13.length; local99++) {
			if (local13[local99] != null) {
				@Pc(113) String local113 = local13[local99];
				@Pc(117) long local117 = Static351.method4861(local113, 2063193349);
				@Pc(124) Class2_Sub14 local124;
				for (local124 = (Class2_Sub14) this.aClass218_4.method5095(local117, 0); local124 != null && !local124.aString9.equals(local113); local124 = (Class2_Sub14) this.aClass218_4.method5100((byte) 118)) {
				}
				@Pc(147) Class2_Sub22 local147;
				for (local147 = (Class2_Sub22) local29.method5095(local117, 0); local147 != null && !local147.aString26.equals(local113); local147 = (Class2_Sub22) local29.method5100((byte) 92)) {
				}
				@Pc(175) int local175 = local147.anInt2720--;
				if (local124 == null) {
					local124 = new Class2_Sub14(local113, local175);
					this.aClass218_4.method5099(local124, local117);
				}
				local124.anIntArray114[local124.anIntArray114.length - local175] = local99;
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!cia;")
	public Class2_Sub14 method1099(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.anObject2 == null) {
			return null;
		}
		if (this.aClass218_4 == null) {
			this.method1098();
		}
		@Pc(30) Class2_Sub14 local30;
		for (local30 = (Class2_Sub14) this.aClass218_4.method5095(Static351.method4861(arg0, arg1 ^ 0x7AF986E2), 0); local30 != null && !local30.aString9.equals(arg0); local30 = (Class2_Sub14) this.aClass218_4.method5100((byte) 73)) {
		}
		if (arg1 != 21479) {
			this.method1099((String) null, -37);
		}
		return local30;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(II)I")
	public int method1100(@OriginalArg(1) int arg0) {
		if (this.anObject2 == null) {
			return this.anInt1252;
		} else if (this.anObject2 instanceof Class218) {
			@Pc(32) Class2_Sub2 local32 = (Class2_Sub2) ((Class218) this.anObject2).method5095((long) arg0, 0);
			return local32 == null ? this.anInt1252 : local32.anInt41;
		} else {
			@Pc(45) Integer[] local45 = (Integer[]) this.anObject2;
			if (arg0 >= 0 && local45.length > arg0) {
				@Pc(65) Integer local65 = local45[arg0];
				return local65 == null ? this.anInt1252 : local65;
			} else {
				return this.anInt1252;
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method1102(@OriginalArg(1) String arg0) {
		if (this.anObject2 == null) {
			return false;
		}
		if (this.aClass218_4 == null) {
			this.method1098();
		}
		for (@Pc(38) Class2_Sub22 local38 = (Class2_Sub22) this.aClass218_4.method5095(Static351.method4861(arg0, 2063193349), 0); local38 != null; local38 = (Class2_Sub22) this.aClass218_4.method5100((byte) 101)) {
			if (local38.aString26.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILclient!et;)V")
	private void method1103(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static639.method8672(arg1.method8536());
		} else if (arg0 == 2) {
			this.aChar2 = Static639.method8672(arg1.method8536());
		} else if (arg0 == 3) {
			this.aString7 = arg1.method8553();
		} else if (arg0 == 4) {
			this.anInt1252 = arg1.method8555(-9372);
		} else {
			@Pc(82) int local82;
			if (arg0 == 5 || arg0 == 6) {
				this.anInt1261 = arg1.method8575();
				@Pc(72) Class218 local72 = new Class218(Static330.method4577(this.anInt1261));
				for (@Pc(74) int local74 = 0; local74 < this.anInt1261; local74++) {
					local82 = arg1.method8555(-9372);
					@Pc(92) Class2 local92;
					if (arg0 == 5) {
						local92 = new Class2_Sub47(arg1.method8553());
					} else {
						local92 = new Class2_Sub2(arg1.method8555(-9372));
					}
					local72.method5099(local92, (long) local82);
				}
				this.anObject2 = local72;
			} else {
				@Pc(137) int local137;
				@Pc(153) int local153;
				if (arg0 == 7) {
					local137 = arg1.method8575();
					this.anInt1261 = arg1.method8575();
					@Pc(190) String[] local190 = new String[local137];
					for (local82 = 0; local82 < this.anInt1261; local82++) {
						local153 = arg1.method8575();
						local190[local153] = arg1.method8553();
					}
					this.anObject2 = local190;
				} else if (arg0 == 8) {
					local137 = arg1.method8575();
					this.anInt1261 = arg1.method8575();
					@Pc(145) Integer[] local145 = new Integer[local137];
					for (local82 = 0; local82 < this.anInt1261; local82++) {
						local153 = arg1.method8575();
						local145[local153] = Integer.valueOf(arg1.method8555(-9372));
					}
					this.anObject2 = local145;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(II)Lclient!wfa;")
	public Class2_Sub55 method1104(@OriginalArg(0) int arg0) {
		if (this.anObject2 == null) {
			return null;
		} else {
			if (this.aClass218_4 == null) {
				this.method1106();
			}
			return (Class2_Sub55) this.aClass218_4.method5095((long) arg0, 0);
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I")
	public int method1105() {
		return this.anInt1261;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	private void method1106() {
		@Pc(92) int local92;
		if (this.anObject2 instanceof Class218) {
			@Pc(156) Class218 local156 = (Class218) this.anObject2;
			this.aClass218_4 = new Class218(local156.method5089());
			@Pc(171) Class218 local171 = new Class218(local156.method5089());
			@Pc(186) Class2_Sub2 local186;
			for (@Pc(176) Class2_Sub2 local176 = (Class2_Sub2) local156.method5092(); local176 != null; local176 = (Class2_Sub2) local156.method5096()) {
				local186 = (Class2_Sub2) local171.method5095((long) local176.anInt41, 0);
				if (local186 == null) {
					local186 = new Class2_Sub2(0);
					local171.method5099(local186, (long) local176.anInt41);
				}
				local186.anInt41++;
			}
			for (local186 = (Class2_Sub2) local156.method5092(); local186 != null; local186 = (Class2_Sub2) local156.method5096()) {
				@Pc(231) Class2_Sub55 local231 = (Class2_Sub55) this.aClass218_4.method5095((long) local186.anInt41, 0);
				local92 = ((Class2_Sub2) local171.method5095((long) local186.anInt41, 0)).anInt41--;
				if (local231 == null) {
					local231 = new Class2_Sub55(local92);
					this.aClass218_4.method5099(local231, (long) local186.anInt41);
				}
				local231.anIntArray749[local231.anIntArray749.length - local92] = (int) local186.aLong352;
			}
			return;
		}
		@Pc(9) Integer[] local9 = (Integer[]) this.anObject2;
		@Pc(14) int local14 = Static330.method4577(local9.length);
		this.aClass218_4 = new Class218(local14);
		@Pc(25) Class218 local25 = new Class218(local14);
		@Pc(40) int local40;
		for (@Pc(27) int local27 = 0; local27 < local9.length; local27++) {
			if (local9[local27] != null) {
				local40 = local9[local27];
				@Pc(47) Class2_Sub2 local47 = (Class2_Sub2) local25.method5095((long) local40, 0);
				if (local47 == null) {
					local47 = new Class2_Sub2(0);
					local25.method5099(local47, (long) local40);
				}
				local47.anInt41++;
			}
		}
		for (local40 = 0; local40 < local9.length; local40++) {
			if (local9[local40] != null) {
				local92 = local9[local40];
				@Pc(100) Class2_Sub55 local100 = (Class2_Sub55) this.aClass218_4.method5095((long) local92, 0);
				@Pc(113) int local113 = ((Class2_Sub2) local25.method5095((long) local92, 0)).anInt41--;
				if (local100 == null) {
					local100 = new Class2_Sub55(local113);
					this.aClass218_4.method5099(local100, (long) local92);
				}
				local100.anIntArray749[local100.anIntArray749.length - local113] = local40;
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(II)Z")
	public boolean method1107(@OriginalArg(0) int arg0) {
		if (this.anObject2 == null) {
			return false;
		} else {
			if (this.aClass218_4 == null) {
				this.method1106();
			}
			return this.aClass218_4.method5095((long) arg0, 0) != null;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!et;Z)V")
	public void method1108(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8581(-17416);
			if (local9 == 0) {
				return;
			}
			this.method1103(local9, arg0);
		}
	}
}
