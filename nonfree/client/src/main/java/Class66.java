import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class66 {

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "Lclient!vc;")
	private Class1 aClass1_93;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "Lclient!vc;")
	private Class1 aClass1_94;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
	private int anInt2316 = 0;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	private final int anInt2313;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "[Lclient!vc;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	public Class66(@OriginalArg(0) int arg0) {
		this.anInt2313 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_119 = local23;
			local23.aClass1_120 = local23;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Lclient!vc;")
	public Class1 method1647() {
		this.anInt2316 = 0;
		return this.method1648();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lclient!vc;")
	public Class1 method1648() {
		@Pc(26) Class1 local26;
		if (this.anInt2316 > 0 && this.aClass1Array1[this.anInt2316 - 1] != this.aClass1_94) {
			local26 = this.aClass1_94;
			this.aClass1_94 = local26.aClass1_120;
			return local26;
		}
		while (this.anInt2316 < this.anInt2313) {
			local26 = this.aClass1Array1[this.anInt2316++].aClass1_120;
			if (local26 != this.aClass1Array1[this.anInt2316 - 1]) {
				this.aClass1_94 = local26.aClass1_120;
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZJ)Lclient!vc;")
	public Class1 method1650(@OriginalArg(1) long arg0) {
		this.aLong143 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) ((long) (this.anInt2313 - 1) & arg0)];
		for (this.aClass1_93 = local18.aClass1_120; this.aClass1_93 != local18; this.aClass1_93 = this.aClass1_93.aClass1_120) {
			if (this.aClass1_93.aLong184 == arg0) {
				@Pc(32) Class1 local32 = this.aClass1_93;
				this.aClass1_93 = this.aClass1_93.aClass1_120;
				return local32;
			}
		}
		this.aClass1_93 = null;
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!vc;JB)V")
	public void method1653(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_119 != null) {
			arg0.method2024();
		}
		@Pc(17) Class1 local17 = this.aClass1Array1[(int) ((long) (this.anInt2313 - 1) & arg1)];
		arg0.aClass1_120 = local17;
		arg0.aClass1_119 = local17.aClass1_119;
		arg0.aLong184 = arg1;
		arg0.aClass1_119.aClass1_120 = arg0;
		arg0.aClass1_120.aClass1_119 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Lclient!vc;")
	public Class1 method1655() {
		if (this.aClass1_93 == null) {
			return null;
		}
		@Pc(26) Class1 local26 = this.aClass1Array1[(int) ((long) (this.anInt2313 - 1) & this.aLong143)];
		while (this.aClass1_93 != local26) {
			if (this.aLong143 == this.aClass1_93.aLong184) {
				@Pc(41) Class1 local41 = this.aClass1_93;
				this.aClass1_93 = this.aClass1_93.aClass1_120;
				return local41;
			}
			this.aClass1_93 = this.aClass1_93.aClass1_120;
		}
		this.aClass1_93 = null;
		return null;
	}
}
