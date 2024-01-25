import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class143 {

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
	public int anInt4307 = 2;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "Z")
	public boolean aBoolean322 = false;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "Z")
	public boolean aBoolean323 = false;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
	public int anInt4308 = 1;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
	public int anInt4306 = -1;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
	public int anInt4312 = 64;

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
	public int anInt4311 = 64;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILclient!jp;I)V")
	private void method3919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub25 arg2) {
		if (arg1 == 1) {
			this.anInt4306 = arg2.method8593();
			if (this.anInt4306 == 65535) {
				this.anInt4306 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt4311 = arg2.method8593() + 1;
			this.anInt4312 = arg2.method8593() + 1;
		} else if (arg1 == 3) {
			arg2.method8621();
		} else if (arg1 == 4) {
			this.anInt4307 = arg2.method8632();
		} else if (arg1 == 5) {
			this.anInt4308 = arg2.method8632();
		} else if (arg1 == 6) {
			this.aBoolean322 = true;
		} else if (arg1 == 7) {
			this.aBoolean323 = true;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!jp;I)V")
	public void method3920(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method8632();
			if (local9 == 0) {
				return;
			}
			this.method3919(arg1, local9, arg0);
		}
	}
}
