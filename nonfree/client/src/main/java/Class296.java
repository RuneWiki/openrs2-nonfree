import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class296 {

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "Lclient!pp;")
	private Class2_Sub3 aClass2_Sub3_52;

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
	private final int anInt8181;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "[Lclient!pp;")
	private final Class2_Sub3[] aClass2_Sub3Array1;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(I)V")
	public Class296(@OriginalArg(0) int arg0) {
		this.anInt8181 = arg0;
		this.aClass2_Sub3Array1 = new Class2_Sub3[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub3 local20 = this.aClass2_Sub3Array1[local10] = new Class2_Sub3();
			local20.aClass2_Sub3_62 = local20;
			local20.aClass2_Sub3_61 = local20;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IJ)Lclient!pp;")
	public Class2_Sub3 method6774(@OriginalArg(1) long arg0) {
		this.aLong221 = arg0;
		@Pc(20) Class2_Sub3 local20 = this.aClass2_Sub3Array1[(int) (arg0 & (long) (this.anInt8181 - 1))];
		for (this.aClass2_Sub3_52 = local20.aClass2_Sub3_61; this.aClass2_Sub3_52 != local20; this.aClass2_Sub3_52 = this.aClass2_Sub3_52.aClass2_Sub3_61) {
			if (this.aClass2_Sub3_52.aLong260 == arg0) {
				@Pc(39) Class2_Sub3 local39 = this.aClass2_Sub3_52;
				this.aClass2_Sub3_52 = this.aClass2_Sub3_52.aClass2_Sub3_61;
				return local39;
			}
		}
		this.aClass2_Sub3_52 = null;
		return null;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(JILclient!pp;)V")
	public void method6775(@OriginalArg(0) long arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg1.aClass2_Sub3_62 != null) {
			arg1.method7767();
		}
		@Pc(21) Class2_Sub3 local21 = this.aClass2_Sub3Array1[(int) (arg0 & (long) (this.anInt8181 - 1))];
		arg1.aClass2_Sub3_61 = local21;
		arg1.aClass2_Sub3_62 = local21.aClass2_Sub3_62;
		arg1.aClass2_Sub3_62.aClass2_Sub3_61 = arg1;
		arg1.aLong260 = arg0;
		arg1.aClass2_Sub3_61.aClass2_Sub3_62 = arg1;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)Lclient!pp;")
	public Class2_Sub3 method6778() {
		if (this.aClass2_Sub3_52 == null) {
			return null;
		}
		@Pc(28) Class2_Sub3 local28 = this.aClass2_Sub3Array1[(int) (this.aLong221 & (long) (this.anInt8181 - 1))];
		while (this.aClass2_Sub3_52 != local28) {
			if (this.aLong221 == this.aClass2_Sub3_52.aLong260) {
				@Pc(40) Class2_Sub3 local40 = this.aClass2_Sub3_52;
				this.aClass2_Sub3_52 = this.aClass2_Sub3_52.aClass2_Sub3_61;
				return local40;
			}
			this.aClass2_Sub3_52 = this.aClass2_Sub3_52.aClass2_Sub3_61;
		}
		this.aClass2_Sub3_52 = null;
		return null;
	}
}
