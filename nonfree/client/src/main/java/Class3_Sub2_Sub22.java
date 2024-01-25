import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class3_Sub2_Sub22 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lia", name = "G", descriptor = "I")
	private int anInt6193;

	@OriginalMember(owner = "client!lia", name = "M", descriptor = "I")
	private int anInt6197;

	@OriginalMember(owner = "client!lia", name = "P", descriptor = "I")
	private int anInt6200;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub22() {
		this(0);
	}

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub22(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5362(arg0);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method5362(arg0.method5604());
		}
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(II)V")
	private void method5362(@OriginalArg(1) int arg0) {
		this.anInt6197 = (arg0 & 0xFF) << 4;
		this.anInt6200 = arg0 >> 12 & 0xFF0;
		this.anInt6193 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static201.anInt3738; local37++) {
				local27[local37] = this.anInt6200;
				local31[local37] = this.anInt6193;
				local35[local37] = this.anInt6197;
			}
		}
		return local11;
	}
}
