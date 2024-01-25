import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!paa", name = "v", descriptor = "Lclient!wg;")
	private Class16_Sub4 aClass16_Sub4_2;

	@OriginalMember(owner = "client!paa", name = "u", descriptor = "I")
	private final int anInt7088;

	@OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
	private final int anInt7089;

	@OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
	private final int anInt7086;

	@OriginalMember(owner = "client!paa", name = "t", descriptor = "I")
	private final int anInt7087;

	@OriginalMember(owner = "client!paa", name = "o", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_34;

	@OriginalMember(owner = "client!paa", name = "x", descriptor = "I")
	private final int anInt7090;

	@OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
	private final int anInt7084;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!en;IIIIII)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7088 = arg6;
		this.anInt7089 = arg5;
		this.anInt7086 = arg1;
		this.anInt7087 = arg4;
		this.aClass90_Sub1_34 = arg0;
		this.anInt7090 = arg3;
		this.anInt7084 = arg2;
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(B)Lclient!wg;")
	@Override
	public Class16_Sub4 method5662() {
		if (this.aClass16_Sub4_2 == null) {
			Static29.anIntArray657[5] = this.anInt7088;
			Static29.anIntArray657[3] = this.anInt7087;
			Static29.anIntArray657[1] = this.anInt7084;
			Static29.anIntArray657[2] = this.anInt7090;
			@Pc(37) Interface2 local37 = this.aClass90_Sub1_34.anInterface2_15;
			Static29.anIntArray657[4] = this.anInt7089;
			Static29.anIntArray657[0] = this.anInt7086;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local37.method3089(Static29.anIntArray657[local53])) {
					return null;
				}
				@Pc(71) Class115 local71 = local37.method3085(Static29.anIntArray657[local53]);
				@Pc(78) int local78 = local71.aBoolean233 ? 64 : 128;
				if (local78 > local51) {
					local51 = local78;
				}
				if (local71.aByte37 > 0) {
					local49 = 1;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static514.anIntArrayArray75[local99] = local37.method3088(Static29.anIntArray657[local99], local51, 1.0F, local51, false);
			}
			this.aClass16_Sub4_2 = new Class16_Sub4(this.aClass90_Sub1_34, 6407, local51, local49 != 0, Static514.anIntArrayArray75);
		}
		return this.aClass16_Sub4_2;
	}
}
