import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public interface Interface7 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
	int method5410();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	Class126 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1);

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Z")
	boolean method5412();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	int method5413();

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
	int method5414();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!uo;)V")
	void method5415(@OriginalArg(1) Class129 arg0);

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	void method5416();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!uo;I)V")
	void method5417(@OriginalArg(0) Class129 arg0);
}
