import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class158 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!hw;")
	private Class2_Sub17 aClass2_Sub17_4;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "[Lclient!rt;")
	private Class10_Sub1[] aClass10_Sub1Array2;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!dp;")
	private final Class58 aClass58_1;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!un;")
	private final Class249 aClass249_2;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!jn;")
	private Class2_Sub1_Sub7_Sub2 aClass2_Sub1_Sub7_Sub2_1;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!un;Lclient!dp;)V")
	public Class158(@OriginalArg(0) Class249 arg0, @OriginalArg(1) Class58 arg1) {
		this.aClass58_1 = arg1;
		this.aClass249_2 = arg0;
		if (!this.aClass249_2.method5699()) {
			this.aClass2_Sub1_Sub7_Sub2_1 = this.aClass249_2.method5700(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!bh;Lclient!bh;I)Lclient!rt;")
	public Class10_Sub1 method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class24 arg2) {
		return this.method3121(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Z")
	public boolean method3119() {
		if (this.aClass2_Sub17_4 != null) {
			return true;
		}
		if (this.aClass2_Sub1_Sub7_Sub2_1 == null) {
			if (this.aClass249_2.method5699()) {
				return false;
			}
			this.aClass2_Sub1_Sub7_Sub2_1 = this.aClass249_2.method5700(true, 255, 255, (byte) 0);
		}
		if (this.aClass2_Sub1_Sub7_Sub2_1.aBoolean225) {
			return false;
		} else {
			this.aClass2_Sub17_4 = new Class2_Sub17(this.aClass2_Sub1_Sub7_Sub2_1.method2817());
			this.aClass10_Sub1Array2 = new Class10_Sub1[(this.aClass2_Sub17_4.aByteArray94.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method3120() {
		if (this.aClass10_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass10_Sub1Array2.length; local11++) {
			if (this.aClass10_Sub1Array2[local11] != null) {
				this.aClass10_Sub1Array2[local11].method5094();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass10_Sub1Array2.length; local36++) {
			if (this.aClass10_Sub1Array2[local36] != null) {
				this.aClass10_Sub1Array2[local36].method5089();
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZLclient!bh;Lclient!bh;I)Lclient!rt;")
	private Class10_Sub1 method3121(@OriginalArg(2) Class24 arg0, @OriginalArg(3) Class24 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass2_Sub17_4 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub17_4.anInt7523 = arg2 * 8 + 5;
		if (this.aClass2_Sub17_4.aByteArray94.length <= this.aClass2_Sub17_4.anInt7523) {
			throw new RuntimeException();
		} else if (this.aClass10_Sub1Array2[arg2] == null) {
			@Pc(45) int local45 = this.aClass2_Sub17_4.method6129();
			@Pc(50) int local50 = this.aClass2_Sub17_4.method6129();
			@Pc(69) Class10_Sub1 local69 = new Class10_Sub1(arg2, arg0, arg1, this.aClass249_2, this.aClass58_1, local45, local50, true);
			this.aClass10_Sub1Array2[arg2] = local69;
			return local69;
		} else {
			return this.aClass10_Sub1Array2[arg2];
		}
	}
}
