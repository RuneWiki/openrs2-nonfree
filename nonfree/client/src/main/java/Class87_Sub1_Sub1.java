import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class87_Sub1_Sub1 extends Class87_Sub1 {

	@OriginalMember(owner = "client!eea", name = "Ei", descriptor = "Z")
	private boolean aBoolean228;

	@OriginalMember(owner = "client!eea", name = "Fi", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!eea", name = "Hi", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!eea", name = "Ii", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!eea", name = "Ji", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!eea", name = "Li", descriptor = "I")
	private int anInt2783;

	@OriginalMember(owner = "client!eea", name = "Mi", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!eea", name = "Gh", descriptor = "Lclient!nt;")
	private final Class238 aClass238_15 = new Class238();

	@OriginalMember(owner = "client!eea", name = "fi", descriptor = "Lclient!nt;")
	private final Class238 aClass238_16 = new Class238();

	@OriginalMember(owner = "client!eea", name = "wi", descriptor = "Lclient!nt;")
	private final Class238 aClass238_17 = new Class238();

	@OriginalMember(owner = "client!eea", name = "Ai", descriptor = "Lclient!nt;")
	private final Class238 aClass238_18 = new Class238();

	@OriginalMember(owner = "client!eea", name = "Bi", descriptor = "Lclient!nt;")
	private final Class238 aClass238_19 = new Class238();

	@OriginalMember(owner = "client!eea", name = "Ci", descriptor = "Lclient!nt;")
	private final Class238 aClass238_20 = new Class238();

	@OriginalMember(owner = "client!eea", name = "Di", descriptor = "Lclient!nt;")
	private final Class238 aClass238_21 = new Class238();

	@OriginalMember(owner = "client!eea", name = "Gi", descriptor = "[Lclient!sba;")
	private final Class272_Sub1[] aClass272_Sub1Array1 = new Class272_Sub1[16];

	@OriginalMember(owner = "client!eea", name = "Ki", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!eea", name = "Ni", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer2 = new MapBuffer();

	@OriginalMember(owner = "client!eea", name = "Oi", descriptor = "I")
	private final int anInt2784 = 0;

	@OriginalMember(owner = "client!eea", name = "Ah", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!eea", name = "Vi", descriptor = "Ljava/lang/String;")
	private final String aString30;

	@OriginalMember(owner = "client!eea", name = "Ui", descriptor = "Ljava/lang/String;")
	private final String aString29;

	@OriginalMember(owner = "client!eea", name = "Pi", descriptor = "I")
	private final int anInt2785;

	@OriginalMember(owner = "client!eea", name = "Si", descriptor = "Z")
	public boolean aBoolean234;

	@OriginalMember(owner = "client!eea", name = "Yi", descriptor = "Z")
	private boolean aBoolean237;

	@OriginalMember(owner = "client!eea", name = "Ri", descriptor = "Z")
	private final boolean aBoolean233;

	@OriginalMember(owner = "client!eea", name = "Ti", descriptor = "Z")
	public final boolean aBoolean235;

	@OriginalMember(owner = "client!eea", name = "Zi", descriptor = "Z")
	public final boolean aBoolean238;

	@OriginalMember(owner = "client!eea", name = "Xi", descriptor = "Z")
	public final boolean aBoolean236;

	@OriginalMember(owner = "client!eea", name = "Qi", descriptor = "[I")
	public final int[] anIntArray201;

	@OriginalMember(owner = "client!eea", name = "Wi", descriptor = "I")
	public final int anInt2786;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!d;Lclient!eq;I)V")
	public Class87_Sub1_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface6 arg3, @OriginalArg(4) Class97 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString30 = OpenGL.glGetString(7936).toLowerCase();
			this.aString29 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString30.indexOf("microsoft") != -1 || this.aString30.indexOf("brian paul") != -1 || this.aString30.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(108) String local108 = OpenGL.glGetString(7938);
			@Pc(116) String[] local116 = Static218.method3754(' ', local108.replace('.', ' '));
			if (local116.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(139) int local139;
			try {
				@Pc(133) int local133 = Static56.method1026(local116[0]);
				local139 = Static56.method1026(local116[1]);
				this.anInt2785 = local139 + local133 * 10;
			} catch (@Pc(148) NumberFormatException local148) {
				throw new RuntimeException("");
			}
			if (this.anInt2785 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(185) int[] local185 = new int[1];
				OpenGL.glGetIntegerv(34018, local185, 0);
				super.anInt6151 = local185[0];
				if (super.anInt6151 < 2) {
					throw new RuntimeException("");
				}
				super.anInt6148 = 8;
				this.aBoolean234 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean450 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean237 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean453 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean233 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean445 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.aBoolean235 = this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean238 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.aBoolean236 = this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anIntArray201 = new int[super.anInt6151];
				this.anInt2786 = Stream.b() ? 33639 : 5121;
				if (this.aString29.indexOf("radeon") != -1) {
					local139 = 0;
					@Pc(287) boolean local287 = false;
					@Pc(289) boolean local289 = false;
					@Pc(298) String[] local298 = Static218.method3754(' ', this.aString29.replace('/', ' '));
					for (@Pc(300) int local300 = 0; local300 < local298.length; local300++) {
						@Pc(305) String local305 = local298[local300];
						try {
							if (local305.length() > 0) {
								if (local305.charAt(0) == 'x' && local305.length() >= 3 && Static515.method7239(local305.substring(1, 3))) {
									local289 = true;
									local305 = local305.substring(1);
								}
								if (local305.equals("hd")) {
									local287 = true;
								} else {
									if (local305.startsWith("hd")) {
										local305 = local305.substring(2);
										local287 = true;
									}
									if (local305.length() >= 4 && Static515.method7239(local305.substring(0, 4))) {
										local139 = Static56.method1026(local305.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(371) Exception local371) {
						}
					}
					if (!local289 && !local287) {
						if (local139 >= 7000 && local139 <= 9250) {
							super.aBoolean445 = false;
						}
						if (local139 >= 7000 && local139 <= 7999) {
							this.aBoolean234 = false;
						}
					}
					this.aBoolean237 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString30.indexOf("intel");
				if (this.aBoolean234) {
					try {
						@Pc(423) int[] local423 = new int[1];
						OpenGL.glGenBuffersARB(1, local423, 0);
					} catch (@Pc(429) Throwable local429) {
						throw new RuntimeException("");
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(435) Throwable local435) {
			local435.printStackTrace();
			this.method7970();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!eea", name = "I", descriptor = "(I)V")
	@Override
	protected void method5092() {
		if (super.aBoolean444) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZJ)V")
	public synchronized void method2402(@OriginalArg(1) long arg0) {
		@Pc(11) Class2 local11 = new Class2();
		local11.aLong287 = arg0;
		this.aClass238_21.method5837(local11);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I[Lclient!ofa;)Lclient!hi;")
	@Override
	public Class147 method5083(@OriginalArg(1) Class241[] arg0) {
		return new Class147_Sub1(arg0);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	@Override
	protected void method5144(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(12) Long local12 = (Long) arg1;
		if (!this.anOpenGL1.setSurface(local12)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eea", name = "p", descriptor = "(B)V")
	@Override
	protected void method5073() {
		Static415.aFloatArray66[1] = (float) (super.anInt6117 & 0xFF00) / 65280.0F;
		Static415.aFloatArray66[2] = (float) (super.anInt6117 & 0xFF) / 255.0F;
		Static415.aFloatArray66[3] = (float) (super.anInt6117 >>> 24) / 255.0F;
		Static415.aFloatArray66[0] = (float) (super.anInt6117 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static415.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!eea", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!taa;ZI)V")
	@Override
	protected void method5029(@OriginalArg(1) Class315 arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, Static261.method4254(arg0));
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "(Z)F")
	@Override
	protected float method5142() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)V")
	public synchronized void method2403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub15 local8 = new Class2_Sub15(arg1);
		local8.aLong287 = arg0;
		this.aClass238_17.method5837(local8);
	}

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "(B)V")
	@Override
	protected void method5046() {
		Static415.aFloatArray66[0] = super.aFloat137 * super.aFloat144;
		Static415.aFloatArray66[2] = super.aFloat144 * super.aFloat148;
		Static415.aFloatArray66[3] = 1.0F;
		Static415.aFloatArray66[1] = super.aFloat147 * super.aFloat144;
		OpenGL.glLightfv(16384, 4609, Static415.aFloatArray66, 0);
		Static415.aFloatArray66[1] = -super.aFloat134 * super.aFloat147;
		Static415.aFloatArray66[0] = -super.aFloat134 * super.aFloat137;
		Static415.aFloatArray66[3] = 1.0F;
		Static415.aFloatArray66[2] = -super.aFloat134 * super.aFloat148;
		OpenGL.glLightfv(16385, 4609, Static415.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BLclient!ti;Lclient!kca;)Z")
	@Override
	public boolean method5137(@OriginalArg(1) Class324 arg0, @OriginalArg(2) Class187 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!c;Lclient!vi;)Lclient!uaa;")
	@Override
	public Interface24 method7900(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!eea", name = "o", descriptor = "()V")
	@Override
	public void method7937() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!hi;Z)V")
	@Override
	public void method5110(@OriginalArg(0) Class147 arg0) {
		@Pc(9) Class241[] local9 = ((Class147_Sub1) arg0).aClass241Array1;
		@Pc(11) int local11 = 0;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < local9.length; local19++) {
			@Pc(25) Class241 local25 = local9[local19];
			@Pc(30) Class272_Sub1 local30 = this.aClass272_Sub1Array1[local19];
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = local30.method7190();
			@Pc(40) long local40 = local30.method7673();
			local30.method7680();
			for (@Pc(45) int local45 = 0; local45 < local25.method6236(); local45++) {
				@Pc(52) Class365 local52 = local25.method6235(local45);
				if (local52 == Static620.aClass365_1) {
					local17 = true;
					OpenGL.glVertexPointer(3, 5126, local36, (long) local32 + local40);
				} else if (Static620.aClass365_2 == local52) {
					OpenGL.glNormalPointer(5126, local36, (long) local32 + local40);
					local15 = true;
				} else if (local52 == Static620.aClass365_3) {
					local13 = true;
					OpenGL.glColorPointer(4, 5121, local36, local40 + (long) local32);
				} else if (local52 == Static620.aClass365_4) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(1, 5126, local36, (long) local32 + local40);
				} else if (Static620.aClass365_5 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(2, 5126, local36, (long) local32 + local40);
				} else if (Static620.aClass365_6 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(3, 5126, local36, local40 + (long) local32);
				} else if (Static620.aClass365_7 == local52) {
					OpenGL.glClientActiveTexture(local11++ + 33984);
					OpenGL.glTexCoordPointer(4, 5126, local36, local40 + (long) local32);
				}
				local32 += local52.anInt10085;
			}
		}
		if (local17 != this.aBoolean230) {
			if (local17) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean230 = local17;
		}
		if (local15 != this.aBoolean232) {
			if (local15) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean232 = local15;
		}
		if (local13 != this.aBoolean231) {
			if (local13) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean231 = local13;
		}
		@Pc(262) int local262;
		if (this.anInt2783 < local11) {
			for (local262 = this.anInt2783; local262 < local11; local262++) {
				OpenGL.glClientActiveTexture(local262 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2783 = local11;
		} else if (local11 < this.anInt2783) {
			for (local262 = local11; local262 < this.anInt2783; local262++) {
				OpenGL.glClientActiveTexture(local262 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2783 = local11;
			return;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZIZ[[I)Lclient!saa;")
	@Override
	public Interface22 method5150(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2) {
		return new Class136_Sub4(this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!eea", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7945(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!eea", name = "h", descriptor = "()Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIILclient!kca;I[BZI)Lclient!wda;")
	@Override
	protected Interface26 method5103(@OriginalArg(3) Class187 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) boolean arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean233 || Static504.method7825(arg4) && Static504.method7825(arg1)) {
			return new Class136_Sub1(this, arg0, arg4, arg1, arg3, arg2, 0, 0);
		} else if (this.aBoolean237) {
			return new Class136_Sub2(this, arg0, arg4, arg1, arg2, 0, 0);
		} else {
			@Pc(36) Class136_Sub1 local36 = new Class136_Sub1(this, arg0, Static545.aClass324_12, Static347.method5404(arg4), Static347.method5404(arg1));
			local36.method8051(0, arg4, arg1, arg0, arg2);
			return local36;
		}
	}

	@OriginalMember(owner = "client!eea", name = "Z", descriptor = "(I)V")
	@Override
	protected void method5138() {
		OpenGL.glDepthMask(super.aBoolean451 && super.aBoolean447);
	}

	@OriginalMember(owner = "client!eea", name = "u", descriptor = "(B)V")
	@Override
	protected void method5109() {
		if (super.aBoolean459) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!eea", name = "Y", descriptor = "(I)V")
	@Override
	protected void method5134() {
		OpenGL.glViewport(super.anInt6145, super.anInt6152, super.anInt5936, super.anInt6075);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZZBILclient!taa;)V")
	@Override
	public void method5052(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class315 arg3) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, Static261.method4254(arg3));
		if (arg1) {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg0 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg2 + 34192, arg0 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!eea", name = "C", descriptor = "(I)V")
	@Override
	protected void method5069() {
		OpenGL.glTexEnvi(8960, 34162, Static343.method5242(super.aClass300Array5[super.anInt6114]));
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!uf;III)V")
	@Override
	public void method5090(@OriginalArg(0) Class334 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) byte local21;
		@Pc(25) int local25;
		if (Static64.aClass334_1 == arg0) {
			local25 = arg1 * 2;
			local21 = 1;
		} else if (Static107.aClass334_2 == arg0) {
			local21 = 3;
			local25 = arg1 + 1;
		} else if (Static562.aClass334_7 == arg0) {
			local25 = arg1 * 3;
			local21 = 4;
		} else if (arg0 == Static334.aClass334_6) {
			local25 = arg1 + 2;
			local21 = 6;
		} else if (Static335.aClass334_5 == arg0) {
			local21 = 5;
			local25 = arg1 + 2;
		} else {
			local21 = 0;
			local25 = arg1;
		}
		OpenGL.glDrawArrays(local21, arg2, local25);
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "()V")
	@Override
	public void method7893() {
	}

	@OriginalMember(owner = "client!eea", name = "l", descriptor = "()V")
	@Override
	public void method7919() {
		if (super.anInt5936 <= 0 && super.anInt6075 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt6119;
		@Pc(16) int local16 = super.anInt6142;
		@Pc(19) int local19 = super.anInt6140;
		@Pc(22) int local22 = super.anInt6115;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5024();
		this.method5112(false);
		this.method5108(false);
		this.method5088(false);
		this.method5053(false);
		this.method5079(null);
		this.method5071(false, false, -2);
		this.method5062(1);
		this.method5093(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt5936, super.anInt6075, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!eea", name = "I", descriptor = "()I")
	@Override
	public int I() {
		return this.anInt2784;
	}

	@OriginalMember(owner = "client!eea", name = "n", descriptor = "(I)V")
	@Override
	protected void method5033() {
		this.method5047();
		@Pc(10) int local10;
		for (local10 = 0; super.anInt6135 > local10; local10++) {
			@Pc(17) Class2_Sub4 local17 = super.aClass2_Sub4Array3[local10];
			@Pc(21) int local21 = local17.method8152();
			@Pc(25) int local25 = local10 + 16386;
			@Pc(31) float local31 = local17.method8156() / 255.0F;
			Static415.aFloatArray66[0] = local17.method8150();
			Static415.aFloatArray66[1] = local17.method8158();
			Static415.aFloatArray66[2] = local17.method8151();
			Static415.aFloatArray66[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static415.aFloatArray66, 0);
			Static415.aFloatArray66[1] = (float) (local21 >> 8 & 0xFF) * local31;
			Static415.aFloatArray66[2] = (float) (local21 & 0xFF) * local31;
			Static415.aFloatArray66[0] = (float) (local21 >> 16 & 0xFF) * local31;
			Static415.aFloatArray66[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, Static415.aFloatArray66, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method8154() * local17.method8154()));
			OpenGL.glEnable(local25);
		}
		while (super.anInt6143 > local10) {
			OpenGL.glDisable(local10 + 16386);
			local10++;
		}
		super.method5033();
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!kca;Lclient!ti;II)Lclient!wda;")
	@Override
	public Interface26 method5149(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class324 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean233 || Static504.method7825(arg0) && Static504.method7825(arg3)) {
			return new Class136_Sub1(this, arg1, arg2, arg0, arg3);
		} else if (this.aBoolean237) {
			return new Class136_Sub2(this, arg1, arg2, arg0, arg3);
		} else {
			return new Class136_Sub1(this, arg1, arg2, Static347.method5404(arg0), Static347.method5404(arg3));
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method5028(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(10) Long local10 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local10);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZII)V")
	public synchronized void method2404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub15 local8 = new Class2_Sub15(arg0);
		local8.aLong287 = arg1;
		this.aClass238_16.method5837(local8);
	}

	@OriginalMember(owner = "client!eea", name = "m", descriptor = "(I)V")
	@Override
	protected void method5031() {
		if (super.aBoolean455 && !super.aBoolean449) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "(II)V")
	@Override
	public void method5065(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!eea", name = "J", descriptor = "(I)V")
	@Override
	protected void method5096() {
	}

	@OriginalMember(owner = "client!eea", name = "F", descriptor = "(I)V")
	@Override
	protected void method5077() {
		OpenGL.glActiveTexture(super.anInt6114 + 33984);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5078(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "([FIIZIILclient!kca;I)Lclient!wda;")
	@Override
	protected Interface26 method5102(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class187 arg4) {
		if (this.aBoolean233 || Static504.method7825(arg3) && Static504.method7825(arg1)) {
			return new Class136_Sub1(this, arg4, arg3, arg1, arg2, arg0, 0, 0);
		} else if (this.aBoolean237) {
			return new Class136_Sub2(this, arg4, arg3, arg1, arg0, 0, 0);
		} else {
			@Pc(38) Class136_Sub1 local38 = new Class136_Sub1(this, arg4, Static545.aClass324_16, Static347.method5404(arg3), Static347.method5404(arg1));
			local38.method3388(arg0, arg4, arg3, arg1);
			return local38;
		}
	}

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "(B)V")
	@Override
	protected void method5084() {
		OpenGL.glScissor(super.anInt6145 + super.anInt6119, -super.anInt6115 + super.anInt6152 + super.anInt6075, -super.anInt6119 + super.anInt6142, -super.anInt6140 + super.anInt6115);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
	@Override
	protected void method5097(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(10) Long local10 = (Long) arg0;
		this.anOpenGL1.surfaceResized(local10);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!ti;Lclient!kca;)Z")
	@Override
	public boolean method5091(@OriginalArg(1) Class324 arg0, @OriginalArg(2) Class187 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BZ)Lclient!caa;")
	@Override
	public Interface3 method5043(@OriginalArg(1) boolean arg0) {
		return new Class272_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "(B)V")
	@Override
	protected void method5025() {
		if (Static85.aClass94_1 == super.aClass94_4) {
			OpenGL.glBlendFunc(770, 771);
		} else if (super.aClass94_4 == Static340.aClass94_5) {
			OpenGL.glBlendFunc(1, 1);
			return;
		} else if (Static474.aClass94_7 == super.aClass94_4) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BI)Lclient!dw;")
	@Override
	protected Class74 method5094(@OriginalArg(1) int arg0) {
		if (arg0 == 3) {
			return new Class74_Sub11(this, super.aClass97_86);
		} else if (arg0 == 4) {
			return new Class74_Sub9(this, super.aClass97_86, super.aClass378_6);
		} else if (arg0 == 8) {
			return new Class74_Sub4(this, super.aClass97_86, super.aClass378_6);
		} else {
			return super.method5094(arg0);
		}
	}

	@OriginalMember(owner = "client!eea", name = "A", descriptor = "()V")
	@Override
	protected void method7970() {
		super.method7970();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BLclient!cv;)V")
	@Override
	public void method5021(@OriginalArg(1) Class62 arg0) {
		if (Static269.aClass62_2 == arg0) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(6) int local6 = Static304.method4693(arg0);
		OpenGL.glTexGeni(8192, 9472, local6);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local6);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local6);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!eea", name = "h", descriptor = "(B)V")
	@Override
	protected void method5035() {
		if (super.aBoolean452) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!eea", name = "gb", descriptor = "(I)V")
	private void method2406() {
		if (this.aBoolean229) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass308_8.method7333()) {
			if (!this.aBoolean228) {
				OpenGL.glLoadMatrixf(super.aClass6_Sub2_18.method2715(Static404.aFloatArray4), 0);
				this.aBoolean228 = true;
				this.method5018();
				this.method5033();
			}
			if (super.aBoolean443) {
				this.aBoolean229 = false;
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(super.aClass6_Sub2_15.method2715(Static404.aFloatArray4), 0);
				this.aBoolean229 = true;
			}
		} else if (super.aBoolean443) {
			OpenGL.glLoadIdentity();
			this.aBoolean229 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass6_Sub2_15.method2715(Static404.aFloatArray4), 0);
			this.aBoolean229 = false;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7963(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7907(arg2, arg3);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!uaa;)V")
	@Override
	public void method7949(@OriginalArg(0) Interface24 arg0) {
	}

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "(B)V")
	@Override
	protected void method5032() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray48, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!eea", name = "G", descriptor = "(I)V")
	@Override
	protected void method5086() {
		OpenGL.glTexEnvi(8960, 34161, Static343.method5242(super.aClass300Array6[super.anInt6114]));
	}

	@OriginalMember(owner = "client!eea", name = "p", descriptor = "()V")
	@Override
	public void method7940() {
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7918(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub15 local19;
		while (!this.aClass238_16.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_16.method5832();
			Static417.anIntArray511[local11++] = (int) local19.aLong287;
			super.anInt6109 -= local19.anInt1789;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static417.anIntArray511, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static417.anIntArray511, 0);
			local11 = 0;
		}
		while (!this.aClass238_17.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_17.method5832();
			Static417.anIntArray511[local11++] = (int) local19.aLong287;
			super.anInt6110 -= local19.anInt1789;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static417.anIntArray511, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static417.anIntArray511, 0);
			local11 = 0;
		}
		while (!this.aClass238_18.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_18.method5832();
			Static417.anIntArray511[local11++] = local19.anInt1789;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static417.anIntArray511, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static417.anIntArray511, 0);
			local11 = 0;
		}
		while (!this.aClass238_19.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_19.method5832();
			Static417.anIntArray511[local11++] = (int) local19.aLong287;
			super.anInt6113 -= local19.anInt1789;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static417.anIntArray511, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static417.anIntArray511, 0);
		}
		while (!this.aClass238_15.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_15.method5832();
			OpenGL.glDeleteLists((int) local19.aLong287, local19.anInt1789);
		}
		@Pc(219) Class2 local219;
		while (!this.aClass238_20.method5839()) {
			local219 = this.aClass238_20.method5832();
			OpenGL.glDeleteProgramARB((int) local219.aLong287);
		}
		while (!this.aClass238_21.method5839()) {
			local219 = this.aClass238_21.method5832();
			OpenGL.glDeleteObjectARB(local219.aLong287);
		}
		while (!this.aClass238_15.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_15.method5832();
			OpenGL.glDeleteLists((int) local19.aLong287, local19.anInt1789);
		}
		if (this.E() > 100663296 && Static438.method6517() > this.aLong80 + 60000L) {
			System.gc();
			this.aLong80 = Static438.method6517();
		}
		super.method7918(local9);
	}

	@OriginalMember(owner = "client!eea", name = "cb", descriptor = "(I)V")
	@Override
	protected void method5146() {
		if (super.aBoolean448 && super.aBoolean463 && super.anInt6122 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "()Lclient!sia;")
	@Override
	public Class306 method7942() {
		@Pc(7) int local7 = -1;
		if (this.aString30.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString30.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString30.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class306(local7, "OpenGL", this.anInt2785, this.aString29, 0L);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IILclient!ida;BILclient!uf;I)V")
	@Override
	public void method5136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface10 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class334 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (Static64.aClass334_1 == arg4) {
			local10 = 1;
			local14 = arg3 * 2;
		} else if (arg4 == Static107.aClass334_2) {
			local10 = 3;
			local14 = arg3 + 1;
		} else if (arg4 == Static562.aClass334_7) {
			local14 = arg3 * 3;
			local10 = 4;
		} else if (Static334.aClass334_6 == arg4) {
			local10 = 6;
			local14 = arg3 + 2;
		} else if (Static335.aClass334_5 == arg4) {
			local14 = arg3 + 2;
			local10 = 5;
		} else {
			local14 = arg3;
			local10 = 0;
		}
		@Pc(68) Class324 local68 = arg2.method7681();
		@Pc(71) Class272_Sub2 local71 = (Class272_Sub2) arg2;
		local71.method7680();
		OpenGL.glDrawElements(local10, local14, Static642.method8578(local68), local71.method7673() + (long) (arg0 * local68.anInt9051));
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!sfa;Lclient!sfa;FLclient!sfa;)Lclient!sfa;")
	@Override
	public Class22 method7923(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class22 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(IZ)Lclient!ida;")
	@Override
	public Interface10 method5087(@OriginalArg(1) boolean arg0) {
		return new Class272_Sub2(this, Static545.aClass324_13, arg0);
	}

	@OriginalMember(owner = "client!eea", name = "u", descriptor = "(I)V")
	@Override
	protected void method5042() {
		for (@Pc(6) int local6 = super.anInt6151 - 1; local6 >= 0; local6--) {
			OpenGL.glActiveTexture(local6 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(77) float[] local77 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(79) int local79 = 0; local79 < 8; local79++) {
			@Pc(85) int local85 = local79 + 16384;
			OpenGL.glLightfv(local85, 4608, local77, 0);
			OpenGL.glLightf(local85, 4615, 0.0F);
			OpenGL.glLightf(local85, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method5042();
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(III[IZIZ)Lclient!wda;")
	@Override
	public Interface26 method5060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean233 || Static504.method7825(arg2) && Static504.method7825(arg5)) {
			return new Class136_Sub1(this, arg2, arg5, arg4, arg3, 0, arg0);
		} else if (this.aBoolean237) {
			return new Class136_Sub2(this, arg2, arg5, arg3, 0, arg0);
		} else {
			@Pc(47) Class136_Sub1 local47 = new Class136_Sub1(this, Static524.aClass187_15, Static545.aClass324_12, Static347.method5404(arg2), Static347.method5404(arg5));
			local47.method8057(arg5, 0, 0, arg0, arg2, arg3);
			return local47;
		}
	}

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "(B)V")
	@Override
	protected void method5080() {
		if (super.aBoolean462) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!eea", name = "v", descriptor = "()Z")
	@Override
	public boolean method7955() {
		return false;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(Z)V")
	@Override
	public void method7916(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!eea", name = "T", descriptor = "(I)V")
	@Override
	protected void method5122() {
		Static415.aFloatArray66[3] = 1.0F;
		Static415.aFloatArray66[2] = super.aFloat140 * super.aFloat148;
		Static415.aFloatArray66[0] = super.aFloat137 * super.aFloat140;
		Static415.aFloatArray66[1] = super.aFloat140 * super.aFloat147;
		OpenGL.glLightModelfv(2899, Static415.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "(I)V")
	@Override
	protected void method5037() {
		if (super.aBoolean464) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V")
	@Override
	public void method5018() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray52, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!eea", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5053(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!eea", name = "bb", descriptor = "(I)V")
	@Override
	protected void method5145() {
		this.method2406();
	}

	@OriginalMember(owner = "client!eea", name = "O", descriptor = "(I)V")
	@Override
	protected void method5105() {
		super.aFloat145 = super.anInt6127 - super.anInt6137;
		super.aFloat143 = super.aFloat145 - (float) super.anInt6122;
		if ((float) super.anInt6146 > super.aFloat143) {
			super.aFloat143 = super.anInt6146;
		}
		OpenGL.glFogf(2915, super.aFloat143);
		OpenGL.glFogf(2916, super.aFloat145);
		Static415.aFloatArray66[2] = (float) (super.anInt6149 & 0xFF) / 255.0F;
		Static415.aFloatArray66[0] = (float) (super.anInt6149 & 0xFF0000) / 1.671168E7F;
		Static415.aFloatArray66[1] = (float) (super.anInt6149 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static415.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(BI)V")
	public synchronized void method2408(@OriginalArg(1) int arg0) {
		@Pc(13) Class2 local13 = new Class2();
		local13.aLong287 = arg0;
		this.aClass238_20.method5837(local13);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
	@Override
	protected Object method5074(@OriginalArg(0) Canvas arg0) {
		@Pc(14) long local14 = this.anOpenGL1.prepareSurface(arg0);
		if (local14 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local14);
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(II)V")
	@Override
	public void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!caa;II)V")
	@Override
	public void method5148(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		this.aClass272_Sub1Array1[arg1] = (Class272_Sub1) arg0;
	}

	@OriginalMember(owner = "client!eea", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt6075 - arg1 - local12 - 1, arg2, 1, 32993, this.anInt2786, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "()V")
	@Override
	public void method7895() {
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "(II)Lclient!c;")
	@Override
	public Interface2 method7973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!kca;IBI[BI)Lclient!ii;")
	@Override
	public Interface11 method5056(@OriginalArg(0) Class187 arg0, @OriginalArg(4) byte[] arg1) {
		return new Class136_Sub3(this, arg0, 128, 128, 16, arg1);
	}

	@OriginalMember(owner = "client!eea", name = "y", descriptor = "(I)V")
	@Override
	protected void method5058() {
		@Pc(17) int local17 = this.anIntArray201[super.anInt6114];
		if (local17 != 0) {
			this.anIntArray201[super.anInt6114] = 0;
			OpenGL.glBindTexture(local17, 0);
			OpenGL.glDisable(local17);
		}
	}

	@OriginalMember(owner = "client!eea", name = "j", descriptor = "(B)V")
	@Override
	protected void method5048() {
		this.aBoolean228 = false;
		this.method2406();
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "(B)V")
	@Override
	protected void method5026() {
		OpenGL.glMatrixMode(5890);
		if (super.aClass108Array3[super.anInt6114] == Static190.aClass108_25) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass6_Sub2Array3[super.anInt6114].method2715(Static404.aFloatArray4), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)Lclient!vi;")
	@Override
	public Interface25 method7905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}
}
