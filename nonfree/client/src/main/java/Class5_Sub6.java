import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public abstract class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!raa;")
	protected Class296 aClass296_41;

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Lclient!nf;")
	protected Class242 aClass242_41;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
	public int anInt9758;

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "[Lclient!rl;")
	public final Class5_Sub6[] aClass5_Sub6Array42;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "Z")
	public boolean aBoolean718;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass5_Sub6Array42 = new Class5_Sub6[arg0];
		this.aBoolean718 = arg1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)[[I")
	protected final int[][] method8116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass5_Sub6Array42[arg0].aBoolean718) {
			@Pc(30) int[] local30 = this.aClass5_Sub6Array42[arg0].method8123(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass5_Sub6Array42[arg0].method8122(arg1);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBI)[I")
	protected final int[] method8117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass5_Sub6Array42[arg1].aBoolean718 ? this.aClass5_Sub6Array42[arg1].method8123(arg0) : this.aClass5_Sub6Array42[arg1].method8122(arg0)[0];
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	public void method8118() {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
	public int method8119() {
		return -1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!rv;I)V")
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public void method8121() {
		if (this.aBoolean718) {
			this.aClass296_41.method7186();
			this.aClass296_41 = null;
		} else {
			this.aClass242_41.method5694();
			this.aClass242_41 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)[[I")
	public int[][] method8122(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[I")
	public int[] method8123(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V")
	public void method8125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt9758 == 255 ? arg1 : this.anInt9758;
		if (this.aBoolean718) {
			this.aClass296_41 = new Class296(local14, arg1, arg0);
		} else {
			this.aClass242_41 = new Class242(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)I")
	public int method8126() {
		return -1;
	}
}
