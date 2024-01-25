import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class28_Sub1 extends Class28 implements Interface12 {

	@OriginalMember(owner = "client!so", name = "l", descriptor = "I")
	private int anInt6687;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!qg;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class28_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt6687 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!qg;I[BI)V")
	public Class28_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6687 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I")
	@Override
	public int method5234() {
		return this.anInt6687;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5235(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method5806(arg0, arg1);
		this.anInt6687 = arg2;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)J")
	@Override
	public long method5233() {
		return super.aNativeBuffer4.b();
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)I")
	@Override
	public int method5236() {
		return 0;
	}
}
