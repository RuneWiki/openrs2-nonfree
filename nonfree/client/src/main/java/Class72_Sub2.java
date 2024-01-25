import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class72_Sub2 extends Class72 implements Interface9 {

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
	private int anInt4675;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!ih;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class72_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt4675 = arg1;
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!ih;I[BI)V")
	public Class72_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4675 = arg1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
	@Override
	public int method3687() {
		return 0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)I")
	@Override
	public int method3690() {
		return this.anInt4675;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method3686(arg2, arg1);
		this.anInt4675 = arg0;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)J")
	@Override
	public long method3688() {
		return super.aNativeBuffer4.b();
	}
}
