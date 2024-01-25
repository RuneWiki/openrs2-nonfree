import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class311 {

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "Lclient!fs;")
	private Class134 aClass134_32;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	private int anInt8762;

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
	private int anInt8764;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "Z")
	private boolean aBoolean663 = true;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
	private int anInt8770 = -1;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	private final int anInt8767;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
	private final int anInt8769;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "[Lclient!ah;")
	private final Class11[] aClass11Array2;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	private final int anInt8765;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
	private final int anInt8771;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "[Lclient!ah;")
	private final Class11[] aClass11Array1;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Lclient!ah;")
	private final Class11 aClass11_1;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I[Lclient!ah;IIII)V")
	public Class311(@OriginalArg(0) int arg0, @OriginalArg(1) Class11[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8767 = arg5;
		this.anInt8769 = arg0;
		this.aClass11Array2 = arg1;
		this.anInt8765 = arg3;
		this.anInt8771 = arg4;
		if (arg1 == null) {
			this.aClass11_1 = null;
			this.aClass11Array1 = null;
		} else {
			this.aClass11Array1 = new Class11[arg1.length];
			this.aClass11_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public void method7506() {
		if (this.aClass11Array2 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.aClass11Array2.length; local18++) {
				this.aClass11Array2[local18].method254();
			}
		}
		this.aClass134_32 = null;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IILclient!ha;IIIIIII)V")
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg4 + arg5 & 0x3FFF;
		if (this.anInt8769 == -1 || this.anInt8764 == 0) {
			arg2.aa(arg1, arg3, arg7, arg8, arg6, 0);
		} else {
			@Pc(34) Class233 local34 = Static156.anInterface1_3.method2863(this.anInt8769);
			if (this.aClass134_32 == null && Static156.anInterface1_3.method2860(this.anInt8769)) {
				@Pc(80) int[] local80 = local34.anInt6313 == 2 ? Static156.anInterface1_3.method2862(this.anInt8764, 0.7F, this.anInt8769, this.anInt8764) : Static156.anInterface1_3.method2861(false, this.anInt8769, this.anInt8764, this.anInt8764, 0.7F);
				this.aClass134_32 = arg2.method7679(this.anInt8764, local80, this.anInt8764, this.anInt8764);
			}
			if (local34.anInt6313 == 2) {
				arg2.aa(arg1, arg3, arg7, arg8, arg6, 0);
			}
			if (this.aClass134_32 != null) {
				@Pc(121) int local121 = local34.anInt6313 == 2 ? 1 : 0;
				@Pc(127) int local127 = arg0 * arg8 / -4096;
				@Pc(140) int local140;
				for (local140 = (arg7 - arg8) / 2 + local7 * arg8 / 4096; local140 > arg8; local140 -= arg8) {
				}
				while (local140 < 0) {
					local140 += arg8;
				}
				while (arg8 < local127) {
					local127 -= arg8;
				}
				while (local127 < 0) {
					local127 += arg8;
				}
				for (@Pc(201) int local201 = local140 - arg8; local201 < arg7; local201 += arg8) {
					for (@Pc(208) int local208 = local127 - arg8; local208 < arg8; local208 += arg8) {
						this.aClass134_32.method9226(arg1 + local201, arg3 + local208, arg8, arg8, 1, 0, local121);
					}
				}
			}
		}
		for (@Pc(263) int local263 = this.anInt8762 - 1; local263 >= 0; local263--) {
			this.aClass11Array1[local263].method246(arg2, arg1, arg3, arg7, arg8, arg0, local7);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!ha;I)Z")
	public boolean method7509(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (this.anInt8770 != arg0) {
			this.anInt8770 = arg0;
			@Pc(20) int local20 = Static228.method3242(arg0);
			if (local20 > 512) {
				local20 = 512;
			}
			if (local20 <= 0) {
				local20 = 1;
			}
			if (this.anInt8764 != local20) {
				this.anInt8764 = local20;
				this.aClass134_32 = null;
			}
			if (this.aClass11Array2 != null) {
				this.anInt8762 = 0;
				@Pc(54) int[] local54 = new int[this.aClass11Array2.length];
				for (@Pc(56) int local56 = 0; local56 < this.aClass11Array2.length; local56++) {
					@Pc(63) Class11 local63 = this.aClass11Array2[local56];
					if (local63.method251(this.anInt8765, this.anInt8771, this.anInt8767, this.anInt8770)) {
						local54[this.anInt8762] = local63.anInt257;
						this.aClass11Array1[this.anInt8762++] = local63;
					}
				}
				Static370.method8913(0, local54, this.aClass11Array1, this.anInt8762 - 1);
			}
			this.aBoolean663 = true;
		}
		@Pc(124) boolean local124 = false;
		if (this.aBoolean663) {
			this.aBoolean663 = false;
			for (@Pc(135) int local135 = this.anInt8762 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass11Array1[local135].method245(arg1, this.aClass11_1);
				local124 |= local146;
				this.aBoolean663 |= !local146;
			}
		}
		return local124;
	}
}
