import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class216 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Lclient!jm;")
	public Class3_Sub27 aClass3_Sub27_1;

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Lclient!t;")
	public Class3_Sub1_Sub3 aClass3_Sub1_Sub3_4;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "Lclient!qv;")
	public Class204 aClass204_1;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "Lclient!jp;")
	public Class3_Sub28_Sub1 aClass3_Sub28_Sub1_2;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
	public final int anInt6179;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	public final int anInt6180;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	public final int anInt6178;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
	public final int anInt6182;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
	public int anInt6181;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(BIIIII)V")
	public Class216(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6179 = arg4;
		this.anInt6180 = arg5;
		this.anInt6178 = arg2;
		this.aByte75 = arg0;
		this.anInt6182 = arg1;
		this.anInt6181 = arg3;
	}
}
