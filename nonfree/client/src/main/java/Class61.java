import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class61 {

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "Lclient!bi;")
	private Class4_Sub2_Sub1_Sub2_Sub1 aClass4_Sub2_Sub1_Sub2_Sub1_1 = null;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!efa;")
	private Class4_Sub2_Sub1_Sub2_Sub2 aClass4_Sub2_Sub1_Sub2_Sub2_1 = null;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
	private final int anInt1408;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	public final int anInt1410;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!et;I)V")
	public Class61(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int arg1) {
		this.anInt1408 = arg1;
		@Pc(19) int local19 = arg0.method8581(-17416);
		if (local19 == 0) {
			this.anInt1410 = arg0.method8552();
		} else if (local19 == 1) {
			this.anInt1410 = -1;
		} else {
			this.anInt1410 = -1;
		}
		arg0.method8553();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public void method1235() {
		this.aBoolean151 = false;
		this.aClass4_Sub2_Sub1_Sub2_Sub2_1 = null;
		this.aClass4_Sub2_Sub1_Sub2_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)V")
	public void method1236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass4_Sub2_Sub1_Sub2_Sub2_1 == null) {
			this.aClass4_Sub2_Sub1_Sub2_Sub1_1.aByte133 = this.aClass4_Sub2_Sub1_Sub2_Sub1_1.aByte134 = (byte) arg2;
			this.aClass4_Sub2_Sub1_Sub2_Sub1_1.method736(arg0, arg1);
		} else {
			this.aClass4_Sub2_Sub1_Sub2_Sub2_1.method2071(arg2, arg1, arg0, true, this.aClass4_Sub2_Sub1_Sub2_Sub2_1.method2046());
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Lclient!sj;")
	public Class4_Sub2_Sub1_Sub2 method1238() {
		return this.aClass4_Sub2_Sub1_Sub2_Sub2_1 == null ? this.aClass4_Sub2_Sub1_Sub2_Sub1_1 : this.aClass4_Sub2_Sub1_Sub2_Sub2_1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIIII)V")
	public void method1241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean151) {
			this.aBoolean151 = true;
			if (this.anInt1410 < 0) {
				this.aClass4_Sub2_Sub1_Sub2_Sub1_1 = new Class4_Sub2_Sub1_Sub2_Sub1(25);
				this.aClass4_Sub2_Sub1_Sub2_Sub1_1.method730(Static215.aClass2_Sub20_4);
				this.aClass4_Sub2_Sub1_Sub2_Sub1_1.anInt2320 = this.anInt1408;
				this.aClass4_Sub2_Sub1_Sub2_Sub1_1.anInt2360 = Static528.anInt8386;
				this.aClass4_Sub2_Sub1_Sub2_Sub1_1.anInt2315 = Static495.anInt7937++;
			} else {
				this.aClass4_Sub2_Sub1_Sub2_Sub2_1 = new Class4_Sub2_Sub1_Sub2_Sub2(25);
				this.aClass4_Sub2_Sub1_Sub2_Sub2_1.anInt2360 = Static528.anInt8386;
				this.aClass4_Sub2_Sub1_Sub2_Sub2_1.anInt2320 = this.anInt1408;
				this.aClass4_Sub2_Sub1_Sub2_Sub2_1.method2068(Static192.aClass41_1.method754(this.anInt1410, 2));
				this.aClass4_Sub2_Sub1_Sub2_Sub2_1.method2057(this.aClass4_Sub2_Sub1_Sub2_Sub2_1.aClass261_1.anInt7010);
				this.aClass4_Sub2_Sub1_Sub2_Sub2_1.anInt2357 = this.aClass4_Sub2_Sub1_Sub2_Sub2_1.aClass261_1.anInt7015 << 3;
				this.aClass4_Sub2_Sub1_Sub2_Sub2_1.anInt2315 = Static495.anInt7937++;
			}
		}
		if (this.anInt1410 < 0) {
			this.aClass4_Sub2_Sub1_Sub2_Sub1_1.aByte133 = this.aClass4_Sub2_Sub1_Sub2_Sub1_1.aByte134 = (byte) arg0;
			this.aClass4_Sub2_Sub1_Sub2_Sub1_1.method736(arg1, arg2);
			this.aClass4_Sub2_Sub1_Sub2_Sub1_1.method2054(true, arg3);
		} else {
			this.aClass4_Sub2_Sub1_Sub2_Sub2_1.method2071(arg0, arg2, arg1, true, this.aClass4_Sub2_Sub1_Sub2_Sub2_1.method2046());
			this.aClass4_Sub2_Sub1_Sub2_Sub2_1.method2054(true, arg3);
		}
	}
}
