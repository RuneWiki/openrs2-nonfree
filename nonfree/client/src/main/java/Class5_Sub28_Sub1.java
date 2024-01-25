import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class5_Sub28_Sub1 extends Class5_Sub28 {

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class5_Sub28_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
	public void method3667() {
		this.aNativeHeap1.b();
	}
}
