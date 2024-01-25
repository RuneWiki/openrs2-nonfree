import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public interface Interface11 {

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!qa;)V")
	void method5642(@OriginalArg(1) Class30 arg0);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BLclient!qa;)V")
	void method5643(@OriginalArg(1) Class30 arg0);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)I")
	int method5644();

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)Z")
	boolean method5645();

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1);

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)V")
	void method5647();

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
	int method5648();

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)I")
	int method5649();
}
