import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	public int anInt6969;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
	public int anInt6970;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	public int anInt6971;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public int anInt6972;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	public int anInt6973;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
	public int anInt6974;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
	public int anInt6975;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	public int anInt6976;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
	public int anInt6977;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
	public int anInt6980;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
	public int anInt6981;

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
	public int anInt6983;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
	public int anInt6984;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
	public int anInt6985;

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
	public int anInt6986;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	public Class2 method5855(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(16) int local16 = Static447.anIntArray696[this.anInt6976];
		@Pc(18) Class2 local18 = null;
		if (local16 == 0) {
			@Pc(125) Class6_Sub2 local125 = Static542.method7740(this.anInt6984, this.anInt6973, this.anInt6977);
			if (local125 instanceof Class6_Sub2_Sub1) {
				@Pc(131) Class6_Sub2_Sub1 local131 = (Class6_Sub2_Sub1) local125;
				if (local131.aClass6_Sub2_1 != null) {
					local18 = ((Interface15) local131.aClass6_Sub2_1).method7763(arg0, arg1);
				}
			}
		} else if (local16 == 1) {
			@Pc(99) Class6_Sub4 local99 = Static183.method4959(this.anInt6984, this.anInt6973, this.anInt6977);
			if (local99 instanceof Class6_Sub4_Sub2) {
				@Pc(105) Class6_Sub4_Sub2 local105 = (Class6_Sub4_Sub2) local99;
				if (local105.aClass6_Sub4_1 != null) {
					local18 = ((Interface15) local105.aClass6_Sub4_1).method7763(arg0, arg1);
				}
			}
		} else if (local16 == 2) {
			@Pc(44) Class6_Sub1 local44 = Static420.method6482(this.anInt6984, this.anInt6973, this.anInt6977, qn.class);
			if (local44 instanceof Class6_Sub1_Sub4) {
				@Pc(50) Class6_Sub1_Sub4 local50 = (Class6_Sub1_Sub4) local44;
				if (local50.aClass6_Sub1_2 != null) {
					local18 = ((Interface15) local50.aClass6_Sub1_2).method7763(arg0, arg1);
				}
			}
		} else if (local16 == 3) {
			@Pc(73) Class6_Sub3 local73 = Static72.method1464(this.anInt6984, this.anInt6973, this.anInt6977);
			if (local73 instanceof Class6_Sub3_Sub1) {
				@Pc(79) Class6_Sub3_Sub1 local79 = (Class6_Sub3_Sub1) local73;
				if (local79.aClass6_Sub3_1 != null) {
					local18 = ((Interface15) local79.aClass6_Sub3_1).method7763(arg0, arg1);
				}
			}
		}
		return local18 == null ? null : local18.method5775((byte) 0, arg0, true);
	}
}
