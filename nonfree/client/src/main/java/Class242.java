import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class242 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!l;")
	private Class17 aClass17_51;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
	private int anInt6588;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	private int anInt6590;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Z")
	private boolean aBoolean447 = true;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
	private int anInt6595 = -1;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	private final int anInt6587;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[Lclient!we;")
	private final Class262[] aClass262Array1;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
	private final int anInt6597;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	private final int anInt6586;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	private final int anInt6594;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "[Lclient!we;")
	private final Class262[] aClass262Array2;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!we;")
	private final Class262 aClass262_1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I[Lclient!we;IIII)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) Class262[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6587 = arg5;
		this.aClass262Array1 = arg1;
		this.anInt6597 = arg0;
		this.anInt6586 = arg3;
		this.anInt6594 = arg4;
		if (arg1 == null) {
			this.aClass262Array2 = null;
			this.aClass262_1 = null;
		} else {
			this.aClass262Array2 = new Class262[arg1.length];
			this.aClass262_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!ya;II)Z")
	public boolean method5219(@OriginalArg(0) Class49 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt6595) {
			this.anInt6595 = arg1;
			@Pc(16) int local16 = Static51.method863(arg1);
			if (local16 > arg1) {
				local16 = Static202.method3245(arg1);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 != this.anInt6590) {
				this.anInt6590 = local16;
				this.aClass17_51 = null;
			}
			if (this.aClass262Array1 != null) {
				this.anInt6588 = 0;
				@Pc(55) int[] local55 = new int[this.aClass262Array1.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass262Array1.length; local57++) {
					@Pc(64) Class262 local64 = this.aClass262Array1[local57];
					if (local64.method5686(this.anInt6586, this.anInt6594, this.anInt6587, this.anInt6595)) {
						local55[this.anInt6588] = local64.anInt7206;
						this.aClass262Array2[this.anInt6588++] = local64;
					}
				}
				Static418.method5550(0, local55, this.aClass262Array2, this.anInt6588 - 1);
			}
			this.aBoolean447 = true;
		}
		@Pc(131) boolean local131 = false;
		if (this.aBoolean447) {
			this.aBoolean447 = false;
			for (@Pc(142) int local142 = this.anInt6588 - 1; local142 >= 0; local142--) {
				@Pc(153) boolean local153 = this.aClass262Array2[local142].method5695(arg0, this.aClass262_1);
				local131 |= local153;
				this.aBoolean447 |= !local153;
			}
		}
		return local131;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public void method5220() {
		if (this.aClass262Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass262Array1.length; local15++) {
				this.aClass262Array1[local15].method5688();
			}
		}
		this.aClass17_51 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!ya;IIIIIIII)V")
	public void method5223(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg4 + arg7 & 0x3FFF;
		if (this.anInt6597 == -1) {
			arg1.O(arg5, arg3, arg2, arg0, arg8, 0);
		} else {
			@Pc(21) Class140 local21 = Static297.anInterface4_5.method3794(this.anInt6597);
			if (this.aClass17_51 == null && Static297.anInterface4_5.method3792(this.anInt6597)) {
				@Pc(57) int[] local57 = local21.aBoolean290 ? Static297.anInterface4_5.method3790(this.anInt6590, this.anInt6597, 0.7F, false, this.anInt6590) : Static297.anInterface4_5.method3791(this.anInt6590, this.anInt6597, 0.7F, this.anInt6590);
				this.aClass17_51 = arg1.method4422(local57, this.anInt6590, this.anInt6590, this.anInt6590);
			}
			if (!local21.aBoolean290) {
				arg1.O(arg5, arg3, arg2, arg0, arg8, 0);
			}
			if (this.aClass17_51 != null) {
				@Pc(90) int local90 = local21.aBoolean290 ? 0 : 1;
				@Pc(96) int local96 = arg0 * arg6 / -4096;
				@Pc(110) int local110;
				for (local110 = (arg2 - arg0) / 2 + arg0 * local11 / 4096; local110 > arg0; local110 -= arg0) {
				}
				while (arg0 < local96) {
					local96 -= arg0;
				}
				while (local110 < 0) {
					local110 += arg0;
				}
				while (local96 < 0) {
					local96 += arg0;
				}
				for (@Pc(163) int local163 = local110 - arg0; local163 < arg2; local163 += arg0) {
					for (@Pc(170) int local170 = local96 - arg0; local170 < arg0; local170 += arg0) {
						this.aClass17_51.s(arg5 + local163, arg3 + local170, arg0, arg0, 1, 0, local90);
					}
				}
			}
		}
		for (@Pc(225) int local225 = this.anInt6588 - 1; local225 >= 0; local225--) {
			this.aClass262Array2[local225].method5687(arg1, arg5, arg3, arg2, arg0, arg6, local11);
		}
	}
}
