import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	public int anInt6591;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!nk;")
	protected Class144 aClass144_41;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "Lclient!le;")
	protected Class122 aClass122_41;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
	public boolean aBoolean647;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "[Lclient!sb;")
	public final Class1_Sub3[] aClass1_Sub3Array42;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean647 = arg1;
		this.aClass1_Sub3Array42 = new Class1_Sub3[arg0];
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
	public int method5524() {
		return -1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!bg;)V")
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)I")
	public int method5527() {
		return -1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)[[I")
	protected final int[][] method5528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub3Array42[arg1].aBoolean647) {
			@Pc(30) int[] local30 = this.aClass1_Sub3Array42[arg1].method5529(arg0);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub3Array42[arg1].method5538(arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[I")
	public int[] method5529(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)V")
	public void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt6591 == 255 ? arg1 : this.anInt6591;
		if (this.aBoolean647) {
			this.aClass122_41 = new Class122(local12, arg1, arg0);
		} else {
			this.aClass144_41 = new Class144(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(III)[I")
	protected final int[] method5532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub3Array42[arg0].aBoolean647 ? this.aClass1_Sub3Array42[arg0].method5529(arg1) : this.aClass1_Sub3Array42[arg0].method5538(arg1)[0];
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
	public void method5535() {
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
	public void method5536() {
		if (this.aBoolean647) {
			this.aClass122_41.method3386();
			this.aClass122_41 = null;
		} else {
			this.aClass144_41.method3950();
			this.aClass144_41 = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[[I")
	public int[][] method5538(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
