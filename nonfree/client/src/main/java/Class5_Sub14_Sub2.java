import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class5_Sub14_Sub2 extends Class5_Sub14 {

	@OriginalMember(owner = "client!pda", name = "v", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(I)V")
	public Class5_Sub14_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(Z)V")
	public void method6439() {
		this.aNativeHeap6.a();
	}
}
