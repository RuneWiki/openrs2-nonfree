import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class157 {

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	private int anInt4014;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	private int anInt4016;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Lclient!o;")
	private Class13 aClass13_15;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
	private int anInt4013 = -1;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Z")
	private boolean aBoolean276 = true;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	private final int anInt4010;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	private final int anInt4012;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	private final int anInt4017;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	private final int anInt4008;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "[Lclient!bm;")
	private final Class26[] aClass26Array2;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "[Lclient!bm;")
	private final Class26[] aClass26Array1;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!bm;")
	private final Class26 aClass26_1;

	static {
		new Class134("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I[Lclient!bm;IIII)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) Class26[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4010 = arg5;
		this.anInt4012 = arg3;
		this.anInt4017 = arg4;
		this.anInt4008 = arg0;
		this.aClass26Array2 = arg1;
		if (arg1 == null) {
			this.aClass26_1 = null;
			this.aClass26Array1 = null;
		} else {
			this.aClass26Array1 = new Class26[arg1.length];
			this.aClass26_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIILclient!za;IIIII)V")
	public void method3165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class163 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg4 + arg5 & 0x3FFF;
		if (this.anInt4008 == -1) {
			arg3.P(arg0, arg1, arg6, arg8, arg7, 0);
		} else {
			@Pc(31) Class158 local31 = Static158.anInterface9_7.method1769(this.anInt4008);
			if (this.aClass13_15 == null && Static158.anInterface9_7.method1773(this.anInt4008)) {
				@Pc(67) int[] local67 = local31.aBoolean280 ? Static158.anInterface9_7.method1770(this.anInt4016, this.anInt4008, 0.7F, false, this.anInt4016) : Static158.anInterface9_7.method1772(this.anInt4016, 0.7F, this.anInt4008, this.anInt4016);
				this.aClass13_15 = arg3.method5522(local67, this.anInt4016, this.anInt4016, this.anInt4016);
			}
			if (!local31.aBoolean280) {
				arg3.P(arg0, arg1, arg6, arg8, arg7, 0);
			}
			if (this.aClass13_15 != null) {
				@Pc(100) int local100 = local31.aBoolean280 ? 0 : 1;
				@Pc(106) int local106 = arg2 * arg8 / -4096;
				@Pc(120) int local120;
				for (local120 = (arg6 - arg8) / 2 + local7 * arg8 / 4096; local120 > arg8; local120 -= arg8) {
				}
				while (local120 < 0) {
					local120 += arg8;
				}
				while (arg8 < local106) {
					local106 -= arg8;
				}
				while (local106 < 0) {
					local106 += arg8;
				}
				for (@Pc(168) int local168 = local120 - arg8; local168 < arg6; local168 += arg8) {
					for (@Pc(174) int local174 = local106 - arg8; local174 < arg8; local174 += arg8) {
						this.aClass13_15.ya(arg0 + local168, arg1 + local174, arg8, arg8, 1, 0, local100);
					}
				}
			}
		}
		for (@Pc(224) int local224 = this.anInt4014 - 1; local224 >= 0; local224--) {
			this.aClass26Array1[local224].method528(arg3, arg0, arg1, arg6, arg8, arg2, local7);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public void method3167() {
		if (this.aClass26Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass26Array2.length; local6++) {
				this.aClass26Array2[local6].method531();
			}
		}
		this.aClass13_15 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZLclient!za;)Z")
	public boolean method3168(@OriginalArg(0) int arg0, @OriginalArg(2) Class163 arg1) {
		if (arg0 != this.anInt4013) {
			this.anInt4013 = arg0;
			@Pc(16) int local16 = Static29.method453(arg0);
			if (arg0 < local16) {
				local16 = Static295.method3927(arg0);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 != this.anInt4016) {
				this.anInt4016 = local16;
				this.aClass13_15 = null;
			}
			if (this.aClass26Array2 != null) {
				this.anInt4014 = 0;
				@Pc(55) int[] local55 = new int[this.aClass26Array2.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass26Array2.length; local57++) {
					@Pc(64) Class26 local64 = this.aClass26Array2[local57];
					if (local64.method532(this.anInt4012, this.anInt4017, this.anInt4010, this.anInt4013)) {
						local55[this.anInt4014] = local64.anInt668;
						this.aClass26Array1[this.anInt4014++] = local64;
					}
				}
				Static341.method4560(this.anInt4014 - 1, 0, local55, this.aClass26Array1);
			}
			this.aBoolean276 = true;
		}
		@Pc(123) boolean local123 = false;
		if (this.aBoolean276) {
			this.aBoolean276 = false;
			for (@Pc(134) int local134 = this.anInt4014 - 1; local134 >= 0; local134--) {
				@Pc(145) boolean local145 = this.aClass26Array1[local134].method525(arg1, this.aClass26_1);
				local123 |= local145;
				this.aBoolean276 |= !local145;
			}
		}
		return local123;
	}
}
