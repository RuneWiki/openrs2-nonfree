import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class108 {

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!on;")
	private Class6 aClass6_117;

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "Lclient!on;")
	private Class6 aClass6_118;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
	private int anInt2756 = 0;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	public final int anInt2749;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "[Lclient!on;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	public Class108(@OriginalArg(0) int arg0) {
		this.anInt2749 = arg0;
		this.aClass6Array1 = new Class6[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_247 = local23;
			local23.aClass6_248 = local23;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IJLclient!on;)V")
	public void method2898(@OriginalArg(1) long arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.aClass6_247 != null) {
			arg1.method5756();
		}
		@Pc(23) Class6 local23 = this.aClass6Array1[(int) ((long) (this.anInt2749 - 1) & arg0)];
		arg1.aClass6_247 = local23.aClass6_247;
		arg1.aClass6_248 = local23;
		arg1.aClass6_247.aClass6_248 = arg1;
		arg1.aClass6_248.aClass6_247 = arg1;
		arg1.aLong218 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(JI)Lclient!on;")
	public Class6 method2900(@OriginalArg(0) long arg0) {
		this.aLong99 = arg0;
		@Pc(20) Class6 local20 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt2749 - 1))];
		for (this.aClass6_117 = local20.aClass6_248; this.aClass6_117 != local20; this.aClass6_117 = this.aClass6_117.aClass6_248) {
			if (this.aClass6_117.aLong218 == arg0) {
				@Pc(39) Class6 local39 = this.aClass6_117;
				this.aClass6_117 = this.aClass6_117.aClass6_248;
				return local39;
			}
		}
		this.aClass6_117 = null;
		return null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
	public int method2901() {
		return this.anInt2749;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lclient!on;Z)I")
	public int method2902(@OriginalArg(0) Class6[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2749; local9++) {
			@Pc(25) Class6 local25 = this.aClass6Array1[local9];
			for (@Pc(28) Class6 local28 = local25.aClass6_248; local28 != local25; local28 = local28.aClass6_248) {
				arg0[local7++] = local28;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Lclient!on;")
	public Class6 method2903() {
		this.anInt2756 = 0;
		return this.method2905();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)Lclient!on;")
	public Class6 method2905() {
		@Pc(27) Class6 local27;
		if (this.anInt2756 > 0 && this.aClass6Array1[this.anInt2756 - 1] != this.aClass6_118) {
			local27 = this.aClass6_118;
			this.aClass6_118 = local27.aClass6_248;
			return local27;
		}
		while (this.anInt2749 > this.anInt2756) {
			local27 = this.aClass6Array1[this.anInt2756++].aClass6_248;
			if (local27 != this.aClass6Array1[this.anInt2756 - 1]) {
				this.aClass6_118 = local27.aClass6_248;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)I")
	public int method2906() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2749; local14++) {
			@Pc(21) Class6 local21 = this.aClass6Array1[local14];
			for (@Pc(24) Class6 local24 = local21.aClass6_248; local24 != local21; local24 = local24.aClass6_248) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
	public void method2909() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2749; local3++) {
			@Pc(10) Class6 local10 = this.aClass6Array1[local3];
			while (true) {
				@Pc(13) Class6 local13 = local10.aClass6_248;
				if (local10 == local13) {
					break;
				}
				local13.method5756();
			}
		}
		this.aClass6_118 = null;
		this.aClass6_117 = null;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)Lclient!on;")
	public Class6 method2910() {
		if (this.aClass6_117 == null) {
			return null;
		}
		@Pc(37) Class6 local37 = this.aClass6Array1[(int) (this.aLong99 & (long) (this.anInt2749 - 1))];
		while (local37 != this.aClass6_117) {
			if (this.aClass6_117.aLong218 == this.aLong99) {
				@Pc(49) Class6 local49 = this.aClass6_117;
				this.aClass6_117 = this.aClass6_117.aClass6_248;
				return local49;
			}
			this.aClass6_117 = this.aClass6_117.aClass6_248;
		}
		this.aClass6_117 = null;
		return null;
	}
}
