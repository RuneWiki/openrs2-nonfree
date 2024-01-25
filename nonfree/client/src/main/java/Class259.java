import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class259 {

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "Lclient!mk;")
	private Class2_Sub2 aClass2_Sub2_48;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
	private final int anInt6540;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "[Lclient!mk;")
	private final Class2_Sub2[] aClass2_Sub2Array1;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(I)V")
	public Class259(@OriginalArg(0) int arg0) {
		this.anInt6540 = arg0;
		this.aClass2_Sub2Array1 = new Class2_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub2 local20 = this.aClass2_Sub2Array1[local10] = new Class2_Sub2();
			local20.aClass2_Sub2_62 = local20;
			local20.aClass2_Sub2_61 = local20;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!mk;J)V")
	public void method5447(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_Sub2_61 != null) {
			arg0.method7659();
		}
		@Pc(21) Class2_Sub2 local21 = this.aClass2_Sub2Array1[(int) (arg1 & (long) (this.anInt6540 - 1))];
		arg0.aClass2_Sub2_62 = local21;
		arg0.aClass2_Sub2_61 = local21.aClass2_Sub2_61;
		arg0.aClass2_Sub2_61.aClass2_Sub2_62 = arg0;
		arg0.aClass2_Sub2_62.aClass2_Sub2_61 = arg0;
		arg0.aLong269 = arg1;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BJ)Lclient!mk;")
	public Class2_Sub2 method5448(@OriginalArg(1) long arg0) {
		this.aLong179 = arg0;
		@Pc(20) Class2_Sub2 local20 = this.aClass2_Sub2Array1[(int) ((long) (this.anInt6540 - 1) & arg0)];
		for (this.aClass2_Sub2_48 = local20.aClass2_Sub2_62; this.aClass2_Sub2_48 != local20; this.aClass2_Sub2_48 = this.aClass2_Sub2_48.aClass2_Sub2_62) {
			if (arg0 == this.aClass2_Sub2_48.aLong269) {
				@Pc(35) Class2_Sub2 local35 = this.aClass2_Sub2_48;
				this.aClass2_Sub2_48 = this.aClass2_Sub2_48.aClass2_Sub2_62;
				return local35;
			}
		}
		this.aClass2_Sub2_48 = null;
		return null;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)Lclient!mk;")
	public Class2_Sub2 method5450() {
		if (this.aClass2_Sub2_48 == null) {
			return null;
		}
		@Pc(23) Class2_Sub2 local23 = this.aClass2_Sub2Array1[(int) (this.aLong179 & (long) (this.anInt6540 - 1))];
		while (this.aClass2_Sub2_48 != local23) {
			if (this.aLong179 == this.aClass2_Sub2_48.aLong269) {
				@Pc(35) Class2_Sub2 local35 = this.aClass2_Sub2_48;
				this.aClass2_Sub2_48 = this.aClass2_Sub2_48.aClass2_Sub2_62;
				return local35;
			}
			this.aClass2_Sub2_48 = this.aClass2_Sub2_48.aClass2_Sub2_62;
		}
		this.aClass2_Sub2_48 = null;
		return null;
	}
}
