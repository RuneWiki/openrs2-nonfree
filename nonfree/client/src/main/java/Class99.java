import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class99 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "Lclient!su;")
	private Class5_Sub2 aClass5_Sub2_15;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "[Lclient!su;")
	private final Class5_Sub2[] aClass5_Sub2Array1;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	private final int anInt2269;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(I)V")
	public Class99(@OriginalArg(0) int arg0) {
		this.aClass5_Sub2Array1 = new Class5_Sub2[arg0];
		this.anInt2269 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub2 local20 = this.aClass5_Sub2Array1[local10] = new Class5_Sub2();
			local20.aClass5_Sub2_66 = local20;
			local20.aClass5_Sub2_67 = local20;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(JI)Lclient!su;")
	public Class5_Sub2 method2043(@OriginalArg(0) long arg0) {
		this.aLong84 = arg0;
		@Pc(26) Class5_Sub2 local26 = this.aClass5_Sub2Array1[(int) ((long) (this.anInt2269 - 1) & arg0)];
		for (this.aClass5_Sub2_15 = local26.aClass5_Sub2_67; this.aClass5_Sub2_15 != local26; this.aClass5_Sub2_15 = this.aClass5_Sub2_15.aClass5_Sub2_67) {
			if (arg0 == this.aClass5_Sub2_15.aLong319) {
				@Pc(41) Class5_Sub2 local41 = this.aClass5_Sub2_15;
				this.aClass5_Sub2_15 = this.aClass5_Sub2_15.aClass5_Sub2_67;
				return local41;
			}
		}
		this.aClass5_Sub2_15 = null;
		return null;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!su;J)V")
	public void method2044(@OriginalArg(1) Class5_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass5_Sub2_66 != null) {
			arg0.method8569();
		}
		@Pc(21) Class5_Sub2 local21 = this.aClass5_Sub2Array1[(int) ((long) (this.anInt2269 - 1) & arg1)];
		arg0.aClass5_Sub2_66 = local21.aClass5_Sub2_66;
		arg0.aClass5_Sub2_67 = local21;
		arg0.aClass5_Sub2_66.aClass5_Sub2_67 = arg0;
		arg0.aClass5_Sub2_67.aClass5_Sub2_66 = arg0;
		arg0.aLong319 = arg1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Lclient!su;")
	public Class5_Sub2 method2046() {
		if (this.aClass5_Sub2_15 == null) {
			return null;
		}
		@Pc(23) Class5_Sub2 local23 = this.aClass5_Sub2Array1[(int) ((long) (this.anInt2269 - 1) & this.aLong84)];
		while (this.aClass5_Sub2_15 != local23) {
			if (this.aLong84 == this.aClass5_Sub2_15.aLong319) {
				@Pc(35) Class5_Sub2 local35 = this.aClass5_Sub2_15;
				this.aClass5_Sub2_15 = this.aClass5_Sub2_15.aClass5_Sub2_67;
				return local35;
			}
			this.aClass5_Sub2_15 = this.aClass5_Sub2_15.aClass5_Sub2_67;
		}
		this.aClass5_Sub2_15 = null;
		return null;
	}
}
