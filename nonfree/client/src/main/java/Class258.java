import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class258 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	public int anInt6708 = -1;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
	public int anInt6711 = 64;

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
	public int anInt6712 = 64;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Z")
	public boolean aBoolean473 = false;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
	public int anInt6713 = 1;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Z")
	public boolean aBoolean472 = false;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
	public int anInt6709 = 2;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!dt;I)V")
	public void method5628(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		while (true) {
			@Pc(10) int local10 = arg1.method7954();
			if (local10 == 0) {
				return;
			}
			this.method5633(local10, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!dt;IB)V")
	private void method5633(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt6708 = arg1.method7951();
			if (this.anInt6708 == 65535) {
				this.anInt6708 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt6712 = arg1.method7951() + 1;
			this.anInt6711 = arg1.method7951() + 1;
		} else if (arg0 == 3) {
			arg1.method7960();
		} else if (arg0 == 4) {
			this.anInt6709 = arg1.method7954();
		} else if (arg0 == 5) {
			this.anInt6713 = arg1.method7954();
		} else if (arg0 == 6) {
			this.aBoolean473 = true;
		} else if (arg0 == 7) {
			this.aBoolean472 = true;
		}
	}
}
