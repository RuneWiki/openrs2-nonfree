import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class36_Sub16 extends Class36 {

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub16(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)I")
	public int method5358() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.aClass8_Sub25_31.method3467() == Static281.aClass217_4) {
			super.anInt10496 = 2;
		}
		if (super.anInt10496 < 0 || super.anInt10496 > 2) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return 1;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		return 1;
	}
}
