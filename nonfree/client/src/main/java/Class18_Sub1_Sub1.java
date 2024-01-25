import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class18_Sub1_Sub1 extends Class18_Sub1 {

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "Lclient!bc;")
	private Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_26;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
	private final int anInt3404;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
	private final int anInt3408;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	private final int anInt3407;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
	private final int anInt3405;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	private final int anInt3403;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
	private final int anInt3406;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!po;IIIIII)V")
	public Class18_Sub1_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass59_Sub1_26 = arg0;
		this.anInt3404 = arg2;
		this.anInt3408 = arg1;
		this.anInt3407 = arg4;
		this.anInt3405 = arg6;
		this.anInt3403 = arg5;
		this.anInt3406 = arg3;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)Lclient!bc;")
	@Override
	public Class11_Sub2 method5332() {
		if (this.aClass11_Sub2_1 == null) {
			@Pc(14) Interface1 local14 = this.aClass59_Sub1_26.anInterface1_5;
			Static167.anIntArray235[5] = this.anInt3405;
			Static167.anIntArray235[1] = this.anInt3404;
			Static167.anIntArray235[4] = this.anInt3403;
			Static167.anIntArray235[2] = this.anInt3406;
			Static167.anIntArray235[3] = this.anInt3407;
			Static167.anIntArray235[0] = this.anInt3408;
			@Pc(46) boolean local46 = false;
			@Pc(48) int local48 = 0;
			@Pc(50) int local50;
			for (local50 = 0; local50 < 6; local50++) {
				if (!local14.method2003(Static167.anIntArray235[local50])) {
					return null;
				}
				@Pc(71) Class84 local71 = local14.method2005(Static167.anIntArray235[local50]);
				@Pc(78) int local78 = local71.aBoolean170 ? 64 : 128;
				if (local78 > local48) {
					local48 = local78;
				}
				if (local71.aByte25 > 0) {
					local46 = true;
				}
			}
			for (local50 = 0; local50 < 6; local50++) {
				Static167.anIntArrayArray26[local50] = local14.method2007(local48, Static167.anIntArray235[local50], 1.0F, local48, false);
			}
			this.aClass11_Sub2_1 = new Class11_Sub2(this.aClass59_Sub1_26, 6407, local48, local46, Static167.anIntArrayArray26);
		}
		return this.aClass11_Sub2_1;
	}
}
