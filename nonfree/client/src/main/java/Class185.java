import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class185 {

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "Lclient!ee;")
	public Class4_Sub12 aClass4_Sub12_1;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Lclient!ub;")
	public Class323 aClass323_1;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Lclient!tk;")
	public Class4_Sub42_Sub1 aClass4_Sub42_Sub1_1;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "Lclient!lc;")
	public Class4_Sub21_Sub2 aClass4_Sub21_Sub2_1;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
	public final int anInt5797;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
	public final int anInt5788;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
	public int anInt5795;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
	public final int anInt5786;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
	public final int anInt5787;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Lclient!vj;")
	public final Class21_Sub1 aClass21_Sub1_3;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	public final int anInt5789;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(BIIIIIILclient!vj;)V")
	public Class185(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class21_Sub1 arg7) {
		this.anInt5797 = arg6;
		this.anInt5788 = arg5;
		this.anInt5795 = arg3;
		this.anInt5786 = arg4;
		this.anInt5787 = arg1;
		this.aClass21_Sub1_3 = arg7;
		this.anInt5789 = arg2;
		this.aByte94 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Z")
	public boolean method4472() {
		return this.aByte94 == 2 || this.aByte94 == 3;
	}
}
