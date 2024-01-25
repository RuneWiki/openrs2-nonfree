import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public final class Class6_Sub8_Sub2 extends Class6_Sub8 {

	@OriginalMember(owner = "client!qia", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(I)V")
	public Class6_Sub8_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(Z)V")
	public void method7071() {
		this.aNativeHeap5.a();
	}
}
