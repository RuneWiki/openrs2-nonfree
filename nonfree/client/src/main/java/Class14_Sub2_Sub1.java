import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class14_Sub2_Sub1 extends Class14_Sub2 {

	@OriginalMember(owner = "client!el", name = "li", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!el", name = "ah", descriptor = "Lclient!ws;")
	private final Class361 aClass361_14 = new Class361();

	@OriginalMember(owner = "client!el", name = "Kh", descriptor = "Lclient!ws;")
	private final Class361 aClass361_15 = new Class361();

	@OriginalMember(owner = "client!el", name = "ei", descriptor = "Lclient!ws;")
	private final Class361 aClass361_16 = new Class361();

	@OriginalMember(owner = "client!el", name = "hi", descriptor = "Lclient!ws;")
	private final Class361 aClass361_17 = new Class361();

	@OriginalMember(owner = "client!el", name = "ii", descriptor = "Lclient!ws;")
	private final Class361 aClass361_18 = new Class361();

	@OriginalMember(owner = "client!el", name = "ji", descriptor = "Lclient!ws;")
	private final Class361 aClass361_19 = new Class361();

	@OriginalMember(owner = "client!el", name = "ki", descriptor = "Lclient!ws;")
	private final Class361 aClass361_20 = new Class361();

	@OriginalMember(owner = "client!el", name = "mi", descriptor = "Lclient!jaggl/MapBuffer;")
	public final MapBuffer aMapBuffer1 = new MapBuffer();

	@OriginalMember(owner = "client!el", name = "vi", descriptor = "I")
	private final int anInt2780 = 0;

	@OriginalMember(owner = "client!el", name = "si", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!el", name = "Yg", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!el", name = "wi", descriptor = "Ljava/lang/String;")
	private final String aString20;

	@OriginalMember(owner = "client!el", name = "xi", descriptor = "Ljava/lang/String;")
	private final String aString21;

	@OriginalMember(owner = "client!el", name = "ni", descriptor = "I")
	private final int anInt2778;

	@OriginalMember(owner = "client!el", name = "oi", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!el", name = "ui", descriptor = "Z")
	private boolean aBoolean202;

	@OriginalMember(owner = "client!el", name = "pi", descriptor = "Z")
	private final boolean aBoolean199;

	@OriginalMember(owner = "client!el", name = "qi", descriptor = "Z")
	public final boolean aBoolean200;

	@OriginalMember(owner = "client!el", name = "ti", descriptor = "I")
	public final int anInt2779;

	@OriginalMember(owner = "client!el", name = "ri", descriptor = "[I")
	public final int[] anIntArray169;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!e;Lclient!pfa;I)V")
	public Class14_Sub2_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class251 arg4, @OriginalArg(5) int arg5) {
		super(arg1, Long.valueOf(arg2), arg3, arg4, arg5, 1);
		try {
			this.anOpenGL1 = arg0;
			this.anOpenGL1.a();
			this.aString20 = OpenGL.glGetString(7936).toLowerCase();
			this.aString21 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString20.indexOf("microsoft") != -1 || this.aString20.indexOf("brian paul") != -1 || this.aString20.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(104) String local104 = OpenGL.glGetString(7938);
			@Pc(112) String[] local112 = Static115.method2011(' ', local104.replace('.', ' '));
			if (local112.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(128) int local128;
			try {
				@Pc(122) int local122 = Static444.method6313(local112[0]);
				local128 = Static444.method6313(local112[1]);
				this.anInt2778 = local128 + local122 * 10;
			} catch (@Pc(137) NumberFormatException local137) {
				throw new RuntimeException("");
			}
			if (this.anInt2778 < 12) {
				throw new RuntimeException("");
			} else if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			} else if (this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
				@Pc(181) int[] local181 = new int[1];
				OpenGL.glGetIntegerv(34018, local181, 0);
				super.anInt8600 = local181[0];
				if (super.anInt8600 < 2) {
					throw new RuntimeException("");
				}
				super.anInt8616 = 8;
				this.aBoolean198 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
				super.aBoolean612 = this.anOpenGL1.a("GL_ARB_multisample");
				this.aBoolean202 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
				super.aBoolean609 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
				this.aBoolean199 = this.anOpenGL1.a("GL_ARB_texture_non_power_of_two");
				super.aBoolean610 = this.anOpenGL1.a("GL_EXT_texture3D");
				this.anOpenGL1.a("GL_ARB_vertex_shader");
				this.aBoolean200 = this.anOpenGL1.a("GL_ARB_vertex_program");
				this.anOpenGL1.a("GL_ARB_fragment_shader");
				this.anOpenGL1.a("GL_ARB_fragment_program");
				this.anInt2779 = Stream.b() ? 33639 : 5121;
				if (this.aString21.indexOf("radeon") != -1) {
					local128 = 0;
					@Pc(277) boolean local277 = false;
					@Pc(279) boolean local279 = false;
					@Pc(288) String[] local288 = Static115.method2011(' ', this.aString21.replace('/', ' '));
					for (@Pc(290) int local290 = 0; local290 < local288.length; local290++) {
						@Pc(296) String local296 = local288[local290];
						try {
							if (local296.length() > 0) {
								if (local296.charAt(0) == 'x' && local296.length() >= 3 && Static198.method3584(local296.substring(1, 3))) {
									local296 = local296.substring(1);
									local279 = true;
								}
								if (local296.equals("hd")) {
									local277 = true;
								} else {
									if (local296.startsWith("hd")) {
										local296 = local296.substring(2);
										local277 = true;
									}
									if (local296.length() >= 4 && Static198.method3584(local296.substring(0, 4))) {
										local128 = Static444.method6313(local296.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(361) Exception local361) {
						}
					}
					if (!local279 && !local277) {
						if (local128 >= 7000 && local128 <= 9250) {
							super.aBoolean610 = false;
						}
						if (local128 >= 7000 && local128 <= 7999) {
							this.aBoolean198 = false;
						}
					}
					this.aBoolean202 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
				}
				this.aString20.indexOf("intel");
				if (this.aBoolean198) {
					try {
						@Pc(417) int[] local417 = new int[1];
						OpenGL.glGenBuffersARB(1, local417, 0);
					} catch (@Pc(423) Throwable local423) {
						throw new RuntimeException("");
					}
				}
				this.anIntArray169 = new int[super.anInt8600];
				OpenGL.glClear(16640);
				this.anOpenGL1.swapBuffers();
				OpenGL.glClear(16640);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(442) Throwable local442) {
			local442.printStackTrace();
			this.method6839();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILclient!hs;Z)V")
	@Override
	protected void method6965(@OriginalArg(1) int arg0, @OriginalArg(2) Class138 arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, Static511.method7086(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	@Override
	protected void method6997(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(14) Long local14 = (Long) arg1;
		this.anOpenGL1.surfaceResized(local14);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6821(@OriginalArg(0) Class58 arg0) {
	}

	@OriginalMember(owner = "client!el", name = "h", descriptor = "()V")
	@Override
	protected void method6839() {
		super.method6839();
		if (this.anOpenGL1 != null) {
			this.anOpenGL1.b();
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
	}

	@OriginalMember(owner = "client!el", name = "m", descriptor = "(I)V")
	@Override
	protected void method6920() {
		if (super.aBoolean606) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILclient!ii;)V")
	@Override
	public void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) Interface13 arg1) {
	}

	@OriginalMember(owner = "client!el", name = "h", descriptor = "(Z)V")
	@Override
	protected void method6963() {
		OpenGL.glMatrixMode(5890);
		if (Static304.aClass280_7 == super.aClass280Array3[super.anInt8594]) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(super.aClass54_Sub3Array3[super.anInt8594].method5455(Static22.aFloatArray46), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!bf;)V")
	@Override
	public void method6944(@OriginalArg(1) Class28 arg0) {
	}

	@OriginalMember(owner = "client!el", name = "p", descriptor = "(I)V")
	@Override
	protected void method6931() {
		if (super.aBoolean623) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!el", name = "G", descriptor = "(I)V")
	@Override
	protected void method6974() {
		if (super.aBoolean617 && super.aBoolean604 && super.anInt8592 >= 0 | super.aBoolean621) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!el", name = "i", descriptor = "(I)F")
	@Override
	protected float method6914() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!nh;ILclient!jr;I)Lclient!em;")
	@Override
	public Interface6 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(3) Class161 arg2, @OriginalArg(4) int arg3) {
		if (this.aBoolean199 || Static404.method5927(arg3) && Static404.method5927(arg0)) {
			return new Class12_Sub1(this, arg1, arg2, arg3, arg0);
		} else if (this.aBoolean202) {
			return new Class12_Sub4(this, arg1, arg2, arg3, arg0);
		} else {
			return new Class12_Sub1(this, arg1, arg2, Static253.method4296(arg3), Static253.method4296(arg0));
		}
	}

	@OriginalMember(owner = "client!el", name = "r", descriptor = "()V")
	@Override
	public void method6858() {
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6983(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!el", name = "y", descriptor = "(I)V")
	@Override
	protected void method6953() {
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZLclient!nh;I[FII)Lclient!em;")
	@Override
	protected Interface6 method6975(@OriginalArg(2) boolean arg0, @OriginalArg(3) Class219 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float[] arg3, @OriginalArg(7) int arg4) {
		if (this.aBoolean199 || Static404.method5927(arg4) && Static404.method5927(arg2)) {
			return new Class12_Sub1(this, arg1, arg4, arg2, arg0, arg3, 0, 0);
		} else if (this.aBoolean202) {
			return new Class12_Sub4(this, arg1, arg4, arg2, arg3, 0, 0);
		} else {
			@Pc(39) Class12_Sub1 local39 = new Class12_Sub1(this, arg1, Static239.aClass161_16, Static253.method4296(arg4), Static253.method4296(arg2));
			local39.method321(arg2, arg3, arg1, arg4);
			return local39;
		}
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(B)V")
	@Override
	protected void method6915() {
		OpenGL.glActiveTexture(super.anInt8594 + 33984);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBIIILclient!sv;Lclient!vl;)V")
	@Override
	public void method7026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class311 arg4, @OriginalArg(6) Interface23 arg5) {
		@Pc(14) byte local14;
		@Pc(12) int local12;
		if (Static98.aClass311_1 == arg4) {
			local12 = arg3 * 2;
			local14 = 1;
		} else if (Static572.aClass311_8 == arg4) {
			local12 = arg3 + 1;
			local14 = 3;
		} else if (Static181.aClass311_4 == arg4) {
			local14 = 4;
			local12 = arg3 * 3;
		} else if (Static232.aClass311_6 == arg4) {
			local12 = arg3 + 2;
			local14 = 6;
		} else if (arg4 == Static281.aClass311_5) {
			local14 = 5;
			local12 = arg3 + 2;
		} else {
			local12 = arg3;
			local14 = 0;
		}
		@Pc(76) Class161 local76 = arg5.method4097();
		@Pc(79) Class76_Sub2 local79 = (Class76_Sub2) arg5;
		local79.method4090();
		OpenGL.glDrawElements(local14, local12, Static148.method2863(local76), local79.method4093() + (long) (local76.anInt4850 * arg0));
	}

	@OriginalMember(owner = "client!el", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!el", name = "g", descriptor = "(B)V")
	@Override
	protected void method6943() {
		OpenGL.glTexEnvi(8960, 34162, Static582.method7724(super.aClass228Array5[super.anInt8594]));
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II[BBILclient!nh;)Lclient!ht;")
	@Override
	public Interface11 method6908(@OriginalArg(2) byte[] arg0, @OriginalArg(5) Class219 arg1) {
		return new Class12_Sub3(this, arg1, 128, 128, 16, arg0);
	}

	@OriginalMember(owner = "client!el", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		return this.anInt2780;
	}

	@OriginalMember(owner = "client!el", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, super.anInt8558 - local12 - arg1 - 1, arg2, 1, 32993, this.anInt2779, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(BZ)Lclient!vl;")
	@Override
	public Interface23 method7005(@OriginalArg(1) boolean arg0) {
		return new Class76_Sub2(this, Static239.aClass161_13, arg0);
	}

	@OriginalMember(owner = "client!el", name = "r", descriptor = "(I)V")
	@Override
	protected void method6937() {
		if (super.aBoolean608) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!el", name = "o", descriptor = "(B)V")
	@Override
	protected void method6990() {
		OpenGL.glViewport(super.anInt8610, super.anInt8593, super.anInt8422, super.anInt8558);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZIIILclient!nh;[BI)Lclient!em;")
	@Override
	protected Interface6 method7036(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class219 arg3, @OriginalArg(6) byte[] arg4) {
		if (this.aBoolean199 || Static404.method5927(arg2) && Static404.method5927(arg1)) {
			return new Class12_Sub1(this, arg3, arg2, arg1, arg0, arg4, 0, 0);
		} else if (this.aBoolean202) {
			return new Class12_Sub4(this, arg3, arg2, arg1, arg4, 0, 0);
		} else {
			@Pc(38) Class12_Sub1 local38 = new Class12_Sub1(this, arg3, Static239.aClass161_12, Static253.method4296(arg2), Static253.method4296(arg1));
			local38.method7602(arg2, arg1, arg3, 0, arg4);
			return local38;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	@Override
	protected void method6995(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1) {
		@Pc(15) Long local15 = (Long) arg1;
		this.anOpenGL1.releaseSurface(arg0, local15);
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6897(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class6_Sub35 local19;
		while (!this.aClass361_15.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_15.method7835();
			Static20.anIntArray37[local7++] = (int) local19.aLong263;
			super.anInt8573 -= local19.anInt6119;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static20.anIntArray37, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static20.anIntArray37, 0);
			local7 = 0;
		}
		while (!this.aClass361_16.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_16.method7835();
			Static20.anIntArray37[local7++] = (int) local19.aLong263;
			super.anInt8577 -= local19.anInt6119;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static20.anIntArray37, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static20.anIntArray37, 0);
			local7 = 0;
		}
		while (!this.aClass361_17.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_17.method7835();
			Static20.anIntArray37[local7++] = local19.anInt6119;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static20.anIntArray37, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static20.anIntArray37, 0);
			local7 = 0;
		}
		while (!this.aClass361_18.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_18.method7835();
			Static20.anIntArray37[local7++] = (int) local19.aLong263;
			super.anInt8576 -= local19.anInt6119;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static20.anIntArray37, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static20.anIntArray37, 0);
		}
		while (!this.aClass361_14.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_14.method7835();
			OpenGL.glDeleteLists((int) local19.aLong263, local19.anInt6119);
		}
		@Pc(218) Class6 local218;
		while (!this.aClass361_19.method7837()) {
			local218 = this.aClass361_19.method7835();
			OpenGL.glDeleteProgramARB((int) local218.aLong263);
		}
		while (!this.aClass361_20.method7837()) {
			local218 = this.aClass361_20.method7835();
			OpenGL.glDeleteObjectARB(local218.aLong263);
		}
		while (!this.aClass361_14.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_14.method7835();
			OpenGL.glDeleteLists((int) local19.aLong263, local19.anInt6119);
		}
		if (this.v() > 100663296 && Static8.method201() > this.aLong69 + 60000L) {
			System.gc();
			this.aLong69 = Static8.method201();
		}
		super.method6897(local11);
	}

	@OriginalMember(owner = "client!el", name = "g", descriptor = "(II)Lclient!ho;")
	@Override
	protected Class22 method7007(@OriginalArg(0) int arg0) {
		if (arg0 == 3) {
			return new Class22_Sub1(this, super.aClass251_118);
		} else if (arg0 == 4) {
			return new Class22_Sub5(this, super.aClass251_118, super.aClass315_5);
		} else {
			return super.method7007(arg0);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III[IZII)Lclient!em;")
	@Override
	public Interface6 method6962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aBoolean199 || Static404.method5927(arg1) && Static404.method5927(arg0)) {
			return new Class12_Sub1(this, arg1, arg0, arg3, arg2, 0, arg4);
		} else if (this.aBoolean202) {
			return new Class12_Sub4(this, arg1, arg0, arg2, 0, arg4);
		} else {
			@Pc(47) Class12_Sub1 local47 = new Class12_Sub1(this, Static122.aClass219_7, Static239.aClass161_12, Static253.method4296(arg1), Static253.method4296(arg0));
			local47.method7603(arg2, arg0, arg1, 0, arg4, 0);
			return local47;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!nh;Lclient!jr;)Z")
	@Override
	public boolean method6989(@OriginalArg(1) Class219 arg0, @OriginalArg(2) Class161 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6848();
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(III)V")
	public synchronized void method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub35 local8 = new Class6_Sub35(arg0);
		local8.aLong263 = arg1;
		this.aClass361_15.method7833(local8);
	}

	@OriginalMember(owner = "client!el", name = "C", descriptor = "(B)V")
	private void method2476() {
		if (this.aBoolean201) {
			OpenGL.glPopMatrix();
		}
		if (super.aClass340_9.method7416()) {
			if (!this.aBoolean201) {
				OpenGL.glLoadIdentity();
				OpenGL.glMultMatrixf(super.aClass54_Sub3_18.method5455(Static22.aFloatArray46), 0);
				this.method7006();
				this.method6927();
				this.aBoolean201 = true;
			}
			if (this.aBoolean201) {
				OpenGL.glPushMatrix();
			}
			if (!super.aBoolean603) {
				OpenGL.glMultMatrixf(super.aClass54_Sub3_15.method5455(Static22.aFloatArray46), 0);
				return;
			}
		} else if (super.aBoolean603) {
			OpenGL.glLoadIdentity();
			this.aBoolean201 = false;
		} else {
			OpenGL.glLoadMatrixf(super.aClass54_Sub3_15.method5455(Static22.aFloatArray46), 0);
			this.aBoolean201 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!el", name = "O", descriptor = "(I)V")
	@Override
	protected void method7009() {
		OpenGL.glScissor(super.anInt8610 + super.anInt8614, -super.anInt8615 + super.anInt8558 + super.anInt8593, super.anInt8611 - super.anInt8614, super.anInt8615 + -super.anInt8596);
	}

	@OriginalMember(owner = "client!el", name = "B", descriptor = "()V")
	@Override
	public void method6892() {
		this.method6906(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(III)V")
	public synchronized void method2477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub35 local8 = new Class6_Sub35(arg0);
		local8.aLong263 = arg1;
		this.aClass361_16.method7833(local8);
	}

	@OriginalMember(owner = "client!el", name = "t", descriptor = "()Lclient!taa;")
	@Override
	public Class312 method6871() {
		@Pc(7) int local7 = -1;
		if (this.aString20.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString20.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString20.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class312(local7, "OpenGL", this.anInt2778, this.aString21, 0L);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)Lclient!ii;")
	@Override
	public Interface13 method7004(@OriginalArg(1) boolean arg0) {
		return new Class76_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V")
	@Override
	public void method6909(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!el", name = "A", descriptor = "()V")
	@Override
	public void method6890() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
	@Override
	protected void method6922(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1) {
		@Pc(12) Long local12 = (Long) arg0;
		if (!this.anOpenGL1.setSurface(local12)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!sv;II)V")
	@Override
	public void method6991(@OriginalArg(1) Class311 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte local10;
		@Pc(14) int local14;
		if (arg0 == Static98.aClass311_1) {
			local10 = 1;
			local14 = arg1 * 2;
		} else if (Static572.aClass311_8 == arg0) {
			local10 = 3;
			local14 = arg1 + 1;
		} else if (Static181.aClass311_4 == arg0) {
			local10 = 4;
			local14 = arg1 * 3;
		} else if (arg0 == Static232.aClass311_6) {
			local10 = 6;
			local14 = arg1 + 2;
		} else if (Static281.aClass311_5 == arg0) {
			local10 = 5;
			local14 = arg1 + 2;
		} else {
			local10 = 0;
			local14 = arg1;
		}
		OpenGL.glDrawArrays(local10, arg2, local14);
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!el", name = "n", descriptor = "(I)V")
	@Override
	protected void method6926() {
		Static16.aFloatArray2[2] = super.aFloat170 * super.aFloat176;
		Static16.aFloatArray2[3] = 1.0F;
		Static16.aFloatArray2[1] = super.aFloat176 * super.aFloat172;
		Static16.aFloatArray2[0] = super.aFloat176 * super.aFloat182;
		OpenGL.glLightModelfv(2899, Static16.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!el", name = "A", descriptor = "(B)V")
	@Override
	protected void method7037() {
		Static16.aFloatArray2[3] = 1.0F;
		Static16.aFloatArray2[0] = super.aFloat167 * super.aFloat182;
		Static16.aFloatArray2[1] = super.aFloat172 * super.aFloat167;
		Static16.aFloatArray2[2] = super.aFloat170 * super.aFloat167;
		OpenGL.glLightfv(16384, 4609, Static16.aFloatArray2, 0);
		Static16.aFloatArray2[0] = -super.aFloat178 * super.aFloat182;
		Static16.aFloatArray2[2] = super.aFloat170 * -super.aFloat178;
		Static16.aFloatArray2[3] = 1.0F;
		Static16.aFloatArray2[1] = super.aFloat172 * -super.aFloat178;
		OpenGL.glLightfv(16385, 4609, Static16.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!el", name = "z", descriptor = "(I)V")
	@Override
	protected void method6958() {
		this.method2476();
	}

	@OriginalMember(owner = "client!el", name = "o", descriptor = "(I)V")
	@Override
	protected void method6927() {
		@Pc(7) int local7;
		for (local7 = 0; super.anInt8607 > local7; local7++) {
			@Pc(14) Class6_Sub7 local14 = super.aClass6_Sub7Array5[local7];
			@Pc(18) int local18 = local14.method4288();
			@Pc(22) int local22 = local7 + 16386;
			@Pc(28) float local28 = local14.method4284() / 255.0F;
			Static16.aFloatArray2[0] = local14.method4292();
			Static16.aFloatArray2[1] = local14.method4291();
			Static16.aFloatArray2[2] = local14.method4286();
			Static16.aFloatArray2[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static16.aFloatArray2, 0);
			Static16.aFloatArray2[2] = (float) (local18 & 0xFF) * local28;
			Static16.aFloatArray2[1] = (float) (local18 >> 8 & 0xFF) * local28;
			Static16.aFloatArray2[3] = 1.0F;
			Static16.aFloatArray2[0] = local28 * (float) (local18 >> 16 & 0xFF);
			OpenGL.glLightfv(local22, 4609, Static16.aFloatArray2, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local14.method4283() * local14.method4283()));
			OpenGL.glEnable(local22);
		}
		while (local7 < super.anInt8598) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		super.method6927();
	}

	@OriginalMember(owner = "client!el", name = "o", descriptor = "()V")
	@Override
	public void method6848() throws Exception_Sub1 {
		this.anOpenGL1.swapBuffers();
	}

	@OriginalMember(owner = "client!el", name = "s", descriptor = "(I)V")
	@Override
	protected void method6938() {
		if (super.aClass68_5 == Static593.aClass68_7) {
			OpenGL.glBlendFunc(770, 771);
		} else if (Static292.aClass68_3 == super.aClass68_5) {
			OpenGL.glBlendFunc(1, 1);
		} else if (super.aClass68_5 == Static519.aClass68_6) {
			OpenGL.glBlendFunc(774, 1);
			return;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!nba;Z)V")
	@Override
	public void method6946(@OriginalArg(0) Class215 arg0) {
		if (arg0 == Static458.aClass215_4) {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			return;
		}
		@Pc(20) int local20 = Static289.method4661(arg0);
		OpenGL.glTexGeni(8192, 9472, local20);
		OpenGL.glEnable(3168);
		OpenGL.glTexGeni(8193, 9472, local20);
		OpenGL.glEnable(3169);
		OpenGL.glTexGeni(8194, 9472, local20);
		OpenGL.glEnable(3170);
	}

	@OriginalMember(owner = "client!el", name = "C", descriptor = "(I)V")
	@Override
	protected void method6971() {
		if (super.aBoolean620 && !super.aBoolean607) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ip;Lclient!ip;FLclient!ip;)Lclient!ip;")
	@Override
	public Class26 method6870(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class26 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!el", name = "m", descriptor = "()Z")
	@Override
	public boolean method6846() {
		return false;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLclient!hs;ZII)V")
	@Override
	public void method6996(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		OpenGL.glTexEnvi(8960, arg3 + 34176, Static511.method7086(arg1));
		if (arg0) {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg3 + 34192, arg2 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!el", name = "h", descriptor = "(I)V")
	@Override
	protected void method6911() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(super.aFloatArray66, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(Z)V")
	@Override
	protected void method6948() {
		OpenGL.glDepthMask(super.aBoolean622 && super.aBoolean618);
	}

	@OriginalMember(owner = "client!el", name = "h", descriptor = "(II)V")
	public synchronized void method2481(@OriginalArg(1) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong263 = arg0;
		this.aClass361_19.method7833(local7);
	}

	@OriginalMember(owner = "client!el", name = "H", descriptor = "(I)V")
	@Override
	protected void method6979() {
		OpenGL.glTexEnvi(8960, 34161, Static582.method7724(super.aClass228Array6[super.anInt8594]));
	}

	@OriginalMember(owner = "client!el", name = "z", descriptor = "()Z")
	@Override
	public boolean method6887() {
		return false;
	}

	@OriginalMember(owner = "client!el", name = "j", descriptor = "(B)V")
	@Override
	protected void method6964() {
		if (super.aBoolean605) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
	}

	@OriginalMember(owner = "client!el", name = "A", descriptor = "(I)V")
	@Override
	protected void method6961() {
		this.method2476();
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "()V")
	@Override
	public void method6834() {
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
	@Override
	protected void method6910() {
		@Pc(20) int local20;
		if (super.aBoolean621) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local20 = super.anInt8601;
		} else {
			super.aFloat179 = super.anInt8618 - super.anInt8590;
			super.aFloat185 = super.aFloat179 - (float) super.anInt8592;
			if ((float) super.anInt8584 > super.aFloat185) {
				super.aFloat185 = super.anInt8584;
			}
			OpenGL.glFogf(2915, super.aFloat185);
			OpenGL.glFogf(2916, super.aFloat179);
			local20 = super.anInt8585;
		}
		Static16.aFloatArray2[1] = (float) (local20 & 0xFF00) / 65280.0F;
		Static16.aFloatArray2[0] = (float) (local20 & 0xFF0000) / 1.671168E7F;
		Static16.aFloatArray2[2] = (float) (local20 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static16.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!el", name = "w", descriptor = "()V")
	@Override
	public void method6881() {
	}

	@OriginalMember(owner = "client!el", name = "v", descriptor = "(I)V")
	@Override
	protected void method6949() {
		Static16.aFloatArray2[2] = (float) (super.anInt8613 & 0xFF) / 255.0F;
		Static16.aFloatArray2[0] = (float) (super.anInt8613 & 0xFF0000) / 1.671168E7F;
		Static16.aFloatArray2[3] = (float) (super.anInt8613 >>> 24) / 255.0F;
		Static16.aFloatArray2[1] = (float) (super.anInt8613 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static16.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!el", name = "h", descriptor = "(B)V")
	@Override
	protected void method6955() {
		@Pc(15) int local15 = this.anIntArray169[super.anInt8594];
		if (local15 != 0) {
			this.anIntArray169[super.anInt8594] = 0;
			OpenGL.glBindTexture(local15, 0);
			OpenGL.glDisable(local15);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([Lclient!oc;B)Lclient!bf;")
	@Override
	public Class28 method7000(@OriginalArg(0) Class231[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!el", name = "k", descriptor = "(I)V")
	@Override
	protected void method6917() {
		for (@Pc(10) int local10 = super.anInt8600 - 1; local10 >= 0; local10--) {
			OpenGL.glActiveTexture(local10 + 33984);
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
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(71) float[] local71 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(73) int local73 = 0; local73 < 8; local73++) {
			@Pc(79) int local79 = local73 + 16384;
			OpenGL.glLightfv(local79, 4608, local71, 0);
			OpenGL.glLightf(local79, 4615, 0.0F);
			OpenGL.glLightf(local79, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL1.setSwapInterval(0);
		super.method6917();
	}

	@OriginalMember(owner = "client!el", name = "s", descriptor = "(B)V")
	@Override
	public void method7006() {
		OpenGL.glLightfv(16384, 4611, super.aFloatArray62, 0);
		OpenGL.glLightfv(16385, 4611, super.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!el", name = "R", descriptor = "(I)V")
	@Override
	protected void method7014() {
		if (super.aBoolean616) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	@Override
	protected Object method6976(@OriginalArg(1) Canvas arg0) {
		@Pc(8) long local8 = this.anOpenGL1.prepareSurface(arg0);
		if (local8 == -1L) {
			throw new RuntimeException();
		}
		return Long.valueOf(local8);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II[[IZ)Lclient!qca;")
	@Override
	public Interface19 method6932(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) boolean arg2) {
		return new Class12_Sub2(this, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!el", name = "l", descriptor = "()V")
	@Override
	public void method6843() {
		if (super.anInt8422 <= 0 && super.anInt8558 <= 0) {
			return;
		}
		@Pc(13) int local13 = super.anInt8614;
		@Pc(16) int local16 = super.anInt8611;
		@Pc(19) int local19 = super.anInt8596;
		@Pc(22) int local22 = super.anInt8615;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6942();
		this.method6966(false);
		this.method6947(false);
		this.method7028(false);
		this.method6906(false);
		this.method7034(null);
		this.method6981(false, -2, false);
		this.method7011(1);
		this.method6998(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, super.anInt8422, super.anInt8558, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local13, local19, local16, local22);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!jr;Lclient!nh;)Z")
	@Override
	public boolean method6924(@OriginalArg(1) Class161 arg0, @OriginalArg(2) Class219 arg1) {
		return true;
	}
}
