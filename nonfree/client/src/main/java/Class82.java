import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class82 {

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
	private int anInt2492;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
	private int anInt2493;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "Lclient!ha;")
	private Class25 aClass25_6;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	private int anInt2487 = -1;

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	private final int anInt2488;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	private final int anInt2490;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	private final int anInt2486;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "[Lclient!saa;")
	private final Class263[] aClass263Array1;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	private final int anInt2491;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!saa;")
	private final Class263 aClass263_1;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "[Lclient!saa;")
	private final Class263[] aClass263Array2;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I[Lclient!saa;IIII)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) Class263[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2488 = arg4;
		this.anInt2490 = arg3;
		this.anInt2486 = arg0;
		this.aClass263Array1 = arg1;
		this.anInt2491 = arg5;
		if (arg1 == null) {
			this.aClass263_1 = null;
			this.aClass263Array2 = null;
		} else {
			this.aClass263Array2 = new Class263[arg1.length];
			this.aClass263_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!qa;IZIIIII)V")
	public void method2239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = arg1 + arg4 & 0x3FFF;
		if (this.anInt2486 == -1) {
			arg2.f(arg3, arg0, arg5, arg6, arg7, 0);
		} else {
			@Pc(37) Class271 local37 = Static405.anInterface8_119.method7237(this.anInt2486);
			if (this.aClass25_6 == null && Static405.anInterface8_119.method7236(this.anInt2486)) {
				@Pc(73) int[] local73 = local37.aBoolean562 ? Static405.anInterface8_119.method7232(0.7F, this.anInt2492, this.anInt2486, this.anInt2492) : Static405.anInterface8_119.method7234(this.anInt2492, this.anInt2492, false, this.anInt2486, 0.7F);
				this.aClass25_6 = arg2.method7021(local73, this.anInt2492, this.anInt2492, this.anInt2492);
			}
			if (local37.aBoolean562) {
				arg2.f(arg3, arg0, arg5, arg6, arg7, 0);
			}
			if (this.aClass25_6 != null) {
				@Pc(106) int local106 = local37.aBoolean562 ? 1 : 0;
				@Pc(112) int local112 = arg6 * arg8 / -4096;
				@Pc(124) int local124;
				for (local124 = local13 * arg6 / 4096 + (arg5 - arg6) / 2; local124 > arg6; local124 -= arg6) {
				}
				while (local112 > arg6) {
					local112 -= arg6;
				}
				while (local124 < 0) {
					local124 += arg6;
				}
				while (local112 < 0) {
					local112 += arg6;
				}
				for (@Pc(162) int local162 = local124 - arg6; local162 < arg5; local162 += arg6) {
					for (@Pc(169) int local169 = local112 - arg6; local169 < arg6; local169 += arg6) {
						this.aClass25_6.ra(local162 + arg3, arg0 + local169, arg6, arg6, 1, 0, local106);
					}
				}
			}
		}
		for (@Pc(213) int local213 = this.anInt2493 - 1; local213 >= 0; local213--) {
			this.aClass263Array2[local213].method6242(arg2, arg3, arg0, arg5, arg6, arg8, local13);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public void method2240() {
		if (this.aClass263Array1 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.aClass263Array1.length; local19++) {
				this.aClass263Array1[local19].method6248();
			}
		}
		this.aClass25_6 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!qa;I)Z")
	public boolean method2242(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt2487) {
			this.anInt2487 = arg1;
			@Pc(12) int local12 = Static7.method265(arg1);
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 <= 0) {
				local12 = 1;
			}
			if (local12 != this.anInt2492) {
				this.anInt2492 = local12;
				this.aClass25_6 = null;
			}
			if (this.aClass263Array1 != null) {
				this.anInt2493 = 0;
				@Pc(46) int[] local46 = new int[this.aClass263Array1.length];
				for (@Pc(48) int local48 = 0; local48 < this.aClass263Array1.length; local48++) {
					@Pc(55) Class263 local55 = this.aClass263Array1[local48];
					if (local55.method6246(this.anInt2490, this.anInt2488, this.anInt2491, this.anInt2487)) {
						local46[this.anInt2493] = local55.anInt7700;
						this.aClass263Array2[this.anInt2493++] = local55;
					}
				}
				Static362.method5535(0, local46, this.aClass263Array2, this.anInt2493 - 1);
			}
			this.aBoolean161 = true;
		}
		@Pc(118) boolean local118 = false;
		if (this.aBoolean161) {
			this.aBoolean161 = false;
			for (@Pc(129) int local129 = this.anInt2493 - 1; local129 >= 0; local129--) {
				@Pc(140) boolean local140 = this.aClass263Array2[local129].method6243(arg0, this.aClass263_1);
				local118 |= local140;
				this.aBoolean161 |= !local140;
			}
		}
		return local118;
	}
}
