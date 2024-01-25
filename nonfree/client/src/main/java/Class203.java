import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class203 {

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "[Lclient!au;")
	private Class16_Sub1[] aClass16_Sub1Array2;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!lh;")
	private Class1_Sub1 aClass1_Sub1_6;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!kp;")
	private final Class142 aClass142_3;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "Lclient!gl;")
	private final Class94 aClass94_3;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Lclient!wf;")
	private Class1_Sub2_Sub7_Sub2 aClass1_Sub2_Sub7_Sub2_2;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!gl;Lclient!kp;)V")
	public Class203(@OriginalArg(0) Class94 arg0, @OriginalArg(1) Class142 arg1) {
		this.aClass142_3 = arg1;
		this.aClass94_3 = arg0;
		if (!this.aClass94_3.method1903()) {
			this.aClass1_Sub2_Sub7_Sub2_2 = this.aClass94_3.method1908(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)Z")
	public boolean method4832() {
		if (this.aClass1_Sub1_6 != null) {
			return true;
		}
		if (this.aClass1_Sub2_Sub7_Sub2_2 == null) {
			if (this.aClass94_3.method1903()) {
				return false;
			}
			this.aClass1_Sub2_Sub7_Sub2_2 = this.aClass94_3.method1908(255, 255, true, (byte) 0);
		}
		if (this.aClass1_Sub2_Sub7_Sub2_2.aBoolean481) {
			return false;
		} else {
			this.aClass1_Sub1_6 = new Class1_Sub1(this.aClass1_Sub2_Sub7_Sub2_2.method5887());
			this.aClass16_Sub1Array2 = new Class16_Sub1[(this.aClass1_Sub1_6.aByteArray66.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
	public void method4833() {
		if (this.aClass16_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass16_Sub1Array2.length; local11++) {
			if (this.aClass16_Sub1Array2[local11] != null) {
				this.aClass16_Sub1Array2[local11].method399();
			}
		}
		for (@Pc(39) int local39 = 0; local39 < this.aClass16_Sub1Array2.length; local39++) {
			if (this.aClass16_Sub1Array2[local39] != null) {
				this.aClass16_Sub1Array2[local39].method403();
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!dh;Lclient!dh;I)Lclient!au;")
	public Class16_Sub1 method4834(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class52 arg2) {
		return this.method4835(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!dh;ZILclient!dh;)Lclient!au;")
	private Class16_Sub1 method4835(@OriginalArg(1) Class52 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class52 arg2) {
		if (this.aClass1_Sub1_6 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub1_6.anInt5056 = arg1 * 8 + 5;
		if (this.aClass1_Sub1_6.anInt5056 >= this.aClass1_Sub1_6.aByteArray66.length) {
			throw new RuntimeException();
		} else if (this.aClass16_Sub1Array2[arg1] == null) {
			@Pc(49) int local49 = this.aClass1_Sub1_6.method4087();
			@Pc(54) int local54 = this.aClass1_Sub1_6.method4087();
			@Pc(68) Class16_Sub1 local68 = new Class16_Sub1(arg1, arg0, arg2, this.aClass94_3, this.aClass142_3, local49, local54, true);
			this.aClass16_Sub1Array2[arg1] = local68;
			return local68;
		} else {
			return this.aClass16_Sub1Array2[arg1];
		}
	}
}
