import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class195 {

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "[Lclient!pi;")
	private Class159_Sub1[] aClass159_Sub1Array2;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "Lclient!bk;")
	private Class5_Sub1 aClass5_Sub1_8;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "Lclient!sj;")
	private final Class185 aClass185_3;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!ah;")
	private final Class7 aClass7_3;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Lclient!rj;")
	private Class5_Sub9_Sub3_Sub2 aClass5_Sub9_Sub3_Sub2_2;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ah;Lclient!sj;)V")
	public Class195(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class185 arg1) {
		this.aClass185_3 = arg1;
		this.aClass7_3 = arg0;
		if (!this.aClass7_3.method243()) {
			this.aClass5_Sub9_Sub3_Sub2_2 = this.aClass7_3.method248(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!wq;Lclient!wq;IZ)Lclient!pi;")
	private Class159_Sub1 method5288(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class219 arg2) {
		if (this.aClass5_Sub1_8 == null) {
			throw new RuntimeException();
		}
		this.aClass5_Sub1_8.anInt2029 = arg0 * 8 + 5;
		if (this.aClass5_Sub1_8.aByteArray18.length <= this.aClass5_Sub1_8.anInt2029) {
			throw new RuntimeException();
		} else if (this.aClass159_Sub1Array2[arg0] == null) {
			@Pc(57) int local57 = this.aClass5_Sub1_8.method1826();
			@Pc(62) int local62 = this.aClass5_Sub1_8.method1826();
			@Pc(76) Class159_Sub1 local76 = new Class159_Sub1(arg0, arg1, arg2, this.aClass7_3, this.aClass185_3, local57, local62, true);
			this.aClass159_Sub1Array2[arg0] = local76;
			return local76;
		} else {
			return this.aClass159_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)Z")
	public boolean method5291() {
		if (this.aClass5_Sub1_8 != null) {
			return true;
		}
		if (this.aClass5_Sub9_Sub3_Sub2_2 == null) {
			if (this.aClass7_3.method243()) {
				return false;
			}
			this.aClass5_Sub9_Sub3_Sub2_2 = this.aClass7_3.method248(255, (byte) 0, 255, true);
		}
		if (this.aClass5_Sub9_Sub3_Sub2_2.aBoolean408) {
			return false;
		} else {
			this.aClass5_Sub1_8 = new Class5_Sub1(this.aClass5_Sub9_Sub3_Sub2_2.method4725());
			this.aClass159_Sub1Array2 = new Class159_Sub1[(this.aClass5_Sub1_8.aByteArray18.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!wq;Lclient!wq;IB)Lclient!pi;")
	public Class159_Sub1 method5293(@OriginalArg(0) Class219 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2) {
		return this.method5288(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public void method5294() {
		if (this.aClass159_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass159_Sub1Array2.length; local11++) {
			if (this.aClass159_Sub1Array2[local11] != null) {
				this.aClass159_Sub1Array2[local11].method4072();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass159_Sub1Array2.length; local32++) {
			if (this.aClass159_Sub1Array2[local32] != null) {
				this.aClass159_Sub1Array2[local32].method4074();
			}
		}
	}
}
