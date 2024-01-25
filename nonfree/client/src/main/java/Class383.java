import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class383 {

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/lang/String;")
	public static final String aString119;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString118;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "[[Lclient!hba;")
	private Class143[][] aClass143ArrayArray1;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_42;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!lc;")
	private final Class109_Sub2 aClass109_Sub2_3;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "I")
	public final int anInt10578;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	private final int anInt10569;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	private final int anInt10575;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[B")
	public final byte[] aByteArray108;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	private final int anInt10579;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	private final int anInt10576;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString119 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString118 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		local1.toLowerCase();
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!ck;Lclient!lc;)V")
	public Class383(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class109_Sub2 arg1) {
		this.aClass65_Sub1_42 = arg0;
		this.aClass109_Sub2_3 = arg1;
		this.anInt10578 = (this.aClass109_Sub2_3.anInt9061 * this.aClass109_Sub2_3.anInt9063 >> this.aClass65_Sub1_42.anInt1381) + 2;
		this.anInt10569 = (this.aClass109_Sub2_3.anInt9063 * this.aClass109_Sub2_3.anInt9065 >> this.aClass65_Sub1_42.anInt1381) + 2;
		this.anInt10575 = this.aClass65_Sub1_42.anInt1381 + 7 - this.aClass109_Sub2_3.anInt9066;
		this.aByteArray108 = new byte[this.anInt10569 * this.anInt10578];
		this.anInt10579 = this.aClass109_Sub2_3.anInt9061 >> this.anInt10575;
		this.anInt10576 = this.aClass109_Sub2_3.anInt9065 >> this.anInt10575;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!r;I)V")
	public void method8793(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub3_Sub7_Sub2 local6 = (Class5_Sub3_Sub7_Sub2) arg1;
		arg0 += local6.anInt7303 + 1;
		arg2 += local6.anInt7310 + 1;
		@Pc(32) int local32 = arg2 + this.anInt10578 * arg0;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local6.anInt7304;
		@Pc(40) int local40 = local6.anInt7309;
		@Pc(45) int local45 = this.anInt10578 - local40;
		@Pc(47) int local47 = 0;
		@Pc(54) int local54;
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			arg0 = 1;
			local34 = local40 * local54;
			local37 -= local54;
			local32 += this.anInt10578 * local54;
		}
		if (local37 + arg0 >= this.anInt10569) {
			local54 = local37 + arg0 + 1 - this.anInt10569;
			local37 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local32 += local54;
			local34 += local54;
			local47 = local54;
			local45 += local54;
			arg2 = 1;
			local40 -= local54;
		}
		if (this.anInt10578 <= local40 + arg2) {
			local54 = local40 + arg2 + 1 - this.anInt10578;
			local47 += local54;
			local40 -= local54;
			local45 += local54;
		}
		if (local40 > 0 && local37 > 0) {
			Static375.method5609(local37, local32, local47, local6.aByteArray70, this.aByteArray108, local45, local40, local34);
			this.method8794(arg0, local37, local40, arg2);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBIII)V")
	private void method8794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass143ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(52) int local52 = arg1 + arg0 - 1 - 1 >> 7;
		for (@Pc(54) int local54 = local15; local54 <= local25; local54++) {
			@Pc(61) Class143[] local61 = this.aClass143ArrayArray1[local54];
			for (@Pc(63) int local63 = local31; local63 <= local52; local63++) {
				local61[local63].aBoolean333 = true;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public void method8795() {
		this.aClass143ArrayArray1 = new Class143[this.anInt10579][this.anInt10576];
		for (@Pc(20) int local20 = 0; local20 < this.anInt10576; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt10579; local24++) {
				this.aClass143ArrayArray1[local24][local20] = new Class143(this.aClass65_Sub1_42, this, this.aClass109_Sub2_3, local24, local20, this.anInt10575, local24 * 128 + 1, local20 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZII[[ZII)V")
	public void method8796(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass65_Sub1_42.method1285(false);
		this.aClass65_Sub1_42.method1297(false);
		this.aClass65_Sub1_42.method1246(-2);
		this.aClass65_Sub1_42.method1290(1);
		this.aClass65_Sub1_42.method1231(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass65_Sub1_42.anInt1382 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg0) {
			for (local43 = 0; local43 < this.anInt10576; local43++) {
				local50 = local43 << this.anInt10575;
				local57 = local43 + 1 << this.anInt10575;
				label128: for (local59 = 0; local59 < this.anInt10579; local59++) {
					local66 = local59 << this.anInt10575;
					local73 = local59 + 1 << this.anInt10575;
					for (local75 = local66; local75 < local73; local75++) {
						if (-arg3 <= local75 - arg1 && local75 - arg1 <= arg3) {
							for (@Pc(95) int local95 = local50; local95 < local57; local95++) {
								if (local95 - arg4 >= -arg3 && local95 - arg4 <= arg3 && arg2[local75 + arg3 - arg1][arg3 + local95 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass143ArrayArray1[local59][local43].method3456();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt10576; local43++) {
				local50 = local43 << this.anInt10575;
				local57 = local43 + 1 << this.anInt10575;
				for (local59 = 0; local59 < this.anInt10579; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt10575;
					local75 = local59 + 1 << this.anInt10575;
					@Pc(230) Class5_Sub41_Sub1 local230 = this.aClass65_Sub1_42.aClass5_Sub41_Sub1_2;
					local230.anInt9230 = 0;
					for (@Pc(235) int local235 = local50; local235 < local57; local235++) {
						if (-arg3 <= local235 - arg4 && arg3 >= local235 - arg4) {
							@Pc(266) int local266 = this.aClass109_Sub2_3.anInt9061 * local235 + local73;
							for (@Pc(268) int local268 = local73; local268 < local75; local268++) {
								if (-arg3 <= local268 - arg1 && arg3 >= local268 - arg1 && arg2[local268 + arg3 - arg1][arg3 + local235 - arg4]) {
									@Pc(308) short[] local308 = this.aClass109_Sub2_3.aShortArrayArray8[local266];
									if (local308 != null) {
										@Pc(316) int local316;
										if (this.aClass65_Sub1_42.aBoolean97) {
											for (local316 = 0; local316 < local308.length; local316++) {
												local66++;
												local230.method7848(local308[local316] & 0xFFFF);
											}
										} else {
											for (local316 = 0; local316 < local308.length; local316++) {
												local230.method7821(local308[local316] & 0xFFFF);
												local66++;
											}
										}
									}
								}
								local266++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass143ArrayArray1[local59][local43].method3454(local230.aByteArray93, local66);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method8797(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub3_Sub7_Sub2 local6 = (Class5_Sub3_Sub7_Sub2) arg1;
		arg2 += local6.anInt7303 + 1;
		arg0 += local6.anInt7310 + 1;
		@Pc(35) int local35 = arg0 + arg2 * this.anInt10578;
		@Pc(38) int local38 = local6.anInt7304;
		@Pc(41) int local41 = local6.anInt7309;
		@Pc(47) int local47 = this.anInt10578 - local41;
		@Pc(57) int local57;
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			arg2 = 1;
			local38 -= local57;
			local35 += local57 * this.anInt10578;
		}
		if (this.anInt10569 <= local38 + arg2) {
			local57 = local38 + arg2 + 1 - this.anInt10569;
			local38 -= local57;
		}
		if (arg0 <= 0) {
			local57 = 1 - arg0;
			local47 += local57;
			arg0 = 1;
			local35 += local57;
			local41 -= local57;
		}
		if (this.anInt10578 <= local41 + arg0) {
			local57 = local41 + arg0 + 1 - this.anInt10578;
			local41 -= local57;
			local47 += local57;
		}
		if (local41 > 0 && local38 > 0) {
			local47 += this.anInt10578 * 7;
			return Static300.method8579(local47, local35, local38, local41, this.aByteArray108);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IILclient!r;I)V")
	public void method8798(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub3_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class5_Sub3_Sub7_Sub2 local14 = (Class5_Sub3_Sub7_Sub2) arg1;
		arg2 += local14.anInt7303 + 1;
		arg0 += local14.anInt7310 + 1;
		@Pc(35) int local35 = arg2 * this.anInt10578 + arg0;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = local14.anInt7304;
		@Pc(43) int local43 = local14.anInt7309;
		@Pc(49) int local49 = this.anInt10578 - local43;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local40 -= local56;
			arg2 = 1;
			local35 += local56 * this.anInt10578;
			local37 = local43 * local56;
		}
		@Pc(77) int local77 = 0;
		if (local40 + arg2 >= this.anInt10569) {
			local56 = local40 + arg2 + 1 - this.anInt10569;
			local40 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			arg0 = 1;
			local49 += local56;
			local37 += local56;
			local77 = local56;
			local43 -= local56;
			local35 += local56;
		}
		if (this.anInt10578 <= arg0 + local43) {
			local56 = local43 + arg0 + 1 - this.anInt10578;
			local49 += local56;
			local43 -= local56;
			local77 += local56;
		}
		if (local43 > 0 && local40 > 0) {
			Static206.method3295(local37, this.aByteArray108, local35, local43, local40, local49, local77, local14.aByteArray70);
			this.method8794(arg2, local40, local43, arg0);
		}
	}
}
