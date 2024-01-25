import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Lclient!ip;")
	public Class1_Sub20 aClass1_Sub20_5;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	public int anInt6416;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "Lclient!pl;")
	public Class1_Sub31 aClass1_Sub31_8;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Z")
	public volatile boolean aBoolean530 = true;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()I")
	public int method5512() {
		return 255;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "()Lclient!pl;")
	public abstract Class1_Sub31 method5513();

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	public abstract void method5514(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([III)V")
	protected final void method5515(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean530) {
			this.method5516(arg0, arg1, arg2);
		} else {
			this.method5514(arg2);
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "([III)V")
	public abstract void method5516(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "()Lclient!pl;")
	public abstract Class1_Sub31 method5517();

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "()I")
	public abstract int method5518();
}
