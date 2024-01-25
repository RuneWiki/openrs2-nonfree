import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public abstract class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "Lclient!oga;")
	public Class3_Sub33 aClass3_Sub33_9;

	@OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
	public int anInt10231;

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "Lclient!kf;")
	public Class3_Sub34 aClass3_Sub34_6;

	@OriginalMember(owner = "client!oga", name = "l", descriptor = "Z")
	public volatile boolean aBoolean681 = true;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "([III)V")
	protected final void method8704(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean681) {
			this.method8709(arg0, arg1, arg2);
		} else {
			this.method8710(arg2);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "()I")
	public abstract int method8705();

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "()Lclient!oga;")
	public abstract Class3_Sub33 method8706();

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "()I")
	public int method8707() {
		return 255;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "()Lclient!oga;")
	public abstract Class3_Sub33 method8708();

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "([III)V")
	public abstract void method8709(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	public abstract void method8710(@OriginalArg(0) int arg0);
}
