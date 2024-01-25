import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class125 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public int anInt4060;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	public int anInt4062;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public int anInt4064;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	public int anInt4067;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!md;")
	public Class125 aClass125_2;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	public int anInt4068;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "I")
	public int anInt4070;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "I")
	public int anInt4071;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "I")
	public int anInt4075;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	public final int anInt4074;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	public final int anInt4076;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	public final int anInt4061;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	public final int anInt4059;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIB)V")
	public Class125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4074 = arg1;
		this.anInt4076 = arg0;
		this.aByte47 = arg4;
		this.anInt4061 = arg2;
		this.anInt4059 = arg3;
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!md;I)V")
	public Class125(@OriginalArg(0) Class125 arg0, @OriginalArg(1) int arg1) {
		this.aClass125_2 = arg0;
		this.aByte47 = this.aClass125_2.aByte47;
		this.anInt4059 = this.aClass125_2.anInt4059 + arg1;
		this.anInt4061 = arg1 + this.aClass125_2.anInt4061;
		this.anInt4076 = this.aClass125_2.anInt4076;
		this.anInt4074 = this.aClass125_2.anInt4074 + arg1;
	}
}
