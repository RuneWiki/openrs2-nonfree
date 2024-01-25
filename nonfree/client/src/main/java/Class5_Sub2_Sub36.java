import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class5_Sub2_Sub36 extends Class5_Sub2 {

	@OriginalMember(owner = "client!up", name = "K", descriptor = "I")
	private int anInt6139;

	@OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
	private int anInt6144;

	@OriginalMember(owner = "client!up", name = "U", descriptor = "I")
	private int anInt6148;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub36() {
		this(0);
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(I)V")
	private Class5_Sub2_Sub36(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5462(arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static15.anInt493; local37++) {
				local27[local37] = this.anInt6139;
				local31[local37] = this.anInt6148;
				local35[local37] = this.anInt6144;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method5462(arg0.method1843());
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(II)V")
	private void method5462(@OriginalArg(1) int arg0) {
		this.anInt6139 = arg0 >> 12 & 0xFF0;
		this.anInt6148 = arg0 >> 4 & 0xFF0;
		this.anInt6144 = (arg0 & 0xFF) << 4;
	}
}
