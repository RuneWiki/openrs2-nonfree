import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class201 {

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Lclient!kd;")
	private Class134 aClass134_1;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Lclient!uo;")
	private Class20_Sub4 aClass20_Sub4_7;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
	private int anInt4845 = 0;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
	private int anInt4846 = -1;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
	private int anInt4847 = -1;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	private int anInt4848 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "Lclient!cf;")
	private final Class30 aClass30_39 = new Class30();

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
	private int anInt4850 = 0;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	private int anInt4849 = -1;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "[Lclient!uo;")
	private Class20_Sub4[] aClass20_Sub4Array2 = new Class20_Sub4[2];

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Z")
	private boolean aBoolean367 = true;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Z")
	private boolean aBoolean368 = false;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "Z")
	private boolean aBoolean369 = true;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Z")
	private boolean aBoolean366 = true;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_34;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!hm;")
	private Class99 aClass99_4;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class201(@OriginalArg(0) Class63_Sub2 arg0) {
		this.aClass63_Sub2_34 = arg0;
		if (this.aClass63_Sub2_34.aBoolean167 && this.aClass63_Sub2_34.aBoolean159) {
			this.aClass99_4 = new Class99(this.aClass63_Sub2_34);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ef;Z)V")
	private void method4267(@OriginalArg(0) Class2_Sub13 arg0) {
		arg0.method1188();
		arg0.aBoolean105 = false;
		arg0.method5617();
		this.method4269();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ef;)Z")
	public boolean method4268(@OriginalArg(0) Class2_Sub13 arg0) {
		if (this.aClass99_4 != null) {
			if (arg0.method1185() || arg0.method1184()) {
				if (this.anInt4847 != -1 && this.anInt4846 != -1) {
					arg0.method1186(this.anInt4847, this.anInt4846);
				}
				arg0.aBoolean105 = true;
				this.aClass30_39.method685(arg0);
				this.method4269();
				return true;
			}
			arg0.method1188();
		}
		return false;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
	private void method4269() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class2_Sub13 local11 = (Class2_Sub13) this.aClass30_39.method694(); local11 != null; local11 = (Class2_Sub13) this.aClass30_39.method682()) {
			local16 = local11.method1192();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method1190();
			local5 |= local11.method1191();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt4849) {
			this.anInt4849 = local45;
			this.aBoolean367 = true;
		}
		local16 = this.anInt4850 > 2 ? 2 : this.anInt4850;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean369 = this.aBoolean367 = true;
		}
		if (local5 != this.aBoolean368) {
			this.aBoolean368 = local5;
			this.aBoolean366 = true;
		}
		this.anInt4850 = local3;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "()Z")
	private boolean method4270() {
		return this.aClass63_Sub2_34.method2069() == this.aClass99_4;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "()V")
	public void method4271() {
		if (!this.method4270()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass63_Sub2_34.anOpengl2;
		this.aClass63_Sub2_34.method2135();
		this.aClass63_Sub2_34.method2090(0);
		this.aClass63_Sub2_34.method1967();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class2_Sub13 local35;
		for (@Pc(27) Class2_Sub13 local27 = (Class2_Sub13) this.aClass30_39.method694(); local27 != null; local27 = local35) {
			local35 = (Class2_Sub13) this.aClass30_39.method682();
			@Pc(39) int local39 = local27.method1190();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method1187(local41, this.aClass20_Sub4Array2[local19], this.aClass20_Sub4_7);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass63_Sub2_34.method2119(this.aClass99_4);
					this.aClass63_Sub2_34.method2106(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt4846);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt4848, this.anInt4845);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt4848, this.anInt4845 + this.anInt4846);
					local7.glTexCoord2f((float) this.anInt4847, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt4848 + this.anInt4847, this.anInt4845 + this.anInt4846);
					local7.glTexCoord2f((float) this.anInt4847, (float) this.anInt4846);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt4848 + this.anInt4847, this.anInt4845);
					local7.glEnd();
				} else {
					this.aClass99_4.method2538(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt4846);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt4846);
					local7.glTexCoord2f((float) this.anInt4847, (float) this.anInt4846);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt4847, this.anInt4846);
					local7.glTexCoord2f((float) this.anInt4847, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt4847, 0);
					local7.glEnd();
				}
				local27.method1189(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)Z")
	public boolean method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass99_4 == null || this.aClass30_39.method684()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt4847 != arg2 || this.anInt4846 != arg3) {
			this.anInt4847 = arg2;
			this.anInt4846 = arg3;
			for (@Pc(30) Class2 local30 = this.aClass30_39.method694(); local30 != this.aClass30_39.aClass2_41; local30 = local30.aClass2_243) {
				((Class2_Sub13) local30).method1186(this.anInt4847, this.anInt4846);
			}
			this.aBoolean367 = true;
			this.aBoolean366 = true;
		}
		if (this.aBoolean366) {
			if (this.aClass134_1 != null) {
				this.aClass134_1.method3099();
				this.aClass134_1 = null;
			}
			if (this.aClass20_Sub4_7 != null) {
				this.aClass20_Sub4_7.method5505();
				this.aClass20_Sub4_7 = null;
			}
			if (this.aBoolean368) {
				this.aClass20_Sub4_7 = new Class20_Sub4(this.aClass63_Sub2_34, 34037, 6402, this.anInt4847, this.anInt4846);
			} else {
				this.aClass134_1 = new Class134(this.aClass63_Sub2_34, 6402, this.anInt4847, this.anInt4846);
			}
			this.aBoolean369 = true;
			this.aBoolean366 = false;
			local11 = true;
		}
		if (this.aBoolean367) {
			if (this.aClass20_Sub4Array2[0] != null) {
				this.aClass20_Sub4Array2[0].method5505();
				this.aClass20_Sub4Array2[0] = null;
			}
			if (this.aClass20_Sub4Array2[1] != null) {
				this.aClass20_Sub4Array2[1].method5505();
				this.aClass20_Sub4Array2[1] = null;
			}
			this.aClass20_Sub4Array2[0] = new Class20_Sub4(this.aClass63_Sub2_34, 34037, this.anInt4849, this.anInt4847, this.anInt4846);
			this.aClass20_Sub4Array2[1] = this.anInt4850 > 1 ? new Class20_Sub4(this.aClass63_Sub2_34, 34037, this.anInt4849, this.anInt4847, this.anInt4846) : null;
			this.aBoolean369 = true;
			this.aBoolean367 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass63_Sub2_34.method2069().method2530();
		this.aClass63_Sub2_34.method2077(this.aClass99_4);
		if (this.aBoolean369) {
			this.aClass99_4.method2534(0);
			this.aClass99_4.method2534(1);
			this.aClass99_4.method2534(8);
			if (this.aClass20_Sub4Array2[0] != null) {
				this.aClass99_4.method2535(0, this.aClass20_Sub4Array2[0]);
			}
			if (this.aClass20_Sub4Array2[1] != null) {
				this.aClass99_4.method2535(1, this.aClass20_Sub4Array2[1]);
			}
			if (this.aClass20_Sub4_7 != null) {
				this.aClass99_4.method2535(8, this.aClass20_Sub4_7);
			}
			if (this.aClass134_1 != null) {
				this.aClass99_4.method2532(this.aClass134_1);
			}
			this.aClass99_4.method2538(0);
			this.aBoolean369 = false;
			local11 = true;
		}
		if (!local11 || this.aClass99_4.method2537()) {
			this.anInt4848 = arg0;
			this.anInt4845 = arg1;
			this.aClass63_Sub2_34.method2106(-this.anInt4848, this.anInt4845 + this.anInt4846 - local194);
			return true;
		}
		this.aClass63_Sub2_34.method2119(this.aClass99_4);
		this.aBoolean367 = true;
		this.aBoolean366 = true;
		this.aBoolean369 = true;
		return false;
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "()V")
	public void method4273() {
		if (this.aClass99_4 != null) {
			this.aClass99_4 = null;
			this.aClass20_Sub4Array2 = null;
			this.aClass134_1 = null;
			this.aClass20_Sub4_7 = null;
			this.aBoolean367 = true;
			this.aBoolean366 = true;
			this.aBoolean369 = true;
			if (!this.aClass30_39.method684()) {
				for (@Pc(33) Class2 local33 = this.aClass30_39.method694(); local33 != this.aClass30_39.aClass2_41; local33 = local33.aClass2_243) {
					((Class2_Sub13) local33).method1188();
				}
			}
		}
		this.anInt4847 = this.anInt4846 = -1;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Lclient!ef;)V")
	public void method4274(@OriginalArg(0) Class2_Sub13 arg0) {
		this.method4267(arg0);
	}
}
