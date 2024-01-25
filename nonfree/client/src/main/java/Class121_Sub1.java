import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class121_Sub1 extends Class121 implements Interface6 {

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
	private int anInt3802;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!vj;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class121_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt3802 = arg1;
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!vj;I[BI)V")
	public Class121_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3802 = arg1;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)I")
	@Override
	public int method4767() {
		return this.anInt3802;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)J")
	@Override
	public long method4766() {
		return super.aNativeBuffer4.c();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4768(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method5069(arg0, arg1);
		this.anInt3802 = arg2;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)I")
	@Override
	public int method4765() {
		return 0;
	}
}
