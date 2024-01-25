import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!ua;")
	public Class2_Sub13 aClass2_Sub13_9;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!oe;")
	public Class2_Sub1 aClass2_Sub1_6;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	public int anInt9776;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Z")
	public volatile boolean aBoolean719 = true;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()Lclient!ua;")
	public abstract Class2_Sub13 method8174();

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()I")
	public abstract int method8175();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public abstract void method8176(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()I")
	public int method8177() {
		return 255;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "()Lclient!ua;")
	public abstract Class2_Sub13 method8178();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([III)V")
	protected final void method8179(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean719) {
			this.method8180(arg0, arg1, arg2);
		} else {
			this.method8176(arg2);
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "([III)V")
	public abstract void method8180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
