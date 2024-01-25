import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class53_Sub2 extends Class53 implements Interface12 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	private int anInt3209;

	static {
		new Class256("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!bo;I[BI)V")
	public Class53_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3209 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!bo;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class53_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt3209 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method3160(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2597(arg0, arg2);
		this.anInt3209 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)J")
	@Override
	public long method3157() {
		return super.aNativeBuffer3.a();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I")
	@Override
	public int method3159() {
		return 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I")
	@Override
	public int method3158() {
		return this.anInt3209;
	}
}
