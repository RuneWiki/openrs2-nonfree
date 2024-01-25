import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public interface Interface7 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZLclient!qa;)V")
	void method8043(@OriginalArg(1) Class4 arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)I")
	int method8044();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!qa;Z)V")
	void method8045(@OriginalArg(0) Class4 arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
	int method8046();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)I")
	int method8047();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1);

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)Z")
	boolean method8049();

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
	void method8050();
}
