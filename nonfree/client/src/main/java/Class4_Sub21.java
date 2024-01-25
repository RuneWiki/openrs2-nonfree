import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "Lclient!nr;")
	public Class4_Sub21 aClass4_Sub21_8;

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
	public int anInt7877;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "Lclient!rf;")
	public Class4_Sub42 aClass4_Sub42_5;

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "Z")
	public volatile boolean aBoolean567 = true;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public abstract void method6156(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "()Lclient!nr;")
	public abstract Class4_Sub21 method6157();

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([III)V")
	public abstract void method6158(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "([III)V")
	protected final void method6159(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean567) {
			this.method6158(arg0, arg1, arg2);
		} else {
			this.method6156(arg2);
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "()I")
	public abstract int method6160();

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "()I")
	public int method6161() {
		return 255;
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "()Lclient!nr;")
	public abstract Class4_Sub21 method6162();
}
