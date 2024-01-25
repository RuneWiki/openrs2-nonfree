import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class101 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	private int anInt2455;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!tr;")
	private Class110 aClass110_7;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	private int anInt2464;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	private int anInt2459 = -1;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "[Lclient!fn;")
	private final Class85[] aClass85Array2;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	private final int anInt2461;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	private final int anInt2460;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	private final int anInt2457;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "I")
	private final int anInt2466;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[Lclient!fn;")
	private final Class85[] aClass85Array1;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!fn;")
	private final Class85 aClass85_1;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[Lclient!fn;IIII)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) Class85[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass85Array2 = arg1;
		this.anInt2461 = arg3;
		this.anInt2460 = arg5;
		this.anInt2457 = arg4;
		this.anInt2466 = arg0;
		if (arg1 == null) {
			this.aClass85_1 = null;
			this.aClass85Array1 = null;
		} else {
			this.aClass85Array1 = new Class85[arg1.length];
			this.aClass85_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!np;II)Z")
	public boolean method2062(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		@Pc(51) int local51;
		if (this.anInt2459 != arg1) {
			this.anInt2459 = arg1;
			@Pc(12) int local12 = Static304.method2746(arg1);
			if (local12 > arg1) {
				local12 = Static338.method5141(arg1);
			}
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 != this.anInt2464) {
				this.anInt2464 = local12;
				this.aClass110_7 = null;
			}
			if (this.aClass85Array2 != null) {
				this.anInt2455 = 0;
				@Pc(49) int[] local49 = new int[this.aClass85Array2.length];
				for (local51 = 0; local51 < this.aClass85Array2.length; local51++) {
					@Pc(58) Class85 local58 = this.aClass85Array2[local51];
					if (local58.method1730(this.anInt2461, this.anInt2457, this.anInt2460, this.anInt2459)) {
						local49[this.anInt2455] = local58.anInt2081;
						this.aClass85Array1[this.anInt2455++] = local58;
					}
				}
				Static392.method5713(0, this.anInt2455 - 1, this.aClass85Array1, local49);
			}
			this.aBoolean188 = true;
		}
		@Pc(119) boolean local119 = false;
		if (this.aBoolean188) {
			this.aBoolean188 = false;
			for (local51 = this.anInt2455 - 1; local51 >= 0; local51--) {
				@Pc(141) boolean local141 = this.aClass85Array1[local51].method1732(arg0, this.aClass85_1);
				local119 |= local141;
				this.aBoolean188 |= !local141;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public void method2064() {
		if (this.aClass85Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass85Array2.length; local10++) {
				this.aClass85Array2[local10].method1739();
			}
		}
		this.aClass110_7 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!np;IIIIIII)V")
	public void method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg0 + arg8 & 0x3FFF;
		if (this.anInt2466 == -1) {
			arg2.method4896(arg3, arg4, arg6, arg1, arg5, 0);
		} else {
			@Pc(31) Class121 local31 = Static313.anInterface10_8.method192(this.anInt2466);
			if (this.aClass110_7 == null && Static313.anInterface10_8.method191(this.anInt2466)) {
				@Pc(67) int[] local67 = local31.aBoolean218 ? Static313.anInterface10_8.method194(this.anInt2464, 0.7F, false, this.anInt2464, this.anInt2466) : Static313.anInterface10_8.method193(0.7F, this.anInt2464, this.anInt2466, this.anInt2464);
				this.aClass110_7 = arg2.method4871(local67, this.anInt2464, this.anInt2464, this.anInt2464);
			}
			if (!local31.aBoolean218) {
				arg2.method4896(arg3, arg4, arg6, arg1, arg5, 0);
			}
			if (this.aClass110_7 != null) {
				@Pc(100) int local100 = local31.aBoolean218 ? 0 : 1;
				@Pc(106) int local106 = arg1 * arg7 / -4096;
				@Pc(120) int local120;
				for (local120 = (arg6 - arg1) / 2 + arg1 * local7 / 4096; local120 > arg1; local120 -= arg1) {
				}
				while (arg1 < local106) {
					local106 -= arg1;
				}
				while (local120 < 0) {
					local120 += arg1;
				}
				while (local106 < 0) {
					local106 += arg1;
				}
				for (@Pc(173) int local173 = local120 - arg1; local173 < arg6; local173 += arg1) {
					for (@Pc(179) int local179 = local106 - arg1; local179 < arg1; local179 += arg1) {
						this.aClass110_7.method5103(local173 + arg3, local179 - -arg4, arg1, arg1, 0, 0, local100);
					}
				}
			}
		}
		for (@Pc(223) int local223 = this.anInt2455 - 1; local223 >= 0; local223--) {
			this.aClass85Array1[local223].method1738(arg2, arg3, arg4, arg6, arg1, arg7, local7);
		}
	}
}
