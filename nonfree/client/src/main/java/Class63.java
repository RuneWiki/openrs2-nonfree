import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class63 {

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!ib;")
	private Class2 aClass2_139;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Lclient!ib;")
	private Class2 aClass2_140;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	private int anInt2771 = 0;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	private final int anInt2764;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[Lclient!ib;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
	public Class63(@OriginalArg(0) int arg0) {
		this.anInt2764 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_209 = local23;
			local23.aClass2_210 = local23;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Lclient!ib;")
	public Class2 method2105() {
		if (this.aClass2_139 == null) {
			return null;
		}
		@Pc(29) Class2 local29 = this.aClass2Array1[(int) ((long) (this.anInt2764 - 1) & this.aLong94)];
		while (this.aClass2_139 != local29) {
			if (this.aClass2_139.aLong149 == this.aLong94) {
				@Pc(40) Class2 local40 = this.aClass2_139;
				this.aClass2_139 = this.aClass2_139.aClass2_209;
				return local40;
			}
			this.aClass2_139 = this.aClass2_139.aClass2_209;
		}
		this.aClass2_139 = null;
		return null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Lclient!ib;")
	public Class2 method2108() {
		@Pc(30) Class2 local30;
		if (this.anInt2771 > 0 && this.aClass2_140 != this.aClass2Array1[this.anInt2771 - 1]) {
			local30 = this.aClass2_140;
			this.aClass2_140 = local30.aClass2_209;
			return local30;
		}
		while (this.anInt2771 < this.anInt2764) {
			local30 = this.aClass2Array1[this.anInt2771++].aClass2_209;
			if (this.aClass2Array1[this.anInt2771 - 1] != local30) {
				this.aClass2_140 = local30.aClass2_209;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)Lclient!ib;")
	public Class2 method2110(@OriginalArg(1) long arg0) {
		this.aLong94 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) ((long) (this.anInt2764 - 1) & arg0)];
		for (this.aClass2_139 = local18.aClass2_209; this.aClass2_139 != local18; this.aClass2_139 = this.aClass2_139.aClass2_209) {
			if (this.aClass2_139.aLong149 == arg0) {
				@Pc(32) Class2 local32 = this.aClass2_139;
				this.aClass2_139 = this.aClass2_139.aClass2_209;
				return local32;
			}
		}
		this.aClass2_139 = null;
		return null;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Lclient!ib;")
	public Class2 method2114() {
		this.anInt2771 = 0;
		return this.method2108();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(JLclient!ib;Z)V")
	public void method2115(@OriginalArg(0) long arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_210 != null) {
			arg1.method3254();
		}
		@Pc(25) Class2 local25 = this.aClass2Array1[(int) ((long) (this.anInt2764 - 1) & arg0)];
		arg1.aClass2_209 = local25;
		arg1.aLong149 = arg0;
		arg1.aClass2_210 = local25.aClass2_210;
		arg1.aClass2_210.aClass2_209 = arg1;
		arg1.aClass2_209.aClass2_210 = arg1;
	}
}
