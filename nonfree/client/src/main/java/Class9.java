import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class9 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "Lclient!il;")
	public Class2_Sub18_Sub1 aClass2_Sub18_Sub1_1;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!uo;")
	public Class2_Sub41_Sub1 aClass2_Sub41_Sub1_1;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Lclient!di;")
	public Class2_Sub13 aClass2_Sub13_1;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Lclient!wq;")
	public Class267 aClass267_1;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
	public final int anInt308;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
	public final int anInt303;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
	public final int anInt310;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
	public int anInt306;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	public final int anInt307;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(BIIIII)V")
	public Class9(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt308 = arg2;
		this.anInt303 = arg1;
		this.anInt310 = arg4;
		this.anInt306 = arg3;
		this.anInt307 = arg5;
		this.aByte1 = arg0;
	}
}
