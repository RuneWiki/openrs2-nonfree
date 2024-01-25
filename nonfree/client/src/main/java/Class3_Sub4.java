import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public int anInt8016;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "Lclient!nj;")
	public Class3_Sub4 aClass3_Sub4_8;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "Lclient!wea;")
	public Class3_Sub48 aClass3_Sub48_5;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "Z")
	public volatile boolean aBoolean621 = true;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([III)V")
	public abstract void method6654(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()I")
	public abstract int method6655();

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "()Lclient!nj;")
	public abstract Class3_Sub4 method6656();

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "()I")
	public int method6657() {
		return 255;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public abstract void method6658(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "([III)V")
	protected final void method6659(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean621) {
			this.method6654(arg0, arg1, arg2);
		} else {
			this.method6658(arg2);
		}
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "()Lclient!nj;")
	public abstract Class3_Sub4 method6660();
}
