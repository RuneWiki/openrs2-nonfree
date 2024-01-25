import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class111 {

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Lclient!tq;")
	private Class4_Sub7 aClass4_Sub7_4;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "[Lclient!wd;")
	private Class18_Sub1[] aClass18_Sub1Array2;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!ud;")
	private final Class199 aClass199_3;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!ho;")
	private final Class93 aClass93_1;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!r;")
	private Class4_Sub1_Sub18_Sub2 aClass4_Sub1_Sub18_Sub2_2;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!ho;Lclient!ud;)V")
	public Class111(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class199 arg1) {
		this.aClass199_3 = arg1;
		this.aClass93_1 = arg0;
		if (!this.aClass93_1.method2431()) {
			this.aClass4_Sub1_Sub18_Sub2_2 = this.aClass93_1.method2425(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public void method3024() {
		if (this.aClass18_Sub1Array2 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.aClass18_Sub1Array2.length; local15++) {
			if (this.aClass18_Sub1Array2[local15] != null) {
				this.aClass18_Sub1Array2[local15].method5609();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass18_Sub1Array2.length; local36++) {
			if (this.aClass18_Sub1Array2[local36] != null) {
				this.aClass18_Sub1Array2[local36].method5615();
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBZLclient!qk;Lclient!qk;)Lclient!wd;")
	private Class18_Sub1 method3028(@OriginalArg(0) int arg0, @OriginalArg(3) Class169 arg1, @OriginalArg(4) Class169 arg2) {
		if (this.aClass4_Sub7_4 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub7_4.anInt2667 = arg0 * 8 + 5;
		if (this.aClass4_Sub7_4.aByteArray42.length <= this.aClass4_Sub7_4.anInt2667) {
			throw new RuntimeException();
		} else if (this.aClass18_Sub1Array2[arg0] == null) {
			@Pc(49) int local49 = this.aClass4_Sub7_4.method2389();
			@Pc(54) int local54 = this.aClass4_Sub7_4.method2389();
			@Pc(74) Class18_Sub1 local74 = new Class18_Sub1(arg0, arg1, arg2, this.aClass93_1, this.aClass199_3, local49, local54, true);
			this.aClass18_Sub1Array2[arg0] = local74;
			return local74;
		} else {
			return this.aClass18_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!qk;Lclient!qk;II)Lclient!wd;")
	public Class18_Sub1 method3029(@OriginalArg(0) Class169 arg0, @OriginalArg(1) Class169 arg1, @OriginalArg(2) int arg2) {
		return this.method3028(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Z")
	public boolean method3030() {
		if (this.aClass4_Sub7_4 != null) {
			return true;
		}
		if (this.aClass4_Sub1_Sub18_Sub2_2 == null) {
			if (this.aClass93_1.method2431()) {
				return false;
			}
			this.aClass4_Sub1_Sub18_Sub2_2 = this.aClass93_1.method2425(255, 255, true, (byte) 0);
		}
		if (this.aClass4_Sub1_Sub18_Sub2_2.aBoolean489) {
			return false;
		} else {
			this.aClass4_Sub7_4 = new Class4_Sub7(this.aClass4_Sub1_Sub18_Sub2_2.method4684());
			this.aClass18_Sub1Array2 = new Class18_Sub1[(this.aClass4_Sub7_4.aByteArray42.length - 5) / 8];
			return true;
		}
	}
}
