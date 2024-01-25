import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class197 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!o;")
	private Class85 aClass85_13;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	private int anInt5216;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	private int anInt5218;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Z")
	private boolean aBoolean470 = true;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	private int anInt5214 = -1;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	private final int anInt5210;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "[Lclient!pm;")
	private final Class201[] aClass201Array1;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
	private final int anInt5209;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	private final int anInt5213;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	private final int anInt5222;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[Lclient!pm;")
	private final Class201[] aClass201Array2;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "Lclient!pm;")
	private final Class201 aClass201_1;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I[Lclient!pm;IIII)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) Class201[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5210 = arg5;
		this.aClass201Array1 = arg1;
		this.anInt5209 = arg0;
		this.anInt5213 = arg4;
		this.anInt5222 = arg3;
		if (arg1 == null) {
			this.aClass201_1 = null;
			this.aClass201Array2 = null;
		} else {
			this.aClass201Array2 = new Class201[arg1.length];
			this.aClass201_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!za;IIIIIIII)V")
	public void method4171(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg5 + arg3 & 0x3FFF;
		if (this.anInt5209 == -1) {
			arg1.P(arg6, arg4, arg7, arg2, arg0, 0);
		} else {
			@Pc(22) Class25 local22 = Static86.anInterface4_11.method5090(this.anInt5209);
			if (this.aClass85_13 == null && Static86.anInterface4_11.method5089(this.anInt5209)) {
				@Pc(58) int[] local58 = local22.aBoolean53 ? Static86.anInterface4_11.method5086(this.anInt5218, this.anInt5209, this.anInt5218, 0.7F) : Static86.anInterface4_11.method5088(this.anInt5218, this.anInt5209, 0.7F, false, this.anInt5218);
				this.aClass85_13 = arg1.method5700(local58, this.anInt5218, this.anInt5218, this.anInt5218);
			}
			if (local22.aBoolean53) {
				arg1.P(arg6, arg4, arg7, arg2, arg0, 0);
			}
			if (this.aClass85_13 != null) {
				@Pc(91) int local91 = local22.aBoolean53 ? 1 : 0;
				@Pc(97) int local97 = arg8 * arg2 / -4096;
				@Pc(111) int local111;
				for (local111 = (arg7 - arg2) / 2 + arg2 * local8 / 4096; local111 > arg2; local111 -= arg2) {
				}
				while (local111 < 0) {
					local111 += arg2;
				}
				while (local97 > arg2) {
					local97 -= arg2;
				}
				while (local97 < 0) {
					local97 += arg2;
				}
				for (@Pc(156) int local156 = local111 - arg2; local156 < arg7; local156 += arg2) {
					for (@Pc(163) int local163 = local97 - arg2; local163 < arg2; local163 += arg2) {
						this.aClass85_13.ya(arg6 + local156, local163 - -arg4, arg2, arg2, 1, 0, local91);
					}
				}
			}
		}
		for (@Pc(213) int local213 = this.anInt5216 - 1; local213 >= 0; local213--) {
			this.aClass201Array2[local213].method4231(arg1, arg6, arg4, arg7, arg2, arg8, local8);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!za;II)Z")
	public boolean method4173(@OriginalArg(0) Class117 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt5214) {
			this.anInt5214 = arg1;
			@Pc(16) int local16 = Static235.method3355(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt5218 != local16) {
				this.anInt5218 = local16;
				this.aClass85_13 = null;
			}
			if (this.aClass201Array1 != null) {
				this.anInt5216 = 0;
				@Pc(53) int[] local53 = new int[this.aClass201Array1.length];
				for (@Pc(55) int local55 = 0; local55 < this.aClass201Array1.length; local55++) {
					@Pc(62) Class201 local62 = this.aClass201Array1[local55];
					if (local62.method4233(this.anInt5222, this.anInt5213, this.anInt5210, this.anInt5214)) {
						local53[this.anInt5216] = local62.anInt5313;
						this.aClass201Array2[this.anInt5216++] = local62;
					}
				}
				Static452.method5826(this.aClass201Array2, local53, 0, this.anInt5216 - 1);
			}
			this.aBoolean470 = true;
		}
		@Pc(115) boolean local115 = false;
		if (this.aBoolean470) {
			this.aBoolean470 = false;
			for (@Pc(139) int local139 = this.anInt5216 - 1; local139 >= 0; local139--) {
				@Pc(150) boolean local150 = this.aClass201Array2[local139].method4230(arg0, this.aClass201_1);
				local115 |= local150;
				this.aBoolean470 |= !local150;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public void method4175() {
		if (this.aClass201Array1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.aClass201Array1.length; local18++) {
				this.aClass201Array1[local18].method4232();
			}
		}
		this.aClass85_13 = null;
	}
}
