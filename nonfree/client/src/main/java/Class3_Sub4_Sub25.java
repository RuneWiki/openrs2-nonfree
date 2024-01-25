import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class3_Sub4_Sub25 extends Class3_Sub4 {

	@OriginalMember(owner = "client!om", name = "K", descriptor = "I")
	private int anInt5316 = 3072;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "I")
	private int anInt5318 = 2048;

	@OriginalMember(owner = "client!om", name = "U", descriptor = "I")
	private int anInt5324 = 1024;

	static {
		new Class175(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(21) int[] local21 = this.method5960(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static106.anInt2356; local23++) {
				local11[local23] = (this.anInt5318 * local21[local23] >> 12) + this.anInt5324;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		this.anInt5318 = this.anInt5316 - this.anInt5324;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt5324 = arg1.method6004();
		} else if (arg0 == 1) {
			this.anInt5316 = arg1.method6004();
		} else if (arg0 == 2) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(21) int[][] local21 = this.method5962(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static106.anInt2356; local47++) {
				local37[local47] = (local25[local47] * this.anInt5318 >> 12) + this.anInt5324;
				local41[local47] = this.anInt5324 + (this.anInt5318 * local29[local47] >> 12);
				local45[local47] = this.anInt5324 + (local33[local47] * this.anInt5318 >> 12);
			}
		}
		return local11;
	}
}
