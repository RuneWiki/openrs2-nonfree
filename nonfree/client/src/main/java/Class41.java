import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class41 {

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "Z")
	private boolean aBoolean113;

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "Lclient!ht;")
	private Class3_Sub3_Sub12 aClass3_Sub3_Sub12_1;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "Lclient!db;")
	private Class34_Sub2 aClass34_Sub2_1;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "Lclient!ht;")
	private Class3_Sub3_Sub12 aClass3_Sub3_Sub12_2;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	private int anInt1446 = 1;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	private int anInt1448 = 0;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	private int anInt1455 = 1;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
	private int anInt1458 = 0;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!hga;")
	private final Class130 aClass130_7 = new Class130();

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "Z")
	private boolean aBoolean115 = true;

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "[Lclient!db;")
	private Class34_Sub2[] aClass34_Sub2Array1 = new Class34_Sub2[2];

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "Z")
	private boolean aBoolean117 = true;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Z")
	private boolean aBoolean116 = true;

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "Z")
	private boolean aBoolean118 = true;

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
	private int anInt1460 = -1;

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
	private int anInt1459 = 0;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_6;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!rq;")
	private Class293 aClass293_3;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!rq;")
	private Class293 aClass293_1;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!rq;")
	private Class293 aClass293_2;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class41(@OriginalArg(0) Class43_Sub3 arg0) {
		this.aClass43_Sub3_6 = arg0;
		if (this.aClass43_Sub3_6.aBoolean676 && this.aClass43_Sub3_6.aBoolean667) {
			this.aClass293_1 = this.aClass293_3 = new Class293(this.aClass43_Sub3_6);
			if (this.aClass43_Sub3_6.anInt8727 > 1 && this.aClass43_Sub3_6.aBoolean678 && this.aClass43_Sub3_6.aBoolean680) {
				this.aClass293_1 = this.aClass293_2 = new Class293(this.aClass43_Sub3_6);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public void method1140() {
		this.aClass3_Sub3_Sub12_2 = null;
		this.aClass34_Sub2Array1 = null;
		this.aClass3_Sub3_Sub12_1 = null;
		this.aClass293_1 = this.aClass293_2 = this.aClass293_3 = null;
		this.aClass34_Sub2_1 = null;
		if (!this.aClass130_7.method3542()) {
			for (@Pc(42) Class3 local42 = this.aClass130_7.method3543(); local42 != this.aClass130_7.aClass3_121; local42 = local42.aClass3_285) {
				((Class3_Sub18) local42).method5743();
			}
		}
		this.anInt1446 = this.anInt1455 = 1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Z")
	private boolean method1141() {
		if (this.aBoolean118) {
			if (this.aClass3_Sub3_Sub12_1 != null) {
				this.aClass3_Sub3_Sub12_1.method3697();
				this.aClass3_Sub3_Sub12_1 = null;
			}
			if (this.aClass34_Sub2_1 != null) {
				this.aClass34_Sub2_1.method4973();
				this.aClass34_Sub2_1 = null;
			}
			if (this.aClass293_2 != null) {
				this.aClass3_Sub3_Sub12_1 = new Class3_Sub3_Sub12(this.aClass43_Sub3_6, 6402, this.anInt1446, this.anInt1455, this.aClass43_Sub3_6.anInt8727);
			}
			if (this.aBoolean114) {
				this.aClass34_Sub2_1 = new Class34_Sub2(this.aClass43_Sub3_6, 34037, 6402, this.anInt1446, this.anInt1455);
			} else if (this.aClass3_Sub3_Sub12_1 == null) {
				this.aClass3_Sub3_Sub12_1 = new Class3_Sub3_Sub12(this.aClass43_Sub3_6, 6402, this.anInt1446, this.anInt1455);
			}
			this.aBoolean118 = false;
			this.aBoolean116 = true;
			this.aBoolean115 = true;
		}
		if (this.aBoolean117) {
			if (this.aClass3_Sub3_Sub12_2 != null) {
				this.aClass3_Sub3_Sub12_2.method3697();
				this.aClass3_Sub3_Sub12_2 = null;
			}
			if (this.aClass34_Sub2Array1[0] != null) {
				this.aClass34_Sub2Array1[0].method4973();
				this.aClass34_Sub2Array1[0] = null;
			}
			if (this.aClass34_Sub2Array1[1] != null) {
				this.aClass34_Sub2Array1[1].method4973();
				this.aClass34_Sub2Array1[1] = null;
			}
			if (this.aClass293_2 != null) {
				this.aClass3_Sub3_Sub12_2 = new Class3_Sub3_Sub12(this.aClass43_Sub3_6, this.anInt1460, this.anInt1446, this.anInt1455, this.aClass43_Sub3_6.anInt8727);
			}
			this.aClass34_Sub2Array1[0] = new Class34_Sub2(this.aClass43_Sub3_6, 34037, this.anInt1460, this.anInt1446, this.anInt1455);
			this.aClass34_Sub2Array1[1] = this.anInt1459 <= 1 ? null : new Class34_Sub2(this.aClass43_Sub3_6, 34037, this.anInt1460, this.anInt1446, this.anInt1455);
			this.aBoolean116 = true;
			this.aBoolean115 = true;
			this.aBoolean117 = false;
		}
		if (this.aBoolean116) {
			if (this.aClass293_2 == null) {
				this.aClass43_Sub3_6.method7247(this.aClass293_3);
				this.aClass293_3.method6411(0);
				this.aClass293_3.method6411(1);
				this.aClass293_3.method6411(8);
				this.aClass293_3.method6421(this.aClass34_Sub2Array1[0], 0);
				if (this.anInt1459 > 1) {
					this.aClass293_3.method6421(this.aClass34_Sub2Array1[1], 1);
				}
				if (this.aBoolean114) {
					this.aClass293_3.method6421(this.aClass34_Sub2_1, 8);
				} else {
					this.aClass293_3.method6426(8, this.aClass3_Sub3_Sub12_1);
				}
				this.aClass43_Sub3_6.method7286(this.aClass293_3);
			} else {
				this.aClass43_Sub3_6.method7247(this.aClass293_3);
				this.aClass293_3.method6411(0);
				this.aClass293_3.method6411(1);
				this.aClass293_3.method6411(8);
				this.aClass293_3.method6421(this.aClass34_Sub2Array1[0], 0);
				if (this.anInt1459 > 1) {
					this.aClass293_3.method6421(this.aClass34_Sub2Array1[1], 1);
				}
				if (this.aBoolean114) {
					this.aClass293_3.method6421(this.aClass34_Sub2_1, 8);
				}
				this.aClass43_Sub3_6.method7286(this.aClass293_3);
				this.aClass43_Sub3_6.method7247(this.aClass293_2);
				this.aClass293_2.method6411(0);
				this.aClass293_2.method6411(8);
				this.aClass293_2.method6426(0, this.aClass3_Sub3_Sub12_2);
				this.aClass293_2.method6426(8, this.aClass3_Sub3_Sub12_1);
				this.aClass43_Sub3_6.method7286(this.aClass293_2);
			}
			this.aBoolean116 = false;
			this.aBoolean115 = true;
		}
		if (this.aBoolean115) {
			this.aClass43_Sub3_6.method7247(this.aClass293_1);
			this.aBoolean115 = !this.aClass293_1.method6416();
			this.aClass43_Sub3_6.method7286(this.aClass293_1);
		}
		return !this.aBoolean115;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public void method1142() {
		if (!this.aBoolean113) {
			return;
		}
		if (this.aClass293_2 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass43_Sub3_6.method7293(this.aClass293_2);
			this.aClass43_Sub3_6.method7290(this.aClass293_3);
			this.aClass293_2.method6413();
			this.aClass293_3.method6412(0);
			if (this.aBoolean114) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt1446, this.anInt1455, 0, 0, this.anInt1446, this.anInt1455, local14, 9728);
			this.aClass43_Sub3_6.method7218(this.aClass293_2);
			this.aClass43_Sub3_6.method7292(this.aClass293_3);
		}
		this.aClass43_Sub3_6.method7283();
		this.aClass43_Sub3_6.method7222(0);
		this.aClass43_Sub3_6.method7281(1);
		this.aClass43_Sub3_6.JA();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 1;
		@Pc(112) Class3_Sub18 local112;
		for (@Pc(104) Class3_Sub18 local104 = (Class3_Sub18) this.aClass130_7.method3543(); local104 != null; local104 = local112) {
			local112 = (Class3_Sub18) this.aClass130_7.method3551();
			@Pc(116) int local116 = local104.method5740();
			for (@Pc(118) int local118 = 0; local118 < local116; local118++) {
				local104.method5744(this.aClass34_Sub2Array1[local96], local118, this.aClass34_Sub2_1);
				if (local112 == null && local118 == local116 - 1) {
					this.aClass43_Sub3_6.method7286(this.aClass293_3);
					this.aClass43_Sub3_6.method7285(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1455);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1448, this.anInt1458);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1448, this.anInt1455 + this.anInt1458);
					OpenGL.glTexCoord2f((float) this.anInt1446, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1448 + this.anInt1446, this.anInt1455 + this.anInt1458);
					OpenGL.glTexCoord2f((float) this.anInt1446, (float) this.anInt1455);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1448 + this.anInt1446, this.anInt1458);
					OpenGL.glEnd();
				} else {
					this.aClass293_3.method6412(local98);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1455);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt1455);
					OpenGL.glTexCoord2f((float) this.anInt1446, (float) this.anInt1455);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1446, this.anInt1455);
					OpenGL.glTexCoord2f((float) this.anInt1446, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1446, 0);
					OpenGL.glEnd();
				}
				local98 = local98 + 1 & 0x1;
				local104.method5741(local118);
				local96 = local96 + 1 & 0x1;
			}
		}
		this.aBoolean113 = false;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	private void method1143() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class3_Sub18 local17 = (Class3_Sub18) this.aClass130_7.method3543(); local17 != null; local17 = (Class3_Sub18) this.aClass130_7.method3551()) {
			local23 = local17.method5734();
			if (local23 > local9) {
				local9 = local23;
			}
			local11 += local17.method5740();
			local7 |= local17.method5746();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt1460) {
			this.anInt1460 = local23;
			this.aBoolean117 = true;
		}
		@Pc(102) int local102 = this.anInt1459 > 2 ? 2 : this.anInt1459;
		@Pc(109) int local109 = local11 <= 2 ? local11 : 2;
		this.anInt1459 = local11;
		if (local102 != local109) {
			this.aBoolean116 = this.aBoolean117 = true;
		}
		if (this.aBoolean114 != local7) {
			this.aBoolean114 = local7;
			this.aBoolean118 = true;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!eaa;I)V")
	public void method1144(@OriginalArg(0) Class3_Sub18 arg0) {
		arg0.aBoolean541 = false;
		arg0.method5743();
		arg0.method7812();
		this.method1143();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)Z")
	public boolean method1145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass293_1 == null || this.aClass130_7.method3542()) {
			return false;
		}
		if (arg2 != this.anInt1446 || this.anInt1455 != arg3) {
			this.anInt1455 = arg3;
			this.anInt1446 = arg2;
			for (@Pc(40) Class3 local40 = this.aClass130_7.method3543(); local40 != this.aClass130_7.aClass3_121; local40 = local40.aClass3_285) {
				((Class3_Sub18) local40).method5742(this.anInt1455, this.anInt1446);
			}
			this.aBoolean117 = true;
			this.aBoolean118 = true;
			this.aBoolean116 = true;
		}
		if (!this.method1141()) {
			return false;
		}
		this.aBoolean113 = true;
		this.anInt1448 = arg1;
		this.anInt1458 = arg0;
		this.aClass43_Sub3_6.method7247(this.aClass293_1);
		this.aClass293_1.method6412(0);
		this.aClass43_Sub3_6.method7285(this.anInt1455 + this.anInt1458 - this.aClass43_Sub3_6.anInt8564, -this.anInt1448);
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!eaa;B)Z")
	public boolean method1146(@OriginalArg(0) Class3_Sub18 arg0) {
		if (this.aClass293_1 != null) {
			if (arg0.method5745() || arg0.method5733()) {
				this.aClass130_7.method3548(arg0);
				this.method1143();
				if (this.method1141()) {
					if (this.anInt1446 != -1 && this.anInt1455 != -1) {
						arg0.method5742(this.anInt1455, this.anInt1446);
					}
					arg0.aBoolean541 = true;
					return true;
				}
			}
			this.method1144(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
	public boolean method1147() {
		return this.aClass293_1 != null;
	}
}
