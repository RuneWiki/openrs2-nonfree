import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class124_Sub1_Sub2 extends Class124_Sub1 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "Lclient!nm;")
	private Class79_Sub4 aClass79_Sub4_2;

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
	private final int anInt7996;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
	private final int anInt7993;

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
	private final int anInt7991;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
	private final int anInt7986;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
	private final int anInt7989;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_34;

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
	private final int anInt7988;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!gi;IIIIII)V")
	public Class124_Sub1_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7996 = arg6;
		this.anInt7993 = arg4;
		this.anInt7991 = arg3;
		this.anInt7986 = arg1;
		this.anInt7989 = arg2;
		this.aClass42_Sub3_34 = arg0;
		this.anInt7988 = arg5;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Lclient!nm;")
	@Override
	public Class79_Sub4 method6602() {
		if (this.aClass79_Sub4_2 == null) {
			Static78.anIntArray182[1] = this.anInt7989;
			Static78.anIntArray182[4] = this.anInt7988;
			Static78.anIntArray182[2] = this.anInt7991;
			Static78.anIntArray182[5] = this.anInt7996;
			Static78.anIntArray182[0] = this.anInt7986;
			@Pc(37) Interface11 local37 = this.aClass42_Sub3_34.anInterface11_11;
			Static78.anIntArray182[3] = this.anInt7993;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local37.method6213(Static78.anIntArray182[local48])) {
					return null;
				}
				@Pc(66) Class278 local66 = local37.method6215(Static78.anIntArray182[local48]);
				@Pc(73) int local73 = local66.aBoolean567 ? 64 : 128;
				if (local66.aByte86 > 0) {
					local44 = 1;
				}
				if (local46 < local73) {
					local46 = local73;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static24.anIntArrayArray1[local98] = local37.method6211(false, Static78.anIntArray182[local98], local46, local46, 1.0F);
			}
			this.aClass79_Sub4_2 = new Class79_Sub4(this.aClass42_Sub3_34, 6407, local46, local44 != 0, Static24.anIntArrayArray1);
		}
		return this.aClass79_Sub4_2;
	}
}
