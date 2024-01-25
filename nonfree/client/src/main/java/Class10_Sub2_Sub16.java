import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class10_Sub2_Sub16 extends Class10_Sub2 {

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
	private int anInt3200 = 4096;

	@OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
	private int anInt3202 = 4096;

	@OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
	private int anInt3205 = 4096;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(28) int[][] local28 = this.method6045(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static121.anInt2458; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local60 == local64 && local64 == local68) {
					local44[local54] = local60 * this.anInt3202 >> 12;
					local48[local54] = local64 * this.anInt3205 >> 12;
					local52[local54] = local68 * this.anInt3200 >> 12;
				} else {
					local44[local54] = this.anInt3202;
					local48[local54] = this.anInt3205;
					local52[local54] = this.anInt3200;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3202 = arg1.method2485();
		} else if (arg0 == 1) {
			this.anInt3205 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt3200 = arg1.method2485();
		}
	}
}
