import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class73 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!tl;")
	private Class4_Sub30 aClass4_Sub30_2;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "[Lclient!qg;")
	private Class193_Sub1[] aClass193_Sub1Array1;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!iu;")
	private final Class125 aClass125_1;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!tc;")
	private final Class227 aClass227_2;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!bi;")
	private Class4_Sub1_Sub3_Sub1 aClass4_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!iu;Lclient!tc;)V")
	public Class73(@OriginalArg(0) Class125 arg0, @OriginalArg(1) Class227 arg1) {
		this.aClass125_1 = arg0;
		this.aClass227_2 = arg1;
		if (!this.aClass125_1.method2613()) {
			this.aClass4_Sub1_Sub3_Sub1_1 = this.aClass125_1.method2612(true, 255, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public void method1673() {
		if (this.aClass193_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass193_Sub1Array1.length; local11++) {
			if (this.aClass193_Sub1Array1[local11] != null) {
				this.aClass193_Sub1Array1[local11].method4433();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass193_Sub1Array1.length; local38++) {
			if (this.aClass193_Sub1Array1[local38] != null) {
				this.aClass193_Sub1Array1[local38].method4434();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ht;BLclient!ht;ZI)Lclient!qg;")
	private Class193_Sub1 method1674(@OriginalArg(0) Class113 arg0, @OriginalArg(2) Class113 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass4_Sub30_2 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub30_2.anInt6244 = arg2 * 8 + 5;
		if (this.aClass4_Sub30_2.anInt6244 >= this.aClass4_Sub30_2.aByteArray79.length) {
			throw new RuntimeException();
		} else if (this.aClass193_Sub1Array1[arg2] == null) {
			@Pc(49) int local49 = this.aClass4_Sub30_2.method4872();
			@Pc(54) int local54 = this.aClass4_Sub30_2.method4872();
			@Pc(68) Class193_Sub1 local68 = new Class193_Sub1(arg2, arg0, arg1, this.aClass125_1, this.aClass227_2, local49, local54, true);
			this.aClass193_Sub1Array1[arg2] = local68;
			return local68;
		} else {
			return this.aClass193_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ht;Lclient!ht;I)Lclient!qg;")
	public Class193_Sub1 method1675(@OriginalArg(0) int arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class113 arg2) {
		return this.method1674(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Z")
	public boolean method1678() {
		if (this.aClass4_Sub30_2 != null) {
			return true;
		}
		if (this.aClass4_Sub1_Sub3_Sub1_1 == null) {
			if (this.aClass125_1.method2613()) {
				return false;
			}
			this.aClass4_Sub1_Sub3_Sub1_1 = this.aClass125_1.method2612(true, 255, (byte) 0, 255);
		}
		if (this.aClass4_Sub1_Sub3_Sub1_1.aBoolean330) {
			return false;
		} else {
			this.aClass4_Sub30_2 = new Class4_Sub30(this.aClass4_Sub1_Sub3_Sub1_1.method3403());
			this.aClass193_Sub1Array1 = new Class193_Sub1[(this.aClass4_Sub30_2.aByteArray79.length - 5) / 8];
			return true;
		}
	}
}
