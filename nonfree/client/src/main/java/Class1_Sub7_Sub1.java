import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!gl", name = "Ab", descriptor = "I")
	public int anInt3130;

	@OriginalMember(owner = "client!gl", name = "jb", descriptor = "Z")
	public boolean aBoolean237 = false;

	@OriginalMember(owner = "client!gl", name = "ob", descriptor = "Z")
	public boolean aBoolean238 = false;

	@OriginalMember(owner = "client!gl", name = "xb", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!gl", name = "ub", descriptor = "Z")
	public boolean aBoolean240 = false;

	@OriginalMember(owner = "client!gl", name = "rb", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!gba;)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) Class114 arg0) {
		super.anInt3091 = 3;
		super.anInt3101 = 3;
		this.method2630(true);
		super.aBoolean219 = true;
		super.aBoolean229 = true;
		super.anInt3117 = 0;
		super.aBoolean228 = true;
		super.aBoolean234 = true;
		super.aBoolean233 = true;
		super.anInt3088 = 0;
		super.anInt3096 = 127;
		super.aBoolean225 = true;
		super.anInt3103 = 127;
		super.aBoolean220 = true;
		super.anInt3102 = 127;
		super.anInt3089 = 0;
		super.aBoolean230 = true;
		super.anInt3110 = 1;
		super.anInt3107 = 127;
		super.aBoolean221 = false;
		super.anInt3093 = 0;
		super.anInt3106 = 2;
		super.anInt3105 = 0;
		super.anInt3111 = 127;
		super.aBoolean224 = true;
		super.aBoolean227 = true;
		if (Static72.anInt1778 < 96) {
			Static101.method1859(0);
		} else {
			Static101.method1859(2);
		}
		super.aBoolean231 = false;
		super.anInt3115 = 2;
		super.aBoolean222 = false;
		super.anInt3097 = 2;
		super.anInt3113 = Static265.anInt4986 == 1 ? 2 : 4;
		super.anInt3100 = 0;
		super.anInt3090 = 0;
		super.aBoolean236 = true;
		super.aBoolean226 = true;
		super.aBoolean232 = false;
		super.anInt3104 = 0;
		@Pc(150) Class283 local150 = null;
		try {
			@Pc(156) Class23 local156 = arg0.method2514("", true);
			while (local156.anInt875 == 0) {
				Static423.method5918(1L);
			}
			if (local156.anInt875 == 1) {
				local150 = (Class283) local156.anObject1;
				@Pc(183) byte[] local183 = new byte[(int) local150.method6491()];
				@Pc(198) int local198;
				for (@Pc(185) int local185 = 0; local185 < local183.length; local185 += local198) {
					local198 = local150.method6490(local183.length - local185, local185, local183);
					if (local198 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method2627(new Class1_Sub20(local183));
			}
		} catch (@Pc(228) Exception local228) {
		}
		try {
			if (local150 != null) {
				local150.method6494();
			}
		} catch (@Pc(235) Exception local235) {
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)I")
	private int method2624(@OriginalArg(0) int arg0) {
		@Pc(26) byte local26;
		if (arg0 > 12000) {
			this.method2641();
			local26 = 4;
		} else if (arg0 > 5000) {
			local26 = 3;
			this.method2631();
		} else if (arg0 <= 2000) {
			local26 = 1;
			this.method2642(true);
		} else {
			this.method2633();
			local26 = 2;
		}
		if (Static375.anInt6609 != 2) {
			super.anInt3115 = 2;
			Static69.method1449(2);
		}
		this.method2628(Static246.aClass114_10);
		return local26;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IB)Z")
	public boolean method2625(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean239 ? super.aBoolean235 : true;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!io;)V")
	private void method2627(@OriginalArg(1) Class1_Sub20 arg0) {
		if (arg0.aByteArray52.length - arg0.anInt5238 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method4393();
		if (local20 < 0 || local20 > 22) {
			return;
		}
		@Pc(51) byte local51;
		if (local20 == 22) {
			local51 = 45;
		} else if (local20 == 21) {
			local51 = 44;
		} else if (local20 == 20) {
			local51 = 43;
		} else if (local20 == 19) {
			local51 = 42;
		} else if (local20 == 18) {
			local51 = 41;
		} else if (local20 == 17) {
			local51 = 40;
		} else if (local20 == 16) {
			local51 = 38;
		} else if (local20 == 15) {
			local51 = 37;
		} else if (local20 == 14) {
			local51 = 36;
		} else if (local20 == 13) {
			local51 = 35;
		} else if (local20 == 12) {
			local51 = 34;
		} else if (local20 == 11) {
			local51 = 33;
		} else if (local20 == 10) {
			local51 = 32;
		} else if (local20 == 9) {
			local51 = 31;
		} else if (local20 == 8) {
			local51 = 30;
		} else if (local20 == 7) {
			local51 = 29;
		} else if (local20 == 6) {
			local51 = 28;
		} else if (local20 == 5) {
			local51 = 28;
		} else if (local20 == 4) {
			local51 = 24;
		} else if (local20 == 3) {
			local51 = 23;
		} else if (local20 == 2) {
			local51 = 22;
		} else if (local20 == 1) {
			local51 = 23;
		} else {
			local51 = 19;
		}
		if (local51 > arg0.aByteArray52.length - arg0.anInt5238) {
			return;
		}
		super.anInt3091 = arg0.method4393();
		if (super.anInt3091 < 1) {
			super.anInt3091 = 1;
		} else if (super.anInt3091 > 4) {
			super.anInt3091 = 4;
		}
		this.method2630(arg0.method4393() == 1);
		super.aBoolean227 = arg0.method4393() == 1;
		super.aBoolean220 = arg0.method4393() == 1;
		super.aBoolean219 = arg0.method4393() == 1;
		super.anInt3110 = arg0.method4393() == 1 ? 1 : 0;
		super.aBoolean224 = arg0.method4393() == 1;
		super.aBoolean234 = arg0.method4393() == 1;
		super.aBoolean225 = arg0.method4393() == 1;
		super.anInt3106 = arg0.method4393();
		if (super.anInt3106 > 2) {
			super.anInt3106 = 2;
		}
		if (local20 >= 17) {
			super.anInt3088 = arg0.method4393();
		}
		if (local20 < 2) {
			super.aBoolean229 = arg0.method4393() == 1;
			arg0.method4393();
		} else {
			super.aBoolean229 = arg0.method4393() == 1;
			if (local20 >= 17) {
				super.aBoolean221 = arg0.method4393() == 1;
			}
		}
		super.aBoolean228 = arg0.method4393() == 1;
		super.aBoolean230 = arg0.method4393() == 1;
		super.anInt3093 = arg0.method4393();
		if (super.anInt3093 > 2) {
			super.anInt3093 = 2;
		}
		super.anInt3105 = super.anInt3093;
		super.aBoolean233 = arg0.method4393() == 1;
		super.anInt3096 = arg0.method4393();
		if (super.anInt3096 > 127) {
			super.anInt3096 = 127;
		}
		if (local20 >= 20) {
			super.anInt3102 = arg0.method4393();
			if (super.anInt3102 > 127) {
				super.anInt3102 = 127;
			}
		} else {
			super.anInt3102 = super.anInt3096;
		}
		super.anInt3103 = arg0.method4393();
		super.anInt3107 = arg0.method4393();
		if (super.anInt3107 > 127) {
			super.anInt3107 = 127;
		}
		if (local20 < 21) {
			super.anInt3111 = super.anInt3103;
		} else {
			super.anInt3111 = arg0.method4393();
			if (super.anInt3111 > 127) {
				super.anInt3111 = 127;
			}
		}
		if (local20 >= 1) {
			super.anInt3117 = arg0.method4426();
			super.anInt3089 = arg0.method4426();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method4393();
		}
		@Pc(579) int local579;
		if (local20 >= 4) {
			local579 = arg0.method4393();
			if (local579 < 0 || local579 > 2) {
				local579 = 0;
			}
			if (Static72.anInt1778 < 96) {
				local579 = 0;
			}
			Static101.method1859(local579);
		}
		if (local20 >= 5) {
			super.anInt3090 = arg0.method4371();
		}
		local579 = 0;
		if (local20 >= 6) {
			super.anInt3097 = local579 = arg0.method4393();
		}
		if (super.anInt3097 != 1 && super.anInt3097 != 2) {
			super.anInt3097 = 2;
		}
		if (local20 >= 7) {
			super.aBoolean222 = arg0.method4393() == 1;
		}
		if (local20 >= 8) {
			super.aBoolean231 = arg0.method4393() == 1;
		}
		if (local20 >= 9) {
			super.anInt3100 = arg0.method4393();
		}
		if (super.anInt3100 < 0 || super.anInt3100 > Static77.method6749(Static72.anInt1778)) {
			super.anInt3100 = 0;
		}
		if (local20 >= 10) {
			super.aBoolean232 = arg0.method4393() != 0;
		}
		if (local20 >= 11) {
			super.aBoolean236 = arg0.method4393() != 0;
		}
		if (local20 >= 12) {
			super.anInt3110 = arg0.method4393();
		}
		if (super.anInt3110 < 0 || super.anInt3110 > 2) {
			super.anInt3110 = 1;
		}
		if (local20 >= 13) {
			super.aBoolean226 = arg0.method4393() == 1;
		}
		if (local20 >= 14) {
			super.anInt3115 = arg0.method4393();
		} else if (local579 == 0) {
			super.anInt3115 = 2;
		} else {
			super.anInt3115 = 1;
		}
		if (super.anInt3115 < 0 || super.anInt3115 > 5) {
			super.anInt3115 = 2;
		}
		if (local20 >= 15) {
			super.anInt3113 = arg0.method4393();
			if (super.anInt3113 < 0 || super.anInt3113 > 4) {
				super.anInt3113 = Static265.anInt4986 == 1 ? 2 : 4;
			}
		}
		if (local20 >= 16) {
			super.aBoolean223 = arg0.method4393() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean223 = false;
				}
			} catch (@Pc(841) Throwable local841) {
			}
		}
		if (local20 < 17 && super.anInt3115 == 0) {
			super.anInt3115 = 2;
		}
		if (local20 >= 18) {
			super.anInt3101 = arg0.method4393();
			if (super.anInt3101 < 0 || super.anInt3101 > 4) {
				super.anInt3101 = 0;
			}
		}
		if (local20 >= 19) {
			super.anInt3104 = arg0.method4393();
		} else if (super.anInt3101 == 1 || super.anInt3101 == 2) {
			super.anInt3104 = 2;
		} else if (super.anInt3101 == 3) {
			super.anInt3104 = 1;
		} else {
			super.anInt3104 = 0;
		}
		if (local20 >= 22) {
			super.anInt3114 = arg0.method4393();
		}
		if (super.anInt3115 == 0 && Static72.anInt1778 < 96 && super.anInt3101 != 1 && super.anInt3101 != 0) {
			this.method2642(false);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!gba;I)V")
	public void method2628(@OriginalArg(0) Class114 arg0) {
		@Pc(7) Class283 local7 = null;
		try {
			@Pc(13) Class23 local13 = arg0.method2514("", true);
			while (local13.anInt875 == 0) {
				Static423.method5918(1L);
			}
			if (local13.anInt875 == 1) {
				local7 = (Class283) local13.anObject1;
				@Pc(40) Class1_Sub20 local40 = new Class1_Sub20(Static578.method7769());
				this.method2619(local40);
				local7.method6493(0, local40.aByteArray52, local40.anInt5238);
			}
		} catch (@Pc(54) Exception local54) {
		}
		try {
			if (local7 != null) {
				local7.method6494();
			}
		} catch (@Pc(63) Exception local63) {
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(IB)V")
	public void method2629(@OriginalArg(0) int arg0) {
		Static243.aClass360Array1 = null;
		super.anInt3104 = arg0;
		Static344.aBoolean436 = true;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V")
	public void method2630(@OriginalArg(0) boolean arg0) {
		super.aBoolean235 = arg0;
		if (Static146.aClass214_1 != null) {
			Static146.aClass214_1.method4901(!this.method2625(Static375.anInt6609));
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public void method2631() {
		this.method2630(true);
		super.aBoolean224 = true;
		super.aBoolean225 = true;
		super.aBoolean229 = true;
		super.anInt3106 = super.anInt3088 = 1;
		super.aBoolean227 = true;
		super.aBoolean230 = true;
		super.aBoolean221 = false;
		super.aBoolean223 = true;
		super.anInt3110 = 1;
		super.aBoolean228 = false;
		super.aBoolean220 = true;
		super.anInt3093 = super.anInt3105 = 0;
		super.aBoolean219 = true;
		super.aBoolean234 = true;
		if (Static72.anInt1778 <= 95) {
			Static101.method1859(0);
		} else {
			Static101.method1859(1);
		}
		super.aBoolean232 = false;
		super.anInt3100 = 0;
		super.aBoolean226 = true;
		this.method2639();
		this.method2629(1);
		super.anInt3101 = 3;
		Static89.method1753();
		Static224.method3681();
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(ZI)I")
	public int method2632(@OriginalArg(1) int arg0) {
		if (Static579.method7771(arg0) && !Static412.method5784(Static177.anInt2101)) {
			return Static72.anInt1778 < 96 && Static319.method4852(arg0) && super.anInt3104 == 0 ? 1 : super.anInt3104;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
	public void method2633() {
		this.method2630(true);
		super.anInt3110 = 0;
		super.aBoolean220 = true;
		super.aBoolean234 = false;
		super.aBoolean224 = false;
		super.aBoolean228 = false;
		super.aBoolean227 = false;
		super.anInt3093 = super.anInt3105 = 0;
		super.anInt3106 = super.anInt3088 = 0;
		super.aBoolean219 = false;
		super.aBoolean225 = false;
		super.aBoolean229 = false;
		super.aBoolean223 = false;
		super.aBoolean230 = false;
		super.aBoolean221 = false;
		Static101.method1859(0);
		super.anInt3100 = 0;
		super.aBoolean232 = false;
		super.aBoolean226 = true;
		this.method2639();
		this.method2629(2);
		super.anInt3101 = 2;
		Static89.method1753();
		Static224.method3681();
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
	private int method2634() {
		@Pc(10) byte local10;
		if (Static72.anInt1778 < 96) {
			local10 = 1;
			this.method2642(true);
		} else {
			@Pc(19) int local19 = Static76.method1621();
			if (local19 <= 100) {
				this.method2641();
				local10 = 4;
			} else if (local19 <= 500) {
				local10 = 3;
				this.method2631();
			} else if (local19 <= 1000) {
				this.method2633();
				local10 = 2;
			} else {
				local10 = 1;
				this.method2642(true);
			}
		}
		if (Static375.anInt6609 != 0) {
			super.anInt3115 = 0;
			Static69.method1449(0);
		}
		this.method2628(Static246.aClass114_10);
		return local10;
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)I")
	public int method2635() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static246.aClass114_10.aBoolean212 && !Static246.aClass114_10.aBoolean213) {
			if (Static162.aString37.startsWith("win")) {
				local9 = true;
				local11 = true;
				if (!Static162.aString31.startsWith("amd64") && !Static162.aString31.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean240) {
			local11 = false;
		}
		if (this.aBoolean238) {
			local7 = false;
		}
		if (this.aBoolean237) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method2634();
		}
		@Pc(71) int local71 = -1;
		@Pc(73) int local73 = -1;
		if (local7) {
			try {
				local71 = Static46.method1120(2, 1000);
			} catch (@Pc(84) Exception local84) {
			}
		}
		@Pc(87) int local87 = -1;
		if (local11) {
			try {
				local87 = Static46.method1120(3, 1000);
				if (Static375.anInt6609 == 3) {
					@Pc(100) Class2 local100 = Static136.aClass12_8.method6419();
					@Pc(105) long local105 = local100.aLong7 & 0xFFFFFFFFFFFFL;
					@Pc(108) int local108 = local100.anInt55;
					if (local108 == 4318) {
						local9 &= local105 >= 64425238954L;
					} else if (local108 == 4098) {
						local9 &= local105 >= 60129613779L;
					}
				}
			} catch (@Pc(146) Exception local146) {
			}
		}
		if (local9) {
			try {
				local73 = Static46.method1120(1, 1000);
			} catch (@Pc(156) Exception local156) {
			}
		}
		if (local71 == -1 && local73 == -1 && local87 == -1) {
			return this.method2634();
		}
		local87 = (int) ((float) local87 * 1.1F);
		local73 = (int) ((float) local73 * 1.1F);
		if (local87 < local71 && local71 > local73) {
			return this.method2624(local71);
		} else if (local73 >= local87) {
			return this.method2640(local73, 1);
		} else {
			return this.method2640(local87, 3);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)Z")
	public boolean method2637(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean235 : true;
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(IB)I")
	public int method2638(@OriginalArg(0) int arg0) {
		if (this.aBoolean241) {
			return 0;
		} else if (this.method2625(arg0)) {
			return super.aBoolean227 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	private void method2639() {
		if (Static265.anInt4986 <= 1) {
			super.anInt3113 = 2;
		} else {
			super.anInt3113 = 4;
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(BII)I")
	private int method2640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte local18;
		if (arg0 > 20000) {
			local18 = 4;
			this.method2641();
		} else if (arg0 > 10000) {
			local18 = 3;
			this.method2631();
		} else if (arg0 <= 5000) {
			local18 = 1;
			this.method2642(true);
		} else {
			local18 = 2;
			this.method2633();
		}
		if (arg1 != Static375.anInt6609) {
			super.anInt3115 = arg1;
			Static69.method1449(arg1);
		}
		this.method2628(Static246.aClass114_10);
		return local18;
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V")
	public void method2641() {
		this.method2630(true);
		super.aBoolean227 = true;
		super.aBoolean220 = true;
		super.aBoolean221 = true;
		super.aBoolean229 = true;
		super.aBoolean234 = true;
		super.aBoolean224 = true;
		super.aBoolean225 = true;
		super.aBoolean230 = true;
		super.aBoolean228 = true;
		super.anInt3093 = super.anInt3105 = 0;
		super.anInt3110 = 1;
		super.anInt3106 = super.anInt3088 = 2;
		super.aBoolean219 = true;
		super.aBoolean223 = true;
		if (Static72.anInt1778 > 95) {
			Static101.method1859(2);
		} else {
			Static101.method1859(0);
		}
		super.aBoolean232 = false;
		super.anInt3100 = 0;
		super.aBoolean226 = true;
		this.method2639();
		this.method2629(0);
		super.anInt3101 = 4;
		Static89.method1753();
		Static224.method3681();
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(ZI)V")
	public void method2642(@OriginalArg(0) boolean arg0) {
		this.method2630(false);
		super.aBoolean229 = false;
		super.aBoolean225 = false;
		super.aBoolean227 = false;
		super.aBoolean220 = false;
		super.aBoolean234 = false;
		super.anInt3106 = super.anInt3088 = 0;
		super.aBoolean224 = false;
		super.aBoolean219 = false;
		super.anInt3110 = 0;
		super.aBoolean228 = false;
		super.aBoolean230 = false;
		super.anInt3093 = super.anInt3105 = 0;
		super.aBoolean221 = false;
		super.aBoolean223 = false;
		Static101.method1859(0);
		super.aBoolean232 = false;
		super.anInt3100 = 0;
		super.aBoolean226 = false;
		this.method2639();
		this.method2629(2);
		super.anInt3101 = 1;
		if (arg0) {
			Static89.method1753();
		}
		Static224.method3681();
	}
}
