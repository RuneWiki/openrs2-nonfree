import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class208 {

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "Lclient!cj;")
	public Class2_Sub12_Sub1 aClass2_Sub12_Sub1_4;

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "Lclient!dc;")
	public Class2_Sub14 aClass2_Sub14_3;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "Lclient!tf;")
	public Class2_Sub2_Sub5 aClass2_Sub2_Sub5_4;

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "Lclient!oia;")
	public Class243 aClass243_1;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "Lclient!gs;")
	public final Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "B")
	public final byte aByte89;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
	public final int anInt6163;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
	public final int anInt6162;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
	public int anInt6158;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
	public final int anInt6165;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
	public final int anInt6161;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
	public final int anInt6164;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(BIIIIIILclient!gs;)V")
	public Class208(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class11_Sub1 arg7) {
		this.aClass11_Sub1_2 = arg7;
		this.aByte89 = arg0;
		this.anInt6163 = arg1;
		this.anInt6162 = arg6;
		this.anInt6158 = arg3;
		this.anInt6165 = arg4;
		this.anInt6161 = arg2;
		this.anInt6164 = arg5;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)Z")
	public boolean method5168() {
		return this.aByte89 == 2 || this.aByte89 == 3;
	}
}
