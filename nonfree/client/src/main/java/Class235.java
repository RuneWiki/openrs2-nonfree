import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class235 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "Lclient!fs;")
	private Class2_Sub5 aClass2_Sub5_50;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "[Lclient!fs;")
	private final Class2_Sub5[] aClass2_Sub5Array1;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
	private final int anInt6385;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
	public Class235(@OriginalArg(0) int arg0) {
		this.aClass2_Sub5Array1 = new Class2_Sub5[arg0];
		this.anInt6385 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub5 local20 = this.aClass2_Sub5Array1[local10] = new Class2_Sub5();
			local20.aClass2_Sub5_57 = local20;
			local20.aClass2_Sub5_58 = local20;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!fs;J)V")
	public void method4968(@OriginalArg(1) Class2_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_Sub5_58 != null) {
			arg0.method5621();
		}
		@Pc(21) Class2_Sub5 local21 = this.aClass2_Sub5Array1[(int) (arg1 & (long) (this.anInt6385 - 1))];
		arg0.aClass2_Sub5_57 = local21;
		arg0.aClass2_Sub5_58 = local21.aClass2_Sub5_58;
		arg0.aClass2_Sub5_58.aClass2_Sub5_57 = arg0;
		arg0.aLong220 = arg1;
		arg0.aClass2_Sub5_57.aClass2_Sub5_58 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(JI)Lclient!fs;")
	public Class2_Sub5 method4969(@OriginalArg(0) long arg0) {
		this.aLong196 = arg0;
		@Pc(18) Class2_Sub5 local18 = this.aClass2_Sub5Array1[(int) (arg0 & (long) (this.anInt6385 - 1))];
		for (this.aClass2_Sub5_50 = local18.aClass2_Sub5_57; this.aClass2_Sub5_50 != local18; this.aClass2_Sub5_50 = this.aClass2_Sub5_50.aClass2_Sub5_57) {
			if (arg0 == this.aClass2_Sub5_50.aLong220) {
				@Pc(36) Class2_Sub5 local36 = this.aClass2_Sub5_50;
				this.aClass2_Sub5_50 = this.aClass2_Sub5_50.aClass2_Sub5_57;
				return local36;
			}
		}
		this.aClass2_Sub5_50 = null;
		return null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Lclient!fs;")
	public Class2_Sub5 method4970() {
		if (this.aClass2_Sub5_50 == null) {
			return null;
		}
		@Pc(28) Class2_Sub5 local28 = this.aClass2_Sub5Array1[(int) (this.aLong196 & (long) (this.anInt6385 - 1))];
		while (this.aClass2_Sub5_50 != local28) {
			if (this.aLong196 == this.aClass2_Sub5_50.aLong220) {
				@Pc(44) Class2_Sub5 local44 = this.aClass2_Sub5_50;
				this.aClass2_Sub5_50 = this.aClass2_Sub5_50.aClass2_Sub5_57;
				return local44;
			}
			this.aClass2_Sub5_50 = this.aClass2_Sub5_50.aClass2_Sub5_57;
		}
		this.aClass2_Sub5_50 = null;
		return null;
	}
}
