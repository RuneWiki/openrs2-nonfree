import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class205_Sub1_Sub2 extends Class205_Sub1 {

	@OriginalMember(owner = "client!oia", name = "n", descriptor = "Lclient!dm;")
	private Class76_Sub1 aClass76_Sub1_2;

	@OriginalMember(owner = "client!oia", name = "l", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_31;

	@OriginalMember(owner = "client!oia", name = "g", descriptor = "I")
	private final int anInt7439;

	@OriginalMember(owner = "client!oia", name = "u", descriptor = "I")
	private final int anInt7449;

	@OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
	private final int anInt7441;

	@OriginalMember(owner = "client!oia", name = "r", descriptor = "I")
	private final int anInt7446;

	@OriginalMember(owner = "client!oia", name = "p", descriptor = "I")
	private final int anInt7444;

	@OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
	private final int anInt7443;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!kw;IIIIII)V")
	public Class205_Sub1_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass5_Sub2_31 = arg0;
		this.anInt7439 = arg2;
		this.anInt7449 = arg3;
		this.anInt7441 = arg1;
		this.anInt7446 = arg6;
		this.anInt7444 = arg5;
		this.anInt7443 = arg4;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)Lclient!dm;")
	@Override
	public Class76_Sub1 method6466() {
		if (this.aClass76_Sub1_2 == null) {
			Static584.anIntArray614[3] = this.anInt7443;
			Static584.anIntArray614[4] = this.anInt7444;
			Static584.anIntArray614[0] = this.anInt7441;
			Static584.anIntArray614[5] = this.anInt7446;
			Static584.anIntArray614[2] = this.anInt7449;
			Static584.anIntArray614[1] = this.anInt7439;
			@Pc(50) Interface7 local50 = this.aClass5_Sub2_31.anInterface7_15;
			@Pc(52) boolean local52 = false;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local50.method8115(Static584.anIntArray614[local56])) {
					return null;
				}
				@Pc(74) Class195 local74 = local50.method8118(Static584.anIntArray614[local56]);
				@Pc(81) int local81 = local74.aBoolean364 ? 64 : 128;
				if (local54 < local81) {
					local54 = local81;
				}
				if (local74.aByte78 > 0) {
					local52 = true;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static329.anIntArrayArray42[local102] = local50.method8116(false, local54, Static584.anIntArray614[local102], local54, 1.0F);
			}
			this.aClass76_Sub1_2 = new Class76_Sub1(this.aClass5_Sub2_31, 6407, local54, local52, Static329.anIntArrayArray42);
		}
		return this.aClass76_Sub1_2;
	}
}
