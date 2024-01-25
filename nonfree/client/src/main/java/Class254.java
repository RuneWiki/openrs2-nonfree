import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class254 {

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "Lclient!hp;")
	private Class1_Sub5 aClass1_Sub5_8;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "[Lclient!kr;")
	private Class90_Sub1[] aClass90_Sub1Array3;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "Lclient!tj;")
	private final Class230 aClass230_3;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "Lclient!pr;")
	private final Class195 aClass195_3;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "Lclient!pp;")
	private Class1_Sub2_Sub8_Sub2 aClass1_Sub2_Sub8_Sub2_2;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!pr;Lclient!tj;)V")
	public Class254(@OriginalArg(0) Class195 arg0, @OriginalArg(1) Class230 arg1) {
		this.aClass230_3 = arg1;
		this.aClass195_3 = arg0;
		if (!this.aClass195_3.method4450()) {
			this.aClass1_Sub2_Sub8_Sub2_2 = this.aClass195_3.method4451(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!eo;IZLclient!eo;)Lclient!kr;")
	private Class90_Sub1 method5560(@OriginalArg(1) Class65 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class65 arg2) {
		if (this.aClass1_Sub5_8 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub5_8.anInt6475 = arg1 * 8 + 5;
		if (this.aClass1_Sub5_8.aByteArray89.length <= this.aClass1_Sub5_8.anInt6475) {
			throw new RuntimeException();
		} else if (this.aClass90_Sub1Array3[arg1] == null) {
			@Pc(45) int local45 = this.aClass1_Sub5_8.method5407();
			@Pc(58) int local58 = this.aClass1_Sub5_8.method5407();
			@Pc(72) Class90_Sub1 local72 = new Class90_Sub1(arg1, arg2, arg0, this.aClass195_3, this.aClass230_3, local45, local58, true);
			this.aClass90_Sub1Array3[arg1] = local72;
			return local72;
		} else {
			return this.aClass90_Sub1Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!eo;IBLclient!eo;)Lclient!kr;")
	public Class90_Sub1 method5561(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class65 arg2) {
		return this.method5560(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	public void method5562() {
		if (this.aClass90_Sub1Array3 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.aClass90_Sub1Array3.length; local15++) {
			if (this.aClass90_Sub1Array3[local15] != null) {
				this.aClass90_Sub1Array3[local15].method3347();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass90_Sub1Array3.length; local36++) {
			if (this.aClass90_Sub1Array3[local36] != null) {
				this.aClass90_Sub1Array3[local36].method3345();
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)Z")
	public boolean method5563() {
		if (this.aClass1_Sub5_8 != null) {
			return true;
		}
		if (this.aClass1_Sub2_Sub8_Sub2_2 == null) {
			if (this.aClass195_3.method4450()) {
				return false;
			}
			this.aClass1_Sub2_Sub8_Sub2_2 = this.aClass195_3.method4451(255, (byte) 0, true, 255);
		}
		if (this.aClass1_Sub2_Sub8_Sub2_2.aBoolean385) {
			return false;
		} else {
			this.aClass1_Sub5_8 = new Class1_Sub5(this.aClass1_Sub2_Sub8_Sub2_2.method4412());
			this.aClass90_Sub1Array3 = new Class90_Sub1[(this.aClass1_Sub5_8.aByteArray89.length - 5) / 8];
			return true;
		}
	}
}
