import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class6_Sub42 extends Class6 {

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
	public int anInt8147;

	@OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
	public int anInt8148;

	@OriginalMember(owner = "client!saa", name = "s", descriptor = "I")
	public int anInt8152;

	@OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
	public int anInt8153;

	@OriginalMember(owner = "client!saa", name = "u", descriptor = "I")
	public int anInt8154;

	@OriginalMember(owner = "client!saa", name = "v", descriptor = "I")
	public int anInt8155;

	@OriginalMember(owner = "client!saa", name = "w", descriptor = "I")
	public int anInt8156;

	@OriginalMember(owner = "client!saa", name = "x", descriptor = "I")
	public int anInt8157;

	@OriginalMember(owner = "client!saa", name = "y", descriptor = "I")
	public int anInt8158;

	@OriginalMember(owner = "client!saa", name = "z", descriptor = "I")
	public int anInt8159;

	@OriginalMember(owner = "client!saa", name = "A", descriptor = "I")
	public int anInt8160;

	@OriginalMember(owner = "client!saa", name = "B", descriptor = "I")
	public int anInt8161;

	@OriginalMember(owner = "client!saa", name = "C", descriptor = "I")
	public int anInt8162;

	@OriginalMember(owner = "client!saa", name = "D", descriptor = "I")
	public int anInt8163;

	@OriginalMember(owner = "client!saa", name = "G", descriptor = "I")
	public int anInt8165;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	public Class24 method6473(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1) {
		@Pc(8) int local8 = Static424.anIntArray537[this.anInt8153];
		@Pc(10) Class24 local10 = null;
		if (local8 == 0) {
			@Pc(23) Class15_Sub1 local23 = Static556.method7726(this.anInt8161, this.anInt8162, this.anInt8152);
			if (local23 instanceof Class15_Sub1_Sub2) {
				@Pc(29) Class15_Sub1_Sub2 local29 = (Class15_Sub1_Sub2) local23;
				if (local29.aClass15_Sub1_3 != null) {
					local10 = ((Interface22) local29.aClass15_Sub1_3).method7174(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(54) Class15_Sub4 local54 = Static533.method7261(this.anInt8161, this.anInt8162, this.anInt8152);
			if (local54 instanceof Class15_Sub4_Sub3) {
				@Pc(60) Class15_Sub4_Sub3 local60 = (Class15_Sub4_Sub3) local54;
				if (local60.aClass15_Sub4_3 != null) {
					local10 = ((Interface22) local60.aClass15_Sub4_3).method7174(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(124) Class15_Sub2 local124 = Static406.method5850(this.anInt8161, this.anInt8162, this.anInt8152, uq.class);
			if (local124 instanceof Class15_Sub2_Sub1) {
				@Pc(130) Class15_Sub2_Sub1 local130 = (Class15_Sub2_Sub1) local124;
				if (local130.aClass15_Sub2_1 != null) {
					local10 = ((Interface22) local130.aClass15_Sub2_1).method7174(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(90) Class15_Sub3 local90 = Static361.method5373(this.anInt8161, this.anInt8162, this.anInt8152);
			if (local90 instanceof Class15_Sub3_Sub2) {
				@Pc(96) Class15_Sub3_Sub2 local96 = (Class15_Sub3_Sub2) local90;
				if (local96.aClass15_Sub3_1 != null) {
					local10 = ((Interface22) local96.aClass15_Sub3_1).method7174(arg0, arg1);
				}
			}
		}
		return local10 == null ? null : local10.method7398((byte) 0, arg0, true);
	}
}
