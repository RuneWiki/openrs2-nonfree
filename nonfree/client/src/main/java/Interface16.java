import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public interface Interface16 {

	@OriginalMember(owner = "client!p", name = "UA", descriptor = "(Z)V")
	void UA(@OriginalArg(0) boolean arg0);
}
