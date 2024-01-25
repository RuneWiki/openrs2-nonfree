import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public interface Interface5 {

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)I")
	int method6472(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZI)I")
	int method6473(@OriginalArg(1) int arg0);
}
