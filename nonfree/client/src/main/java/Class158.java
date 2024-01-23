import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class158 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!sb;")
	private Class1_Sub14 aClass1_Sub14_9;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[Lclient!ug;")
	private Class55_Sub1[] aClass55_Sub1Array1;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!dl;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!cn;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!hl;")
	private Class1_Sub1_Sub11_Sub1 aClass1_Sub1_Sub11_Sub1_2;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!dl;Lclient!cn;)V")
	public Class158(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class32 arg1) {
		this.aClass40_1 = arg0;
		this.aClass32_1 = arg1;
		if (!this.aClass40_1.method868()) {
			this.aClass1_Sub1_Sub11_Sub1_2 = this.aClass40_1.method853(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!nm;Lclient!nm;ZIB)Lclient!ug;")
	private Class55_Sub1 method3835(@OriginalArg(0) Class120 arg0, @OriginalArg(1) Class120 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass1_Sub14_9 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub14_9.anInt3290 = arg2 * 8 + 5;
		if (this.aClass1_Sub14_9.anInt3290 >= this.aClass1_Sub14_9.aByteArray34.length) {
			throw new RuntimeException();
		} else if (this.aClass55_Sub1Array1[arg2] == null) {
			@Pc(59) int local59 = this.aClass1_Sub14_9.method2647();
			@Pc(64) int local64 = this.aClass1_Sub14_9.method2647();
			@Pc(78) Class55_Sub1 local78 = new Class55_Sub1(arg2, arg0, arg1, this.aClass40_1, this.aClass32_1, local59, local64, true);
			this.aClass55_Sub1Array1[arg2] = local78;
			return local78;
		} else {
			return this.aClass55_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z")
	public boolean method3836() {
		if (this.aClass1_Sub14_9 != null) {
			return true;
		}
		if (this.aClass1_Sub1_Sub11_Sub1_2 == null) {
			if (this.aClass40_1.method868()) {
				return false;
			}
			this.aClass1_Sub1_Sub11_Sub1_2 = this.aClass40_1.method853(255, 255, (byte) 0, true);
		}
		if (this.aClass1_Sub1_Sub11_Sub1_2.aBoolean340) {
			return false;
		} else {
			this.aClass1_Sub14_9 = new Class1_Sub14(this.aClass1_Sub1_Sub11_Sub1_2.method3719());
			this.aClass55_Sub1Array1 = new Class55_Sub1[(this.aClass1_Sub14_9.aByteArray34.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public void method3838() {
		if (this.aClass55_Sub1Array1 == null) {
			return;
		}
		@Pc(12) int local12;
		for (local12 = 0; local12 < this.aClass55_Sub1Array1.length; local12++) {
			if (this.aClass55_Sub1Array1[local12] != null) {
				this.aClass55_Sub1Array1[local12].method4248();
			}
		}
		for (local12 = 0; local12 < this.aClass55_Sub1Array1.length; local12++) {
			if (this.aClass55_Sub1Array1[local12] != null) {
				this.aClass55_Sub1Array1[local12].method4242();
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!nm;IILclient!nm;)Lclient!ug;")
	public Class55_Sub1 method3839(@OriginalArg(0) Class120 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class120 arg2) {
		return this.method3835(arg0, arg2, arg1);
	}
}
