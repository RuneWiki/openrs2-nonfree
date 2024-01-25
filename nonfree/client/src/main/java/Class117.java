import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class117 {

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "J")
	private long aLong93;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!fr;")
	private Class1_Sub6 aClass1_Sub6_13;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[Lclient!fr;")
	private final Class1_Sub6[] aClass1_Sub6Array1;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	private final int anInt2865;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V")
	public Class117(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6Array1 = new Class1_Sub6[arg0];
		this.anInt2865 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub6 local20 = this.aClass1_Sub6Array1[local10] = new Class1_Sub6();
			local20.aClass1_Sub6_62 = local20;
			local20.aClass1_Sub6_61 = local20;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fr;JB)V")
	public void method2284(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_Sub6_62 != null) {
			arg0.method7811();
		}
		@Pc(21) Class1_Sub6 local21 = this.aClass1_Sub6Array1[(int) (arg1 & (long) (this.anInt2865 - 1))];
		arg0.aClass1_Sub6_61 = local21;
		arg0.aClass1_Sub6_62 = local21.aClass1_Sub6_62;
		arg0.aClass1_Sub6_62.aClass1_Sub6_61 = arg0;
		arg0.aLong293 = arg1;
		arg0.aClass1_Sub6_61.aClass1_Sub6_62 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Lclient!fr;")
	public Class1_Sub6 method2286() {
		if (this.aClass1_Sub6_13 == null) {
			return null;
		}
		@Pc(23) Class1_Sub6 local23 = this.aClass1_Sub6Array1[(int) (this.aLong93 & (long) (this.anInt2865 - 1))];
		while (this.aClass1_Sub6_13 != local23) {
			if (this.aClass1_Sub6_13.aLong293 == this.aLong93) {
				@Pc(35) Class1_Sub6 local35 = this.aClass1_Sub6_13;
				this.aClass1_Sub6_13 = this.aClass1_Sub6_13.aClass1_Sub6_61;
				return local35;
			}
			this.aClass1_Sub6_13 = this.aClass1_Sub6_13.aClass1_Sub6_61;
		}
		this.aClass1_Sub6_13 = null;
		return null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)Lclient!fr;")
	public Class1_Sub6 method2288(@OriginalArg(1) long arg0) {
		this.aLong93 = arg0;
		@Pc(26) Class1_Sub6 local26 = this.aClass1_Sub6Array1[(int) (arg0 & (long) (this.anInt2865 - 1))];
		for (this.aClass1_Sub6_13 = local26.aClass1_Sub6_61; this.aClass1_Sub6_13 != local26; this.aClass1_Sub6_13 = this.aClass1_Sub6_13.aClass1_Sub6_61) {
			if (arg0 == this.aClass1_Sub6_13.aLong293) {
				@Pc(45) Class1_Sub6 local45 = this.aClass1_Sub6_13;
				this.aClass1_Sub6_13 = this.aClass1_Sub6_13.aClass1_Sub6_61;
				return local45;
			}
		}
		this.aClass1_Sub6_13 = null;
		return null;
	}
}
