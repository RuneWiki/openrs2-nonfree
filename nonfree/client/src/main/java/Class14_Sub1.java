import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!gm;")
	public Class14_Sub19 aClass14_Sub19_6;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!ec;")
	public Class14_Sub1 aClass14_Sub1_9;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
	public int anInt10973;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Z")
	public volatile boolean aBoolean766 = true;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()I")
	public int method9315() {
		return 255;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()Lclient!ec;")
	public abstract Class14_Sub1 method9316();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([III)V")
	public abstract void method9317(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	public abstract void method9318(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "([III)V")
	protected final void method9319(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean766) {
			this.method9317(arg0, arg1, arg2);
		} else {
			this.method9318(arg2);
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()Lclient!ec;")
	public abstract Class14_Sub1 method9320();

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "()I")
	public abstract int method9321();
}
