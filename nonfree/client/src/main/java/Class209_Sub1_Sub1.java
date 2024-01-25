import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class209_Sub1_Sub1 extends Class209_Sub1 {

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Lclient!hea;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
	private final int anInt5634;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	private final int anInt5638;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	private final int anInt5636;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
	private final int anInt5637;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
	private final int anInt5635;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
	private final int anInt5632;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_10;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!nv;IIIIII)V")
	public Class209_Sub1_Sub1(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5634 = arg2;
		this.anInt5638 = arg5;
		this.anInt5636 = arg6;
		this.anInt5637 = arg3;
		this.anInt5635 = arg4;
		this.anInt5632 = arg1;
		this.aClass78_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Lclient!hea;")
	@Override
	public Interface11 method4589() {
		if (this.anInterface11_1 == null) {
			Static358.anIntArray592[5] = this.anInt5636;
			Static358.anIntArray592[1] = this.anInt5634;
			@Pc(27) Interface9 local27 = this.aClass78_Sub1_10.anInterface9_13;
			Static358.anIntArray592[0] = this.anInt5632;
			Static358.anIntArray592[4] = this.anInt5638;
			Static358.anIntArray592[3] = this.anInt5635;
			Static358.anIntArray592[2] = this.anInt5637;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local27.method949(Static358.anIntArray592[local53])) {
					return null;
				}
				@Pc(71) Class17 local71 = local27.method947(Static358.anIntArray592[local53]);
				@Pc(78) int local78 = local71.aBoolean33 ? 64 : 128;
				if (local78 > local51) {
					local51 = local78;
				}
				if (local71.aByte16 > 0) {
					local49 = 1;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static39.anIntArrayArray1[local94] = local27.method948(false, Static358.anIntArray592[local94], local51, 1.0F, local51);
			}
			this.anInterface11_1 = this.aClass78_Sub1_10.method6935(local49 != 0, Static39.anIntArrayArray1, local51);
		}
		return this.anInterface11_1;
	}
}
