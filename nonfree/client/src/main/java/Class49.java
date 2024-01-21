import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class49 implements Interface3 {

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	private int anInt2866 = 128;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
	private int anInt2870 = 50;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!ag;")
	private final Class4 aClass4_65;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "Lclient!ag;")
	private final Class4 aClass4_67;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Lclient!ld;")
	private Class47 aClass47_22;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!ag;Lclient!ag;II)V")
	public Class49(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass4_65 = arg0;
		this.anInt2866 = arg3;
		this.anInt2870 = arg2;
		this.aClass4_67 = arg1;
		this.aClass47_22 = new Class47(this.anInt2870);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)I")
	@Override
	public int method2048(@OriginalArg(1) int arg0) {
		return this.method2055(arg0).anInt1001;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method2049(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub5 local13 = this.method2055(arg1);
		local13.aBoolean64 = true;
		return local13.method841(this, arg0, this.aClass4_67, this.anInt2866);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public void method2053() {
		this.aClass47_22 = new Class47(this.anInt2870);
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(II)Lclient!da;")
	private Class1_Sub2_Sub5 method2055(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub5 local11 = (Class1_Sub2_Sub5) this.aClass47_22.method1999((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27 = this.aClass4_65.method2243(0, arg0);
		if (local27 == null) {
			return Static17.method655();
		} else {
			@Pc(37) Class1_Sub8 local37 = new Class1_Sub8(local27);
			local11 = new Class1_Sub2_Sub5(local37);
			this.aClass47_22.method1998(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(II)Z")
	@Override
	public boolean method2052(@OriginalArg(0) int arg0) {
		return this.method2055(arg0).aBoolean66;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method2051(@OriginalArg(0) int arg0) {
		return this.anInt2866 == 64 || this.method2055(arg0).anInt1007 == 64;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2050(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub8 local13 = new Class1_Sub8(this.aClass4_65.method2243(0, arg0));
		@Pc(26) Class1_Sub2_Sub5 local26 = new Class1_Sub2_Sub5(local13);
		return local26.method843(this, this.aClass4_67, this.anInt2866);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
	public void method2056(@OriginalArg(1) int arg0) {
		for (@Pc(19) Class1_Sub2_Sub5 local19 = (Class1_Sub2_Sub5) this.aClass47_22.method1997(); local19 != null; local19 = (Class1_Sub2_Sub5) this.aClass47_22.method1991()) {
			if (local19.aBoolean64) {
				local19.method842(arg0);
				local19.aBoolean64 = false;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2047(@OriginalArg(0) int arg0) {
		return this.method2055(arg0).method838(this.aClass4_67, this);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2046(@OriginalArg(1) int arg0) {
		return this.method2055(arg0).aBoolean65;
	}
}
