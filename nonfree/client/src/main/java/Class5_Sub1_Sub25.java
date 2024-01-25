import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class5_Sub1_Sub25 extends Class5_Sub1 {

	@OriginalMember(owner = "client!pu", name = "O", descriptor = "I")
	private int anInt7891;

	@OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
	private int anInt7894;

	@OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
	private int anInt7899;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub25() {
		this(0);
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(I)V")
	private Class5_Sub1_Sub25(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method6783(arg0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.method6783(arg1.method8510());
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)V")
	private void method6783(@OriginalArg(0) int arg0) {
		this.anInt7894 = arg0 >> 12 & 0xFF0;
		this.anInt7899 = arg0 >> 4 & 0xFF0;
		this.anInt7891 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static648.anInt9588; local29++) {
				local19[local29] = this.anInt7894;
				local23[local29] = this.anInt7899;
				local27[local29] = this.anInt7891;
			}
		}
		return local11;
	}
}
