import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class160 {

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "Lclient!fh;")
	private Class5_Sub15 aClass5_Sub15_4;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "[Lclient!ho;")
	private Class104_Sub1[] aClass104_Sub1Array2;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Lclient!gf;")
	private final Class87 aClass87_3;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Lclient!ru;")
	private final Class216 aClass216_3;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Lclient!si;")
	private Class5_Sub2_Sub3_Sub2 aClass5_Sub2_Sub3_Sub2_2;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!gf;Lclient!ru;)V")
	public Class160(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class216 arg1) {
		this.aClass87_3 = arg0;
		this.aClass216_3 = arg1;
		if (!this.aClass87_3.method1872()) {
			this.aClass5_Sub2_Sub3_Sub2_2 = this.aClass87_3.method1865((byte) 0, 255, 255, true);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!cn;Lclient!cn;ZII)Lclient!ho;")
	private Class104_Sub1 method3315(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass5_Sub15_4 == null) {
			throw new RuntimeException();
		}
		this.aClass5_Sub15_4.anInt7013 = arg2 * 8 + 5;
		if (this.aClass5_Sub15_4.anInt7013 >= this.aClass5_Sub15_4.aByteArray93.length) {
			throw new RuntimeException();
		} else if (this.aClass104_Sub1Array2[arg2] == null) {
			@Pc(45) int local45 = this.aClass5_Sub15_4.method5603();
			@Pc(52) int local52 = this.aClass5_Sub15_4.method5603();
			@Pc(66) Class104_Sub1 local66 = new Class104_Sub1(arg2, arg1, arg0, this.aClass87_3, this.aClass216_3, local45, local52, true);
			this.aClass104_Sub1Array2[arg2] = local66;
			return local66;
		} else {
			return this.aClass104_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public void method3316() {
		if (this.aClass104_Sub1Array2 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass104_Sub1Array2.length; local17++) {
			if (this.aClass104_Sub1Array2[local17] != null) {
				this.aClass104_Sub1Array2[local17].method2269();
			}
		}
		for (@Pc(42) int local42 = 0; local42 < this.aClass104_Sub1Array2.length; local42++) {
			if (this.aClass104_Sub1Array2[local42] != null) {
				this.aClass104_Sub1Array2[local42].method2272();
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Z")
	public boolean method3317() {
		if (this.aClass5_Sub15_4 != null) {
			return true;
		}
		if (this.aClass5_Sub2_Sub3_Sub2_2 == null) {
			if (this.aClass87_3.method1872()) {
				return false;
			}
			this.aClass5_Sub2_Sub3_Sub2_2 = this.aClass87_3.method1865((byte) 0, 255, 255, true);
		}
		if (this.aClass5_Sub2_Sub3_Sub2_2.aBoolean403) {
			return false;
		} else {
			this.aClass5_Sub15_4 = new Class5_Sub15(this.aClass5_Sub2_Sub3_Sub2_2.method4877());
			this.aClass104_Sub1Array2 = new Class104_Sub1[(this.aClass5_Sub15_4.aByteArray93.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!cn;IBLclient!cn;)Lclient!ho;")
	public Class104_Sub1 method3319(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class35 arg2) {
		return this.method3315(arg2, arg0, arg1);
	}
}
