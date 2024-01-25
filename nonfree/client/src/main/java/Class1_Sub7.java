import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "Lclient!pda;")
	public Class1_Sub7 aClass1_Sub7_7;

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
	public int anInt7700;

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "Lclient!en;")
	public Class1_Sub17 aClass1_Sub17_5;

	@OriginalMember(owner = "client!pda", name = "m", descriptor = "Z")
	public volatile boolean aBoolean593 = true;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "([III)V")
	public abstract void method6132(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "([III)V")
	protected final void method6133(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean593) {
			this.method6132(arg0, arg1, arg2);
		} else {
			this.method6138(arg2);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "()Lclient!pda;")
	public abstract Class1_Sub7 method6134();

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "()I")
	public abstract int method6135();

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "()Lclient!pda;")
	public abstract Class1_Sub7 method6136();

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "()I")
	public int method6137() {
		return 255;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
	public abstract void method6138(@OriginalArg(0) int arg0);
}
