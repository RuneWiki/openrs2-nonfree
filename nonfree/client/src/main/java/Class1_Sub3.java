import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!al", name = "u", descriptor = "I")
	public int anInt9504;

	@OriginalMember(owner = "client!al", name = "x", descriptor = "Lclient!pba;")
	protected Class222 aClass222_41;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "Lclient!tda;")
	protected Class281 aClass281_41;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "[Lclient!al;")
	public final Class1_Sub3[] aClass1_Sub3Array42;

	@OriginalMember(owner = "client!al", name = "G", descriptor = "Z")
	public boolean aBoolean708;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub3Array42 = new Class1_Sub3[arg0];
		this.aBoolean708 = arg1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I")
	public int method8189() {
		return -1;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(II)[[I")
	public int[][] method8190(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(II)[I")
	public int[] method8193(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	public void method8195() {
		if (this.aBoolean708) {
			this.aClass222_41.method5917();
			this.aClass222_41 = null;
		} else {
			this.aClass281_41.method7077();
			this.aClass281_41 = null;
		}
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
	public void method8197() {
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(III)V")
	public void method8198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt9504 == 255 ? arg1 : this.anInt9504;
		if (this.aBoolean708) {
			this.aClass222_41 = new Class222(local14, arg1, arg0);
		} else {
			this.aClass281_41 = new Class281(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(III)[[I")
	protected final int[][] method8199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass1_Sub3Array42[arg0].aBoolean708) {
			@Pc(34) int[] local34 = this.aClass1_Sub3Array42[arg0].method8193(arg1);
			return new int[][] { local34, local34, local34 };
		} else {
			return this.aClass1_Sub3Array42[arg0].method8190(arg1);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IILclient!os;)V")
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZII)[I")
	protected final int[] method8201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub3Array42[arg0].aBoolean708 ? this.aClass1_Sub3Array42[arg0].method8193(arg1) : this.aClass1_Sub3Array42[arg0].method8190(arg1)[0];
	}

	@OriginalMember(owner = "client!al", name = "g", descriptor = "(I)I")
	public int method8204() {
		return -1;
	}
}
