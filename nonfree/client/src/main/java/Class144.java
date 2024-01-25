import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class144 {

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!vl;")
	private Class2_Sub6 aClass2_Sub6_29;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "[Lclient!vl;")
	private final Class2_Sub6[] aClass2_Sub6Array1;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	private final int anInt5087;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
	public Class144(@OriginalArg(0) int arg0) {
		this.aClass2_Sub6Array1 = new Class2_Sub6[arg0];
		this.anInt5087 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub6 local20 = this.aClass2_Sub6Array1[local10] = new Class2_Sub6();
			local20.aClass2_Sub6_66 = local20;
			local20.aClass2_Sub6_65 = local20;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JB)Lclient!vl;")
	public Class2_Sub6 method4401(@OriginalArg(0) long arg0) {
		this.aLong106 = arg0;
		@Pc(20) Class2_Sub6 local20 = this.aClass2_Sub6Array1[(int) ((long) (this.anInt5087 - 1) & arg0)];
		for (this.aClass2_Sub6_29 = local20.aClass2_Sub6_66; this.aClass2_Sub6_29 != local20; this.aClass2_Sub6_29 = this.aClass2_Sub6_29.aClass2_Sub6_66) {
			if (arg0 == this.aClass2_Sub6_29.aLong267) {
				@Pc(39) Class2_Sub6 local39 = this.aClass2_Sub6_29;
				this.aClass2_Sub6_29 = this.aClass2_Sub6_29.aClass2_Sub6_66;
				return local39;
			}
		}
		this.aClass2_Sub6_29 = null;
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!vl;IJ)V")
	public void method4402(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_Sub6_65 != null) {
			arg0.method8933();
		}
		@Pc(27) Class2_Sub6 local27 = this.aClass2_Sub6Array1[(int) (arg1 & (long) (this.anInt5087 - 1))];
		arg0.aClass2_Sub6_65 = local27.aClass2_Sub6_65;
		arg0.aClass2_Sub6_66 = local27;
		arg0.aClass2_Sub6_65.aClass2_Sub6_66 = arg0;
		arg0.aClass2_Sub6_66.aClass2_Sub6_65 = arg0;
		arg0.aLong267 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Lclient!vl;")
	public Class2_Sub6 method4403() {
		if (this.aClass2_Sub6_29 == null) {
			return null;
		}
		@Pc(28) Class2_Sub6 local28 = this.aClass2_Sub6Array1[(int) (this.aLong106 & (long) (this.anInt5087 - 1))];
		while (local28 != this.aClass2_Sub6_29) {
			if (this.aClass2_Sub6_29.aLong267 == this.aLong106) {
				@Pc(44) Class2_Sub6 local44 = this.aClass2_Sub6_29;
				this.aClass2_Sub6_29 = this.aClass2_Sub6_29.aClass2_Sub6_66;
				return local44;
			}
			this.aClass2_Sub6_29 = this.aClass2_Sub6_29.aClass2_Sub6_66;
		}
		this.aClass2_Sub6_29 = null;
		return null;
	}
}
