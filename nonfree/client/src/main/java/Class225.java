import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class225 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Lclient!wf;")
	private Class4_Sub2 aClass4_Sub2_45;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
	private final int anInt5864;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "[Lclient!wf;")
	private final Class4_Sub2[] aClass4_Sub2Array1;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V")
	public Class225(@OriginalArg(0) int arg0) {
		this.anInt5864 = arg0;
		this.aClass4_Sub2Array1 = new Class4_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub2 local20 = this.aClass4_Sub2Array1[local10] = new Class4_Sub2();
			local20.aClass4_Sub2_57 = local20;
			local20.aClass4_Sub2_56 = local20;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(JLclient!wf;B)V")
	public void method4680(@OriginalArg(0) long arg0, @OriginalArg(1) Class4_Sub2 arg1) {
		if (arg1.aClass4_Sub2_56 != null) {
			arg1.method5538();
		}
		@Pc(25) Class4_Sub2 local25 = this.aClass4_Sub2Array1[(int) (arg0 & (long) (this.anInt5864 - 1))];
		arg1.aClass4_Sub2_57 = local25;
		arg1.aClass4_Sub2_56 = local25.aClass4_Sub2_56;
		arg1.aClass4_Sub2_56.aClass4_Sub2_57 = arg1;
		arg1.aClass4_Sub2_57.aClass4_Sub2_56 = arg1;
		arg1.aLong208 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Lclient!wf;")
	public Class4_Sub2 method4681() {
		if (this.aClass4_Sub2_45 == null) {
			return null;
		}
		@Pc(23) Class4_Sub2 local23 = this.aClass4_Sub2Array1[(int) (this.aLong177 & (long) (this.anInt5864 - 1))];
		while (local23 != this.aClass4_Sub2_45) {
			if (this.aClass4_Sub2_45.aLong208 == this.aLong177) {
				@Pc(35) Class4_Sub2 local35 = this.aClass4_Sub2_45;
				this.aClass4_Sub2_45 = this.aClass4_Sub2_45.aClass4_Sub2_57;
				return local35;
			}
			this.aClass4_Sub2_45 = this.aClass4_Sub2_45.aClass4_Sub2_57;
		}
		this.aClass4_Sub2_45 = null;
		return null;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IJ)Lclient!wf;")
	public Class4_Sub2 method4683(@OriginalArg(1) long arg0) {
		this.aLong177 = arg0;
		@Pc(20) Class4_Sub2 local20 = this.aClass4_Sub2Array1[(int) ((long) (this.anInt5864 - 1) & arg0)];
		for (this.aClass4_Sub2_45 = local20.aClass4_Sub2_57; this.aClass4_Sub2_45 != local20; this.aClass4_Sub2_45 = this.aClass4_Sub2_45.aClass4_Sub2_57) {
			if (this.aClass4_Sub2_45.aLong208 == arg0) {
				@Pc(35) Class4_Sub2 local35 = this.aClass4_Sub2_45;
				this.aClass4_Sub2_45 = this.aClass4_Sub2_45.aClass4_Sub2_57;
				return local35;
			}
		}
		this.aClass4_Sub2_45 = null;
		return null;
	}
}
