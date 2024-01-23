import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class121 {

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Lclient!v;")
	private Class1_Sub1 aClass1_Sub1_47;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "[Lclient!v;")
	private Class1_Sub1[] aClass1_Sub1Array1;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
	private int anInt3781;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V")
	public Class121(@OriginalArg(0) int arg0) {
		this.aClass1_Sub1Array1 = new Class1_Sub1[arg0];
		this.anInt3781 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(26) Class1_Sub1 local26 = this.aClass1_Sub1Array1[local10] = new Class1_Sub1();
			local26.aClass1_Sub1_75 = local26;
			local26.aClass1_Sub1_74 = local26;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(JI)Lclient!v;")
	public Class1_Sub1 method3077(@OriginalArg(0) long arg0) {
		this.aLong149 = arg0;
		@Pc(22) Class1_Sub1 local22 = this.aClass1_Sub1Array1[(int) (arg0 & (long) (this.anInt3781 - 1))];
		for (this.aClass1_Sub1_47 = local22.aClass1_Sub1_75; this.aClass1_Sub1_47 != local22; this.aClass1_Sub1_47 = this.aClass1_Sub1_47.aClass1_Sub1_75) {
			if (this.aClass1_Sub1_47.aLong224 == arg0) {
				@Pc(43) Class1_Sub1 local43 = this.aClass1_Sub1_47;
				this.aClass1_Sub1_47 = this.aClass1_Sub1_47.aClass1_Sub1_75;
				return local43;
			}
		}
		this.aClass1_Sub1_47 = null;
		return null;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)Lclient!v;")
	public Class1_Sub1 method3082() {
		if (this.aClass1_Sub1_47 == null) {
			return null;
		}
		@Pc(30) Class1_Sub1 local30 = this.aClass1_Sub1Array1[(int) (this.aLong149 & (long) (this.anInt3781 - 1))];
		while (this.aClass1_Sub1_47 != local30) {
			if (this.aLong149 == this.aClass1_Sub1_47.aLong224) {
				@Pc(49) Class1_Sub1 local49 = this.aClass1_Sub1_47;
				this.aClass1_Sub1_47 = this.aClass1_Sub1_47.aClass1_Sub1_75;
				return local49;
			}
			this.aClass1_Sub1_47 = this.aClass1_Sub1_47.aClass1_Sub1_75;
		}
		this.aClass1_Sub1_47 = null;
		return null;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!v;BJ)V")
	public void method3083(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_Sub1_74 != null) {
			arg0.method4617();
		}
		@Pc(22) Class1_Sub1 local22 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt3781 - 1) & arg1)];
		arg0.aLong224 = arg1;
		arg0.aClass1_Sub1_74 = local22.aClass1_Sub1_74;
		arg0.aClass1_Sub1_75 = local22;
		arg0.aClass1_Sub1_74.aClass1_Sub1_75 = arg0;
		arg0.aClass1_Sub1_75.aClass1_Sub1_74 = arg0;
	}
}
