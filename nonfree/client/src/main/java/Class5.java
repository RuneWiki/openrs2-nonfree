import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	private int anInt59;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!o;")
	private Class6 aClass6_2;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	private int anInt65;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
	private int anInt70 = -1;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Z")
	private boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "[Lclient!bc;")
	private final Class18[] aClass18Array2;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	private final int anInt60;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	private final int anInt64;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	private final int anInt58;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	private final int anInt61;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[Lclient!bc;")
	private final Class18[] aClass18Array1;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!bc;")
	private final Class18 aClass18_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I[Lclient!bc;IIII)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) Class18[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass18Array2 = arg1;
		this.anInt60 = arg4;
		this.anInt64 = arg5;
		this.anInt58 = arg0;
		this.anInt61 = arg3;
		if (arg1 == null) {
			this.aClass18Array1 = null;
			this.aClass18_1 = null;
		} else {
			this.aClass18Array1 = new Class18[arg1.length];
			this.aClass18_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	public void method52() {
		if (this.aClass18Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass18Array2.length; local10++) {
				this.aClass18Array2[local10].method355();
			}
		}
		this.aClass6_2 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!za;)Z")
	public boolean method55(@OriginalArg(1) int arg0, @OriginalArg(2) Class34 arg1) {
		if (this.anInt70 != arg0) {
			this.anInt70 = arg0;
			@Pc(16) int local16 = Static191.method2740(arg0);
			if (arg0 < local16) {
				local16 = Static322.method4327(arg0);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt65 != local16) {
				this.anInt65 = local16;
				this.aClass6_2 = null;
			}
			if (this.aClass18Array2 != null) {
				this.anInt59 = 0;
				@Pc(55) int[] local55 = new int[this.aClass18Array2.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass18Array2.length; local57++) {
					@Pc(64) Class18 local64 = this.aClass18Array2[local57];
					if (local64.method348(this.anInt61, this.anInt60, this.anInt64, this.anInt70)) {
						local55[this.anInt59] = local64.anInt456;
						this.aClass18Array1[this.anInt59++] = local64;
					}
				}
				Static50.method829(local55, this.aClass18Array1, this.anInt59 - 1, 0);
			}
			this.aBoolean6 = true;
		}
		@Pc(118) boolean local118 = false;
		if (this.aBoolean6) {
			this.aBoolean6 = false;
			for (@Pc(129) int local129 = this.anInt59 - 1; local129 >= 0; local129--) {
				@Pc(140) boolean local140 = this.aClass18Array1[local129].method353(arg1, this.aClass18_1);
				local118 |= local140;
				this.aBoolean6 |= !local140;
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIILclient!za;IIBII)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class34 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = arg3 + arg2 & 0x3FFF;
		if (this.anInt58 == -1) {
			arg4.P(arg8, arg0, arg5, arg6, arg7, 0);
		} else {
			@Pc(28) Class114 local28 = Static419.anInterface6_7.method3937(this.anInt58);
			if (this.aClass6_2 == null && Static419.anInterface6_7.method3934(this.anInt58)) {
				@Pc(66) int[] local66 = local28.aBoolean342 ? Static419.anInterface6_7.method3933(0.7F, false, this.anInt58, this.anInt65, this.anInt65) : Static419.anInterface6_7.method3935(this.anInt65, this.anInt65, this.anInt58, 0.7F);
				this.aClass6_2 = arg4.method5798(local66, this.anInt65, this.anInt65, this.anInt65);
			}
			if (!local28.aBoolean342) {
				arg4.P(arg8, arg0, arg5, arg6, arg7, 0);
			}
			if (this.aClass6_2 != null) {
				@Pc(99) int local99 = local28.aBoolean342 ? 0 : 1;
				@Pc(105) int local105 = arg6 * arg1 / -4096;
				@Pc(117) int local117;
				for (local117 = (arg5 - arg6) / 2 + arg6 * local13 / 4096; local117 > arg6; local117 -= arg6) {
				}
				while (arg6 < local105) {
					local105 -= arg6;
				}
				while (local117 < 0) {
					local117 += arg6;
				}
				while (local105 < 0) {
					local105 += arg6;
				}
				for (@Pc(160) int local160 = local117 - arg6; local160 < arg5; local160 += arg6) {
					for (@Pc(167) int local167 = local105 - arg6; local167 < arg6; local167 += arg6) {
						this.aClass6_2.ya(arg8 + local160, arg0 + local167, arg6, arg6, 1, 0, local99);
					}
				}
			}
		}
		for (@Pc(216) int local216 = this.anInt59 - 1; local216 >= 0; local216--) {
			this.aClass18Array1[local216].method356(arg4, arg8, arg0, arg5, arg6, arg1, local13);
		}
	}
}
