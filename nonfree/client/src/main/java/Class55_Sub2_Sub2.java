import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class55_Sub2_Sub2 extends Class55_Sub2 {

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "Lclient!mda;")
	private Class34_Sub4 aClass34_Sub4_2;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
	private final int anInt8252;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
	private final int anInt8250;

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
	private final int anInt8255;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
	private final int anInt8251;

	@OriginalMember(owner = "client!tv", name = "x", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_40;

	@OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
	private final int anInt8258;

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
	private final int anInt8256;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!us;IIIIII)V")
	public Class55_Sub2_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8252 = arg1;
		this.anInt8250 = arg2;
		this.anInt8255 = arg6;
		this.anInt8251 = arg4;
		this.aClass43_Sub3_40 = arg0;
		this.anInt8258 = arg5;
		this.anInt8256 = arg3;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)Lclient!mda;")
	@Override
	public Class34_Sub4 method6930() {
		if (this.aClass34_Sub4_2 == null) {
			Static21.anIntArray51[2] = this.anInt8256;
			Static21.anIntArray51[4] = this.anInt8258;
			@Pc(27) Interface8 local27 = this.aClass43_Sub3_40.anInterface8_12;
			Static21.anIntArray51[3] = this.anInt8251;
			Static21.anIntArray51[1] = this.anInt8250;
			Static21.anIntArray51[0] = this.anInt8252;
			Static21.anIntArray51[5] = this.anInt8255;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local27.method6559(Static21.anIntArray51[local53])) {
					return null;
				}
				@Pc(73) Class224 local73 = local27.method6560(Static21.anIntArray51[local53]);
				@Pc(80) int local80 = local73.aBoolean490 ? 64 : 128;
				if (local73.aByte72 > 0) {
					local49 = true;
				}
				if (local51 < local80) {
					local51 = local80;
				}
			}
			for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
				Static12.anIntArrayArray1[local100] = local27.method6555(Static21.anIntArray51[local100], false, 1.0F, local51, local51);
			}
			this.aClass34_Sub4_2 = new Class34_Sub4(this.aClass43_Sub3_40, 6407, local51, local49, Static12.anIntArrayArray1);
		}
		return this.aClass34_Sub4_2;
	}
}
