import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class33_Sub4 extends Class33 {

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub4(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = super.aClass2_Sub49_31.method8846().method2968();
		if (local15 < 96) {
			return 3;
		} else if (arg0 > 1 && local15 < 128) {
			return 3;
		} else if (arg0 > 3 && local15 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return 0;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
	public boolean method1933() {
		@Pc(18) int local18 = super.aClass2_Sub49_31.method8846().method2968();
		return local18 >= 96;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		@Pc(10) int local10 = super.aClass2_Sub49_31.method8846().method2968();
		if (local10 < 96) {
			super.anInt10227 = 0;
		}
		if (super.anInt10227 > 1 && local10 < 128) {
			super.anInt10227 = 1;
		}
		if (super.anInt10227 > 2 && local10 < 192) {
			super.anInt10227 = 2;
		}
		if (super.anInt10227 < 0 || super.anInt10227 > 3) {
			super.anInt10227 = this.method8709();
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)I")
	public int method1937() {
		return super.anInt10227;
	}
}
