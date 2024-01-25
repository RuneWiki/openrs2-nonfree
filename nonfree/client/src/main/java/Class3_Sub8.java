import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public abstract class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!pha", name = "p", descriptor = "I")
	public int anInt10703;

	@OriginalMember(owner = "client!pha", name = "q", descriptor = "Lclient!ds;")
	protected Class87 aClass87_41;

	@OriginalMember(owner = "client!pha", name = "w", descriptor = "Lclient!sk;")
	protected Class326 aClass326_41;

	@OriginalMember(owner = "client!pha", name = "l", descriptor = "Z")
	public boolean aBoolean737;

	@OriginalMember(owner = "client!pha", name = "B", descriptor = "[Lclient!pha;")
	public final Class3_Sub8[] aClass3_Sub8Array42;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean737 = arg1;
		this.aClass3_Sub8Array42 = new Class3_Sub8[arg0];
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IB)[[I")
	public int[][] method8774(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)I")
	public int method8775() {
		return -1;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(III)[I")
	protected final int[] method8776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub8Array42[arg1].aBoolean737 ? this.aClass3_Sub8Array42[arg1].method8784(arg0) : this.aClass3_Sub8Array42[arg1].method8774(arg0)[0];
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(B)V")
	public void method8777() {
		if (this.aBoolean737) {
			this.aClass87_41.method1797();
			this.aClass87_41 = null;
		} else {
			this.aClass326_41.method7328();
			this.aClass326_41 = null;
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIB)V")
	public void method8778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt10703 == 255 ? arg0 : this.anInt10703;
		if (this.aBoolean737) {
			this.aClass87_41 = new Class87(local12, arg0, arg1);
		} else {
			this.aClass326_41 = new Class326(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(III)[[I")
	protected final int[][] method8779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub8Array42[arg0].aBoolean737) {
			@Pc(30) int[] local30 = this.aClass3_Sub8Array42[arg0].method8784(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass3_Sub8Array42[arg0].method8774(arg1);
		}
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(I)V")
	public void method8780() {
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)I")
	public int method8782() {
		return -1;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZI)[I")
	public int[] method8784(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILclient!dt;Z)V")
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
	}
}
