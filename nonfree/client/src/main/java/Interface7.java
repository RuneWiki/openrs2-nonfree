import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public interface Interface7 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!uk;)V")
	void method5129(@OriginalArg(0) Class229 arg0);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
	int method5130();

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Lclient!uk;)V")
	void method5131(@OriginalArg(0) Class229 arg0);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[BI)V")
	void method5132(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(Lclient!uk;)V")
	void method5133(@OriginalArg(0) Class229 arg0);

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(Lclient!uk;)V")
	void method5134(@OriginalArg(0) Class229 arg0);
}
