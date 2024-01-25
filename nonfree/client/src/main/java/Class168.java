import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class168 {

	@OriginalMember(owner = "client!io", name = "d", descriptor = "J")
	private long aLong122;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Lclient!kh;")
	private Class5_Sub3 aClass5_Sub3_25;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	private final int anInt4918;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "[Lclient!kh;")
	private final Class5_Sub3[] aClass5_Sub3Array1;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V")
	public Class168(@OriginalArg(0) int arg0) {
		this.anInt4918 = arg0;
		this.aClass5_Sub3Array1 = new Class5_Sub3[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub3 local20 = this.aClass5_Sub3Array1[local10] = new Class5_Sub3();
			local20.aClass5_Sub3_67 = local20;
			local20.aClass5_Sub3_66 = local20;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BJ)Lclient!kh;")
	public Class5_Sub3 method4121(@OriginalArg(1) long arg0) {
		this.aLong122 = arg0;
		@Pc(20) Class5_Sub3 local20 = this.aClass5_Sub3Array1[(int) ((long) (this.anInt4918 - 1) & arg0)];
		for (this.aClass5_Sub3_25 = local20.aClass5_Sub3_66; this.aClass5_Sub3_25 != local20; this.aClass5_Sub3_25 = this.aClass5_Sub3_25.aClass5_Sub3_66) {
			if (arg0 == this.aClass5_Sub3_25.aLong297) {
				@Pc(35) Class5_Sub3 local35 = this.aClass5_Sub3_25;
				this.aClass5_Sub3_25 = this.aClass5_Sub3_25.aClass5_Sub3_66;
				return local35;
			}
		}
		this.aClass5_Sub3_25 = null;
		return null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(JLclient!kh;I)V")
	public void method4122(@OriginalArg(0) long arg0, @OriginalArg(1) Class5_Sub3 arg1) {
		if (arg1.aClass5_Sub3_67 != null) {
			arg1.method8687();
		}
		@Pc(29) Class5_Sub3 local29 = this.aClass5_Sub3Array1[(int) ((long) (this.anInt4918 - 1) & arg0)];
		arg1.aClass5_Sub3_66 = local29;
		arg1.aClass5_Sub3_67 = local29.aClass5_Sub3_67;
		arg1.aClass5_Sub3_67.aClass5_Sub3_66 = arg1;
		arg1.aLong297 = arg0;
		arg1.aClass5_Sub3_66.aClass5_Sub3_67 = arg1;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)Lclient!kh;")
	public Class5_Sub3 method4123() {
		if (this.aClass5_Sub3_25 == null) {
			return null;
		}
		@Pc(29) Class5_Sub3 local29 = this.aClass5_Sub3Array1[(int) (this.aLong122 & (long) (this.anInt4918 - 1))];
		while (this.aClass5_Sub3_25 != local29) {
			if (this.aClass5_Sub3_25.aLong297 == this.aLong122) {
				@Pc(45) Class5_Sub3 local45 = this.aClass5_Sub3_25;
				this.aClass5_Sub3_25 = this.aClass5_Sub3_25.aClass5_Sub3_66;
				return local45;
			}
			this.aClass5_Sub3_25 = this.aClass5_Sub3_25.aClass5_Sub3_66;
		}
		this.aClass5_Sub3_25 = null;
		return null;
	}
}
