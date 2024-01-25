import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class265 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!aa;")
	private Class2 aClass2_27;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
	private int anInt7563;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
	private int anInt7567;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Z")
	private boolean aBoolean556 = true;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
	private int anInt7562 = -1;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
	private final int anInt7560;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "[Lclient!kk;")
	private final Class132[] aClass132Array1;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
	private final int anInt7561;

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
	private final int anInt7566;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
	private final int anInt7565;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Lclient!kk;")
	private final Class132 aClass132_1;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "[Lclient!kk;")
	private final Class132[] aClass132Array2;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I[Lclient!kk;IIII)V")
	public Class265(@OriginalArg(0) int arg0, @OriginalArg(1) Class132[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7560 = arg3;
		this.aClass132Array1 = arg1;
		this.anInt7561 = arg4;
		this.anInt7566 = arg0;
		this.anInt7565 = arg5;
		if (arg1 == null) {
			this.aClass132_1 = null;
			this.aClass132Array2 = null;
		} else {
			this.aClass132Array2 = new Class132[arg1.length];
			this.aClass132_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIILclient!qa;III)V")
	public void method6063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg1 + arg3 & 0x3FFF;
		if (this.anInt7566 == -1) {
			arg5.M(arg4, arg8, arg7, arg6, arg2, 0);
		} else {
			@Pc(22) Class160 local22 = Static2.anInterface4_1.method5685(this.anInt7566);
			if (this.aClass2_27 == null && Static2.anInterface4_1.method5684(this.anInt7566)) {
				@Pc(60) int[] local60 = local22.aBoolean320 ? Static2.anInterface4_1.method5683(this.anInt7563, this.anInt7563, this.anInt7566, 0.7F) : Static2.anInterface4_1.method5686(0.7F, false, this.anInt7563, this.anInt7563, this.anInt7566);
				this.aClass2_27 = arg5.method2055(local60, this.anInt7563, this.anInt7563, this.anInt7563);
			}
			if (local22.aBoolean320) {
				arg5.M(arg4, arg8, arg7, arg6, arg2, 0);
			}
			if (this.aClass2_27 != null) {
				@Pc(93) int local93 = local22.aBoolean320 ? 1 : 0;
				@Pc(99) int local99 = arg0 * arg6 / -4096;
				@Pc(112) int local112;
				for (local112 = (arg7 - arg6) / 2 + arg6 * local11 / 4096; local112 > arg6; local112 -= arg6) {
				}
				while (local112 < 0) {
					local112 += arg6;
				}
				while (local99 > arg6) {
					local99 -= arg6;
				}
				while (local99 < 0) {
					local99 += arg6;
				}
				for (@Pc(161) int local161 = local112 - arg6; local161 < arg7; local161 += arg6) {
					for (@Pc(168) int local168 = local99 - arg6; local168 < arg6; local168 += arg6) {
						this.aClass2_27.XA(local161 + arg4, arg8 + local168, arg6, arg6, 1, 0, local93);
					}
				}
			}
		}
		for (@Pc(213) int local213 = this.anInt7567 - 1; local213 >= 0; local213--) {
			this.aClass132Array2[local213].method3642(arg5, arg4, arg8, arg7, arg6, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public void method6064() {
		if (this.aClass132Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass132Array1.length; local14++) {
				this.aClass132Array1[local14].method3639();
			}
		}
		this.aClass2_27 = null;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!qa;IB)Z")
	public boolean method6065(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anInt7562) {
			this.anInt7562 = arg1;
			@Pc(28) int local28 = Static284.method4425(arg1);
			if (local28 > 512) {
				local28 = 512;
			}
			if (local28 <= 0) {
				local28 = 1;
			}
			if (local28 != this.anInt7563) {
				this.aClass2_27 = null;
				this.anInt7563 = local28;
			}
			if (this.aClass132Array1 != null) {
				this.anInt7567 = 0;
				@Pc(60) int[] local60 = new int[this.aClass132Array1.length];
				for (@Pc(62) int local62 = 0; local62 < this.aClass132Array1.length; local62++) {
					@Pc(69) Class132 local69 = this.aClass132Array1[local62];
					if (local69.method3635(this.anInt7560, this.anInt7561, this.anInt7565, this.anInt7562)) {
						local60[this.anInt7567] = local69.anInt4208;
						this.aClass132Array2[this.anInt7567++] = local69;
					}
				}
				Static350.method5101(this.aClass132Array2, local60, this.anInt7567 - 1, 0);
			}
			this.aBoolean556 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean556) {
			this.aBoolean556 = false;
			for (@Pc(133) int local133 = this.anInt7567 - 1; local133 >= 0; local133--) {
				@Pc(144) boolean local144 = this.aClass132Array2[local133].method3636(arg0, this.aClass132_1);
				local122 |= local144;
				this.aBoolean556 |= !local144;
			}
		}
		return local122;
	}
}
