import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class184 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	private int anInt5655;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!wn;")
	private Class95 aClass95_11;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	private int anInt5659;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private int anInt5658 = -1;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Z")
	private boolean aBoolean471 = true;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
	private final int anInt5664;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	private final int anInt5661;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	private final int anInt5662;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	private final int anInt5663;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "[Lclient!vp;")
	private final Class206[] aClass206Array1;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "[Lclient!vp;")
	private final Class206[] aClass206Array2;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!vp;")
	private final Class206 aClass206_1;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I[Lclient!vp;IIII)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) Class206[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5664 = arg5;
		this.anInt5661 = arg3;
		this.anInt5662 = arg4;
		this.anInt5663 = arg0;
		this.aClass206Array1 = arg1;
		if (arg1 == null) {
			this.aClass206Array2 = null;
			this.aClass206_1 = null;
		} else {
			this.aClass206Array2 = new Class206[arg1.length];
			this.aClass206_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBIIIIILclient!ea;II)V")
	public void method5010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class55 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg4 + arg3 & 0x3FFF;
		if (this.anInt5663 == -1) {
			arg6.method5205(arg8, arg2, arg7, arg0, arg5, 0);
		} else {
			@Pc(37) Class200 local37 = Static27.anInterface3_1.method1511(this.anInt5663);
			if (this.aClass95_11 == null && Static27.anInterface3_1.method1509(this.anInt5663)) {
				@Pc(73) int[] local73 = local37.aBoolean544 ? Static27.anInterface3_1.method1508(this.anInt5655, this.anInt5655, this.anInt5663, false, 0.7F) : Static27.anInterface3_1.method1512(0.7F, this.anInt5655, this.anInt5655, this.anInt5663);
				this.aClass95_11 = arg6.method5210(local73, this.anInt5655, this.anInt5655, this.anInt5655);
			}
			if (!local37.aBoolean544) {
				arg6.method5205(arg8, arg2, arg7, arg0, arg5, 0);
			}
			if (this.aClass95_11 != null) {
				@Pc(106) int local106 = local37.aBoolean544 ? 0 : 1;
				@Pc(112) int local112 = arg1 * arg0 / -4096;
				@Pc(125) int local125;
				for (local125 = arg0 * local8 / 4096 + (arg7 - arg0) / 2; local125 > arg0; local125 -= arg0) {
				}
				while (local125 < 0) {
					local125 += arg0;
				}
				while (local112 > arg0) {
					local112 -= arg0;
				}
				while (local112 < 0) {
					local112 += arg0;
				}
				for (@Pc(171) int local171 = local125 - arg0; local171 < arg7; local171 += arg0) {
					for (@Pc(178) int local178 = local112 - arg0; local178 < arg0; local178 += arg0) {
						this.aClass95_11.method5493(local171 + arg8, local178 - -arg2, arg0, arg0, 0, 0, local106);
					}
				}
			}
		}
		for (@Pc(222) int local222 = this.anInt5659 - 1; local222 >= 0; local222--) {
			this.aClass206Array2[local222].method5871(arg6, arg8, arg2, arg7, arg0, arg1, local8);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public void method5011() {
		if (this.aClass206Array1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass206Array1.length; local8++) {
				this.aClass206Array1[local8].method5868();
			}
		}
		this.aClass95_11 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ea;I)Z")
	public boolean method5012(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1) {
		if (arg0 != this.anInt5658) {
			this.anInt5658 = arg0;
			@Pc(16) int local16 = Static109.method1929(arg0);
			if (local16 > arg0) {
				local16 = Static74.method1366(arg0);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 != this.anInt5655) {
				this.anInt5655 = local16;
				this.aClass95_11 = null;
			}
			if (this.aClass206Array1 != null) {
				this.anInt5659 = 0;
				@Pc(59) int[] local59 = new int[this.aClass206Array1.length];
				for (@Pc(61) int local61 = 0; local61 < this.aClass206Array1.length; local61++) {
					@Pc(68) Class206 local68 = this.aClass206Array1[local61];
					if (local68.method5873(this.anInt5661, this.anInt5662, this.anInt5664, this.anInt5658)) {
						local59[this.anInt5659] = local68.anInt6594;
						this.aClass206Array2[this.anInt5659++] = local68;
					}
				}
				Static29.method537(0, this.anInt5659 - 1, local59, this.aClass206Array2);
			}
			this.aBoolean471 = true;
		}
		@Pc(128) boolean local128 = false;
		if (this.aBoolean471) {
			this.aBoolean471 = false;
			for (@Pc(139) int local139 = this.anInt5659 - 1; local139 >= 0; local139--) {
				@Pc(150) boolean local150 = this.aClass206Array2[local139].method5869(arg1, this.aClass206_1);
				local128 |= local150;
				this.aBoolean471 |= !local150;
			}
		}
		return local128;
	}
}
