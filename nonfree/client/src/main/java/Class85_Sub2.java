import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class85_Sub2 extends Class85 implements Interface5 {

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
	private int anInt6001;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!gk;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class85_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt6001 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!gk;I[BI)V")
	public Class85_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6001 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
	@Override
	public int method4786() {
		return 0;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)J")
	@Override
	public long method4785() {
		return super.aNativeBuffer3.a();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method4784(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4782(arg1, arg2);
		this.anInt6001 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
	@Override
	public int method4783() {
		return this.anInt6001;
	}
}
