import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class4_Sub4_Sub5 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
	private int anInt852 = 2048;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
	private int anInt846 = 3072;

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
	private int anInt853 = 1024;

	static {
		new Class15(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		this.anInt852 = this.anInt846 - this.anInt853;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(31) int[][] local31 = this.method6049(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static419.anInt6404; local57++) {
				local47[local57] = (local35[local57] * this.anInt852 >> 12) + this.anInt853;
				local51[local57] = this.anInt853 + (this.anInt852 * local39[local57] >> 12);
				local55[local57] = this.anInt853 + (this.anInt852 * local43[local57] >> 12);
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(28) int[] local28 = this.method6040(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static419.anInt6404; local30++) {
				local16[local30] = (local28[local30] * this.anInt852 >> 12) + this.anInt853;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt853 = arg1.method5028();
		} else if (arg0 == 1) {
			this.anInt846 = arg1.method5028();
		} else if (arg0 == 2) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}
}
