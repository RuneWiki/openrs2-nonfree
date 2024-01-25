import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class102 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "Lclient!mg;")
	private Class6_Sub2 aClass6_Sub2_13;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
	private final int anInt3128;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "[Lclient!mg;")
	private final Class6_Sub2[] aClass6_Sub2Array1;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V")
	public Class102(@OriginalArg(0) int arg0) {
		this.anInt3128 = arg0;
		this.aClass6_Sub2Array1 = new Class6_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[local10] = new Class6_Sub2();
			local20.aClass6_Sub2_56 = local20;
			local20.aClass6_Sub2_55 = local20;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lclient!mg;")
	public Class6_Sub2 method2602() {
		if (this.aClass6_Sub2_13 == null) {
			return null;
		}
		@Pc(23) Class6_Sub2 local23 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt3128 - 1) & this.aLong90)];
		while (this.aClass6_Sub2_13 != local23) {
			if (this.aLong90 == this.aClass6_Sub2_13.aLong225) {
				@Pc(39) Class6_Sub2 local39 = this.aClass6_Sub2_13;
				this.aClass6_Sub2_13 = this.aClass6_Sub2_13.aClass6_Sub2_56;
				return local39;
			}
			this.aClass6_Sub2_13 = this.aClass6_Sub2_13.aClass6_Sub2_56;
		}
		this.aClass6_Sub2_13 = null;
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZJ)Lclient!mg;")
	public Class6_Sub2 method2604(@OriginalArg(1) long arg0) {
		this.aLong90 = arg0;
		@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt3128 - 1) & arg0)];
		for (this.aClass6_Sub2_13 = local20.aClass6_Sub2_56; this.aClass6_Sub2_13 != local20; this.aClass6_Sub2_13 = this.aClass6_Sub2_13.aClass6_Sub2_56) {
			if (arg0 == this.aClass6_Sub2_13.aLong225) {
				@Pc(35) Class6_Sub2 local35 = this.aClass6_Sub2_13;
				this.aClass6_Sub2_13 = this.aClass6_Sub2_13.aClass6_Sub2_56;
				return local35;
			}
		}
		this.aClass6_Sub2_13 = null;
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BJLclient!mg;)V")
	public void method2606(@OriginalArg(1) long arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		if (arg1.aClass6_Sub2_55 != null) {
			arg1.method6373();
		}
		@Pc(21) Class6_Sub2 local21 = this.aClass6_Sub2Array1[(int) (arg0 & (long) (this.anInt3128 - 1))];
		arg1.aClass6_Sub2_56 = local21;
		arg1.aClass6_Sub2_55 = local21.aClass6_Sub2_55;
		arg1.aClass6_Sub2_55.aClass6_Sub2_56 = arg1;
		arg1.aClass6_Sub2_56.aClass6_Sub2_55 = arg1;
		arg1.aLong225 = arg0;
	}
}
