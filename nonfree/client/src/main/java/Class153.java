import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class153 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!bo;")
	private Class3_Sub4 aClass3_Sub4_35;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	private final int anInt4322;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "[Lclient!bo;")
	private final Class3_Sub4[] aClass3_Sub4Array1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
	public Class153(@OriginalArg(0) int arg0) {
		this.anInt4322 = arg0;
		this.aClass3_Sub4Array1 = new Class3_Sub4[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub4 local20 = this.aClass3_Sub4Array1[local10] = new Class3_Sub4();
			local20.aClass3_Sub4_61 = local20;
			local20.aClass3_Sub4_62 = local20;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!bo;JI)V")
	public void method3671(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_Sub4_62 != null) {
			arg0.method8309();
		}
		@Pc(26) Class3_Sub4 local26 = this.aClass3_Sub4Array1[(int) ((long) (this.anInt4322 - 1) & arg1)];
		arg0.aClass3_Sub4_62 = local26.aClass3_Sub4_62;
		arg0.aClass3_Sub4_61 = local26;
		arg0.aClass3_Sub4_62.aClass3_Sub4_61 = arg0;
		arg0.aLong259 = arg1;
		arg0.aClass3_Sub4_61.aClass3_Sub4_62 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Lclient!bo;")
	public Class3_Sub4 method3674() {
		if (this.aClass3_Sub4_35 == null) {
			return null;
		}
		@Pc(27) Class3_Sub4 local27 = this.aClass3_Sub4Array1[(int) (this.aLong120 & (long) (this.anInt4322 - 1))];
		while (local27 != this.aClass3_Sub4_35) {
			if (this.aLong120 == this.aClass3_Sub4_35.aLong259) {
				@Pc(38) Class3_Sub4 local38 = this.aClass3_Sub4_35;
				this.aClass3_Sub4_35 = this.aClass3_Sub4_35.aClass3_Sub4_61;
				return local38;
			}
			this.aClass3_Sub4_35 = this.aClass3_Sub4_35.aClass3_Sub4_61;
		}
		this.aClass3_Sub4_35 = null;
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)Lclient!bo;")
	public Class3_Sub4 method3676(@OriginalArg(0) long arg0) {
		this.aLong120 = arg0;
		@Pc(18) Class3_Sub4 local18 = this.aClass3_Sub4Array1[(int) (arg0 & (long) (this.anInt4322 - 1))];
		for (this.aClass3_Sub4_35 = local18.aClass3_Sub4_61; this.aClass3_Sub4_35 != local18; this.aClass3_Sub4_35 = this.aClass3_Sub4_35.aClass3_Sub4_61) {
			if (arg0 == this.aClass3_Sub4_35.aLong259) {
				@Pc(49) Class3_Sub4 local49 = this.aClass3_Sub4_35;
				this.aClass3_Sub4_35 = this.aClass3_Sub4_35.aClass3_Sub4_61;
				return local49;
			}
		}
		this.aClass3_Sub4_35 = null;
		return null;
	}
}
