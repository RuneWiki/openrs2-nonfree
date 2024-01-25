import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class172 {

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Z")
	private boolean aBoolean339;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!g;")
	private Class24_Sub1 aClass24_Sub1_4;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Lclient!bi;")
	private Class3_Sub7_Sub2 aClass3_Sub7_Sub2_1;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!bi;")
	private Class3_Sub7_Sub2 aClass3_Sub7_Sub2_2;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	private int anInt4717 = 1;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	private int anInt4725 = 1;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private int anInt4722 = 0;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	private int anInt4727 = 0;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!gk;")
	private final Class112 aClass112_30 = new Class112();

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Z")
	private boolean aBoolean341 = true;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private int anInt4729 = 0;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
	private boolean aBoolean342 = true;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[Lclient!g;")
	private Class24_Sub1[] aClass24_Sub1Array2 = new Class24_Sub1[2];

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	private int anInt4730 = -1;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Z")
	private boolean aBoolean343 = true;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
	private boolean aBoolean340 = false;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
	private boolean aBoolean344 = true;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_31;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!wt;")
	private Class364 aClass364_3;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!wt;")
	private Class364 aClass364_4;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!wt;")
	private Class364 aClass364_5;

	static {
		new Class137("", 76);
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class172(@OriginalArg(0) Class45_Sub3 arg0) {
		this.aClass45_Sub3_31 = arg0;
		if (this.aClass45_Sub3_31.aBoolean704 && this.aClass45_Sub3_31.aBoolean698) {
			this.aClass364_4 = this.aClass364_3 = new Class364(this.aClass45_Sub3_31);
			if (this.aClass45_Sub3_31.anInt9040 > 1 && this.aClass45_Sub3_31.aBoolean694 && this.aClass45_Sub3_31.aBoolean682) {
				this.aClass364_4 = this.aClass364_5 = new Class364(this.aClass45_Sub3_31);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public void method4089() {
		if (!this.aBoolean339) {
			return;
		}
		if (this.aClass364_5 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass45_Sub3_31.method7513(this.aClass364_5);
			this.aClass45_Sub3_31.method7492(this.aClass364_3);
			this.aClass364_5.method7937();
			this.aClass364_3.method7925(0);
			if (this.aBoolean340) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4717, this.anInt4725, 0, 0, this.anInt4717, this.anInt4725, local14, 9728);
			this.aClass45_Sub3_31.method7494(this.aClass364_5);
			this.aClass45_Sub3_31.method7456(this.aClass364_3);
		}
		this.aClass45_Sub3_31.method7476();
		this.aClass45_Sub3_31.method7465(0);
		this.aClass45_Sub3_31.method7500(1);
		this.aClass45_Sub3_31.JA();
		@Pc(95) int local95 = 0;
		@Pc(97) int local97 = 1;
		@Pc(111) Class3_Sub5 local111;
		for (@Pc(103) Class3_Sub5 local103 = (Class3_Sub5) this.aClass112_30.method3088(); local103 != null; local103 = local111) {
			local111 = (Class3_Sub5) this.aClass112_30.method3084();
			@Pc(115) int local115 = local103.method386();
			for (@Pc(117) int local117 = 0; local117 < local115; local117++) {
				local103.method382(local117, this.aClass24_Sub1Array2[local95], this.aClass24_Sub1_4);
				if (local111 == null && local117 == local115 - 1) {
					this.aClass45_Sub3_31.method7508(this.aClass364_3);
					this.aClass45_Sub3_31.method7520(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4725);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4722, this.anInt4727);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4722, this.anInt4725 + this.anInt4727);
					OpenGL.glTexCoord2f((float) this.anInt4717, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4722 + this.anInt4717, this.anInt4727 + this.anInt4725);
					OpenGL.glTexCoord2f((float) this.anInt4717, (float) this.anInt4725);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4722 + this.anInt4717, this.anInt4727);
					OpenGL.glEnd();
				} else {
					this.aClass364_3.method7925(local97);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4725);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4725);
					OpenGL.glTexCoord2f((float) this.anInt4717, (float) this.anInt4725);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4717, this.anInt4725);
					OpenGL.glTexCoord2f((float) this.anInt4717, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4717, 0);
					OpenGL.glEnd();
				}
				local103.method387(local117);
				local97 = local97 + 1 & 0x1;
				local95 = local95 + 1 & 0x1;
			}
		}
		this.aBoolean339 = false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)Z")
	public boolean method4090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass364_4 == null || this.aClass112_30.method3093()) {
			return false;
		}
		if (arg3 != this.anInt4717 || this.anInt4725 != arg0) {
			this.anInt4717 = arg3;
			this.anInt4725 = arg0;
			for (@Pc(43) Class3 local43 = this.aClass112_30.method3088(); local43 != this.aClass112_30.aClass3_111; local43 = local43.aClass3_286) {
				((Class3_Sub5) local43).method385(this.anInt4717, this.anInt4725);
			}
			this.aBoolean342 = true;
			this.aBoolean341 = true;
			this.aBoolean343 = true;
		}
		if (!this.method4092()) {
			return false;
		}
		this.anInt4722 = arg2;
		this.anInt4727 = arg1;
		this.aBoolean339 = true;
		this.aClass45_Sub3_31.method7443(this.aClass364_4);
		this.aClass364_4.method7925(0);
		this.aClass45_Sub3_31.method7520(this.anInt4725 + this.anInt4727 - this.aClass45_Sub3_31.anInt9000, -this.anInt4722);
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	private void method4091() {
		@Pc(12) boolean local12 = false;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(30) int local30;
		for (@Pc(22) Class3_Sub5 local22 = (Class3_Sub5) this.aClass112_30.method3088(); local22 != null; local22 = (Class3_Sub5) this.aClass112_30.method3084()) {
			local30 = local22.method381();
			if (local14 < local30) {
				local14 = local30;
			}
			local16 += local22.method386();
			local12 |= local22.method383();
		}
		if (local14 == 2) {
			local30 = 34836;
		} else if (local14 == 1) {
			local30 = 34842;
		} else {
			local30 = 6408;
		}
		if (this.anInt4730 != local30) {
			this.aBoolean341 = true;
			this.anInt4730 = local30;
		}
		@Pc(100) int local100 = this.anInt4729 <= 2 ? this.anInt4729 : 2;
		@Pc(109) int local109 = local16 <= 2 ? local16 : 2;
		this.anInt4729 = local16;
		if (local100 != local109) {
			this.aBoolean342 = this.aBoolean341 = true;
		}
		if (this.aBoolean340 != local12) {
			this.aBoolean343 = true;
			this.aBoolean340 = local12;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Z")
	private boolean method4092() {
		if (this.aBoolean343) {
			if (this.aClass3_Sub7_Sub2_2 != null) {
				this.aClass3_Sub7_Sub2_2.method704();
				this.aClass3_Sub7_Sub2_2 = null;
			}
			if (this.aClass24_Sub1_4 != null) {
				this.aClass24_Sub1_4.method2797();
				this.aClass24_Sub1_4 = null;
			}
			if (this.aClass364_5 != null) {
				this.aClass3_Sub7_Sub2_2 = new Class3_Sub7_Sub2(this.aClass45_Sub3_31, 6402, this.anInt4717, this.anInt4725, this.aClass45_Sub3_31.anInt9040);
			}
			if (this.aBoolean340) {
				this.aClass24_Sub1_4 = new Class24_Sub1(this.aClass45_Sub3_31, 34037, 6402, this.anInt4717, this.anInt4725);
			} else if (this.aClass3_Sub7_Sub2_2 == null) {
				this.aClass3_Sub7_Sub2_2 = new Class3_Sub7_Sub2(this.aClass45_Sub3_31, 6402, this.anInt4717, this.anInt4725);
			}
			this.aBoolean343 = false;
			this.aBoolean342 = true;
			this.aBoolean344 = true;
		}
		if (this.aBoolean341) {
			if (this.aClass3_Sub7_Sub2_1 != null) {
				this.aClass3_Sub7_Sub2_1.method704();
				this.aClass3_Sub7_Sub2_1 = null;
			}
			if (this.aClass24_Sub1Array2[0] != null) {
				this.aClass24_Sub1Array2[0].method2797();
				this.aClass24_Sub1Array2[0] = null;
			}
			if (this.aClass24_Sub1Array2[1] != null) {
				this.aClass24_Sub1Array2[1].method2797();
				this.aClass24_Sub1Array2[1] = null;
			}
			if (this.aClass364_5 != null) {
				this.aClass3_Sub7_Sub2_1 = new Class3_Sub7_Sub2(this.aClass45_Sub3_31, this.anInt4730, this.anInt4717, this.anInt4725, this.aClass45_Sub3_31.anInt9040);
			}
			this.aClass24_Sub1Array2[0] = new Class24_Sub1(this.aClass45_Sub3_31, 34037, this.anInt4730, this.anInt4717, this.anInt4725);
			this.aClass24_Sub1Array2[1] = this.anInt4729 <= 1 ? null : new Class24_Sub1(this.aClass45_Sub3_31, 34037, this.anInt4730, this.anInt4717, this.anInt4725);
			this.aBoolean344 = true;
			this.aBoolean341 = false;
			this.aBoolean342 = true;
		}
		if (this.aBoolean342) {
			if (this.aClass364_5 == null) {
				this.aClass45_Sub3_31.method7443(this.aClass364_3);
				this.aClass364_3.method7935(0);
				this.aClass364_3.method7935(1);
				this.aClass364_3.method7935(8);
				this.aClass364_3.method7936(0, this.aClass24_Sub1Array2[0]);
				if (this.anInt4729 > 1) {
					this.aClass364_3.method7936(1, this.aClass24_Sub1Array2[1]);
				}
				if (this.aBoolean340) {
					this.aClass364_3.method7936(8, this.aClass24_Sub1_4);
				} else {
					this.aClass364_3.method7927(this.aClass3_Sub7_Sub2_2, 8);
				}
				this.aClass45_Sub3_31.method7508(this.aClass364_3);
			} else {
				this.aClass45_Sub3_31.method7443(this.aClass364_3);
				this.aClass364_3.method7935(0);
				this.aClass364_3.method7935(1);
				this.aClass364_3.method7935(8);
				this.aClass364_3.method7936(0, this.aClass24_Sub1Array2[0]);
				if (this.anInt4729 > 1) {
					this.aClass364_3.method7936(1, this.aClass24_Sub1Array2[1]);
				}
				if (this.aBoolean340) {
					this.aClass364_3.method7936(8, this.aClass24_Sub1_4);
				}
				this.aClass45_Sub3_31.method7508(this.aClass364_3);
				this.aClass45_Sub3_31.method7443(this.aClass364_5);
				this.aClass364_5.method7935(0);
				this.aClass364_5.method7935(8);
				this.aClass364_5.method7927(this.aClass3_Sub7_Sub2_1, 0);
				this.aClass364_5.method7927(this.aClass3_Sub7_Sub2_2, 8);
				this.aClass45_Sub3_31.method7508(this.aClass364_5);
			}
			this.aBoolean342 = false;
			this.aBoolean344 = true;
		}
		if (this.aBoolean344) {
			this.aClass45_Sub3_31.method7443(this.aClass364_4);
			this.aBoolean344 = !this.aClass364_4.method7934();
			this.aClass45_Sub3_31.method7508(this.aClass364_4);
		}
		return !this.aBoolean344;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method4093() {
		this.aClass3_Sub7_Sub2_2 = null;
		this.aClass24_Sub1Array2 = null;
		this.aClass364_4 = this.aClass364_5 = this.aClass364_3 = null;
		this.aClass3_Sub7_Sub2_1 = null;
		this.aClass24_Sub1_4 = null;
		if (!this.aClass112_30.method3093()) {
			for (@Pc(43) Class3 local43 = this.aClass112_30.method3088(); local43 != this.aClass112_30.aClass3_111; local43 = local43.aClass3_286) {
				((Class3_Sub5) local43).method379();
			}
		}
		this.anInt4717 = this.anInt4725 = 1;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Z")
	public boolean method4094() {
		return this.aClass364_4 != null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!oq;B)Z")
	public boolean method4095(@OriginalArg(0) Class3_Sub5 arg0) {
		if (this.aClass364_4 != null) {
			if (arg0.method376() || arg0.method384()) {
				this.aClass112_30.method3079(arg0);
				this.method4091();
				if (this.method4092()) {
					if (this.anInt4717 != -1 && this.anInt4725 != -1) {
						arg0.method385(this.anInt4717, this.anInt4725);
					}
					arg0.aBoolean42 = true;
					return true;
				}
			}
			this.method4096(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!oq;)V")
	public void method4096(@OriginalArg(1) Class3_Sub5 arg0) {
		arg0.aBoolean42 = false;
		arg0.method379();
		arg0.method7825();
		this.method4091();
	}
}
