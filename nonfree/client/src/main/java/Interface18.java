import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public interface Interface18 {

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(JI)Z")
	boolean method5200(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V")
	void method5201();

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)I")
	int method5202();

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)I")
	int method5203();

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
	void method5204();

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZB)V")
	void method5205(@OriginalArg(0) boolean arg0);
}
