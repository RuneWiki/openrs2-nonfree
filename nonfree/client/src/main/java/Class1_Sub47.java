import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class1_Sub47 extends Class1 {

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
	public int anInt8035;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
	public int anInt8037;

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
	public int anInt8038;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	public int anInt8040;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
	public int anInt8041;

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
	public int anInt8042;

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
	public int anInt8043;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
	public int anInt8044;

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
	public int anInt8045;

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
	public int anInt8046;

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "I")
	public int anInt8047;

	@OriginalMember(owner = "client!tp", name = "y", descriptor = "I")
	public int anInt8048;

	@OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
	public int anInt8049;

	@OriginalMember(owner = "client!tp", name = "B", descriptor = "I")
	public int anInt8051;

	@OriginalMember(owner = "client!tp", name = "D", descriptor = "I")
	public int anInt8052;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	public Class19 method6836(@OriginalArg(1) Class9 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static438.anIntArray201[this.anInt8041];
		@Pc(16) Class19 local16 = null;
		if (local14 == 0) {
			@Pc(125) Class47_Sub4 local125 = Static503.method7224(this.anInt8045, this.anInt8040, this.anInt8047);
			if (local125 instanceof Class47_Sub4_Sub3) {
				@Pc(131) Class47_Sub4_Sub3 local131 = (Class47_Sub4_Sub3) local125;
				if (local131.aClass47_Sub4_3 != null) {
					local16 = ((Interface17) local131.aClass47_Sub4_3).method7178(arg1, arg0);
				}
			}
		} else if (local14 == 1) {
			@Pc(99) Class47_Sub5 local99 = Static313.method5162(this.anInt8045, this.anInt8040, this.anInt8047);
			if (local99 instanceof Class47_Sub5_Sub1) {
				@Pc(105) Class47_Sub5_Sub1 local105 = (Class47_Sub5_Sub1) local99;
				if (local105.aClass47_Sub5_3 != null) {
					local16 = ((Interface17) local105.aClass47_Sub5_3).method7178(arg1, arg0);
				}
			}
		} else if (local14 == 2) {
			@Pc(42) Class47_Sub2 local42 = Static52.method1507(this.anInt8045, this.anInt8040, this.anInt8047, up.class);
			if (local42 instanceof Class47_Sub2_Sub1) {
				@Pc(48) Class47_Sub2_Sub1 local48 = (Class47_Sub2_Sub1) local42;
				if (local48.aClass47_Sub2_1 != null) {
					local16 = ((Interface17) local48.aClass47_Sub2_1).method7178(arg1, arg0);
				}
			}
		} else if (local14 == 3) {
			@Pc(73) Class47_Sub3 local73 = Static167.method3276(this.anInt8045, this.anInt8040, this.anInt8047);
			if (local73 instanceof Class47_Sub3_Sub2) {
				@Pc(79) Class47_Sub3_Sub2 local79 = (Class47_Sub3_Sub2) local73;
				if (local79.aClass47_Sub3_2 != null) {
					local16 = ((Interface17) local79.aClass47_Sub3_2).method7178(arg1, arg0);
				}
			}
		}
		return local16 == null ? null : local16.method7260((byte) 0, arg1, true);
	}
}
