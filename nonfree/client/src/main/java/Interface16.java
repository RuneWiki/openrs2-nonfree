import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public interface Interface16 {

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)I")
	int method2642(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)I")
	int method2643(@OriginalArg(1) int arg0);
}
