import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class244 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!no;")
	private Class2_Sub6 aClass2_Sub6_34;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	private final int anInt6566;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "[Lclient!no;")
	private final Class2_Sub6[] aClass2_Sub6Array1;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V")
	public Class244(@OriginalArg(0) int arg0) {
		this.anInt6566 = arg0;
		this.aClass2_Sub6Array1 = new Class2_Sub6[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub6 local20 = this.aClass2_Sub6Array1[local10] = new Class2_Sub6();
			local20.aClass2_Sub6_63 = local20;
			local20.aClass2_Sub6_64 = local20;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!no;JB)V")
	public void method5892(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_Sub6_63 != null) {
			arg0.method8698();
		}
		@Pc(23) Class2_Sub6 local23 = this.aClass2_Sub6Array1[(int) (arg1 & (long) (this.anInt6566 - 1))];
		arg0.aClass2_Sub6_64 = local23;
		arg0.aClass2_Sub6_63 = local23.aClass2_Sub6_63;
		arg0.aClass2_Sub6_63.aClass2_Sub6_64 = arg0;
		arg0.aLong311 = arg1;
		arg0.aClass2_Sub6_64.aClass2_Sub6_63 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)Lclient!no;")
	public Class2_Sub6 method5893() {
		if (this.aClass2_Sub6_34 == null) {
			return null;
		}
		@Pc(24) Class2_Sub6 local24 = this.aClass2_Sub6Array1[(int) ((long) (this.anInt6566 - 1) & this.aLong189)];
		while (this.aClass2_Sub6_34 != local24) {
			if (this.aLong189 == this.aClass2_Sub6_34.aLong311) {
				@Pc(45) Class2_Sub6 local45 = this.aClass2_Sub6_34;
				this.aClass2_Sub6_34 = this.aClass2_Sub6_34.aClass2_Sub6_64;
				return local45;
			}
			this.aClass2_Sub6_34 = this.aClass2_Sub6_34.aClass2_Sub6_64;
		}
		this.aClass2_Sub6_34 = null;
		return null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BJ)Lclient!no;")
	public Class2_Sub6 method5895(@OriginalArg(1) long arg0) {
		this.aLong189 = arg0;
		@Pc(26) Class2_Sub6 local26 = this.aClass2_Sub6Array1[(int) (arg0 & (long) (this.anInt6566 - 1))];
		for (this.aClass2_Sub6_34 = local26.aClass2_Sub6_64; this.aClass2_Sub6_34 != local26; this.aClass2_Sub6_34 = this.aClass2_Sub6_34.aClass2_Sub6_64) {
			if (arg0 == this.aClass2_Sub6_34.aLong311) {
				@Pc(47) Class2_Sub6 local47 = this.aClass2_Sub6_34;
				this.aClass2_Sub6_34 = this.aClass2_Sub6_34.aClass2_Sub6_64;
				return local47;
			}
		}
		this.aClass2_Sub6_34 = null;
		return null;
	}
}
