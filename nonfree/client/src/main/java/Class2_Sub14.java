import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "Lclient!kc;")
	public Class2_Sub14 aClass2_Sub14_8;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!cd;")
	public Class2_Sub5 aClass2_Sub5_5;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
	public int anInt3345;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Z")
	public volatile boolean aBoolean143 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
	public int method2583() {
		return 255;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V")
	public abstract void method2584(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "([III)V")
	protected final void method2585(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean143) {
			this.method2584(arg0, arg1, arg2);
		} else {
			this.method2587(arg2);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()Lclient!kc;")
	public abstract Class2_Sub14 method2586();

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public abstract void method2587(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()Lclient!kc;")
	public abstract Class2_Sub14 method2588();

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()I")
	public abstract int method2589();
}
