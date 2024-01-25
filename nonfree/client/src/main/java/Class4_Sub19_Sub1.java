import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class4_Sub19_Sub1 extends Class4_Sub19 {

	@OriginalMember(owner = "client!fp", name = "Hb", descriptor = "I")
	public int anInt3100;

	@OriginalMember(owner = "client!fp", name = "gb", descriptor = "Z")
	public boolean aBoolean269 = false;

	@OriginalMember(owner = "client!fp", name = "vb", descriptor = "Z")
	public boolean aBoolean272 = false;

	@OriginalMember(owner = "client!fp", name = "Eb", descriptor = "Z")
	public boolean aBoolean274 = false;

	@OriginalMember(owner = "client!fp", name = "Ab", descriptor = "Z")
	public boolean aBoolean273 = false;

	@OriginalMember(owner = "client!fp", name = "pb", descriptor = "Z")
	public boolean aBoolean270 = false;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class4_Sub19_Sub1(@OriginalArg(0) Class354 arg0) {
		super.anInt3062 = 3;
		super.anInt3073 = 3;
		this.method2780(true);
		super.anInt3059 = 0;
		super.aBoolean260 = true;
		super.aBoolean261 = true;
		super.anInt3066 = 127;
		super.anInt3054 = 0;
		super.aBoolean267 = true;
		super.aBoolean258 = false;
		super.anInt3050 = 0;
		super.anInt3051 = 127;
		super.aBoolean264 = true;
		super.anInt3077 = 127;
		super.anInt3076 = 0;
		super.aBoolean251 = true;
		super.anInt3058 = 2;
		super.aBoolean254 = true;
		super.aBoolean266 = true;
		super.aBoolean268 = true;
		super.aBoolean253 = true;
		super.aBoolean252 = true;
		super.anInt3068 = 127;
		super.anInt3052 = 1;
		super.anInt3064 = 127;
		super.anInt3061 = 0;
		if (Static577.anInt10067 < 96) {
			Static595.method8398(0);
		} else {
			Static595.method8398(2);
		}
		super.anInt3055 = 0;
		super.anInt3069 = Static594.anInt10250 == 1 ? 2 : 4;
		super.anInt3060 = 2;
		super.aBoolean262 = true;
		super.anInt3071 = 0;
		super.aBoolean255 = false;
		super.aBoolean259 = true;
		super.aBoolean257 = false;
		super.aBoolean263 = false;
		super.anInt3063 = 2;
		super.anInt3074 = 0;
		@Pc(152) Class337 local152 = null;
		try {
			@Pc(158) Class234 local158 = arg0.method8215("", true);
			while (local158.anInt6717 == 0) {
				Static63.method1019(1L);
			}
			if (local158.anInt6717 == 1) {
				local152 = (Class337) local158.anObject16;
				@Pc(183) byte[] local183 = new byte[(int) local152.method7969()];
				@Pc(198) int local198;
				for (@Pc(185) int local185 = 0; local185 < local183.length; local185 += local198) {
					local198 = local152.method7964(local185, local183.length - local185, local183);
					if (local198 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method2787(new Class4_Sub11(local183));
			}
		} catch (@Pc(223) Exception local223) {
		}
		try {
			if (local152 != null) {
				local152.method7966();
			}
		} catch (@Pc(230) Exception local230) {
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method2779(@OriginalArg(0) Class354 arg0) {
		@Pc(7) Class337 local7 = null;
		try {
			@Pc(13) Class234 local13 = arg0.method8215("", true);
			while (local13.anInt6717 == 0) {
				Static63.method1019(1L);
			}
			if (local13.anInt6717 == 1) {
				local7 = (Class337) local13.anObject16;
				@Pc(44) Class4_Sub11 local44 = new Class4_Sub11(Static72.method6568());
				this.method2776(local44);
				local7.method7965(0, local44.aByteArray68, local44.anInt5831);
			}
		} catch (@Pc(58) Exception local58) {
		}
		try {
			if (local7 != null) {
				local7.method7966();
			}
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(IZ)V")
	public void method2780(@OriginalArg(1) boolean arg0) {
		super.aBoolean265 = arg0;
		if (Static204.aClass139_8 != null) {
			Static204.aClass139_8.method3311(!this.method2784(Static495.anInt9000));
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	private void method2781() {
		if (Static594.anInt10250 <= 1) {
			super.anInt3069 = 2;
		} else {
			super.anInt3069 = 4;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BII)I")
	private int method2783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) byte local17;
		if (arg0 > 20000) {
			this.method2788();
			local17 = 4;
		} else if (arg0 > 10000) {
			local17 = 3;
			this.method2799();
		} else if (arg0 > 5000) {
			local17 = 2;
			this.method2789();
		} else {
			this.method2786(true);
			local17 = 1;
		}
		if (arg1 != Static495.anInt9000) {
			super.anInt3063 = arg1;
			Static547.method7956(arg1);
		}
		this.method2779(Static406.aClass354_5);
		return local17;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)Z")
	public boolean method2784(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean274 ? super.aBoolean265 : true;
	}

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)I")
	private int method2785() {
		@Pc(29) byte local29;
		if (Static577.anInt10067 >= 96) {
			@Pc(22) int local22 = Static77.method1242();
			if (local22 <= 100) {
				local29 = 4;
				this.method2788();
			} else if (local22 <= 500) {
				this.method2799();
				local29 = 3;
			} else if (local22 <= 1000) {
				local29 = 2;
				this.method2789();
			} else {
				this.method2786(true);
				local29 = 1;
			}
		} else {
			local29 = 1;
			this.method2786(true);
		}
		if (Static495.anInt9000 != 0) {
			super.anInt3063 = 0;
			Static547.method7956(0);
		}
		this.method2779(Static406.aClass354_5);
		return local29;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(IZ)V")
	public void method2786(@OriginalArg(1) boolean arg0) {
		this.method2780(false);
		super.aBoolean268 = false;
		super.aBoolean264 = !Static438.aClass92_4.equals(Static248.aClass92_2);
		super.aBoolean266 = false;
		super.aBoolean256 = false;
		super.anInt3052 = 0;
		super.aBoolean261 = false;
		super.anInt3058 = super.anInt3076 = 0;
		super.aBoolean251 = false;
		super.aBoolean260 = false;
		super.aBoolean267 = false;
		super.anInt3059 = super.anInt3061 = 0;
		super.aBoolean252 = false;
		super.aBoolean253 = false;
		super.aBoolean258 = false;
		Static595.method8398(0);
		super.aBoolean257 = false;
		super.aBoolean262 = false;
		super.anInt3074 = 0;
		this.method2781();
		this.method2798(2);
		super.anInt3062 = 1;
		if (arg0) {
			Static379.method6045();
		}
		Static214.method3551();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!un;B)V")
	private void method2787(@OriginalArg(0) Class4_Sub11 arg0) {
		if (arg0.aByteArray68.length - arg0.anInt5831 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method4905();
		if (local22 < 0 || local22 > 22) {
			return;
		}
		@Pc(37) byte local37;
		if (local22 == 22) {
			local37 = 45;
		} else if (local22 == 21) {
			local37 = 44;
		} else if (local22 == 20) {
			local37 = 43;
		} else if (local22 == 19) {
			local37 = 42;
		} else if (local22 == 18) {
			local37 = 41;
		} else if (local22 == 17) {
			local37 = 40;
		} else if (local22 == 16) {
			local37 = 38;
		} else if (local22 == 15) {
			local37 = 37;
		} else if (local22 == 14) {
			local37 = 36;
		} else if (local22 == 13) {
			local37 = 35;
		} else if (local22 == 12) {
			local37 = 34;
		} else if (local22 == 11) {
			local37 = 33;
		} else if (local22 == 10) {
			local37 = 32;
		} else if (local22 == 9) {
			local37 = 31;
		} else if (local22 == 8) {
			local37 = 30;
		} else if (local22 == 7) {
			local37 = 29;
		} else if (local22 == 6) {
			local37 = 28;
		} else if (local22 == 5) {
			local37 = 28;
		} else if (local22 == 4) {
			local37 = 24;
		} else if (local22 == 3) {
			local37 = 23;
		} else if (local22 == 2) {
			local37 = 22;
		} else if (local22 == 1) {
			local37 = 23;
		} else {
			local37 = 19;
		}
		if (local37 > arg0.aByteArray68.length - arg0.anInt5831) {
			return;
		}
		super.anInt3073 = arg0.method4905();
		if (super.anInt3073 < 1) {
			super.anInt3073 = 1;
		} else if (super.anInt3073 > 4) {
			super.anInt3073 = 4;
		}
		this.method2780(arg0.method4905() == 1);
		super.aBoolean268 = arg0.method4905() == 1;
		super.aBoolean264 = arg0.method4905() == 1;
		super.aBoolean260 = arg0.method4905() == 1;
		super.anInt3052 = arg0.method4905() == 1 ? 1 : 0;
		super.aBoolean253 = arg0.method4905() == 1;
		super.aBoolean252 = arg0.method4905() == 1;
		super.aBoolean251 = arg0.method4905() == 1;
		super.anInt3058 = arg0.method4905();
		if (super.anInt3058 > 2) {
			super.anInt3058 = 2;
		}
		if (local22 >= 17) {
			super.anInt3076 = arg0.method4905();
		}
		if (local22 < 2) {
			super.aBoolean267 = arg0.method4905() == 1;
			arg0.method4905();
		} else {
			super.aBoolean267 = arg0.method4905() == 1;
			if (local22 >= 17) {
				super.aBoolean258 = arg0.method4905() == 1;
			}
		}
		super.aBoolean261 = arg0.method4905() == 1;
		super.aBoolean266 = arg0.method4905() == 1;
		super.anInt3059 = arg0.method4905();
		if (super.anInt3059 > 2) {
			super.anInt3059 = 2;
		}
		super.anInt3061 = super.anInt3059;
		super.aBoolean254 = arg0.method4905() == 1;
		super.anInt3064 = arg0.method4905();
		if (super.anInt3064 > 127) {
			super.anInt3064 = 127;
		}
		if (local22 < 20) {
			super.anInt3077 = super.anInt3064;
		} else {
			super.anInt3077 = arg0.method4905();
			if (super.anInt3077 > 127) {
				super.anInt3077 = 127;
			}
		}
		super.anInt3066 = arg0.method4905();
		super.anInt3051 = arg0.method4905();
		if (super.anInt3051 > 127) {
			super.anInt3051 = 127;
		}
		if (local22 >= 21) {
			super.anInt3068 = arg0.method4905();
			if (super.anInt3068 > 127) {
				super.anInt3068 = 127;
			}
		} else {
			super.anInt3068 = super.anInt3066;
		}
		if (local22 >= 1) {
			super.anInt3050 = arg0.method4936();
			super.anInt3054 = arg0.method4936();
		}
		if (local22 >= 3 && local22 < 6) {
			arg0.method4905();
		}
		@Pc(590) int local590;
		if (local22 >= 4) {
			local590 = arg0.method4905();
			if (local590 < 0 || local590 > 2) {
				local590 = 0;
			}
			if (Static577.anInt10067 < 96) {
				local590 = 0;
			}
			Static595.method8398(local590);
		}
		if (local22 >= 5) {
			super.anInt3071 = arg0.method4931();
		}
		local590 = 0;
		if (local22 >= 6) {
			super.anInt3060 = local590 = arg0.method4905();
		}
		if (super.anInt3060 != 1 && super.anInt3060 != 2) {
			super.anInt3060 = 2;
		}
		if (local22 >= 7) {
			super.aBoolean263 = arg0.method4905() == 1;
		}
		if (local22 >= 8) {
			super.aBoolean255 = arg0.method4905() == 1;
		}
		if (local22 >= 9) {
			super.anInt3074 = arg0.method4905();
		}
		if (super.anInt3074 < 0 || super.anInt3074 > Static554.method8019(Static577.anInt10067)) {
			super.anInt3074 = 0;
		}
		if (local22 >= 10) {
			super.aBoolean257 = arg0.method4905() != 0;
		}
		if (local22 >= 11) {
			super.aBoolean259 = arg0.method4905() != 0;
		}
		if (local22 >= 12) {
			super.anInt3052 = arg0.method4905();
		}
		if (super.anInt3052 < 0 || super.anInt3052 > 2) {
			super.anInt3052 = 1;
		}
		if (local22 >= 13) {
			super.aBoolean262 = arg0.method4905() == 1;
		}
		if (local22 >= 14) {
			super.anInt3063 = arg0.method4905();
		} else if (local590 == 0) {
			super.anInt3063 = 2;
		} else {
			super.anInt3063 = 1;
		}
		if (super.anInt3063 < 0 || super.anInt3063 > 5) {
			super.anInt3063 = 2;
		}
		if (local22 >= 15) {
			super.anInt3069 = arg0.method4905();
			if (super.anInt3069 < 0 || super.anInt3069 > 4) {
				super.anInt3069 = Static594.anInt10250 == 1 ? 2 : 4;
			}
		}
		if (local22 >= 16) {
			super.aBoolean256 = arg0.method4905() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean256 = false;
				}
			} catch (@Pc(863) Throwable local863) {
			}
		}
		if (local22 < 17 && super.anInt3063 == 0) {
			super.anInt3063 = 2;
		}
		if (local22 >= 18) {
			super.anInt3062 = arg0.method4905();
			if (super.anInt3062 < 0 || super.anInt3062 > 4) {
				super.anInt3062 = 0;
			}
		}
		if (local22 >= 19) {
			super.anInt3055 = arg0.method4905();
		} else if (super.anInt3062 == 1 || super.anInt3062 == 2) {
			super.anInt3055 = 2;
		} else if (super.anInt3062 == 3) {
			super.anInt3055 = 1;
		} else {
			super.anInt3055 = 0;
		}
		if (local22 >= 22) {
			super.anInt3075 = arg0.method4905();
		}
		if (super.anInt3063 == 0 && Static577.anInt10067 < 96 && super.anInt3062 != 1 && super.anInt3062 != 0) {
			this.method2786(false);
		}
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(I)V")
	public void method2788() {
		this.method2780(true);
		super.aBoolean252 = true;
		super.anInt3059 = super.anInt3061 = 0;
		super.aBoolean264 = true;
		super.aBoolean266 = true;
		super.aBoolean267 = true;
		super.anInt3058 = super.anInt3076 = 2;
		super.aBoolean258 = true;
		super.aBoolean256 = true;
		super.aBoolean251 = true;
		super.aBoolean253 = true;
		super.aBoolean260 = true;
		super.aBoolean268 = true;
		super.anInt3052 = 1;
		super.aBoolean261 = true;
		if (Static577.anInt10067 > 95) {
			Static595.method8398(2);
		} else {
			Static595.method8398(0);
		}
		super.anInt3074 = 0;
		super.aBoolean257 = false;
		super.aBoolean262 = true;
		this.method2781();
		this.method2798(0);
		super.anInt3062 = 4;
		Static379.method6045();
		Static214.method3551();
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)V")
	public void method2789() {
		this.method2780(true);
		super.aBoolean252 = false;
		super.aBoolean268 = false;
		super.aBoolean258 = false;
		super.aBoolean260 = false;
		super.aBoolean253 = false;
		super.aBoolean267 = false;
		super.aBoolean256 = false;
		super.anInt3052 = 0;
		super.anInt3059 = super.anInt3061 = 0;
		super.aBoolean264 = true;
		super.anInt3058 = super.anInt3076 = 0;
		super.aBoolean266 = false;
		super.aBoolean251 = false;
		super.aBoolean261 = false;
		Static595.method8398(0);
		super.aBoolean257 = false;
		super.aBoolean262 = true;
		super.anInt3074 = 0;
		this.method2781();
		this.method2798(2);
		super.anInt3062 = 2;
		Static379.method6045();
		Static214.method3551();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)I")
	private int method2790(@OriginalArg(1) int arg0) {
		@Pc(10) byte local10;
		if (arg0 > 12000) {
			local10 = 4;
			this.method2788();
		} else if (arg0 > 5000) {
			this.method2799();
			local10 = 3;
		} else if (arg0 > 2000) {
			local10 = 2;
			this.method2789();
		} else {
			this.method2786(true);
			local10 = 1;
		}
		if (Static495.anInt9000 != 2) {
			super.anInt3063 = 2;
			Static547.method7956(2);
		}
		this.method2779(Static406.aClass354_5);
		return local10;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BI)Z")
	public boolean method2792(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean265 : true;
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(B)I")
	public int method2793() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static406.aClass354_5.aBoolean711 && !Static406.aClass354_5.aBoolean710) {
			if (Static576.aString104.startsWith("win")) {
				if (!Static576.aString100.startsWith("amd64") && !Static576.aString100.startsWith("x86_64")) {
					local7 = true;
				}
				local9 = true;
				local11 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean269) {
			local9 = false;
		}
		if (this.aBoolean270) {
			local7 = false;
		}
		if (this.aBoolean273) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method2785();
		}
		@Pc(66) int local66 = -1;
		@Pc(76) int local76 = -1;
		@Pc(78) int local78 = -1;
		if (local7) {
			try {
				local66 = Static279.method4827(1000, 2);
			} catch (@Pc(87) Exception local87) {
			}
		}
		if (local11) {
			try {
				local78 = Static279.method4827(1000, 3);
				if (Static495.anInt9000 == 3) {
					@Pc(103) Class155 local103 = Static440.aClass44_12.method4985();
					@Pc(108) long local108 = local103.aLong119 & 0xFFFFFFFFFFFFL;
					@Pc(111) int local111 = local103.anInt4016;
					if (local111 == 4318) {
						local9 &= local108 >= 64425238954L;
					} else if (local111 == 4098) {
						local9 &= local108 >= 60129613779L;
					}
				}
			} catch (@Pc(149) Exception local149) {
			}
		}
		if (local9) {
			try {
				local76 = Static279.method4827(1000, 1);
			} catch (@Pc(159) Exception local159) {
			}
		}
		if (local66 == -1 && local76 == -1 && local78 == -1) {
			return this.method2785();
		}
		local76 = (int) ((float) local76 * 1.1F);
		local78 = (int) ((float) local78 * 1.1F);
		if (local78 < local66 && local76 < local66) {
			return this.method2790(local66);
		} else if (local76 >= local78) {
			return this.method2783(local76, 1);
		} else {
			return this.method2783(local78, 3);
		}
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(IZ)I")
	public int method2794(@OriginalArg(0) int arg0) {
		if (this.aBoolean272) {
			return 0;
		} else if (this.method2784(arg0)) {
			return super.aBoolean268 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(II)I")
	public int method2796(@OriginalArg(0) int arg0) {
		if (Static356.method5763(arg0) && !Static98.method2168(Static203.anInt3855)) {
			return Static577.anInt10067 < 96 && Static244.method3929(arg0) && super.anInt3055 == 0 ? 1 : super.anInt3055;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(II)V")
	public void method2798(@OriginalArg(1) int arg0) {
		Static122.aClass257Array1 = null;
		Static493.aBoolean628 = true;
		super.anInt3055 = arg0;
	}

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "(I)V")
	public void method2799() {
		this.method2780(true);
		super.aBoolean267 = true;
		super.aBoolean256 = true;
		super.aBoolean253 = true;
		super.aBoolean252 = true;
		super.anInt3058 = super.anInt3076 = 1;
		super.aBoolean258 = false;
		super.aBoolean266 = true;
		super.anInt3059 = super.anInt3061 = 0;
		super.aBoolean251 = true;
		super.aBoolean261 = false;
		super.aBoolean264 = true;
		super.anInt3052 = 1;
		super.aBoolean260 = true;
		super.aBoolean268 = true;
		if (Static577.anInt10067 > 95) {
			Static595.method8398(1);
		} else {
			Static595.method8398(0);
		}
		super.anInt3074 = 0;
		super.aBoolean257 = false;
		super.aBoolean262 = true;
		this.method2781();
		this.method2798(1);
		super.anInt3062 = 3;
		Static379.method6045();
		Static214.method3551();
	}
}
