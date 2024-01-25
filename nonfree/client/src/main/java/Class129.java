import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class129 {

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	private int anInt3631;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "Lclient!f;")
	private Class3 aClass3_10;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
	private int anInt3640;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
	private int anInt3635 = -1;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "Z")
	private boolean aBoolean271 = true;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
	private final int anInt3628;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	private final int anInt3630;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "[Lclient!te;")
	private final Class228[] aClass228Array1;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	private final int anInt3633;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	private final int anInt3639;

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "[Lclient!te;")
	private final Class228[] aClass228Array2;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Lclient!te;")
	private final Class228 aClass228_1;

	static {
		new Class242("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I[Lclient!te;IIII)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) Class228[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3628 = arg5;
		this.anInt3630 = arg4;
		this.aClass228Array1 = arg1;
		this.anInt3633 = arg3;
		this.anInt3639 = arg0;
		if (arg1 == null) {
			this.aClass228_1 = null;
			this.aClass228Array2 = null;
		} else {
			this.aClass228Array2 = new Class228[arg1.length];
			this.aClass228_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBLclient!qa;)Z")
	public boolean method2794(@OriginalArg(0) int arg0, @OriginalArg(2) Class30 arg1) {
		if (arg0 != this.anInt3635) {
			this.anInt3635 = arg0;
			@Pc(17) int local17 = Static183.method2711(arg0);
			if (arg0 < local17) {
				local17 = Static79.method1390(arg0);
			}
			if (local17 > 512) {
				local17 = 512;
			}
			if (local17 != this.anInt3631) {
				this.anInt3631 = local17;
				this.aClass3_10 = null;
			}
			if (this.aClass228Array1 != null) {
				this.anInt3640 = 0;
				@Pc(60) int[] local60 = new int[this.aClass228Array1.length];
				for (@Pc(62) int local62 = 0; local62 < this.aClass228Array1.length; local62++) {
					@Pc(69) Class228 local69 = this.aClass228Array1[local62];
					if (local69.method5138(this.anInt3633, this.anInt3630, this.anInt3628, this.anInt3635)) {
						local60[this.anInt3640] = local69.anInt6611;
						this.aClass228Array2[this.anInt3640++] = local69;
					}
				}
				Static372.method5825(this.aClass228Array2, 0, local60, this.anInt3640 - 1);
			}
			this.aBoolean271 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean271) {
			this.aBoolean271 = false;
			for (@Pc(133) int local133 = this.anInt3640 - 1; local133 >= 0; local133--) {
				@Pc(144) boolean local144 = this.aClass228Array2[local133].method5139(arg1, this.aClass228_1);
				local122 |= local144;
				this.aBoolean271 |= !local144;
			}
		}
		return local122;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public void method2795() {
		if (this.aClass228Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass228Array1.length; local14++) {
				this.aClass228Array1[local14].method5132();
			}
		}
		this.aClass3_10 = null;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIILclient!qa;IIII)V")
	public void method2797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class30 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg0 + arg7 & 0x3FFF;
		if (this.anInt3639 == -1) {
			arg5.NA(arg8, arg4, arg1, arg6, arg3, 0);
		} else {
			@Pc(32) Class118 local32 = Static376.anInterface10_8.method4241(this.anInt3639);
			if (this.aClass3_10 == null && Static376.anInterface10_8.method4242(this.anInt3639)) {
				@Pc(68) int[] local68 = local32.aBoolean237 ? Static376.anInterface10_8.method4238(0.7F, this.anInt3639, this.anInt3631, false, this.anInt3631) : Static376.anInterface10_8.method4239(this.anInt3639, this.anInt3631, this.anInt3631, 0.7F);
				this.aClass3_10 = arg5.method4672(local68, this.anInt3631, this.anInt3631, this.anInt3631);
			}
			if (!local32.aBoolean237) {
				arg5.NA(arg8, arg4, arg1, arg6, arg3, 0);
			}
			if (this.aClass3_10 != null) {
				@Pc(101) int local101 = local32.aBoolean237 ? 0 : 1;
				@Pc(107) int local107 = arg6 * arg2 / -4096;
				@Pc(120) int local120;
				for (local120 = (arg1 - arg6) / 2 + local7 * arg6 / 4096; local120 > arg6; local120 -= arg6) {
				}
				while (local120 < 0) {
					local120 += arg6;
				}
				while (arg6 < local107) {
					local107 -= arg6;
				}
				while (local107 < 0) {
					local107 += arg6;
				}
				for (@Pc(162) int local162 = local120 - arg6; local162 < arg1; local162 += arg6) {
					for (@Pc(169) int local169 = local107 - arg6; local169 < arg6; local169 += arg6) {
						this.aClass3_10.M(arg8 + local162, arg4 + local169, arg6, arg6, 1, 0, local101);
					}
				}
			}
		}
		for (@Pc(217) int local217 = this.anInt3640 - 1; local217 >= 0; local217--) {
			this.aClass228Array2[local217].method5137(arg5, arg8, arg4, arg1, arg6, arg2, local7);
		}
	}
}
