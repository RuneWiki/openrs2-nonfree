import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class20 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "[Lclient!se;")
	private Class143_Sub1[] aClass143_Sub1Array1;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Lclient!jj;")
	private Class1_Sub18 aClass1_Sub18_2;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "Lclient!vb;")
	private Class168 aClass168_1;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!wj;")
	private Class179 aClass179_1;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!ab;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!vb;Lclient!wj;)V")
	public Class20(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class179 arg1) {
		this.aClass168_1 = arg0;
		this.aClass179_1 = arg1;
		if (!this.aClass168_1.method4266()) {
			this.aClass1_Sub2_Sub1_Sub1_1 = this.aClass168_1.method4276((byte) 0, 255, true, 255);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Z")
	public boolean method614() {
		if (this.aClass1_Sub18_2 != null) {
			return true;
		}
		if (this.aClass1_Sub2_Sub1_Sub1_1 == null) {
			if (this.aClass168_1.method4266()) {
				return false;
			}
			this.aClass1_Sub2_Sub1_Sub1_1 = this.aClass168_1.method4276((byte) 0, 255, true, 255);
		}
		if (this.aClass1_Sub2_Sub1_Sub1_1.aBoolean233) {
			return false;
		} else {
			this.aClass1_Sub18_2 = new Class1_Sub18(this.aClass1_Sub2_Sub1_Sub1_1.method2546());
			this.aClass143_Sub1Array1 = new Class143_Sub1[(this.aClass1_Sub18_2.aByteArray71.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!tm;Lclient!tm;)Lclient!se;")
	public Class143_Sub1 method618(@OriginalArg(1) int arg0, @OriginalArg(2) Class159 arg1, @OriginalArg(3) Class159 arg2) {
		return this.method621(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
	public void method620() {
		if (this.aClass143_Sub1Array1 == null) {
			return;
		}
		@Pc(12) int local12;
		for (local12 = 0; local12 < this.aClass143_Sub1Array1.length; local12++) {
			if (this.aClass143_Sub1Array1[local12] != null) {
				this.aClass143_Sub1Array1[local12].method3832();
			}
		}
		for (local12 = 0; local12 < this.aClass143_Sub1Array1.length; local12++) {
			if (this.aClass143_Sub1Array1[local12] != null) {
				this.aClass143_Sub1Array1[local12].method3826();
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!tm;ILclient!tm;IZ)Lclient!se;")
	private Class143_Sub1 method621(@OriginalArg(0) Class159 arg0, @OriginalArg(2) Class159 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass1_Sub18_2 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub18_2.anInt3911 = arg2 * 8 + 5;
		if (this.aClass1_Sub18_2.anInt3911 >= this.aClass1_Sub18_2.aByteArray71.length) {
			throw new RuntimeException();
		} else if (this.aClass143_Sub1Array1[arg2] == null) {
			@Pc(57) int local57 = this.aClass1_Sub18_2.method3074();
			@Pc(62) int local62 = this.aClass1_Sub18_2.method3074();
			@Pc(76) Class143_Sub1 local76 = new Class143_Sub1(arg2, arg1, arg0, this.aClass168_1, this.aClass179_1, local57, local62, true);
			this.aClass143_Sub1Array1[arg2] = local76;
			return local76;
		} else {
			return this.aClass143_Sub1Array1[arg2];
		}
	}
}
