import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "Lclient!ig;")
	public Class2_Sub9 aClass2_Sub9_8;

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "Lclient!dg;")
	public Class2_Sub5 aClass2_Sub5_5;

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
	public int anInt4441;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Z")
	public volatile boolean aBoolean182 = true;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "()Lclient!ig;")
	public abstract Class2_Sub9 method2925();

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "()Lclient!ig;")
	public abstract Class2_Sub9 method2926();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([III)V")
	public abstract void method2927(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "()I")
	public int method2928() {
		return 255;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "([III)V")
	protected final void method2929(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean182) {
			this.method2927(arg0, arg1, arg2);
		} else {
			this.method2930(arg2);
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	public abstract void method2930(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "()I")
	public abstract int method2931();
}
