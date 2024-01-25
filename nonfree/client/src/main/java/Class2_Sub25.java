import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
	public int anInt4087;

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
	public int anInt4088;

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
	public int anInt4089;

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
	public int anInt4091;

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
	public int anInt4093;

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
	public int anInt4094;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
	public int anInt4095;

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
	public int anInt4096;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
	public int anInt4097;

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
	public int anInt4098;

	@OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
	public int anInt4099;

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
	public int anInt4102;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
	public int anInt4103;

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
	public int anInt4104;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
	public int anInt4105;

	static {
		new Class140(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!dr;II)Lclient!wp;")
	public Class49 method3504(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static148.anIntArray254[this.anInt4089];
		if (local14 == 0) {
			@Pc(118) Class1_Sub1 local118 = Static356.method5687(this.anInt4102, this.anInt4104, this.anInt4087);
			if (local118 instanceof Class1_Sub1_Sub3) {
				@Pc(124) Class1_Sub1_Sub3 local124 = (Class1_Sub1_Sub3) local118;
				if (local124.aClass1_Sub1_3 != null) {
					return ((Interface8) local124.aClass1_Sub1_3).method5499(arg0, arg1);
				}
			}
		} else if (local14 == 1) {
			@Pc(93) Class1_Sub3 local93 = Static346.method5010(this.anInt4102, this.anInt4104, this.anInt4087);
			if (local93 instanceof Class1_Sub3_Sub1) {
				@Pc(99) Class1_Sub3_Sub1 local99 = (Class1_Sub3_Sub1) local93;
				if (local99.aClass1_Sub3_3 != null) {
					return ((Interface8) local99.aClass1_Sub3_3).method5499(arg0, arg1);
				}
			}
		} else if (local14 == 2) {
			@Pc(38) Class1_Sub2 local38 = Static109.method2112(this.anInt4102, this.anInt4104, this.anInt4087, rc.class);
			if (local38 instanceof Class1_Sub2_Sub2) {
				@Pc(44) Class1_Sub2_Sub2 local44 = (Class1_Sub2_Sub2) local38;
				if (local44.aClass1_Sub2_2 != null) {
					return ((Interface8) local44.aClass1_Sub2_2).method5499(arg0, arg1);
				}
			}
		} else if (local14 == 3) {
			@Pc(68) Class1_Sub4 local68 = Static217.method4135(this.anInt4102, this.anInt4104, this.anInt4087);
			if (local68 instanceof Class1_Sub4_Sub3) {
				@Pc(74) Class1_Sub4_Sub3 local74 = (Class1_Sub4_Sub3) local68;
				if (local74.aClass1_Sub4_2 != null) {
					return ((Interface8) local74.aClass1_Sub4_2).method5499(arg0, arg1);
				}
			}
		}
		return null;
	}
}
