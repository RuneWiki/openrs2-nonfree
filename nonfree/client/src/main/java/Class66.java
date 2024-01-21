import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class66 {

	@OriginalMember(owner = "client!s", name = "x", descriptor = "J")
	private long aLong116;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "Lclient!cb;")
	private Class5 aClass5_89;

	@OriginalMember(owner = "client!s", name = "I", descriptor = "Lclient!cb;")
	private Class5 aClass5_90;

	@OriginalMember(owner = "client!s", name = "H", descriptor = "I")
	private int anInt2654 = 0;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	private final int anInt2645;

	@OriginalMember(owner = "client!s", name = "B", descriptor = "[Lclient!cb;")
	private final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V")
	public Class66(@OriginalArg(0) int arg0) {
		this.anInt2645 = arg0;
		this.aClass5Array1 = new Class5[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_116 = local23;
			local23.aClass5_115 = local23;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lclient!cb;")
	public Class5 method1809() {
		@Pc(24) Class5 local24;
		if (this.anInt2654 > 0 && this.aClass5_90 != this.aClass5Array1[this.anInt2654 - 1]) {
			local24 = this.aClass5_90;
			this.aClass5_90 = local24.aClass5_115;
			return local24;
		}
		while (this.anInt2645 > this.anInt2654) {
			local24 = this.aClass5Array1[this.anInt2654++].aClass5_115;
			if (local24 != this.aClass5Array1[this.anInt2654 - 1]) {
				this.aClass5_90 = local24.aClass5_115;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Lclient!cb;")
	public Class5 method1810() {
		if (this.aClass5_89 == null) {
			return null;
		}
		@Pc(26) Class5 local26 = this.aClass5Array1[(int) (this.aLong116 & (long) (this.anInt2645 - 1))];
		while (local26 != this.aClass5_89) {
			if (this.aLong116 == this.aClass5_89.aLong146) {
				@Pc(37) Class5 local37 = this.aClass5_89;
				this.aClass5_89 = this.aClass5_89.aClass5_115;
				return local37;
			}
			this.aClass5_89 = this.aClass5_89.aClass5_115;
		}
		this.aClass5_89 = null;
		return null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JLclient!cb;I)V")
	public void method1811(@OriginalArg(0) long arg0, @OriginalArg(1) Class5 arg1) {
		if (arg1.aClass5_116 != null) {
			arg1.method2144();
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt2645 - 1))];
		arg1.aClass5_115 = local21;
		arg1.aLong146 = arg0;
		arg1.aClass5_116 = local21.aClass5_116;
		arg1.aClass5_116.aClass5_115 = arg1;
		arg1.aClass5_115.aClass5_116 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZJ)Lclient!cb;")
	public Class5 method1812(@OriginalArg(1) long arg0) {
		this.aLong116 = arg0;
		@Pc(18) Class5 local18 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt2645 - 1))];
		for (this.aClass5_89 = local18.aClass5_115; this.aClass5_89 != local18; this.aClass5_89 = this.aClass5_89.aClass5_115) {
			if (arg0 == this.aClass5_89.aLong146) {
				@Pc(36) Class5 local36 = this.aClass5_89;
				this.aClass5_89 = this.aClass5_89.aClass5_115;
				return local36;
			}
		}
		this.aClass5_89 = null;
		return null;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)Lclient!cb;")
	public Class5 method1815() {
		this.anInt2654 = 0;
		return this.method1809();
	}
}
