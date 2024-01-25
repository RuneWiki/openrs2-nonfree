import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class170_Sub1 extends Class170 implements Interface5 {

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	private int anInt5068;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!gk;I[BIZ)V")
	public Class170_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5068 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!gk;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class170_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5068 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method4784(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5468(arg1, arg2);
		this.anInt5068 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I")
	@Override
	public int method4783() {
		return this.anInt5068;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	@Override
	protected void method5466() {
		super.aClass75_Sub2_42.method2443(this);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)J")
	@Override
	public long method4785() {
		return 0L;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)I")
	@Override
	public int method4786() {
		return super.anInt7039;
	}
}
