import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!eea", name = "z", descriptor = "Z")
	private boolean aBoolean247 = true;

	@OriginalMember(owner = "client!eea", name = "C", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub5(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		if (super.aClass2_Sub13_31.method2606().method7488()) {
			return arg0 == 3 && !Static300.method2216("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(ZI)V")
	public void method2942(@OriginalArg(0) boolean arg0) {
		this.aBoolean247 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		this.aBoolean248 = true;
		return super.aClass2_Sub13_31.method2606().method7488() ? 2 : 0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
		if (!super.aClass2_Sub13_31.method2606().method7488()) {
			super.anInt10835 = 0;
		}
		if (super.anInt10835 < 0 || super.anInt10835 > 5) {
			super.anInt10835 = this.method9029();
		}
	}

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "(I)I")
	public int method2945() {
		return super.anInt10835;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)Z")
	public boolean method2946() {
		return this.aBoolean247;
	}

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "(I)Z")
	public boolean method2947() {
		return super.aClass2_Sub13_31.method2606().method7488();
	}
}
