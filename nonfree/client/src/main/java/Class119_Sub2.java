import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class119_Sub2 extends Class119 implements Interface27 {

	@OriginalMember(owner = "client!vaa", name = "p", descriptor = "I")
	private int anInt9842;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!eq;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class119_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9842 = arg1;
	}

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!eq;I[BIZ)V")
	public Class119_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9842 = arg1;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)J")
	@Override
	public long method8093() {
		return 0L;
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
	@Override
	protected void method8089() {
		super.aClass33_Sub3_40.method3079(this);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "([BBII)V")
	@Override
	public void method8092(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method8090(arg1, arg0);
		this.anInt9842 = arg2;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)I")
	@Override
	public int method8095() {
		return super.anInt9833;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I")
	@Override
	public int method8094() {
		return this.anInt9842;
	}
}
