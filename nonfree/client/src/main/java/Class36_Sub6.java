import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class36_Sub6 extends Class36 {

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub6(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return 127;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)I")
	public int method3331() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.anInt10496 < 0 && super.anInt10496 > 127) {
			super.anInt10496 = this.method8464();
		}
	}
}
