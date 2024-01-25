import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class28 {

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!jq;")
	private Class1_Sub3 aClass1_Sub3_5;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
	private final int anInt440;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "[Lclient!jq;")
	private final Class1_Sub3[] aClass1_Sub3Array1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
	public Class28(@OriginalArg(0) int arg0) {
		this.anInt440 = arg0;
		this.aClass1_Sub3Array1 = new Class1_Sub3[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub3 local20 = this.aClass1_Sub3Array1[local10] = new Class1_Sub3();
			local20.aClass1_Sub3_57 = local20;
			local20.aClass1_Sub3_58 = local20;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(JB)Lclient!jq;")
	public Class1_Sub3 method421(@OriginalArg(0) long arg0) {
		this.aLong15 = arg0;
		@Pc(20) Class1_Sub3 local20 = this.aClass1_Sub3Array1[(int) (arg0 & (long) (this.anInt440 - 1))];
		for (this.aClass1_Sub3_5 = local20.aClass1_Sub3_57; this.aClass1_Sub3_5 != local20; this.aClass1_Sub3_5 = this.aClass1_Sub3_5.aClass1_Sub3_57) {
			if (arg0 == this.aClass1_Sub3_5.aLong235) {
				@Pc(47) Class1_Sub3 local47 = this.aClass1_Sub3_5;
				this.aClass1_Sub3_5 = this.aClass1_Sub3_5.aClass1_Sub3_57;
				return local47;
			}
		}
		this.aClass1_Sub3_5 = null;
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!jq;J)V")
	public void method422(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_Sub3_58 != null) {
			arg0.method5941();
		}
		@Pc(21) Class1_Sub3 local21 = this.aClass1_Sub3Array1[(int) (arg1 & (long) (this.anInt440 - 1))];
		arg0.aClass1_Sub3_57 = local21;
		arg0.aClass1_Sub3_58 = local21.aClass1_Sub3_58;
		arg0.aClass1_Sub3_58.aClass1_Sub3_57 = arg0;
		arg0.aClass1_Sub3_57.aClass1_Sub3_58 = arg0;
		arg0.aLong235 = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lclient!jq;")
	public Class1_Sub3 method424() {
		if (this.aClass1_Sub3_5 == null) {
			return null;
		}
		@Pc(23) Class1_Sub3 local23 = this.aClass1_Sub3Array1[(int) ((long) (this.anInt440 - 1) & this.aLong15)];
		while (local23 != this.aClass1_Sub3_5) {
			if (this.aLong15 == this.aClass1_Sub3_5.aLong235) {
				@Pc(39) Class1_Sub3 local39 = this.aClass1_Sub3_5;
				this.aClass1_Sub3_5 = this.aClass1_Sub3_5.aClass1_Sub3_57;
				return local39;
			}
			this.aClass1_Sub3_5 = this.aClass1_Sub3_5.aClass1_Sub3_57;
		}
		this.aClass1_Sub3_5 = null;
		return null;
	}
}
