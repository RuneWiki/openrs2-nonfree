import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public interface Interface24 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)V")
	void method7334();

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BLclient!r;)V")
	void method7335(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)I")
	int method7336();

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)I")
	int method7337();

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(BLclient!r;)V")
	void method7338(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)Z")
	boolean method7339();

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)I")
	int method7340();
}
