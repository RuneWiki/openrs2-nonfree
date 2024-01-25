import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "Z")
	public boolean aBoolean417;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Lclient!mi;")
	protected final Class155_Sub1 aClass155_Sub1_38;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class3_Sub25(@OriginalArg(0) Class155_Sub1 arg0) {
		this.aClass155_Sub1_38 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)Z")
	public final boolean method4751() {
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
	public abstract void method4752();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public abstract void method4753(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)Z")
	public final boolean method4754() {
		return this.aBoolean417;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "()Z")
	public abstract boolean method4755();

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)I")
	public final int method4756() {
		return 1;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "()Z")
	public abstract boolean method4757();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!kh;Lclient!kh;)V")
	public abstract void method4758(@OriginalArg(0) int arg0, @OriginalArg(1) Class30_Sub3 arg1, @OriginalArg(2) Class30_Sub3 arg2);

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "()I")
	public int method4759() {
		return 0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	public abstract void method4760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
