import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class2_Sub3_Sub34 extends Class2_Sub3 {

	@OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
	private int anInt6487 = 0;

	@OriginalMember(owner = "client!uo", name = "R", descriptor = "I")
	private int anInt6488 = 4096;

	static {
		new Class140("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6487 = arg1.method3104();
		} else if (arg0 == 1) {
			this.anInt6488 = arg1.method3104();
		} else if (arg0 == 2) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(26) int[][] local26 = this.method5707(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static263.anInt5504; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt6487) {
					local42[local52] = this.anInt6487;
				} else if (this.anInt6488 >= local58) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt6488;
				}
				if (local62 < this.anInt6487) {
					local46[local52] = this.anInt6487;
				} else if (this.anInt6488 < local62) {
					local46[local52] = this.anInt6488;
				} else {
					local46[local52] = local62;
				}
				if (local66 < this.anInt6487) {
					local50[local52] = this.anInt6487;
				} else if (local66 > this.anInt6488) {
					local50[local52] = this.anInt6488;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(25) int[] local25 = this.method5700(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static263.anInt5504; local27++) {
				@Pc(33) int local33 = local25[local27];
				if (local33 < this.anInt6487) {
					local13[local27] = this.anInt6487;
				} else if (this.anInt6488 < local33) {
					local13[local27] = this.anInt6488;
				} else {
					local13[local27] = local33;
				}
			}
		}
		return local13;
	}
}
