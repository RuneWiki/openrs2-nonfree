import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class79 {

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "Lclient!ma;")
	private Class2 aClass2_91;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "Lclient!ma;")
	private Class2 aClass2_92;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	private int anInt2330 = 0;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "[Lclient!ma;")
	public Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I)V")
	public Class79(@OriginalArg(0) int arg0) {
		this.anInt2326 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class2 local29 = this.aClass2Array1[local13] = new Class2();
			local29.aClass2_230 = local29;
			local29.aClass2_231 = local29;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)Lclient!ma;")
	public Class2 method1991() {
		@Pc(28) Class2 local28;
		if (this.anInt2330 > 0 && this.aClass2Array1[this.anInt2330 - 1] != this.aClass2_92) {
			local28 = this.aClass2_92;
			this.aClass2_92 = local28.aClass2_231;
			return local28;
		}
		do {
			if (this.anInt2330 >= this.anInt2326) {
				return null;
			}
			local28 = this.aClass2Array1[this.anInt2330++].aClass2_231;
		} while (local28 == this.aClass2Array1[this.anInt2330 - 1]);
		this.aClass2_92 = local28.aClass2_231;
		return local28;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Lclient!ma;")
	public Class2 method1992() {
		this.anInt2330 = 0;
		return this.method1991();
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Lclient!ma;")
	public Class2 method1993() {
		if (this.aClass2_91 == null) {
			return null;
		}
		@Pc(31) Class2 local31 = this.aClass2Array1[(int) (this.aLong119 & (long) (this.anInt2326 - 1))];
		while (this.aClass2_91 != local31) {
			if (this.aLong119 == this.aClass2_91.aLong315) {
				@Pc(45) Class2 local45 = this.aClass2_91;
				this.aClass2_91 = this.aClass2_91.aClass2_231;
				return local45;
			}
			this.aClass2_91 = this.aClass2_91.aClass2_231;
		}
		this.aClass2_91 = null;
		return null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(JBLclient!ma;)V")
	public void method1994(@OriginalArg(0) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_230 != null) {
			arg1.method4926();
		}
		@Pc(24) Class2 local24 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt2326 - 1))];
		arg1.aClass2_231 = local24;
		arg1.aClass2_230 = local24.aClass2_230;
		arg1.aLong315 = arg0;
		arg1.aClass2_230.aClass2_231 = arg1;
		arg1.aClass2_231.aClass2_230 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)I")
	public int method1996() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2326; local14++) {
			@Pc(27) Class2 local27 = this.aClass2Array1[local14];
			@Pc(30) Class2 local30 = local27.aClass2_231;
			while (local27 != local30) {
				local30 = local30.aClass2_231;
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lclient!ma;I)I")
	public int method1997(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2326; local9++) {
			@Pc(18) Class2 local18 = this.aClass2Array1[local9];
			for (@Pc(21) Class2 local21 = local18.aClass2_231; local21 != local18; local21 = local21.aClass2_231) {
				arg0[local7++] = local21;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public void method1999() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2326; local3++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local3];
			while (true) {
				@Pc(19) Class2 local19 = local16.aClass2_231;
				if (local19 == local16) {
					break;
				}
				local19.method4926();
			}
		}
		this.aClass2_92 = null;
		this.aClass2_91 = null;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)I")
	public int method2001() {
		return this.anInt2326;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IJ)Lclient!ma;")
	public Class2 method2002(@OriginalArg(1) long arg0) {
		this.aLong119 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) ((long) (this.anInt2326 - 1) & arg0)];
		for (this.aClass2_91 = local18.aClass2_231; this.aClass2_91 != local18; this.aClass2_91 = this.aClass2_91.aClass2_231) {
			if (this.aClass2_91.aLong315 == arg0) {
				@Pc(40) Class2 local40 = this.aClass2_91;
				this.aClass2_91 = this.aClass2_91.aClass2_231;
				return local40;
			}
		}
		this.aClass2_91 = null;
		return null;
	}
}
