import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public abstract class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "Lclient!uia;")
	protected Class370 aClass370_41;

	@OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
	public int anInt10918;

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "Lclient!iea;")
	protected Class174 aClass174_41;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "Z")
	public boolean aBoolean936;

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "[Lclient!bw;")
	public final Class2_Sub11[] aClass2_Sub11Array42;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean936 = arg1;
		this.aClass2_Sub11Array42 = new Class2_Sub11[arg0];
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
	public int method9529() {
		return -1;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
	public void method9530() {
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)[I")
	public int[] method9531(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!et;Z)V")
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)[[I")
	public int[][] method9533(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
	public void method9536() {
		if (this.aBoolean936) {
			this.aClass174_41.method3747();
			this.aClass174_41 = null;
		} else {
			this.aClass370_41.method8742();
			this.aClass370_41 = null;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I")
	public int method9537() {
		return -1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)[[I")
	protected final int[][] method9538(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub11Array42[arg0].aBoolean936) {
			@Pc(25) int[] local25 = this.aClass2_Sub11Array42[arg0].method9531(arg1);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass2_Sub11Array42[arg0].method9533(arg1);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZII)V")
	public void method9539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt10918 == 255 ? arg0 : this.anInt10918;
		if (this.aBoolean936) {
			this.aClass174_41 = new Class174(local20, arg0, arg1);
		} else {
			this.aClass370_41 = new Class370(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(ZII)[I")
	protected final int[] method9540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub11Array42[arg1].aBoolean936 ? this.aClass2_Sub11Array42[arg1].method9531(arg0) : this.aClass2_Sub11Array42[arg1].method9533(arg0)[0];
	}
}
