import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class243 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
	private int anInt6981;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!f;")
	private Class76 aClass76_20;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	private int anInt6986;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Z")
	private boolean aBoolean594 = true;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
	private int anInt6995 = -1;

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
	private final int anInt6994;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	private final int anInt6984;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "[Lclient!sb;")
	private final Class219[] aClass219Array1;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
	private final int anInt6991;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	private final int anInt6985;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "Lclient!sb;")
	private final Class219 aClass219_1;

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "[Lclient!sb;")
	private final Class219[] aClass219Array2;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I[Lclient!sb;IIII)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) Class219[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6994 = arg4;
		this.anInt6984 = arg5;
		this.aClass219Array1 = arg1;
		this.anInt6991 = arg3;
		this.anInt6985 = arg0;
		if (arg1 == null) {
			this.aClass219_1 = null;
			this.aClass219Array2 = null;
		} else {
			this.aClass219Array2 = new Class219[arg1.length];
			this.aClass219_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public void method5471() {
		if (this.aClass219Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass219Array1.length; local14++) {
				this.aClass219Array1[local14].method4933();
			}
		}
		this.aClass76_20 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!qa;IIIIIIII)V")
	public void method5475(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg5 + arg2 & 0x3FFF;
		if (this.anInt6985 == -1) {
			arg1.NA(arg3, arg4, arg0, arg8, arg6, 0);
		} else {
			@Pc(31) Class178 local31 = Static107.anInterface8_3.method3836(this.anInt6985);
			if (this.aClass76_20 == null && Static107.anInterface8_3.method3835(this.anInt6985)) {
				@Pc(67) int[] local67 = local31.aBoolean435 ? Static107.anInterface8_3.method3832(0.7F, this.anInt6985, false, this.anInt6981, this.anInt6981) : Static107.anInterface8_3.method3834(0.7F, this.anInt6981, this.anInt6981, this.anInt6985);
				this.aClass76_20 = arg1.method2257(local67, this.anInt6981, this.anInt6981, this.anInt6981);
			}
			if (!local31.aBoolean435) {
				arg1.NA(arg3, arg4, arg0, arg8, arg6, 0);
			}
			if (this.aClass76_20 != null) {
				@Pc(100) int local100 = local31.aBoolean435 ? 0 : 1;
				@Pc(106) int local106 = arg7 * arg8 / -4096;
				@Pc(119) int local119;
				for (local119 = (arg0 - arg8) / 2 + local7 * arg8 / 4096; local119 > arg8; local119 -= arg8) {
				}
				while (local106 > arg8) {
					local106 -= arg8;
				}
				while (local119 < 0) {
					local119 += arg8;
				}
				while (local106 < 0) {
					local106 += arg8;
				}
				for (@Pc(165) int local165 = local119 - arg8; local165 < arg0; local165 += arg8) {
					for (@Pc(172) int local172 = local106 - arg8; local172 < arg8; local172 += arg8) {
						this.aClass76_20.M(arg3 + local165, arg4 + local172, arg8, arg8, 1, 0, local100);
					}
				}
			}
		}
		for (@Pc(226) int local226 = this.anInt6986 - 1; local226 >= 0; local226--) {
			this.aClass219Array2[local226].method4939(arg1, arg3, arg4, arg0, arg8, arg7, local7);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!qa;I)Z")
	public boolean method5476(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1) {
		if (this.anInt6995 != arg0) {
			this.anInt6995 = arg0;
			@Pc(21) int local21 = Static316.method4530(arg0);
			if (local21 > arg0) {
				local21 = Static288.method4219(arg0);
			}
			if (local21 > 512) {
				local21 = 512;
			}
			if (local21 != this.anInt6981) {
				this.aClass76_20 = null;
				this.anInt6981 = local21;
			}
			if (this.aClass219Array1 != null) {
				this.anInt6986 = 0;
				@Pc(58) int[] local58 = new int[this.aClass219Array1.length];
				for (@Pc(60) int local60 = 0; local60 < this.aClass219Array1.length; local60++) {
					@Pc(67) Class219 local67 = this.aClass219Array1[local60];
					if (local67.method4935(this.anInt6991, this.anInt6994, this.anInt6984, this.anInt6995)) {
						local58[this.anInt6986] = local67.anInt6213;
						this.aClass219Array2[this.anInt6986++] = local67;
					}
				}
				Static86.method1482(this.aClass219Array2, 0, this.anInt6986 - 1, local58);
			}
			this.aBoolean594 = true;
		}
		@Pc(120) boolean local120 = false;
		if (this.aBoolean594) {
			this.aBoolean594 = false;
			for (@Pc(131) int local131 = this.anInt6986 - 1; local131 >= 0; local131--) {
				@Pc(142) boolean local142 = this.aClass219Array2[local131].method4938(arg1, this.aClass219_1);
				this.aBoolean594 |= !local142;
				local120 |= local142;
			}
		}
		return local120;
	}
}
