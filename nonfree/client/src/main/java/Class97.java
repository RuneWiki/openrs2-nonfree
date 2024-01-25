import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class97 {

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "Lclient!sk;")
	private Class5_Sub1 aClass5_Sub1_23;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
	private final int anInt2746;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "[Lclient!sk;")
	private final Class5_Sub1[] aClass5_Sub1Array1;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V")
	public Class97(@OriginalArg(0) int arg0) {
		this.anInt2746 = arg0;
		this.aClass5_Sub1Array1 = new Class5_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub1 local20 = this.aClass5_Sub1Array1[local10] = new Class5_Sub1();
			local20.aClass5_Sub1_61 = local20;
			local20.aClass5_Sub1_62 = local20;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)Lclient!sk;")
	public Class5_Sub1 method2514() {
		if (this.aClass5_Sub1_23 == null) {
			return null;
		}
		@Pc(23) Class5_Sub1 local23 = this.aClass5_Sub1Array1[(int) ((long) (this.anInt2746 - 1) & this.aLong95)];
		while (local23 != this.aClass5_Sub1_23) {
			if (this.aClass5_Sub1_23.aLong234 == this.aLong95) {
				@Pc(39) Class5_Sub1 local39 = this.aClass5_Sub1_23;
				this.aClass5_Sub1_23 = this.aClass5_Sub1_23.aClass5_Sub1_62;
				return local39;
			}
			this.aClass5_Sub1_23 = this.aClass5_Sub1_23.aClass5_Sub1_62;
		}
		this.aClass5_Sub1_23 = null;
		return null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(JB)Lclient!sk;")
	public Class5_Sub1 method2516(@OriginalArg(0) long arg0) {
		this.aLong95 = arg0;
		@Pc(20) Class5_Sub1 local20 = this.aClass5_Sub1Array1[(int) (arg0 & (long) (this.anInt2746 - 1))];
		for (this.aClass5_Sub1_23 = local20.aClass5_Sub1_62; this.aClass5_Sub1_23 != local20; this.aClass5_Sub1_23 = this.aClass5_Sub1_23.aClass5_Sub1_62) {
			if (this.aClass5_Sub1_23.aLong234 == arg0) {
				@Pc(40) Class5_Sub1 local40 = this.aClass5_Sub1_23;
				this.aClass5_Sub1_23 = this.aClass5_Sub1_23.aClass5_Sub1_62;
				return local40;
			}
		}
		this.aClass5_Sub1_23 = null;
		return null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(JLclient!sk;I)V")
	public void method2517(@OriginalArg(0) long arg0, @OriginalArg(1) Class5_Sub1 arg1) {
		if (arg1.aClass5_Sub1_61 != null) {
			arg1.method5970();
		}
		@Pc(29) Class5_Sub1 local29 = this.aClass5_Sub1Array1[(int) (arg0 & (long) (this.anInt2746 - 1))];
		arg1.aClass5_Sub1_61 = local29.aClass5_Sub1_61;
		arg1.aClass5_Sub1_62 = local29;
		arg1.aClass5_Sub1_61.aClass5_Sub1_62 = arg1;
		arg1.aLong234 = arg0;
		arg1.aClass5_Sub1_62.aClass5_Sub1_61 = arg1;
	}
}
