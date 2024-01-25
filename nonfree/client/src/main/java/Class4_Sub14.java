import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "Z")
	public boolean aBoolean113;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "Lclient!ig;")
	protected final Class47_Sub2 aClass47_Sub2_7;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class4_Sub14(@OriginalArg(0) Class47_Sub2 arg0) {
		this.aClass47_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z")
	public final boolean method1254() {
		return false;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "()Z")
	public abstract boolean method1255();

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "()V")
	public abstract void method1256();

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "()I")
	public int method1257() {
		return 0;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)I")
	public final int method1258() {
		return 1;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!hf;Lclient!hf;)V")
	public abstract void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) Class52_Sub1 arg1, @OriginalArg(2) Class52_Sub1 arg2);

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
	public abstract void method1260(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)Z")
	public final boolean method1261() {
		return this.aBoolean113;
	}

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "()Z")
	public abstract boolean method1262();

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V")
	public abstract void method1263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
