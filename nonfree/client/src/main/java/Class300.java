import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class300 {

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!v;")
	private Class14_Sub2 aClass14_Sub2_44;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	private final int anInt8625;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "[Lclient!v;")
	private final Class14_Sub2[] aClass14_Sub2Array1;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I)V")
	public Class300(@OriginalArg(0) int arg0) {
		this.anInt8625 = arg0;
		this.aClass14_Sub2Array1 = new Class14_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class14_Sub2 local20 = this.aClass14_Sub2Array1[local10] = new Class14_Sub2();
			local20.aClass14_Sub2_67 = local20;
			local20.aClass14_Sub2_66 = local20;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Lclient!v;")
	public Class14_Sub2 method7454() {
		if (this.aClass14_Sub2_44 == null) {
			return null;
		}
		@Pc(24) Class14_Sub2 local24 = this.aClass14_Sub2Array1[(int) (this.aLong230 & (long) (this.anInt8625 - 1))];
		while (this.aClass14_Sub2_44 != local24) {
			if (this.aLong230 == this.aClass14_Sub2_44.aLong308) {
				@Pc(38) Class14_Sub2 local38 = this.aClass14_Sub2_44;
				this.aClass14_Sub2_44 = this.aClass14_Sub2_44.aClass14_Sub2_67;
				return local38;
			}
			this.aClass14_Sub2_44 = this.aClass14_Sub2_44.aClass14_Sub2_67;
		}
		this.aClass14_Sub2_44 = null;
		return null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(JLclient!v;I)V")
	public void method7456(@OriginalArg(0) long arg0, @OriginalArg(1) Class14_Sub2 arg1) {
		if (arg1.aClass14_Sub2_66 != null) {
			arg1.method9093();
		}
		@Pc(23) Class14_Sub2 local23 = this.aClass14_Sub2Array1[(int) ((long) (this.anInt8625 - 1) & arg0)];
		arg1.aClass14_Sub2_66 = local23.aClass14_Sub2_66;
		arg1.aClass14_Sub2_67 = local23;
		arg1.aClass14_Sub2_66.aClass14_Sub2_67 = arg1;
		arg1.aClass14_Sub2_67.aClass14_Sub2_66 = arg1;
		arg1.aLong308 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZJ)Lclient!v;")
	public Class14_Sub2 method7457(@OriginalArg(1) long arg0) {
		this.aLong230 = arg0;
		@Pc(26) Class14_Sub2 local26 = this.aClass14_Sub2Array1[(int) (arg0 & (long) (this.anInt8625 - 1))];
		for (this.aClass14_Sub2_44 = local26.aClass14_Sub2_67; this.aClass14_Sub2_44 != local26; this.aClass14_Sub2_44 = this.aClass14_Sub2_44.aClass14_Sub2_67) {
			if (arg0 == this.aClass14_Sub2_44.aLong308) {
				@Pc(47) Class14_Sub2 local47 = this.aClass14_Sub2_44;
				this.aClass14_Sub2_44 = this.aClass14_Sub2_44.aClass14_Sub2_67;
				return local47;
			}
		}
		this.aClass14_Sub2_44 = null;
		return null;
	}
}
