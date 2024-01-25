import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class243 {

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!uh;")
	private Class3_Sub3 aClass3_Sub3_54;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "J")
	private long aLong226;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "[Lclient!uh;")
	private final Class3_Sub3[] aClass3_Sub3Array1;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	private final int anInt6717;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class243(@OriginalArg(0) int arg0) {
		this.aClass3_Sub3Array1 = new Class3_Sub3[arg0];
		this.anInt6717 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub3 local20 = this.aClass3_Sub3Array1[local10] = new Class3_Sub3();
			local20.aClass3_Sub3_58 = local20;
			local20.aClass3_Sub3_57 = local20;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Lclient!uh;")
	public Class3_Sub3 method5559(@OriginalArg(0) long arg0) {
		this.aLong226 = arg0;
		@Pc(20) Class3_Sub3 local20 = this.aClass3_Sub3Array1[(int) ((long) (this.anInt6717 - 1) & arg0)];
		for (this.aClass3_Sub3_54 = local20.aClass3_Sub3_57; this.aClass3_Sub3_54 != local20; this.aClass3_Sub3_54 = this.aClass3_Sub3_54.aClass3_Sub3_57) {
			if (arg0 == this.aClass3_Sub3_54.aLong243) {
				@Pc(46) Class3_Sub3 local46 = this.aClass3_Sub3_54;
				this.aClass3_Sub3_54 = this.aClass3_Sub3_54.aClass3_Sub3_57;
				return local46;
			}
		}
		this.aClass3_Sub3_54 = null;
		return null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!uh;IJ)V")
	public void method5561(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_Sub3_58 != null) {
			arg0.method6102();
		}
		@Pc(21) Class3_Sub3 local21 = this.aClass3_Sub3Array1[(int) ((long) (this.anInt6717 - 1) & arg1)];
		arg0.aClass3_Sub3_57 = local21;
		arg0.aClass3_Sub3_58 = local21.aClass3_Sub3_58;
		arg0.aClass3_Sub3_58.aClass3_Sub3_57 = arg0;
		arg0.aLong243 = arg1;
		arg0.aClass3_Sub3_57.aClass3_Sub3_58 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)Lclient!uh;")
	public Class3_Sub3 method5563() {
		if (this.aClass3_Sub3_54 == null) {
			return null;
		}
		@Pc(29) Class3_Sub3 local29 = this.aClass3_Sub3Array1[(int) (this.aLong226 & (long) (this.anInt6717 - 1))];
		while (local29 != this.aClass3_Sub3_54) {
			if (this.aLong226 == this.aClass3_Sub3_54.aLong243) {
				@Pc(45) Class3_Sub3 local45 = this.aClass3_Sub3_54;
				this.aClass3_Sub3_54 = this.aClass3_Sub3_54.aClass3_Sub3_57;
				return local45;
			}
			this.aClass3_Sub3_54 = this.aClass3_Sub3_54.aClass3_Sub3_57;
		}
		this.aClass3_Sub3_54 = null;
		return null;
	}
}
