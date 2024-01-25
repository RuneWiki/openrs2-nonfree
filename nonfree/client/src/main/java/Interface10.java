import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public interface Interface10 {

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!eq;Z)V")
	void method5320(@OriginalArg(0) Class66 arg0);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
	int method5321();

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLclient!eq;)V")
	void method5322(@OriginalArg(1) Class66 arg0);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!eq;Z)Lclient!va;")
	Class224 method5323(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1);

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
	void method5324();

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I")
	int method5325();

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)Z")
	boolean method5326();

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)I")
	int method5327();
}
