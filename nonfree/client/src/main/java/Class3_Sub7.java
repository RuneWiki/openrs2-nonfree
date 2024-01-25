import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "Lclient!cc;")
	public Class3_Sub12 aClass3_Sub12_6;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	public int anInt7193;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "Lclient!rn;")
	public Class3_Sub7 aClass3_Sub7_8;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "Z")
	public volatile boolean aBoolean625 = true;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "()I")
	public abstract int method6000();

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "()I")
	public int method6001() {
		return 255;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public abstract void method6002(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([III)V")
	protected final void method6003(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean625) {
			this.method6004(arg0, arg1, arg2);
		} else {
			this.method6002(arg2);
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "([III)V")
	public abstract void method6004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "()Lclient!rn;")
	public abstract Class3_Sub7 method6005();

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "()Lclient!rn;")
	public abstract Class3_Sub7 method6006();
}
