import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class4_Sub44 extends Class4 {

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
	public int anInt8030;

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
	public int anInt8031;

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
	public int anInt8032;

	@OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
	public int anInt8035;

	@OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
	public int anInt8036;

	@OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
	public int anInt8037;

	@OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
	public int anInt8038;

	@OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
	public int anInt8040;

	@OriginalMember(owner = "client!sca", name = "v", descriptor = "I")
	public int anInt8041;

	@OriginalMember(owner = "client!sca", name = "w", descriptor = "I")
	public int anInt8042;

	@OriginalMember(owner = "client!sca", name = "x", descriptor = "I")
	public int anInt8043;

	@OriginalMember(owner = "client!sca", name = "y", descriptor = "I")
	public int anInt8044;

	@OriginalMember(owner = "client!sca", name = "z", descriptor = "I")
	public int anInt8045;

	@OriginalMember(owner = "client!sca", name = "A", descriptor = "I")
	public int anInt8046;

	@OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
	public int anInt8047;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	public Class9 method6638(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static528.anIntArray683[this.anInt8032];
		@Pc(10) Class9 local10 = null;
		if (local8 == 0) {
			@Pc(131) Class10_Sub2 local131 = Static216.method3734(this.anInt8044, this.anInt8042, this.anInt8047);
			if (local131 instanceof Class10_Sub2_Sub1) {
				@Pc(137) Class10_Sub2_Sub1 local137 = (Class10_Sub2_Sub1) local131;
				if (local137.aClass10_Sub2_1 != null) {
					local10 = ((Interface17) local137.aClass10_Sub2_1).method7740(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(37) Class10_Sub4 local37 = Static183.method3413(this.anInt8044, this.anInt8042, this.anInt8047);
			if (local37 instanceof Class10_Sub4_Sub2) {
				@Pc(43) Class10_Sub4_Sub2 local43 = (Class10_Sub4_Sub2) local37;
				if (local43.aClass10_Sub4_3 != null) {
					local10 = ((Interface17) local43.aClass10_Sub4_3).method7740(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(105) Class10_Sub1 local105 = Static541.method7510(this.anInt8044, this.anInt8042, this.anInt8047, qi.class);
			if (local105 instanceof Class10_Sub1_Sub5) {
				@Pc(111) Class10_Sub1_Sub5 local111 = (Class10_Sub1_Sub5) local105;
				if (local111.aClass10_Sub1_2 != null) {
					local10 = ((Interface17) local111.aClass10_Sub1_2).method7740(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(71) Class10_Sub5 local71 = Static38.method651(this.anInt8044, this.anInt8042, this.anInt8047);
			if (local71 instanceof Class10_Sub5_Sub3) {
				@Pc(77) Class10_Sub5_Sub3 local77 = (Class10_Sub5_Sub3) local71;
				if (local77.aClass10_Sub5_2 != null) {
					local10 = ((Interface17) local77.aClass10_Sub5_2).method7740(arg0, arg1);
				}
			}
		}
		return local10 == null ? null : local10.method4006((byte) 0, arg1, true);
	}
}
