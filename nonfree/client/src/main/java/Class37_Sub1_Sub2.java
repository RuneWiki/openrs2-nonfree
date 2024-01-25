import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class37_Sub1_Sub2 extends Class37_Sub1 {

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Lclient!waa;")
	private Class23_Sub4 aClass23_Sub4_2;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
	private final int anInt7955;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
	private final int anInt7954;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
	private final int anInt7956;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	private final int anInt7948;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_37;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
	private final int anInt7951;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	private final int anInt7950;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!qj;IIIIII)V")
	public Class37_Sub1_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7955 = arg6;
		this.anInt7954 = arg2;
		this.anInt7956 = arg1;
		this.anInt7948 = arg5;
		this.aClass100_Sub3_37 = arg0;
		this.anInt7951 = arg3;
		this.anInt7950 = arg4;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)Lclient!waa;")
	@Override
	public Class23_Sub4 method6514() {
		if (this.aClass23_Sub4_2 == null) {
			Static229.anIntArray276[2] = this.anInt7951;
			@Pc(17) Interface5 local17 = this.aClass100_Sub3_37.anInterface5_10;
			Static229.anIntArray276[5] = this.anInt7955;
			Static229.anIntArray276[3] = this.anInt7950;
			Static229.anIntArray276[1] = this.anInt7954;
			Static229.anIntArray276[0] = this.anInt7956;
			Static229.anIntArray276[4] = this.anInt7948;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local17.method914(Static229.anIntArray276[local48])) {
					return null;
				}
				@Pc(66) Class343 local66 = local17.method917(Static229.anIntArray276[local48]);
				@Pc(73) int local73 = local66.aBoolean700 ? 64 : 128;
				if (local46 < local73) {
					local46 = local73;
				}
				if (local66.aByte116 > 0) {
					local44 = true;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static372.anIntArrayArray38[local94] = local17.method916(Static229.anIntArray276[local94], 1.0F, false, local46, local46);
			}
			this.aClass23_Sub4_2 = new Class23_Sub4(this.aClass100_Sub3_37, 6407, local46, local44, Static372.anIntArrayArray38);
		}
		return this.aClass23_Sub4_2;
	}
}
