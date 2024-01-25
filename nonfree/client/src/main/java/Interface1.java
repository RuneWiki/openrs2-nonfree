import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public interface Interface1 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)I")
	int method1612(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(ZI)I")
	int method1613(@OriginalArg(1) int arg0);
}
