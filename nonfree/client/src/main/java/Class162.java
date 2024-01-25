import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class162 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Lclient!lj;")
	private Class6_Sub1 aClass6_Sub1_35;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	private final int anInt4004;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "[Lclient!lj;")
	private final Class6_Sub1[] aClass6_Sub1Array1;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I)V")
	public Class162(@OriginalArg(0) int arg0) {
		this.anInt4004 = arg0;
		this.aClass6_Sub1Array1 = new Class6_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub1 local20 = this.aClass6_Sub1Array1[local10] = new Class6_Sub1();
			local20.aClass6_Sub1_59 = local20;
			local20.aClass6_Sub1_60 = local20;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BJ)Lclient!lj;")
	public Class6_Sub1 method3459(@OriginalArg(1) long arg0) {
		this.aLong113 = arg0;
		@Pc(25) Class6_Sub1 local25 = this.aClass6_Sub1Array1[(int) ((long) (this.anInt4004 - 1) & arg0)];
		for (this.aClass6_Sub1_35 = local25.aClass6_Sub1_60; this.aClass6_Sub1_35 != local25; this.aClass6_Sub1_35 = this.aClass6_Sub1_35.aClass6_Sub1_60) {
			if (this.aClass6_Sub1_35.aLong250 == arg0) {
				@Pc(44) Class6_Sub1 local44 = this.aClass6_Sub1_35;
				this.aClass6_Sub1_35 = this.aClass6_Sub1_35.aClass6_Sub1_60;
				return local44;
			}
		}
		this.aClass6_Sub1_35 = null;
		return null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IJLclient!lj;)V")
	public void method3461(@OriginalArg(1) long arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg1.aClass6_Sub1_59 != null) {
			arg1.method7852();
		}
		@Pc(21) Class6_Sub1 local21 = this.aClass6_Sub1Array1[(int) (arg0 & (long) (this.anInt4004 - 1))];
		arg1.aClass6_Sub1_59 = local21.aClass6_Sub1_59;
		arg1.aClass6_Sub1_60 = local21;
		arg1.aClass6_Sub1_59.aClass6_Sub1_60 = arg1;
		arg1.aLong250 = arg0;
		arg1.aClass6_Sub1_60.aClass6_Sub1_59 = arg1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Lclient!lj;")
	public Class6_Sub1 method3463() {
		if (this.aClass6_Sub1_35 == null) {
			return null;
		}
		@Pc(23) Class6_Sub1 local23 = this.aClass6_Sub1Array1[(int) (this.aLong113 & (long) (this.anInt4004 - 1))];
		while (local23 != this.aClass6_Sub1_35) {
			if (this.aLong113 == this.aClass6_Sub1_35.aLong250) {
				@Pc(43) Class6_Sub1 local43 = this.aClass6_Sub1_35;
				this.aClass6_Sub1_35 = this.aClass6_Sub1_35.aClass6_Sub1_60;
				return local43;
			}
			this.aClass6_Sub1_35 = this.aClass6_Sub1_35.aClass6_Sub1_60;
		}
		this.aClass6_Sub1_35 = null;
		return null;
	}
}
