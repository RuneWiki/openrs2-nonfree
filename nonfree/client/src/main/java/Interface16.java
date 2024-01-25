import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public interface Interface16 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)I")
	int method6938(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)I")
	int method6939(@OriginalArg(1) int arg0);
}
