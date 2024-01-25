import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class8_Sub2_Sub28 extends Class8_Sub2 {

	@OriginalMember(owner = "client!pda", name = "H", descriptor = "I")
	private int anInt7914;

	@OriginalMember(owner = "client!pda", name = "J", descriptor = "I")
	private int anInt7916;

	@OriginalMember(owner = "client!pda", name = "O", descriptor = "I")
	private int anInt7920;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub28() {
		this(0);
	}

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(I)V")
	private Class8_Sub2_Sub28(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method6568(arg0);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static538.anInt9297; local37++) {
				local27[local37] = this.anInt7916;
				local31[local37] = this.anInt7920;
				local35[local37] = this.anInt7914;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.method6568(arg1.method8560());
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IB)V")
	private void method6568(@OriginalArg(0) int arg0) {
		this.anInt7916 = arg0 >> 12 & 0xFF0;
		this.anInt7914 = (arg0 & 0xFF) << 4;
		this.anInt7920 = arg0 >> 4 & 0xFF0;
	}
}
