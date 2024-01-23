import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class147 {

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "[Lclient!sj;")
	private Class53_Sub1[] aClass53_Sub1Array2;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "Lclient!fh;")
	private Class1_Sub13 aClass1_Sub13_7;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "Lclient!vd;")
	private Class178 aClass178_6;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!te;")
	private Class164 aClass164_2;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Lclient!nd;")
	private Class1_Sub5_Sub3_Sub1 aClass1_Sub5_Sub3_Sub1_1;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!te;Lclient!vd;)V")
	public Class147(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class178 arg1) {
		this.aClass178_6 = arg1;
		this.aClass164_2 = arg0;
		if (!this.aClass164_2.method4082()) {
			this.aClass1_Sub5_Sub3_Sub1_1 = this.aClass164_2.method4074(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
	public boolean method3852() {
		if (this.aClass1_Sub13_7 != null) {
			return true;
		}
		if (this.aClass1_Sub5_Sub3_Sub1_1 == null) {
			if (this.aClass164_2.method4082()) {
				return false;
			}
			this.aClass1_Sub5_Sub3_Sub1_1 = this.aClass164_2.method4074(255, 255, (byte) 0, true);
		}
		if (this.aClass1_Sub5_Sub3_Sub1_1.aBoolean460) {
			return false;
		} else {
			this.aClass1_Sub13_7 = new Class1_Sub13(this.aClass1_Sub5_Sub3_Sub1_1.method4020());
			this.aClass53_Sub1Array2 = new Class53_Sub1[(this.aClass1_Sub13_7.aByteArray63.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!qe;ILclient!qe;I)Lclient!sj;")
	public Class53_Sub1 method3854(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class141 arg2) {
		return this.method3855(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZILclient!qe;Lclient!qe;)Lclient!sj;")
	private Class53_Sub1 method3855(@OriginalArg(2) int arg0, @OriginalArg(3) Class141 arg1, @OriginalArg(4) Class141 arg2) {
		if (this.aClass1_Sub13_7 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub13_7.anInt2018 = arg0 * 8 + 5;
		if (this.aClass1_Sub13_7.anInt2018 >= this.aClass1_Sub13_7.aByteArray63.length) {
			throw new RuntimeException();
		} else if (this.aClass53_Sub1Array2[arg0] == null) {
			@Pc(60) int local60 = this.aClass1_Sub13_7.method1860();
			@Pc(65) int local65 = this.aClass1_Sub13_7.method1860();
			@Pc(79) Class53_Sub1 local79 = new Class53_Sub1(arg0, arg1, arg2, this.aClass164_2, this.aClass178_6, local60, local65, true);
			this.aClass53_Sub1Array2[arg0] = local79;
			return local79;
		} else {
			return this.aClass53_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public void method3857() {
		if (this.aClass53_Sub1Array2 == null) {
			return;
		}
		@Pc(15) int local15;
		for (local15 = 0; local15 < this.aClass53_Sub1Array2.length; local15++) {
			if (this.aClass53_Sub1Array2[local15] != null) {
				this.aClass53_Sub1Array2[local15].method4000();
			}
		}
		for (local15 = 0; local15 < this.aClass53_Sub1Array2.length; local15++) {
			if (this.aClass53_Sub1Array2[local15] != null) {
				this.aClass53_Sub1Array2[local15].method3996();
			}
		}
	}
}
