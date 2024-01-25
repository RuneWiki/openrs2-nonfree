import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class31_Sub1 extends Class31 implements Interface12 {

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
	private int anInt5155;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!qg;I[BIZ)V")
	public Class31_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5155 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!qg;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class31_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5155 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)J")
	@Override
	public long method5233() {
		return 0L;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
	@Override
	protected void method5940() {
		super.aClass121_Sub2_43.method4683(this);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5235(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method5939(arg0, arg1);
		this.anInt5155 = arg2;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)I")
	@Override
	public int method5236() {
		return super.anInt7709;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I")
	@Override
	public int method5234() {
		return this.anInt5155;
	}
}
