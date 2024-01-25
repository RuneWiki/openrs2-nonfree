import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class5_Sub1_Sub16 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private int anInt3851;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	private int anInt3852;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	private int anInt3853;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub16() {
		this(0);
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
	private Class5_Sub1_Sub16(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3318(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static147.anInt3075; local29++) {
				local19[local29] = this.anInt3852;
				local23[local29] = this.anInt3853;
				local27[local29] = this.anInt3851;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V")
	private void method3318(@OriginalArg(1) int arg0) {
		this.anInt3853 = arg0 >> 4 & 0xFF0;
		this.anInt3852 = arg0 >> 12 & 0xFF0;
		this.anInt3851 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.method3318(arg1.method4182());
		}
	}
}
