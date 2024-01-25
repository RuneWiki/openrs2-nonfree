import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class8_Sub1 extends Class8 implements Interface9 {

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!nq;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class8_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt167 = arg1;
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!nq;I[BIZ)V")
	public Class8_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt167 = arg1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I")
	@Override
	public int method2082() {
		return this.anInt167;
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
	@Override
	protected void method4213() {
		super.aClass167_Sub1_28.method4015(this);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I")
	@Override
	public int method2080() {
		return super.anInt5109;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)J")
	@Override
	public long method2081() {
		return 0L;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III[B)V")
	@Override
	public void method2083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method4211(arg2, arg1);
		this.anInt167 = arg0;
	}
}
