import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class207 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!o;")
	private Class49 aClass49_21;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	private int anInt5756;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	private int anInt5764;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Z")
	private boolean aBoolean391 = true;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	private int anInt5755 = -1;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	private final int anInt5763;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	private final int anInt5765;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	private final int anInt5766;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "I")
	private final int anInt5760;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[Lclient!gb;")
	private final Class85[] aClass85Array1;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "[Lclient!gb;")
	private final Class85[] aClass85Array2;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!gb;")
	private final Class85 aClass85_1;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I[Lclient!gb;IIII)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) Class85[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5763 = arg4;
		this.anInt5765 = arg3;
		this.anInt5766 = arg5;
		this.anInt5760 = arg0;
		this.aClass85Array1 = arg1;
		if (arg1 == null) {
			this.aClass85_1 = null;
			this.aClass85Array2 = null;
		} else {
			this.aClass85Array2 = new Class85[arg1.length];
			this.aClass85_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIILclient!za;IIII)V")
	public void method4567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class200 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg1 + arg2 & 0x3FFF;
		if (this.anInt5760 == -1) {
			arg5.P(arg8, arg0, arg6, arg7, arg3, 0);
		} else {
			@Pc(31) Class178 local31 = Static48.anInterface8_21.method4125(this.anInt5760);
			if (this.aClass49_21 == null && Static48.anInterface8_21.method4123(this.anInt5760)) {
				@Pc(67) int[] local67 = local31.aBoolean323 ? Static48.anInterface8_21.method4124(this.anInt5760, this.anInt5764, this.anInt5764, 0.7F) : Static48.anInterface8_21.method4126(this.anInt5764, this.anInt5760, this.anInt5764, false, 0.7F);
				this.aClass49_21 = arg5.method5849(local67, this.anInt5764, this.anInt5764, this.anInt5764);
			}
			if (local31.aBoolean323) {
				arg5.P(arg8, arg0, arg6, arg7, arg3, 0);
			}
			if (this.aClass49_21 != null) {
				@Pc(100) int local100 = local31.aBoolean323 ? 1 : 0;
				@Pc(106) int local106 = arg7 * arg4 / -4096;
				@Pc(118) int local118;
				for (local118 = (arg6 - arg7) / 2 + arg7 * local7 / 4096; local118 > arg7; local118 -= arg7) {
				}
				while (local118 < 0) {
					local118 += arg7;
				}
				while (arg7 < local106) {
					local106 -= arg7;
				}
				while (local106 < 0) {
					local106 += arg7;
				}
				for (@Pc(161) int local161 = local118 - arg7; local161 < arg6; local161 += arg7) {
					for (@Pc(167) int local167 = local106 - arg7; local167 < arg7; local167 += arg7) {
						this.aClass49_21.ya(arg8 + local161, local167 + arg0, arg7, arg7, 1, 0, local100);
					}
				}
			}
		}
		for (@Pc(210) int local210 = this.anInt5756 - 1; local210 >= 0; local210--) {
			this.aClass85Array2[local210].method1843(arg5, arg8, arg0, arg6, arg7, arg4, local7);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public void method4569() {
		if (this.aClass85Array1 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.aClass85Array1.length; local21++) {
				this.aClass85Array1[local21].method1845();
			}
		}
		this.aClass49_21 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!za;II)Z")
	public boolean method4572(@OriginalArg(0) Class200 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt5755) {
			this.anInt5755 = arg1;
			@Pc(16) int local16 = Static313.method4879(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt5764 != local16) {
				this.aClass49_21 = null;
				this.anInt5764 = local16;
			}
			if (this.aClass85Array1 != null) {
				this.anInt5756 = 0;
				@Pc(46) int[] local46 = new int[this.aClass85Array1.length];
				for (@Pc(48) int local48 = 0; local48 < this.aClass85Array1.length; local48++) {
					@Pc(55) Class85 local55 = this.aClass85Array1[local48];
					if (local55.method1844(this.anInt5765, this.anInt5763, this.anInt5766, this.anInt5755)) {
						local46[this.anInt5756] = local55.anInt2294;
						this.aClass85Array2[this.anInt5756++] = local55;
					}
				}
				Static133.method1867(local46, this.aClass85Array2, this.anInt5756 - 1, 0);
			}
			this.aBoolean391 = true;
		}
		@Pc(127) boolean local127 = false;
		if (this.aBoolean391) {
			this.aBoolean391 = false;
			for (@Pc(138) int local138 = this.anInt5756 - 1; local138 >= 0; local138--) {
				@Pc(149) boolean local149 = this.aClass85Array2[local138].method1847(arg0, this.aClass85_1);
				local127 |= local149;
				this.aBoolean391 |= !local149;
			}
		}
		return local127;
	}
}
