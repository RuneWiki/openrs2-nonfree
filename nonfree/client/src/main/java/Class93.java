import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class93 {

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	private int anInt2387;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
	private int anInt2388;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Lclient!ho;")
	private Class9 aClass9_15;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
	private int anInt2385 = -1;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "Z")
	private boolean aBoolean149 = true;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
	private final int anInt2392;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	private final int anInt2390;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "[Lclient!cfa;")
	private final Class51[] aClass51Array2;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
	private final int anInt2386;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
	private final int anInt2383;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "[Lclient!cfa;")
	private final Class51[] aClass51Array1;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "Lclient!cfa;")
	private final Class51 aClass51_1;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(I[Lclient!cfa;IIII)V")
	public Class93(@OriginalArg(0) int arg0, @OriginalArg(1) Class51[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2392 = arg4;
		this.anInt2390 = arg3;
		this.aClass51Array2 = arg1;
		this.anInt2386 = arg0;
		this.anInt2383 = arg5;
		if (arg1 == null) {
			this.aClass51Array1 = null;
			this.aClass51_1 = null;
		} else {
			this.aClass51Array1 = new Class51[arg1.length];
			this.aClass51_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIILclient!ha;IIII)V")
	public void method2056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class132 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg7 + arg8 & 0x3FFF;
		if (this.anInt2386 == -1 || this.anInt2387 == 0) {
			arg4.aa(arg0, arg1, arg2, arg6, arg3, 0);
		} else {
			@Pc(41) Class294 local41 = Static131.anInterface6_2.method7088(this.anInt2386);
			if (this.aClass9_15 == null && Static131.anInterface6_2.method7090(this.anInt2386)) {
				@Pc(80) int[] local80 = local41.anInt8333 == 2 ? Static131.anInterface6_2.method7089(this.anInt2386, 0.7F, this.anInt2387, this.anInt2387) : Static131.anInterface6_2.method7085(this.anInt2387, false, this.anInt2386, 0.7F, this.anInt2387);
				this.aClass9_15 = arg4.method7444(local80, this.anInt2387, this.anInt2387, this.anInt2387);
			}
			if (local41.anInt8333 == 2) {
				arg4.aa(arg0, arg1, arg2, arg6, arg3, 0);
			}
			if (this.aClass9_15 != null) {
				@Pc(120) int local120 = local41.anInt8333 == 2 ? 1 : 0;
				@Pc(126) int local126 = arg6 * arg5 / -4096;
				@Pc(139) int local139;
				for (local139 = arg6 * local8 / 4096 + (arg2 - arg6) / 2; local139 > arg6; local139 -= arg6) {
				}
				while (local139 < 0) {
					local139 += arg6;
				}
				while (local126 > arg6) {
					local126 -= arg6;
				}
				while (local126 < 0) {
					local126 += arg6;
				}
				for (@Pc(185) int local185 = local139 - arg6; local185 < arg2; local185 += arg6) {
					for (@Pc(192) int local192 = local126 - arg6; local192 < arg6; local192 += arg6) {
						this.aClass9_15.method8924(local185 + arg0, arg1 + local192, arg6, arg6, 1, 0, local120);
					}
				}
			}
		}
		for (@Pc(235) int local235 = this.anInt2388 - 1; local235 >= 0; local235--) {
			this.aClass51Array1[local235].method1250(arg4, arg0, arg1, arg2, arg6, arg5, local8);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!ha;BI)Z")
	public boolean method2057(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2385 != arg1) {
			this.anInt2385 = arg1;
			@Pc(16) int local16 = Static199.method2911(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt2387) {
				this.aClass9_15 = null;
				this.anInt2387 = local16;
			}
			if (this.aClass51Array2 != null) {
				this.anInt2388 = 0;
				@Pc(46) int[] local46 = new int[this.aClass51Array2.length];
				for (@Pc(48) int local48 = 0; local48 < this.aClass51Array2.length; local48++) {
					@Pc(55) Class51 local55 = this.aClass51Array2[local48];
					if (local55.method1254(this.anInt2390, this.anInt2392, this.anInt2383, this.anInt2385)) {
						local46[this.anInt2388] = local55.anInt1370;
						this.aClass51Array1[this.anInt2388++] = local55;
					}
				}
				Static346.method5045(this.aClass51Array1, 0, this.anInt2388 - 1, local46);
			}
			this.aBoolean149 = true;
		}
		@Pc(104) boolean local104 = false;
		if (this.aBoolean149) {
			this.aBoolean149 = false;
			for (@Pc(115) int local115 = this.anInt2388 - 1; local115 >= 0; local115--) {
				@Pc(126) boolean local126 = this.aClass51Array1[local115].method1251(arg0, this.aClass51_1);
				local104 |= local126;
				this.aBoolean149 |= !local126;
			}
		}
		return local104;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
	public void method2058() {
		if (this.aClass51Array2 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.aClass51Array2.length; local21++) {
				this.aClass51Array2[local21].method1257();
			}
		}
		this.aClass9_15 = null;
	}
}
