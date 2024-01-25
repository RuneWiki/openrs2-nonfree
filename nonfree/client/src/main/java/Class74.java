import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class74 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!cg;")
	private Class6 aClass6_67;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!cg;")
	private Class6 aClass6_68;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
	private int anInt2307 = 0;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "[Lclient!cg;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public final int anInt2296;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
	public Class74(@OriginalArg(0) int arg0) {
		this.aClass6Array1 = new Class6[arg0];
		this.anInt2296 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_251 = local23;
			local23.aClass6_252 = local23;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Lclient!cg;")
	public Class6 method1881() {
		if (this.anInt2307 > 0 && this.aClass6Array1[this.anInt2307 - 1] != this.aClass6_68) {
			@Pc(21) Class6 local21 = this.aClass6_68;
			this.aClass6_68 = local21.aClass6_252;
			return local21;
		}
		while (this.anInt2296 > this.anInt2307) {
			@Pc(49) Class6 local49 = this.aClass6Array1[this.anInt2307++].aClass6_252;
			if (local49 != this.aClass6Array1[this.anInt2307 - 1]) {
				this.aClass6_68 = local49.aClass6_252;
				return local49;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)Lclient!cg;")
	public Class6 method1882() {
		if (this.aClass6_67 == null) {
			return null;
		}
		@Pc(31) Class6 local31 = this.aClass6Array1[(int) (this.aLong72 & (long) (this.anInt2296 - 1))];
		while (this.aClass6_67 != local31) {
			if (this.aClass6_67.aLong229 == this.aLong72) {
				@Pc(43) Class6 local43 = this.aClass6_67;
				this.aClass6_67 = this.aClass6_67.aClass6_252;
				return local43;
			}
			this.aClass6_67 = this.aClass6_67.aClass6_252;
		}
		this.aClass6_67 = null;
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BJ)Lclient!cg;")
	public Class6 method1883(@OriginalArg(1) long arg0) {
		this.aLong72 = arg0;
		@Pc(28) Class6 local28 = this.aClass6Array1[(int) ((long) (this.anInt2296 - 1) & arg0)];
		for (this.aClass6_67 = local28.aClass6_252; this.aClass6_67 != local28; this.aClass6_67 = this.aClass6_67.aClass6_252) {
			if (arg0 == this.aClass6_67.aLong229) {
				@Pc(43) Class6 local43 = this.aClass6_67;
				this.aClass6_67 = this.aClass6_67.aClass6_252;
				return local43;
			}
		}
		this.aClass6_67 = null;
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)I")
	public int method1884() {
		return this.anInt2296;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)I")
	public int method1887() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2296; local14++) {
			@Pc(21) Class6 local21 = this.aClass6Array1[local14];
			for (@Pc(24) Class6 local24 = local21.aClass6_252; local24 != local21; local24 = local24.aClass6_252) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
	public void method1888() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2296; local13++) {
			@Pc(20) Class6 local20 = this.aClass6Array1[local13];
			while (true) {
				@Pc(23) Class6 local23 = local20.aClass6_252;
				if (local23 == local20) {
					break;
				}
				local23.method6525();
			}
		}
		this.aClass6_67 = null;
		this.aClass6_68 = null;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)Lclient!cg;")
	public Class6 method1889() {
		this.anInt2307 = 0;
		return this.method1881();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJLclient!cg;)V")
	public void method1890(@OriginalArg(1) long arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.aClass6_251 != null) {
			arg1.method6525();
		}
		@Pc(21) Class6 local21 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt2296 - 1))];
		arg1.aClass6_251 = local21.aClass6_251;
		arg1.aClass6_252 = local21;
		arg1.aClass6_251.aClass6_252 = arg1;
		arg1.aClass6_252.aClass6_251 = arg1;
		arg1.aLong229 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lclient!cg;B)I")
	public int method1891(@OriginalArg(0) Class6[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2296; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			for (@Pc(19) Class6 local19 = local16.aClass6_252; local19 != local16; local19 = local19.aClass6_252) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}
}
