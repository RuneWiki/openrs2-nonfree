import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class217 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "J")
	private long aLong155;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!vda;")
	private Class4_Sub5 aClass4_Sub5_39;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "[Lclient!vda;")
	private final Class4_Sub5[] aClass4_Sub5Array1;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	private final int anInt6276;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
	public Class217(@OriginalArg(0) int arg0) {
		this.aClass4_Sub5Array1 = new Class4_Sub5[arg0];
		this.anInt6276 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class4_Sub5 local20 = this.aClass4_Sub5Array1[local10] = new Class4_Sub5();
			local20.aClass4_Sub5_62 = local20;
			local20.aClass4_Sub5_61 = local20;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!vda;IJ)V")
	public void method5339(@OriginalArg(0) Class4_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_Sub5_61 != null) {
			arg0.method8015();
		}
		@Pc(21) Class4_Sub5 local21 = this.aClass4_Sub5Array1[(int) (arg1 & (long) (this.anInt6276 - 1))];
		arg0.aClass4_Sub5_62 = local21;
		arg0.aClass4_Sub5_61 = local21.aClass4_Sub5_61;
		arg0.aClass4_Sub5_61.aClass4_Sub5_62 = arg0;
		arg0.aLong257 = arg1;
		arg0.aClass4_Sub5_62.aClass4_Sub5_61 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Lclient!vda;")
	public Class4_Sub5 method5342() {
		if (this.aClass4_Sub5_39 == null) {
			return null;
		}
		@Pc(30) Class4_Sub5 local30 = this.aClass4_Sub5Array1[(int) (this.aLong155 & (long) (this.anInt6276 - 1))];
		while (this.aClass4_Sub5_39 != local30) {
			if (this.aLong155 == this.aClass4_Sub5_39.aLong257) {
				@Pc(46) Class4_Sub5 local46 = this.aClass4_Sub5_39;
				this.aClass4_Sub5_39 = this.aClass4_Sub5_39.aClass4_Sub5_62;
				return local46;
			}
			this.aClass4_Sub5_39 = this.aClass4_Sub5_39.aClass4_Sub5_62;
		}
		this.aClass4_Sub5_39 = null;
		return null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(JI)Lclient!vda;")
	public Class4_Sub5 method5343(@OriginalArg(0) long arg0) {
		this.aLong155 = arg0;
		@Pc(26) Class4_Sub5 local26 = this.aClass4_Sub5Array1[(int) ((long) (this.anInt6276 - 1) & arg0)];
		for (this.aClass4_Sub5_39 = local26.aClass4_Sub5_62; this.aClass4_Sub5_39 != local26; this.aClass4_Sub5_39 = this.aClass4_Sub5_39.aClass4_Sub5_62) {
			if (this.aClass4_Sub5_39.aLong257 == arg0) {
				@Pc(41) Class4_Sub5 local41 = this.aClass4_Sub5_39;
				this.aClass4_Sub5_39 = this.aClass4_Sub5_39.aClass4_Sub5_62;
				return local41;
			}
		}
		this.aClass4_Sub5_39 = null;
		return null;
	}
}
