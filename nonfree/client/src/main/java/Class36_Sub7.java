import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class36_Sub7 extends Class36 {

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub7(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return 0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		@Pc(10) int local10 = super.aClass8_Sub25_31.method3469().method4884();
		if (local10 < 96) {
			super.anInt10496 = 0;
		}
		if (super.anInt10496 > 1 && local10 < 128) {
			super.anInt10496 = 1;
		}
		if (super.anInt10496 > 2 && local10 < 192) {
			super.anInt10496 = 2;
		}
		if (super.anInt10496 < 0 || super.anInt10496 > 3) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass8_Sub25_31.method3469().method4884();
		if (local10 < 96) {
			return 3;
		} else if (arg0 > 1 && local10 < 128) {
			return 3;
		} else if (arg0 > 3 && local10 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)Z")
	public boolean method3619() {
		@Pc(15) int local15 = super.aClass8_Sub25_31.method3469().method4884();
		return local15 >= 96;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)I")
	public int method3620() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}
}
