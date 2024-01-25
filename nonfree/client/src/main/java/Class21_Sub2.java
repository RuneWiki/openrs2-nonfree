import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class21_Sub2 extends Class21 implements Interface6 {

	@OriginalMember(owner = "client!s", name = "u", descriptor = "I")
	private int anInt6114;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!vj;I[BIZ)V")
	public Class21_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6114 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!vj;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class21_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6114 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
	@Override
	protected void method4764() {
		super.aClass172_Sub2_33.method5615(this);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4768(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4763(arg0, arg1);
		this.anInt6114 = arg2;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)I")
	@Override
	public int method4765() {
		return super.anInt6099;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)J")
	@Override
	public long method4766() {
		return 0L;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)I")
	@Override
	public int method4767() {
		return this.anInt6114;
	}
}
