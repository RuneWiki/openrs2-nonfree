import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class36_Sub26 extends Class36 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub26(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
	public int method7794() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Z")
	public boolean method7795() {
		return Static491.method7186(super.aClass8_Sub25_31.aClass36_Sub19_2.method6358());
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		return Static491.method7186(super.aClass8_Sub25_31.aClass36_Sub19_2.method6358()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.aClass8_Sub25_31.aClass36_Sub19_2.method6361() && !Static491.method7186(super.aClass8_Sub25_31.aClass36_Sub19_2.method6358())) {
			super.anInt10496 = 0;
		}
		if (super.anInt10496 < 0 || super.anInt10496 > 2) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return 0;
	}
}
