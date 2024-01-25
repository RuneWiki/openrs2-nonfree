import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public final class Class59 {

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
	public int anInt1365;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "[I")
	public final int[] anIntArray80;

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "[I")
	public final int[] anIntArray81;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(I)V")
	public Class59(@OriginalArg(0) int arg0) {
		this.anInt1365 = arg0;
		this.anIntArray80 = new int[this.anInt1365];
		this.anIntArray81 = new int[this.anInt1365];
	}
}
