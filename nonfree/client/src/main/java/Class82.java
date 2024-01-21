import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class82 implements Interface3 {

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
	private int anInt4519 = 50;

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
	private int anInt4522 = 128;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "Lclient!dd;")
	private final Class16 aClass16_36;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!dd;")
	private final Class16 aClass16_35;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!rc;")
	private Class66 aClass66_24;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!dd;Lclient!dd;II)V")
	public Class82(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass16_36 = arg1;
		this.anInt4522 = arg3;
		this.aClass16_35 = arg0;
		this.anInt4519 = arg2;
		this.aClass66_24 = new Class66(this.anInt4519);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3050(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub6 local19 = new Class1_Sub6(this.aClass16_35.method2254(arg0, 0));
		@Pc(24) Class1_Sub1_Sub2 local24 = new Class1_Sub1_Sub2(local19);
		return local24.method75(this, this.aClass16_36, this.anInt4522);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method3053(@OriginalArg(0) int arg0) {
		return this.method3063(arg0).method73(this.aClass16_36, this);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public void method3058() {
		this.aClass66_24 = new Class66(this.anInt4519);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method3052(@OriginalArg(1) int arg0) {
		return this.method3063(arg0).aBoolean4;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method3056(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub2 local12 = this.method3063(arg1);
		local12.aBoolean3 = true;
		return local12.method77(arg0, this, this.aClass16_36, this.anInt4522);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
	public void method3060(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class1_Sub1_Sub2 local11 = (Class1_Sub1_Sub2) this.aClass66_24.method2598(); local11 != null; local11 = (Class1_Sub1_Sub2) this.aClass66_24.method2595()) {
			if (local11.aBoolean3) {
				local11.method76(arg0);
				local11.aBoolean3 = false;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method3055(@OriginalArg(0) int arg0) {
		return this.method3063(arg0).aBoolean5;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IZ)Lclient!ac;")
	private Class1_Sub1_Sub2 method3063(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub1_Sub2 local11 = (Class1_Sub1_Sub2) this.aClass66_24.method2599((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27 = this.aClass16_35.method2254(arg0, 0);
		if (local27 == null) {
			return Static114.method2302();
		} else {
			@Pc(37) Class1_Sub6 local37 = new Class1_Sub6(local27);
			local11 = new Class1_Sub1_Sub2(local37);
			this.aClass66_24.method2597((long) arg0, local11);
			return local11;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3051(@OriginalArg(1) int arg0) {
		return this.anInt4522 == 64 || this.method3063(arg0).anInt133 == 64;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(BI)I")
	@Override
	public int method3054(@OriginalArg(1) int arg0) {
		return this.method3063(arg0).anInt126;
	}
}
