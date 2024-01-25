import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class1_Sub50 extends Class1 {

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
	public int anInt8756;

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
	public int anInt8757;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
	public int anInt8758;

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
	public int anInt8759;

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
	public int anInt8760;

	@OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
	public int anInt8761;

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
	public int anInt8762;

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
	public int anInt8765;

	@OriginalMember(owner = "client!vu", name = "v", descriptor = "I")
	public int anInt8766;

	@OriginalMember(owner = "client!vu", name = "w", descriptor = "I")
	public int anInt8767;

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "I")
	public int anInt8768;

	@OriginalMember(owner = "client!vu", name = "y", descriptor = "I")
	public int anInt8769;

	@OriginalMember(owner = "client!vu", name = "A", descriptor = "I")
	public int anInt8771;

	@OriginalMember(owner = "client!vu", name = "C", descriptor = "I")
	public int anInt8773;

	@OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
	public int anInt8774;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!qa;I)Lclient!r;")
	public Class145 method7170(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1) {
		@Pc(14) int local14 = Static280.anIntArray530[this.anInt8769];
		@Pc(16) Class145 local16 = null;
		if (local14 == 0) {
			@Pc(29) Class49_Sub1 local29 = Static453.method6441(this.anInt8774, this.anInt8767, this.anInt8771);
			if (local29 instanceof Class49_Sub1_Sub2) {
				@Pc(35) Class49_Sub1_Sub2 local35 = (Class49_Sub1_Sub2) local29;
				if (local35.aClass49_Sub1_1 != null) {
					local16 = ((Interface18) local35.aClass49_Sub1_1).method7468(arg0, arg1);
				}
			}
		} else if (local14 == 1) {
			@Pc(126) Class49_Sub3 local126 = Static53.method1029(this.anInt8774, this.anInt8767, this.anInt8771);
			if (local126 instanceof Class49_Sub3_Sub3) {
				@Pc(132) Class49_Sub3_Sub3 local132 = (Class49_Sub3_Sub3) local126;
				if (local132.aClass49_Sub3_3 != null) {
					local16 = ((Interface18) local132.aClass49_Sub3_3).method7468(arg0, arg1);
				}
			}
		} else if (local14 == 2) {
			@Pc(71) Class49_Sub2 local71 = Static156.method2467(this.anInt8774, this.anInt8767, this.anInt8771, vaa.class);
			if (local71 instanceof Class49_Sub2_Sub3) {
				@Pc(77) Class49_Sub2_Sub3 local77 = (Class49_Sub2_Sub3) local71;
				if (local77.aClass49_Sub2_2 != null) {
					local16 = ((Interface18) local77.aClass49_Sub2_2).method7468(arg0, arg1);
				}
			}
		} else if (local14 == 3) {
			@Pc(100) Class49_Sub5 local100 = Static117.method1983(this.anInt8774, this.anInt8767, this.anInt8771);
			if (local100 instanceof Class49_Sub5_Sub2) {
				@Pc(106) Class49_Sub5_Sub2 local106 = (Class49_Sub5_Sub2) local100;
				if (local106.aClass49_Sub5_1 != null) {
					local16 = ((Interface18) local106.aClass49_Sub5_1).method7468(arg0, arg1);
				}
			}
		}
		return local16 == null ? null : local16.method6672((byte) 0, arg0, true);
	}
}
