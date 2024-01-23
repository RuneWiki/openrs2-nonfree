import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class1_Sub4_Sub25 extends Class1_Sub4 {

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			Static319.method1765(local17, 0, Static182.anInt3492, Static250.anIntArray398[arg0]);
		}
		return local17;
	}
}
