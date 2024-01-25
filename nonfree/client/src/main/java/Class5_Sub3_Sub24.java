import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class5_Sub3_Sub24 extends Class5_Sub3 {

	@OriginalMember(owner = "client!q", name = "R", descriptor = "I")
	private int anInt7660;

	@OriginalMember(owner = "client!q", name = "P", descriptor = "I")
	private int anInt7661;

	@OriginalMember(owner = "client!q", name = "H", descriptor = "I")
	private int anInt7664;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub24() {
		this(0);
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V")
	private Class5_Sub3_Sub24(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method6670(arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method6670(arg0.method7331());
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static7.anInt102; local37++) {
				local27[local37] = this.anInt7660;
				local31[local37] = this.anInt7661;
				local35[local37] = this.anInt7664;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(II)V")
	private void method6670(@OriginalArg(1) int arg0) {
		this.anInt7661 = arg0 >> 4 & 0xFF0;
		this.anInt7660 = arg0 >> 12 & 0xFF0;
		this.anInt7664 = (arg0 & 0xFF) << 4;
	}
}
