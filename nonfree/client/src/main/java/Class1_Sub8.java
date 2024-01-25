import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Lclient!rj;")
	public Class1_Sub40 aClass1_Sub40_5;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!eg;")
	public Class1_Sub8 aClass1_Sub8_8;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	public int anInt7290;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "Z")
	public volatile boolean aBoolean522 = true;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()I")
	public abstract int method6021();

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([III)V")
	public abstract void method6022(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "()Lclient!eg;")
	public abstract Class1_Sub8 method6023();

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public abstract void method6024(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "()I")
	public int method6025() {
		return 255;
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "()Lclient!eg;")
	public abstract Class1_Sub8 method6026();

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "([III)V")
	protected final void method6027(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean522) {
			this.method6022(arg0, arg1, arg2);
		} else {
			this.method6024(arg2);
		}
	}
}
