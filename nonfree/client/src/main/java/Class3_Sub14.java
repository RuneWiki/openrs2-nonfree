import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public abstract class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!ega", name = "n", descriptor = "Lclient!ega;")
	public Class3_Sub14 aClass3_Sub14_8;

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "Lclient!nb;")
	public Class3_Sub6 aClass3_Sub6_5;

	@OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
	public int anInt9630;

	@OriginalMember(owner = "client!ega", name = "q", descriptor = "Z")
	public volatile boolean aBoolean807 = true;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "()I")
	public int method7818() {
		return 255;
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "()Lclient!ega;")
	public abstract Class3_Sub14 method7819();

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "()I")
	public abstract int method7820();

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	public abstract void method7821(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "()Lclient!ega;")
	public abstract Class3_Sub14 method7822();

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "([III)V")
	public abstract void method7823(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "([III)V")
	protected final void method7824(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean807) {
			this.method7823(arg0, arg1, arg2);
		} else {
			this.method7821(arg2);
		}
	}
}
