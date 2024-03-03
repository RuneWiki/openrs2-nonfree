import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class Class119 {

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "[Lclient!wk;")
	public static final Class247[] aClass247Array2 = new Class247[50];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_131 = new Class145(52, 12);

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_70 = new Class79("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[100];

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt3313 = -1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 34)
	protected Class119() {
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Z", line = 8)
	public final boolean method3306() {
		return this.method3312() || this.method3310() || this.method3304();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Z")
	protected abstract boolean method3304();

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)I")
	public abstract int method3305();

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	public abstract void method3308();

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Lclient!lm;")
	public abstract Class2_Sub24 method3309();

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Z")
	protected abstract boolean method3310();

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Z")
	public abstract boolean method3312();

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
	public abstract void method3313();

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)I")
	public abstract int method3314();
}
