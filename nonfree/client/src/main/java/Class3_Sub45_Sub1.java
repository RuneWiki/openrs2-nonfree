import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public final class Class3_Sub45_Sub1 extends Class3_Sub45 {

	@OriginalMember(owner = "client!raa", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I)V")
	public Class3_Sub45_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V")
	public void method7112() {
		this.aNativeHeap5.b();
	}
}
