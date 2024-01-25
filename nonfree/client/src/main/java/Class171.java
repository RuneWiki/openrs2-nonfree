import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class171 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "[Lclient!fq;")
	private Class79_Sub1[] aClass79_Sub1Array1;

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "Lclient!wn;")
	private Class4_Sub20 aClass4_Sub20_5;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "Lclient!um;")
	private final Class256 aClass256_2;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Lclient!oi;")
	private final Class184 aClass184_3;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "Lclient!ij;")
	private Class4_Sub1_Sub13_Sub1 aClass4_Sub1_Sub13_Sub1_1;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!oi;Lclient!um;)V")
	public Class171(@OriginalArg(0) Class184 arg0, @OriginalArg(1) Class256 arg1) {
		this.aClass256_2 = arg1;
		this.aClass184_3 = arg0;
		if (!this.aClass184_3.method4434()) {
			this.aClass4_Sub1_Sub13_Sub1_1 = this.aClass184_3.method4438((byte) 0, true, 255, 255);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!wf;ILclient!wf;Z)Lclient!fq;")
	private Class79_Sub1 method4283(@OriginalArg(0) int arg0, @OriginalArg(1) Class269 arg1, @OriginalArg(3) Class269 arg2) {
		if (this.aClass4_Sub20_5 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub20_5.anInt5526 = arg0 * 8 + 5;
		if (this.aClass4_Sub20_5.aByteArray77.length <= this.aClass4_Sub20_5.anInt5526) {
			throw new RuntimeException();
		} else if (this.aClass79_Sub1Array1[arg0] == null) {
			@Pc(49) int local49 = this.aClass4_Sub20_5.method4595();
			@Pc(54) int local54 = this.aClass4_Sub20_5.method4595();
			@Pc(73) Class79_Sub1 local73 = new Class79_Sub1(arg0, arg2, arg1, this.aClass184_3, this.aClass256_2, local49, local54, true);
			this.aClass79_Sub1Array1[arg0] = local73;
			return local73;
		} else {
			return this.aClass79_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	public void method4284() {
		if (this.aClass79_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass79_Sub1Array1.length; local11++) {
			if (this.aClass79_Sub1Array1[local11] != null) {
				this.aClass79_Sub1Array1[local11].method2228();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass79_Sub1Array1.length; local32++) {
			if (this.aClass79_Sub1Array1[local32] != null) {
				this.aClass79_Sub1Array1[local32].method2229();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Z")
	public boolean method4285() {
		if (this.aClass4_Sub20_5 != null) {
			return true;
		}
		if (this.aClass4_Sub1_Sub13_Sub1_1 == null) {
			if (this.aClass184_3.method4434()) {
				return false;
			}
			this.aClass4_Sub1_Sub13_Sub1_1 = this.aClass184_3.method4438((byte) 0, true, 255, 255);
		}
		if (this.aClass4_Sub1_Sub13_Sub1_1.aBoolean542) {
			return false;
		} else {
			this.aClass4_Sub20_5 = new Class4_Sub20(this.aClass4_Sub1_Sub13_Sub1_1.method5988());
			this.aClass79_Sub1Array1 = new Class79_Sub1[(this.aClass4_Sub20_5.aByteArray77.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILclient!wf;Lclient!wf;)Lclient!fq;")
	public Class79_Sub1 method4286(@OriginalArg(0) int arg0, @OriginalArg(2) Class269 arg1, @OriginalArg(3) Class269 arg2) {
		return this.method4283(arg0, arg1, arg2);
	}
}
