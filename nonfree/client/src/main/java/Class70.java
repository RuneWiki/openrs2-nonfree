import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public final class Class70 {

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "Lclient!bj;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "Lclient!rw;")
	public Class3_Sub44 aClass3_Sub44_1;

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "Lclient!te;")
	public Class3_Sub42_Sub1 aClass3_Sub42_Sub1_1;

	@OriginalMember(owner = "client!eda", name = "i", descriptor = "Lclient!nt;")
	public Class3_Sub9_Sub2 aClass3_Sub9_Sub2_1;

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
	public int anInt2330;

	@OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
	public final int anInt2334;

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
	public final int anInt2335;

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
	public final int anInt2332;

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
	public final int anInt2331;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(BIIIII)V")
	public Class70(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aByte26 = arg0;
		this.anInt2330 = arg3;
		this.anInt2334 = arg5;
		this.anInt2335 = arg4;
		this.anInt2332 = arg1;
		this.anInt2331 = arg2;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)Z")
	public boolean method2063() {
		return this.aByte26 == 2 || this.aByte26 == 3;
	}
}
