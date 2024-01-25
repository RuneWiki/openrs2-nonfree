import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class132_Sub1_Sub2 extends Class132_Sub1 {

	@OriginalMember(owner = "client!th", name = "m", descriptor = "Lclient!ds;")
	private Class56_Sub1 aClass56_Sub1_2;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	private final int anInt5978;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_39;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	private final int anInt5979;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	private final int anInt5982;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	private final int anInt5977;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	private final int anInt5981;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	private final int anInt5980;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!tb;IIIIII)V")
	public Class132_Sub1_Sub2(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5978 = arg2;
		this.aClass129_Sub2_39 = arg0;
		this.anInt5979 = arg1;
		this.anInt5982 = arg5;
		this.anInt5977 = arg3;
		this.anInt5981 = arg6;
		this.anInt5980 = arg4;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Lclient!ds;")
	@Override
	public Class56_Sub1 method5140() {
		if (this.aClass56_Sub1_2 == null) {
			Static304.anIntArray489[1] = this.anInt5978;
			Static304.anIntArray489[5] = this.anInt5981;
			Static304.anIntArray489[4] = this.anInt5982;
			Static304.anIntArray489[0] = this.anInt5979;
			Static304.anIntArray489[3] = this.anInt5980;
			@Pc(33) Interface2 local33 = this.aClass129_Sub2_39.anInterface2_7;
			Static304.anIntArray489[2] = this.anInt5977;
			@Pc(40) boolean local40 = false;
			@Pc(42) int local42 = 0;
			@Pc(44) int local44;
			for (local44 = 0; local44 < 6; local44++) {
				if (!local33.method2246(Static304.anIntArray489[local44])) {
					return null;
				}
				@Pc(63) Class134 local63 = local33.method2244(Static304.anIntArray489[local44]);
				@Pc(70) int local70 = local63.aBoolean259 ? 64 : 128;
				if (local42 < local70) {
					local42 = local70;
				}
				if (local63.aByte47 > 0) {
					local40 = true;
				}
			}
			for (local44 = 0; local44 < 6; local44++) {
				Static304.anIntArrayArray71[local44] = local33.method2243(local42, 1.0F, false, Static304.anIntArray489[local44], local42);
			}
			this.aClass56_Sub1_2 = new Class56_Sub1(this.aClass129_Sub2_39, 6407, local42, local40, Static304.anIntArrayArray71);
		}
		return this.aClass56_Sub1_2;
	}
}
