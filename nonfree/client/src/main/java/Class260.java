import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class260 {

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
	private int anInt7804;

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
	private int anInt7809;

	@OriginalMember(owner = "client!pfa", name = "j", descriptor = "Lclient!f;")
	private Class88 aClass88_27;

	@OriginalMember(owner = "client!pfa", name = "l", descriptor = "Z")
	private boolean aBoolean563 = true;

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
	private int anInt7805 = -1;

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
	private final int anInt7810;

	@OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
	private final int anInt7811;

	@OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
	private final int anInt7812;

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "[Lclient!vs;")
	private final Class350[] aClass350Array1;

	@OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
	private final int anInt7814;

	@OriginalMember(owner = "client!pfa", name = "n", descriptor = "[Lclient!vs;")
	private final Class350[] aClass350Array2;

	@OriginalMember(owner = "client!pfa", name = "e", descriptor = "Lclient!vs;")
	private final Class350 aClass350_1;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I[Lclient!vs;IIII)V")
	public Class260(@OriginalArg(0) int arg0, @OriginalArg(1) Class350[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7810 = arg4;
		this.anInt7811 = arg3;
		this.anInt7812 = arg5;
		this.aClass350Array1 = arg1;
		this.anInt7814 = arg0;
		if (arg1 == null) {
			this.aClass350Array2 = null;
			this.aClass350_1 = null;
		} else {
			this.aClass350Array2 = new Class350[arg1.length];
			this.aClass350_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIILclient!r;IIIIIZ)V")
	public void method6106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(11) int local11 = arg5 + arg1 & 0x3FFF;
		if (this.anInt7814 == -1 || this.anInt7809 == 0) {
			arg3.J(arg7, arg6, arg2, arg4, arg8, 0);
		} else {
			@Pc(27) Class69 local27 = Static99.anInterface7_4.method4460(this.anInt7814);
			if (this.aClass88_27 == null && Static99.anInterface7_4.method4463(this.anInt7814)) {
				@Pc(63) int[] local63 = local27.aBoolean180 ? Static99.anInterface7_4.method4464(this.anInt7809, this.anInt7814, 0.7F, this.anInt7809) : Static99.anInterface7_4.method4462(this.anInt7809, false, this.anInt7814, 0.7F, this.anInt7809);
				this.aClass88_27 = arg3.method7838(local63, this.anInt7809, this.anInt7809, this.anInt7809);
			}
			if (local27.aBoolean180) {
				arg3.J(arg7, arg6, arg2, arg4, arg8, 0);
			}
			if (this.aClass88_27 != null) {
				@Pc(96) int local96 = local27.aBoolean180 ? 1 : 0;
				@Pc(102) int local102 = arg4 * arg0 / -4096;
				@Pc(115) int local115;
				for (local115 = arg4 * local11 / 4096 + (arg2 - arg4) / 2; local115 > arg4; local115 -= arg4) {
				}
				while (local115 < 0) {
					local115 += arg4;
				}
				while (local102 > arg4) {
					local102 -= arg4;
				}
				while (local102 < 0) {
					local102 += arg4;
				}
				for (@Pc(157) int local157 = local115 - arg4; local157 < arg2; local157 += arg4) {
					for (@Pc(163) int local163 = local102 - arg4; local163 < arg4; local163 += arg4) {
						this.aClass88_27.method8049(arg7 + local157, arg6 + local163, arg4, arg4, 1, 0, local96);
					}
				}
			}
		}
		for (@Pc(212) int local212 = this.anInt7804 - 1; local212 >= 0; local212--) {
			this.aClass350Array2[local212].method8010(arg3, arg7, arg6, arg2, arg4, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!r;BI)Z")
	public boolean method6108(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1) {
		@Pc(55) int local55;
		if (this.anInt7805 != arg1) {
			this.anInt7805 = arg1;
			@Pc(16) int local16 = Static205.method3349(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt7809) {
				this.anInt7809 = local16;
				this.aClass88_27 = null;
			}
			if (this.aClass350Array1 != null) {
				this.anInt7804 = 0;
				@Pc(53) int[] local53 = new int[this.aClass350Array1.length];
				for (local55 = 0; local55 < this.aClass350Array1.length; local55++) {
					@Pc(62) Class350 local62 = this.aClass350Array1[local55];
					if (local62.method8007(this.anInt7811, this.anInt7810, this.anInt7812, this.anInt7805)) {
						local53[this.anInt7804] = local62.anInt10289;
						this.aClass350Array2[this.anInt7804++] = local62;
					}
				}
				Static111.method2045(0, local53, this.anInt7804 - 1, this.aClass350Array2);
			}
			this.aBoolean563 = true;
		}
		@Pc(127) boolean local127 = false;
		if (this.aBoolean563) {
			this.aBoolean563 = false;
			for (local55 = this.anInt7804 - 1; local55 >= 0; local55--) {
				@Pc(149) boolean local149 = this.aClass350Array2[local55].method8008(arg0, this.aClass350_1);
				this.aBoolean563 |= !local149;
				local127 |= local149;
			}
		}
		return local127;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)V")
	public void method6109() {
		if (this.aClass350Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass350Array1.length; local10++) {
				this.aClass350Array1[local10].method8006();
			}
		}
		this.aClass88_27 = null;
	}
}
