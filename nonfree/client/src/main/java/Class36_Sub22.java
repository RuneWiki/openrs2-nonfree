import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class36_Sub22 extends Class36 {

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub22(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I")
	public int method7243() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return super.aClass8_Sub25_31.method3471() ? 1 : 0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		super.anInt10496 = this.method8464();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		return 3;
	}
}
