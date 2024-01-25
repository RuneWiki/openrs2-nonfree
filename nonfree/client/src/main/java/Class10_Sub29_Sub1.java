import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class10_Sub29_Sub1 extends Class10_Sub29 {

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
	public Class10_Sub29_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	public void method5399() {
		this.aNativeHeap2.a();
	}
}
