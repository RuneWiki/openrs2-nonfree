import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub1(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)Z")
	public boolean method1348() {
		if (super.aClass8_Sub25_31.method3471()) {
			return false;
		} else {
			return super.aClass8_Sub25_31.method3467() == Static207.aClass217_3;
		}
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)I")
	public int method1349() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.aClass8_Sub25_31.method3467() != Static207.aClass217_3) {
			super.anInt10496 = 1;
		} else if (super.aClass8_Sub25_31.method3471()) {
			super.anInt10496 = 0;
		}
		if (super.anInt10496 != 0 && super.anInt10496 != 1) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		if (super.aClass8_Sub25_31.method3471()) {
			return 3;
		} else if (super.aClass8_Sub25_31.method3467() == Static207.aClass217_3) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return 1;
	}
}
