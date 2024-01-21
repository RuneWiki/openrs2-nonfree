import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class31 implements Interface2 {

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private int anInt1610 = 128;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	private int anInt1617 = 50;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Lclient!sd;")
	private final Class60 aClass60_16;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!sd;")
	private final Class60 aClass60_15;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!uc;")
	private Class87 aClass87_31;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!sd;Lclient!sd;II)V")
	public Class31(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1617 = arg2;
		this.aClass60_16 = arg0;
		this.anInt1610 = arg3;
		this.aClass60_15 = arg1;
		this.aClass87_31 = new Class87(this.anInt1617);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1090(@OriginalArg(0) int arg0) {
		return this.method1097(arg0).aBoolean26;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1091(@OriginalArg(1) int arg0) {
		return this.anInt1610 == 64 || this.method1097(arg0).anInt697 == 64;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIF)[I")
	@Override
	public int[] method1096(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		@Pc(13) Class1_Sub2_Sub4 local13 = this.method1097(arg0);
		local13.aBoolean29 = true;
		return local13.method414(this.anInt1610, this, arg1, this.aClass60_15);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IB)Lclient!cb;")
	private Class1_Sub2_Sub4 method1097(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub4 local11 = (Class1_Sub2_Sub4) this.aClass87_31.method3062((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28 = this.aClass60_16.method2340(arg0, 0);
		if (local28 == null) {
			return Static50.method922();
		} else {
			@Pc(35) Class1_Sub14 local35 = new Class1_Sub14(local28);
			local11 = new Class1_Sub2_Sub4(local35);
			this.aClass87_31.method3068(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method1094(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub4 local13 = this.method1097(arg0);
		return local13.method421(this, this.aClass60_15, this.anInt1610);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1093(@OriginalArg(1) int arg0) {
		return this.method1097(arg0).aBoolean28;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public void method1100() {
		this.aClass87_31 = new Class87(this.anInt1617);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)I")
	@Override
	public int method1092(@OriginalArg(1) int arg0) {
		return this.method1097(arg0).anInt693;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)V")
	public void method1101(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class1_Sub2_Sub4 local11 = (Class1_Sub2_Sub4) this.aClass87_31.method3066(); local11 != null; local11 = (Class1_Sub2_Sub4) this.aClass87_31.method3064()) {
			if (local11.aBoolean29) {
				local11.method417(arg0);
				local11.aBoolean29 = false;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1095(@OriginalArg(1) int arg0) {
		return this.method1097(arg0).method416(this, this.aClass60_15);
	}
}
