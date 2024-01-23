import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class41 {

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Lclient!oe;")
	private Class2_Sub16 aClass2_Sub16_4;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "[Lclient!fc;")
	private Class31_Sub1[] aClass31_Sub1Array1;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Lclient!id;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "Lclient!bo;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Lclient!cg;")
	private Class2_Sub8_Sub2_Sub1 aClass2_Sub8_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!bo;Lclient!id;)V")
	public Class41(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class80 arg1) {
		this.aClass80_1 = arg1;
		this.aClass21_1 = arg0;
		if (!this.aClass21_1.method561()) {
			this.aClass2_Sub8_Sub2_Sub1_2 = this.aClass21_1.method564((byte) 0, 255, 255, true);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!ma;ILclient!ma;)Lclient!fc;")
	public Class31_Sub1 method1200(@OriginalArg(1) Class108 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class108 arg2) {
		return this.method1208(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public void method1203() {
		if (this.aClass31_Sub1Array1 == null) {
			return;
		}
		@Pc(11) int local11;
		for (local11 = 0; local11 < this.aClass31_Sub1Array1.length; local11++) {
			if (this.aClass31_Sub1Array1[local11] != null) {
				this.aClass31_Sub1Array1[local11].method1417();
			}
		}
		for (local11 = 0; local11 < this.aClass31_Sub1Array1.length; local11++) {
			if (this.aClass31_Sub1Array1[local11] != null) {
				this.aClass31_Sub1Array1[local11].method1414();
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)Z")
	public boolean method1206() {
		if (this.aClass2_Sub16_4 != null) {
			return true;
		}
		if (this.aClass2_Sub8_Sub2_Sub1_2 == null) {
			if (this.aClass21_1.method561()) {
				return false;
			}
			this.aClass2_Sub8_Sub2_Sub1_2 = this.aClass21_1.method564((byte) 0, 255, 255, true);
		}
		if (this.aClass2_Sub8_Sub2_Sub1_2.aBoolean272) {
			return false;
		} else {
			this.aClass2_Sub16_4 = new Class2_Sub16(this.aClass2_Sub8_Sub2_Sub1_2.method3254());
			this.aClass31_Sub1Array1 = new Class31_Sub1[(this.aClass2_Sub16_4.aByteArray17.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ma;ZLclient!ma;II)Lclient!fc;")
	private Class31_Sub1 method1208(@OriginalArg(0) Class108 arg0, @OriginalArg(2) Class108 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass2_Sub16_4 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub16_4.anInt2789 = arg2 * 8 + 5;
		if (this.aClass2_Sub16_4.aByteArray17.length <= this.aClass2_Sub16_4.anInt2789) {
			throw new RuntimeException();
		} else if (this.aClass31_Sub1Array1[arg2] == null) {
			@Pc(57) int local57 = this.aClass2_Sub16_4.method2145();
			@Pc(62) int local62 = this.aClass2_Sub16_4.method2145();
			@Pc(76) Class31_Sub1 local76 = new Class31_Sub1(arg2, arg0, arg1, this.aClass21_1, this.aClass80_1, local57, local62, true);
			this.aClass31_Sub1Array1[arg2] = local76;
			return local76;
		} else {
			return this.aClass31_Sub1Array1[arg2];
		}
	}
}
