import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class200_Sub1 extends Class200 {

	@OriginalMember(owner = "client!ni", name = "lb", descriptor = "[I")
	public static final int[] lb = new int[16384];

	@OriginalMember(owner = "client!ni", name = "mb", descriptor = "[I")
	public static final int[] anIntArray576 = new int[16384];

	@OriginalMember(owner = "client!ni", name = "ib", descriptor = "Lclient!uv;")
	public Class298 aClass298_2;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			lb[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray576[local9] = (int) (Math.cos(local7 * (double) local9) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class200_Sub1(@OriginalArg(0) Class4_Sub1_Sub1 arg0) {
		super(arg0);
		this.aClass298_2 = new Class298(arg0);
		super.aClass97_Sub1_58 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
		super.aClass97_Sub1_57 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
		super.aClass97_Sub1_59 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
		super.aClass97_Sub1_55 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
		super.aClass97_Sub1_56 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
		super.aClass97_Sub1_60 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
		super.aClass97_Sub1_52 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
		super.aClass97_Sub1_51 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
		super.aClass97_Sub1_53 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
		super.aClass97_Sub1_54 = new Class97_Sub1_Sub2(super.aClass4_Sub1_14);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
		this.aClass298_2 = new Class298((Class4_Sub1_Sub1) super.aClass4_Sub1_14);
	}
}
