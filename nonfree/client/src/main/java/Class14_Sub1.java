import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public abstract class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "Lclient!lf;")
	protected Class211 aClass211_41;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
	public int anInt10667;

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "Lclient!qb;")
	protected Class279 aClass279_41;

	@OriginalMember(owner = "client!tv", name = "x", descriptor = "[Lclient!tv;")
	public final Class14_Sub1[] aClass14_Sub1Array42;

	@OriginalMember(owner = "client!tv", name = "w", descriptor = "Z")
	public boolean aBoolean734;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(IZ)V")
	protected Class14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass14_Sub1Array42 = new Class14_Sub1[arg0];
		this.aBoolean734 = arg1;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V")
	public void method8895() {
		if (this.aBoolean734) {
			this.aClass211_41.method5133();
			this.aClass211_41 = null;
		} else {
			this.aClass279_41.method6839();
			this.aClass279_41 = null;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IBI)V")
	public void method8896(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt10667 == 255 ? arg1 : this.anInt10667;
		if (this.aBoolean734) {
			this.aClass211_41 = new Class211(local12, arg1, arg0);
		} else {
			this.aClass279_41 = new Class279(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)[I")
	protected final int[] method8897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass14_Sub1Array42[arg0].aBoolean734 ? this.aClass14_Sub1Array42[arg0].method8898(arg1) : this.aClass14_Sub1Array42[arg0].method8905(arg1)[0];
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)[I")
	public int[] method8898(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	public void method8899() {
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)I")
	public int method8900() {
		return -1;
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)I")
	public int method8902() {
		return -1;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!so;II)V")
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method8904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass14_Sub1Array42[arg0].aBoolean734) {
			@Pc(23) int[] local23 = this.aClass14_Sub1Array42[arg0].method8898(arg1);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass14_Sub1Array42[arg0].method8905(arg1);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)[[I")
	public int[][] method8905(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
