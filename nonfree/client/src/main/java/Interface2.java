import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public interface Interface2 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	int method7513(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)I")
	int method7514(@OriginalArg(0) int arg0);
}
