import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class5_Sub6_Sub32 extends Class5_Sub6 {

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
	private int anInt7986 = 2048;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
	private int anInt7987 = 1024;

	@OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
	private int anInt7991 = 3072;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		this.anInt7986 = this.anInt7991 - this.anInt7987;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(26) int[] local26 = this.method8117(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static421.anInt7443; local28++) {
				local11[local28] = this.anInt7987 + (local26[local28] * this.anInt7986 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(29) int[][] local29 = this.method8116(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static421.anInt7443; local55++) {
				local45[local55] = (local33[local55] * this.anInt7986 >> 12) + this.anInt7987;
				local49[local55] = (local37[local55] * this.anInt7986 >> 12) + this.anInt7987;
				local53[local55] = this.anInt7987 + (local41[local55] * this.anInt7986 >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7987 = arg0.method3698();
		} else if (arg1 == 1) {
			this.anInt7991 = arg0.method3698();
		} else if (arg1 == 2) {
			super.aBoolean718 = arg0.method3642() == 1;
		}
	}
}
