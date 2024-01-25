import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class3_Sub8_Sub2 extends Class3_Sub8 {

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
	public void method4277() {
		this.aNativeHeap5.a();
	}
}
