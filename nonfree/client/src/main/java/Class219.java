import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class219 {

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Lclient!vi;")
	public Class3_Sub43 aClass3_Sub43_1;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "Lclient!bq;")
	public Class3_Sub6_Sub1 aClass3_Sub6_Sub1_2;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "Lclient!oe;")
	public Class175 aClass175_1;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "Lclient!gn;")
	public Class3_Sub5_Sub2 aClass3_Sub5_Sub2_4;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
	public final int anInt6084;

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
	public final int anInt6083;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
	public int anInt6082;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	public final int anInt6081;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
	public final int anInt6087;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(BIIIII)V")
	public Class219(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6084 = arg4;
		this.anInt6083 = arg5;
		this.anInt6082 = arg3;
		this.anInt6081 = arg1;
		this.anInt6087 = arg2;
		this.aByte97 = arg0;
	}
}
