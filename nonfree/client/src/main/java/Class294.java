import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class294 {

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "Z")
	private boolean aBoolean695;

	@OriginalMember(owner = "client!rm", name = "A", descriptor = "Lclient!is;")
	private Class6_Sub5_Sub16 aClass6_Sub5_Sub16_1;

	@OriginalMember(owner = "client!rm", name = "C", descriptor = "Lclient!aaa;")
	private Class2_Sub1 aClass2_Sub1_5;

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "Lclient!is;")
	private Class6_Sub5_Sub16 aClass6_Sub5_Sub16_2;

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
	private int anInt8711 = 0;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	private int anInt8708 = 0;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	private int anInt8713 = 1;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
	private int anInt8714 = 1;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Lclient!kba;")
	private final Class163 aClass163_53 = new Class163();

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "Z")
	private boolean aBoolean696 = true;

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
	private int anInt8724 = -1;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "Z")
	private boolean aBoolean699 = true;

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "Z")
	private boolean aBoolean697 = true;

	@OriginalMember(owner = "client!rm", name = "H", descriptor = "[Lclient!aaa;")
	private Class2_Sub1[] aClass2_Sub1Array4 = new Class2_Sub1[2];

	@OriginalMember(owner = "client!rm", name = "K", descriptor = "Z")
	private boolean aBoolean700 = true;

	@OriginalMember(owner = "client!rm", name = "F", descriptor = "Z")
	private boolean aBoolean698 = false;

	@OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
	private int anInt8725 = 0;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_34;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Lclient!rr;")
	private Class297 aClass297_6;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "Lclient!rr;")
	private Class297 aClass297_5;

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "Lclient!rr;")
	private Class297 aClass297_7;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class294(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_34 = arg0;
		if (this.aClass5_Sub1_34.aBoolean40 && this.aClass5_Sub1_34.aBoolean20) {
			this.aClass297_5 = this.aClass297_6 = new Class297(this.aClass5_Sub1_34);
			if (this.aClass5_Sub1_34.anInt358 > 1 && this.aClass5_Sub1_34.aBoolean19 && this.aClass5_Sub1_34.aBoolean29) {
				this.aClass297_5 = this.aClass297_7 = new Class297(this.aClass5_Sub1_34);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z")
	private boolean method7233() {
		if (this.aBoolean697) {
			if (this.aClass6_Sub5_Sub16_1 != null) {
				this.aClass6_Sub5_Sub16_1.method4479();
				this.aClass6_Sub5_Sub16_1 = null;
			}
			if (this.aClass2_Sub1_5 != null) {
				this.aClass2_Sub1_5.method6979();
				this.aClass2_Sub1_5 = null;
			}
			if (this.aClass297_7 != null) {
				this.aClass6_Sub5_Sub16_1 = new Class6_Sub5_Sub16(this.aClass5_Sub1_34, 6402, this.anInt8714, this.anInt8713, this.aClass5_Sub1_34.anInt358);
			}
			if (this.aBoolean698) {
				this.aClass2_Sub1_5 = new Class2_Sub1(this.aClass5_Sub1_34, 34037, 6402, this.anInt8714, this.anInt8713);
			} else if (this.aClass6_Sub5_Sub16_1 == null) {
				this.aClass6_Sub5_Sub16_1 = new Class6_Sub5_Sub16(this.aClass5_Sub1_34, 6402, this.anInt8714, this.anInt8713);
			}
			this.aBoolean697 = false;
			this.aBoolean696 = true;
			this.aBoolean700 = true;
		}
		if (this.aBoolean699) {
			if (this.aClass6_Sub5_Sub16_2 != null) {
				this.aClass6_Sub5_Sub16_2.method4479();
				this.aClass6_Sub5_Sub16_2 = null;
			}
			if (this.aClass2_Sub1Array4[0] != null) {
				this.aClass2_Sub1Array4[0].method6979();
				this.aClass2_Sub1Array4[0] = null;
			}
			if (this.aClass2_Sub1Array4[1] != null) {
				this.aClass2_Sub1Array4[1].method6979();
				this.aClass2_Sub1Array4[1] = null;
			}
			if (this.aClass297_7 != null) {
				this.aClass6_Sub5_Sub16_2 = new Class6_Sub5_Sub16(this.aClass5_Sub1_34, this.anInt8724, this.anInt8714, this.anInt8713, this.aClass5_Sub1_34.anInt358);
			}
			this.aClass2_Sub1Array4[0] = new Class2_Sub1(this.aClass5_Sub1_34, 34037, this.anInt8724, this.anInt8714, this.anInt8713);
			this.aClass2_Sub1Array4[1] = this.anInt8725 <= 1 ? null : new Class2_Sub1(this.aClass5_Sub1_34, 34037, this.anInt8724, this.anInt8714, this.anInt8713);
			this.aBoolean700 = true;
			this.aBoolean699 = false;
			this.aBoolean696 = true;
		}
		if (this.aBoolean696) {
			if (this.aClass297_7 == null) {
				this.aClass5_Sub1_34.method387(this.aClass297_6);
				this.aClass297_6.method7263(0);
				this.aClass297_6.method7263(1);
				this.aClass297_6.method7263(8);
				this.aClass297_6.method7257(0, this.aClass2_Sub1Array4[0]);
				if (this.anInt8725 > 1) {
					this.aClass297_6.method7257(1, this.aClass2_Sub1Array4[1]);
				}
				if (this.aBoolean698) {
					this.aClass297_6.method7257(8, this.aClass2_Sub1_5);
				} else {
					this.aClass297_6.method7268(8, this.aClass6_Sub5_Sub16_1);
				}
				this.aClass5_Sub1_34.method396(this.aClass297_6);
			} else {
				this.aClass5_Sub1_34.method387(this.aClass297_6);
				this.aClass297_6.method7263(0);
				this.aClass297_6.method7263(1);
				this.aClass297_6.method7263(8);
				this.aClass297_6.method7257(0, this.aClass2_Sub1Array4[0]);
				if (this.anInt8725 > 1) {
					this.aClass297_6.method7257(1, this.aClass2_Sub1Array4[1]);
				}
				if (this.aBoolean698) {
					this.aClass297_6.method7257(8, this.aClass2_Sub1_5);
				}
				this.aClass5_Sub1_34.method396(this.aClass297_6);
				this.aClass5_Sub1_34.method387(this.aClass297_7);
				this.aClass297_7.method7263(0);
				this.aClass297_7.method7263(8);
				this.aClass297_7.method7268(0, this.aClass6_Sub5_Sub16_2);
				this.aClass297_7.method7268(8, this.aClass6_Sub5_Sub16_1);
				this.aClass5_Sub1_34.method396(this.aClass297_7);
			}
			this.aBoolean700 = true;
			this.aBoolean696 = false;
		}
		if (this.aBoolean700) {
			this.aClass5_Sub1_34.method387(this.aClass297_5);
			this.aBoolean700 = !this.aClass297_5.method7265();
			this.aClass5_Sub1_34.method396(this.aClass297_5);
		}
		return !this.aBoolean700;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
	private void method7234() {
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class6_Sub9 local23 = (Class6_Sub9) this.aClass163_53.method4966(); local23 != null; local23 = (Class6_Sub9) this.aClass163_53.method4965()) {
			local29 = local23.method1701();
			local17 += local23.method1705();
			if (local15 < local29) {
				local15 = local29;
			}
			local13 |= local23.method1703();
		}
		if (local15 == 2) {
			local29 = 34836;
		} else if (local15 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (local29 != this.anInt8724) {
			this.anInt8724 = local29;
			this.aBoolean699 = true;
		}
		@Pc(97) int local97 = this.anInt8725 > 2 ? 2 : this.anInt8725;
		@Pc(104) int local104 = local17 > 2 ? 2 : local17;
		this.anInt8725 = local17;
		if (local13 != this.aBoolean698) {
			this.aBoolean698 = local13;
			this.aBoolean697 = true;
		}
		if (local104 != local97) {
			this.aBoolean696 = this.aBoolean699 = true;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method7235(@OriginalArg(0) Class6_Sub9 arg0) {
		arg0.aBoolean149 = false;
		arg0.method1706();
		arg0.method8792();
		this.method7234();
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
	public void method7236() {
		if (!this.aBoolean695) {
			return;
		}
		if (this.aClass297_7 != null) {
			this.aClass5_Sub1_34.method358(this.aClass297_7);
			@Pc(20) short local20 = 16384;
			this.aClass5_Sub1_34.method324(this.aClass297_6);
			this.aClass297_7.method7260();
			this.aClass297_6.method7266(0);
			if (this.aBoolean698) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt8714, this.anInt8713, 0, 0, this.anInt8714, this.anInt8713, local20, 9728);
			this.aClass5_Sub1_34.method321(this.aClass297_7);
			this.aClass5_Sub1_34.method369(this.aClass297_6);
		}
		this.aClass5_Sub1_34.method318();
		this.aClass5_Sub1_34.method359(0);
		this.aClass5_Sub1_34.method385(1);
		this.aClass5_Sub1_34.la();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class6_Sub9 local109;
		for (@Pc(101) Class6_Sub9 local101 = (Class6_Sub9) this.aClass163_53.method4966(); local101 != null; local101 = local109) {
			local109 = (Class6_Sub9) this.aClass163_53.method4965();
			@Pc(113) int local113 = local101.method1705();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method1704(this.aClass2_Sub1_5, local115, this.aClass2_Sub1Array4[local93]);
				if (local109 == null && local113 - 1 == local115) {
					this.aClass5_Sub1_34.method396(this.aClass297_6);
					this.aClass5_Sub1_34.method377(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8713);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8711, this.anInt8708);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8711, this.anInt8713 + this.anInt8708);
					OpenGL.glTexCoord2f((float) this.anInt8714, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8714 + this.anInt8711, this.anInt8708 + this.anInt8713);
					OpenGL.glTexCoord2f((float) this.anInt8714, (float) this.anInt8713);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8711 + this.anInt8714, this.anInt8708);
					OpenGL.glEnd();
				} else {
					this.aClass297_6.method7266(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8713);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt8713);
					OpenGL.glTexCoord2f((float) this.anInt8714, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8714, this.anInt8713);
					OpenGL.glTexCoord2f((float) this.anInt8714, (float) this.anInt8713);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8714, 0);
					OpenGL.glEnd();
				}
				local101.method1699(local115);
				local93 = local93 + 1 & 0x1;
				local95 = local95 + 1 & 0x1;
			}
		}
		this.aBoolean695 = false;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Lclient!lb;I)Z")
	public boolean method7238(@OriginalArg(0) Class6_Sub9 arg0) {
		if (this.aClass297_5 != null) {
			if (arg0.method1700() || arg0.method1696()) {
				this.aClass163_53.method4967(arg0);
				this.method7234();
				if (this.method7233()) {
					if (this.anInt8714 != -1 && this.anInt8713 != -1) {
						arg0.method1697(this.anInt8713, this.anInt8714);
					}
					arg0.aBoolean149 = true;
					return true;
				}
			}
			this.method7235(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)Z")
	public boolean method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass297_5 == null || this.aClass163_53.method4968()) {
			return false;
		}
		if (arg0 != this.anInt8714 || this.anInt8713 != arg2) {
			this.anInt8714 = arg0;
			this.anInt8713 = arg2;
			for (@Pc(42) Class6 local42 = this.aClass163_53.method4966(); local42 != this.aClass163_53.aClass6_178; local42 = local42.aClass6_300) {
				((Class6_Sub9) local42).method1697(this.anInt8713, this.anInt8714);
			}
			this.aBoolean697 = true;
			this.aBoolean696 = true;
			this.aBoolean699 = true;
		}
		if (!this.method7233()) {
			return false;
		}
		this.aBoolean695 = true;
		this.anInt8711 = arg3;
		this.anInt8708 = arg1;
		this.aClass5_Sub1_34.method387(this.aClass297_5);
		this.aClass297_5.method7266(0);
		this.aClass5_Sub1_34.method377(this.anInt8713 + this.anInt8708 - this.aClass5_Sub1_34.anInt250, -this.anInt8711);
		return true;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	public void method7240() {
		this.aClass297_5 = this.aClass297_7 = this.aClass297_6 = null;
		this.aClass6_Sub5_Sub16_1 = null;
		this.aClass6_Sub5_Sub16_2 = null;
		this.aClass2_Sub1_5 = null;
		this.aClass2_Sub1Array4 = null;
		if (!this.aClass163_53.method4968()) {
			for (@Pc(41) Class6 local41 = this.aClass163_53.method4966(); local41 != this.aClass163_53.aClass6_178; local41 = local41.aClass6_300) {
				((Class6_Sub9) local41).method1706();
			}
		}
		this.anInt8714 = this.anInt8713 = 1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)Z")
	public boolean method7243() {
		return this.aClass297_5 != null;
	}
}
