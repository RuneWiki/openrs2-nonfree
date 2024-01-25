import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class147 {

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "[I")
	public static final int[] anIntArray603 = new int[16384];

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "[I")
	public static final int[] anIntArray604 = new int[16384];

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!ap;")
	private Class7_Sub3 aClass7_Sub3_5;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "[Lclient!kc;")
	private Class119_Sub1[] aClass119_Sub1Array1;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lclient!p;")
	private final Class160 aClass160_2;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!ps;")
	private final Class167 aClass167_2;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "Lclient!uj;")
	private Class7_Sub1_Sub8_Sub2 aClass7_Sub1_Sub8_Sub2_1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray604[local9] = (int) (Math.sin((double) local9 * local7) * 32768.0D);
			anIntArray603[local9] = (int) (Math.cos(local7 * (double) local9) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!p;Lclient!ps;)V")
	public Class147(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class167 arg1) {
		this.aClass160_2 = arg0;
		this.aClass167_2 = arg1;
		if (!this.aClass160_2.method4109()) {
			this.aClass7_Sub1_Sub8_Sub2_1 = this.aClass160_2.method4110((byte) 0, true, 255, 255);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLclient!an;Lclient!an;I)Lclient!kc;")
	public Class119_Sub1 method3937(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		return this.method3938(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!an;ZLclient!an;IZ)Lclient!kc;")
	private Class119_Sub1 method3938(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass7_Sub3_5 == null) {
			throw new RuntimeException();
		}
		this.aClass7_Sub3_5.anInt3005 = arg2 * 8 + 5;
		if (this.aClass7_Sub3_5.aByteArray33.length <= this.aClass7_Sub3_5.anInt3005) {
			throw new RuntimeException();
		} else if (this.aClass119_Sub1Array1[arg2] == null) {
			@Pc(54) int local54 = this.aClass7_Sub3_5.method2767();
			@Pc(59) int local59 = this.aClass7_Sub3_5.method2767();
			@Pc(73) Class119_Sub1 local73 = new Class119_Sub1(arg2, arg1, arg0, this.aClass160_2, this.aClass167_2, local54, local59, true);
			this.aClass119_Sub1Array1[arg2] = local73;
			return local73;
		} else {
			return this.aClass119_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	public void method3940() {
		if (this.aClass119_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass119_Sub1Array1.length; local11++) {
			if (this.aClass119_Sub1Array1[local11] != null) {
				this.aClass119_Sub1Array1[local11].method3150();
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass119_Sub1Array1.length; local44++) {
			if (this.aClass119_Sub1Array1[local44] != null) {
				this.aClass119_Sub1Array1[local44].method3151();
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
	public boolean method3941() {
		if (this.aClass7_Sub3_5 != null) {
			return true;
		}
		if (this.aClass7_Sub1_Sub8_Sub2_1 == null) {
			if (this.aClass160_2.method4109()) {
				return false;
			}
			this.aClass7_Sub1_Sub8_Sub2_1 = this.aClass160_2.method4110((byte) 0, true, 255, 255);
		}
		if (this.aClass7_Sub1_Sub8_Sub2_1.aBoolean447) {
			return false;
		} else {
			this.aClass7_Sub3_5 = new Class7_Sub3(this.aClass7_Sub1_Sub8_Sub2_1.method5172());
			this.aClass119_Sub1Array1 = new Class119_Sub1[(this.aClass7_Sub3_5.aByteArray33.length - 5) / 8];
			return true;
		}
	}
}
