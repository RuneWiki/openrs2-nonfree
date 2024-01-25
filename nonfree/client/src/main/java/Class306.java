import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class306 {

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "Lclient!paa;")
	private Class1_Sub8 aClass1_Sub8_48;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
	private final int anInt8078;

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "[Lclient!paa;")
	private final Class1_Sub8[] aClass1_Sub8Array1;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(I)V")
	public Class306(@OriginalArg(0) int arg0) {
		this.anInt8078 = arg0;
		this.aClass1_Sub8Array1 = new Class1_Sub8[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub8 local20 = this.aClass1_Sub8Array1[local10] = new Class1_Sub8();
			local20.aClass1_Sub8_62 = local20;
			local20.aClass1_Sub8_61 = local20;
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!paa;BJ)V")
	public void method6494(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_Sub8_61 != null) {
			arg0.method7712();
		}
		@Pc(21) Class1_Sub8 local21 = this.aClass1_Sub8Array1[(int) ((long) (this.anInt8078 - 1) & arg1)];
		arg0.aClass1_Sub8_62 = local21;
		arg0.aClass1_Sub8_61 = local21.aClass1_Sub8_61;
		arg0.aClass1_Sub8_61.aClass1_Sub8_62 = arg0;
		arg0.aLong263 = arg1;
		arg0.aClass1_Sub8_62.aClass1_Sub8_61 = arg0;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Lclient!paa;")
	public Class1_Sub8 method6495() {
		if (this.aClass1_Sub8_48 == null) {
			return null;
		}
		@Pc(21) Class1_Sub8 local21 = this.aClass1_Sub8Array1[(int) (this.aLong216 & (long) (this.anInt8078 - 1))];
		while (this.aClass1_Sub8_48 != local21) {
			if (this.aLong216 == this.aClass1_Sub8_48.aLong263) {
				@Pc(36) Class1_Sub8 local36 = this.aClass1_Sub8_48;
				this.aClass1_Sub8_48 = this.aClass1_Sub8_48.aClass1_Sub8_62;
				return local36;
			}
			this.aClass1_Sub8_48 = this.aClass1_Sub8_48.aClass1_Sub8_62;
		}
		this.aClass1_Sub8_48 = null;
		return null;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IJ)Lclient!paa;")
	public Class1_Sub8 method6497(@OriginalArg(1) long arg0) {
		this.aLong216 = arg0;
		@Pc(20) Class1_Sub8 local20 = this.aClass1_Sub8Array1[(int) (arg0 & (long) (this.anInt8078 - 1))];
		for (this.aClass1_Sub8_48 = local20.aClass1_Sub8_62; this.aClass1_Sub8_48 != local20; this.aClass1_Sub8_48 = this.aClass1_Sub8_48.aClass1_Sub8_62) {
			if (arg0 == this.aClass1_Sub8_48.aLong263) {
				@Pc(44) Class1_Sub8 local44 = this.aClass1_Sub8_48;
				this.aClass1_Sub8_48 = this.aClass1_Sub8_48.aClass1_Sub8_62;
				return local44;
			}
		}
		this.aClass1_Sub8_48 = null;
		return null;
	}
}
