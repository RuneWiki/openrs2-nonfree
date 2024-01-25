import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class307 {

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "[I")
	public static final int[] anIntArray743 = new int[16384];

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "[I")
	public static final int[] anIntArray744 = new int[16384];

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "Lclient!pm;")
	private Class1_Sub1 aClass1_Sub1_58;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "Lclient!pm;")
	private final Class1_Sub1 aClass1_Sub1_57 = new Class1_Sub1();

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray744[local9] = (int) (Math.sin((double) local9 * local7) * 32768.0D);
			anIntArray743[local9] = (int) (Math.cos((double) local9 * local7) * 32768.0D);
		}
		new Class114("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class307() {
		this.aClass1_Sub1_57.aClass1_Sub1_59 = this.aClass1_Sub1_57;
		this.aClass1_Sub1_57.aClass1_Sub1_60 = this.aClass1_Sub1_57;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)I")
	public int method7353() {
		@Pc(5) int local5 = 0;
		for (@Pc(17) Class1_Sub1 local17 = this.aClass1_Sub1_57.aClass1_Sub1_59; local17 != this.aClass1_Sub1_57; local17 = local17.aClass1_Sub1_59) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!pm;Z)V")
	public void method7354(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_60 != null) {
			arg0.method7493();
		}
		arg0.aClass1_Sub1_60 = this.aClass1_Sub1_57.aClass1_Sub1_60;
		arg0.aClass1_Sub1_59 = this.aClass1_Sub1_57;
		arg0.aClass1_Sub1_60.aClass1_Sub1_59 = arg0;
		arg0.aClass1_Sub1_59.aClass1_Sub1_60 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)Lclient!pm;")
	public Class1_Sub1 method7355() {
		@Pc(6) Class1_Sub1 local6 = this.aClass1_Sub1_58;
		if (this.aClass1_Sub1_57 == local6) {
			this.aClass1_Sub1_58 = null;
			return null;
		} else {
			this.aClass1_Sub1_58 = local6.aClass1_Sub1_59;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(B)V")
	public void method7358() {
		while (true) {
			@Pc(13) Class1_Sub1 local13 = this.aClass1_Sub1_57.aClass1_Sub1_59;
			if (this.aClass1_Sub1_57 == local13) {
				this.aClass1_Sub1_58 = null;
				return;
			}
			local13.method7493();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Lclient!pm;")
	public Class1_Sub1 method7359() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_57.aClass1_Sub1_59;
		if (local7 == this.aClass1_Sub1_57) {
			this.aClass1_Sub1_58 = null;
			return null;
		} else {
			this.aClass1_Sub1_58 = local7.aClass1_Sub1_59;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)Lclient!pm;")
	public Class1_Sub1 method7360() {
		@Pc(11) Class1_Sub1 local11 = this.aClass1_Sub1_57.aClass1_Sub1_59;
		if (local11 == this.aClass1_Sub1_57) {
			return null;
		} else {
			local11.method7493();
			return local11;
		}
	}
}
