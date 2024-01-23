import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!ce;")
	protected Class25 aClass25_41;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
	public int anInt5828;

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "Lclient!ua;")
	protected Class174 aClass174_41;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "Z")
	public boolean aBoolean385;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "[Lclient!ng;")
	public Class2_Sub1[] aClass2_Sub1Array42;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean385 = arg1;
		this.aClass2_Sub1Array42 = new Class2_Sub1[arg0];
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[[I")
	public int[][] method4586(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[I")
	public int[] method4587(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)V")
	public final void method4589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt5828 == 255 ? arg1 : this.anInt5828;
		if (this.aBoolean385) {
			this.aClass174_41 = new Class174(local14, arg1, arg0);
		} else {
			this.aClass25_41 = new Class25(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
	public void method4591() {
		if (this.aBoolean385) {
			this.aClass174_41.method4339();
			this.aClass174_41 = null;
		} else {
			this.aClass25_41.method656();
			this.aClass25_41 = null;
		}
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)I")
	public int method4593() {
		return -1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!oe;IB)V")
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
	public void method4595() {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I")
	public int method4596() {
		return -1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method4600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub1Array42[arg1].aBoolean385) {
			@Pc(32) int[] local32 = this.aClass2_Sub1Array42[arg1].method4587(arg0);
			return new int[][] { local32, local32, local32 };
		} else {
			return this.aClass2_Sub1Array42[arg1].method4586(arg0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)[I")
	protected final int[] method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass2_Sub1Array42[arg1].aBoolean385 ? this.aClass2_Sub1Array42[arg1].method4587(arg0) : this.aClass2_Sub1Array42[arg1].method4586(arg0)[0];
	}
}
