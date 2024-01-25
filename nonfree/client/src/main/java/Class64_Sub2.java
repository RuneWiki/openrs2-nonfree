import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class64_Sub2 extends Class64 implements Interface11 {

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	private int anInt5215;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!fd;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class64_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt5215 = arg1;
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!fd;I[BI)V")
	public Class64_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5215 = arg1;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)J")
	@Override
	public long method5183() {
		return super.aNativeBuffer4.c();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)I")
	@Override
	public int method5182() {
		return this.anInt5215;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)I")
	@Override
	public int method5181() {
		return 0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method5184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method3984(arg2, arg0);
		this.anInt5215 = arg1;
	}
}
