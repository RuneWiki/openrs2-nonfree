import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class103 {

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "[[Lclient!uv;")
	private Class246[][] aClass246ArrayArray1;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_22;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "Lclient!jk;")
	private final Class125_Sub1 aClass125_Sub1_3;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	public final int anInt2747;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	private final int anInt2739;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
	private final int anInt2746;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "[B")
	public final byte[] aByteArray36;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	private final int anInt2736;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
	private final int anInt2743;

	static {
		new Class198("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!tt;Lclient!jk;)V")
	public Class103(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Class125_Sub1 arg1) {
		this.aClass200_Sub2_22 = arg0;
		this.aClass125_Sub1_3 = arg1;
		this.anInt2747 = (this.aClass125_Sub1_3.anInt6301 * this.aClass125_Sub1_3.anInt6303 >> this.aClass200_Sub2_22.anInt6721) + 2;
		this.anInt2739 = (this.aClass125_Sub1_3.anInt6299 * this.aClass125_Sub1_3.anInt6303 >> this.aClass200_Sub2_22.anInt6721) + 2;
		this.anInt2746 = this.aClass200_Sub2_22.anInt6721 + 7 - this.aClass125_Sub1_3.anInt6300;
		this.aByteArray36 = new byte[this.anInt2747 * this.anInt2739];
		this.anInt2736 = this.aClass125_Sub1_3.anInt6301 >> this.anInt2746;
		this.anInt2743 = this.aClass125_Sub1_3.anInt6299 >> this.anInt2746;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!i;BII)V")
	public void method2217(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub2_Sub1_Sub1 local6 = (Class5_Sub2_Sub1_Sub1) arg0;
		arg2 += local6.anInt183 + 1;
		arg1 += local6.anInt186 + 1;
		@Pc(28) int local28 = arg2 + this.anInt2747 * arg1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt192;
		@Pc(42) int local42 = local6.anInt193;
		@Pc(47) int local47 = this.anInt2747 - local42;
		@Pc(57) int local57;
		if (arg1 <= 0) {
			local57 = 1 - arg1;
			local30 = local57 * local42;
			local28 += local57 * this.anInt2747;
			local33 -= local57;
			arg1 = 1;
		}
		@Pc(78) int local78 = 0;
		if (this.anInt2739 <= arg1 + local33) {
			local57 = local33 + arg1 + 1 - this.anInt2739;
			local33 -= local57;
		}
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			local42 -= local57;
			local47 += local57;
			local28 += local57;
			local78 = local57;
			arg2 = 1;
			local30 += local57;
		}
		if (this.anInt2747 <= local42 + arg2) {
			local57 = arg2 + local42 + 1 - this.anInt2747;
			local78 += local57;
			local42 -= local57;
			local47 += local57;
		}
		if (local42 > 0 && local33 > 0) {
			Static124.method1753(local42, local28, this.aByteArray36, local6.aByteArray2, local47, local78, local33, local30);
			this.method2218(arg1, local33, arg2, local42);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
	private void method2218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass246ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(26) int local26 = arg2 + arg3 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg0 - 1 >> 7;
		@Pc(42) int local42 = arg1 + arg0 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local15; local44 <= local26; local44++) {
			@Pc(51) Class246[] local51 = this.aClass246ArrayArray1[local44];
			for (@Pc(53) int local53 = local32; local53 <= local42; local53++) {
				local51[local53].aBoolean477 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public void method2219() {
		this.aClass246ArrayArray1 = new Class246[this.anInt2736][this.anInt2743];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2743; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2736; local24++) {
				this.aClass246ArrayArray1[local24][local20] = new Class246(this.aClass200_Sub2_22, this, this.aClass125_Sub1_3, local24, local20, this.anInt2746, local24 * 128 + 1, local20 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILclient!i;)Z")
	public boolean method2220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub2_Sub1 arg2) {
		@Pc(6) Class5_Sub2_Sub1_Sub1 local6 = (Class5_Sub2_Sub1_Sub1) arg2;
		arg0 += local6.anInt186 + 1;
		arg1 += local6.anInt183 + 1;
		@Pc(38) int local38 = arg1 + this.anInt2747 * arg0;
		@Pc(41) int local41 = local6.anInt192;
		@Pc(44) int local44 = local6.anInt193;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local38 += this.anInt2747 * local53;
			local41 -= local53;
			arg0 = 1;
		}
		@Pc(72) int local72 = this.anInt2747 - local44;
		if (this.anInt2739 <= arg0 + local41) {
			local53 = local41 + arg0 + 1 - this.anInt2739;
			local41 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local38 += local53;
			local72 += local53;
			local44 -= local53;
			arg1 = 1;
		}
		if (local44 + arg1 >= this.anInt2747) {
			local53 = arg1 + local44 + 1 - this.anInt2747;
			local44 -= local53;
			local72 += local53;
		}
		if (local44 > 0 && local41 > 0) {
			local72 += this.anInt2747 * 7;
			return Static423.method5623(local72, local44, local38, local41, this.aByteArray36);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIILclient!i;)V")
	public void method2225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub2_Sub1 arg2) {
		@Pc(6) Class5_Sub2_Sub1_Sub1 local6 = (Class5_Sub2_Sub1_Sub1) arg2;
		arg1 += local6.anInt183 + 1;
		arg0 += local6.anInt186 + 1;
		@Pc(28) int local28 = arg1 + this.anInt2747 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt192;
		@Pc(36) int local36 = local6.anInt193;
		@Pc(41) int local41 = this.anInt2747 - local36;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local30 = local36 * local50;
			arg0 = 1;
			local28 += local50 * this.anInt2747;
			local33 -= local50;
		}
		if (arg0 + local33 >= this.anInt2739) {
			local50 = local33 + arg0 + 1 - this.anInt2739;
			local33 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local36 -= local50;
			local28 += local50;
			local41 += local50;
			arg1 = 1;
			local43 = local50;
			local30 += local50;
		}
		if (this.anInt2747 <= arg1 + local36) {
			local50 = local36 + arg1 + 1 - this.anInt2747;
			local43 += local50;
			local41 += local50;
			local36 -= local50;
		}
		if (local36 > 0 && local33 > 0) {
			Static157.method2215(local6.aByteArray2, local30, local36, this.aByteArray36, local41, local33, local28, local43);
			this.method2218(arg0, local33, arg1, local36);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III[[ZZI)V")
	public void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass200_Sub2_22.method5271(false);
		this.aClass200_Sub2_22.method5269(false);
		this.aClass200_Sub2_22.method5288(-2);
		this.aClass200_Sub2_22.method5297(1);
		this.aClass200_Sub2_22.method5295(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass200_Sub2_22.anInt6719 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg3) {
			for (local43 = 0; local43 < this.anInt2743; local43++) {
				local50 = local43 << this.anInt2746;
				local57 = local43 + 1 << this.anInt2746;
				label81: for (local59 = 0; local59 < this.anInt2736; local59++) {
					local63 = local59 << this.anInt2746;
					local68 = local59 + 1 << this.anInt2746;
					for (local75 = local63; local75 < local68; local75++) {
						if (-arg0 <= local75 - arg4 && local75 - arg4 <= arg0) {
							for (@Pc(329) int local329 = local50; local329 < local57; local329++) {
								if (-arg0 <= local329 - arg1 && local329 - arg1 <= arg0 && arg2[local75 + arg0 - arg4][arg0 + local329 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass246ArrayArray1[local59][local43].method5617();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt2743; local43++) {
				local50 = local43 << this.anInt2746;
				local57 = local43 + 1 << this.anInt2746;
				for (local59 = 0; local59 < this.anInt2736; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt2746;
					local75 = local59 + 1 << this.anInt2746;
					@Pc(79) Class5_Sub15_Sub1 local79 = this.aClass200_Sub2_22.aClass5_Sub15_Sub1_2;
					local79.anInt7013 = 0;
					for (@Pc(84) int local84 = local50; local84 < local57; local84++) {
						if (local84 - arg1 >= -arg0 && local84 - arg1 <= arg0) {
							@Pc(115) int local115 = local84 * this.aClass125_Sub1_3.anInt6301 + local68;
							for (@Pc(117) int local117 = local68; local117 < local75; local117++) {
								if (local117 - arg4 >= -arg0 && local117 - arg4 <= arg0 && arg2[arg0 + local117 - arg4][local84 + arg0 - arg1]) {
									@Pc(158) short[] local158 = this.aClass125_Sub1_3.aShortArrayArray7[local115];
									if (local158 != null) {
										@Pc(166) int local166;
										if (this.aClass200_Sub2_22.aBoolean433) {
											for (local166 = 0; local166 < local158.length; local166++) {
												local79.method5566(local158[local166] & 0xFFFF);
												local63++;
											}
										} else {
											for (local166 = 0; local166 < local158.length; local166++) {
												local63++;
												local79.method5568(local158[local166] & 0xFFFF);
											}
										}
									}
								}
								local115++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass246ArrayArray1[local59][local43].method5619(local63, local79.aByteArray93);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}
}
