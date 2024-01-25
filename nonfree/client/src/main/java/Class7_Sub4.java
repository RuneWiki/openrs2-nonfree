import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public abstract class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "Lclient!cn;")
	protected Class42 aClass42_41;

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "Lclient!wp;")
	protected Class219 aClass219_41;

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
	public int anInt6627;

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "[Lclient!nl;")
	public final Class7_Sub4[] aClass7_Sub4Array42;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "Z")
	public boolean aBoolean481;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IZ)V")
	protected Class7_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass7_Sub4Array42 = new Class7_Sub4[arg0];
		this.aBoolean481 = arg1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[I")
	public int[] method5628(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)I")
	public int method5629() {
		return -1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)[[I")
	public int[][] method5631(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)V")
	public void method5632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt6627 == 255 ? arg0 : this.anInt6627;
		if (this.aBoolean481) {
			this.aClass219_41 = new Class219(local18, arg0, arg1);
		} else {
			this.aClass42_41 = new Class42(local18, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V")
	public void method5633() {
		if (this.aBoolean481) {
			this.aClass219_41.method5706();
			this.aClass219_41 = null;
		} else {
			this.aClass42_41.method1060();
			this.aClass42_41 = null;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)[I")
	protected final int[] method5634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass7_Sub4Array42[arg0].aBoolean481 ? this.aClass7_Sub4Array42[arg0].method5628(arg1) : this.aClass7_Sub4Array42[arg0].method5631(arg1)[0];
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)V")
	public void method5635() {
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ap;BI)V")
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I")
	public int method5637() {
		return -1;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)[[I")
	protected final int[][] method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass7_Sub4Array42[arg1].aBoolean481) {
			@Pc(23) int[] local23 = this.aClass7_Sub4Array42[arg1].method5628(arg0);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass7_Sub4Array42[arg1].method5631(arg0);
		}
	}
}
