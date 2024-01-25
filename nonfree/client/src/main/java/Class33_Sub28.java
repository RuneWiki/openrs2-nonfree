import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class33_Sub28 extends Class33 {

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Z")
	private boolean aBoolean736 = true;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Z")
	public boolean aBoolean735 = false;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub28(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		if (!super.aClass2_Sub49_31.method8846().method2965()) {
			super.anInt10227 = 0;
		}
		if (super.anInt10227 < 0 || super.anInt10227 > 5) {
			super.anInt10227 = this.method8709();
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Z")
	public boolean method8684() {
		return super.aClass2_Sub49_31.method8846().method2965();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Z")
	public boolean method8685() {
		return this.aBoolean736;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)V")
	public void method8686(@OriginalArg(1) boolean arg0) {
		this.aBoolean736 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		this.aBoolean735 = true;
		return super.aClass2_Sub49_31.method8846().method2965() ? 2 : 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
	public int method8687() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		if (super.aClass2_Sub49_31.method8846().method2965()) {
			return arg0 == 3 && !Static179.method3069("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		this.aBoolean735 = false;
		super.anInt10227 = arg0;
	}
}
