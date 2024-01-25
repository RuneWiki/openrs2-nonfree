import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	public int anInt6956;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
	public int anInt6957;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
	public int anInt6958;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public int anInt6959;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
	public int anInt6960;

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
	public int anInt6961;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
	public int anInt6962;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
	public int anInt6963;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	public int anInt6964;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	public int anInt6966;

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
	public int anInt6968;

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
	public int anInt6969;

	@OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
	public int anInt6970;

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
	public int anInt6972;

	@OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
	public int anInt6973;

	static {
		new Class134(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!za;)Lclient!e;")
	public Class59 method5393(@OriginalArg(1) int arg0, @OriginalArg(2) Class163 arg1) {
		@Pc(16) int local16 = Static235.anIntArray329[this.anInt6972];
		if (local16 == 0) {
			@Pc(122) Class3_Sub2 local122 = Static113.method1718(this.anInt6957, this.anInt6960, this.anInt6958);
			if (local122 instanceof Class3_Sub2_Sub1) {
				@Pc(128) Class3_Sub2_Sub1 local128 = (Class3_Sub2_Sub1) local122;
				if (local128.aClass3_Sub2_1 != null) {
					return ((Interface2) local128.aClass3_Sub2_1).method5291(arg0, arg1);
				}
			}
		} else if (local16 == 1) {
			@Pc(31) Class3_Sub3 local31 = Static333.method4460(this.anInt6957, this.anInt6960, this.anInt6958);
			if (local31 instanceof Class3_Sub3_Sub1) {
				@Pc(37) Class3_Sub3_Sub1 local37 = (Class3_Sub3_Sub1) local31;
				if (local37.aClass3_Sub3_1 != null) {
					return ((Interface2) local37.aClass3_Sub3_1).method5291(arg0, arg1);
				}
			}
		} else if (local16 == 2) {
			@Pc(97) Class3_Sub4 local97 = Static144.method2120(this.anInt6957, this.anInt6960, this.anInt6958, bn.class);
			if (local97 instanceof Class3_Sub4_Sub2) {
				@Pc(103) Class3_Sub4_Sub2 local103 = (Class3_Sub4_Sub2) local97;
				if (local103.aClass3_Sub4_1 != null) {
					return ((Interface2) local103.aClass3_Sub4_1).method5291(arg0, arg1);
				}
			}
		} else if (local16 == 3) {
			@Pc(64) Class3_Sub5 local64 = Static350.method4653(this.anInt6957, this.anInt6960, this.anInt6958);
			if (local64 instanceof Class3_Sub5_Sub3) {
				@Pc(70) Class3_Sub5_Sub3 local70 = (Class3_Sub5_Sub3) local64;
				if (local70.aClass3_Sub5_1 != null) {
					return ((Interface2) local70.aClass3_Sub5_1).method5291(arg0, arg1);
				}
			}
		}
		return null;
	}
}
