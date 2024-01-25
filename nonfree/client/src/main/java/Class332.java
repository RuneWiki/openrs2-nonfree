import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class332 {

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "J")
	private long aLong269;

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "Lclient!tia;")
	private Class3_Sub11 aClass3_Sub11_55;

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "[Lclient!tia;")
	private final Class3_Sub11[] aClass3_Sub11Array1;

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
	private final int anInt9223;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(I)V")
	public Class332(@OriginalArg(0) int arg0) {
		this.aClass3_Sub11Array1 = new Class3_Sub11[arg0];
		this.anInt9223 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub11 local20 = this.aClass3_Sub11Array1[local10] = new Class3_Sub11();
			local20.aClass3_Sub11_66 = local20;
			local20.aClass3_Sub11_67 = local20;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)Lclient!tia;")
	public Class3_Sub11 method8065() {
		if (this.aClass3_Sub11_55 == null) {
			return null;
		}
		@Pc(28) Class3_Sub11 local28 = this.aClass3_Sub11Array1[(int) (this.aLong269 & (long) (this.anInt9223 - 1))];
		while (this.aClass3_Sub11_55 != local28) {
			if (this.aLong269 == this.aClass3_Sub11_55.aLong310) {
				@Pc(40) Class3_Sub11 local40 = this.aClass3_Sub11_55;
				this.aClass3_Sub11_55 = this.aClass3_Sub11_55.aClass3_Sub11_67;
				return local40;
			}
			this.aClass3_Sub11_55 = this.aClass3_Sub11_55.aClass3_Sub11_67;
		}
		this.aClass3_Sub11_55 = null;
		return null;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!tia;BJ)V")
	public void method8066(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_Sub11_66 != null) {
			arg0.method9345();
		}
		@Pc(29) Class3_Sub11 local29 = this.aClass3_Sub11Array1[(int) (arg1 & (long) (this.anInt9223 - 1))];
		arg0.aClass3_Sub11_66 = local29.aClass3_Sub11_66;
		arg0.aClass3_Sub11_67 = local29;
		arg0.aClass3_Sub11_66.aClass3_Sub11_67 = arg0;
		arg0.aLong310 = arg1;
		arg0.aClass3_Sub11_67.aClass3_Sub11_66 = arg0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IJ)Lclient!tia;")
	public Class3_Sub11 method8067(@OriginalArg(1) long arg0) {
		this.aLong269 = arg0;
		@Pc(20) Class3_Sub11 local20 = this.aClass3_Sub11Array1[(int) ((long) (this.anInt9223 - 1) & arg0)];
		for (this.aClass3_Sub11_55 = local20.aClass3_Sub11_67; this.aClass3_Sub11_55 != local20; this.aClass3_Sub11_55 = this.aClass3_Sub11_55.aClass3_Sub11_67) {
			if (this.aClass3_Sub11_55.aLong310 == arg0) {
				@Pc(39) Class3_Sub11 local39 = this.aClass3_Sub11_55;
				this.aClass3_Sub11_55 = this.aClass3_Sub11_55.aClass3_Sub11_67;
				return local39;
			}
		}
		this.aClass3_Sub11_55 = null;
		return null;
	}
}
