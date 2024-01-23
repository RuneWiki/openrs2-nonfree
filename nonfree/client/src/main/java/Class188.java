import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class188 {

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Lclient!ug;")
	private Class3_Sub26 aClass3_Sub26_10;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "[Lclient!on;")
	private Class4_Sub1[] aClass4_Sub1Array2;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Lclient!na;")
	private Class117 aClass117_3;

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "Lclient!uc;")
	private Class177 aClass177_3;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!pj;")
	private Class3_Sub4_Sub1_Sub2 aClass3_Sub4_Sub1_Sub2_2;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!uc;Lclient!na;)V")
	public Class188(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class117 arg1) {
		this.aClass117_3 = arg1;
		this.aClass177_3 = arg0;
		if (!this.aClass177_3.method4535()) {
			this.aClass3_Sub4_Sub1_Sub2_2 = this.aClass177_3.method4550(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIZLclient!th;Lclient!th;)Lclient!on;")
	private Class4_Sub1 method4863(@OriginalArg(0) int arg0, @OriginalArg(3) Class171 arg1, @OriginalArg(4) Class171 arg2) {
		if (this.aClass3_Sub26_10 == null) {
			throw new RuntimeException();
		}
		this.aClass3_Sub26_10.anInt4615 = arg0 * 8 + 5;
		if (this.aClass3_Sub26_10.aByteArray64.length <= this.aClass3_Sub26_10.anInt4615) {
			throw new RuntimeException();
		} else if (this.aClass4_Sub1Array2[arg0] == null) {
			@Pc(49) int local49 = this.aClass3_Sub26_10.method3896();
			@Pc(61) int local61 = this.aClass3_Sub26_10.method3896();
			@Pc(75) Class4_Sub1 local75 = new Class4_Sub1(arg0, arg2, arg1, this.aClass177_3, this.aClass117_3, local49, local61, true);
			this.aClass4_Sub1Array2[arg0] = local75;
			return local75;
		} else {
			return this.aClass4_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLclient!th;ILclient!th;)Lclient!on;")
	public Class4_Sub1 method4865(@OriginalArg(1) Class171 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class171 arg2) {
		return this.method4863(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Z")
	public boolean method4866() {
		if (this.aClass3_Sub26_10 != null) {
			return true;
		}
		if (this.aClass3_Sub4_Sub1_Sub2_2 == null) {
			if (this.aClass177_3.method4535()) {
				return false;
			}
			this.aClass3_Sub4_Sub1_Sub2_2 = this.aClass177_3.method4550(true, 255, 255, (byte) 0);
		}
		if (this.aClass3_Sub4_Sub1_Sub2_2.aBoolean297) {
			return false;
		} else {
			this.aClass3_Sub26_10 = new Class3_Sub26(this.aClass3_Sub4_Sub1_Sub2_2.method3528());
			this.aClass4_Sub1Array2 = new Class4_Sub1[(this.aClass3_Sub26_10.aByteArray64.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public void method4867() {
		if (this.aClass4_Sub1Array2 == null) {
			return;
		}
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass4_Sub1Array2.length; local18++) {
			if (this.aClass4_Sub1Array2[local18] != null) {
				this.aClass4_Sub1Array2[local18].method3436();
			}
		}
		for (local18 = 0; local18 < this.aClass4_Sub1Array2.length; local18++) {
			if (this.aClass4_Sub1Array2[local18] != null) {
				this.aClass4_Sub1Array2[local18].method3428();
			}
		}
	}
}
