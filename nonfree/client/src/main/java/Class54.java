import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class54 {

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!ee;")
	private Class3 aClass3_113;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!ee;")
	private Class3 aClass3_114;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	private int anInt2372 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[Lclient!ee;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "I")
	private final int anInt2370;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
	public Class54(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt2370 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_210 = local23;
			local23.aClass3_209 = local23;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lclient!ee;")
	public Class3 method1598() {
		this.anInt2372 = 0;
		return this.method1609();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
	public int method1599() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2370; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			@Pc(19) Class3 local19 = local16.aClass3_209;
			while (local16 != local19) {
				local19 = local19.aClass3_209;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Lclient!ee;")
	public Class3 method1600() {
		if (this.aClass3_113 == null) {
			return null;
		}
		@Pc(29) Class3 local29 = this.aClass3Array1[(int) (this.aLong79 & (long) (this.anInt2370 - 1))];
		while (this.aClass3_113 != local29) {
			if (this.aClass3_113.aLong143 == this.aLong79) {
				@Pc(44) Class3 local44 = this.aClass3_113;
				this.aClass3_113 = this.aClass3_113.aClass3_209;
				return local44;
			}
			this.aClass3_113 = this.aClass3_113.aClass3_209;
		}
		this.aClass3_113 = null;
		return null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JI)Lclient!ee;")
	public Class3 method1602(@OriginalArg(0) long arg0) {
		this.aLong79 = arg0;
		@Pc(18) Class3 local18 = this.aClass3Array1[(int) ((long) (this.anInt2370 - 1) & arg0)];
		for (this.aClass3_113 = local18.aClass3_209; this.aClass3_113 != local18; this.aClass3_113 = this.aClass3_113.aClass3_209) {
			if (this.aClass3_113.aLong143 == arg0) {
				@Pc(32) Class3 local32 = this.aClass3_113;
				this.aClass3_113 = this.aClass3_113.aClass3_209;
				return local32;
			}
		}
		this.aClass3_113 = null;
		return null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IJLclient!ee;)V")
	public void method1603(@OriginalArg(1) long arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_210 != null) {
			arg1.method2900();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt2370 - 1) & arg0)];
		arg1.aClass3_209 = local21;
		arg1.aLong143 = arg0;
		arg1.aClass3_210 = local21.aClass3_210;
		arg1.aClass3_210.aClass3_209 = arg1;
		arg1.aClass3_209.aClass3_210 = arg1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([Lclient!ee;I)I")
	public int method1608(@OriginalArg(0) Class3[] arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt2370; local5++) {
			@Pc(12) Class3 local12 = this.aClass3Array1[local5];
			for (@Pc(15) Class3 local15 = local12.aClass3_209; local15 != local12; local15 = local15.aClass3_209) {
				arg0[local3++] = local15;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lclient!ee;")
	public Class3 method1609() {
		@Pc(24) Class3 local24;
		if (this.anInt2372 > 0 && this.aClass3_114 != this.aClass3Array1[this.anInt2372 - 1]) {
			local24 = this.aClass3_114;
			this.aClass3_114 = local24.aClass3_209;
			return local24;
		}
		while (this.anInt2372 < this.anInt2370) {
			local24 = this.aClass3Array1[this.anInt2372++].aClass3_209;
			if (this.aClass3Array1[this.anInt2372 - 1] != local24) {
				this.aClass3_114 = local24.aClass3_209;
				return local24;
			}
		}
		return null;
	}
}
