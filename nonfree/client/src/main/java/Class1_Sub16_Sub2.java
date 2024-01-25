import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public final class Class1_Sub16_Sub2 extends Class1_Sub16 {

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
	public void method6471() {
		this.aNativeHeap5.a();
	}
}
