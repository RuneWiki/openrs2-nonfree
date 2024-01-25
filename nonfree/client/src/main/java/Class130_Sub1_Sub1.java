import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class130_Sub1_Sub1 extends Class130_Sub1 {

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "Lclient!qn;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
	private final int anInt10193;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
	private final int anInt10188;

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "I")
	private final int anInt10194;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
	private final int anInt10189;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
	private final int anInt10187;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_21;

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
	private final int anInt10192;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!pj;IIIIII)V")
	public Class130_Sub1_Sub1(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt10193 = arg6;
		this.anInt10188 = arg5;
		this.anInt10194 = arg4;
		this.anInt10189 = arg2;
		this.anInt10187 = arg3;
		this.aClass133_Sub1_21 = arg0;
		this.anInt10192 = arg1;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Lclient!qn;")
	@Override
	public Interface18 method8679() {
		if (this.anInterface18_1 == null) {
			Static424.anIntArray393[0] = this.anInt10192;
			@Pc(23) Interface3 local23 = this.aClass133_Sub1_21.anInterface3_12;
			Static424.anIntArray393[2] = this.anInt10187;
			Static424.anIntArray393[3] = this.anInt10194;
			Static424.anIntArray393[5] = this.anInt10193;
			Static424.anIntArray393[1] = this.anInt10189;
			Static424.anIntArray393[4] = this.anInt10188;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local23.method4654(Static424.anIntArray393[local54])) {
					return null;
				}
				@Pc(74) Class145 local74 = local23.method4656(Static424.anIntArray393[local54]);
				@Pc(81) int local81 = local74.aBoolean293 ? 64 : 128;
				if (local81 > local52) {
					local52 = local81;
				}
				if (local74.aByte63 > 0) {
					local50 = true;
				}
			}
			for (@Pc(104) int local104 = 0; local104 < 6; local104++) {
				Static193.anIntArrayArray55[local104] = local23.method4653(1.0F, local52, Static424.anIntArray393[local104], local52, false);
			}
			this.anInterface18_1 = this.aClass133_Sub1_21.method6237(Static193.anIntArrayArray55, local52, local50);
		}
		return this.anInterface18_1;
	}
}
