import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class12_Sub1_Sub2 extends Class12_Sub1 {

	static {
		new Class88(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			Static554.method3495(local13, 0, Static357.anInt6670, Static353.anIntArray458[arg0]);
		}
		return local13;
	}
}
