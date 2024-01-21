import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class77 {

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!ib;")
	private Class3 aClass3_101;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!ib;")
	private Class3 aClass3_102;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
	private int anInt2607 = 0;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "[Lclient!ib;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
	private final int anInt2602;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
	public Class77(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt2602 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_116 = local23;
			local23.aClass3_115 = local23;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Lclient!ib;")
	public Class3 method1801() {
		if (this.aClass3_101 == null) {
			return null;
		}
		@Pc(26) Class3 local26 = this.aClass3Array1[(int) ((long) (this.anInt2602 - 1) & this.aLong84)];
		while (this.aClass3_101 != local26) {
			if (this.aLong84 == this.aClass3_101.aLong94) {
				@Pc(41) Class3 local41 = this.aClass3_101;
				this.aClass3_101 = this.aClass3_101.aClass3_116;
				return local41;
			}
			this.aClass3_101 = this.aClass3_101.aClass3_116;
		}
		this.aClass3_101 = null;
		return null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lclient!ib;")
	public Class3 method1802() {
		@Pc(21) Class3 local21;
		if (this.anInt2607 > 0 && this.aClass3_102 != this.aClass3Array1[this.anInt2607 - 1]) {
			local21 = this.aClass3_102;
			this.aClass3_102 = local21.aClass3_116;
			return local21;
		}
		while (this.anInt2607 < this.anInt2602) {
			local21 = this.aClass3Array1[this.anInt2607++].aClass3_116;
			if (this.aClass3Array1[this.anInt2607 - 1] != local21) {
				this.aClass3_102 = local21.aClass3_116;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lclient!ib;")
	public Class3 method1803() {
		this.anInt2607 = 0;
		return this.method1802();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(JI)Lclient!ib;")
	public Class3 method1805(@OriginalArg(0) long arg0) {
		this.aLong84 = arg0;
		@Pc(18) Class3 local18 = this.aClass3Array1[(int) ((long) (this.anInt2602 - 1) & arg0)];
		for (this.aClass3_101 = local18.aClass3_116; this.aClass3_101 != local18; this.aClass3_101 = this.aClass3_101.aClass3_116) {
			if (this.aClass3_101.aLong94 == arg0) {
				@Pc(32) Class3 local32 = this.aClass3_101;
				this.aClass3_101 = this.aClass3_101.aClass3_116;
				return local32;
			}
		}
		this.aClass3_101 = null;
		return null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ib;JB)V")
	public void method1810(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_115 != null) {
			arg0.method1962();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt2602 - 1))];
		arg0.aClass3_116 = local21;
		arg0.aLong94 = arg1;
		arg0.aClass3_115 = local21.aClass3_115;
		arg0.aClass3_115.aClass3_116 = arg0;
		arg0.aClass3_116.aClass3_115 = arg0;
	}
}
