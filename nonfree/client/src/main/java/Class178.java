import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public final class Class178 {

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "Lclient!oia;")
	public Class259 aClass259_1;

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "Lclient!bc;")
	public Class5_Sub9_Sub1 aClass5_Sub9_Sub1_1;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "Lclient!ct;")
	public Class5_Sub14_Sub1 aClass5_Sub14_Sub1_1;

	@OriginalMember(owner = "client!jea", name = "q", descriptor = "Lclient!vp;")
	public Class5_Sub54 aClass5_Sub54_1;

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
	public int anInt4274;

	@OriginalMember(owner = "client!jea", name = "n", descriptor = "I")
	public final int anInt4277;

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
	public final int anInt4271;

	@OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
	public final int anInt4275;

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "Lclient!sf;")
	public final Class41_Sub1 aClass41_Sub1_11;

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
	public final int anInt4273;

	@OriginalMember(owner = "client!jea", name = "u", descriptor = "I")
	public final int anInt4282;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(BIIIIIILclient!sf;)V")
	public Class178(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class41_Sub1 arg7) {
		this.anInt4274 = arg3;
		this.anInt4277 = arg4;
		this.anInt4271 = arg1;
		this.anInt4275 = arg2;
		this.aClass41_Sub1_11 = arg7;
		this.aByte47 = arg0;
		this.anInt4273 = arg6;
		this.anInt4282 = arg5;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)Z")
	public boolean method3796() {
		return this.aByte47 == 2 || this.aByte47 == 3;
	}
}
