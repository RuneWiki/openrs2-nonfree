import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public interface Interface22 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	void method8433();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ha;I)V")
	void method8434(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)I")
	int method8435();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
	int method8436();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)Z")
	boolean method8437();

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)I")
	int method8438();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!ha;)V")
	void method8439(@OriginalArg(1) Class5 arg0);
}
