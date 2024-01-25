import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6 {

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "J")
	private long aLong3;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!ds;")
	private Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	private final int anInt45;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "[Lclient!ds;")
	private final Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	public Class6(@OriginalArg(0) int arg0) {
		this.anInt45 = arg0;
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub2 local20 = this.aClass1_Sub2Array1[local10] = new Class1_Sub2();
			local20.aClass1_Sub2_61 = local20;
			local20.aClass1_Sub2_62 = local20;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ds;JI)V")
	public void method35(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_Sub2_61 != null) {
			arg0.method5784();
		}
		@Pc(21) Class1_Sub2 local21 = this.aClass1_Sub2Array1[(int) ((long) (this.anInt45 - 1) & arg1)];
		arg0.aClass1_Sub2_61 = local21.aClass1_Sub2_61;
		arg0.aClass1_Sub2_62 = local21;
		arg0.aClass1_Sub2_61.aClass1_Sub2_62 = arg0;
		arg0.aClass1_Sub2_62.aClass1_Sub2_61 = arg0;
		arg0.aLong213 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Lclient!ds;")
	public Class1_Sub2 method38() {
		if (this.aClass1_Sub2_1 == null) {
			return null;
		}
		@Pc(31) Class1_Sub2 local31 = this.aClass1_Sub2Array1[(int) ((long) (this.anInt45 - 1) & this.aLong3)];
		while (local31 != this.aClass1_Sub2_1) {
			if (this.aClass1_Sub2_1.aLong213 == this.aLong3) {
				@Pc(43) Class1_Sub2 local43 = this.aClass1_Sub2_1;
				this.aClass1_Sub2_1 = this.aClass1_Sub2_1.aClass1_Sub2_62;
				return local43;
			}
			this.aClass1_Sub2_1 = this.aClass1_Sub2_1.aClass1_Sub2_62;
		}
		this.aClass1_Sub2_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IJ)Lclient!ds;")
	public Class1_Sub2 method39(@OriginalArg(1) long arg0) {
		this.aLong3 = arg0;
		@Pc(28) Class1_Sub2 local28 = this.aClass1_Sub2Array1[(int) (arg0 & (long) (this.anInt45 - 1))];
		for (this.aClass1_Sub2_1 = local28.aClass1_Sub2_62; this.aClass1_Sub2_1 != local28; this.aClass1_Sub2_1 = this.aClass1_Sub2_1.aClass1_Sub2_62) {
			if (this.aClass1_Sub2_1.aLong213 == arg0) {
				@Pc(47) Class1_Sub2 local47 = this.aClass1_Sub2_1;
				this.aClass1_Sub2_1 = this.aClass1_Sub2_1.aClass1_Sub2_62;
				return local47;
			}
		}
		this.aClass1_Sub2_1 = null;
		return null;
	}
}
