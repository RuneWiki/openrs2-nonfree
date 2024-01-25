import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class182 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!m;")
	private Class6_Sub2 aClass6_Sub2_50;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "[Lclient!m;")
	private final Class6_Sub2[] aClass6_Sub2Array1;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	private final int anInt5391;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V")
	public Class182(@OriginalArg(0) int arg0) {
		this.aClass6_Sub2Array1 = new Class6_Sub2[arg0];
		this.anInt5391 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[local10] = new Class6_Sub2();
			local20.aClass6_Sub2_61 = local20;
			local20.aClass6_Sub2_62 = local20;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(JI)Lclient!m;")
	public Class6_Sub2 method4907(@OriginalArg(0) long arg0) {
		this.aLong178 = arg0;
		@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt5391 - 1) & arg0)];
		for (this.aClass6_Sub2_50 = local20.aClass6_Sub2_61; this.aClass6_Sub2_50 != local20; this.aClass6_Sub2_50 = this.aClass6_Sub2_50.aClass6_Sub2_61) {
			if (this.aClass6_Sub2_50.aLong219 == arg0) {
				@Pc(35) Class6_Sub2 local35 = this.aClass6_Sub2_50;
				this.aClass6_Sub2_50 = this.aClass6_Sub2_50.aClass6_Sub2_61;
				return local35;
			}
		}
		this.aClass6_Sub2_50 = null;
		return null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!m;JI)V")
	public void method4911(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass6_Sub2_62 != null) {
			arg0.method5761();
		}
		@Pc(21) Class6_Sub2 local21 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt5391 - 1) & arg1)];
		arg0.aClass6_Sub2_61 = local21;
		arg0.aClass6_Sub2_62 = local21.aClass6_Sub2_62;
		arg0.aClass6_Sub2_62.aClass6_Sub2_61 = arg0;
		arg0.aClass6_Sub2_61.aClass6_Sub2_62 = arg0;
		arg0.aLong219 = arg1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lclient!m;")
	public Class6_Sub2 method4912() {
		if (this.aClass6_Sub2_50 == null) {
			return null;
		}
		@Pc(23) Class6_Sub2 local23 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt5391 - 1) & this.aLong178)];
		while (local23 != this.aClass6_Sub2_50) {
			if (this.aClass6_Sub2_50.aLong219 == this.aLong178) {
				@Pc(35) Class6_Sub2 local35 = this.aClass6_Sub2_50;
				this.aClass6_Sub2_50 = this.aClass6_Sub2_50.aClass6_Sub2_61;
				return local35;
			}
			this.aClass6_Sub2_50 = this.aClass6_Sub2_50.aClass6_Sub2_61;
		}
		this.aClass6_Sub2_50 = null;
		return null;
	}
}
