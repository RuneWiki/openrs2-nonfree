import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!b", name = "I", descriptor = "I")
	public int anInt229 = -1;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "I")
	public int anInt226 = 0;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "Z")
	public boolean aBoolean10 = true;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "I")
	public int anInt230 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ce;III)V")
	private void method207(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt226 = Static129.method2010(arg0.method3072());
		} else if (arg1 == 2) {
			this.anInt229 = arg0.method3062();
		} else if (arg1 == 3) {
			this.anInt229 = arg0.method3077();
			if (this.anInt229 == 65535) {
				this.anInt229 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean10 = false;
		} else if (arg1 == 7) {
			this.anInt230 = Static129.method2010(arg0.method3072());
		} else if (arg1 == 8) {
			Static37.anInt1356 = arg2;
		} else if (arg1 == 9) {
			arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ce;I)V")
	public void method209(@OriginalArg(1) Class5_Sub6 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3062();
			if (local5 == 0) {
				return;
			}
			this.method207(arg0, local5, arg1);
		}
	}
}
