import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class62 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	public int anInt2009;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	private int anInt2010;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(II)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2009 = arg0;
		this.anInt2010 = Static10.anInt142;
	}

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static10.method135(this.anInt2009, this.anInt2010);
		super.finalize();
	}
}
