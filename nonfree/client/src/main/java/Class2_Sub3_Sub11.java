import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fs", name = "K", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!fs", name = "J", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(26) int[][] local26 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(44) int[][] local44 = this.method5707(this.aBoolean205 ? Static241.anInt5135 - arg0 : arg0, 0);
			@Pc(48) int[] local48 = local44[0];
			@Pc(52) int[] local52 = local44[1];
			@Pc(56) int[] local56 = local44[2];
			@Pc(60) int[] local60 = local26[0];
			@Pc(64) int[] local64 = local26[1];
			@Pc(68) int[] local68 = local26[2];
			@Pc(73) int local73;
			if (this.aBoolean206) {
				for (local73 = 0; local73 < Static263.anInt5504; local73++) {
					local60[local73] = local48[Static171.anInt3863 - local73];
					local64[local73] = local52[Static171.anInt3863 - local73];
					local68[local73] = local56[Static171.anInt3863 - local73];
				}
			} else {
				for (local73 = 0; local73 < Static263.anInt5504; local73++) {
					local60[local73] = local48[local73];
					local64[local73] = local52[local73];
					local68[local73] = local56[local73];
				}
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.aBoolean206 = arg1.method3124() == 1;
		} else if (arg0 == 1) {
			this.aBoolean205 = arg1.method3124() == 1;
		} else if (arg0 == 2) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(22) int[] local22 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(42) int[] local42 = this.method5700(0, this.aBoolean205 ? Static241.anInt5135 - arg0 : arg0);
			if (this.aBoolean206) {
				for (@Pc(55) int local55 = 0; local55 < Static263.anInt5504; local55++) {
					local22[local55] = local42[Static171.anInt3863 - local55];
				}
			} else {
				Static369.method2579(local42, 0, local22, 0, Static263.anInt5504);
			}
		}
		return local22;
	}
}
