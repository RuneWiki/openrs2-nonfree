import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public interface Interface25 {

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
	void method7703();

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BLclient!qt;)V")
	void method7704(@OriginalArg(1) Class294 arg0);
}
