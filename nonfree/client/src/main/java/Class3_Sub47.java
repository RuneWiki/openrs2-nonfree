import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class3_Sub47 extends Class3 {

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public int anInt7690;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int anInt7693;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
	public int anInt7694;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public int anInt7695;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
	public int anInt7696;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
	public int anInt7697;

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
	public int anInt7698;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	public int anInt7699;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
	public int anInt7700;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	public int anInt7701;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
	public int anInt7702;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	public int anInt7703;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
	public int anInt7704;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
	public int anInt7706;

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
	public int anInt7707;

	static {
		new Class174(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLclient!qa;I)Lclient!ka;")
	public Class108 method6228(@OriginalArg(1) Class167 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static289.anIntArray310[this.anInt7697];
		if (local14 == 0) {
			@Pc(123) Class1_Sub3 local123 = Static392.method5427(this.anInt7704, this.anInt7699, this.anInt7690);
			if (local123 instanceof Class1_Sub3_Sub2) {
				@Pc(129) Class1_Sub3_Sub2 local129 = (Class1_Sub3_Sub2) local123;
				if (local129.aClass1_Sub3_1 != null) {
					return ((Interface5) local129.aClass1_Sub3_1).method6258(arg1, arg0);
				}
			}
		} else if (local14 == 1) {
			@Pc(32) Class1_Sub1 local32 = Static222.method4446(this.anInt7704, this.anInt7699, this.anInt7690);
			if (local32 instanceof Class1_Sub1_Sub3) {
				@Pc(38) Class1_Sub1_Sub3 local38 = (Class1_Sub1_Sub3) local32;
				if (local38.aClass1_Sub1_3 != null) {
					return ((Interface5) local38.aClass1_Sub1_3).method6258(arg1, arg0);
				}
			}
		} else if (local14 == 2) {
			@Pc(98) Class1_Sub2 local98 = Static313.method4388(this.anInt7704, this.anInt7699, this.anInt7690, jt.class);
			if (local98 instanceof Class1_Sub2_Sub4) {
				@Pc(104) Class1_Sub2_Sub4 local104 = (Class1_Sub2_Sub4) local98;
				if (local104.aClass1_Sub2_2 != null) {
					return ((Interface5) local104.aClass1_Sub2_2).method6258(arg1, arg0);
				}
			}
		} else if (local14 == 3) {
			@Pc(65) Class1_Sub4 local65 = Static112.method1824(this.anInt7704, this.anInt7699, this.anInt7690);
			if (local65 instanceof Class1_Sub4_Sub3) {
				@Pc(71) Class1_Sub4_Sub3 local71 = (Class1_Sub4_Sub3) local65;
				if (local71.aClass1_Sub4_1 != null) {
					return ((Interface5) local71.aClass1_Sub4_1).method6258(arg1, arg0);
				}
			}
		}
		return null;
	}
}
