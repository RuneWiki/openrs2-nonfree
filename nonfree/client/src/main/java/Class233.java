import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class233 {

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!kk;")
	private Class2_Sub16 aClass2_Sub16_8;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "[Lclient!ss;")
	private Class16_Sub1[] aClass16_Sub1Array2;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!ls;")
	private final Class151 aClass151_4;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!ii;")
	private final Class106 aClass106_3;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!gq;")
	private Class2_Sub10_Sub9_Sub1 aClass2_Sub10_Sub9_Sub1_2;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!ii;Lclient!ls;)V")
	public Class233(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class151 arg1) {
		this.aClass151_4 = arg1;
		this.aClass106_3 = arg0;
		if (!this.aClass106_3.method2690()) {
			this.aClass2_Sub10_Sub9_Sub1_2 = this.aClass106_3.method2691(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Z")
	public boolean method5203() {
		if (this.aClass2_Sub16_8 != null) {
			return true;
		}
		if (this.aClass2_Sub10_Sub9_Sub1_2 == null) {
			if (this.aClass106_3.method2690()) {
				return false;
			}
			this.aClass2_Sub10_Sub9_Sub1_2 = this.aClass106_3.method2691(true, 255, 255, (byte) 0);
		}
		if (this.aClass2_Sub10_Sub9_Sub1_2.aBoolean362) {
			return false;
		} else {
			this.aClass2_Sub16_8 = new Class2_Sub16(this.aClass2_Sub10_Sub9_Sub1_2.method4243());
			this.aClass16_Sub1Array2 = new Class16_Sub1[(this.aClass2_Sub16_8.aByteArray112.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!q;Lclient!q;I)Lclient!ss;")
	public Class16_Sub1 method5205(@OriginalArg(1) Class197 arg0, @OriginalArg(2) Class197 arg1, @OriginalArg(3) int arg2) {
		return this.method5208(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	public void method5207() {
		if (this.aClass16_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass16_Sub1Array2.length; local11++) {
			if (this.aClass16_Sub1Array2[local11] != null) {
				this.aClass16_Sub1Array2[local11].method4721();
			}
		}
		for (@Pc(46) int local46 = 0; local46 < this.aClass16_Sub1Array2.length; local46++) {
			if (this.aClass16_Sub1Array2[local46] != null) {
				this.aClass16_Sub1Array2[local46].method4718();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!q;IZLclient!q;)Lclient!ss;")
	private Class16_Sub1 method5208(@OriginalArg(0) int arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(4) Class197 arg2) {
		if (this.aClass2_Sub16_8 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub16_8.anInt6145 = arg0 * 8 + 5;
		if (this.aClass2_Sub16_8.aByteArray112.length <= this.aClass2_Sub16_8.anInt6145) {
			throw new RuntimeException();
		} else if (this.aClass16_Sub1Array2[arg0] == null) {
			@Pc(45) int local45 = this.aClass2_Sub16_8.method5346();
			@Pc(55) int local55 = this.aClass2_Sub16_8.method5346();
			@Pc(69) Class16_Sub1 local69 = new Class16_Sub1(arg0, arg2, arg1, this.aClass106_3, this.aClass151_4, local45, local55, true);
			this.aClass16_Sub1Array2[arg0] = local69;
			return local69;
		} else {
			return this.aClass16_Sub1Array2[arg0];
		}
	}
}
