import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public abstract class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "Lclient!mp;")
	protected Class213 aClass213_41;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
	public int anInt9361;

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "Lclient!j;")
	protected Class155 aClass155_41;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "Z")
	public boolean aBoolean729;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "[Lclient!cu;")
	public final Class3_Sub6[] aClass3_Sub6Array42;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean729 = arg1;
		this.aClass3_Sub6Array42 = new Class3_Sub6[arg0];
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
	public void method7765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt9361 == 255 ? arg0 : this.anInt9361;
		if (this.aBoolean729) {
			this.aClass213_41 = new Class213(local14, arg0, arg1);
		} else {
			this.aClass155_41 = new Class155(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
	public int method7766() {
		return -1;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
	public void method7768() {
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(III)[I")
	protected final int[] method7769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub6Array42[arg1].aBoolean729 ? this.aClass3_Sub6Array42[arg1].method7775(arg0) : this.aClass3_Sub6Array42[arg1].method7776(arg0)[0];
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)V")
	public void method7770() {
		if (this.aBoolean729) {
			this.aClass213_41.method4804();
			this.aClass213_41 = null;
		} else {
			this.aClass155_41.method3667();
			this.aClass155_41 = null;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!np;I)V")
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
	public int method7772() {
		return -1;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method7773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub6Array42[arg0].aBoolean729) {
			@Pc(33) int[] local33 = this.aClass3_Sub6Array42[arg0].method7775(arg1);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass3_Sub6Array42[arg0].method7776(arg1);
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(II)[I")
	public int[] method7775(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)[[I")
	public int[][] method7776(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
