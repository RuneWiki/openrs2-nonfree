import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public abstract class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "Lclient!sd;")
	protected Class325 aClass325_41;

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
	public int anInt10353;

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "Lclient!gn;")
	protected Class140 aClass140_41;

	@OriginalMember(owner = "client!qfa", name = "v", descriptor = "[Lclient!qfa;")
	public final Class6_Sub8[] aClass6_Sub8Array42;

	@OriginalMember(owner = "client!qfa", name = "w", descriptor = "Z")
	public boolean aBoolean766;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass6_Sub8Array42 = new Class6_Sub8[arg0];
		this.aBoolean766 = arg1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)I")
	public int method8927() {
		return -1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)[[I")
	protected final int[][] method8928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass6_Sub8Array42[arg0].aBoolean766) {
			@Pc(37) int[] local37 = this.aClass6_Sub8Array42[arg0].method8935(arg1);
			return new int[][] { local37, local37, local37 };
		} else {
			return this.aClass6_Sub8Array42[arg0].method8934(arg1);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!jc;I)V")
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIB)[I")
	protected final int[] method8930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass6_Sub8Array42[arg1].aBoolean766 ? this.aClass6_Sub8Array42[arg1].method8935(arg0) : this.aClass6_Sub8Array42[arg1].method8934(arg0)[0];
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(III)V")
	public void method8931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt10353 == 255 ? arg1 : this.anInt10353;
		if (this.aBoolean766) {
			this.aClass325_41 = new Class325(local15, arg1, arg0);
		} else {
			this.aClass140_41 = new Class140(local15, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)I")
	public int method8932() {
		return -1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)[[I")
	public int[][] method8934(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(II)[I")
	public int[] method8935(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
	public void method8936() {
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)V")
	public void method8937() {
		if (this.aBoolean766) {
			this.aClass325_41.method7754();
			this.aClass325_41 = null;
		} else {
			this.aClass140_41.method3747();
			this.aClass140_41 = null;
		}
	}
}
