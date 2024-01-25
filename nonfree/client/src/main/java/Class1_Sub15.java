import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Z")
	public boolean aBoolean135;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "Lclient!nf;")
	protected final Class105_Sub1 aClass105_Sub1_15;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class1_Sub15(@OriginalArg(0) Class105_Sub1 arg0) {
		this.aClass105_Sub1_15 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)Z")
	public final boolean method1503() {
		return false;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)Z")
	public final boolean method1504() {
		return this.aBoolean135;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "()Z")
	public abstract boolean method1505();

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "()I")
	public int method1506() {
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "()V")
	public abstract void method1507();

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
	public abstract void method1508(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
	public abstract void method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)I")
	public final int method1510() {
		return 1;
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "()Z")
	public abstract boolean method1511();

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!ir;Lclient!ir;)V")
	public abstract void method1512(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub1 arg1, @OriginalArg(2) Class44_Sub1 arg2);
}
