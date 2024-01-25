import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class138 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!nn;")
	private Class10_Sub8 aClass10_Sub8_9;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "[Lclient!jl;")
	private Class131_Sub1[] aClass131_Sub1Array1;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "Lclient!rm;")
	private final Class209 aClass209_2;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!hf;")
	private final Class103 aClass103_3;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!rd;")
	private Class10_Sub1_Sub13_Sub1 aClass10_Sub1_Sub13_Sub1_2;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!hf;Lclient!rm;)V")
	public Class138(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Class209 arg1) {
		this.aClass209_2 = arg1;
		this.aClass103_3 = arg0;
		if (!this.aClass103_3.method2589()) {
			this.aClass10_Sub1_Sub13_Sub1_2 = this.aClass103_3.method2592(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!fq;Lclient!fq;I)Lclient!jl;")
	public Class131_Sub1 method3221(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class84 arg2) {
		return this.method3222(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!fq;ZZLclient!fq;)Lclient!jl;")
	private Class131_Sub1 method3222(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(4) Class84 arg2) {
		if (this.aClass10_Sub8_9 == null) {
			throw new RuntimeException();
		}
		this.aClass10_Sub8_9.anInt2989 = arg0 * 8 + 5;
		if (this.aClass10_Sub8_9.aByteArray44.length <= this.aClass10_Sub8_9.anInt2989) {
			throw new RuntimeException();
		} else if (this.aClass131_Sub1Array1[arg0] == null) {
			@Pc(49) int local49 = this.aClass10_Sub8_9.method2459();
			@Pc(54) int local54 = this.aClass10_Sub8_9.method2459();
			@Pc(79) Class131_Sub1 local79 = new Class131_Sub1(arg0, arg2, arg1, this.aClass103_3, this.aClass209_2, local49, local54, true);
			this.aClass131_Sub1Array1[arg0] = local79;
			return local79;
		} else {
			return this.aClass131_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Z")
	public boolean method3223() {
		if (this.aClass10_Sub8_9 != null) {
			return true;
		}
		if (this.aClass10_Sub1_Sub13_Sub1_2 == null) {
			if (this.aClass103_3.method2589()) {
				return false;
			}
			this.aClass10_Sub1_Sub13_Sub1_2 = this.aClass103_3.method2592(255, 255, true, (byte) 0);
		}
		if (this.aClass10_Sub1_Sub13_Sub1_2.aBoolean383) {
			return false;
		} else {
			this.aClass10_Sub8_9 = new Class10_Sub8(this.aClass10_Sub1_Sub13_Sub1_2.method4709());
			this.aClass131_Sub1Array1 = new Class131_Sub1[(this.aClass10_Sub8_9.aByteArray44.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V")
	public void method3225() {
		if (this.aClass131_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass131_Sub1Array1.length; local11++) {
			if (this.aClass131_Sub1Array1[local11] != null) {
				this.aClass131_Sub1Array1[local11].method3131();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass131_Sub1Array1.length; local32++) {
			if (this.aClass131_Sub1Array1[local32] != null) {
				this.aClass131_Sub1Array1[local32].method3127();
			}
		}
	}
}
