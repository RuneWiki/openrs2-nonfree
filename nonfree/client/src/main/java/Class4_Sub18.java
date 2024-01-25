import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "Lclient!qt;")
	public Class4_Sub35 aClass4_Sub35_5;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "Lclient!ho;")
	public Class4_Sub18 aClass4_Sub18_8;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	public int anInt7466;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "Z")
	public volatile boolean aBoolean496 = true;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
	public abstract void method5749(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([III)V")
	protected final void method5750(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean496) {
			this.method5755(arg0, arg1, arg2);
		} else {
			this.method5749(arg2);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()Lclient!ho;")
	public abstract Class4_Sub18 method5751();

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "()Lclient!ho;")
	public abstract Class4_Sub18 method5752();

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "()I")
	public int method5753() {
		return 255;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "()I")
	public abstract int method5754();

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "([III)V")
	public abstract void method5755(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
