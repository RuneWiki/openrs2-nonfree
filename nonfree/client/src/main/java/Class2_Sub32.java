import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
	public final int anInt3868;

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
	public final int anInt3865;

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
	public final int anInt3875;

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
	public final int anInt3867;

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
	public final int anInt3876;

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
	public final int anInt3866;

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
	public final int anInt3870;

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
	public final int anInt3874;

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
	public final int anInt3869;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class2_Sub32(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(5) int local5 = arg0.method8555(-9372);
		this.anInt3868 = local5 & 0x3FFF;
		this.anInt3865 = local5 >>> 14 & 0xEFE43FFF;
		this.anInt3875 = local5 >>> 28;
		this.anInt3867 = arg0.method8581(-17416);
		this.anInt3876 = arg0.method8581(-17416);
		this.anInt3866 = arg0.method8581(-17416);
		this.anInt3870 = arg0.method8581(-17416);
		this.anInt3874 = arg0.method8581(-17416);
		this.anInt3869 = arg0.method8581(-17416);
	}
}
