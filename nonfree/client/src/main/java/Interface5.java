import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public interface Interface5 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZLclient!qa;)V")
	void method6259(@OriginalArg(1) Class167 arg0);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)Z")
	boolean method6260();

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)I")
	int method6261();

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)I")
	int method6262();

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)I")
	int method6263();

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V")
	void method6264();

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!qa;I)V")
	void method6265(@OriginalArg(0) Class167 arg0);
}
