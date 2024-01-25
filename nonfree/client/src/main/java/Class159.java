import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class159 {

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "[Lclient!lv;")
	private Class143_Sub1[] aClass143_Sub1Array2;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "Lclient!iv;")
	private Class4_Sub12 aClass4_Sub12_5;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!vl;")
	private final Class254 aClass254_2;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!vn;")
	private final Class255 aClass255_3;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!je;")
	private Class4_Sub1_Sub6_Sub1 aClass4_Sub1_Sub6_Sub1_1;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!vn;Lclient!vl;)V")
	public Class159(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class254 arg1) {
		this.aClass254_2 = arg1;
		this.aClass255_3 = arg0;
		if (!this.aClass255_3.method5460()) {
			this.aClass4_Sub1_Sub6_Sub1_1 = this.aClass255_3.method5465(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)Z")
	public boolean method3814() {
		if (this.aClass4_Sub12_5 != null) {
			return true;
		}
		if (this.aClass4_Sub1_Sub6_Sub1_1 == null) {
			if (this.aClass255_3.method5460()) {
				return false;
			}
			this.aClass4_Sub1_Sub6_Sub1_1 = this.aClass255_3.method5465(255, (byte) 0, true, 255);
		}
		if (this.aClass4_Sub1_Sub6_Sub1_1.aBoolean381) {
			return false;
		} else {
			this.aClass4_Sub12_5 = new Class4_Sub12(this.aClass4_Sub1_Sub6_Sub1_1.method3343());
			this.aClass143_Sub1Array2 = new Class143_Sub1[(this.aClass4_Sub12_5.aByteArray36.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!st;Lclient!st;II)Lclient!lv;")
	public Class143_Sub1 method3817(@OriginalArg(0) Class222 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(3) int arg2) {
		return this.method3821(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public void method3819() {
		if (this.aClass143_Sub1Array2 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.aClass143_Sub1Array2.length; local15++) {
			if (this.aClass143_Sub1Array2[local15] != null) {
				this.aClass143_Sub1Array2[local15].method3522();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass143_Sub1Array2.length; local40++) {
			if (this.aClass143_Sub1Array2[local40] != null) {
				this.aClass143_Sub1Array2[local40].method3520();
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!st;ZBILclient!st;)Lclient!lv;")
	private Class143_Sub1 method3821(@OriginalArg(0) Class222 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class222 arg2) {
		if (this.aClass4_Sub12_5 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub12_5.anInt2997 = arg1 * 8 + 5;
		if (this.aClass4_Sub12_5.aByteArray36.length <= this.aClass4_Sub12_5.anInt2997) {
			throw new RuntimeException();
		} else if (this.aClass143_Sub1Array2[arg1] == null) {
			@Pc(45) int local45 = this.aClass4_Sub12_5.method2529();
			@Pc(50) int local50 = this.aClass4_Sub12_5.method2529();
			@Pc(64) Class143_Sub1 local64 = new Class143_Sub1(arg1, arg0, arg2, this.aClass255_3, this.aClass254_2, local45, local50, true);
			this.aClass143_Sub1Array2[arg1] = local64;
			return local64;
		} else {
			return this.aClass143_Sub1Array2[arg1];
		}
	}
}
