import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class296 {

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!rba;")
	private Class5_Sub1 aClass5_Sub1_48;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	private final int anInt7674;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "[Lclient!rba;")
	private final Class5_Sub1[] aClass5_Sub1Array1;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I)V")
	public Class296(@OriginalArg(0) int arg0) {
		this.anInt7674 = arg0;
		this.aClass5_Sub1Array1 = new Class5_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub1 local20 = this.aClass5_Sub1Array1[local10] = new Class5_Sub1();
			local20.aClass5_Sub1_65 = local20;
			local20.aClass5_Sub1_64 = local20;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lclient!rba;")
	public Class5_Sub1 method6673() {
		if (this.aClass5_Sub1_48 == null) {
			return null;
		}
		@Pc(24) Class5_Sub1 local24 = this.aClass5_Sub1Array1[(int) ((long) (this.anInt7674 - 1) & this.aLong224)];
		while (this.aClass5_Sub1_48 != local24) {
			if (this.aClass5_Sub1_48.aLong298 == this.aLong224) {
				@Pc(48) Class5_Sub1 local48 = this.aClass5_Sub1_48;
				this.aClass5_Sub1_48 = this.aClass5_Sub1_48.aClass5_Sub1_65;
				return local48;
			}
			this.aClass5_Sub1_48 = this.aClass5_Sub1_48.aClass5_Sub1_65;
		}
		this.aClass5_Sub1_48 = null;
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)Lclient!rba;")
	public Class5_Sub1 method6675(@OriginalArg(0) long arg0) {
		this.aLong224 = arg0;
		@Pc(20) Class5_Sub1 local20 = this.aClass5_Sub1Array1[(int) (arg0 & (long) (this.anInt7674 - 1))];
		for (this.aClass5_Sub1_48 = local20.aClass5_Sub1_65; this.aClass5_Sub1_48 != local20; this.aClass5_Sub1_48 = this.aClass5_Sub1_48.aClass5_Sub1_65) {
			if (this.aClass5_Sub1_48.aLong298 == arg0) {
				@Pc(37) Class5_Sub1 local37 = this.aClass5_Sub1_48;
				this.aClass5_Sub1_48 = this.aClass5_Sub1_48.aClass5_Sub1_65;
				return local37;
			}
		}
		this.aClass5_Sub1_48 = null;
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!rba;JI)V")
	public void method6678(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass5_Sub1_64 != null) {
			arg0.method8955();
		}
		@Pc(23) Class5_Sub1 local23 = this.aClass5_Sub1Array1[(int) ((long) (this.anInt7674 - 1) & arg1)];
		arg0.aClass5_Sub1_64 = local23.aClass5_Sub1_64;
		arg0.aClass5_Sub1_65 = local23;
		arg0.aClass5_Sub1_64.aClass5_Sub1_65 = arg0;
		arg0.aClass5_Sub1_65.aClass5_Sub1_64 = arg0;
		arg0.aLong298 = arg1;
	}
}
