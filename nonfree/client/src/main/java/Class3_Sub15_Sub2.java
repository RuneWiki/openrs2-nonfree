import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class3_Sub15_Sub2 extends Class3_Sub15 {

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V")
	public Class3_Sub15_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method6609() {
		this.aNativeHeap5.a();
	}
}
