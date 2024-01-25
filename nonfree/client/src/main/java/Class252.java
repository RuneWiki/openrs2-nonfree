import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class252 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Lclient!pm;")
	private Class1_Sub1 aClass1_Sub1_51;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "J")
	private long aLong185;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "[Lclient!pm;")
	private final Class1_Sub1[] aClass1_Sub1Array1;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	private final int anInt7197;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
	public Class252(@OriginalArg(0) int arg0) {
		this.aClass1_Sub1Array1 = new Class1_Sub1[arg0];
		this.anInt7197 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub1 local20 = this.aClass1_Sub1Array1[local10] = new Class1_Sub1();
			local20.aClass1_Sub1_59 = local20;
			local20.aClass1_Sub1_60 = local20;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZJ)Lclient!pm;")
	public Class1_Sub1 method6158(@OriginalArg(1) long arg0) {
		this.aLong185 = arg0;
		@Pc(20) Class1_Sub1 local20 = this.aClass1_Sub1Array1[(int) (arg0 & (long) (this.anInt7197 - 1))];
		for (this.aClass1_Sub1_51 = local20.aClass1_Sub1_59; this.aClass1_Sub1_51 != local20; this.aClass1_Sub1_51 = this.aClass1_Sub1_51.aClass1_Sub1_59) {
			if (arg0 == this.aClass1_Sub1_51.aLong234) {
				@Pc(39) Class1_Sub1 local39 = this.aClass1_Sub1_51;
				this.aClass1_Sub1_51 = this.aClass1_Sub1_51.aClass1_Sub1_59;
				return local39;
			}
		}
		this.aClass1_Sub1_51 = null;
		return null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!pm;BJ)V")
	public void method6159(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_Sub1_60 != null) {
			arg0.method7493();
		}
		@Pc(21) Class1_Sub1 local21 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt7197 - 1) & arg1)];
		arg0.aClass1_Sub1_59 = local21;
		arg0.aClass1_Sub1_60 = local21.aClass1_Sub1_60;
		arg0.aClass1_Sub1_60.aClass1_Sub1_59 = arg0;
		arg0.aClass1_Sub1_59.aClass1_Sub1_60 = arg0;
		arg0.aLong234 = arg1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Lclient!pm;")
	public Class1_Sub1 method6161() {
		if (this.aClass1_Sub1_51 == null) {
			return null;
		}
		@Pc(28) Class1_Sub1 local28 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt7197 - 1) & this.aLong185)];
		while (local28 != this.aClass1_Sub1_51) {
			if (this.aClass1_Sub1_51.aLong234 == this.aLong185) {
				@Pc(44) Class1_Sub1 local44 = this.aClass1_Sub1_51;
				this.aClass1_Sub1_51 = this.aClass1_Sub1_51.aClass1_Sub1_59;
				return local44;
			}
			this.aClass1_Sub1_51 = this.aClass1_Sub1_51.aClass1_Sub1_59;
		}
		this.aClass1_Sub1_51 = null;
		return null;
	}
}
