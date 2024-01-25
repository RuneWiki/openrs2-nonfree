import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub5(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (super.anInt11012 < 0 && super.anInt11012 > 127) {
			super.anInt11012 = this.method9617();
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return 127;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)I")
	public int method1696(@OriginalArg(0) int arg0) {
		return arg0 == 1 ? super.anInt11012 : -85;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}
}
