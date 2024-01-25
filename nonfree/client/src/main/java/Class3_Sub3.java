import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "[J")
	public static final long[] aLongArray10 = new long[11];

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "Z")
	private boolean aBoolean190;

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Lclient!ln;")
	private final Class204 aClass204_1;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "Z")
	private final boolean aBoolean189;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "Lclient!hr;")
	private Class142 aClass142_1;

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(19) char local19 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local12 / 2);
			@Pc(35) long local35 = (long) ((local12 & 0x1) == 0 ? local19 >>> 8 : local19 & 0xFF);
			@Pc(39) long local39 = local35 << 1;
			if (local39 >= 256L) {
				local39 ^= 0x11DL;
			}
			@Pc(51) long local51 = local39 << 1;
			if (local51 >= 256L) {
				local51 ^= 0x11DL;
			}
			@Pc(63) long local63 = local35 ^ local51;
			@Pc(67) long local67 = local51 << 1;
			if (local67 >= 256L) {
				local67 ^= 0x11DL;
			}
			@Pc(79) long local79 = local35 ^ local67;
			aLongArrayArray1[0][local12] = Static69.method1445(Static69.method1445(Static69.method1445(Static69.method1445(Static69.method1445(Static69.method1445(local51 << 40, Static69.method1445(local35 << 48, local35 << 56)), local35 << 32), local67 << 24), local63 << 16), local39 << 8), local79);
			for (@Pc(115) int local115 = 1; local115 < 8; local115++) {
				aLongArrayArray1[local115][local12] = Static69.method1445(aLongArrayArray1[local115 - 1][local12] << 56, aLongArrayArray1[local115 - 1][local12] >>> 8);
			}
		}
		aLongArray10[0] = 0L;
		for (@Pc(156) int local156 = 1; local156 <= 10; local156++) {
			@Pc(163) int local163 = local156 * 8 - 8;
			aLongArray10[local156] = Static420.method6359(Static213.method3551(aLongArrayArray1[7][local163 + 7], 255L), Static420.method6359(Static420.method6359(Static213.method3551(16711680L, aLongArrayArray1[5][local163 + 5]), Static420.method6359(Static420.method6359(Static213.method3551(aLongArrayArray1[3][local163 + 3], 1095216660480L), Static420.method6359(Static213.method3551(aLongArrayArray1[2][local163 + 2], 280375465082880L), Static420.method6359(Static213.method3551(71776119061217280L, aLongArrayArray1[1][local163 + 1]), Static213.method3551(aLongArrayArray1[0][local163], -72057594037927936L)))), Static213.method3551(4278190080L, aLongArrayArray1[4][local163 + 4]))), Static213.method3551(aLongArrayArray1[6][local163 + 6], 65280L)));
		}
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!qi;Lclient!ga;Lclient!ln;)V")
	public Class3_Sub3(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class204 arg2) {
		super(arg0);
		this.aClass204_1 = arg2;
		if (arg1 != null && arg0.aBoolean557 && arg0.aBoolean558) {
			@Pc(27) Class217 local27 = Static550.method7485(arg0, arg1.method2450("environment_mapped_water_v", "gl"), 35633);
			@Pc(37) Class217 local37 = Static550.method7485(arg0, arg1.method2450("environment_mapped_water_f", "gl"), 35632);
			this.aClass142_1 = Static32.method785(arg0, new Class217[] { local27, local37 });
			this.aBoolean189 = this.aClass142_1 != null && this.aClass204_1.method4714();
		} else {
			this.aBoolean189 = false;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		if (!this.aBoolean190) {
			return;
		}
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6159(null);
		super.aClass12_Sub2_23.method6196(0);
		super.aClass12_Sub2_23.method6159(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean190 = false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface12 local12 = super.aClass12_Sub2_23.method6208();
		if (!this.aBoolean189 || local12 == null) {
			return;
		}
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6159(local12);
		super.aClass12_Sub2_23.method6196(0);
		super.aClass12_Sub2_23.method6159(this.aClass204_1.anInterface4_2);
		@Pc(43) long local43 = this.aClass142_1.aLong166;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), super.aClass12_Sub2_23.aFloatArray62[0], -super.aClass12_Sub2_23.aFloatArray62[1], -super.aClass12_Sub2_23.aFloatArray62[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass12_Sub2_23.aFloat183, super.aClass12_Sub2_23.aFloat197, super.aClass12_Sub2_23.aFloat195, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass12_Sub2_23.aFloatArray62[1]) * 928.0F + 96.0F);
		this.aBoolean190 = true;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean190) {
			super.aClass12_Sub2_23.method6159(arg0);
			super.aClass12_Sub2_23.method6249(arg1);
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return this.aBoolean189;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean190) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass142_1.aLong166;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass12_Sub2_23.anInt7542 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}
}
