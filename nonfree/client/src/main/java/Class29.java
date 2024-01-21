import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class Class29 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public int anInt1514;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public int anInt1516;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt1517;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public int anInt1518;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public int anInt1521;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt1523;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	protected Class29() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public abstract void method1184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
	public abstract void method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
