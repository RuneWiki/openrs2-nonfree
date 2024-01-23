import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class162 {

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "Lclient!nh;")
	private Class4_Sub2 aClass4_Sub2_60;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
	private int anInt5101;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "[Lclient!nh;")
	private Class4_Sub2[] aClass4_Sub2Array1;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V")
	public Class162(@OriginalArg(0) int arg0) {
		this.anInt5101 = arg0;
		this.aClass4_Sub2Array1 = new Class4_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(22) Class4_Sub2 local22 = this.aClass4_Sub2Array1[local10] = new Class4_Sub2();
			local22.aClass4_Sub2_71 = local22;
			local22.aClass4_Sub2_72 = local22;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZJ)Lclient!nh;")
	public Class4_Sub2 method4055(@OriginalArg(1) long arg0) {
		this.aLong178 = arg0;
		@Pc(20) Class4_Sub2 local20 = this.aClass4_Sub2Array1[(int) ((long) (this.anInt5101 - 1) & arg0)];
		for (this.aClass4_Sub2_60 = local20.aClass4_Sub2_72; this.aClass4_Sub2_60 != local20; this.aClass4_Sub2_60 = this.aClass4_Sub2_60.aClass4_Sub2_72) {
			if (arg0 == this.aClass4_Sub2_60.aLong212) {
				@Pc(38) Class4_Sub2 local38 = this.aClass4_Sub2_60;
				this.aClass4_Sub2_60 = this.aClass4_Sub2_60.aClass4_Sub2_72;
				return local38;
			}
		}
		this.aClass4_Sub2_60 = null;
		return null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(JLclient!nh;I)V")
	public void method4057(@OriginalArg(0) long arg0, @OriginalArg(1) Class4_Sub2 arg1) {
		if (arg1.aClass4_Sub2_71 != null) {
			arg1.method4697();
		}
		@Pc(31) Class4_Sub2 local31 = this.aClass4_Sub2Array1[(int) (arg0 & (long) (this.anInt5101 - 1))];
		arg1.aLong212 = arg0;
		arg1.aClass4_Sub2_71 = local31.aClass4_Sub2_71;
		arg1.aClass4_Sub2_72 = local31;
		arg1.aClass4_Sub2_71.aClass4_Sub2_72 = arg1;
		arg1.aClass4_Sub2_72.aClass4_Sub2_71 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lclient!nh;")
	public Class4_Sub2 method4058() {
		if (this.aClass4_Sub2_60 == null) {
			return null;
		}
		@Pc(24) Class4_Sub2 local24 = this.aClass4_Sub2Array1[(int) (this.aLong178 & (long) (this.anInt5101 - 1))];
		while (local24 != this.aClass4_Sub2_60) {
			if (this.aLong178 == this.aClass4_Sub2_60.aLong212) {
				@Pc(43) Class4_Sub2 local43 = this.aClass4_Sub2_60;
				this.aClass4_Sub2_60 = this.aClass4_Sub2_60.aClass4_Sub2_72;
				return local43;
			}
			this.aClass4_Sub2_60 = this.aClass4_Sub2_60.aClass4_Sub2_72;
		}
		this.aClass4_Sub2_60 = null;
		return null;
	}
}
