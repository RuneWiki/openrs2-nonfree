import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class79 {

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "Lclient!im;")
	private Class1_Sub16 aClass1_Sub16_7;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "[Lclient!ki;")
	private Class85_Sub1[] aClass85_Sub1Array1;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Lclient!dn;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Lclient!jm;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!fl;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!dn;Lclient!jm;)V")
	public Class79(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class80 arg1) {
		this.aClass42_2 = arg0;
		this.aClass80_1 = arg1;
		if (!this.aClass42_2.method1076()) {
			this.aClass1_Sub2_Sub1_Sub2_2 = this.aClass42_2.method1070(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!lc;IILclient!lc;)Lclient!ki;")
	public Class85_Sub1 method2202(@OriginalArg(0) Class90 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class90 arg2) {
		return this.method2204(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!lc;IZILclient!lc;)Lclient!ki;")
	private Class85_Sub1 method2204(@OriginalArg(0) Class90 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class90 arg2) {
		if (this.aClass1_Sub16_7 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub16_7.anInt3328 = arg1 * 8 + 5;
		if (this.aClass1_Sub16_7.aByteArray39.length <= this.aClass1_Sub16_7.anInt3328) {
			throw new RuntimeException();
		} else if (this.aClass85_Sub1Array1[arg1] == null) {
			@Pc(52) int local52 = this.aClass1_Sub16_7.method2610();
			@Pc(57) int local57 = this.aClass1_Sub16_7.method2610();
			@Pc(71) Class85_Sub1 local71 = new Class85_Sub1(arg1, arg2, arg0, this.aClass42_2, this.aClass80_1, local52, local57, true);
			this.aClass85_Sub1Array1[arg1] = local71;
			return local71;
		} else {
			return this.aClass85_Sub1Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Z")
	public boolean method2206() {
		if (this.aClass1_Sub16_7 != null) {
			return true;
		}
		if (this.aClass1_Sub2_Sub1_Sub2_2 == null) {
			if (this.aClass42_2.method1076()) {
				return false;
			}
			this.aClass1_Sub2_Sub1_Sub2_2 = this.aClass42_2.method1070(true, 255, 255, (byte) 0);
		}
		if (this.aClass1_Sub2_Sub1_Sub2_2.aBoolean102) {
			return false;
		} else {
			this.aClass1_Sub16_7 = new Class1_Sub16(this.aClass1_Sub2_Sub1_Sub2_2.method1408());
			this.aClass85_Sub1Array1 = new Class85_Sub1[(this.aClass1_Sub16_7.aByteArray39.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	public void method2208() {
		if (this.aClass85_Sub1Array1 == null) {
			return;
		}
		@Pc(12) int local12;
		for (local12 = 0; local12 < this.aClass85_Sub1Array1.length; local12++) {
			if (this.aClass85_Sub1Array1[local12] != null) {
				this.aClass85_Sub1Array1[local12].method2518();
			}
		}
		for (local12 = 0; local12 < this.aClass85_Sub1Array1.length; local12++) {
			if (this.aClass85_Sub1Array1[local12] != null) {
				this.aClass85_Sub1Array1[local12].method2515();
			}
		}
	}
}
