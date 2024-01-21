import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class86 implements Interface1 {

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	private int anInt3679 = 50;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	private int anInt3674 = 128;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!bc;")
	private final Class1 aClass1_30;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Lclient!bc;")
	private final Class1 aClass1_29;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!af;")
	private Class5 aClass5_51;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!bc;Lclient!bc;II)V")
	public Class86(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3679 = arg2;
		this.aClass1_30 = arg1;
		this.aClass1_29 = arg0;
		this.anInt3674 = arg3;
		this.aClass5_51 = new Class5(this.anInt3679);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method2652(@OriginalArg(1) int arg0) {
		return this.method2657(arg0).aBoolean48;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2649(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub17 local9 = new Class3_Sub17(this.aClass1_29.method60(0, arg0));
		@Pc(18) Class3_Sub1_Sub8 local18 = new Class3_Sub1_Sub8(local9);
		return local18.method762(this.anInt3674, this.aClass1_30, this);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(IZ)Z")
	@Override
	public boolean method2653(@OriginalArg(0) int arg0) {
		return this.method2657(arg0).method766(this, this.aClass1_30);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method2648(@OriginalArg(0) int arg0) {
		return this.anInt3674 == 64 || this.method2657(arg0).anInt1126 == 64;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2651(@OriginalArg(1) int arg0) {
		return this.method2657(arg0).aBoolean50;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public void method2654() {
		this.aClass5_51 = new Class5(this.anInt3679);
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(II)Lclient!ff;")
	private Class3_Sub1_Sub8 method2657(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub1_Sub8 local9 = (Class3_Sub1_Sub8) this.aClass5_51.method139((long) arg0);
		if (local9 != null) {
			return local9;
		}
		@Pc(36) byte[] local36 = this.aClass1_29.method60(0, arg0);
		if (local36 == null) {
			return Static106.method1569();
		} else {
			@Pc(43) Class3_Sub17 local43 = new Class3_Sub17(local36);
			local9 = new Class3_Sub1_Sub8(local43);
			this.aClass5_51.method145(local9, (long) arg0);
			return local9;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IFB)[I")
	@Override
	public int[] method2647(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(10) Class3_Sub1_Sub8 local10 = this.method2657(arg0);
		local10.aBoolean51 = true;
		return local10.method763(this.anInt3674, this.aClass1_30, this, arg1);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	@Override
	public int method2650(@OriginalArg(0) int arg0) {
		return this.method2657(arg0).anInt1118;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V")
	public void method2659(@OriginalArg(0) int arg0) {
		for (@Pc(7) Class3_Sub1_Sub8 local7 = (Class3_Sub1_Sub8) this.aClass5_51.method144(); local7 != null; local7 = (Class3_Sub1_Sub8) this.aClass5_51.method140()) {
			if (local7.aBoolean51) {
				local7.method760(arg0);
				local7.aBoolean51 = false;
			}
		}
	}
}
