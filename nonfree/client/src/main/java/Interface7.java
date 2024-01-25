import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public interface Interface7 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IJ)Z")
	boolean method7199(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZB)V")
	void method7200(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	void method7201();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
	int method7202();

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)I")
	int method7203();

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
	void method7204();
}
