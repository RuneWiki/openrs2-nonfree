import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class130 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!ql;")
	private Class1_Sub13 aClass1_Sub13_8;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[Lclient!j;")
	private Class17_Sub1[] aClass17_Sub1Array2;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!bi;")
	private Class18 aClass18_4;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Lclient!ig;")
	private Class60 aClass60_3;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!re;")
	private Class1_Sub2_Sub5_Sub2 aClass1_Sub2_Sub5_Sub2_2;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!bi;Lclient!ig;)V")
	public Class130(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class60 arg1) {
		this.aClass18_4 = arg0;
		this.aClass60_3 = arg1;
		if (!this.aClass18_4.method443()) {
			this.aClass1_Sub2_Sub5_Sub2_2 = this.aClass18_4.method444(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Z")
	public boolean method3879() {
		if (this.aClass1_Sub13_8 != null) {
			return true;
		}
		if (this.aClass1_Sub2_Sub5_Sub2_2 == null) {
			if (this.aClass18_4.method443()) {
				return false;
			}
			this.aClass1_Sub2_Sub5_Sub2_2 = this.aClass18_4.method444(255, true, (byte) 0, 255);
		}
		if (this.aClass1_Sub2_Sub5_Sub2_2.aBoolean222) {
			return false;
		} else {
			this.aClass1_Sub13_8 = new Class1_Sub13(this.aClass1_Sub2_Sub5_Sub2_2.method3391());
			this.aClass17_Sub1Array2 = new Class17_Sub1[(this.aClass1_Sub13_8.aByteArray29.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!kb;Lclient!kb;ZI)Lclient!j;")
	private Class17_Sub1 method3882(@OriginalArg(1) Class71 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass1_Sub13_8 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub13_8.anInt2395 = arg2 * 8 + 5;
		if (this.aClass1_Sub13_8.anInt2395 >= this.aClass1_Sub13_8.aByteArray29.length) {
			throw new RuntimeException();
		} else if (this.aClass17_Sub1Array2[arg2] == null) {
			@Pc(49) int local49 = this.aClass1_Sub13_8.method1802();
			@Pc(54) int local54 = this.aClass1_Sub13_8.method1802();
			@Pc(68) Class17_Sub1 local68 = new Class17_Sub1(arg2, arg1, arg0, this.aClass18_4, this.aClass60_3, local49, local54, true);
			this.aClass17_Sub1Array2[arg2] = local68;
			return local68;
		} else {
			return this.aClass17_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!kb;Lclient!kb;II)Lclient!j;")
	public Class17_Sub1 method3888(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) int arg2) {
		return this.method3882(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	public void method3889() {
		if (this.aClass17_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass17_Sub1Array2.length; local11++) {
			if (this.aClass17_Sub1Array2[local11] != null) {
				this.aClass17_Sub1Array2[local11].method2199();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass17_Sub1Array2.length; local36++) {
			if (this.aClass17_Sub1Array2[local36] != null) {
				this.aClass17_Sub1Array2[local36].method2195();
			}
		}
	}
}
