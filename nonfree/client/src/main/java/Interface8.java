import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public interface Interface8 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!jm;)V")
	void method5000(@OriginalArg(0) Class110 arg0);

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Lclient!jm;)V")
	void method5001(@OriginalArg(0) Class110 arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!jm;)V")
	void method5002(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1);

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(Lclient!jm;)V")
	void method5003(@OriginalArg(0) Class110 arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "()I")
	int method5116();

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[BI)V")
	void method5004(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);
}
