import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
	public int anInt4501;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
	public int anInt4502;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	public int anInt4504;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
	public int anInt4506;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
	public int anInt4507;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
	public int anInt4508;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
	public int anInt4509;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
	public int anInt4510;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
	public int anInt4511;

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
	public int anInt4512;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
	public int anInt4514;

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
	public int anInt4515;

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
	public int anInt4516;

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
	public int anInt4517;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public int anInt4518;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBLclient!qa;)Lclient!r;")
	public Class97 method4188(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(14) int local14 = Static250.anIntArray400[this.anInt4515];
		@Pc(16) Class97 local16 = null;
		if (local14 == 0) {
			@Pc(26) Class20_Sub2 local26 = Static47.method5108(this.anInt4517, this.anInt4518, this.anInt4509);
			if (local26 instanceof Class20_Sub2_Sub3) {
				@Pc(32) Class20_Sub2_Sub3 local32 = (Class20_Sub2_Sub3) local26;
				if (local32.aClass20_Sub2_3 != null) {
					local16 = ((Interface7) local32.aClass20_Sub2_3).method8048(arg0, arg1);
				}
			}
		} else if (local14 == 1) {
			@Pc(125) Class20_Sub4 local125 = Static544.method6945(this.anInt4517, this.anInt4518, this.anInt4509);
			if (local125 instanceof Class20_Sub4_Sub2) {
				@Pc(131) Class20_Sub4_Sub2 local131 = (Class20_Sub4_Sub2) local125;
				if (local131.aClass20_Sub4_3 != null) {
					local16 = ((Interface7) local131.aClass20_Sub4_3).method8048(arg0, arg1);
				}
			}
		} else if (local14 == 2) {
			@Pc(68) Class20_Sub1 local68 = Static100.method2041(this.anInt4517, this.anInt4518, this.anInt4509, fp.class);
			if (local68 instanceof Class20_Sub1_Sub4) {
				@Pc(74) Class20_Sub1_Sub4 local74 = (Class20_Sub1_Sub4) local68;
				if (local74.aClass20_Sub1_1 != null) {
					local16 = ((Interface7) local74.aClass20_Sub1_1).method8048(arg0, arg1);
				}
			}
		} else if (local14 == 3) {
			@Pc(99) Class20_Sub5 local99 = Static465.method7066(this.anInt4517, this.anInt4518, this.anInt4509);
			if (local99 instanceof Class20_Sub5_Sub1) {
				@Pc(105) Class20_Sub5_Sub1 local105 = (Class20_Sub5_Sub1) local99;
				if (local105.aClass20_Sub5_2 != null) {
					local16 = ((Interface7) local105.aClass20_Sub5_2).method8048(arg0, arg1);
				}
			}
		}
		return local16 == null ? null : local16.method6770((byte) 0, arg0, true);
	}
}
