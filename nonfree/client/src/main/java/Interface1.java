import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public interface Interface1 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	void method5358();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!pe;I)V")
	void method5359(@OriginalArg(0) Class89 arg0);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	int method5360();

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)I")
	int method5361();

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I")
	int method5362();

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Z")
	boolean method5363();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!pe;II)Lclient!sj;")
	Class31 method5364(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!pe;)V")
	void method5365(@OriginalArg(1) Class89 arg0);
}
