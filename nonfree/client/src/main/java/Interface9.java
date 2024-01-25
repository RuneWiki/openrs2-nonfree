import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public interface Interface9 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[BI)V")
	void method5701(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!pe;)V")
	void method5702(@OriginalArg(0) Class156 arg0);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!pe;)V")
	void method5703(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1);

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(Lclient!pe;)V")
	void method5704(@OriginalArg(0) Class156 arg0);

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(Lclient!pe;)V")
	void method5705(@OriginalArg(0) Class156 arg0);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
	int method5698();
}
