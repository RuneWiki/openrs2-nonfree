import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class177 {

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "Z")
	private boolean aBoolean349;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "Lclient!bca;")
	private Class32_Sub1 aClass32_Sub1_3;

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "Lclient!vq;")
	private Class5_Sub5_Sub20 aClass5_Sub5_Sub20_1;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "Lclient!vq;")
	private Class5_Sub5_Sub20 aClass5_Sub5_Sub20_2;

	@OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
	private int anInt4514 = 1;

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
	private int anInt4507 = 0;

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "I")
	private int anInt4513 = 1;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
	private int anInt4519 = 0;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Lclient!ef;")
	private final Class102 aClass102_33 = new Class102();

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
	private int anInt4520 = 0;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "[Lclient!bca;")
	private Class32_Sub1[] aClass32_Sub1Array3 = new Class32_Sub1[2];

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
	private int anInt4521 = -1;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "Z")
	private boolean aBoolean353 = true;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "Z")
	private boolean aBoolean350 = true;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "Z")
	private boolean aBoolean351 = false;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "Z")
	private boolean aBoolean352 = true;

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "Z")
	private boolean aBoolean354 = true;

	@OriginalMember(owner = "client!ip", name = "F", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_15;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "Lclient!ct;")
	private Class76 aClass76_4;

	@OriginalMember(owner = "client!ip", name = "E", descriptor = "Lclient!ct;")
	private Class76 aClass76_5;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "Lclient!ct;")
	private Class76 aClass76_3;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class177(@OriginalArg(0) Class57_Sub2 arg0) {
		this.aClass57_Sub2_15 = arg0;
		if (this.aClass57_Sub2_15.aBoolean234 && this.aClass57_Sub2_15.aBoolean231) {
			this.aClass76_5 = this.aClass76_4 = new Class76(this.aClass57_Sub2_15);
			if (this.aClass57_Sub2_15.anInt2741 > 1 && this.aClass57_Sub2_15.aBoolean214 && this.aClass57_Sub2_15.aBoolean219) {
				this.aClass76_5 = this.aClass76_3 = new Class76(this.aClass57_Sub2_15);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!vw;)Z")
	public boolean method3832(@OriginalArg(1) Class5_Sub34 arg0) {
		if (this.aClass76_5 != null) {
			if (arg0.method5104() || arg0.method5098()) {
				this.aClass102_33.method1921(arg0);
				this.method3836();
				if (this.method3840()) {
					if (this.anInt4513 != -1 && this.anInt4514 != -1) {
						arg0.method5100(this.anInt4514, this.anInt4513);
					}
					arg0.aBoolean448 = true;
					return true;
				}
			}
			this.method3837(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIBI)Z")
	public boolean method3833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass76_5 == null || this.aClass102_33.method1926()) {
			return false;
		}
		if (arg2 != this.anInt4513 || arg3 != this.anInt4514) {
			this.anInt4514 = arg3;
			this.anInt4513 = arg2;
			for (@Pc(53) Class5 local53 = this.aClass102_33.method1916(); local53 != this.aClass102_33.aClass5_61; local53 = local53.aClass5_338) {
				((Class5_Sub34) local53).method5100(this.anInt4514, this.anInt4513);
			}
			this.aBoolean353 = true;
			this.aBoolean354 = true;
			this.aBoolean352 = true;
		}
		if (!this.method3840()) {
			return false;
		}
		this.anInt4519 = arg1;
		this.aBoolean349 = true;
		this.anInt4507 = arg0;
		this.aClass57_Sub2_15.method2384(this.aClass76_5);
		this.aClass76_5.method1340(0);
		this.aClass57_Sub2_15.method2361(this.anInt4507 + this.anInt4514 - this.aClass57_Sub2_15.anInt2598, -this.anInt4519);
		return true;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	public void method3834() {
		this.aClass32_Sub1_3 = null;
		this.aClass5_Sub5_Sub20_1 = null;
		this.aClass32_Sub1Array3 = null;
		this.aClass5_Sub5_Sub20_2 = null;
		this.aClass76_5 = this.aClass76_3 = this.aClass76_4 = null;
		if (!this.aClass102_33.method1926()) {
			for (@Pc(46) Class5 local46 = this.aClass102_33.method1916(); local46 != this.aClass102_33.aClass5_61; local46 = local46.aClass5_338) {
				((Class5_Sub34) local46).method5101();
			}
		}
		this.anInt4513 = this.anInt4514 = 1;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)Z")
	public boolean method3835() {
		return this.aClass76_5 != null;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
	private void method3836() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(17) Class5_Sub34 local17 = (Class5_Sub34) this.aClass102_33.method1916(); local17 != null; local17 = (Class5_Sub34) this.aClass102_33.method1915()) {
			local25 = local17.method5099();
			if (local9 < local25) {
				local9 = local25;
			}
			local11 += local17.method5106();
			local7 |= local17.method5097();
		}
		if (local9 == 2) {
			local25 = 34836;
		} else if (local9 == 1) {
			local25 = 34842;
		} else {
			local25 = 6408;
		}
		if (local25 != this.anInt4521) {
			this.anInt4521 = local25;
			this.aBoolean352 = true;
		}
		@Pc(106) int local106 = this.anInt4520 <= 2 ? this.anInt4520 : 2;
		@Pc(116) int local116 = local11 <= 2 ? local11 : 2;
		this.anInt4520 = local11;
		if (this.aBoolean351 != local7) {
			this.aBoolean353 = true;
			this.aBoolean351 = local7;
		}
		if (local106 != local116) {
			this.aBoolean354 = this.aBoolean352 = true;
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(ILclient!vw;)V")
	public void method3837(@OriginalArg(1) Class5_Sub34 arg0) {
		arg0.aBoolean448 = false;
		arg0.method5101();
		arg0.method9327(1);
		this.method3836();
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)Z")
	private boolean method3840() {
		if (this.aBoolean353) {
			if (this.aClass5_Sub5_Sub20_2 != null) {
				this.aClass5_Sub5_Sub20_2.method8970();
				this.aClass5_Sub5_Sub20_2 = null;
			}
			if (this.aClass32_Sub1_3 != null) {
				this.aClass32_Sub1_3.method8429();
				this.aClass32_Sub1_3 = null;
			}
			if (this.aClass76_3 != null) {
				this.aClass5_Sub5_Sub20_2 = new Class5_Sub5_Sub20(this.aClass57_Sub2_15, 6402, this.anInt4513, this.anInt4514, this.aClass57_Sub2_15.anInt2741);
			}
			if (this.aBoolean351) {
				this.aClass32_Sub1_3 = new Class32_Sub1(this.aClass57_Sub2_15, 34037, 6402, this.anInt4513, this.anInt4514);
			} else if (this.aClass5_Sub5_Sub20_2 == null) {
				this.aClass5_Sub5_Sub20_2 = new Class5_Sub5_Sub20(this.aClass57_Sub2_15, 6402, this.anInt4513, this.anInt4514);
			}
			this.aBoolean353 = false;
			this.aBoolean354 = true;
			this.aBoolean350 = true;
		}
		if (this.aBoolean352) {
			if (this.aClass5_Sub5_Sub20_1 != null) {
				this.aClass5_Sub5_Sub20_1.method8970();
				this.aClass5_Sub5_Sub20_1 = null;
			}
			if (this.aClass32_Sub1Array3[0] != null) {
				this.aClass32_Sub1Array3[0].method8429();
				this.aClass32_Sub1Array3[0] = null;
			}
			if (this.aClass32_Sub1Array3[1] != null) {
				this.aClass32_Sub1Array3[1].method8429();
				this.aClass32_Sub1Array3[1] = null;
			}
			if (this.aClass76_3 != null) {
				this.aClass5_Sub5_Sub20_1 = new Class5_Sub5_Sub20(this.aClass57_Sub2_15, this.anInt4521, this.anInt4513, this.anInt4514, this.aClass57_Sub2_15.anInt2741);
			}
			this.aClass32_Sub1Array3[0] = new Class32_Sub1(this.aClass57_Sub2_15, 34037, this.anInt4521, this.anInt4513, this.anInt4514);
			this.aClass32_Sub1Array3[1] = this.anInt4520 <= 1 ? null : new Class32_Sub1(this.aClass57_Sub2_15, 34037, this.anInt4521, this.anInt4513, this.anInt4514);
			this.aBoolean352 = false;
			this.aBoolean354 = true;
			this.aBoolean350 = true;
		}
		if (this.aBoolean354) {
			if (this.aClass76_3 == null) {
				this.aClass57_Sub2_15.method2384(this.aClass76_4);
				this.aClass76_4.method1338(0);
				this.aClass76_4.method1338(1);
				this.aClass76_4.method1338(8);
				this.aClass76_4.method1342(0, this.aClass32_Sub1Array3[0]);
				if (this.anInt4520 > 1) {
					this.aClass76_4.method1342(1, this.aClass32_Sub1Array3[1]);
				}
				if (this.aBoolean351) {
					this.aClass76_4.method1342(8, this.aClass32_Sub1_3);
				} else {
					this.aClass76_4.method1347(8, this.aClass5_Sub5_Sub20_2);
				}
				this.aClass57_Sub2_15.method2375(this.aClass76_4);
			} else {
				this.aClass57_Sub2_15.method2384(this.aClass76_4);
				this.aClass76_4.method1338(0);
				this.aClass76_4.method1338(1);
				this.aClass76_4.method1338(8);
				this.aClass76_4.method1342(0, this.aClass32_Sub1Array3[0]);
				if (this.anInt4520 > 1) {
					this.aClass76_4.method1342(1, this.aClass32_Sub1Array3[1]);
				}
				if (this.aBoolean351) {
					this.aClass76_4.method1342(8, this.aClass32_Sub1_3);
				}
				this.aClass57_Sub2_15.method2375(this.aClass76_4);
				this.aClass57_Sub2_15.method2384(this.aClass76_3);
				this.aClass76_3.method1338(0);
				this.aClass76_3.method1338(8);
				this.aClass76_3.method1347(0, this.aClass5_Sub5_Sub20_1);
				this.aClass76_3.method1347(8, this.aClass5_Sub5_Sub20_2);
				this.aClass57_Sub2_15.method2375(this.aClass76_3);
			}
			this.aBoolean354 = false;
			this.aBoolean350 = true;
		}
		if (this.aBoolean350) {
			this.aClass57_Sub2_15.method2384(this.aClass76_5);
			this.aBoolean350 = !this.aClass76_5.method1346();
			this.aClass57_Sub2_15.method2375(this.aClass76_5);
		}
		return !this.aBoolean350;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	public void method3841() {
		if (!this.aBoolean349) {
			return;
		}
		if (this.aClass76_3 != null) {
			this.aClass57_Sub2_15.method2387(this.aClass76_3);
			@Pc(26) short local26 = 16384;
			this.aClass57_Sub2_15.method2373(this.aClass76_4);
			this.aClass76_3.method1337();
			this.aClass76_4.method1340(0);
			if (this.aBoolean351) {
				local26 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4513, this.anInt4514, 0, 0, this.anInt4513, this.anInt4514, local26, 9728);
			this.aClass57_Sub2_15.method2365(this.aClass76_3);
			this.aClass57_Sub2_15.method2339(this.aClass76_4);
		}
		this.aClass57_Sub2_15.method2320();
		this.aClass57_Sub2_15.method2372(0);
		this.aClass57_Sub2_15.method2382(1);
		this.aClass57_Sub2_15.la();
		@Pc(99) int local99 = 0;
		@Pc(101) int local101 = 1;
		@Pc(119) Class5_Sub34 local119;
		for (@Pc(107) Class5_Sub34 local107 = (Class5_Sub34) this.aClass102_33.method1916(); local107 != null; local107 = local119) {
			local119 = (Class5_Sub34) this.aClass102_33.method1915();
			@Pc(123) int local123 = local107.method5106();
			for (@Pc(125) int local125 = 0; local125 < local123; local125++) {
				local107.method5096(this.aClass32_Sub1Array3[local99], local125, this.aClass32_Sub1_3);
				if (local119 == null && local123 - 1 == local125) {
					this.aClass57_Sub2_15.method2375(this.aClass76_4);
					this.aClass57_Sub2_15.method2361(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4514);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4519, this.anInt4507);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4519, this.anInt4507 + this.anInt4514);
					OpenGL.glTexCoord2f((float) this.anInt4513, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4519 + this.anInt4513, this.anInt4514 + this.anInt4507);
					OpenGL.glTexCoord2f((float) this.anInt4513, (float) this.anInt4514);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4519 + this.anInt4513, this.anInt4507);
					OpenGL.glEnd();
				} else {
					this.aClass76_4.method1340(local101);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4514);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt4514);
					OpenGL.glTexCoord2f((float) this.anInt4513, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4513, this.anInt4514);
					OpenGL.glTexCoord2f((float) this.anInt4513, (float) this.anInt4514);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4513, 0);
					OpenGL.glEnd();
				}
				local101 = local101 + 1 & 0x1;
				local99 = local99 + 1 & 0x1;
				local107.method5103(local125);
			}
		}
		this.aBoolean349 = false;
	}
}
