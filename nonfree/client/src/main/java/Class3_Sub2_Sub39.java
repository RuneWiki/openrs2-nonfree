import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class3_Sub2_Sub39 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wfa", name = "E", descriptor = "I")
	private int anInt11038;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub39() {
		this(4096);
	}

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub39(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt11038 = 4096;
		this.anInt11038 = arg0;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			Static735.method9184(local9, 0, Static636.anInt10302, this.anInt11038);
		}
		return local9;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt11038 = (arg1.method5322(-69) << 12) / 255;
		}
	}
}
