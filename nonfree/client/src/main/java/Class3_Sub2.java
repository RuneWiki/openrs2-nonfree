import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Lclient!bu;")
	protected Class40 aClass40_41;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
	public int anInt10030;

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Lclient!kq;")
	protected Class193 aClass193_41;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Z")
	public boolean aBoolean720;

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "[Lclient!ih;")
	public final Class3_Sub2[] aClass3_Sub2Array42;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean720 = arg1;
		this.aClass3_Sub2Array42 = new Class3_Sub2[arg0];
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)[I")
	public int[] method8594(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZ)[[I")
	protected final int[][] method8595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub2Array42[arg1].aBoolean720) {
			@Pc(23) int[] local23 = this.aClass3_Sub2Array42[arg1].method8594(arg0);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass3_Sub2Array42[arg1].method8604(arg0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIB)V")
	public void method8596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt10030 == 255 ? arg0 : this.anInt10030;
		if (this.aBoolean720) {
			this.aClass40_41 = new Class40(local14, arg0, arg1);
		} else {
			this.aClass193_41 = new Class193(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)I")
	public int method8597() {
		return -1;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public void method8598() {
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)I")
	public int method8599() {
		return -1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!sl;IB)V")
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)[I")
	protected final int[] method8603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub2Array42[arg1].aBoolean720 ? this.aClass3_Sub2Array42[arg1].method8594(arg0) : this.aClass3_Sub2Array42[arg1].method8604(arg0)[0];
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I")
	public int[][] method8604(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
	public void method8605() {
		if (this.aBoolean720) {
			this.aClass40_41.method1568();
			this.aClass40_41 = null;
		} else {
			this.aClass193_41.method4798();
			this.aClass193_41 = null;
		}
	}
}
