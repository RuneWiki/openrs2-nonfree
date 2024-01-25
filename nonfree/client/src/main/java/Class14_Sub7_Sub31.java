import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class14_Sub7_Sub31 extends Class14_Sub7 {

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			Static691.method81(local16, 0, Static613.anInt10114, Static655.anIntArray573[arg0]);
		}
		return local16;
	}
}
