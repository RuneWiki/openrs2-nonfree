import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class78_Sub1_Sub1 extends Class78_Sub1 {

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!vm;")
	private Class44_Sub4 aClass44_Sub4_1;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	private final int anInt4741;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
	private final int anInt4738;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	private final int anInt4739;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	private final int anInt4742;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	private final int anInt4737;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_30;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	private final int anInt4740;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!nf;IIIIII)V")
	public Class78_Sub1_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4741 = arg2;
		this.anInt4738 = arg5;
		this.anInt4739 = arg3;
		this.anInt4742 = arg1;
		this.anInt4737 = arg6;
		this.aClass105_Sub1_30 = arg0;
		this.anInt4740 = arg4;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!vm;")
	@Override
	public Class44_Sub4 method4488() {
		if (this.aClass44_Sub4_1 == null) {
			Static225.anIntArray440[5] = this.anInt4737;
			Static225.anIntArray440[1] = this.anInt4741;
			Static225.anIntArray440[3] = this.anInt4740;
			Static225.anIntArray440[4] = this.anInt4738;
			Static225.anIntArray440[0] = this.anInt4742;
			Static225.anIntArray440[2] = this.anInt4739;
			@Pc(37) Interface2 local37 = this.aClass105_Sub1_30.anInterface2_3;
			@Pc(39) boolean local39 = false;
			@Pc(41) int local41 = 0;
			@Pc(43) int local43;
			for (local43 = 0; local43 < 6; local43++) {
				if (!local37.method952(Static225.anIntArray440[local43])) {
					return null;
				}
				@Pc(67) Class116 local67 = local37.method951(Static225.anIntArray440[local43]);
				@Pc(74) int local74 = local67.aBoolean223 ? 64 : 128;
				if (local67.aByte45 > 0) {
					local39 = true;
				}
				if (local41 < local74) {
					local41 = local74;
				}
			}
			for (local43 = 0; local43 < 6; local43++) {
				Static225.anIntArrayArray38[local43] = local37.method949(local41, false, local41, Static225.anIntArray440[local43], 1.0F);
			}
			this.aClass44_Sub4_1 = new Class44_Sub4(this.aClass105_Sub1_30, 6407, local41, local39, Static225.anIntArrayArray38);
		}
		return this.aClass44_Sub4_1;
	}
}
