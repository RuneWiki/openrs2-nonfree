import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class75 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!ej;")
	private Class5 aClass5_129;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!ej;")
	private Class5 aClass5_130;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
	private int anInt2794 = 0;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "[Lclient!ej;")
	private final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	private final int anInt2789;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
	public Class75(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt2789 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_209 = local23;
			local23.aClass5_210 = local23;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Lclient!ej;")
	public Class5 method2066() {
		@Pc(24) Class5 local24;
		if (this.anInt2794 > 0 && this.aClass5Array1[this.anInt2794 - 1] != this.aClass5_130) {
			local24 = this.aClass5_130;
			this.aClass5_130 = local24.aClass5_209;
			return local24;
		}
		while (this.anInt2789 > this.anInt2794) {
			local24 = this.aClass5Array1[this.anInt2794++].aClass5_209;
			if (local24 != this.aClass5Array1[this.anInt2794 - 1]) {
				this.aClass5_130 = local24.aClass5_209;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)Lclient!ej;")
	public Class5 method2067() {
		this.anInt2794 = 0;
		return this.method2066();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ej;BJ)V")
	public void method2069(@OriginalArg(0) Class5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass5_210 != null) {
			arg0.method3207();
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) ((long) (this.anInt2789 - 1) & arg1)];
		arg0.aLong253 = arg1;
		arg0.aClass5_210 = local21.aClass5_210;
		arg0.aClass5_209 = local21;
		arg0.aClass5_210.aClass5_209 = arg0;
		arg0.aClass5_209.aClass5_210 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lclient!ej;")
	public Class5 method2070() {
		if (this.aClass5_129 == null) {
			return null;
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) ((long) (this.anInt2789 - 1) & this.aLong160)];
		while (this.aClass5_129 != local21) {
			if (this.aLong160 == this.aClass5_129.aLong253) {
				@Pc(40) Class5 local40 = this.aClass5_129;
				this.aClass5_129 = this.aClass5_129.aClass5_209;
				return local40;
			}
			this.aClass5_129 = this.aClass5_129.aClass5_209;
		}
		this.aClass5_129 = null;
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BJ)Lclient!ej;")
	public Class5 method2072(@OriginalArg(1) long arg0) {
		this.aLong160 = arg0;
		@Pc(18) Class5 local18 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt2789 - 1))];
		for (this.aClass5_129 = local18.aClass5_209; this.aClass5_129 != local18; this.aClass5_129 = this.aClass5_129.aClass5_209) {
			if (arg0 == this.aClass5_129.aLong253) {
				@Pc(40) Class5 local40 = this.aClass5_129;
				this.aClass5_129 = this.aClass5_129.aClass5_209;
				return local40;
			}
		}
		this.aClass5_129 = null;
		return null;
	}
}
